package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzazq implements Application.ActivityLifecycleCallbacks {
    private final Application zza;
    private final WeakReference zzb;
    private boolean zzc = false;

    public zzazq(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.zzb = new WeakReference(activityLifecycleCallbacks);
        this.zza = application;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        zza(new zzazi(this, activity, bundle));
    }

    public final void onActivityDestroyed(Activity activity) {
        zza(new zzazo(this, activity));
    }

    public final void onActivityPaused(Activity activity) {
        zza(new zzazl(this, activity));
    }

    public final void onActivityResumed(Activity activity) {
        zza(new zzazk(this, activity));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        zza(new zzazn(this, activity, bundle));
    }

    public final void onActivityStarted(Activity activity) {
        zza(new zzazj(this, activity));
    }

    public final void onActivityStopped(Activity activity) {
        zza(new zzazm(this, activity));
    }

    /* access modifiers changed from: protected */
    public final void zza(zzazp zzazp) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.zzb.get();
            if (activityLifecycleCallbacks != null) {
                zzazp.zza(activityLifecycleCallbacks);
            } else if (!this.zzc) {
                this.zza.unregisterActivityLifecycleCallbacks(this);
                this.zzc = true;
            }
        } catch (Exception e) {
            int i = zze.zza;
            zzo.zzh("Error while dispatching lifecycle callback.", e);
        }
    }
}
