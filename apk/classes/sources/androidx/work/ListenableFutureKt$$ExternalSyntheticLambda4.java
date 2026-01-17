package androidx.work;

import kotlinx.coroutines.Job;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class ListenableFutureKt$$ExternalSyntheticLambda4 implements Runnable {
    public final /* synthetic */ Job f$0;

    public /* synthetic */ ListenableFutureKt$$ExternalSyntheticLambda4(Job job) {
        this.f$0 = job;
    }

    public final void run() {
        ListenableFutureKt.launchFuture$lambda$1$lambda$0(this.f$0);
    }
}
