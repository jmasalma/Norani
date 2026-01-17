package androidx.work.impl;

import androidx.work.ListenableWorker;
import androidx.work.Logger;
import androidx.work.impl.WorkerWrapper;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.work.impl.WorkerWrapper$launch$1", f = "WorkerWrapper.kt", i = {}, l = {98}, m = "invokeSuspend", n = {}, s = {})
/* compiled from: WorkerWrapper.kt */
final class WorkerWrapper$launch$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    int label;
    final /* synthetic */ WorkerWrapper this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    WorkerWrapper$launch$1(WorkerWrapper workerWrapper, Continuation<? super WorkerWrapper$launch$1> continuation) {
        super(2, continuation);
        this.this$0 = workerWrapper;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return (Continuation) new WorkerWrapper$launch$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        WorkerWrapper.Resolution resolution;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            obj = BuildersKt.withContext(this.this$0.workerJob, new WorkerWrapper$launch$1$resolution$1(this.this$0, (Continuation<? super WorkerWrapper$launch$1$resolution$1>) null), (Continuation) this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            try {
                ResultKt.throwOnFailure(obj);
            } catch (WorkerStoppedException e) {
                resolution = new WorkerWrapper.Resolution.ResetWorkerStatus(e.getReason());
            } catch (CancellationException unused) {
                resolution = new WorkerWrapper.Resolution.Failed((ListenableWorker.Result) null, 1, (DefaultConstructorMarker) null);
            } catch (Throwable th) {
                Logger.get().error(WorkerWrapperKt.TAG, "Unexpected error in WorkerWrapper", th);
                resolution = new WorkerWrapper.Resolution.Failed((ListenableWorker.Result) null, 1, (DefaultConstructorMarker) null);
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        resolution = (WorkerWrapper.Resolution) obj;
        Object runInTransaction = this.this$0.workDatabase.runInTransaction(new WorkerWrapper$launch$1$$ExternalSyntheticLambda0(resolution, this.this$0));
        Intrinsics.checkNotNullExpressionValue(runInTransaction, "workDatabase.runInTransa…          }\n            )");
        return runInTransaction;
    }

    /* access modifiers changed from: private */
    public static final Boolean invokeSuspend$lambda$1(WorkerWrapper.Resolution resolution, WorkerWrapper workerWrapper) {
        boolean z;
        if (resolution instanceof WorkerWrapper.Resolution.Finished) {
            z = workerWrapper.onWorkFinished(((WorkerWrapper.Resolution.Finished) resolution).getResult());
        } else if (resolution instanceof WorkerWrapper.Resolution.Failed) {
            workerWrapper.setFailed(((WorkerWrapper.Resolution.Failed) resolution).getResult());
            z = false;
        } else if (resolution instanceof WorkerWrapper.Resolution.ResetWorkerStatus) {
            z = workerWrapper.resetWorkerStatus(((WorkerWrapper.Resolution.ResetWorkerStatus) resolution).getReason());
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return Boolean.valueOf(z);
    }
}
