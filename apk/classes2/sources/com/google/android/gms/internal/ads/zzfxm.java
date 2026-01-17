package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzfxm extends zzgab implements Serializable {
    final zzfve zza;
    final zzgab zzb;

    zzfxm(zzfve zzfve, zzgab zzgab) {
        zzfve zzfve2 = zzfve;
        this.zza = zzfve;
        zzgab zzgab2 = zzgab;
        this.zzb = zzgab;
    }

    public final int compare(Object obj, Object obj2) {
        zzfve zzfve = this.zza;
        return this.zzb.compare(zzfve.apply(obj), zzfve.apply(obj2));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfxm) {
            zzfxm zzfxm = (zzfxm) obj;
            return this.zza.equals(zzfxm.zza) && this.zzb.equals(zzfxm.zzb);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb});
    }

    public final String toString() {
        zzfve zzfve = this.zza;
        String obj = this.zzb.toString();
        String obj2 = zzfve.toString();
        return obj + ".onResultOf(" + obj2 + ")";
    }
}
