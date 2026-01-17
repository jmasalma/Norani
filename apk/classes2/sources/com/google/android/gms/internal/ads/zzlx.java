package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzlx extends zzuv {
    private final zzbk zzc = new zzbk();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzlx(zzly zzly, zzbl zzbl) {
        super(zzbl);
        Objects.requireNonNull(zzly);
    }

    public final zzbj zzd(int i, zzbj zzbj, boolean z) {
        zzbl zzbl = this.zzb;
        zzbj zzd = zzbl.zzd(i, zzbj, z);
        if (zzbl.zze(zzd.zzc, this.zzc, 0).zzb()) {
            Object obj = zzbj.zza;
            Object obj2 = zzbj.zzb;
            int i2 = zzbj.zzc;
            long j = zzbj.zzd;
            long j2 = zzbj.zze;
            zzd.zzi(obj, obj2, i2, j, 0, zzb.zza, true);
        } else {
            zzd.zzf = true;
        }
        return zzd;
    }
}
