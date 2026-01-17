package androidx.work.impl;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class Processor$$ExternalSyntheticLambda2 implements Runnable {
    public final /* synthetic */ Processor f$0;
    public final /* synthetic */ ListenableFuture f$1;
    public final /* synthetic */ WorkerWrapper f$2;

    public /* synthetic */ Processor$$ExternalSyntheticLambda2(Processor processor, ListenableFuture listenableFuture, WorkerWrapper workerWrapper) {
        this.f$0 = processor;
        this.f$1 = listenableFuture;
        this.f$2 = workerWrapper;
    }

    public final void run() {
        this.f$0.m51lambda$startWork$1$androidxworkimplProcessor(this.f$1, this.f$2);
    }
}
