package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzaij implements zzaig {
    private final long zza;
    private final int zzb;
    private final long zzc;
    private final int zzd;
    private final long zze;
    private final long zzf;
    private final long[] zzg;

    private zzaij(long j, int i, long j2, int i2, long j3, long[] jArr) {
        this.zza = j;
        this.zzb = i;
        this.zzc = j2;
        this.zzd = i2;
        this.zze = j3;
        this.zzg = jArr;
        this.zzf = j3 != -1 ? j + j3 : -1;
    }

    public static zzaij zzb(zzaii zzaii, long j) {
        long zza2 = zzaii.zza();
        if (zza2 == -9223372036854775807L) {
            return null;
        }
        zzaen zzaen = zzaii.zza;
        return new zzaij(j, zzaen.zzc, zza2, zzaen.zzf, zzaii.zzc, zzaii.zzf);
    }

    private final long zzf(int i) {
        return (this.zzc * ((long) i)) / 100;
    }

    public final long zza() {
        return this.zzc;
    }

    public final int zzc() {
        return this.zzd;
    }

    public final long zzd() {
        return this.zzf;
    }

    public final long zze(long j) {
        long j2;
        if (!zzh()) {
            return 0;
        }
        long j3 = j - this.zza;
        if (j3 <= ((long) this.zzb)) {
            return 0;
        }
        long[] jArr = this.zzg;
        zzdd.zzb(jArr);
        double d = (((double) j3) * 256.0d) / ((double) this.zze);
        long[] jArr2 = jArr;
        int zzd2 = zzex.zzd(jArr2, (long) d, true, true);
        long zzf2 = zzf(zzd2);
        long j4 = jArr2[zzd2];
        int i = zzd2 + 1;
        long zzf3 = zzf(i);
        if (zzd2 == 99) {
            j2 = 256;
        } else {
            j2 = jArr2[i];
        }
        return zzf2 + Math.round((j4 == j2 ? 0.0d : (d - ((double) j4)) / ((double) (j2 - j4))) * ((double) (zzf3 - zzf2)));
    }

    public final zzaes zzg(long j) {
        double d;
        if (!zzh()) {
            zzaev zzaev = new zzaev(0, this.zza + ((long) this.zzb));
            return new zzaes(zzaev, zzaev);
        }
        long j2 = this.zzc;
        String str = zzex.zza;
        long max = Math.max(0, Math.min(j, j2));
        double d2 = (((double) max) * 100.0d) / ((double) j2);
        double d3 = 0.0d;
        if (d2 > 0.0d) {
            if (d2 >= 100.0d) {
                d3 = 256.0d;
            } else {
                int i = (int) d2;
                long[] jArr = this.zzg;
                zzdd.zzb(jArr);
                long[] jArr2 = jArr;
                double d4 = (double) jArr2[i];
                if (i == 99) {
                    d = 256.0d;
                } else {
                    d = (double) jArr2[i + 1];
                }
                d3 = d4 + ((d2 - ((double) i)) * (d - d4));
            }
        }
        long j3 = this.zze;
        zzaev zzaev2 = new zzaev(max, this.zza + Math.max((long) this.zzb, Math.min(Math.round((d3 / 256.0d) * ((double) j3)), j3 - 1)));
        return new zzaes(zzaev2, zzaev2);
    }

    public final boolean zzh() {
        return this.zzg != null;
    }
}
