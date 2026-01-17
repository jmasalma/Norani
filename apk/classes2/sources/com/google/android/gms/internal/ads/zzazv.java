package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzazv implements Application.ActivityLifecycleCallbacks {
    private Activity zza;
    private Context zzb;
    /* access modifiers changed from: private */
    public final Object zzc = new Object();
    /* access modifiers changed from: private */
    public boolean zzd = true;
    /* access modifiers changed from: private */
    public boolean zze = false;
    /* access modifiers changed from: private */
    public final List zzf = new ArrayList();
    private final List zzg = new ArrayList();
    private Runnable zzh;
    private boolean zzi = false;
    private long zzj;

    zzazv() {
    }

    private final void zzk(Activity activity) {
        synchronized (this.zzc) {
            if (!activity.getClass().getName().startsWith("com.google.android.gms.ads")) {
                this.zza = activity;
            }
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityPaused(Activity activity) {
        zzk(activity);
        synchronized (this.zzc) {
            for (zzbak zzb2 : this.zzg) {
                try {
                    zzb2.zzb();
                } catch (Exception e) {
                    zzv.zzp().zzw(e, "AppActivityTracker.ActivityListener.onActivityPaused");
                    int i = zze.zza;
                    zzo.zzh("", e);
                }
            }
        }
        this.zze = true;
        if (this.zzh != null) {
            zzs.zza.removeCallbacks(this.zzh);
        }
        zzfrw zzfrw = zzs.zza;
        zzazu zzazu = new zzazu(this);
        this.zzh = zzazu;
        zzfrw.postDelayed(zzazu, this.zzj);
    }

    public final void onActivityResumed(Activity activity) {
        zzk(activity);
        this.zze = false;
        boolean z = !this.zzd;
        this.zzd = true;
        if (this.zzh != null) {
            zzs.zza.removeCallbacks(this.zzh);
        }
        synchronized (this.zzc) {
            for (zzbak zzc2 : this.zzg) {
                try {
                    zzc2.zzc();
                } catch (Exception e) {
                    zzv.zzp().zzw(e, "AppActivityTracker.ActivityListener.onActivityResumed");
                    int i = zze.zza;
                    zzo.zzh("", e);
                }
            }
            if (z) {
                for (zzazw zza2 : this.zzf) {
                    try {
                        zza2.zza(true);
                    } catch (Exception e2) {
                        int i2 = zze.zza;
                        zzo.zzh("", e2);
                    }
                }
            } else {
                int i3 = zze.zza;
                zzo.zze("App is still foreground.");
            }
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
        zzk(activity);
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final Activity zza() {
        return this.zza;
    }

    public final Context zzb() {
        return this.zzb;
    }

    public final void zzf(zzazw zzazw) {
        synchronized (this.zzc) {
            this.zzf.add(zzazw);
        }
    }

    public final void zzg(Application application, Context context) {
        if (!this.zzi) {
            application.registerActivityLifecycleCallbacks(this);
            if (context instanceof Activity) {
                zzk((Activity) context);
            }
            this.zzb = application;
            this.zzj = ((Long) zzbd.zzc().zzb(zzbde.zzbg)).longValue();
            this.zzi = true;
        }
    }

    public final void zzh(zzazw zzazw) {
        synchronized (this.zzc) {
            this.zzf.remove(zzazw);
        }
    }

    public final void onActivityDestroyed(Activity activity) {
        synchronized (this.zzc) {
            Activity activity2 = this.zza;
            if (activity2 != null) {
                if (activity2.equals(activity)) {
                    this.zza = null;
                }
                Iterator it = this.zzg.iterator();
                while (it.hasNext()) {
                    try {
                        if (((zzbak) it.next()).zza()) {
                            it.remove();
                        }
                    } catch (Exception e) {
                        zzv.zzp().zzw(e, "AppActivityTracker.ActivityListener.onActivityDestroyed");
                        int i = zze.zza;
                        zzo.zzh("", e);
                    }
                }
            }
        }
    }
}
