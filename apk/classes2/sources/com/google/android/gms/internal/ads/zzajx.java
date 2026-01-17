package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzajx implements zzakc {
    private final zzaeg zza;
    private final zzaef zzb;
    private long zzc = -1;
    private long zzd = -1;

    public zzajx(zzaeg zzaeg, zzaef zzaef) {
        this.zza = zzaeg;
        this.zzb = zzaef;
    }

    public final void zza(long j) {
        this.zzc = j;
    }

    public final long zzd(zzadw zzadw) {
        long j = this.zzd;
        if (j < 0) {
            return -1;
        }
        this.zzd = -1;
        return -(j + 2);
    }

    public final zzaeu zze() {
        zzdd.zzf(this.zzc != -1);
        return new zzaee(this.zza, this.zzc);
    }

    public final void zzg(long j) {
        long[] jArr = this.zzb.zza;
        this.zzd = jArr[zzex.zzd(jArr, j, true, true)];
    }
}
