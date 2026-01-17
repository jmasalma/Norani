package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdka implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;

    private zzdka(zzhha zzhha, zzhha zzhha2) {
        this.zza = zzhha;
        this.zzb = zzhha2;
    }

    public static zzdka zza(zzhha zzhha, zzhha zzhha2) {
        return new zzdka(zzhha, zzhha2);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzdny zzc = ((zzdhu) this.zza).zzc();
        zzdny zzdny = zzc;
        return new zzdjz(zzc, (Clock) this.zzb.zzb());
    }
}
