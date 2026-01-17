package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzclf implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;

    private zzclf(zzhha zzhha, zzhha zzhha2) {
        this.zza = zzhha;
        this.zzb = zzhha2;
    }

    public static zzclf zzc(zzhha zzhha, zzhha zzhha2) {
        return new zzclf(zzhha, zzhha2);
    }

    /* renamed from: zza */
    public final zzcle zzb() {
        Map zzd = ((zzhgv) this.zza).zzb();
        Map map = zzd;
        Map zzd2 = ((zzhgv) this.zzb).zzb();
        Map map2 = zzd2;
        return new zzcle(zzd, zzd2);
    }
}
