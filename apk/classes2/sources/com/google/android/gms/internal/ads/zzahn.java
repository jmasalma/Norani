package com.google.android.gms.internal.ads;

import java.util.Locale;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzahn {
    public final long zza;
    public final long zzb;
    public final int zzc;

    public zzahn(long j, long j2, int i) {
        zzdd.zzd(j < j2);
        this.zza = j;
        this.zzb = j2;
        this.zzc = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzahn zzahn = (zzahn) obj;
            return this.zza == zzahn.zza && this.zzb == zzahn.zzb && this.zzc == zzahn.zzc;
        }
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Long.valueOf(this.zza), Long.valueOf(this.zzb), Integer.valueOf(this.zzc)});
    }

    public final String toString() {
        Object[] objArr = {Long.valueOf(this.zza), Long.valueOf(this.zzb), Integer.valueOf(this.zzc)};
        String str = zzex.zza;
        return String.format(Locale.US, "Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", objArr);
    }
}
