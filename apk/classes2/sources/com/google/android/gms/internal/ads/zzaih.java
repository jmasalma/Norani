package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzaih implements zzaig {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;
    private final long zzd;
    private final int zze;

    private zzaih(long[] jArr, long[] jArr2, long j, long j2, long j3, int i) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = j;
        this.zzd = j3;
        this.zze = i;
    }

    public static zzaih zzb(long j, long j2, zzaen zzaen, zzen zzen) {
        long j3;
        int i;
        long j4 = j;
        zzaen zzaen2 = zzaen;
        zzen zzen2 = zzen;
        zzen2.zzM(6);
        int zzg = zzen.zzg();
        long j5 = (long) zzaen2.zzc;
        long j6 = (long) zzg;
        int zzg2 = zzen.zzg();
        if (zzg2 <= 0) {
            return null;
        }
        long zzt = zzex.zzt((((long) zzg2) * ((long) zzaen2.zzg)) - 1, zzaen2.zzd);
        int zzq = zzen.zzq();
        int zzq2 = zzen.zzq();
        int zzq3 = zzen.zzq();
        zzen2.zzM(2);
        long j7 = j2 + ((long) zzaen2.zzc);
        long[] jArr = new long[zzq];
        long[] jArr2 = new long[zzq];
        int i2 = 0;
        while (i2 < zzq) {
            jArr[i2] = (((long) i2) * zzt) / ((long) zzq);
            jArr2[i2] = j7;
            if (zzq3 == 1) {
                i = zzen.zzm();
            } else if (zzq3 == 2) {
                i = zzen.zzq();
            } else if (zzq3 == 3) {
                i = zzen.zzo();
            } else if (zzq3 != 4) {
                return null;
            } else {
                i = zzen.zzp();
            }
            j7 += ((long) i) * ((long) zzq2);
            i2++;
            long j8 = j;
            zzaen zzaen3 = zzaen;
            zzen zzen3 = zzen;
        }
        long j9 = j2 + j5;
        long j10 = j6 + j9;
        long j11 = j;
        if (!(j11 == -1 || j11 == j10)) {
            zzea.zzf("VbriSeeker", "VBRI data size mismatch: " + j11 + ", " + j10);
        }
        if (j10 != j7) {
            zzea.zzf("VbriSeeker", "VBRI bytes and ToC mismatch (using max): " + j10 + ", " + j7 + "\nSeeking will be inaccurate.");
            j3 = Math.max(j10, j7);
        } else {
            j3 = j10;
        }
        return new zzaih(jArr, jArr2, zzt, j9, j3, zzaen.zzf);
    }

    public final long zza() {
        return this.zzc;
    }

    public final int zzc() {
        return this.zze;
    }

    public final long zzd() {
        return this.zzd;
    }

    public final long zze(long j) {
        return this.zza[zzex.zzd(this.zzb, j, true, true)];
    }

    public final zzaes zzg(long j) {
        long[] jArr = this.zza;
        int zzd2 = zzex.zzd(jArr, j, true, true);
        long j2 = jArr[zzd2];
        long[] jArr2 = this.zzb;
        zzaev zzaev = new zzaev(j2, jArr2[zzd2]);
        if (zzaev.zzb >= j || zzd2 == jArr.length - 1) {
            return new zzaes(zzaev, zzaev);
        }
        int i = zzd2 + 1;
        return new zzaes(zzaev, new zzaev(jArr[i], jArr2[i]));
    }

    public final boolean zzh() {
        return true;
    }
}
