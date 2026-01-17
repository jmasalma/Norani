package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.ExecutorsKt;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0013B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\bH@¢\u0006\u0002\u0010\tJ&\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H@¢\u0006\u0002\u0010\u0011J\u000e\u0010\u0012\u001a\u00020\bH@¢\u0006\u0002\u0010\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Landroidx/work/impl/workers/ConstraintTrackingWorker;", "Landroidx/work/CoroutineWorker;", "appContext", "Landroid/content/Context;", "workerParameters", "Landroidx/work/WorkerParameters;", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "doWork", "Landroidx/work/ListenableWorker$Result;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "runWorker", "delegate", "Landroidx/work/ListenableWorker;", "workConstraintsTracker", "Landroidx/work/impl/constraints/WorkConstraintsTracker;", "workSpec", "Landroidx/work/impl/model/WorkSpec;", "(Landroidx/work/ListenableWorker;Landroidx/work/impl/constraints/WorkConstraintsTracker;Landroidx/work/impl/model/WorkSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setupAndRunConstraintTrackingWork", "ConstraintUnsatisfiedException", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: ConstraintTrackingWorker.kt */
public final class ConstraintTrackingWorker extends CoroutineWorker {
    private final WorkerParameters workerParameters;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters2) {
        super(context, workerParameters2);
        Intrinsics.checkNotNullParameter(context, "appContext");
        Intrinsics.checkNotNullParameter(workerParameters2, "workerParameters");
        this.workerParameters = workerParameters2;
    }

    public Object doWork(Continuation<? super ListenableWorker.Result> continuation) {
        Executor backgroundExecutor = getBackgroundExecutor();
        Intrinsics.checkNotNullExpressionValue(backgroundExecutor, "backgroundExecutor");
        return BuildersKt.withContext(ExecutorsKt.from(backgroundExecutor), new ConstraintTrackingWorker$doWork$2(this, (Continuation<? super ConstraintTrackingWorker$doWork$2>) null), continuation);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: androidx.work.impl.workers.ConstraintTrackingWorker} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object setupAndRunConstraintTrackingWork(kotlin.coroutines.Continuation<? super androidx.work.ListenableWorker.Result> r14) {
        /*
            r13 = this;
            boolean r1 = r14 instanceof androidx.work.impl.workers.ConstraintTrackingWorker$setupAndRunConstraintTrackingWork$1
            if (r1 == 0) goto L_0x0014
            r1 = r14
            androidx.work.impl.workers.ConstraintTrackingWorker$setupAndRunConstraintTrackingWork$1 r1 = (androidx.work.impl.workers.ConstraintTrackingWorker$setupAndRunConstraintTrackingWork$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 & r3
            if (r2 == 0) goto L_0x0014
            int r0 = r1.label
            int r0 = r0 - r3
            r1.label = r0
            goto L_0x0019
        L_0x0014:
            androidx.work.impl.workers.ConstraintTrackingWorker$setupAndRunConstraintTrackingWork$1 r1 = new androidx.work.impl.workers.ConstraintTrackingWorker$setupAndRunConstraintTrackingWork$1
            r1.<init>(r13, r14)
        L_0x0019:
            r0 = r1
            java.lang.Object r1 = r0.result
            java.lang.Object r7 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r8 = 1
            if (r2 == 0) goto L_0x0040
            if (r2 != r8) goto L_0x0038
            java.lang.Object r2 = r0.L$1
            androidx.work.ListenableWorker r2 = (androidx.work.ListenableWorker) r2
            java.lang.Object r0 = r0.L$0
            r3 = r0
            androidx.work.impl.workers.ConstraintTrackingWorker r3 = (androidx.work.impl.workers.ConstraintTrackingWorker) r3
            kotlin.ResultKt.throwOnFailure(r1)     // Catch:{ CancellationException -> 0x0035 }
            goto L_0x012b
        L_0x0035:
            r0 = move-exception
            goto L_0x0131
        L_0x0038:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0040:
            kotlin.ResultKt.throwOnFailure(r1)
            androidx.work.Data r1 = r13.getInputData()
            java.lang.String r2 = "androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME"
            java.lang.String r1 = r1.getString(r2)
            r2 = r1
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            java.lang.String r3 = "No worker to delegate to."
            java.lang.String r4 = "failure()"
            if (r2 == 0) goto L_0x01a0
            int r2 = r2.length()
            if (r2 != 0) goto L_0x005e
            goto L_0x01a0
        L_0x005e:
            android.content.Context r2 = r13.getApplicationContext()
            androidx.work.impl.WorkManagerImpl r2 = androidx.work.impl.WorkManagerImpl.getInstance(r2)
            java.lang.String r5 = "getInstance(applicationContext)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r5)
            androidx.work.impl.WorkDatabase r5 = r2.getWorkDatabase()
            androidx.work.impl.model.WorkSpecDao r5 = r5.workSpecDao()
            java.util.UUID r6 = r13.getId()
            java.lang.String r6 = r6.toString()
            java.lang.String r9 = "id.toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r9)
            androidx.work.impl.model.WorkSpec r5 = r5.getWorkSpec(r6)
            if (r5 != 0) goto L_0x008e
            androidx.work.ListenableWorker$Result r0 = androidx.work.ListenableWorker.Result.failure()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r4)
            return r0
        L_0x008e:
            androidx.work.impl.constraints.WorkConstraintsTracker r6 = new androidx.work.impl.constraints.WorkConstraintsTracker
            androidx.work.impl.constraints.trackers.Trackers r9 = r2.getTrackers()
            java.lang.String r10 = "workManagerImpl.trackers"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r10)
            r6.<init>((androidx.work.impl.constraints.trackers.Trackers) r9)
            boolean r9 = r6.areAllConstraintsMet(r5)
            if (r9 != 0) goto L_0x00cc
            java.lang.String r0 = androidx.work.impl.workers.ConstraintTrackingWorkerKt.TAG
            androidx.work.Logger r2 = androidx.work.Logger.get()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Constraints not met for delegate "
            r3.<init>(r4)
            java.lang.StringBuilder r1 = r3.append(r1)
            java.lang.String r3 = ". Requesting retry."
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            r2.debug(r0, r1)
            androidx.work.ListenableWorker$Result r0 = androidx.work.ListenableWorker.Result.retry()
            java.lang.String r1 = "retry()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
        L_0x00cc:
            java.lang.String r9 = androidx.work.impl.workers.ConstraintTrackingWorkerKt.TAG
            androidx.work.Logger r10 = androidx.work.Logger.get()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "Constraints met for delegate "
            r11.<init>(r12)
            java.lang.StringBuilder r11 = r11.append(r1)
            java.lang.String r11 = r11.toString()
            r10.debug(r9, r11)
            androidx.work.WorkerFactory r9 = r13.getWorkerFactory()     // Catch:{ all -> 0x0174 }
            android.content.Context r10 = r13.getApplicationContext()     // Catch:{ all -> 0x0174 }
            java.lang.String r11 = "applicationContext"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r11)     // Catch:{ all -> 0x0174 }
            androidx.work.WorkerParameters r11 = r13.workerParameters     // Catch:{ all -> 0x0174 }
            androidx.work.ListenableWorker r9 = r9.createWorkerWithDefaultFallback(r10, r1, r11)     // Catch:{ all -> 0x0174 }
            androidx.work.WorkerParameters r1 = r13.workerParameters
            androidx.work.impl.utils.taskexecutor.TaskExecutor r1 = r1.getTaskExecutor()
            java.util.concurrent.Executor r1 = r1.getMainThreadExecutor()
            java.lang.String r2 = "workerParameters.taskExecutor.mainThreadExecutor"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            kotlinx.coroutines.CoroutineDispatcher r1 = kotlinx.coroutines.ExecutorsKt.from(r1)     // Catch:{ CancellationException -> 0x012e }
            r10 = r1
            kotlin.coroutines.CoroutineContext r10 = (kotlin.coroutines.CoroutineContext) r10     // Catch:{ CancellationException -> 0x012e }
            androidx.work.impl.workers.ConstraintTrackingWorker$setupAndRunConstraintTrackingWork$5 r11 = new androidx.work.impl.workers.ConstraintTrackingWorker$setupAndRunConstraintTrackingWork$5     // Catch:{ CancellationException -> 0x012e }
            r12 = 0
            r1 = r11
            r2 = r13
            r3 = r9
            r4 = r6
            r6 = r12
            r1.<init>(r2, r3, r4, r5, r6)     // Catch:{ CancellationException -> 0x012e }
            kotlin.jvm.functions.Function2 r11 = (kotlin.jvm.functions.Function2) r11     // Catch:{ CancellationException -> 0x012e }
            r0.L$0 = r13     // Catch:{ CancellationException -> 0x012e }
            r0.L$1 = r9     // Catch:{ CancellationException -> 0x012e }
            r0.label = r8     // Catch:{ CancellationException -> 0x012e }
            java.lang.Object r1 = kotlinx.coroutines.BuildersKt.withContext(r10, r11, r0)     // Catch:{ CancellationException -> 0x012e }
            if (r1 != r7) goto L_0x0129
            return r7
        L_0x0129:
            r3 = r13
            r2 = r9
        L_0x012b:
            androidx.work.ListenableWorker$Result r1 = (androidx.work.ListenableWorker.Result) r1     // Catch:{ CancellationException -> 0x0035 }
            goto L_0x016a
        L_0x012e:
            r0 = move-exception
            r3 = r13
            r2 = r9
        L_0x0131:
            boolean r1 = r3.isStopped()
            if (r1 != 0) goto L_0x013b
            boolean r1 = r0 instanceof androidx.work.impl.workers.ConstraintTrackingWorker.ConstraintUnsatisfiedException
            if (r1 == 0) goto L_0x015d
        L_0x013b:
            int r1 = android.os.Build.VERSION.SDK_INT
            r4 = 31
            if (r1 >= r4) goto L_0x0144
            r1 = -512(0xfffffffffffffe00, float:NaN)
            goto L_0x015a
        L_0x0144:
            boolean r1 = r3.isStopped()
            if (r1 == 0) goto L_0x014f
            int r1 = r3.getStopReason()
            goto L_0x015a
        L_0x014f:
            boolean r1 = r0 instanceof androidx.work.impl.workers.ConstraintTrackingWorker.ConstraintUnsatisfiedException
            if (r1 == 0) goto L_0x016c
            r1 = r0
            androidx.work.impl.workers.ConstraintTrackingWorker$ConstraintUnsatisfiedException r1 = (androidx.work.impl.workers.ConstraintTrackingWorker.ConstraintUnsatisfiedException) r1
            int r1 = r1.getStopReason()
        L_0x015a:
            r2.stop(r1)
        L_0x015d:
            boolean r1 = r0 instanceof androidx.work.impl.workers.ConstraintTrackingWorker.ConstraintUnsatisfiedException
            if (r1 == 0) goto L_0x016b
            androidx.work.ListenableWorker$Result r1 = androidx.work.ListenableWorker.Result.retry()
            java.lang.String r0 = "{\n            // there a…throw cancelled\n        }"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
        L_0x016a:
            return r1
        L_0x016b:
            throw r0
        L_0x016c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Unreachable"
            r0.<init>(r1)
            throw r0
        L_0x0174:
            r0 = move-exception
            java.lang.String r5 = androidx.work.impl.workers.ConstraintTrackingWorkerKt.TAG
            androidx.work.Logger r6 = androidx.work.Logger.get()
            r6.debug(r5, r3)
            androidx.work.Configuration r2 = r2.getConfiguration()
            androidx.core.util.Consumer r2 = r2.getWorkerInitializationExceptionHandler()
            if (r2 == 0) goto L_0x0198
            androidx.work.WorkerExceptionInfo r3 = new androidx.work.WorkerExceptionInfo
            androidx.work.WorkerParameters r5 = r13.workerParameters
            r3.<init>(r1, r5, r0)
            java.lang.String r0 = androidx.work.impl.workers.ConstraintTrackingWorkerKt.TAG
            androidx.work.impl.utils.WorkerExceptionUtilsKt.safeAccept(r2, r3, r0)
        L_0x0198:
            androidx.work.ListenableWorker$Result r0 = androidx.work.ListenableWorker.Result.failure()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r4)
            return r0
        L_0x01a0:
            java.lang.String r0 = androidx.work.impl.workers.ConstraintTrackingWorkerKt.TAG
            androidx.work.Logger r1 = androidx.work.Logger.get()
            r1.error(r0, r3)
            androidx.work.ListenableWorker$Result r0 = androidx.work.ListenableWorker.Result.failure()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.workers.ConstraintTrackingWorker.setupAndRunConstraintTrackingWork(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object runWorker(androidx.work.ListenableWorker r5, androidx.work.impl.constraints.WorkConstraintsTracker r6, androidx.work.impl.model.WorkSpec r7, kotlin.coroutines.Continuation<? super androidx.work.ListenableWorker.Result> r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof androidx.work.impl.workers.ConstraintTrackingWorker$runWorker$1
            if (r0 == 0) goto L_0x0014
            r0 = r8
            androidx.work.impl.workers.ConstraintTrackingWorker$runWorker$1 r0 = (androidx.work.impl.workers.ConstraintTrackingWorker$runWorker$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r8 = r0.label
            int r8 = r8 - r2
            r0.label = r8
            goto L_0x0019
        L_0x0014:
            androidx.work.impl.workers.ConstraintTrackingWorker$runWorker$1 r0 = new androidx.work.impl.workers.ConstraintTrackingWorker$runWorker$1
            r0.<init>(r4, r8)
        L_0x0019:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x0046
        L_0x002a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0032:
            kotlin.ResultKt.throwOnFailure(r8)
            androidx.work.impl.workers.ConstraintTrackingWorker$runWorker$2 r8 = new androidx.work.impl.workers.ConstraintTrackingWorker$runWorker$2
            r2 = 0
            r8.<init>(r5, r6, r7, r2)
            kotlin.jvm.functions.Function2 r8 = (kotlin.jvm.functions.Function2) r8
            r0.label = r3
            java.lang.Object r8 = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(r8, r0)
            if (r8 != r1) goto L_0x0046
            return r1
        L_0x0046:
            java.lang.String r5 = "delegate: ListenableWork….cancel()\n        }\n    }"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r5)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.workers.ConstraintTrackingWorker.runWorker(androidx.work.ListenableWorker, androidx.work.impl.constraints.WorkConstraintsTracker, androidx.work.impl.model.WorkSpec, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/work/impl/workers/ConstraintTrackingWorker$ConstraintUnsatisfiedException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "stopReason", "", "(I)V", "getStopReason", "()I", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: ConstraintTrackingWorker.kt */
    private static final class ConstraintUnsatisfiedException extends CancellationException {
        private final int stopReason;

        public ConstraintUnsatisfiedException(int i) {
            this.stopReason = i;
        }

        public final int getStopReason() {
            return this.stopReason;
        }
    }
}
