package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzaoz implements zzaeu {
    private final zzaow zza;
    private final int zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;

    public zzaoz(zzaow zzaow, int i, long j, long j2) {
        this.zza = zzaow;
        this.zzb = i;
        this.zzc = j;
        long j3 = (j2 - j) / ((long) zzaow.zzd);
        this.zzd = j3;
        this.zze = zzb(j3);
    }

    private final long zzb(long j) {
        return zzex.zzu(j * ((long) this.zzb), 1000000, (long) this.zza.zzc, RoundingMode.DOWN);
    }

    public final long zza() {
        return this.zze;
    }

    public final zzaes zzg(long j) {
        zzaow zzaow = this.zza;
        long j2 = (((long) zzaow.zzc) * j) / (((long) this.zzb) * 1000000);
        String str = zzex.zza;
        long j3 = this.zzd - 1;
        long max = Math.max(0, Math.min(j2, j3));
        long j4 = (long) zzaow.zzd;
        long zzb2 = zzb(max);
        long j5 = this.zzc;
        zzaev zzaev = new zzaev(zzb2, (max * j4) + j5);
        if (zzb2 >= j || max == j3) {
            return new zzaes(zzaev, zzaev);
        }
        long j6 = max + 1;
        return new zzaes(zzaev, new zzaev(zzb(j6), j5 + (j4 * j6)));
    }

    public final boolean zzh() {
        return true;
    }
}
