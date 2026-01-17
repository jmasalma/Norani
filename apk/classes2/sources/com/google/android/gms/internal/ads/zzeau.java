package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.zzg;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzeau implements zzcxm, zzcwb {
    private static final Object zza = new Object();
    private static int zzb;
    private final zzg zzc;
    private final zzebe zzd;

    public zzeau(zzebe zzebe, zzg zzg) {
        this.zzd = zzebe;
        this.zzc = zzg;
    }

    private final void zzb(boolean z) {
        int i;
        int intValue;
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzgv)).booleanValue() && !this.zzc.zzN()) {
            Object obj = zza;
            synchronized (obj) {
                i = zzb;
                intValue = ((Integer) zzbd.zzc().zzb(zzbde.zzgw)).intValue();
            }
            if (i < intValue) {
                this.zzd.zzd(z);
                synchronized (obj) {
                    zzb++;
                }
            }
        }
    }

    public final void zzdD(zze zze) {
        zzb(false);
    }

    public final void zzu() {
        zzb(true);
    }
}
