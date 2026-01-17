package androidx.work.impl.utils;

import android.content.Context;
import androidx.work.ForegroundInfo;
import java.util.UUID;
import kotlin.jvm.functions.Function0;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class WorkForegroundUpdater$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ WorkForegroundUpdater f$0;
    public final /* synthetic */ UUID f$1;
    public final /* synthetic */ ForegroundInfo f$2;
    public final /* synthetic */ Context f$3;

    public /* synthetic */ WorkForegroundUpdater$$ExternalSyntheticLambda0(WorkForegroundUpdater workForegroundUpdater, UUID uuid, ForegroundInfo foregroundInfo, Context context) {
        this.f$0 = workForegroundUpdater;
        this.f$1 = uuid;
        this.f$2 = foregroundInfo;
        this.f$3 = context;
    }

    public final Object invoke() {
        return this.f$0.m65lambda$setForegroundAsync$0$androidxworkimplutilsWorkForegroundUpdater(this.f$1, this.f$2, this.f$3);
    }
}
