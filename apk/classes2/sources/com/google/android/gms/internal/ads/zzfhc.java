package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzfhc implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;

    private zzfhc(zzhha zzhha, zzhha zzhha2, zzhha zzhha3) {
        this.zza = zzhha2;
        this.zzb = zzhha3;
    }

    public static zzfhc zza(zzhha zzhha, zzhha zzhha2, zzhha zzhha3) {
        return new zzfhc(zzhha, zzhha2, zzhha3);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzgdy zzc = zzffu.zzc();
        zzgdy zzgdy = zzc;
        zzfgz zza2 = ((zzfhd) this.zzb).zzb();
        zzfgz zzfgz = zza2;
        return new zzfha(zzc, (ScheduledExecutorService) this.zza.zzb(), zza2);
    }
}
