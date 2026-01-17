package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzcmg implements zzcwt {
    private final zzfdu zza;

    public zzcmg(zzfdu zzfdu) {
        this.zza = zzfdu;
    }

    public final void zzdj(Context context) {
        try {
            this.zza.zzg();
        } catch (zzfdd e) {
            int i = zze.zza;
            zzo.zzk("Cannot invoke onDestroy for the mediation adapter.", e);
        }
    }

    public final void zzdl(Context context) {
        try {
            this.zza.zzt();
        } catch (zzfdd e) {
            int i = zze.zza;
            zzo.zzk("Cannot invoke onPause for the mediation adapter.", e);
        }
    }

    public final void zzdm(Context context) {
        try {
            zzfdu zzfdu = this.zza;
            zzfdu.zzu();
            if (context != null) {
                zzfdu.zzs(context);
            }
        } catch (zzfdd e) {
            int i = zze.zza;
            zzo.zzk("Cannot invoke onResume for the mediation adapter.", e);
        }
    }
}
