package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzxh implements zzvf, zzve {
    private final zzvf zza;
    private final long zzb;
    private zzve zzc;

    public zzxh(zzvf zzvf, long j) {
        this.zza = zzvf;
        this.zzb = j;
    }

    public final long zza(long j, zzmi zzmi) {
        long j2 = this.zzb;
        return this.zza.zza(j - j2, zzmi) + j2;
    }

    public final long zzb() {
        long zzb2 = this.zza.zzb();
        if (zzb2 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return zzb2 + this.zzb;
    }

    public final long zzc() {
        long zzc2 = this.zza.zzc();
        if (zzc2 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return zzc2 + this.zzb;
    }

    public final long zzd() {
        long zzd = this.zza.zzd();
        if (zzd == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return zzd + this.zzb;
    }

    public final long zze(long j) {
        long j2 = this.zzb;
        return this.zza.zze(j - j2) + j2;
    }

    public final long zzf(zzyw[] zzywArr, boolean[] zArr, zzwz[] zzwzArr, boolean[] zArr2, long j) {
        zzwz[] zzwzArr2 = zzwzArr;
        zzwz[] zzwzArr3 = new zzwz[zzwzArr2.length];
        int i = 0;
        while (true) {
            zzwz zzwz = null;
            if (i >= zzwzArr2.length) {
                break;
            }
            zzxg zzxg = (zzxg) zzwzArr2[i];
            if (zzxg != null) {
                zzwz = zzxg.zzc();
            }
            zzwzArr3[i] = zzwz;
            i++;
        }
        zzvf zzvf = this.zza;
        long j2 = this.zzb;
        long zzf = zzvf.zzf(zzywArr, zArr, zzwzArr3, zArr2, j - j2);
        for (int i2 = 0; i2 < zzwzArr2.length; i2++) {
            zzwz zzwz2 = zzwzArr3[i2];
            if (zzwz2 == null) {
                zzwzArr2[i2] = null;
            } else {
                zzwz zzwz3 = zzwzArr2[i2];
                if (zzwz3 == null || ((zzxg) zzwz3).zzc() != zzwz2) {
                    zzwzArr2[i2] = new zzxg(zzwz2, j2);
                }
            }
        }
        return zzf + j2;
    }

    public final zzxk zzg() {
        return this.zza.zzg();
    }

    public final void zzh(long j, boolean z) {
        this.zza.zzh(j - this.zzb, false);
    }

    public final void zzi() throws IOException {
        this.zza.zzi();
    }

    public final /* bridge */ /* synthetic */ void zzj(zzxb zzxb) {
        zzvf zzvf = (zzvf) zzxb;
        zzve zzve = this.zzc;
        zzve.getClass();
        zzve zzve2 = zzve;
        zzve.zzj(this);
    }

    public final void zzk(zzve zzve, long j) {
        this.zzc = zzve;
        this.zza.zzk(this, j - this.zzb);
    }

    public final void zzm(long j) {
        this.zza.zzm(j - this.zzb);
    }

    public final zzvf zzn() {
        return this.zza;
    }

    public final boolean zzo(zzla zzla) {
        long j = zzla.zza;
        long j2 = this.zzb;
        zzky zza2 = zzla.zza();
        zza2.zze(j - j2);
        return this.zza.zzo(zza2.zzg());
    }

    public final boolean zzp() {
        return this.zza.zzp();
    }

    public final void zzl(zzvf zzvf) {
        zzve zzve = this.zzc;
        zzve.getClass();
        zzve zzve2 = zzve;
        zzve.zzl(this);
    }
}
