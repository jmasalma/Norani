package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzazo implements zzazp {
    final /* synthetic */ Activity zza;

    zzazo(zzazq zzazq, Activity activity) {
        this.zza = activity;
        Objects.requireNonNull(zzazq);
    }

    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityDestroyed(this.zza);
    }
}
