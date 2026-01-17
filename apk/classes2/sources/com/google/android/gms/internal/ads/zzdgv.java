package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdgv implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;
    private final zzhha zzc;
    private final zzhha zzd;
    private final zzhha zze;

    private zzdgv(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4, zzhha zzhha5) {
        this.zza = zzhha;
        this.zzb = zzhha2;
        this.zzc = zzhha3;
        this.zzd = zzhha4;
        this.zze = zzhha5;
    }

    public static zzdgv zza(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4, zzhha zzhha5) {
        return new zzdgv(zzhha, zzhha2, zzhha3, zzhha4, zzhha5);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Map zzd2 = ((zzhgv) this.zza).zzb();
        Map map = zzd2;
        Map zzd3 = ((zzhgv) this.zzb).zzb();
        Map map2 = zzd3;
        Map zzd4 = ((zzhgv) this.zzc).zzb();
        Map map3 = zzd4;
        zzdje zzc2 = ((zzdgz) this.zze).zzc();
        zzdje zzdje = zzc2;
        return new zzdgu(zzd2, zzd3, zzd4, this.zzd, zzc2);
    }
}
