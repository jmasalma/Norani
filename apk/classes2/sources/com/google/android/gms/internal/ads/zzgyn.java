package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
final class zzgyn implements zzhcm {
    private final zzgym zza;

    private zzgyn(zzgym zzgym) {
        zzgzu.zzc(zzgym, "output");
        zzgym zzgym2 = zzgym;
        this.zza = zzgym;
        zzgym.zze = this;
    }

    public static zzgyn zza(zzgym zzgym) {
        zzgyn zzgyn = zzgym.zze;
        if (zzgyn != null) {
            return zzgyn;
        }
        return new zzgyn(zzgym);
    }

    public final void zzB(int i, int i2) throws IOException {
        this.zza.zzt(i, (i2 >> 31) ^ (i2 + i2));
    }

    public final void zzD(int i, long j) throws IOException {
        this.zza.zzv(i, (j >> 63) ^ (j + j));
    }

    @Deprecated
    public final void zzF(int i) throws IOException {
        this.zza.zzs(i, 3);
    }

    public final void zzG(int i, String str) throws IOException {
        this.zza.zzq(i, str);
    }

    public final void zzI(int i, int i2) throws IOException {
        this.zza.zzt(i, i2);
    }

    public final void zzK(int i, long j) throws IOException {
        this.zza.zzv(i, j);
    }

    public final void zzb(int i, boolean z) throws IOException {
        this.zza.zzM(i, z);
    }

    public final void zzd(int i, zzgxz zzgxz) throws IOException {
        this.zza.zzN(i, zzgxz);
    }

    public final void zze(int i, List list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.zza.zzN(i, (zzgxz) list.get(i2));
        }
    }

    public final void zzf(int i, double d) throws IOException {
        this.zza.zzj(i, Double.doubleToRawLongBits(d));
    }

    @Deprecated
    public final void zzh(int i) throws IOException {
        this.zza.zzs(i, 4);
    }

    public final void zzi(int i, int i2) throws IOException {
        this.zza.zzl(i, i2);
    }

    public final void zzk(int i, int i2) throws IOException {
        this.zza.zzh(i, i2);
    }

    public final void zzm(int i, long j) throws IOException {
        this.zza.zzj(i, j);
    }

    public final void zzo(int i, float f) throws IOException {
        this.zza.zzh(i, Float.floatToRawIntBits(f));
    }

    public final void zzq(int i, Object obj, zzhbl zzhbl) throws IOException {
        zzgym zzgym = this.zza;
        zzgym.zzs(i, 3);
        zzhbl.zzj((zzhas) obj, zzgym.zze);
        zzgym.zzs(i, 4);
    }

    public final void zzr(int i, int i2) throws IOException {
        this.zza.zzl(i, i2);
    }

    public final void zzt(int i, long j) throws IOException {
        this.zza.zzv(i, j);
    }

    public final void zzv(int i, Object obj, zzhbl zzhbl) throws IOException {
        this.zza.zzn(i, (zzhas) obj, zzhbl);
    }

    public final void zzw(int i, Object obj) throws IOException {
        if (obj instanceof zzgxz) {
            this.zza.zzp(i, (zzgxz) obj);
        } else {
            this.zza.zzo(i, (zzhas) obj);
        }
    }

    public final void zzx(int i, int i2) throws IOException {
        this.zza.zzh(i, i2);
    }

    public final void zzz(int i, long j) throws IOException {
        this.zza.zzj(i, j);
    }

    public final void zzH(int i, List list) throws IOException {
        int i2 = 0;
        if (list instanceof zzhae) {
            zzhae zzhae = (zzhae) list;
            while (i2 < list.size()) {
                Object zzc = zzhae.zzc();
                if (zzc instanceof String) {
                    this.zza.zzq(i, (String) zzc);
                } else {
                    this.zza.zzN(i, (zzgxz) zzc);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zzq(i, (String) list.get(i2));
            i2++;
        }
    }

    public final void zzJ(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (list instanceof zzgzi) {
            zzgzi zzgzi = (zzgzi) list;
            if (z) {
                zzgym zzgym = this.zza;
                zzgym.zzs(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < zzgzi.size(); i4++) {
                    i3 += zzgym.zzD(zzgzi.zzd(i4));
                }
                zzgym.zzu(i3);
                while (i2 < zzgzi.size()) {
                    zzgym.zzu(zzgzi.zzd(i2));
                    i2++;
                }
                return;
            }
            while (i2 < zzgzi.size()) {
                this.zza.zzt(i, zzgzi.zzd(i2));
                i2++;
            }
        } else if (z) {
            zzgym zzgym2 = this.zza;
            zzgym2.zzs(i, 2);
            int i5 = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                i5 += zzgym.zzD(((Integer) list.get(i6)).intValue());
            }
            zzgym2.zzu(i5);
            while (i2 < list.size()) {
                zzgym2.zzu(((Integer) list.get(i2)).intValue());
                i2++;
            }
        } else {
            while (i2 < list.size()) {
                this.zza.zzt(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public final void zzL(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (list instanceof zzhah) {
            zzhah zzhah = (zzhah) list;
            if (z) {
                zzgym zzgym = this.zza;
                zzgym.zzs(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < zzhah.size(); i4++) {
                    i3 += zzgym.zzE(zzhah.zza(i4));
                }
                zzgym.zzu(i3);
                while (i2 < zzhah.size()) {
                    zzgym.zzw(zzhah.zza(i2));
                    i2++;
                }
                return;
            }
            while (i2 < zzhah.size()) {
                this.zza.zzv(i, zzhah.zza(i2));
                i2++;
            }
        } else if (z) {
            zzgym zzgym2 = this.zza;
            zzgym2.zzs(i, 2);
            int i5 = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                i5 += zzgym.zzE(((Long) list.get(i6)).longValue());
            }
            zzgym2.zzu(i5);
            while (i2 < list.size()) {
                zzgym2.zzw(((Long) list.get(i2)).longValue());
                i2++;
            }
        } else {
            while (i2 < list.size()) {
                this.zza.zzv(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    public final void zzl(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (list instanceof zzgzi) {
            zzgzi zzgzi = (zzgzi) list;
            if (z) {
                zzgym zzgym = this.zza;
                zzgym.zzs(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < zzgzi.size(); i4++) {
                    zzgzi.zzd(i4);
                    i3 += 4;
                }
                zzgym.zzu(i3);
                while (i2 < zzgzi.size()) {
                    zzgym.zzi(zzgzi.zzd(i2));
                    i2++;
                }
                return;
            }
            while (i2 < zzgzi.size()) {
                this.zza.zzh(i, zzgzi.zzd(i2));
                i2++;
            }
        } else if (z) {
            zzgym zzgym2 = this.zza;
            zzgym2.zzs(i, 2);
            int i5 = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                ((Integer) list.get(i6)).intValue();
                i5 += 4;
            }
            zzgym2.zzu(i5);
            while (i2 < list.size()) {
                zzgym2.zzi(((Integer) list.get(i2)).intValue());
                i2++;
            }
        } else {
            while (i2 < list.size()) {
                this.zza.zzh(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public final void zzn(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (list instanceof zzhah) {
            zzhah zzhah = (zzhah) list;
            if (z) {
                zzgym zzgym = this.zza;
                zzgym.zzs(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < zzhah.size(); i4++) {
                    zzhah.zza(i4);
                    i3 += 8;
                }
                zzgym.zzu(i3);
                while (i2 < zzhah.size()) {
                    zzgym.zzk(zzhah.zza(i2));
                    i2++;
                }
                return;
            }
            while (i2 < zzhah.size()) {
                this.zza.zzj(i, zzhah.zza(i2));
                i2++;
            }
        } else if (z) {
            zzgym zzgym2 = this.zza;
            zzgym2.zzs(i, 2);
            int i5 = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                ((Long) list.get(i6)).longValue();
                i5 += 8;
            }
            zzgym2.zzu(i5);
            while (i2 < list.size()) {
                zzgym2.zzk(((Long) list.get(i2)).longValue());
                i2++;
            }
        } else {
            while (i2 < list.size()) {
                this.zza.zzj(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    public final void zzc(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (list instanceof zzgxp) {
            zzgxp zzgxp = (zzgxp) list;
            if (z) {
                zzgym zzgym = this.zza;
                zzgym.zzs(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < zzgxp.size(); i4++) {
                    zzgxp.zzh(i4);
                    i3++;
                }
                zzgym.zzu(i3);
                while (i2 < zzgxp.size()) {
                    zzgym.zzL(zzgxp.zzh(i2) ? (byte) 1 : 0);
                    i2++;
                }
                return;
            }
            while (i2 < zzgxp.size()) {
                this.zza.zzM(i, zzgxp.zzh(i2));
                i2++;
            }
        } else if (z) {
            zzgym zzgym2 = this.zza;
            zzgym2.zzs(i, 2);
            int i5 = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                ((Boolean) list.get(i6)).booleanValue();
                i5++;
            }
            zzgym2.zzu(i5);
            while (i2 < list.size()) {
                zzgym2.zzL(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : 0);
                i2++;
            }
        } else {
            while (i2 < list.size()) {
                this.zza.zzM(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
        }
    }

    public final void zzs(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (list instanceof zzgzi) {
            zzgzi zzgzi = (zzgzi) list;
            if (z) {
                zzgym zzgym = this.zza;
                zzgym.zzs(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < zzgzi.size(); i4++) {
                    i3 += zzgym.zzE((long) zzgzi.zzd(i4));
                }
                zzgym.zzu(i3);
                while (i2 < zzgzi.size()) {
                    zzgym.zzm(zzgzi.zzd(i2));
                    i2++;
                }
                return;
            }
            while (i2 < zzgzi.size()) {
                this.zza.zzl(i, zzgzi.zzd(i2));
                i2++;
            }
        } else if (z) {
            zzgym zzgym2 = this.zza;
            zzgym2.zzs(i, 2);
            int i5 = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                i5 += zzgym.zzE((long) ((Integer) list.get(i6)).intValue());
            }
            zzgym2.zzu(i5);
            while (i2 < list.size()) {
                zzgym2.zzm(((Integer) list.get(i2)).intValue());
                i2++;
            }
        } else {
            while (i2 < list.size()) {
                this.zza.zzl(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public final void zzA(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (list instanceof zzhah) {
            zzhah zzhah = (zzhah) list;
            if (z) {
                zzgym zzgym = this.zza;
                zzgym.zzs(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < zzhah.size(); i4++) {
                    zzhah.zza(i4);
                    i3 += 8;
                }
                zzgym.zzu(i3);
                while (i2 < zzhah.size()) {
                    zzgym.zzk(zzhah.zza(i2));
                    i2++;
                }
                return;
            }
            while (i2 < zzhah.size()) {
                this.zza.zzj(i, zzhah.zza(i2));
                i2++;
            }
        } else if (z) {
            zzgym zzgym2 = this.zza;
            zzgym2.zzs(i, 2);
            int i5 = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                ((Long) list.get(i6)).longValue();
                i5 += 8;
            }
            zzgym2.zzu(i5);
            while (i2 < list.size()) {
                zzgym2.zzk(((Long) list.get(i2)).longValue());
                i2++;
            }
        } else {
            while (i2 < list.size()) {
                this.zza.zzj(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    public final void zzg(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (list instanceof zzgyo) {
            zzgyo zzgyo = (zzgyo) list;
            if (z) {
                zzgym zzgym = this.zza;
                zzgym.zzs(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < zzgyo.size(); i4++) {
                    zzgyo.zzd(i4);
                    i3 += 8;
                }
                zzgym.zzu(i3);
                while (i2 < zzgyo.size()) {
                    zzgym.zzk(Double.doubleToRawLongBits(zzgyo.zzd(i2)));
                    i2++;
                }
                return;
            }
            while (i2 < zzgyo.size()) {
                this.zza.zzj(i, Double.doubleToRawLongBits(zzgyo.zzd(i2)));
                i2++;
            }
        } else if (z) {
            zzgym zzgym2 = this.zza;
            zzgym2.zzs(i, 2);
            int i5 = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                ((Double) list.get(i6)).doubleValue();
                i5 += 8;
            }
            zzgym2.zzu(i5);
            while (i2 < list.size()) {
                zzgym2.zzk(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
        } else {
            while (i2 < list.size()) {
                this.zza.zzj(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
        }
    }

    public final void zzp(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (list instanceof zzgyy) {
            zzgyy zzgyy = (zzgyy) list;
            if (z) {
                zzgym zzgym = this.zza;
                zzgym.zzs(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < zzgyy.size(); i4++) {
                    zzgyy.zzd(i4);
                    i3 += 4;
                }
                zzgym.zzu(i3);
                while (i2 < zzgyy.size()) {
                    zzgym.zzi(Float.floatToRawIntBits(zzgyy.zzd(i2)));
                    i2++;
                }
                return;
            }
            while (i2 < zzgyy.size()) {
                this.zza.zzh(i, Float.floatToRawIntBits(zzgyy.zzd(i2)));
                i2++;
            }
        } else if (z) {
            zzgym zzgym2 = this.zza;
            zzgym2.zzs(i, 2);
            int i5 = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                ((Float) list.get(i6)).floatValue();
                i5 += 4;
            }
            zzgym2.zzu(i5);
            while (i2 < list.size()) {
                zzgym2.zzi(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
        } else {
            while (i2 < list.size()) {
                this.zza.zzh(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
        }
    }

    public final void zzy(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (list instanceof zzgzi) {
            zzgzi zzgzi = (zzgzi) list;
            if (z) {
                zzgym zzgym = this.zza;
                zzgym.zzs(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < zzgzi.size(); i4++) {
                    zzgzi.zzd(i4);
                    i3 += 4;
                }
                zzgym.zzu(i3);
                while (i2 < zzgzi.size()) {
                    zzgym.zzi(zzgzi.zzd(i2));
                    i2++;
                }
                return;
            }
            while (i2 < zzgzi.size()) {
                this.zza.zzh(i, zzgzi.zzd(i2));
                i2++;
            }
        } else if (z) {
            zzgym zzgym2 = this.zza;
            zzgym2.zzs(i, 2);
            int i5 = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                ((Integer) list.get(i6)).intValue();
                i5 += 4;
            }
            zzgym2.zzu(i5);
            while (i2 < list.size()) {
                zzgym2.zzi(((Integer) list.get(i2)).intValue());
                i2++;
            }
        } else {
            while (i2 < list.size()) {
                this.zza.zzh(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public final void zzC(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (list instanceof zzgzi) {
            zzgzi zzgzi = (zzgzi) list;
            if (z) {
                zzgym zzgym = this.zza;
                zzgym.zzs(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < zzgzi.size(); i4++) {
                    int zzd = zzgzi.zzd(i4);
                    i3 += zzgym.zzD((zzd >> 31) ^ (zzd + zzd));
                }
                zzgym.zzu(i3);
                while (i2 < zzgzi.size()) {
                    int zzd2 = zzgzi.zzd(i2);
                    zzgym.zzu((zzd2 >> 31) ^ (zzd2 + zzd2));
                    i2++;
                }
                return;
            }
            while (i2 < zzgzi.size()) {
                zzgym zzgym2 = this.zza;
                int zzd3 = zzgzi.zzd(i2);
                zzgym2.zzt(i, (zzd3 >> 31) ^ (zzd3 + zzd3));
                i2++;
            }
        } else if (z) {
            zzgym zzgym3 = this.zza;
            zzgym3.zzs(i, 2);
            int i5 = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                int intValue = ((Integer) list.get(i6)).intValue();
                i5 += zzgym.zzD((intValue >> 31) ^ (intValue + intValue));
            }
            zzgym3.zzu(i5);
            while (i2 < list.size()) {
                int intValue2 = ((Integer) list.get(i2)).intValue();
                zzgym3.zzu((intValue2 >> 31) ^ (intValue2 + intValue2));
                i2++;
            }
        } else {
            while (i2 < list.size()) {
                zzgym zzgym4 = this.zza;
                int intValue3 = ((Integer) list.get(i2)).intValue();
                zzgym4.zzt(i, (intValue3 >> 31) ^ (intValue3 + intValue3));
                i2++;
            }
        }
    }

    public final void zzE(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (list instanceof zzhah) {
            zzhah zzhah = (zzhah) list;
            if (z) {
                zzgym zzgym = this.zza;
                zzgym.zzs(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < zzhah.size(); i4++) {
                    long zza2 = zzhah.zza(i4);
                    i3 += zzgym.zzE((zza2 >> 63) ^ (zza2 + zza2));
                }
                zzgym.zzu(i3);
                while (i2 < zzhah.size()) {
                    long zza3 = zzhah.zza(i2);
                    zzgym.zzw((zza3 >> 63) ^ (zza3 + zza3));
                    i2++;
                }
                return;
            }
            while (i2 < zzhah.size()) {
                zzgym zzgym2 = this.zza;
                long zza4 = zzhah.zza(i2);
                zzgym2.zzv(i, (zza4 >> 63) ^ (zza4 + zza4));
                i2++;
            }
        } else if (z) {
            zzgym zzgym3 = this.zza;
            zzgym3.zzs(i, 2);
            int i5 = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                long longValue = ((Long) list.get(i6)).longValue();
                i5 += zzgym.zzE((longValue >> 63) ^ (longValue + longValue));
            }
            zzgym3.zzu(i5);
            while (i2 < list.size()) {
                long longValue2 = ((Long) list.get(i2)).longValue();
                zzgym3.zzw((longValue2 >> 63) ^ (longValue2 + longValue2));
                i2++;
            }
        } else {
            while (i2 < list.size()) {
                zzgym zzgym4 = this.zza;
                long longValue3 = ((Long) list.get(i2)).longValue();
                zzgym4.zzv(i, (longValue3 >> 63) ^ (longValue3 + longValue3));
                i2++;
            }
        }
    }

    public final void zzj(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (list instanceof zzgzi) {
            zzgzi zzgzi = (zzgzi) list;
            if (z) {
                zzgym zzgym = this.zza;
                zzgym.zzs(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < zzgzi.size(); i4++) {
                    i3 += zzgym.zzE((long) zzgzi.zzd(i4));
                }
                zzgym.zzu(i3);
                while (i2 < zzgzi.size()) {
                    zzgym.zzm(zzgzi.zzd(i2));
                    i2++;
                }
                return;
            }
            while (i2 < zzgzi.size()) {
                this.zza.zzl(i, zzgzi.zzd(i2));
                i2++;
            }
        } else if (z) {
            zzgym zzgym2 = this.zza;
            zzgym2.zzs(i, 2);
            int i5 = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                i5 += zzgym.zzE((long) ((Integer) list.get(i6)).intValue());
            }
            zzgym2.zzu(i5);
            while (i2 < list.size()) {
                zzgym2.zzm(((Integer) list.get(i2)).intValue());
                i2++;
            }
        } else {
            while (i2 < list.size()) {
                this.zza.zzl(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public final void zzu(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (list instanceof zzhah) {
            zzhah zzhah = (zzhah) list;
            if (z) {
                zzgym zzgym = this.zza;
                zzgym.zzs(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < zzhah.size(); i4++) {
                    i3 += zzgym.zzE(zzhah.zza(i4));
                }
                zzgym.zzu(i3);
                while (i2 < zzhah.size()) {
                    zzgym.zzw(zzhah.zza(i2));
                    i2++;
                }
                return;
            }
            while (i2 < zzhah.size()) {
                this.zza.zzv(i, zzhah.zza(i2));
                i2++;
            }
        } else if (z) {
            zzgym zzgym2 = this.zza;
            zzgym2.zzs(i, 2);
            int i5 = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                i5 += zzgym.zzE(((Long) list.get(i6)).longValue());
            }
            zzgym2.zzu(i5);
            while (i2 < list.size()) {
                zzgym2.zzw(((Long) list.get(i2)).longValue());
                i2++;
            }
        } else {
            while (i2 < list.size()) {
                this.zza.zzv(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }
}
