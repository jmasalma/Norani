package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdrl implements zzfhb {
    private final Map zza;
    private final zzbcc zzb;

    zzdrl(zzbcc zzbcc, Map map) {
        this.zza = map;
        this.zzb = zzbcc;
    }

    public final void zzd(zzfgu zzfgu, String str) {
        Map map = this.zza;
        if (map.containsKey(zzfgu)) {
            this.zzb.zzc(((zzdrk) map.get(zzfgu)).zzb);
        }
    }

    public final void zzdE(zzfgu zzfgu, String str) {
    }

    public final void zzdF(zzfgu zzfgu, String str, Throwable th) {
        Map map = this.zza;
        if (map.containsKey(zzfgu)) {
            this.zzb.zzc(((zzdrk) map.get(zzfgu)).zzc);
        }
    }

    public final void zzdG(zzfgu zzfgu, String str) {
        Map map = this.zza;
        if (map.containsKey(zzfgu)) {
            this.zzb.zzc(((zzdrk) map.get(zzfgu)).zza);
        }
    }
}
