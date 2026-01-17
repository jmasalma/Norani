package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdmi implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;

    private zzdmi(zzhha zzhha, zzhha zzhha2, zzhha zzhha3) {
        this.zza = zzhha2;
        this.zzb = zzhha3;
    }

    public static zzdmi zzc(zzhha zzhha, zzhha zzhha2, zzhha zzhha3) {
        return new zzdmi(zzhha, zzhha2, zzhha3);
    }

    /* renamed from: zza */
    public final zzdmh zzb() {
        zzdmc zza2 = ((zzdmd) this.zza).zzb();
        zzdmc zzdmc = zza2;
        return new zzdmh(zzffu.zzc(), zza2, (zzdsd) this.zzb.zzb());
    }
}
