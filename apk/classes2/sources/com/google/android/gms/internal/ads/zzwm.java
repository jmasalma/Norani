package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzwm extends zzuv {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzwm(zzwq zzwq, zzbl zzbl) {
        super(zzbl);
        Objects.requireNonNull(zzwq);
    }

    public final zzbj zzd(int i, zzbj zzbj, boolean z) {
        this.zzb.zzd(i, zzbj, z);
        zzbj.zzf = true;
        return zzbj;
    }

    public final zzbk zze(int i, zzbk zzbk, long j) {
        this.zzb.zze(i, zzbk, j);
        zzbk.zzk = true;
        return zzbk;
    }
}
