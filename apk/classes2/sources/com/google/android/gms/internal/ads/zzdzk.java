package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdzk implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;

    private zzdzk(zzhha zzhha, zzhha zzhha2, zzhha zzhha3) {
        this.zza = zzhha2;
        this.zzb = zzhha3;
    }

    public static zzdzk zzc(zzhha zzhha, zzhha zzhha2, zzhha zzhha3) {
        return new zzdzk(zzhha, zzhha2, zzhha3);
    }

    /* renamed from: zza */
    public final zzdzj zzb() {
        zzgdy zzc = zzffu.zzc();
        zzgdy zzgdy = zzc;
        zzdyo zza2 = ((zzdyp) this.zza).zzb();
        zzdyo zzdyo = zza2;
        return new zzdzj(zzc, zza2, zzhgq.zza(this.zzb));
    }
}
