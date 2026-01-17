package androidx.work.impl.background.systemjob;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.core.util.Consumer;
import androidx.work.Configuration;
import androidx.work.Logger;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo;
import androidx.work.impl.Scheduler;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.SystemIdInfo;
import androidx.work.impl.model.SystemIdInfoKt;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.model.WorkSpecKt;
import androidx.work.impl.utils.IdGenerator;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public class SystemJobScheduler implements Scheduler {
    private static final String TAG = Logger.tagWithPrefix("SystemJobScheduler");
    private final Configuration mConfiguration;
    private final Context mContext;
    private final JobScheduler mJobScheduler;
    private final SystemJobInfoConverter mSystemJobInfoConverter;
    private final WorkDatabase mWorkDatabase;

    public boolean hasLimitedSchedulingSlots() {
        return true;
    }

    public SystemJobScheduler(Context context, WorkDatabase workDatabase, Configuration configuration) {
        this(context, workDatabase, configuration, JobSchedulerExtKt.getWmJobScheduler(context), new SystemJobInfoConverter(context, configuration.getClock(), configuration.isMarkingJobsAsImportantWhileForeground()));
    }

    public SystemJobScheduler(Context context, WorkDatabase workDatabase, Configuration configuration, JobScheduler jobScheduler, SystemJobInfoConverter systemJobInfoConverter) {
        this.mContext = context;
        this.mJobScheduler = jobScheduler;
        this.mSystemJobInfoConverter = systemJobInfoConverter;
        this.mWorkDatabase = workDatabase;
        this.mConfiguration = configuration;
    }

    public void schedule(WorkSpec... workSpecArr) {
        IdGenerator idGenerator = new IdGenerator(this.mWorkDatabase);
        int length = workSpecArr.length;
        int i = 0;
        while (i < length) {
            WorkSpec workSpec = workSpecArr[i];
            this.mWorkDatabase.beginTransaction();
            try {
                WorkSpec workSpec2 = this.mWorkDatabase.workSpecDao().getWorkSpec(workSpec.id);
                if (workSpec2 == null) {
                    Logger.get().warning(TAG, "Skipping scheduling " + workSpec.id + " because it's no longer in the DB");
                    this.mWorkDatabase.setTransactionSuccessful();
                } else if (workSpec2.state != WorkInfo.State.ENQUEUED) {
                    Logger.get().warning(TAG, "Skipping scheduling " + workSpec.id + " because it is no longer enqueued");
                    this.mWorkDatabase.setTransactionSuccessful();
                } else {
                    WorkGenerationalId generationalId = WorkSpecKt.generationalId(workSpec);
                    SystemIdInfo systemIdInfo = this.mWorkDatabase.systemIdInfoDao().getSystemIdInfo(generationalId);
                    int nextJobSchedulerIdWithRange = systemIdInfo != null ? systemIdInfo.systemId : idGenerator.nextJobSchedulerIdWithRange(this.mConfiguration.getMinJobSchedulerId(), this.mConfiguration.getMaxJobSchedulerId());
                    if (systemIdInfo == null) {
                        this.mWorkDatabase.systemIdInfoDao().insertSystemIdInfo(SystemIdInfoKt.systemIdInfo(generationalId, nextJobSchedulerIdWithRange));
                    }
                    scheduleInternal(workSpec, nextJobSchedulerIdWithRange);
                    this.mWorkDatabase.setTransactionSuccessful();
                }
                i++;
            } finally {
                this.mWorkDatabase.endTransaction();
            }
        }
    }

    public void scheduleInternal(WorkSpec workSpec, int i) {
        JobInfo convert = this.mSystemJobInfoConverter.convert(workSpec, i);
        Logger logger = Logger.get();
        String str = TAG;
        logger.debug(str, "Scheduling work ID " + workSpec.id + "Job ID " + i);
        try {
            if (this.mJobScheduler.schedule(convert) == 0) {
                Logger.get().warning(str, "Unable to schedule work ID " + workSpec.id);
                if (workSpec.expedited && workSpec.outOfQuotaPolicy == OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    workSpec.expedited = false;
                    Logger.get().debug(str, String.format("Scheduling a non-expedited job (work ID %s)", new Object[]{workSpec.id}));
                    scheduleInternal(workSpec, i);
                }
            }
        } catch (IllegalStateException e) {
            String createErrorMessage = JobSchedulerExtKt.createErrorMessage(this.mContext, this.mWorkDatabase, this.mConfiguration);
            Logger.get().error(TAG, createErrorMessage);
            IllegalStateException illegalStateException = new IllegalStateException(createErrorMessage, e);
            Consumer<Throwable> schedulingExceptionHandler = this.mConfiguration.getSchedulingExceptionHandler();
            if (schedulingExceptionHandler != null) {
                schedulingExceptionHandler.accept(illegalStateException);
                return;
            }
            throw illegalStateException;
        } catch (Throwable th) {
            Logger.get().error(TAG, "Unable to schedule " + workSpec, th);
        }
    }

    public void cancel(String str) {
        List<Integer> pendingJobIds = getPendingJobIds(this.mContext, this.mJobScheduler, str);
        if (pendingJobIds != null && !pendingJobIds.isEmpty()) {
            for (Integer intValue : pendingJobIds) {
                cancelJobById(this.mJobScheduler, intValue.intValue());
            }
            this.mWorkDatabase.systemIdInfoDao().removeSystemIdInfo(str);
        }
    }

    private static void cancelJobById(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            Logger.get().error(TAG, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", new Object[]{Integer.valueOf(i)}), th);
        }
    }

    public static void cancelAllInAllNamespaces(Context context) {
        if (Build.VERSION.SDK_INT >= 34) {
            JobSchedulerExtKt.getWmJobScheduler(context).cancelAll();
        }
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        List<JobInfo> pendingJobs = getPendingJobs(context, jobScheduler);
        if (pendingJobs != null && !pendingJobs.isEmpty()) {
            for (JobInfo id : pendingJobs) {
                cancelJobById(jobScheduler, id.getId());
            }
        }
    }

    public static boolean reconcileJobs(Context context, WorkDatabase workDatabase) {
        JobScheduler wmJobScheduler = JobSchedulerExtKt.getWmJobScheduler(context);
        List<JobInfo> pendingJobs = getPendingJobs(context, wmJobScheduler);
        List<String> workSpecIds = workDatabase.systemIdInfoDao().getWorkSpecIds();
        boolean z = false;
        HashSet hashSet = new HashSet(pendingJobs != null ? pendingJobs.size() : 0);
        if (pendingJobs != null && !pendingJobs.isEmpty()) {
            for (JobInfo next : pendingJobs) {
                WorkGenerationalId workGenerationalIdFromJobInfo = getWorkGenerationalIdFromJobInfo(next);
                if (workGenerationalIdFromJobInfo != null) {
                    hashSet.add(workGenerationalIdFromJobInfo.getWorkSpecId());
                } else {
                    cancelJobById(wmJobScheduler, next.getId());
                }
            }
        }
        Iterator<String> it = workSpecIds.iterator();
        while (true) {
            if (it.hasNext()) {
                if (!hashSet.contains(it.next())) {
                    Logger.get().debug(TAG, "Reconciling jobs");
                    z = true;
                    break;
                }
            } else {
                break;
            }
        }
        if (z) {
            workDatabase.beginTransaction();
            try {
                WorkSpecDao workSpecDao = workDatabase.workSpecDao();
                for (String markWorkSpecScheduled : workSpecIds) {
                    workSpecDao.markWorkSpecScheduled(markWorkSpecScheduled, -1);
                }
                workDatabase.setTransactionSuccessful();
            } finally {
                workDatabase.endTransaction();
            }
        }
        return z;
    }

    static List<JobInfo> getPendingJobs(Context context, JobScheduler jobScheduler) {
        List<JobInfo> safePendingJobs = JobSchedulerExtKt.getSafePendingJobs(jobScheduler);
        if (safePendingJobs == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(safePendingJobs.size());
        ComponentName componentName = new ComponentName(context, SystemJobService.class);
        for (JobInfo next : safePendingJobs) {
            if (componentName.equals(next.getService())) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    private static List<Integer> getPendingJobIds(Context context, JobScheduler jobScheduler, String str) {
        List<JobInfo> pendingJobs = getPendingJobs(context, jobScheduler);
        if (pendingJobs == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        for (JobInfo next : pendingJobs) {
            WorkGenerationalId workGenerationalIdFromJobInfo = getWorkGenerationalIdFromJobInfo(next);
            if (workGenerationalIdFromJobInfo != null && str.equals(workGenerationalIdFromJobInfo.getWorkSpecId())) {
                arrayList.add(Integer.valueOf(next.getId()));
            }
        }
        return arrayList;
    }

    private static WorkGenerationalId getWorkGenerationalIdFromJobInfo(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (!extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new WorkGenerationalId(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
        } catch (NullPointerException unused) {
            return null;
        }
    }
}
