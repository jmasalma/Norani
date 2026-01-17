package com.google.android.gms.internal.ads;

import android.util.Pair;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public abstract class zzbl {
    public static final zzbl zza = new zzbi();

    static {
        String str = zzex.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
    }

    protected zzbl() {
    }

    public final boolean equals(Object obj) {
        int zzh;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzbl)) {
            return false;
        }
        zzbl zzbl = (zzbl) obj;
        if (zzbl.zzc() == zzc() && zzbl.zzb() == zzb()) {
            zzbk zzbk = new zzbk();
            zzbj zzbj = new zzbj();
            zzbk zzbk2 = new zzbk();
            zzbj zzbj2 = new zzbj();
            for (int i = 0; i < zzc(); i++) {
                if (!zze(i, zzbk, 0).equals(zzbl.zze(i, zzbk2, 0))) {
                    return false;
                }
            }
            for (int i2 = 0; i2 < zzb(); i2++) {
                if (!zzd(i2, zzbj, true).equals(zzbl.zzd(i2, zzbj2, true))) {
                    return false;
                }
            }
            int zzg = zzg(true);
            if (zzg == zzbl.zzg(true) && (zzh = zzh(true)) == zzbl.zzh(true)) {
                while (zzg != zzh) {
                    int zzj = zzj(zzg, 0, true);
                    if (zzj != zzbl.zzj(zzg, 0, true)) {
                        return false;
                    }
                    zzg = zzj;
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        zzbk zzbk = new zzbk();
        zzbj zzbj = new zzbj();
        int zzc = zzc() + 217;
        int i2 = 0;
        while (true) {
            i = zzc * 31;
            if (i2 >= zzc()) {
                break;
            }
            zzc = i + zze(i2, zzbk, 0).hashCode();
            i2++;
        }
        int zzb = i + zzb();
        for (int i3 = 0; i3 < zzb(); i3++) {
            zzb = (zzb * 31) + zzd(i3, zzbj, true).hashCode();
        }
        int zzg = zzg(true);
        while (zzg != -1) {
            zzb = (zzb * 31) + zzg;
            zzg = zzj(zzg, 0, true);
        }
        return zzb;
    }

    public abstract int zza(Object obj);

    public abstract int zzb();

    public abstract int zzc();

    public abstract zzbj zzd(int i, zzbj zzbj, boolean z);

    public abstract zzbk zze(int i, zzbk zzbk, long j);

    public abstract Object zzf(int i);

    public int zzg(boolean z) {
        return zzo() ? -1 : 0;
    }

    public int zzh(boolean z) {
        if (zzo()) {
            return -1;
        }
        return zzc() - 1;
    }

    public final int zzi(int i, zzbj zzbj, zzbk zzbk, int i2, boolean z) {
        int i3 = zzd(i, zzbj, false).zzc;
        if (zze(i3, zzbk, 0).zzo != i) {
            return i + 1;
        }
        int zzj = zzj(i3, i2, z);
        if (zzj == -1) {
            return -1;
        }
        return zze(zzj, zzbk, 0).zzn;
    }

    public int zzj(int i, int i2, boolean z) {
        if (i2 != 0) {
            if (i2 == 1) {
                return i;
            }
            if (i2 == 2) {
                return i == zzh(z) ? zzg(z) : i + 1;
            }
            throw new IllegalStateException();
        } else if (i == zzh(z)) {
            return -1;
        } else {
            return i + 1;
        }
    }

    public int zzk(int i, int i2, boolean z) {
        if (i == zzg(false)) {
            return -1;
        }
        return i - 1;
    }

    public final Pair zzl(zzbk zzbk, zzbj zzbj, int i, long j) {
        Pair zzm = zzm(zzbk, zzbj, i, j, 0);
        zzm.getClass();
        Pair pair = zzm;
        return zzm;
    }

    public final Pair zzm(zzbk zzbk, zzbj zzbj, int i, long j, long j2) {
        zzdd.zza(i, 0, zzc());
        zze(i, zzbk, j2);
        if (j == -9223372036854775807L) {
            long j3 = zzbk.zzl;
            j = 0;
        }
        int i2 = zzbk.zzn;
        zzd(i2, zzbj, false);
        while (i2 < zzbk.zzo) {
            long j4 = zzbj.zze;
            int i3 = (j > 0 ? 1 : (j == 0 ? 0 : -1));
            if (i3 == 0) {
                break;
            }
            int i4 = i2 + 1;
            long j5 = zzd(i4, zzbj, false).zze;
            if (i3 < 0) {
                break;
            }
            i2 = i4;
        }
        zzd(i2, zzbj, true);
        long j6 = zzbj.zze;
        long j7 = zzbj.zzd;
        if (j7 != -9223372036854775807L) {
            j = Math.min(j, j7 - 1);
        }
        long max = Math.max(0, j);
        Object obj = zzbj.zzb;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(max));
    }

    public zzbj zzn(Object obj, zzbj zzbj) {
        return zzd(zza(obj), zzbj, true);
    }

    public final boolean zzo() {
        return zzc() == 0;
    }
}
