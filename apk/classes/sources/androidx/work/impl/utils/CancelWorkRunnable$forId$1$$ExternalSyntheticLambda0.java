package androidx.work.impl.utils;

import androidx.work.impl.WorkManagerImpl;
import java.util.UUID;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class CancelWorkRunnable$forId$1$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ WorkManagerImpl f$0;
    public final /* synthetic */ UUID f$1;

    public /* synthetic */ CancelWorkRunnable$forId$1$$ExternalSyntheticLambda0(WorkManagerImpl workManagerImpl, UUID uuid) {
        this.f$0 = workManagerImpl;
        this.f$1 = uuid;
    }

    public final void run() {
        CancelWorkRunnable$forId$1.invoke$lambda$0(this.f$0, this.f$1);
    }
}
