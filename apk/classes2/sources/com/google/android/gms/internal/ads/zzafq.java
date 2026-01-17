package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;
import kotlin.io.ConstantsKt;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzafq {
    private final zzafp zza;
    private final zzafb zzb;
    private final int zzc;
    private final int zzd;
    private final long zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private long zzl;
    private long[] zzm;
    private int[] zzn;

    public zzafq(int i, zzafp zzafp, zzafb zzafb) {
        this.zza = zzafp;
        int zzb2 = zzafp.zzb();
        boolean z = true;
        if (zzb2 != 1) {
            if (zzb2 == 2) {
                zzb2 = 2;
            } else {
                z = false;
            }
        }
        zzdd.zzd(z);
        this.zzc = zzh(i, zzb2 == 2 ? 1667497984 : 1651965952);
        this.zze = zzafp.zzc();
        this.zzb = zzafb;
        this.zzd = zzb2 == 2 ? zzh(i, 1650720768) : -1;
        this.zzl = -1;
        this.zzm = new long[ConstantsKt.MINIMUM_BLOCK_SIZE];
        this.zzn = new int[ConstantsKt.MINIMUM_BLOCK_SIZE];
        this.zzf = zzafp.zzd;
    }

    private static int zzh(int i, int i2) {
        return (((i % 10) + 48) << 8) | ((i / 10) + 48) | i2;
    }

    private final long zzi(int i) {
        return (this.zze * ((long) i)) / ((long) this.zzf);
    }

    private final zzaev zzj(int i) {
        return new zzaev(((long) this.zzn[i]) * zzi(1), this.zzm[i]);
    }

    public final zzaes zza(long j) {
        if (this.zzk != 0) {
            int zzi2 = (int) (j / zzi(1));
            int zzc2 = zzex.zzc(this.zzn, zzi2, true, true);
            if (this.zzn[zzc2] == zzi2) {
                zzaev zzj2 = zzj(zzc2);
                return new zzaes(zzj2, zzj2);
            }
            zzaev zzj3 = zzj(zzc2);
            int i = zzc2 + 1;
            if (i < this.zzm.length) {
                return new zzaes(zzj3, zzj(i));
            }
            return new zzaes(zzj3, zzj3);
        }
        zzaev zzaev = new zzaev(0, this.zzl);
        return new zzaes(zzaev, zzaev);
    }

    public final void zzb(long j, boolean z) {
        if (this.zzl == -1) {
            this.zzl = j;
        }
        if (z) {
            if (this.zzk == this.zzn.length) {
                long[] jArr = this.zzm;
                this.zzm = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
                int[] iArr = this.zzn;
                this.zzn = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
            }
            long[] jArr2 = this.zzm;
            int i = this.zzk;
            jArr2[i] = j;
            this.zzn[i] = this.zzj;
            this.zzk = i + 1;
        }
        this.zzj++;
    }

    public final void zzc() {
        int i;
        this.zzm = Arrays.copyOf(this.zzm, this.zzk);
        this.zzn = Arrays.copyOf(this.zzn, this.zzk);
        if ((this.zzc & 1651965952) == 1651965952 && this.zza.zzf != 0 && (i = this.zzk) > 0) {
            this.zzf = i;
        }
    }

    public final void zzd(int i) {
        this.zzg = i;
        this.zzh = i;
    }

    public final void zze(long j) {
        if (this.zzk == 0) {
            this.zzi = 0;
            return;
        }
        this.zzi = this.zzn[zzex.zzd(this.zzm, j, true, true)];
    }

    public final boolean zzf(int i) {
        return this.zzc == i || this.zzd == i;
    }

    public final boolean zzg(zzadw zzadw) throws IOException {
        int i = this.zzh;
        zzafb zzafb = this.zzb;
        int zzf2 = i - zzafb.zzf(zzadw, i, false);
        this.zzh = zzf2;
        boolean z = zzf2 == 0;
        if (z) {
            if (this.zzg > 0) {
                zzafb.zzt(zzi(this.zzi), Arrays.binarySearch(this.zzn, this.zzi) >= 0 ? 1 : 0, this.zzg, 0, (zzafa) null);
            }
            this.zzi++;
        }
        return z;
    }
}
