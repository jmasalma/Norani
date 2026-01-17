package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public abstract class zzza extends zzzd {
    /* access modifiers changed from: protected */
    public abstract Pair zzd(zzyz zzyz, int[][][] iArr, int[] iArr2, zzvh zzvh, zzbl zzbl) throws zzin;

    public final zzze zzo(zzmd[] zzmdArr, zzxk zzxk, zzvh zzvh, zzbl zzbl) throws zzin {
        List[] listArr;
        boolean z;
        int[] iArr;
        zzxk zzxk2 = zzxk;
        int[] iArr2 = new int[3];
        zzbm[][] zzbmArr = new zzbm[3][];
        int[][][] iArr3 = new int[3][][];
        for (int i = 0; i < 3; i++) {
            int i2 = zzxk2.zzb;
            zzbmArr[i] = new zzbm[i2];
            iArr3[i] = new int[i2][];
        }
        int i3 = 2;
        int[] iArr4 = new int[2];
        for (int i4 = 0; i4 < 2; i4++) {
            iArr4[i4] = zzmdArr[i4].zze();
        }
        int i5 = 0;
        while (i5 < zzxk2.zzb) {
            zzbm zzb = zzxk2.zzb(i5);
            int i6 = zzb.zzc;
            int i7 = i3;
            int i8 = 0;
            int i9 = 0;
            boolean z2 = true;
            while (i8 < i3) {
                zzmd zzmd = zzmdArr[i8];
                int i10 = 0;
                for (int i11 = 0; i11 < zzb.zza; i11++) {
                    i10 = Math.max(i10, zzmd.zzZ(zzb.zzb(i11)) & 7);
                }
                boolean z3 = iArr2[i8] == 0;
                if (i10 > i9) {
                    z2 = z3;
                    i7 = i8;
                    i9 = i10;
                } else if (i10 == i9 && i6 == 5 && !z2 && z3) {
                    i7 = i8;
                    i9 = i10;
                    z2 = true;
                }
                i8++;
                i3 = 2;
            }
            if (i7 == i3) {
                iArr = new int[zzb.zza];
            } else {
                zzmd zzmd2 = zzmdArr[i7];
                int i12 = zzb.zza;
                int[] iArr5 = new int[i12];
                for (int i13 = 0; i13 < i12; i13++) {
                    iArr5[i13] = zzmd2.zzZ(zzb.zzb(i13));
                }
                iArr = iArr5;
            }
            int i14 = iArr2[i7];
            zzbmArr[i7][i14] = zzb;
            iArr3[i7][i14] = iArr;
            iArr2[i7] = i14 + 1;
            i5++;
            i3 = 2;
        }
        int i15 = i3;
        boolean z4 = true;
        zzxk[] zzxkArr = new zzxk[i15];
        String[] strArr = new String[i15];
        int[] iArr6 = new int[i15];
        int i16 = 0;
        while (i16 < i15) {
            int i17 = iArr2[i16];
            zzxkArr[i16] = new zzxk((zzbm[]) zzex.zzQ(zzbmArr[i16], i17));
            iArr3[i16] = (int[][]) zzex.zzQ(iArr3[i16], i17);
            strArr[i16] = zzmdArr[i16].zzV();
            iArr6[i16] = zzmdArr[i16].zzb();
            i16++;
            i15 = 2;
        }
        int i18 = i15;
        zzyz zzyz = new zzyz(strArr, iArr6, zzxkArr, iArr4, iArr3, new zzxk((zzbm[]) zzex.zzQ(zzbmArr[i18], iArr2[i18])));
        Pair zzd = zzd(zzyz, iArr3, iArr4, zzvh, zzbl);
        zzzb[] zzzbArr = (zzzb[]) zzd.second;
        List[] listArr2 = new List[zzzbArr.length];
        for (int i19 = 0; i19 < zzzbArr.length; i19++) {
            zzzb zzzb = zzzbArr[i19];
            listArr2[i19] = zzzb != null ? zzfyq.zzo(zzzb) : zzfyq.zzn();
        }
        zzfyn zzfyn = new zzfyn();
        int i20 = 0;
        while (i20 < 2) {
            zzxk zzd2 = zzyz.zzd(i20);
            List list = listArr2[i20];
            int i21 = 0;
            while (i21 < zzd2.zzb) {
                zzbm zzb2 = zzd2.zzb(i21);
                boolean z5 = zzyz.zza(i20, i21, false) != 0 ? z4 : false;
                int i22 = zzb2.zza;
                int[] iArr7 = new int[i22];
                boolean[] zArr = new boolean[i22];
                int i23 = 0;
                while (i23 < i22) {
                    iArr7[i23] = zzyz.zzb(i20, i21, i23) & 7;
                    int i24 = 0;
                    while (true) {
                        if (i24 >= list.size()) {
                            listArr = listArr2;
                            z = false;
                            break;
                        }
                        zzzb zzzb2 = (zzzb) list.get(i24);
                        listArr = listArr2;
                        if (zzzb2.zzc().equals(zzb2) && zzzb2.zzg(i23) != -1) {
                            z = true;
                            break;
                        }
                        i24++;
                        listArr2 = listArr;
                    }
                    zArr[i23] = z;
                    i23++;
                    listArr2 = listArr;
                }
                List[] listArr3 = listArr2;
                zzfyn.zzf(new zzbs(zzb2, z5, iArr7, zArr));
                i21++;
                z4 = true;
            }
            List[] listArr4 = listArr2;
            i20++;
            z4 = true;
        }
        zzxk zze = zzyz.zze();
        for (int i25 = 0; i25 < zze.zzb; i25++) {
            zzbm zzb3 = zze.zzb(i25);
            int i26 = zzb3.zza;
            int[] iArr8 = new int[i26];
            Arrays.fill(iArr8, 0);
            zzfyn.zzf(new zzbs(zzb3, false, iArr8, new boolean[i26]));
        }
        return new zzze((zzme[]) zzd.first, (zzyw[]) zzd.second, new zzbt(zzfyn.zzi()), zzyz);
    }

    public final void zzp(Object obj) {
        zzyz zzyz = (zzyz) obj;
    }
}
