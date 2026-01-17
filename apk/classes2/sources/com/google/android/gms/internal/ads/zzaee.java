package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzaee implements zzaeu {
    private final zzaeg zza;
    private final long zzb;

    public zzaee(zzaeg zzaeg, long j) {
        this.zza = zzaeg;
        this.zzb = j;
    }

    private final zzaev zzb(long j, long j2) {
        return new zzaev((j * 1000000) / ((long) this.zza.zze), this.zzb + j2);
    }

    public final long zza() {
        return this.zza.zza();
    }

    public final zzaes zzg(long j) {
        long j2;
        zzaeg zzaeg = this.zza;
        zzaef zzaef = zzaeg.zzk;
        zzdd.zzb(zzaef);
        long[] jArr = zzaef.zza;
        long[] jArr2 = zzaef.zzb;
        int zzd = zzex.zzd(jArr, zzaeg.zzb(j), true, false);
        long j3 = 0;
        if (zzd == -1) {
            j2 = 0;
        } else {
            j2 = jArr[zzd];
        }
        if (zzd != -1) {
            j3 = jArr2[zzd];
        }
        zzaev zzb2 = zzb(j2, j3);
        if (zzb2.zzb == j || zzd == jArr.length - 1) {
            return new zzaes(zzb2, zzb2);
        }
        int i = zzd + 1;
        return new zzaes(zzb2, zzb(jArr[i], jArr2[i]));
    }

    public final boolean zzh() {
        return true;
    }
}
