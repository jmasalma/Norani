package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdwv implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;

    private zzdwv(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4) {
        this.zza = zzhha3;
        this.zzb = zzhha4;
    }

    public static zzdwv zzc(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4) {
        return new zzdwv(zzhha, zzhha2, zzhha3, zzhha4);
    }

    /* renamed from: zza */
    public final zzdwu zzb() {
        zzgdy zzc = zzfga.zzc();
        zzgdy zzgdy = zzc;
        zzgdy zzc2 = zzffu.zzc();
        zzgdy zzgdy2 = zzc2;
        zzdye zzc3 = ((zzdxi) this.zza).zzb();
        zzdye zzdye = zzc3;
        return new zzdwu(zzc, zzc2, zzc3, zzhgq.zza(this.zzb));
    }
}
