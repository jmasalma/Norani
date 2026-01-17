package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public class zzadk implements zzaeu {
    private final long zza;
    private final long zzb;
    private final int zzc;
    private final long zzd;
    private final int zze;
    private final long zzf;

    public zzadk(long j, long j2, int i, int i2, boolean z) {
        long zzc2;
        this.zza = j;
        this.zzb = j2;
        this.zzc = i2 == -1 ? 1 : i2;
        this.zze = i;
        if (j == -1) {
            this.zzd = -1;
            zzc2 = -9223372036854775807L;
        } else {
            this.zzd = j - j2;
            zzc2 = zzc(j, j2, i);
        }
        this.zzf = zzc2;
    }

    private static long zzc(long j, long j2, int i) {
        return (Math.max(0, j - j2) * 8000000) / ((long) i);
    }

    public final long zza() {
        return this.zzf;
    }

    public final long zzb(long j) {
        return zzc(j, this.zzb, this.zze);
    }

    public final zzaes zzg(long j) {
        long j2 = this.zzd;
        int i = (j2 > -1 ? 1 : (j2 == -1 ? 0 : -1));
        if (i != 0) {
            long j3 = (long) this.zzc;
            long j4 = (((((long) this.zze) * j) / 8000000) / j3) * j3;
            if (i != 0) {
                j4 = Math.min(j4, j2 - j3);
            }
            long max = this.zzb + Math.max(j4, 0);
            long zzb2 = zzb(max);
            zzaev zzaev = new zzaev(zzb2, max);
            if (i != 0 && zzb2 < j) {
                long j5 = max + j3;
                if (j5 < this.zza) {
                    return new zzaes(zzaev, new zzaev(zzb(j5), j5));
                }
            }
            return new zzaes(zzaev, zzaev);
        }
        zzaev zzaev2 = new zzaev(0, this.zzb);
        return new zzaes(zzaev2, zzaev2);
    }

    public final boolean zzh() {
        return this.zzd != -1;
    }
}
