package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdlo implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;
    private final zzhha zzc;

    private zzdlo(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4) {
        this.zza = zzhha2;
        this.zzb = zzhha3;
        this.zzc = zzhha4;
    }

    public static zzdlo zzc(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4) {
        return new zzdlo(zzhha, zzhha2, zzhha3, zzhha4);
    }

    /* renamed from: zza */
    public final zzdln zzb() {
        zzgdy zzc2 = zzffu.zzc();
        zzgdy zzgdy = zzc2;
        zzdmc zza2 = ((zzdmd) this.zza).zzb();
        zzdmc zzdmc = zza2;
        zzdmh zza3 = ((zzdmi) this.zzb).zzb();
        zzdmh zzdmh = zza3;
        return new zzdln(zzc2, zza2, zza3, (zzdsd) this.zzc.zzb());
    }
}
