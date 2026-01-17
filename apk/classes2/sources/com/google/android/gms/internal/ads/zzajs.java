package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzajs {
    public final zzajp zza;
    public final int zzb;
    public final long[] zzc;
    public final int[] zzd;
    public final int zze;
    public final long[] zzf;
    public final int[] zzg;
    public final long zzh;

    public zzajs(zzajp zzajp, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        int length = iArr.length;
        int length2 = jArr2.length;
        boolean z = true;
        zzdd.zzd(length == length2);
        int length3 = jArr.length;
        zzdd.zzd(length3 == length2);
        int length4 = iArr2.length;
        zzdd.zzd(length4 != length2 ? false : z);
        this.zza = zzajp;
        this.zzc = jArr;
        this.zzd = iArr;
        this.zze = i;
        this.zzf = jArr2;
        this.zzg = iArr2;
        this.zzh = j;
        this.zzb = length3;
        if (length4 > 0) {
            int i2 = length4 - 1;
            iArr2[i2] = iArr2[i2] | 536870912;
        }
    }

    public final int zza(long j) {
        for (int zzd2 = zzex.zzd(this.zzf, j, true, false); zzd2 >= 0; zzd2--) {
            if ((this.zzg[zzd2] & 1) != 0) {
                return zzd2;
            }
        }
        return -1;
    }

    public final int zzb(long j) {
        long[] jArr = this.zzf;
        for (int zza2 = zzex.zza(jArr, j, true, false); zza2 < jArr.length; zza2++) {
            if ((this.zzg[zza2] & 1) != 0) {
                return zza2;
            }
        }
        return -1;
    }
}
