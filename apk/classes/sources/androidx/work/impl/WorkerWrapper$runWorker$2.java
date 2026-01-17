package androidx.work.impl;

import androidx.work.ListenableWorker;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: WorkerWrapper.kt */
final class WorkerWrapper$runWorker$2 extends Lambda implements Function1<Throwable, Unit> {
    final /* synthetic */ boolean $isTracingEnabled;
    final /* synthetic */ String $traceTag;
    final /* synthetic */ ListenableWorker $worker;
    final /* synthetic */ WorkerWrapper this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    WorkerWrapper$runWorker$2(ListenableWorker listenableWorker, boolean z, String str, WorkerWrapper workerWrapper) {
        super(1);
        this.$worker = listenableWorker;
        this.$isTracingEnabled = z;
        this.$traceTag = str;
        this.this$0 = workerWrapper;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(Throwable th) {
        if (th instanceof WorkerStoppedException) {
            this.$worker.stop(((WorkerStoppedException) th).getReason());
        }
        if (this.$isTracingEnabled && this.$traceTag != null) {
            this.this$0.configuration.getTracer().endAsyncSection(this.$traceTag, this.this$0.getWorkSpec().hashCode());
        }
    }
}
