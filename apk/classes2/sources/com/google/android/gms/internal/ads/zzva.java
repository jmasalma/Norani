package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzva extends zzuv {
    public static final Object zzc = new Object();
    private final Object zzd;
    /* access modifiers changed from: private */
    public final Object zze;

    private zzva(zzbl zzbl, Object obj, Object obj2) {
        super(zzbl);
        this.zzd = obj;
        this.zze = obj2;
    }

    public static zzva zzq(zzap zzap) {
        return new zzva(new zzvb(zzap), zzbk.zza, zzc);
    }

    public static zzva zzr(zzbl zzbl, Object obj, Object obj2) {
        return new zzva(zzbl, obj, obj2);
    }

    public final int zza(Object obj) {
        Object obj2;
        if (zzc.equals(obj) && (obj2 = this.zze) != null) {
            obj = obj2;
        }
        return this.zzb.zza(obj);
    }

    public final zzbj zzd(int i, zzbj zzbj, boolean z) {
        this.zzb.zzd(i, zzbj, z);
        if (Objects.equals(zzbj.zzb, this.zze) && z) {
            zzbj.zzb = zzc;
        }
        return zzbj;
    }

    public final zzbk zze(int i, zzbk zzbk, long j) {
        this.zzb.zze(i, zzbk, j);
        if (Objects.equals(zzbk.zzb, this.zzd)) {
            zzbk.zzb = zzbk.zza;
        }
        return zzbk;
    }

    public final Object zzf(int i) {
        Object zzf = this.zzb.zzf(i);
        return Objects.equals(zzf, this.zze) ? zzc : zzf;
    }

    public final zzva zzp(zzbl zzbl) {
        return new zzva(zzbl, this.zzd, this.zze);
    }
}
