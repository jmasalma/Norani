package androidx.work.impl.utils;

import androidx.work.Data;
import java.util.UUID;
import kotlin.jvm.functions.Function0;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class WorkProgressUpdater$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ WorkProgressUpdater f$0;
    public final /* synthetic */ UUID f$1;
    public final /* synthetic */ Data f$2;

    public /* synthetic */ WorkProgressUpdater$$ExternalSyntheticLambda0(WorkProgressUpdater workProgressUpdater, UUID uuid, Data data) {
        this.f$0 = workProgressUpdater;
        this.f$1 = uuid;
        this.f$2 = data;
    }

    public final Object invoke() {
        return this.f$0.m66lambda$updateProgress$0$androidxworkimplutilsWorkProgressUpdater(this.f$1, this.f$2);
    }
}
