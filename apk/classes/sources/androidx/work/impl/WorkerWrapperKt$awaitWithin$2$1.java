package androidx.work.impl;

import androidx.work.ListenableWorker;
import com.google.common.util.concurrent.ListenableFuture;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "it", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: WorkerWrapper.kt */
final class WorkerWrapperKt$awaitWithin$2$1 extends Lambda implements Function1<Throwable, Unit> {
    final /* synthetic */ ListenableFuture<T> $this_awaitWithin;
    final /* synthetic */ ListenableWorker $worker;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    WorkerWrapperKt$awaitWithin$2$1(ListenableWorker listenableWorker, ListenableFuture<T> listenableFuture) {
        super(1);
        this.$worker = listenableWorker;
        this.$this_awaitWithin = listenableFuture;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(Throwable th) {
        if (th instanceof WorkerStoppedException) {
            this.$worker.stop(((WorkerStoppedException) th).getReason());
        }
        this.$this_awaitWithin.cancel(false);
    }
}
