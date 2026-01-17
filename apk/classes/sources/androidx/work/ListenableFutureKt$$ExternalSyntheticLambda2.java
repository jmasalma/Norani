package androidx.work;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class ListenableFutureKt$$ExternalSyntheticLambda2 implements Runnable {
    public final /* synthetic */ AtomicBoolean f$0;

    public /* synthetic */ ListenableFutureKt$$ExternalSyntheticLambda2(AtomicBoolean atomicBoolean) {
        this.f$0 = atomicBoolean;
    }

    public final void run() {
        ListenableFutureKt.executeAsync$lambda$4$lambda$2(this.f$0);
    }
}
