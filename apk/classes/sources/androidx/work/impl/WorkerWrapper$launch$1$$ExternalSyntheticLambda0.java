package androidx.work.impl;

import androidx.work.impl.WorkerWrapper;
import java.util.concurrent.Callable;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class WorkerWrapper$launch$1$$ExternalSyntheticLambda0 implements Callable {
    public final /* synthetic */ WorkerWrapper.Resolution f$0;
    public final /* synthetic */ WorkerWrapper f$1;

    public /* synthetic */ WorkerWrapper$launch$1$$ExternalSyntheticLambda0(WorkerWrapper.Resolution resolution, WorkerWrapper workerWrapper) {
        this.f$0 = resolution;
        this.f$1 = workerWrapper;
    }

    public final Object call() {
        return WorkerWrapper$launch$1.invokeSuspend$lambda$1(this.f$0, this.f$1);
    }
}
