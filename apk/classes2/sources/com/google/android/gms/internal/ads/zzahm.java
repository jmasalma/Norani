package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzahm implements zzau {
    public final long zza;
    public final long zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;

    public zzahm(long j, long j2, long j3, long j4, long j5) {
        this.zza = j;
        this.zzb = j2;
        this.zzc = j3;
        this.zzd = j4;
        this.zze = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzahm zzahm = (zzahm) obj;
            return this.zza == zzahm.zza && this.zzb == zzahm.zzb && this.zzc == zzahm.zzc && this.zzd == zzahm.zzd && this.zze == zzahm.zze;
        }
    }

    public final int hashCode() {
        long j = this.zza;
        long j2 = this.zze;
        long j3 = this.zzd;
        long j4 = this.zzc;
        long j5 = this.zzb;
        return ((((((((((int) (j ^ (j >>> 32))) + 527) * 31) + ((int) ((j5 >>> 32) ^ j5))) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.zza + ", photoSize=" + this.zzb + ", photoPresentationTimestampUs=" + this.zzc + ", videoStartPosition=" + this.zzd + ", videoSize=" + this.zze;
    }

    public final /* synthetic */ void zza(zzar zzar) {
    }
}
