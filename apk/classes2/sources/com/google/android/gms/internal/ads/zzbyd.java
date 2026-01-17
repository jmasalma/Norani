package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzbyd {
    private final zzg zza;

    zzbyd(Clock clock, zzg zzg, zzbyo zzbyo) {
        this.zza = zzg;
    }

    public final void zza(int i, long j) {
        if (!((Boolean) zzbd.zzc().zzb(zzbde.zzaI)).booleanValue()) {
            zzg zzg = this.zza;
            if (j - zzg.zzf() < 0) {
                zze.zza("Receiving npa decision in the past, ignoring.");
                return;
            }
            if (!((Boolean) zzbd.zzc().zzb(zzbde.zzaJ)).booleanValue()) {
                zzg.zzH(-1);
                zzg.zzI(j);
                return;
            }
            zzg.zzH(i);
            zzg.zzI(j);
        }
    }
}
