package androidx.work.impl;

import androidx.work.BackoffPolicy;
import androidx.work.Configuration;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.ListenableFutureKt;
import androidx.work.Operation;
import androidx.work.OperationKt;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.Tracer;
import androidx.work.WorkManager;
import androidx.work.WorkRequest;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.model.WorkTagDao;
import androidx.work.impl.utils.EnqueueUtilsKt;
import androidx.work.impl.utils.taskexecutor.SerialExecutor;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001aD\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002\u001a\u001c\u0010\u0010\u001a\u00020\u0011*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0007\u001a\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00010\u0016*\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0000¨\u0006\u0017"}, d2 = {"updateWorkImpl", "Landroidx/work/WorkManager$UpdateResult;", "processor", "Landroidx/work/impl/Processor;", "workDatabase", "Landroidx/work/impl/WorkDatabase;", "configuration", "Landroidx/work/Configuration;", "schedulers", "", "Landroidx/work/impl/Scheduler;", "newWorkSpec", "Landroidx/work/impl/model/WorkSpec;", "tags", "", "", "enqueueUniquelyNamedPeriodic", "Landroidx/work/Operation;", "Landroidx/work/impl/WorkManagerImpl;", "name", "workRequest", "Landroidx/work/WorkRequest;", "Lcom/google/common/util/concurrent/ListenableFuture;", "work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: WorkerUpdater.kt */
public final class WorkerUpdater {
    /* access modifiers changed from: private */
    public static final WorkManager.UpdateResult updateWorkImpl(Processor processor, WorkDatabase workDatabase, Configuration configuration, List<? extends Scheduler> list, WorkSpec workSpec, Set<String> set) {
        String str = workSpec.id;
        WorkSpec workSpec2 = workDatabase.workSpecDao().getWorkSpec(str);
        if (workSpec2 == null) {
            throw new IllegalArgumentException("Worker with " + str + " doesn't exist");
        } else if (workSpec2.state.isFinished()) {
            return WorkManager.UpdateResult.NOT_APPLIED;
        } else {
            if (!(workSpec2.isPeriodic() ^ workSpec.isPeriodic())) {
                boolean isEnqueued = processor.isEnqueued(str);
                if (!isEnqueued) {
                    for (Scheduler cancel : list) {
                        cancel.cancel(str);
                    }
                }
                workDatabase.runInTransaction((Runnable) new WorkerUpdater$$ExternalSyntheticLambda0(workDatabase, workSpec2, workSpec, list, str, set, isEnqueued));
                if (!isEnqueued) {
                    Schedulers.schedule(configuration, workDatabase, list);
                }
                if (isEnqueued) {
                    return WorkManager.UpdateResult.APPLIED_FOR_NEXT_RUN;
                }
                return WorkManager.UpdateResult.APPLIED_IMMEDIATELY;
            }
            Function1 function1 = WorkerUpdater$updateWorkImpl$type$1.INSTANCE;
            throw new UnsupportedOperationException("Can't update " + ((String) function1.invoke(workSpec2)) + " Worker to " + ((String) function1.invoke(workSpec)) + " Worker. Update operation must preserve worker's type.");
        }
    }

    /* access modifiers changed from: private */
    public static final void updateWorkImpl$lambda$2(WorkDatabase workDatabase, WorkSpec workSpec, WorkSpec workSpec2, List list, String str, Set set, boolean z) {
        WorkSpec workSpec3 = workSpec;
        String str2 = str;
        WorkSpecDao workSpecDao = workDatabase.workSpecDao();
        WorkTagDao workTagDao = workDatabase.workTagDao();
        WorkTagDao workTagDao2 = workTagDao;
        WorkSpecDao workSpecDao2 = workSpecDao;
        WorkSpec copy$default = WorkSpec.copy$default(workSpec2, (String) null, workSpec3.state, (String) null, (String) null, (Data) null, (Data) null, 0, 0, 0, (Constraints) null, workSpec3.runAttemptCount, (BackoffPolicy) null, 0, workSpec3.lastEnqueueTime, 0, 0, false, (OutOfQuotaPolicy) null, workSpec.getPeriodCount(), workSpec.getGeneration() + 1, workSpec.getNextScheduleTimeOverride(), workSpec.getNextScheduleTimeOverrideGeneration(), 0, (String) null, 12835837, (Object) null);
        if (workSpec2.getNextScheduleTimeOverrideGeneration() == 1) {
            copy$default.setNextScheduleTimeOverride(workSpec2.getNextScheduleTimeOverride());
            copy$default.setNextScheduleTimeOverrideGeneration(copy$default.getNextScheduleTimeOverrideGeneration() + 1);
        }
        WorkSpecDao workSpecDao3 = workSpecDao2;
        workSpecDao3.updateWorkSpec(EnqueueUtilsKt.wrapWorkSpecIfNeeded(list, copy$default));
        workTagDao2.deleteByWorkSpecId(str2);
        workTagDao2.insertTags(str2, set);
        if (!z) {
            workSpecDao3.markWorkSpecScheduled(str2, -1);
            workDatabase.workProgressDao().delete(str2);
        }
    }

    public static final ListenableFuture<WorkManager.UpdateResult> updateWorkImpl(WorkManagerImpl workManagerImpl, WorkRequest workRequest) {
        Intrinsics.checkNotNullParameter(workManagerImpl, "<this>");
        Intrinsics.checkNotNullParameter(workRequest, "workRequest");
        SerialExecutor serialTaskExecutor = workManagerImpl.getWorkTaskExecutor().getSerialTaskExecutor();
        Intrinsics.checkNotNullExpressionValue(serialTaskExecutor, "workTaskExecutor.serialTaskExecutor");
        return ListenableFutureKt.executeAsync(serialTaskExecutor, "updateWorkImpl", new WorkerUpdater$updateWorkImpl$3(workManagerImpl, workRequest));
    }

    public static final Operation enqueueUniquelyNamedPeriodic(WorkManagerImpl workManagerImpl, String str, WorkRequest workRequest) {
        Intrinsics.checkNotNullParameter(workManagerImpl, "<this>");
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(workRequest, "workRequest");
        Tracer tracer = workManagerImpl.getConfiguration().getTracer();
        String str2 = "enqueueUniquePeriodic_" + str;
        SerialExecutor serialTaskExecutor = workManagerImpl.getWorkTaskExecutor().getSerialTaskExecutor();
        Intrinsics.checkNotNullExpressionValue(serialTaskExecutor, "workTaskExecutor.serialTaskExecutor");
        return OperationKt.launchOperation(tracer, str2, serialTaskExecutor, new WorkerUpdater$enqueueUniquelyNamedPeriodic$1(workManagerImpl, str, workRequest));
    }
}
