package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzgak extends zzgab implements Serializable {
    final zzgab zza;

    zzgak(zzgab zzgab) {
        zzgab zzgab2 = zzgab;
        this.zza = zzgab;
    }

    public final int compare(Object obj, Object obj2) {
        return this.zza.compare(obj2, obj);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzgak) {
            return this.zza.equals(((zzgak) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return -this.zza.hashCode();
    }

    public final String toString() {
        return this.zza.toString().concat(".reverse()");
    }
}
