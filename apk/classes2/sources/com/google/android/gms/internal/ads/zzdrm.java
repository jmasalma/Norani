package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdrm implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;

    private zzdrm(zzhha zzhha, zzhha zzhha2) {
        this.zza = zzhha;
        this.zzb = zzhha2;
    }

    public static zzdrm zzc(zzhha zzhha, zzhha zzhha2) {
        return new zzdrm(zzhha, zzhha2);
    }

    /* renamed from: zza */
    public final zzdrl zzb() {
        Map zzd = ((zzhgv) this.zzb).zzb();
        Map map = zzd;
        return new zzdrl((zzbcc) this.zza.zzb(), zzd);
    }
}
