package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzajo {
    private static final int[] zza = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static zzaey zza(zzadw zzadw) throws IOException {
        return zzc(zzadw, true, false);
    }

    public static zzaey zzb(zzadw zzadw, boolean z) throws IOException {
        return zzc(zzadw, false, z);
    }

    private static zzaey zzc(zzadw zzadw, boolean z, boolean z2) throws IOException {
        zzen zzen;
        int i;
        boolean z3;
        zzen zzen2;
        int[] iArr;
        zzadw zzadw2 = zzadw;
        boolean z4 = z2;
        long zzd = zzadw.zzd();
        long j = -1;
        int i2 = (zzd > -1 ? 1 : (zzd == -1 ? 0 : -1));
        long j2 = 4096;
        if (i2 != 0 && zzd <= 4096) {
            j2 = zzd;
        }
        zzen zzen3 = new zzen(64);
        int i3 = (int) j2;
        boolean z5 = false;
        int i4 = 0;
        boolean z6 = false;
        while (true) {
            if (i4 >= i3) {
                boolean z7 = z5;
                break;
            }
            zzen3.zzI(8);
            boolean z8 = true;
            if (!zzadw2.zzm(zzen3.zzN(), z5 ? 1 : 0, 8, true)) {
                break;
            }
            long zzu = zzen3.zzu();
            int zzg = zzen3.zzg();
            if (zzu == 1) {
                zzadw2.zzh(zzen3.zzN(), 8, 8);
                i = 16;
                zzen3.zzK(16);
                zzu = zzen3.zzt();
                zzen = zzen3;
            } else {
                if (zzu == 0) {
                    long zzd2 = zzadw.zzd();
                    if (zzd2 != j) {
                        zzu = (zzd2 - zzadw.zze()) + 8;
                    }
                }
                zzen = zzen3;
                i = 8;
            }
            long j3 = zzu;
            long j4 = (long) i;
            if (j3 < j4) {
                return new zzaik(zzg, j3, i);
            }
            i4 += i;
            if (zzg == 1836019574) {
                i3 += (int) j3;
                if (i2 != 0 && ((long) i3) > zzd) {
                    i3 = (int) zzd;
                }
                zzen3 = zzen;
                j = -1;
                z5 = false;
            } else if (zzg == 1836019558 || zzg == 1836475768) {
                z5 = true;
            } else {
                z6 |= !(zzg != 1835295092);
                int i5 = zzg;
                long j5 = zzd;
                if ((((long) i4) + j3) - j4 >= ((long) i3)) {
                    z5 = false;
                    break;
                }
                int i6 = (int) (j3 - j4);
                i4 += i6;
                if (i5 != 1718909296) {
                    zzen2 = zzen;
                    z3 = false;
                    if (i6 != 0) {
                        zzadw2.zzg(i6);
                    }
                } else if (i6 < 8) {
                    return new zzaik(1718909296, (long) i6, 8);
                } else {
                    zzen2 = zzen;
                    zzen2.zzI(i6);
                    z3 = false;
                    zzadw2.zzh(zzen2.zzN(), 0, i6);
                    int zzg2 = zzen2.zzg();
                    boolean zzd3 = zzd(zzg2, z4) | z6;
                    zzen2.zzM(4);
                    int zza2 = zzen2.zza() / 4;
                    if (!zzd3 && zza2 > 0) {
                        iArr = new int[zza2];
                        int i7 = 0;
                        while (true) {
                            if (i7 >= zza2) {
                                z8 = zzd3;
                                break;
                            }
                            int zzg3 = zzen2.zzg();
                            iArr[i7] = zzg3;
                            if (zzd(zzg3, z4)) {
                                break;
                            }
                            i7++;
                        }
                    } else {
                        z8 = zzd3;
                        iArr = null;
                    }
                    if (!z8) {
                        return new zzajt(zzg2, iArr);
                    }
                    z6 = z8;
                }
                zzen3 = zzen2;
                z5 = z3;
                zzd = j5;
                j = -1;
            }
        }
        if (!z6) {
            return zzajk.zza;
        }
        if (z != z5) {
            return z5 ? zzaje.zza : zzaje.zzb;
        }
        return null;
    }

    private static boolean zzd(int i, boolean z) {
        if ((i >>> 8) == 3368816) {
            return true;
        }
        if (i == 1751476579) {
            if (z) {
                return true;
            }
            i = 1751476579;
        }
        int[] iArr = zza;
        for (int i2 = 0; i2 < 29; i2++) {
            if (iArr[i2] == i) {
                return true;
            }
        }
        return false;
    }
}
