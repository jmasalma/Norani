package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzaii {
    public final zzaen zza;
    public final long zzb;
    public final long zzc;
    public final int zzd;
    public final int zze;
    public final long[] zzf;

    private zzaii(zzaen zzaen, long j, long j2, long[] jArr, int i, int i2) {
        this.zza = new zzaen(zzaen);
        this.zzb = j;
        this.zzc = j2;
        this.zzf = jArr;
        this.zzd = i;
        this.zze = i2;
    }

    public static zzaii zzb(zzaen zzaen, zzen zzen) {
        long[] jArr;
        int i;
        int i2;
        int zzg = zzen.zzg();
        int zzp = (zzg & 1) != 0 ? zzen.zzp() : -1;
        long zzu = (zzg & 2) != 0 ? zzen.zzu() : -1;
        if ((zzg & 4) == 4) {
            long[] jArr2 = new long[100];
            for (int i3 = 0; i3 < 100; i3++) {
                jArr2[i3] = (long) zzen.zzm();
            }
            jArr = jArr2;
        } else {
            jArr = null;
        }
        if ((zzg & 8) != 0) {
            zzen.zzM(4);
        }
        if (zzen.zza() >= 24) {
            zzen.zzM(21);
            int zzo = zzen.zzo();
            i = zzo & 4095;
            i2 = zzo >> 12;
        } else {
            i2 = -1;
            i = -1;
        }
        return new zzaii(zzaen, (long) zzp, zzu, jArr, i2, i);
    }

    public final long zza() {
        long j = this.zzb;
        if (j == -1 || j == 0) {
            return -9223372036854775807L;
        }
        zzaen zzaen = this.zza;
        return zzex.zzt((j * ((long) zzaen.zzg)) - 1, zzaen.zzd);
    }
}
