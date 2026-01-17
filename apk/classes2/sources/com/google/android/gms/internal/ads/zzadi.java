package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzadi implements zzaeu {
    public final int zza;
    public final int[] zzb;
    public final long[] zzc;
    public final long[] zzd;
    public final long[] zze;
    private final long zzf;

    public zzadi(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.zzb = iArr;
        this.zzc = jArr;
        this.zzd = jArr2;
        this.zze = jArr3;
        int length = iArr.length;
        this.zza = length;
        if (length > 0) {
            int i = length - 1;
            this.zzf = jArr2[i] + jArr3[i];
            return;
        }
        this.zzf = 0;
    }

    public final String toString() {
        long[] jArr = this.zzd;
        long[] jArr2 = this.zze;
        long[] jArr3 = this.zzc;
        String arrays = Arrays.toString(this.zzb);
        String arrays2 = Arrays.toString(jArr3);
        String arrays3 = Arrays.toString(jArr2);
        String arrays4 = Arrays.toString(jArr);
        return "ChunkIndex(length=" + this.zza + ", sizes=" + arrays + ", offsets=" + arrays2 + ", timeUs=" + arrays3 + ", durationsUs=" + arrays4 + ")";
    }

    public final long zza() {
        return this.zzf;
    }

    public final zzaes zzg(long j) {
        long[] jArr = this.zze;
        int zzd2 = zzex.zzd(jArr, j, true, true);
        long j2 = jArr[zzd2];
        long[] jArr2 = this.zzc;
        zzaev zzaev = new zzaev(j2, jArr2[zzd2]);
        if (zzaev.zzb >= j || zzd2 == this.zza - 1) {
            return new zzaes(zzaev, zzaev);
        }
        int i = zzd2 + 1;
        return new zzaes(zzaev, new zzaev(jArr[i], jArr2[i]));
    }

    public final boolean zzh() {
        return true;
    }
}
