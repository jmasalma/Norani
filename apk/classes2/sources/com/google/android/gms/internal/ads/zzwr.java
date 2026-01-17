package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzwr implements zzzg {
    public long zza;
    public long zzb;
    public zzzf zzc;
    public zzwr zzd;

    public zzwr(long j, int i) {
        zze(j, 65536);
    }

    public final int zza(long j) {
        long j2 = j - this.zza;
        int i = this.zzc.zzb;
        return (int) j2;
    }

    public final zzwr zzb() {
        this.zzc = null;
        zzwr zzwr = this.zzd;
        this.zzd = null;
        return zzwr;
    }

    public final zzzg zzd() {
        zzwr zzwr = this.zzd;
        if (zzwr == null || zzwr.zzc == null) {
            return null;
        }
        return zzwr;
    }

    public final void zze(long j, int i) {
        zzdd.zzf(this.zzc == null);
        this.zza = j;
        this.zzb = j + 65536;
    }

    public final zzzf zzc() {
        zzzf zzzf = this.zzc;
        zzzf.getClass();
        zzzf zzzf2 = zzzf;
        return zzzf;
    }
}
