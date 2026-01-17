package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbcj;
import kotlin.io.ConstantsKt;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzanq {
    public static zzano zza(zzem zzem) throws zzaz {
        int i;
        int i2;
        char c;
        int i3;
        char c2;
        int i4;
        zzem zzem2 = zzem;
        int zzd = zzem2.zzd(8);
        int i5 = 5;
        int zzd2 = zzem2.zzd(5);
        if (zzd2 == 31) {
            i = zzem2.zzd(24);
        } else {
            switch (zzd2) {
                case 0:
                    i = 96000;
                    break;
                case 1:
                    i = 88200;
                    break;
                case 2:
                    i = 64000;
                    break;
                case 3:
                    i = 48000;
                    break;
                case 4:
                    i = 44100;
                    break;
                case 5:
                    i = 32000;
                    break;
                case 6:
                    i = 24000;
                    break;
                case 7:
                    i = 22050;
                    break;
                case 8:
                    i = 16000;
                    break;
                case 9:
                    i = 12000;
                    break;
                case 10:
                    i = 11025;
                    break;
                case 11:
                    i = 8000;
                    break;
                case 12:
                    i = 7350;
                    break;
                case 15:
                    i = 57600;
                    break;
                case 16:
                    i = 51200;
                    break;
                case 17:
                    i = 40000;
                    break;
                case 18:
                    i = 38400;
                    break;
                case 19:
                    i = 34150;
                    break;
                case 20:
                    i = 28800;
                    break;
                case zzbcj.zzt.zzm /*21*/:
                    i = 25600;
                    break;
                case 22:
                    i = 20000;
                    break;
                case 23:
                    i = 19200;
                    break;
                case 24:
                    i = 17075;
                    break;
                case 25:
                    i = 14400;
                    break;
                case 26:
                    i = 12800;
                    break;
                case 27:
                    i = 9600;
                    break;
                default:
                    throw zzaz.zzc("Unsupported sampling rate index " + zzd2);
            }
        }
        int zzd3 = zzem2.zzd(3);
        int i6 = 1;
        if (zzd3 == 0) {
            i2 = 768;
        } else if (zzd3 == 1) {
            i2 = 1024;
        } else if (zzd3 == 2 || zzd3 == 3) {
            i2 = 2048;
        } else if (zzd3 == 4) {
            i2 = ConstantsKt.DEFAULT_BLOCK_SIZE;
        } else {
            throw zzaz.zzc("Unsupported coreSbrFrameLengthIndex " + zzd3);
        }
        if (zzd3 == 0 || zzd3 == 1) {
            c = 0;
        } else if (zzd3 == 2) {
            c = 2;
        } else if (zzd3 == 3) {
            c = 3;
        } else if (zzd3 == 4) {
            c = 1;
        } else {
            throw zzaz.zzc("Unsupported coreSbrFrameLengthIndex " + zzd3);
        }
        zzem2.zzn(2);
        zze(zzem);
        int zzd4 = zzem2.zzd(5);
        int i7 = 0;
        int i8 = 0;
        while (true) {
            int i9 = 16;
            if (i7 < zzd4 + 1) {
                int zzd5 = zzem2.zzd(3);
                i8 += zzc(zzem2, 5, 8, 16) + 1;
                if ((zzd5 == 0 || zzd5 == 2) && zzem.zzp()) {
                    zze(zzem);
                }
                i7++;
            } else {
                int zzc = zzc(zzem2, 4, 8, 16) + 1;
                zzem.zzm();
                int i10 = 0;
                while (true) {
                    double d = 2.0d;
                    if (i10 < zzc) {
                        int zzd6 = zzem2.zzd(2);
                        if (zzd6 == 0) {
                            i3 = zzd;
                            zzf(zzem);
                            if (c > 0) {
                                zzd(zzem);
                            }
                        } else if (zzd6 != i6) {
                            if (zzd6 == 3) {
                                zzc(zzem2, 4, 8, i9);
                                int zzc2 = zzc(zzem2, 4, 8, i9);
                                if (zzem.zzp()) {
                                    zzc(zzem2, 8, i9, 0);
                                }
                                zzem.zzm();
                                if (zzc2 > 0) {
                                    zzem2.zzn(zzc2 * 8);
                                }
                            }
                            i3 = zzd;
                        } else {
                            if (zzf(zzem)) {
                                zzem.zzm();
                            }
                            if (c > 0) {
                                zzd(zzem);
                                i4 = zzem2.zzd(2);
                                c2 = c;
                            } else {
                                i4 = 0;
                                c2 = 0;
                            }
                            if (i4 > 0) {
                                zzem2.zzn(6);
                                int zzd7 = zzem2.zzd(2);
                                zzem2.zzn(4);
                                if (zzem.zzp()) {
                                    zzem2.zzn(i5);
                                }
                                if (i4 == 2 || i4 == 3) {
                                    zzem2.zzn(6);
                                }
                                if (zzd7 == 2) {
                                    zzem.zzm();
                                }
                            }
                            i3 = zzd;
                            int floor = ((int) Math.floor(Math.log((double) (i8 - 1)) / Math.log(2.0d))) + 1;
                            int zzd8 = zzem2.zzd(2);
                            if (zzd8 > 0 && zzem.zzp()) {
                                zzem2.zzn(floor);
                            }
                            if (zzem.zzp()) {
                                zzem2.zzn(floor);
                            }
                            if (c2 == 0 && zzd8 == 0) {
                                zzem.zzm();
                            }
                        }
                        i10++;
                        zzd = i3;
                        i5 = 5;
                        i6 = 1;
                        i9 = 16;
                    } else {
                        int i11 = zzd;
                        byte[] bArr = null;
                        if (zzem.zzp()) {
                            int zzc3 = zzc(zzem2, 2, 4, 8) + 1;
                            for (int i12 = 0; i12 < zzc3; i12++) {
                                int zzc4 = zzc(zzem2, 4, 8, 16);
                                int zzc5 = zzc(zzem2, 4, 8, 16);
                                if (zzc4 == 7) {
                                    int zzd9 = zzem2.zzd(4) + 1;
                                    zzem2.zzn(4);
                                    byte[] bArr2 = new byte[zzd9];
                                    for (int i13 = 0; i13 < zzd9; i13++) {
                                        bArr2[i13] = (byte) zzem2.zzd(8);
                                    }
                                    bArr = bArr2;
                                } else {
                                    zzem2.zzn(zzc5 * 8);
                                }
                            }
                        }
                        byte[] bArr3 = bArr;
                        switch (i) {
                            case 14700:
                            case 16000:
                                d = 3.0d;
                                break;
                            case 22050:
                            case 24000:
                                break;
                            case 29400:
                            case 32000:
                            case 58800:
                            case 64000:
                                d = 1.5d;
                                break;
                            case 44100:
                            case 48000:
                            case 88200:
                            case 96000:
                                d = 1.0d;
                                break;
                            default:
                                throw zzaz.zzc("Unsupported sampling rate " + i);
                        }
                        return new zzano(i11, (int) (((double) i) * d), (int) (((double) i2) * d), bArr3, (zzanp) null);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0070 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0071  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean zzb(com.google.android.gms.internal.ads.zzem r17, com.google.android.gms.internal.ads.zzann r18) throws com.google.android.gms.internal.ads.zzaz {
        /*
            r0 = r17
            r1 = r18
            r17.zzb()
            r2 = 3
            r3 = 8
            int r2 = zzc(r0, r2, r3, r3)
            r1.zza = r2
            r4 = 0
            r5 = -1
            if (r2 == r5) goto L_0x00c0
            r2 = 2
            int r6 = java.lang.Math.max(r2, r3)
            r7 = 32
            int r6 = java.lang.Math.max(r6, r7)
            r8 = 63
            r9 = 1
            if (r6 > r8) goto L_0x0026
            r6 = r9
            goto L_0x0027
        L_0x0026:
            r6 = r4
        L_0x0027:
            com.google.android.gms.internal.ads.zzdd.zzd(r6)
            r10 = 3
            r12 = 255(0xff, double:1.26E-321)
            long r14 = com.google.android.gms.internal.ads.zzgbo.zza(r10, r12)
            r5 = 4294967296(0x100000000, double:2.121995791E-314)
            com.google.android.gms.internal.ads.zzgbo.zza(r14, r5)
            int r5 = r17.zza()
            r14 = -1
            if (r5 >= r2) goto L_0x0044
        L_0x0042:
            r5 = r14
            goto L_0x006a
        L_0x0044:
            long r5 = r0.zze(r2)
            int r16 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r16 != 0) goto L_0x006a
            int r5 = r17.zza()
            if (r5 >= r3) goto L_0x0053
            goto L_0x0042
        L_0x0053:
            long r5 = r0.zze(r3)
            long r10 = r10 + r5
            int r3 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r3 != 0) goto L_0x0069
            int r3 = r17.zza()
            if (r3 >= r7) goto L_0x0063
            goto L_0x0042
        L_0x0063:
            long r5 = r0.zze(r7)
            long r5 = r5 + r10
            goto L_0x006a
        L_0x0069:
            r5 = r10
        L_0x006a:
            r1.zzb = r5
            int r3 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r3 != 0) goto L_0x0071
            return r4
        L_0x0071:
            r10 = 16
            int r3 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r3 > 0) goto L_0x00ad
            r10 = 0
            int r3 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r3 != 0) goto L_0x009e
            int r3 = r1.zza
            r5 = 0
            if (r3 == r9) goto L_0x0097
            if (r3 == r2) goto L_0x0090
            r2 = 17
            if (r3 == r2) goto L_0x0089
            goto L_0x009e
        L_0x0089:
            java.lang.String r0 = "AudioTruncation packet with invalid packet label 0"
            com.google.android.gms.internal.ads.zzaz r0 = com.google.android.gms.internal.ads.zzaz.zza(r0, r5)
            throw r0
        L_0x0090:
            java.lang.String r0 = "Mpegh3daFrame packet with invalid packet label 0"
            com.google.android.gms.internal.ads.zzaz r0 = com.google.android.gms.internal.ads.zzaz.zza(r0, r5)
            throw r0
        L_0x0097:
            java.lang.String r0 = "Mpegh3daConfig packet with invalid packet label 0"
            com.google.android.gms.internal.ads.zzaz r0 = com.google.android.gms.internal.ads.zzaz.zza(r0, r5)
            throw r0
        L_0x009e:
            r2 = 11
            r3 = 24
            int r0 = zzc(r0, r2, r3, r3)
            r1.zzc = r0
            r1 = -1
            if (r0 == r1) goto L_0x00ac
            return r9
        L_0x00ac:
            return r4
        L_0x00ad:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Contains sub-stream with an invalid packet label "
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.google.android.gms.internal.ads.zzaz r0 = com.google.android.gms.internal.ads.zzaz.zzc(r0)
            throw r0
        L_0x00c0:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzanq.zzb(com.google.android.gms.internal.ads.zzem, com.google.android.gms.internal.ads.zzann):boolean");
    }

    private static int zzc(zzem zzem, int i, int i2, int i3) {
        zzdd.zzd(Math.max(Math.max(i, i2), i3) <= 31);
        int i4 = (1 << i) - 1;
        int i5 = (1 << i2) - 1;
        zzgbm.zza(zzgbm.zza(i4, i5), 1 << i3);
        if (zzem.zza() < i) {
            return -1;
        }
        int zzd = zzem.zzd(i);
        if (zzd != i4) {
            return zzd;
        }
        if (zzem.zza() < i2) {
            return -1;
        }
        int zzd2 = zzem.zzd(i2);
        int i6 = zzd + zzd2;
        if (zzd2 != i5) {
            return i6;
        }
        if (zzem.zza() < i3) {
            return -1;
        }
        return i6 + zzem.zzd(i3);
    }

    private static void zzd(zzem zzem) {
        zzem.zzn(3);
        zzem.zzn(8);
        boolean zzp = zzem.zzp();
        boolean zzp2 = zzem.zzp();
        if (zzp) {
            zzem.zzn(5);
        }
        if (zzp2) {
            zzem.zzn(6);
        }
    }

    private static void zze(zzem zzem) {
        int i;
        int zzd = zzem.zzd(2);
        int i2 = 6;
        if (zzd == 0) {
            zzem.zzn(6);
            return;
        }
        int i3 = 5;
        int zzc = zzc(zzem, 5, 8, 16) + 1;
        if (zzd == 1) {
            zzem.zzn(zzc * 7);
        } else if (zzd == 2) {
            boolean zzp = zzem.zzp();
            int i4 = true != zzp ? 5 : 1;
            if (true == zzp) {
                i3 = 7;
            }
            if (true == zzp) {
                i2 = 8;
            }
            int i5 = 0;
            while (i5 < zzc) {
                if (zzem.zzp()) {
                    zzem.zzn(7);
                    i = 0;
                } else {
                    if (zzem.zzd(2) == 3 && zzem.zzd(i3) * i4 != 0) {
                        zzem.zzm();
                    }
                    i = zzem.zzd(i2) * i4;
                    if (!(i == 0 || i == 180)) {
                        zzem.zzm();
                    }
                    zzem.zzm();
                }
                if (!(i == 0 || i == 180 || !zzem.zzp())) {
                    i5++;
                }
                i5++;
            }
        }
    }

    private static boolean zzf(zzem zzem) {
        zzem.zzn(3);
        boolean zzp = zzem.zzp();
        if (zzp) {
            zzem.zzn(13);
        }
        return zzp;
    }
}
