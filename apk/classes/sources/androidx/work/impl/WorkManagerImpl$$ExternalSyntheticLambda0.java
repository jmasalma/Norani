package androidx.work.impl;

import androidx.work.impl.utils.PreferenceUtils;
import kotlin.jvm.functions.Function0;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class WorkManagerImpl$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ PreferenceUtils f$0;

    public /* synthetic */ WorkManagerImpl$$ExternalSyntheticLambda0(PreferenceUtils preferenceUtils) {
        this.f$0 = preferenceUtils;
    }

    public final Object invoke() {
        return Long.valueOf(this.f$0.getLastCancelAllTimeMillis());
    }
}
