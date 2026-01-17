package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzxr extends zzxt {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected zzxr(zzbm zzbm, int[] iArr, int i, zzzl zzzl, long j, long j2, long j3, int i2, int i3, float f, float f2, List list, zzdj zzdj) {
        super(zzbm, iArr, 0);
        zzbm zzbm2 = zzbm;
        int[] iArr2 = iArr;
        zzfyq.zzl(list);
    }

    static /* bridge */ /* synthetic */ zzfyq zzd(zzyv[] zzyvArr) {
        int i;
        int i2;
        double d;
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            i = 2;
            i2 = 1;
            if (i4 >= 2) {
                break;
            }
            zzyv zzyv = zzyvArr[i4];
            if (zzyv == null || zzyv.zzb.length <= 1) {
                arrayList.add((Object) null);
            } else {
                int i5 = zzfyq.zzd;
                zzfyn zzfyn = new zzfyn();
                zzfyn.zzf(new zzxp(0, 0));
                arrayList.add(zzfyn);
            }
            i4++;
        }
        long[][] jArr = new long[2][];
        for (int i6 = 0; i6 < 2; i6++) {
            zzyv zzyv2 = zzyvArr[i6];
            if (zzyv2 == null) {
                jArr[i6] = new long[0];
            } else {
                int[] iArr = zzyv2.zzb;
                jArr[i6] = new long[iArr.length];
                for (int i7 = 0; i7 < iArr.length; i7++) {
                    long j = (long) zzyv2.zza.zzb(iArr[i7]).zzj;
                    long[] jArr2 = jArr[i6];
                    if (j == -1) {
                        j = 0;
                    }
                    jArr2[i7] = j;
                }
                Arrays.sort(jArr[i6]);
            }
        }
        int[] iArr2 = new int[2];
        long[] jArr3 = new long[2];
        for (int i8 = 0; i8 < 2; i8++) {
            long[] jArr4 = jArr[i8];
            jArr3[i8] = jArr4.length == 0 ? 0 : jArr4[0];
        }
        zzi(arrayList, jArr3);
        zzfzb zza = zzfzw.zzc(zzgab.zzc()).zzb(2).zza();
        int i9 = 0;
        while (i9 < i) {
            int length = jArr[i9].length;
            if (length > i2) {
                double[] dArr = new double[length];
                int i10 = i3;
                while (true) {
                    long[] jArr5 = jArr[i9];
                    double d2 = 0.0d;
                    if (i10 >= jArr5.length) {
                        break;
                    }
                    long j2 = jArr5[i10];
                    if (j2 != -1) {
                        d2 = Math.log((double) j2);
                    }
                    dArr[i10] = d2;
                    i10++;
                }
                int i11 = length - 1;
                double d3 = dArr[i11] - dArr[i3];
                int i12 = i3;
                while (i12 < i11) {
                    double d4 = dArr[i12];
                    i12++;
                    double d5 = d4 + dArr[i12];
                    if (d3 == 0.0d) {
                        d = 1.0d;
                    } else {
                        d = ((d5 * 0.5d) - dArr[i3]) / d3;
                    }
                    zza.zzq(Double.valueOf(d), Integer.valueOf(i9));
                    i3 = 0;
                }
            }
            i9++;
            i3 = 0;
            i = 2;
            i2 = 1;
        }
        zzfyq zzl = zzfyq.zzl(zza.zzr());
        for (int i13 = 0; i13 < zzl.size(); i13++) {
            int intValue = ((Integer) zzl.get(i13)).intValue();
            int i14 = iArr2[intValue] + 1;
            iArr2[intValue] = i14;
            jArr3[intValue] = jArr[intValue][i14];
            zzi(arrayList, jArr3);
        }
        for (int i15 = 0; i15 < 2; i15++) {
            if (arrayList.get(i15) != null) {
                long j3 = jArr3[i15];
                jArr3[i15] = j3 + j3;
            }
        }
        zzi(arrayList, jArr3);
        zzfyn zzfyn2 = new zzfyn();
        for (int i16 = 0; i16 < arrayList.size(); i16++) {
            zzfyn zzfyn3 = (zzfyn) arrayList.get(i16);
            zzfyn2.zzf(zzfyn3 == null ? zzfyq.zzn() : zzfyn3.zzi());
        }
        return zzfyn2.zzi();
    }

    private static void zzi(List list, long[] jArr) {
        long j = 0;
        for (int i = 0; i < 2; i++) {
            j += jArr[i];
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzfyn zzfyn = (zzfyn) list.get(i2);
            if (zzfyn != null) {
                zzfyn.zzf(new zzxp(j, jArr[i2]));
            }
        }
    }
}
