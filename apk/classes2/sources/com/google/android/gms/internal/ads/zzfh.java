package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzfh implements zzau {
    public final long zza;
    public final long zzb;
    public final long zzc;

    public zzfh(long j, long j2, long j3) {
        this.zza = j;
        this.zzb = j2;
        this.zzc = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzfh)) {
            return false;
        }
        zzfh zzfh = (zzfh) obj;
        return this.zza == zzfh.zza && this.zzb == zzfh.zzb && this.zzc == zzfh.zzc;
    }

    public final int hashCode() {
        long j = this.zza;
        long j2 = this.zzb;
        return ((((((int) (j ^ (j >>> 32))) + 527) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31) + ((int) this.zzc);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.zza + ", modification time=" + this.zzb + ", timescale=" + this.zzc;
    }

    public final /* synthetic */ void zza(zzar zzar) {
    }
}
