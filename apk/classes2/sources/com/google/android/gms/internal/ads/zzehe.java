package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzehe implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;
    private final zzhha zzc;

    private zzehe(zzhha zzhha, zzhha zzhha2, zzhha zzhha3) {
        this.zza = zzhha;
        this.zzb = zzhha2;
        this.zzc = zzhha3;
    }

    public static zzehe zzc(zzhha zzhha, zzhha zzhha2, zzhha zzhha3) {
        return new zzehe(zzhha, zzhha2, zzhha3);
    }

    /* renamed from: zza */
    public final zzehd zzb() {
        return new zzehd((zzfdo) this.zza.zzb(), (zzdpw) this.zzb.zzb(), (zzdsj) this.zzc.zzb());
    }
}
