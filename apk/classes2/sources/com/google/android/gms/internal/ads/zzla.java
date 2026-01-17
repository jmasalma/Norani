package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzla {
    public final long zza;
    public final float zzb;
    public final long zzc;

    /* synthetic */ zzla(zzky zzky, zzkz zzkz) {
        this.zza = zzky.zza;
        this.zzb = zzky.zzb;
        this.zzc = zzky.zzc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzla)) {
            return false;
        }
        zzla zzla = (zzla) obj;
        return this.zza == zzla.zza && this.zzb == zzla.zzb && this.zzc == zzla.zzc;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Long.valueOf(this.zza), Float.valueOf(this.zzb), Long.valueOf(this.zzc)});
    }

    public final zzky zza() {
        return new zzky(this, (zzkz) null);
    }
}
