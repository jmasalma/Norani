package androidx.work.impl;

import java.util.concurrent.Callable;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class WorkerWrapper$$ExternalSyntheticLambda0 implements Callable {
    public final /* synthetic */ WorkerWrapper f$0;

    public /* synthetic */ WorkerWrapper$$ExternalSyntheticLambda0(WorkerWrapper workerWrapper) {
        this.f$0 = workerWrapper;
    }

    public final Object call() {
        return WorkerWrapper.runWorker$lambda$1(this.f$0);
    }
}
