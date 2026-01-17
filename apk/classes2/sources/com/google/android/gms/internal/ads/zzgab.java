package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public abstract class zzgab implements Comparator {
    protected zzgab() {
    }

    public static zzgab zzb(Comparator comparator) {
        return new zzfyb(comparator);
    }

    public static zzgab zzc() {
        return zzfzz.zza;
    }

    public abstract int compare(Object obj, Object obj2);

    public zzgab zza() {
        return new zzgak(this);
    }

    public final zzgab zzd(zzfve zzfve) {
        return new zzfxm(zzfve, this);
    }
}
