package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzcpv implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;
    private final zzhha zzc;

    private zzcpv(zzhha zzhha, zzhha zzhha2, zzhha zzhha3) {
        this.zza = zzhha;
        this.zzb = zzhha2;
        this.zzc = zzhha3;
    }

    public static zzcpv zzc(zzhha zzhha, zzhha zzhha2, zzhha zzhha3) {
        return new zzcpv(zzhha, zzhha2, zzhha3);
    }

    /* renamed from: zza */
    public final zzcpu zzb() {
        zzcfg zza2 = ((zzcpq) this.zza).zza();
        zzcfg zzcfg = zza2;
        zzfca zzc2 = ((zzcrr) this.zzc).zzc();
        zzfca zzfca = zzc2;
        return new zzcpu(zza2, (zzdsj) this.zzb.zzb(), zzc2);
    }
}
