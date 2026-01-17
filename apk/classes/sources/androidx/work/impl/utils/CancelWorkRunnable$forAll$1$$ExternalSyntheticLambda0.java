package androidx.work.impl.utils;

import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class CancelWorkRunnable$forAll$1$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ WorkDatabase f$0;
    public final /* synthetic */ WorkManagerImpl f$1;

    public /* synthetic */ CancelWorkRunnable$forAll$1$$ExternalSyntheticLambda0(WorkDatabase workDatabase, WorkManagerImpl workManagerImpl) {
        this.f$0 = workDatabase;
        this.f$1 = workManagerImpl;
    }

    public final void run() {
        CancelWorkRunnable$forAll$1.invoke$lambda$0(this.f$0, this.f$1);
    }
}
