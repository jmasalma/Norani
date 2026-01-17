package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.2.0 */
final class zzaz implements Application.ActivityLifecycleCallbacks {
    final /* synthetic */ zzbc zza;
    private final Activity zzb;

    public zzaz(zzbc zzbc, Activity activity) {
        this.zza = zzbc;
        this.zzb = activity;
    }

    /* access modifiers changed from: private */
    public final void zzb() {
        this.zza.zzb.unregisterActivityLifecycleCallbacks(this);
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        zzbc zzbc = this.zza;
        if (zzbc.zzg != null && zzbc.zza) {
            zzbc.zzg.setOwnerActivity(activity);
            if (zzbc.zzc != null) {
                zzbc.zzc.zza(activity);
            }
            zzaz zzaz = (zzaz) zzbc.zzl.getAndSet((Object) null);
            if (zzaz != null) {
                zzaz.zzb();
                zzaz zzaz2 = new zzaz(zzbc, activity);
                zzbc.zzb.registerActivityLifecycleCallbacks(zzaz2);
                zzbc.zzl.set(zzaz2);
            }
            if (zzbc.zzg != null) {
                zzbc.zzg.show();
            }
        }
    }

    public final void onActivityDestroyed(Activity activity) {
        if (activity == this.zzb) {
            if (activity.isChangingConfigurations()) {
                zzbc zzbc = this.zza;
                if (zzbc.zza && zzbc.zzg != null) {
                    zzbc.zzg.dismiss();
                    return;
                }
            }
            this.zza.zzh(new zzg(3, "Activity is destroyed."));
        }
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }
}
