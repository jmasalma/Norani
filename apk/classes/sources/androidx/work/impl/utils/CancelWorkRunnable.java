package androidx.work.impl.utils;

import androidx.work.Operation;
import androidx.work.OperationKt;
import androidx.work.Tracer;
import androidx.work.WorkInfo;
import androidx.work.impl.Processor;
import androidx.work.impl.Scheduler;
import androidx.work.impl.Schedulers;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.model.DependencyDao;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.utils.taskexecutor.SerialExecutor;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0016\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0016\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0016\u0010\r\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0016\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0018\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a\u0010\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002¨\u0006\u0014"}, d2 = {"cancel", "", "workManagerImpl", "Landroidx/work/impl/WorkManagerImpl;", "workSpecId", "", "forAll", "Landroidx/work/Operation;", "forId", "id", "Ljava/util/UUID;", "forName", "name", "forNameInline", "forTag", "tag", "iterativelyCancelWorkAndDependents", "workDatabase", "Landroidx/work/impl/WorkDatabase;", "reschedulePendingWorkers", "work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: CancelWorkRunnable.kt */
public final class CancelWorkRunnable {
    /* access modifiers changed from: private */
    public static final void cancel(WorkManagerImpl workManagerImpl, String str) {
        WorkDatabase workDatabase = workManagerImpl.getWorkDatabase();
        Intrinsics.checkNotNullExpressionValue(workDatabase, "workManagerImpl.workDatabase");
        iterativelyCancelWorkAndDependents(workDatabase, str);
        Processor processor = workManagerImpl.getProcessor();
        Intrinsics.checkNotNullExpressionValue(processor, "workManagerImpl.processor");
        processor.stopAndCancelWork(str, 1);
        for (Scheduler cancel : workManagerImpl.getSchedulers()) {
            cancel.cancel(str);
        }
    }

    /* access modifiers changed from: private */
    public static final void reschedulePendingWorkers(WorkManagerImpl workManagerImpl) {
        Schedulers.schedule(workManagerImpl.getConfiguration(), workManagerImpl.getWorkDatabase(), workManagerImpl.getSchedulers());
    }

    private static final void iterativelyCancelWorkAndDependents(WorkDatabase workDatabase, String str) {
        WorkSpecDao workSpecDao = workDatabase.workSpecDao();
        DependencyDao dependencyDao = workDatabase.dependencyDao();
        List mutableListOf = CollectionsKt.mutableListOf(new String[]{str});
        while (!mutableListOf.isEmpty()) {
            String str2 = (String) CollectionsKt.removeLast(mutableListOf);
            WorkInfo.State state = workSpecDao.getState(str2);
            if (!(state == WorkInfo.State.SUCCEEDED || state == WorkInfo.State.FAILED)) {
                workSpecDao.setCancelledState(str2);
            }
            mutableListOf.addAll(dependencyDao.getDependentWorkIds(str2));
        }
    }

    public static final Operation forId(UUID uuid, WorkManagerImpl workManagerImpl) {
        Intrinsics.checkNotNullParameter(uuid, "id");
        Intrinsics.checkNotNullParameter(workManagerImpl, "workManagerImpl");
        Tracer tracer = workManagerImpl.getConfiguration().getTracer();
        SerialExecutor serialTaskExecutor = workManagerImpl.getWorkTaskExecutor().getSerialTaskExecutor();
        Intrinsics.checkNotNullExpressionValue(serialTaskExecutor, "workManagerImpl.workTask…ecutor.serialTaskExecutor");
        return OperationKt.launchOperation(tracer, "CancelWorkById", serialTaskExecutor, new CancelWorkRunnable$forId$1(workManagerImpl, uuid));
    }

    public static final Operation forTag(String str, WorkManagerImpl workManagerImpl) {
        Intrinsics.checkNotNullParameter(str, "tag");
        Intrinsics.checkNotNullParameter(workManagerImpl, "workManagerImpl");
        Tracer tracer = workManagerImpl.getConfiguration().getTracer();
        String str2 = "CancelWorkByTag_" + str;
        SerialExecutor serialTaskExecutor = workManagerImpl.getWorkTaskExecutor().getSerialTaskExecutor();
        Intrinsics.checkNotNullExpressionValue(serialTaskExecutor, "workManagerImpl.workTask…ecutor.serialTaskExecutor");
        return OperationKt.launchOperation(tracer, str2, serialTaskExecutor, new CancelWorkRunnable$forTag$1(workManagerImpl, str));
    }

    public static final Operation forName(String str, WorkManagerImpl workManagerImpl) {
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(workManagerImpl, "workManagerImpl");
        Tracer tracer = workManagerImpl.getConfiguration().getTracer();
        String str2 = "CancelWorkByName_" + str;
        SerialExecutor serialTaskExecutor = workManagerImpl.getWorkTaskExecutor().getSerialTaskExecutor();
        Intrinsics.checkNotNullExpressionValue(serialTaskExecutor, "workManagerImpl.workTask…ecutor.serialTaskExecutor");
        return OperationKt.launchOperation(tracer, str2, serialTaskExecutor, new CancelWorkRunnable$forName$1(str, workManagerImpl));
    }

    public static final void forNameInline(String str, WorkManagerImpl workManagerImpl) {
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(workManagerImpl, "workManagerImpl");
        WorkDatabase workDatabase = workManagerImpl.getWorkDatabase();
        Intrinsics.checkNotNullExpressionValue(workDatabase, "workManagerImpl.workDatabase");
        workDatabase.runInTransaction((Runnable) new CancelWorkRunnable$$ExternalSyntheticLambda0(workDatabase, str, workManagerImpl));
    }

    /* access modifiers changed from: private */
    public static final void forNameInline$lambda$0(WorkDatabase workDatabase, String str, WorkManagerImpl workManagerImpl) {
        for (String cancel : workDatabase.workSpecDao().getUnfinishedWorkWithName(str)) {
            cancel(workManagerImpl, cancel);
        }
    }

    public static final Operation forAll(WorkManagerImpl workManagerImpl) {
        Intrinsics.checkNotNullParameter(workManagerImpl, "workManagerImpl");
        Tracer tracer = workManagerImpl.getConfiguration().getTracer();
        SerialExecutor serialTaskExecutor = workManagerImpl.getWorkTaskExecutor().getSerialTaskExecutor();
        Intrinsics.checkNotNullExpressionValue(serialTaskExecutor, "workManagerImpl.workTask…ecutor.serialTaskExecutor");
        return OperationKt.launchOperation(tracer, "CancelAllWork", serialTaskExecutor, new CancelWorkRunnable$forAll$1(workManagerImpl));
    }
}
