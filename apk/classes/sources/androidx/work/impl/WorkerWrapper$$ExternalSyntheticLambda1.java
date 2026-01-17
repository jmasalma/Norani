package androidx.work.impl;

import java.util.concurrent.Callable;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class WorkerWrapper$$ExternalSyntheticLambda1 implements Callable {
    public final /* synthetic */ WorkerWrapper f$0;

    public /* synthetic */ WorkerWrapper$$ExternalSyntheticLambda1(WorkerWrapper workerWrapper) {
        this.f$0 = workerWrapper;
    }

    public final Object call() {
        return WorkerWrapper.trySetRunning$lambda$11(this.f$0);
    }
}
