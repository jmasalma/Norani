package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzahp implements zzau {
    public final float zza;
    public final int zzb;

    public zzahp(float f, int i) {
        this.zza = f;
        this.zzb = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzahp zzahp = (zzahp) obj;
            return this.zza == zzahp.zza && this.zzb == zzahp.zzb;
        }
    }

    public final int hashCode() {
        return ((Float.floatToIntBits(this.zza) + 527) * 31) + this.zzb;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.zza + ", svcTemporalLayerCount=" + this.zzb;
    }

    public final /* synthetic */ void zza(zzar zzar) {
    }
}
