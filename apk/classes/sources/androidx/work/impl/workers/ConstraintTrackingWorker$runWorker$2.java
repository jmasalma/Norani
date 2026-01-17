package androidx.work.impl.workers;

import androidx.work.ListenableWorker;
import androidx.work.impl.constraints.WorkConstraintsTracker;
import androidx.work.impl.model.WorkSpec;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0003H@"}, d2 = {"<anonymous>", "Landroidx/work/ListenableWorker$Result;", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.work.impl.workers.ConstraintTrackingWorker$runWorker$2", f = "ConstraintTrackingWorker.kt", i = {0, 0, 0}, l = {134}, m = "invokeSuspend", n = {"atomicReason", "future", "constraintTrackingJob"}, s = {"L$0", "L$1", "L$2"})
/* compiled from: ConstraintTrackingWorker.kt */
final class ConstraintTrackingWorker$runWorker$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ListenableWorker.Result>, Object> {
    final /* synthetic */ ListenableWorker $delegate;
    final /* synthetic */ WorkConstraintsTracker $workConstraintsTracker;
    final /* synthetic */ WorkSpec $workSpec;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ConstraintTrackingWorker$runWorker$2(ListenableWorker listenableWorker, WorkConstraintsTracker workConstraintsTracker, WorkSpec workSpec, Continuation<? super ConstraintTrackingWorker$runWorker$2> continuation) {
        super(2, continuation);
        this.$delegate = listenableWorker;
        this.$workConstraintsTracker = workConstraintsTracker;
        this.$workSpec = workSpec;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        Continuation<Unit> constraintTrackingWorker$runWorker$2 = new ConstraintTrackingWorker$runWorker$2(this.$delegate, this.$workConstraintsTracker, this.$workSpec, continuation);
        constraintTrackingWorker$runWorker$2.L$0 = obj;
        return (Continuation) constraintTrackingWorker$runWorker$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ListenableWorker.Result> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: kotlinx.coroutines.Job} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: com.google.common.util.concurrent.ListenableFuture<androidx.work.ListenableWorker$Result>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v13, resolved type: kotlinx.coroutines.Job} */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00db, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00dd, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ef, code lost:
        throw new androidx.work.impl.workers.ConstraintTrackingWorker.ConstraintUnsatisfiedException(r8.get());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0028, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002a, code lost:
        r0 = e;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00db A[Catch:{ CancellationException -> 0x00aa, all -> 0x0083, all -> 0x00f1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00dd A[Catch:{ CancellationException -> 0x00aa, all -> 0x0083, all -> 0x00f1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e4 A[ADDED_TO_REGION, Catch:{ CancellationException -> 0x00aa, all -> 0x0083, all -> 0x00f1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0028 A[ExcHandler: all (th java.lang.Throwable), PHI: r2 
      PHI: (r2v9 kotlinx.coroutines.Job) = (r2v3 kotlinx.coroutines.Job), (r2v3 kotlinx.coroutines.Job), (r2v12 kotlinx.coroutines.Job), (r2v12 kotlinx.coroutines.Job) binds: [B:17:0x007a, B:18:?, B:4:0x0021, B:5:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:4:0x0021] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            r16 = this;
            r1 = r16
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r1.label
            r3 = -256(0xffffffffffffff00, float:NaN)
            r4 = 0
            r5 = 1
            java.lang.String r6 = "Delegated worker "
            if (r2 == 0) goto L_0x0035
            if (r2 != r5) goto L_0x002d
            java.lang.Object r0 = r1.L$2
            r2 = r0
            kotlinx.coroutines.Job r2 = (kotlinx.coroutines.Job) r2
            java.lang.Object r0 = r1.L$1
            r7 = r0
            com.google.common.util.concurrent.ListenableFuture r7 = (com.google.common.util.concurrent.ListenableFuture) r7
            java.lang.Object r0 = r1.L$0
            r8 = r0
            java.util.concurrent.atomic.AtomicInteger r8 = (java.util.concurrent.atomic.AtomicInteger) r8
            kotlin.ResultKt.throwOnFailure(r17)     // Catch:{ CancellationException -> 0x002a, all -> 0x0028 }
            r9 = r8
            r8 = r17
            goto L_0x007a
        L_0x0028:
            r0 = move-exception
            goto L_0x0085
        L_0x002a:
            r0 = move-exception
            goto L_0x00ae
        L_0x002d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0035:
            kotlin.ResultKt.throwOnFailure(r17)
            java.lang.Object r2 = r1.L$0
            r7 = r2
            kotlinx.coroutines.CoroutineScope r7 = (kotlinx.coroutines.CoroutineScope) r7
            java.util.concurrent.atomic.AtomicInteger r2 = new java.util.concurrent.atomic.AtomicInteger
            r2.<init>(r3)
            androidx.work.ListenableWorker r8 = r1.$delegate
            com.google.common.util.concurrent.ListenableFuture r14 = r8.startWork()
            java.lang.String r8 = "delegate.startWork()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r14, r8)
            androidx.work.impl.workers.ConstraintTrackingWorker$runWorker$2$constraintTrackingJob$1 r15 = new androidx.work.impl.workers.ConstraintTrackingWorker$runWorker$2$constraintTrackingJob$1
            androidx.work.impl.constraints.WorkConstraintsTracker r9 = r1.$workConstraintsTracker
            androidx.work.impl.model.WorkSpec r10 = r1.$workSpec
            r13 = 0
            r8 = r15
            r11 = r2
            r12 = r14
            r8.<init>(r9, r10, r11, r12, r13)
            r10 = r15
            kotlin.jvm.functions.Function2 r10 = (kotlin.jvm.functions.Function2) r10
            r11 = 3
            r12 = 0
            r8 = 0
            r9 = 0
            kotlinx.coroutines.Job r7 = kotlinx.coroutines.BuildersKt.launch$default(r7, r8, r9, r10, r11, r12)
            r8 = r1
            kotlin.coroutines.Continuation r8 = (kotlin.coroutines.Continuation) r8     // Catch:{ CancellationException -> 0x00aa, all -> 0x0083 }
            r1.L$0 = r2     // Catch:{ CancellationException -> 0x00aa, all -> 0x0083 }
            r1.L$1 = r14     // Catch:{ CancellationException -> 0x00aa, all -> 0x0083 }
            r1.L$2 = r7     // Catch:{ CancellationException -> 0x00aa, all -> 0x0083 }
            r1.label = r5     // Catch:{ CancellationException -> 0x00aa, all -> 0x0083 }
            java.lang.Object r8 = androidx.concurrent.futures.ListenableFutureKt.await(r14, r8)     // Catch:{ CancellationException -> 0x00aa, all -> 0x0083 }
            if (r8 != r0) goto L_0x0077
            return r0
        L_0x0077:
            r9 = r2
            r2 = r7
            r7 = r14
        L_0x007a:
            androidx.work.ListenableWorker$Result r8 = (androidx.work.ListenableWorker.Result) r8     // Catch:{ CancellationException -> 0x0080, all -> 0x0028 }
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(r2, r4, r5, r4)
            return r8
        L_0x0080:
            r0 = move-exception
            r8 = r9
            goto L_0x00ae
        L_0x0083:
            r0 = move-exception
            r2 = r7
        L_0x0085:
            java.lang.String r3 = androidx.work.impl.workers.ConstraintTrackingWorkerKt.TAG     // Catch:{ all -> 0x00f1 }
            androidx.work.ListenableWorker r7 = r1.$delegate     // Catch:{ all -> 0x00f1 }
            androidx.work.Logger r8 = androidx.work.Logger.get()     // Catch:{ all -> 0x00f1 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f1 }
            r9.<init>(r6)     // Catch:{ all -> 0x00f1 }
            java.lang.Class r6 = r7.getClass()     // Catch:{ all -> 0x00f1 }
            java.lang.StringBuilder r6 = r9.append(r6)     // Catch:{ all -> 0x00f1 }
            java.lang.String r7 = " threw exception in startWork."
            java.lang.StringBuilder r6 = r6.append(r7)     // Catch:{ all -> 0x00f1 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x00f1 }
            r8.debug(r3, r6, r0)     // Catch:{ all -> 0x00f1 }
            throw r0     // Catch:{ all -> 0x00f1 }
        L_0x00aa:
            r0 = move-exception
            r8 = r2
            r2 = r7
            r7 = r14
        L_0x00ae:
            java.lang.String r9 = androidx.work.impl.workers.ConstraintTrackingWorkerKt.TAG     // Catch:{ all -> 0x00f1 }
            androidx.work.ListenableWorker r10 = r1.$delegate     // Catch:{ all -> 0x00f1 }
            androidx.work.Logger r11 = androidx.work.Logger.get()     // Catch:{ all -> 0x00f1 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f1 }
            r12.<init>(r6)     // Catch:{ all -> 0x00f1 }
            java.lang.Class r6 = r10.getClass()     // Catch:{ all -> 0x00f1 }
            java.lang.StringBuilder r6 = r12.append(r6)     // Catch:{ all -> 0x00f1 }
            java.lang.String r10 = " was cancelled"
            java.lang.StringBuilder r6 = r6.append(r10)     // Catch:{ all -> 0x00f1 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x00f1 }
            r10 = r0
            java.lang.Throwable r10 = (java.lang.Throwable) r10     // Catch:{ all -> 0x00f1 }
            r11.debug(r9, r6, r10)     // Catch:{ all -> 0x00f1 }
            int r6 = r8.get()     // Catch:{ all -> 0x00f1 }
            if (r6 == r3) goto L_0x00dd
            r3 = r5
            goto L_0x00de
        L_0x00dd:
            r3 = 0
        L_0x00de:
            boolean r6 = r7.isCancelled()     // Catch:{ all -> 0x00f1 }
            if (r6 == 0) goto L_0x00f0
            if (r3 == 0) goto L_0x00f0
            androidx.work.impl.workers.ConstraintTrackingWorker$ConstraintUnsatisfiedException r0 = new androidx.work.impl.workers.ConstraintTrackingWorker$ConstraintUnsatisfiedException     // Catch:{ all -> 0x00f1 }
            int r3 = r8.get()     // Catch:{ all -> 0x00f1 }
            r0.<init>(r3)     // Catch:{ all -> 0x00f1 }
            throw r0     // Catch:{ all -> 0x00f1 }
        L_0x00f0:
            throw r0     // Catch:{ all -> 0x00f1 }
        L_0x00f1:
            r0 = move-exception
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(r2, r4, r5, r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.workers.ConstraintTrackingWorker$runWorker$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
