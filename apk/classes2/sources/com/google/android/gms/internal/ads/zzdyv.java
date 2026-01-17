package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdyv implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;

    private zzdyv(zzhha zzhha, zzhha zzhha2, zzhha zzhha3) {
        this.zza = zzhha;
        this.zzb = zzhha3;
    }

    public static zzdyv zzc(zzhha zzhha, zzhha zzhha2, zzhha zzhha3) {
        return new zzdyv(zzhha, zzhha2, zzhha3);
    }

    /* renamed from: zza */
    public final zzdyu zzb() {
        Map zzd = ((zzhgy) this.zza).zzd();
        Map map = zzd;
        zzgdy zzc = zzffu.zzc();
        zzgdy zzgdy = zzc;
        zzcyy zza2 = ((zzcyz) this.zzb).zzb();
        zzcyy zzcyy = zza2;
        return new zzdyu(zzd, zzc, zza2);
    }
}
