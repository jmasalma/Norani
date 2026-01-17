package androidx.work.impl;

import androidx.work.Configuration;
import androidx.work.impl.model.WorkGenerationalId;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class Schedulers$$ExternalSyntheticLambda0 implements ExecutionListener {
    public final /* synthetic */ Executor f$0;
    public final /* synthetic */ List f$1;
    public final /* synthetic */ Configuration f$2;
    public final /* synthetic */ WorkDatabase f$3;

    public /* synthetic */ Schedulers$$ExternalSyntheticLambda0(Executor executor, List list, Configuration configuration, WorkDatabase workDatabase) {
        this.f$0 = executor;
        this.f$1 = list;
        this.f$2 = configuration;
        this.f$3 = workDatabase;
    }

    public final void onExecuted(WorkGenerationalId workGenerationalId, boolean z) {
        this.f$0.execute(new Schedulers$$ExternalSyntheticLambda1(this.f$1, workGenerationalId, this.f$2, this.f$3));
    }
}
