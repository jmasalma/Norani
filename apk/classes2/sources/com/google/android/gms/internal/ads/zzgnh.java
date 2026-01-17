package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzgnh {
    public static final zzgnh zza = new zzgnf().zza();
    private final Map zzb;

    /* synthetic */ zzgnh(Map map, zzgng zzgng) {
        this.zzb = map;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgnh)) {
            return false;
        }
        return this.zzb.equals(((zzgnh) obj).zzb);
    }

    public final int hashCode() {
        return this.zzb.hashCode();
    }

    public final String toString() {
        return this.zzb.toString();
    }

    public final boolean zza() {
        return this.zzb.isEmpty();
    }
}
