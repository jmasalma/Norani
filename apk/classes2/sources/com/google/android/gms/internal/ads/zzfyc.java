package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzfyc extends zzfyf {
    zzfyc() {
        super((zzfye) null);
    }

    static final zzfyf zzf(int i) {
        return i < 0 ? zzfyf.zzb : i > 0 ? zzfyf.zzc : zzfyf.zza;
    }

    public final int zza() {
        return 0;
    }

    public final zzfyf zzb(int i, int i2) {
        return zzf(Integer.compare(i, i2));
    }

    public final zzfyf zzc(Object obj, Object obj2, Comparator comparator) {
        return zzf(comparator.compare(obj, obj2));
    }

    public final zzfyf zzd(boolean z, boolean z2) {
        return zzf(Boolean.compare(z, z2));
    }

    public final zzfyf zze(boolean z, boolean z2) {
        return zzf(Boolean.compare(z2, z));
    }
}
