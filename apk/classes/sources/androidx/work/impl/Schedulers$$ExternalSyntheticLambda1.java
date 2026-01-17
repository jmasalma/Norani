package androidx.work.impl;

import androidx.work.Configuration;
import androidx.work.impl.model.WorkGenerationalId;
import java.util.List;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class Schedulers$$ExternalSyntheticLambda1 implements Runnable {
    public final /* synthetic */ List f$0;
    public final /* synthetic */ WorkGenerationalId f$1;
    public final /* synthetic */ Configuration f$2;
    public final /* synthetic */ WorkDatabase f$3;

    public /* synthetic */ Schedulers$$ExternalSyntheticLambda1(List list, WorkGenerationalId workGenerationalId, Configuration configuration, WorkDatabase workDatabase) {
        this.f$0 = list;
        this.f$1 = workGenerationalId;
        this.f$2 = configuration;
        this.f$3 = workDatabase;
    }

    public final void run() {
        Schedulers.lambda$registerRescheduling$0(this.f$0, this.f$1, this.f$2, this.f$3);
    }
}
