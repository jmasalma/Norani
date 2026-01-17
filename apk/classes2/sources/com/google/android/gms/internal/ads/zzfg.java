package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzfg implements zzau {
    public final float zza;
    public final float zzb;

    public zzfg(float f, float f2) {
        boolean z = false;
        if (f >= -90.0f && f <= 90.0f && f2 >= -180.0f && f2 <= 180.0f) {
            z = true;
        }
        zzdd.zze(z, "Invalid latitude or longitude");
        this.zza = f;
        this.zzb = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzfg zzfg = (zzfg) obj;
            return this.zza == zzfg.zza && this.zzb == zzfg.zzb;
        }
    }

    public final int hashCode() {
        return ((Float.floatToIntBits(this.zza) + 527) * 31) + Float.floatToIntBits(this.zzb);
    }

    public final String toString() {
        return "xyz: latitude=" + this.zza + ", longitude=" + this.zzb;
    }

    public final /* synthetic */ void zza(zzar zzar) {
    }
}
