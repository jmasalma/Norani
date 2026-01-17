package androidx.work.impl.utils;

import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class CancelWorkRunnable$forTag$1$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ WorkDatabase f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ WorkManagerImpl f$2;

    public /* synthetic */ CancelWorkRunnable$forTag$1$$ExternalSyntheticLambda0(WorkDatabase workDatabase, String str, WorkManagerImpl workManagerImpl) {
        this.f$0 = workDatabase;
        this.f$1 = str;
        this.f$2 = workManagerImpl;
    }

    public final void run() {
        CancelWorkRunnable$forTag$1.invoke$lambda$0(this.f$0, this.f$1, this.f$2);
    }
}
