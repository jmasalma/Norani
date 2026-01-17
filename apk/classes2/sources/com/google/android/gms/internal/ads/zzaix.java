package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import kotlin.KotlinVersion;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzaix {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb = "OpusHead".getBytes(StandardCharsets.UTF_8);

    static {
        String str = zzex.zza;
    }

    public static int zza(int i) {
        return (i >> 24) & KotlinVersion.MAX_COMPONENT_VALUE;
    }

    public static zzav zzb(zzfc zzfc) {
        zzfa zzfa;
        zzfd zzb2 = zzfc.zzb(1751411826);
        zzfd zzb3 = zzfc.zzb(1801812339);
        zzfd zzb4 = zzfc.zzb(1768715124);
        if (!(zzb2 == null || zzb3 == null || zzb4 == null || zzi(zzb2.zza) != 1835299937)) {
            zzen zzen = zzb3.zza;
            zzen.zzL(12);
            int zzg = zzen.zzg();
            String[] strArr = new String[zzg];
            for (int i = 0; i < zzg; i++) {
                int zzg2 = zzen.zzg();
                zzen.zzM(4);
                strArr[i] = zzen.zzB(zzg2 - 8, StandardCharsets.UTF_8);
            }
            zzen zzen2 = zzb4.zza;
            zzen2.zzL(8);
            ArrayList arrayList = new ArrayList();
            while (zzen2.zza() > 8) {
                int zzc = zzen2.zzc() + zzen2.zzg();
                int zzg3 = zzen2.zzg() - 1;
                if (zzg3 < 0 || zzg3 >= zzg) {
                    zzea.zzf("BoxParsers", "Skipped metadata with unknown key index: " + zzg3);
                } else {
                    String str = strArr[zzg3];
                    while (true) {
                        int zzc2 = zzen2.zzc();
                        if (zzc2 >= zzc) {
                            zzfa = null;
                            break;
                        }
                        int zzg4 = zzen2.zzg();
                        if (zzen2.zzg() == 1684108385) {
                            int zzg5 = zzen2.zzg();
                            int zzg6 = zzen2.zzg();
                            int i2 = zzg4 - 16;
                            byte[] bArr = new byte[i2];
                            zzen2.zzH(bArr, 0, i2);
                            zzfa = new zzfa(str, bArr, zzg6, zzg5);
                            break;
                        }
                        zzen2.zzL(zzc2 + zzg4);
                    }
                    if (zzfa != null) {
                        arrayList.add(zzfa);
                    }
                }
                zzen2.zzL(zzc);
            }
            if (!arrayList.isEmpty()) {
                return new zzav(arrayList);
            }
        }
        return null;
    }

    public static zzav zzc(zzfd zzfd) {
        int i;
        zzen zzen = zzfd.zza;
        zzen.zzL(8);
        zzav zzav = new zzav(-9223372036854775807L, new zzau[0]);
        while (zzen.zza() >= 8) {
            int zzc = zzen.zzc();
            int zzg = zzen.zzg() + zzc;
            int zzg2 = zzen.zzg();
            zzav zzav2 = null;
            if (zzg2 == 1835365473) {
                zzen.zzL(zzc);
                zzen.zzM(8);
                zzg(zzen);
                while (true) {
                    if (zzen.zzc() >= zzg) {
                        break;
                    }
                    int zzc2 = zzen.zzc();
                    int zzg3 = zzen.zzg() + zzc2;
                    if (zzen.zzg() == 1768715124) {
                        zzen.zzL(zzc2);
                        zzen.zzM(8);
                        ArrayList arrayList = new ArrayList();
                        while (zzen.zzc() < zzg3) {
                            zzau zza2 = zzajf.zza(zzen);
                            if (zza2 != null) {
                                arrayList.add(zza2);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            zzav2 = new zzav(arrayList);
                        }
                    } else {
                        zzen.zzL(zzg3);
                    }
                }
                zzav = zzav.zzd(zzav2);
            } else if (zzg2 == 1936553057) {
                zzen.zzL(zzc);
                zzen.zzM(12);
                while (true) {
                    if (zzen.zzc() >= zzg) {
                        break;
                    }
                    int zzc3 = zzen.zzc();
                    int zzg4 = zzen.zzg();
                    if (zzen.zzg() != 1935766900) {
                        zzen.zzL(zzc3 + zzg4);
                    } else if (zzg4 >= 16) {
                        zzen.zzM(4);
                        int i2 = -1;
                        int i3 = 0;
                        for (int i4 = 0; i4 < 2; i4++) {
                            int zzm = zzen.zzm();
                            int zzm2 = zzen.zzm();
                            if (zzm == 0) {
                                i2 = zzm2;
                            } else if (zzm == 1) {
                                i3 = zzm2;
                            }
                        }
                        if (i2 == 12) {
                            i = 240;
                        } else if (i2 == 13) {
                            i = 120;
                        } else {
                            if (i2 == 21 && zzen.zza() >= 8 && zzen.zzc() + 8 <= zzg) {
                                int zzg5 = zzen.zzg();
                                int zzg6 = zzen.zzg();
                                if (zzg5 >= 12 && zzg6 == 1936877170) {
                                    i = zzen.zzn();
                                }
                            }
                            i = -2147483647;
                        }
                        if (i != -2147483647) {
                            zzav2 = new zzav(-9223372036854775807L, new zzahp((float) i, i3));
                        }
                    }
                }
                zzav = zzav.zzd(zzav2);
            } else if (zzg2 == -1451722374) {
                zzav = zzav.zzd(zzm(zzen));
            }
            zzen.zzL(zzg);
        }
        return zzav;
    }

    public static zzfh zzd(zzen zzen) {
        long j;
        long j2;
        zzen.zzL(8);
        if (zza(zzen.zzg()) == 0) {
            j2 = zzen.zzu();
            j = zzen.zzu();
        } else {
            j2 = zzen.zzt();
            j = zzen.zzt();
        }
        return new zzfh(j2, j, zzen.zzu());
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x02c7 A[LOOP:7: B:105:0x02c7->B:109:0x02d1, LOOP_START, PHI: r24 
      PHI: (r24v13 int) = (r24v12 int), (r24v14 int) binds: [B:104:0x02c5, B:109:0x02d1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x02da  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0330  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x037a  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x037d  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x039f  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x03d9  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x03ee  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x0565  */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x02bb A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01e9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.ads.zzajs zze(com.google.android.gms.internal.ads.zzajp r43, com.google.android.gms.internal.ads.zzfc r44, com.google.android.gms.internal.ads.zzaej r45) throws com.google.android.gms.internal.ads.zzaz {
        /*
            r1 = r43
            r0 = r44
            r2 = r45
            r3 = 1937011578(0x7374737a, float:1.936741E31)
            com.google.android.gms.internal.ads.zzfd r3 = r0.zzb(r3)
            if (r3 == 0) goto L_0x0017
            com.google.android.gms.internal.ads.zzz r5 = r1.zzg
            com.google.android.gms.internal.ads.zzait r6 = new com.google.android.gms.internal.ads.zzait
            r6.<init>(r3, r5)
            goto L_0x0025
        L_0x0017:
            r3 = 1937013298(0x73747a32, float:1.9369489E31)
            com.google.android.gms.internal.ads.zzfd r3 = r0.zzb(r3)
            if (r3 == 0) goto L_0x06fe
            com.google.android.gms.internal.ads.zzaiu r6 = new com.google.android.gms.internal.ads.zzaiu
            r6.<init>(r3)
        L_0x0025:
            int r3 = r6.zzb()
            r5 = 0
            if (r3 != 0) goto L_0x0043
            com.google.android.gms.internal.ads.zzajs r9 = new com.google.android.gms.internal.ads.zzajs
            long[] r2 = new long[r5]
            int[] r3 = new int[r5]
            long[] r6 = new long[r5]
            int[] r7 = new int[r5]
            r10 = 0
            r4 = 0
            r0 = r9
            r1 = r43
            r5 = r6
            r6 = r7
            r7 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r9
        L_0x0043:
            int r7 = r1.zzb
            r8 = 2
            r9 = 0
            if (r7 != r8) goto L_0x0068
            long r11 = r1.zzf
            int r7 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r7 <= 0) goto L_0x0068
            float r7 = (float) r3
            float r11 = (float) r11
            com.google.android.gms.internal.ads.zzz r12 = r1.zzg
            com.google.android.gms.internal.ads.zzx r12 = r12.zzb()
            r13 = 1232348160(0x49742400, float:1000000.0)
            float r11 = r11 / r13
            float r7 = r7 / r11
            r12.zzO(r7)
            com.google.android.gms.internal.ads.zzz r7 = r12.zzan()
            com.google.android.gms.internal.ads.zzajp r1 = r1.zza(r7)
        L_0x0068:
            r7 = 1937007471(0x7374636f, float:1.9362445E31)
            com.google.android.gms.internal.ads.zzfd r7 = r0.zzb(r7)
            if (r7 != 0) goto L_0x0080
            r7 = 1668232756(0x636f3634, float:4.4126776E21)
            com.google.android.gms.internal.ads.zzfd r7 = r0.zzb(r7)
            r7.getClass()
            r12 = r7
            com.google.android.gms.internal.ads.zzfd r12 = (com.google.android.gms.internal.ads.zzfd) r12
            r12 = 1
            goto L_0x0081
        L_0x0080:
            r12 = r5
        L_0x0081:
            r13 = 1937011555(0x73747363, float:1.9367382E31)
            com.google.android.gms.internal.ads.zzfd r13 = r0.zzb(r13)
            r13.getClass()
            r14 = r13
            com.google.android.gms.internal.ads.zzfd r14 = (com.google.android.gms.internal.ads.zzfd) r14
            com.google.android.gms.internal.ads.zzen r13 = r13.zza
            r14 = 1937011827(0x73747473, float:1.9367711E31)
            com.google.android.gms.internal.ads.zzfd r14 = r0.zzb(r14)
            r14.getClass()
            r15 = r14
            com.google.android.gms.internal.ads.zzfd r15 = (com.google.android.gms.internal.ads.zzfd) r15
            com.google.android.gms.internal.ads.zzen r14 = r14.zza
            r15 = 1937011571(0x73747373, float:1.9367401E31)
            com.google.android.gms.internal.ads.zzfd r15 = r0.zzb(r15)
            if (r15 == 0) goto L_0x00ab
            com.google.android.gms.internal.ads.zzen r15 = r15.zza
            goto L_0x00ac
        L_0x00ab:
            r15 = 0
        L_0x00ac:
            r4 = 1668576371(0x63747473, float:4.5093966E21)
            com.google.android.gms.internal.ads.zzfd r0 = r0.zzb(r4)
            if (r0 == 0) goto L_0x00b8
            com.google.android.gms.internal.ads.zzen r0 = r0.zza
            goto L_0x00b9
        L_0x00b8:
            r0 = 0
        L_0x00b9:
            com.google.android.gms.internal.ads.zzen r4 = r7.zza
            com.google.android.gms.internal.ads.zzaim r7 = new com.google.android.gms.internal.ads.zzaim
            r7.<init>(r13, r4, r12)
            r4 = 12
            r14.zzL(r4)
            int r12 = r14.zzp()
            r13 = -1
            int r12 = r12 + r13
            int r17 = r14.zzp()
            int r5 = r14.zzp()
            if (r0 == 0) goto L_0x00dd
            r0.zzL(r4)
            int r19 = r0.zzp()
            goto L_0x00df
        L_0x00dd:
            r19 = 0
        L_0x00df:
            if (r15 == 0) goto L_0x00fb
            r15.zzL(r4)
            int r4 = r15.zzp()
            if (r4 <= 0) goto L_0x00f6
            int r16 = r15.zzp()
            int r16 = r16 + -1
            r41 = r15
            r15 = r4
            r4 = r41
            goto L_0x00ff
        L_0x00f6:
            r15 = r4
            r16 = r13
            r4 = 0
            goto L_0x00ff
        L_0x00fb:
            r16 = r13
            r4 = r15
            r15 = 0
        L_0x00ff:
            int r8 = r6.zza()
            com.google.android.gms.internal.ads.zzz r9 = r1.zzg
            if (r8 == r13) goto L_0x01c4
            java.lang.String r10 = r9.zzo
            java.lang.String r11 = "audio/raw"
            boolean r11 = r11.equals(r10)
            if (r11 != 0) goto L_0x0121
            java.lang.String r11 = "audio/g711-mlaw"
            boolean r11 = r11.equals(r10)
            if (r11 != 0) goto L_0x0121
            java.lang.String r11 = "audio/g711-alaw"
            boolean r10 = r11.equals(r10)
            if (r10 == 0) goto L_0x01c4
        L_0x0121:
            if (r12 != 0) goto L_0x01c4
            if (r19 != 0) goto L_0x01c0
            if (r15 != 0) goto L_0x01c0
            int r0 = r7.zza
            long[] r4 = new long[r0]
            int[] r6 = new int[r0]
        L_0x012d:
            boolean r10 = r7.zza()
            if (r10 == 0) goto L_0x013e
            int r10 = r7.zzb
            long r11 = r7.zzd
            r4[r10] = r11
            int r11 = r7.zzc
            r6[r10] = r11
            goto L_0x012d
        L_0x013e:
            long r10 = (long) r5
            r5 = 8192(0x2000, float:1.14794E-41)
            int r5 = r5 / r8
            r7 = 0
            r12 = 0
        L_0x0144:
            if (r7 >= r0) goto L_0x0151
            r14 = r6[r7]
            java.lang.String r15 = com.google.android.gms.internal.ads.zzex.zza
            int r14 = r14 + r5
            int r14 = r14 + r13
            int r14 = r14 / r5
            int r12 = r12 + r14
            int r7 = r7 + 1
            goto L_0x0144
        L_0x0151:
            long[] r7 = new long[r12]
            int[] r14 = new int[r12]
            long[] r15 = new long[r12]
            int[] r12 = new int[r12]
            r21 = r9
            r2 = 0
            r9 = 0
            r13 = 0
            r16 = 0
            r17 = 0
        L_0x0162:
            if (r13 >= r0) goto L_0x01b3
            r19 = r6[r13]
            r22 = r4[r13]
            r41 = r17
            r17 = r0
            r0 = r16
            r16 = r41
            r42 = r19
            r19 = r4
            r4 = r42
        L_0x0176:
            if (r4 <= 0) goto L_0x01a2
            int r24 = java.lang.Math.min(r5, r4)
            r7[r16] = r22
            r25 = r5
            int r5 = r8 * r24
            r14[r16] = r5
            int r9 = r9 + r5
            int r0 = java.lang.Math.max(r0, r5)
            r26 = r6
            long r5 = (long) r2
            long r5 = r5 * r10
            r15[r16] = r5
            r5 = 1
            r12[r16] = r5
            r5 = r14[r16]
            long r5 = (long) r5
            long r22 = r22 + r5
            int r2 = r2 + r24
            int r4 = r4 - r24
            int r16 = r16 + 1
            r5 = r25
            r6 = r26
            goto L_0x0176
        L_0x01a2:
            r25 = r5
            r26 = r6
            int r13 = r13 + 1
            r4 = r19
            r41 = r16
            r16 = r0
            r0 = r17
            r17 = r41
            goto L_0x0162
        L_0x01b3:
            long r4 = (long) r2
            long r10 = r10 * r4
            long r4 = (long) r9
            r9 = r1
            r22 = r10
            r2 = r12
            r0 = r14
            r1 = r15
            r26 = r16
            goto L_0x0394
        L_0x01c0:
            r21 = r9
            r12 = 0
            goto L_0x01c6
        L_0x01c4:
            r21 = r9
        L_0x01c6:
            long[] r2 = new long[r3]
            int[] r8 = new int[r3]
            long[] r9 = new long[r3]
            int[] r10 = new int[r3]
            r31 = r1
            r11 = r16
            r24 = r19
            r13 = 0
            r22 = 0
            r23 = 0
            r25 = 0
            r27 = 0
            r29 = 0
            r19 = r12
            r16 = r15
            r12 = 0
            r15 = 0
        L_0x01e5:
            java.lang.String r1 = "BoxParsers"
            if (r12 >= r3) goto L_0x02bb
            r32 = r25
            r25 = r22
            r22 = 1
        L_0x01ef:
            if (r25 != 0) goto L_0x0214
            boolean r22 = r7.zza()
            if (r22 == 0) goto L_0x020c
            r26 = r14
            r34 = r15
            long r14 = r7.zzd
            r35 = r3
            int r3 = r7.zzc
            r25 = r3
            r32 = r14
            r14 = r26
            r15 = r34
            r3 = r35
            goto L_0x01ef
        L_0x020c:
            r35 = r3
            r26 = r14
            r34 = r15
            r3 = 0
            goto L_0x021c
        L_0x0214:
            r35 = r3
            r26 = r14
            r34 = r15
            r3 = r25
        L_0x021c:
            if (r22 != 0) goto L_0x023e
            java.lang.String r3 = "Unexpected end of chunk data"
            com.google.android.gms.internal.ads.zzea.zzf(r1, r3)
            long[] r2 = java.util.Arrays.copyOf(r2, r12)
            int[] r3 = java.util.Arrays.copyOf(r8, r12)
            long[] r4 = java.util.Arrays.copyOf(r9, r12)
            int[] r5 = java.util.Arrays.copyOf(r10, r12)
            r7 = r2
            r14 = r3
            r15 = r4
            r3 = r12
            r22 = r25
            r2 = r34
            r12 = r5
            goto L_0x02c2
        L_0x023e:
            r15 = r34
            if (r0 != 0) goto L_0x0243
            goto L_0x0259
        L_0x0243:
            if (r23 != 0) goto L_0x0256
            if (r24 <= 0) goto L_0x0252
            int r24 = r24 + -1
            int r23 = r0.zzp()
            int r15 = r0.zzg()
            goto L_0x0243
        L_0x0252:
            r1 = -1
            r23 = 0
            goto L_0x0257
        L_0x0256:
            r1 = -1
        L_0x0257:
            int r23 = r23 + -1
        L_0x0259:
            r2[r12] = r32
            int r1 = r6.zzc()
            r8[r12] = r1
            r14 = r6
            r25 = r7
            long r6 = (long) r1
            long r29 = r29 + r6
            if (r1 <= r13) goto L_0x026a
            r13 = r1
        L_0x026a:
            long r6 = (long) r15
            long r6 = r27 + r6
            r9[r12] = r6
            if (r4 != 0) goto L_0x0273
            r1 = 1
            goto L_0x0274
        L_0x0273:
            r1 = 0
        L_0x0274:
            r10[r12] = r1
            if (r12 != r11) goto L_0x028c
            r1 = 1
            r10[r12] = r1
            int r16 = r16 + -1
            if (r16 <= 0) goto L_0x028c
            r4.getClass()
            r1 = r4
            com.google.android.gms.internal.ads.zzen r1 = (com.google.android.gms.internal.ads.zzen) r1
            int r1 = r4.zzp()
            r6 = -1
            int r1 = r1 + r6
            r11 = r1
        L_0x028c:
            long r6 = (long) r5
            long r27 = r27 + r6
            int r17 = r17 + -1
            if (r17 != 0) goto L_0x02a4
            if (r19 <= 0) goto L_0x02a2
            int r1 = r26.zzp()
            int r5 = r26.zzg()
            int r19 = r19 + -1
            r17 = r1
            goto L_0x02a4
        L_0x02a2:
            r17 = 0
        L_0x02a4:
            r1 = r8[r12]
            long r6 = (long) r1
            long r6 = r32 + r6
            r1 = -1
            int r22 = r3 + -1
            int r12 = r12 + 1
            r3 = r35
            r41 = r6
            r6 = r14
            r7 = r25
            r14 = r26
            r25 = r41
            goto L_0x01e5
        L_0x02bb:
            r35 = r3
            r7 = r2
            r14 = r8
            r12 = r10
            r2 = r15
            r15 = r9
        L_0x02c2:
            long r4 = (long) r2
            long r10 = r27 + r4
            if (r0 == 0) goto L_0x02d7
        L_0x02c7:
            if (r24 <= 0) goto L_0x02d7
            int r2 = r0.zzp()
            if (r2 == 0) goto L_0x02d1
            r0 = 0
            goto L_0x02d8
        L_0x02d1:
            r0.zzg()
            int r24 = r24 + -1
            goto L_0x02c7
        L_0x02d7:
            r0 = 1
        L_0x02d8:
            if (r16 != 0) goto L_0x0330
            if (r17 != 0) goto L_0x0321
            if (r22 != 0) goto L_0x0313
            if (r19 != 0) goto L_0x0306
            if (r23 != 0) goto L_0x02fa
            if (r0 != 0) goto L_0x02f0
            r16 = r3
            r9 = r31
            r0 = 0
            r2 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r8 = 0
            goto L_0x033f
        L_0x02f0:
            r16 = r3
            r17 = r7
            r22 = r10
            r9 = r31
            goto L_0x0389
        L_0x02fa:
            r8 = r0
            r16 = r3
            r6 = r23
            r9 = r31
            r0 = 0
            r2 = 0
            r4 = 0
            r5 = 0
            goto L_0x033f
        L_0x0306:
            r8 = r0
            r16 = r3
            r5 = r19
            r6 = r23
            r9 = r31
            r0 = 0
            r2 = 0
            r4 = 0
            goto L_0x033f
        L_0x0313:
            r8 = r0
            r16 = r3
            r5 = r19
            r4 = r22
            r6 = r23
            r9 = r31
            r0 = 0
            r2 = 0
            goto L_0x033f
        L_0x0321:
            r8 = r0
            r16 = r3
            r2 = r17
            r5 = r19
            r4 = r22
            r6 = r23
            r9 = r31
            r0 = 0
            goto L_0x033f
        L_0x0330:
            r8 = r0
            r0 = r16
            r2 = r17
            r5 = r19
            r4 = r22
            r6 = r23
            r9 = r31
            r16 = r3
        L_0x033f:
            int r3 = r9.zza
            r17 = r7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r22 = r10
            java.lang.String r10 = "Inconsistent stbl box for track "
            r7.<init>(r10)
            r7.append(r3)
            java.lang.String r3 = ": remainingSynchronizationSamples "
            r7.append(r3)
            r7.append(r0)
            java.lang.String r0 = ", remainingSamplesAtTimestampDelta "
            r7.append(r0)
            r7.append(r2)
            java.lang.String r0 = ", remainingSamplesInChunk "
            r7.append(r0)
            r7.append(r4)
            java.lang.String r0 = ", remainingTimestampDeltaChanges "
            r7.append(r0)
            r7.append(r5)
            java.lang.String r0 = ", remainingSamplesAtTimestampOffset "
            r7.append(r0)
            r7.append(r6)
            r0 = 1
            if (r0 == r8) goto L_0x037d
            java.lang.String r0 = ", ctts invalid"
            goto L_0x037f
        L_0x037d:
            java.lang.String r0 = ""
        L_0x037f:
            r7.append(r0)
            java.lang.String r0 = r7.toString()
            com.google.android.gms.internal.ads.zzea.zzf(r1, r0)
        L_0x0389:
            r2 = r12
            r26 = r13
            r0 = r14
            r1 = r15
            r3 = r16
            r7 = r17
            r4 = r29
        L_0x0394:
            long r14 = r9.zzf
            r10 = 0
            int r6 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            r24 = 2147483647(0x7fffffff, double:1.060997895E-314)
            if (r6 <= 0) goto L_0x03c6
            r10 = 8
            long r10 = r10 * r4
            r12 = 1000000(0xf4240, double:4.940656E-318)
            java.math.RoundingMode r16 = java.math.RoundingMode.HALF_DOWN
            long r4 = com.google.android.gms.internal.ads.zzex.zzu(r10, r12, r14, r16)
            r10 = 0
            int r6 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r6 <= 0) goto L_0x03c6
            int r6 = (r4 > r24 ? 1 : (r4 == r24 ? 0 : -1))
            if (r6 >= 0) goto L_0x03c6
            com.google.android.gms.internal.ads.zzx r6 = r21.zzb()
            int r4 = (int) r4
            r6.zzC(r4)
            com.google.android.gms.internal.ads.zzz r4 = r6.zzan()
            com.google.android.gms.internal.ads.zzajp r4 = r9.zza(r4)
            goto L_0x03c7
        L_0x03c6:
            r4 = r9
        L_0x03c7:
            long r5 = r4.zzc
            r12 = 1000000(0xf4240, double:4.940656E-318)
            java.math.RoundingMode r16 = java.math.RoundingMode.DOWN
            r10 = r22
            r14 = r5
            long r29 = com.google.android.gms.internal.ads.zzex.zzu(r10, r12, r14, r16)
            long[] r15 = r4.zzi
            if (r15 != 0) goto L_0x03ee
            com.google.android.gms.internal.ads.zzex.zzG(r1, r12, r5)
            com.google.android.gms.internal.ads.zzajs r3 = new com.google.android.gms.internal.ads.zzajs
            r22 = r3
            r23 = r4
            r24 = r7
            r25 = r0
            r27 = r1
            r28 = r2
            r22.<init>(r23, r24, r25, r26, r27, r28, r29)
            return r3
        L_0x03ee:
            int r8 = r15.length
            r9 = 1
            if (r8 != r9) goto L_0x04ae
            int r8 = r4.zzb
            if (r8 != r9) goto L_0x04a7
            int r14 = r1.length
            r8 = 2
            if (r14 < r8) goto L_0x04a7
            long[] r8 = r4.zzj
            r8.getClass()
            long[] r8 = (long[]) r8
            r9 = 0
            r16 = r8[r9]
            r10 = r15[r9]
            long r8 = r4.zzd
            java.math.RoundingMode r19 = java.math.RoundingMode.DOWN
            r31 = r8
            r8 = r10
            r10 = r5
            r21 = r2
            r27 = r3
            r2 = r12
            r12 = r31
            r28 = r14
            r14 = r19
            long r8 = com.google.android.gms.internal.ads.zzex.zzu(r8, r10, r12, r14)
            long r29 = r16 + r8
            int r14 = r28 + -1
            r8 = 4
            int r8 = java.lang.Math.min(r8, r14)
            r9 = 0
            int r8 = java.lang.Math.max(r9, r8)
            int r10 = r28 + -4
            int r10 = java.lang.Math.min(r10, r14)
            int r10 = java.lang.Math.max(r9, r10)
            r11 = r1[r9]
            int r9 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r9 > 0) goto L_0x04ab
            r8 = r1[r8]
            int r8 = (r16 > r8 ? 1 : (r16 == r8 ? 0 : -1))
            if (r8 >= 0) goto L_0x04ab
            r8 = r1[r10]
            int r8 = (r8 > r29 ? 1 : (r8 == r29 ? 0 : -1))
            if (r8 >= 0) goto L_0x04ab
            int r8 = (r29 > r22 ? 1 : (r29 == r22 ? 0 : -1))
            if (r8 > 0) goto L_0x04ab
            long r8 = r16 - r11
            com.google.android.gms.internal.ads.zzz r10 = r4.zzg
            int r10 = r10.zzH
            long r12 = (long) r10
            java.math.RoundingMode r14 = java.math.RoundingMode.DOWN
            r10 = r12
            r16 = r12
            r12 = r5
            long r33 = com.google.android.gms.internal.ads.zzex.zzu(r8, r10, r12, r14)
            long r8 = r22 - r29
            java.math.RoundingMode r14 = java.math.RoundingMode.DOWN
            r10 = r16
            long r8 = com.google.android.gms.internal.ads.zzex.zzu(r8, r10, r12, r14)
            r10 = 0
            int r12 = (r33 > r10 ? 1 : (r33 == r10 ? 0 : -1))
            if (r12 != 0) goto L_0x0473
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 == 0) goto L_0x04ab
            r10 = 0
            goto L_0x0475
        L_0x0473:
            r10 = r33
        L_0x0475:
            int r12 = (r10 > r24 ? 1 : (r10 == r24 ? 0 : -1))
            if (r12 > 0) goto L_0x04ab
            int r12 = (r8 > r24 ? 1 : (r8 == r24 ? 0 : -1))
            if (r12 <= 0) goto L_0x047e
            goto L_0x04ab
        L_0x047e:
            int r10 = (int) r10
            r11 = r45
            r11.zza = r10
            int r8 = (int) r8
            r11.zzb = r8
            com.google.android.gms.internal.ads.zzex.zzG(r1, r2, r5)
            r2 = 0
            r27 = r15[r2]
            r29 = 1000000(0xf4240, double:4.940656E-318)
            java.math.RoundingMode r33 = java.math.RoundingMode.DOWN
            long r29 = com.google.android.gms.internal.ads.zzex.zzu(r27, r29, r31, r33)
            com.google.android.gms.internal.ads.zzajs r2 = new com.google.android.gms.internal.ads.zzajs
            r22 = r2
            r23 = r4
            r24 = r7
            r25 = r0
            r27 = r1
            r28 = r21
            r22.<init>(r23, r24, r25, r26, r27, r28, r29)
            return r2
        L_0x04a7:
            r21 = r2
            r27 = r3
        L_0x04ab:
            r2 = 1
            r8 = 1
            goto L_0x04b3
        L_0x04ae:
            r21 = r2
            r27 = r3
            r2 = r9
        L_0x04b3:
            if (r8 != r2) goto L_0x04fb
            r2 = 0
            r9 = r15[r2]
            r11 = 0
            int r3 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r3 != 0) goto L_0x04fb
            long[] r3 = r4.zzj
            r3.getClass()
            long[] r3 = (long[]) r3
            r15 = r3[r2]
            r2 = 0
        L_0x04c8:
            int r3 = r1.length
            if (r2 >= r3) goto L_0x04dd
            r8 = r1[r2]
            long r8 = r8 - r15
            r10 = 1000000(0xf4240, double:4.940656E-318)
            java.math.RoundingMode r14 = java.math.RoundingMode.DOWN
            r12 = r5
            long r8 = com.google.android.gms.internal.ads.zzex.zzu(r8, r10, r12, r14)
            r1[r2] = r8
            int r2 = r2 + 1
            goto L_0x04c8
        L_0x04dd:
            long r8 = r22 - r15
            r10 = 1000000(0xf4240, double:4.940656E-318)
            java.math.RoundingMode r14 = java.math.RoundingMode.DOWN
            r12 = r5
            long r29 = com.google.android.gms.internal.ads.zzex.zzu(r8, r10, r12, r14)
            com.google.android.gms.internal.ads.zzajs r2 = new com.google.android.gms.internal.ads.zzajs
            r22 = r2
            r23 = r4
            r24 = r7
            r25 = r0
            r27 = r1
            r28 = r21
            r22.<init>(r23, r24, r25, r26, r27, r28, r29)
            return r2
        L_0x04fb:
            int r2 = r4.zzb
            r3 = 1
            if (r2 != r3) goto L_0x0502
            r3 = 1
            goto L_0x0503
        L_0x0502:
            r3 = 0
        L_0x0503:
            long[] r14 = r4.zzj
            int[] r12 = new int[r8]
            int[] r13 = new int[r8]
            r14.getClass()
            r16 = r14
            long[] r16 = (long[]) r16
            r8 = 0
            r10 = 0
            r11 = 0
            r17 = 0
        L_0x0515:
            int r9 = r15.length
            if (r10 >= r9) goto L_0x05cd
            r19 = r2
            r22 = r3
            r2 = r16[r10]
            r23 = -1
            int r9 = (r2 > r23 ? 1 : (r2 == r23 ? 0 : -1))
            if (r9 == 0) goto L_0x05a5
            r23 = r15[r10]
            r25 = r12
            r28 = r13
            long r12 = r4.zzd
            java.math.RoundingMode r29 = java.math.RoundingMode.DOWN
            r30 = r4
            r4 = r8
            r8 = r23
            r24 = r0
            r23 = r10
            r0 = r11
            r10 = r5
            r31 = r14
            r14 = r29
            long r8 = com.google.android.gms.internal.ads.zzex.zzu(r8, r10, r12, r14)
            r10 = 1
            int r11 = com.google.android.gms.internal.ads.zzex.zzd(r1, r2, r10, r10)
            r25[r23] = r11
            long r2 = r2 + r8
            r8 = r22
            r14 = 0
            int r9 = com.google.android.gms.internal.ads.zzex.zza(r1, r2, r8, r14)
            r28[r23] = r9
            r9 = r25[r23]
        L_0x0554:
            r11 = r25[r23]
            if (r11 < 0) goto L_0x0563
            r12 = r21[r11]
            r12 = r12 & r10
            if (r12 != 0) goto L_0x0563
            int r11 = r11 + -1
            r25[r23] = r11
            r10 = 1
            goto L_0x0554
        L_0x0563:
            if (r11 >= 0) goto L_0x0578
            r25[r23] = r9
        L_0x0567:
            r11 = r25[r23]
            r9 = r28[r23]
            if (r11 >= r9) goto L_0x0578
            r9 = r21[r11]
            r10 = 1
            r9 = r9 & r10
            if (r9 != 0) goto L_0x0578
            int r11 = r11 + 1
            r25[r23] = r11
            goto L_0x0567
        L_0x0578:
            r9 = r19
            r10 = 2
            if (r9 != r10) goto L_0x0593
            r12 = r28[r23]
            if (r11 == r12) goto L_0x0593
        L_0x0581:
            r11 = r28[r23]
            int r12 = r1.length
            r13 = -1
            int r12 = r12 + r13
            if (r11 >= r12) goto L_0x0594
            int r11 = r11 + 1
            r18 = r1[r11]
            int r12 = (r18 > r2 ? 1 : (r18 == r2 ? 0 : -1))
            if (r12 > 0) goto L_0x0594
            r28[r23] = r11
            goto L_0x0581
        L_0x0593:
            r13 = -1
        L_0x0594:
            r2 = r28[r23]
            r3 = r25[r23]
            int r11 = r2 - r3
            int r11 = r11 + r0
            if (r4 == r3) goto L_0x059f
            r0 = 1
            goto L_0x05a0
        L_0x059f:
            r0 = r14
        L_0x05a0:
            r0 = r17 | r0
            r17 = r0
            goto L_0x05bb
        L_0x05a5:
            r24 = r0
            r30 = r4
            r4 = r8
            r23 = r10
            r0 = r11
            r25 = r12
            r28 = r13
            r31 = r14
            r9 = r19
            r8 = r22
            r10 = 2
            r13 = -1
            r14 = 0
            r2 = r4
        L_0x05bb:
            int r0 = r23 + 1
            r10 = r0
            r3 = r8
            r0 = r24
            r12 = r25
            r13 = r28
            r4 = r30
            r14 = r31
            r8 = r2
            r2 = r9
            goto L_0x0515
        L_0x05cd:
            r24 = r0
            r30 = r4
            r0 = r11
            r25 = r12
            r28 = r13
            r31 = r14
            r3 = r27
            r14 = 0
            if (r0 == r3) goto L_0x05df
            r2 = 1
            goto L_0x05e0
        L_0x05df:
            r2 = r14
        L_0x05e0:
            r2 = r17 | r2
            if (r2 == 0) goto L_0x05e7
            long[] r3 = new long[r0]
            goto L_0x05e8
        L_0x05e7:
            r3 = r7
        L_0x05e8:
            if (r2 == 0) goto L_0x05ed
            int[] r4 = new int[r0]
            goto L_0x05ef
        L_0x05ed:
            r4 = r24
        L_0x05ef:
            r8 = 1
            if (r8 != r2) goto L_0x05f4
            r26 = r14
        L_0x05f4:
            if (r2 == 0) goto L_0x05fa
            int[] r8 = new int[r0]
            r12 = r8
            goto L_0x05fc
        L_0x05fa:
            r12 = r21
        L_0x05fc:
            long[] r0 = new long[r0]
            r8 = r14
            r9 = r8
            r13 = r9
            r16 = 0
        L_0x0603:
            int r10 = r15.length
            if (r13 >= r10) goto L_0x06c1
            r18 = r31[r13]
            r10 = r25[r13]
            r11 = r28[r13]
            if (r2 == 0) goto L_0x0622
            int r14 = r11 - r10
            java.lang.System.arraycopy(r7, r10, r3, r8, r14)
            r44 = r7
            r7 = r24
            java.lang.System.arraycopy(r7, r10, r4, r8, r14)
            r22 = r3
            r3 = r21
            java.lang.System.arraycopy(r3, r10, r12, r8, r14)
            goto L_0x062a
        L_0x0622:
            r22 = r3
            r44 = r7
            r3 = r21
            r7 = r24
        L_0x062a:
            r21 = r8
            r23 = r9
            r14 = r10
            r10 = r26
        L_0x0631:
            if (r14 >= r11) goto L_0x0696
            r45 = r10
            r8 = r30
            long r9 = r8.zzd
            java.math.RoundingMode r38 = java.math.RoundingMode.DOWN
            r34 = 1000000(0xf4240, double:4.940656E-318)
            r32 = r16
            r36 = r9
            long r26 = com.google.android.gms.internal.ads.zzex.zzu(r32, r34, r36, r38)
            r9 = r1[r14]
            long r9 = r9 - r18
            r29 = 1000000(0xf4240, double:4.940656E-318)
            java.math.RoundingMode r24 = java.math.RoundingMode.DOWN
            r32 = r1
            r1 = r8
            r8 = r9
            r34 = r3
            r33 = r11
            r3 = r45
            r10 = r29
            r30 = r12
            r29 = r13
            r12 = r5
            r20 = r14
            r35 = 0
            r14 = r24
            long r8 = com.google.android.gms.internal.ads.zzex.zzu(r8, r10, r12, r14)
            r10 = 0
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 >= 0) goto L_0x0673
            r12 = r35
            goto L_0x0674
        L_0x0673:
            r12 = 1
        L_0x0674:
            r13 = 1
            r12 = r12 ^ r13
            r23 = r12 | r23
            long r26 = r26 + r8
            r0[r21] = r26
            if (r2 == 0) goto L_0x0684
            r8 = r4[r21]
            if (r8 <= r3) goto L_0x0684
            r3 = r7[r20]
        L_0x0684:
            int r21 = r21 + 1
            int r14 = r20 + 1
            r10 = r3
            r13 = r29
            r12 = r30
            r11 = r33
            r3 = r34
            r30 = r1
            r1 = r32
            goto L_0x0631
        L_0x0696:
            r32 = r1
            r34 = r3
            r3 = r10
            r29 = r13
            r1 = r30
            r10 = 0
            r35 = 0
            r30 = r12
            r8 = r15[r29]
            long r16 = r16 + r8
            int r13 = r29 + 1
            r26 = r3
            r24 = r7
            r8 = r21
            r3 = r22
            r9 = r23
            r21 = r34
            r14 = r35
            r7 = r44
            r30 = r1
            r1 = r32
            goto L_0x0603
        L_0x06c1:
            r22 = r3
            r1 = r30
            r30 = r12
            long r2 = r1.zzd
            java.math.RoundingMode r38 = java.math.RoundingMode.DOWN
            r34 = 1000000(0xf4240, double:4.940656E-318)
            r32 = r16
            r36 = r2
            long r39 = com.google.android.gms.internal.ads.zzex.zzu(r32, r34, r36, r38)
            if (r9 == 0) goto L_0x06ea
            com.google.android.gms.internal.ads.zzz r2 = r1.zzg
            com.google.android.gms.internal.ads.zzx r2 = r2.zzb()
            r3 = 1
            r2.zzP(r3)
            com.google.android.gms.internal.ads.zzz r2 = r2.zzan()
            com.google.android.gms.internal.ads.zzajp r1 = r1.zza(r2)
        L_0x06ea:
            r33 = r1
            com.google.android.gms.internal.ads.zzajs r1 = new com.google.android.gms.internal.ads.zzajs
            r32 = r1
            r34 = r22
            r35 = r4
            r36 = r26
            r37 = r0
            r38 = r30
            r32.<init>(r33, r34, r35, r36, r37, r38, r39)
            return r1
        L_0x06fe:
            java.lang.String r0 = "Track has no sample table size information"
            r1 = 0
            com.google.android.gms.internal.ads.zzaz r0 = com.google.android.gms.internal.ads.zzaz.zza(r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaix.zze(com.google.android.gms.internal.ads.zzajp, com.google.android.gms.internal.ads.zzfc, com.google.android.gms.internal.ads.zzaej):com.google.android.gms.internal.ads.zzajs");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ed, code lost:
        if (r22 == 0) goto L_0x00f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00f8, code lost:
        r22 = -9223372036854775807L;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x01d8  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x01e8  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x01ea  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01ee  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0251  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x027b  */
    /* JADX WARNING: Removed duplicated region for block: B:533:0x0b5d  */
    /* JADX WARNING: Removed duplicated region for block: B:534:0x0b5f  */
    /* JADX WARNING: Removed duplicated region for block: B:590:0x0d3f  */
    /* JADX WARNING: Removed duplicated region for block: B:591:0x0d43  */
    /* JADX WARNING: Removed duplicated region for block: B:602:0x0dae  */
    /* JADX WARNING: Removed duplicated region for block: B:603:0x0de1  */
    /* JADX WARNING: Removed duplicated region for block: B:611:0x0dee A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:618:0x0221 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:621:0x0262 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0179  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01d6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List zzf(com.google.android.gms.internal.ads.zzfc r68, com.google.android.gms.internal.ads.zzaej r69, long r70, com.google.android.gms.internal.ads.zzs r72, boolean r73, boolean r74, com.google.android.gms.internal.ads.zzfve r75) throws com.google.android.gms.internal.ads.zzaz {
        /*
            r0 = r68
            r11 = r72
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            r14 = 0
        L_0x000a:
            java.util.List r1 = r0.zzc
            int r2 = r1.size()
            if (r14 >= r2) goto L_0x0df6
            java.lang.Object r1 = r1.get(r14)
            r15 = r1
            com.google.android.gms.internal.ads.zzfc r15 = (com.google.android.gms.internal.ads.zzfc) r15
            int r1 = r15.zzd
            r2 = 1953653099(0x7472616b, float:7.681346E31)
            if (r1 == r2) goto L_0x002a
            r3 = r69
            r0 = r75
            r2 = r12
            r34 = r14
            r6 = 0
            goto L_0x0de5
        L_0x002a:
            r1 = 1836476516(0x6d766864, float:4.7662196E27)
            com.google.android.gms.internal.ads.zzfd r1 = r0.zzb(r1)
            r1.getClass()
            r2 = r1
            com.google.android.gms.internal.ads.zzfd r2 = (com.google.android.gms.internal.ads.zzfd) r2
            r2 = 1835297121(0x6d646961, float:4.4181236E27)
            com.google.android.gms.internal.ads.zzfc r2 = r15.zza(r2)
            r2.getClass()
            r3 = r2
            com.google.android.gms.internal.ads.zzfc r3 = (com.google.android.gms.internal.ads.zzfc) r3
            r3 = 1751411826(0x68646c72, float:4.3148E24)
            com.google.android.gms.internal.ads.zzfd r3 = r2.zzb(r3)
            r3.getClass()
            r4 = r3
            com.google.android.gms.internal.ads.zzfd r4 = (com.google.android.gms.internal.ads.zzfd) r4
            com.google.android.gms.internal.ads.zzen r3 = r3.zza
            int r3 = zzi(r3)
            r4 = 1936684398(0x736f756e, float:1.8971874E31)
            r16 = 5
            r8 = -1
            r7 = 1
            if (r3 != r4) goto L_0x0062
            r6 = r7
            goto L_0x0089
        L_0x0062:
            r4 = 1986618469(0x76696465, float:1.1834389E33)
            if (r3 != r4) goto L_0x0069
            r6 = 2
            goto L_0x0089
        L_0x0069:
            r4 = 1952807028(0x74657874, float:7.272211E31)
            if (r3 == r4) goto L_0x0088
            r4 = 1935832172(0x7362746c, float:1.7941596E31)
            if (r3 == r4) goto L_0x0088
            r4 = 1937072756(0x73756274, float:1.944137E31)
            if (r3 == r4) goto L_0x0088
            r4 = 1668047728(0x636c6370, float:4.3605968E21)
            if (r3 != r4) goto L_0x007e
            goto L_0x0088
        L_0x007e:
            r4 = 1835365473(0x6d657461, float:4.4382975E27)
            if (r3 != r4) goto L_0x0086
            r6 = r16
            goto L_0x0089
        L_0x0086:
            r6 = r8
            goto L_0x0089
        L_0x0088:
            r6 = 3
        L_0x0089:
            if (r6 != r8) goto L_0x0096
            r0 = r75
            r35 = r12
            r34 = r14
            r1 = r15
        L_0x0092:
            r5 = 0
            r6 = 0
            goto L_0x0da6
        L_0x0096:
            r3 = 1953196132(0x746b6864, float:7.46037E31)
            com.google.android.gms.internal.ads.zzfd r3 = r15.zzb(r3)
            r3.getClass()
            r4 = r3
            com.google.android.gms.internal.ads.zzfd r4 = (com.google.android.gms.internal.ads.zzfd) r4
            com.google.android.gms.internal.ads.zzen r3 = r3.zza
            r4 = 8
            r3.zzL(r4)
            int r17 = r3.zzg()
            int r17 = zza(r17)
            if (r17 != 0) goto L_0x00b6
            r5 = r4
            goto L_0x00b8
        L_0x00b6:
            r5 = 16
        L_0x00b8:
            r3.zzM(r5)
            int r21 = r3.zzg()
            r5 = 4
            r3.zzM(r5)
            int r20 = r3.zzc()
            r9 = 0
        L_0x00c8:
            if (r17 != 0) goto L_0x00cc
            r13 = r5
            goto L_0x00cd
        L_0x00cc:
            r13 = r4
        L_0x00cd:
            r27 = 0
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r9 >= r13) goto L_0x00f5
            byte[] r13 = r3.zzN()
            int r22 = r20 + r9
            byte r13 = r13[r22]
            if (r13 == r8) goto L_0x00f0
            if (r17 != 0) goto L_0x00e7
            long r22 = r3.zzu()
            goto L_0x00eb
        L_0x00e7:
            long r22 = r3.zzw()
        L_0x00eb:
            int r9 = (r22 > r27 ? 1 : (r22 == r27 ? 0 : -1))
            if (r9 != 0) goto L_0x00fa
            goto L_0x00f8
        L_0x00f0:
            int r9 = r9 + 1
            r11 = r72
            goto L_0x00c8
        L_0x00f5:
            r3.zzM(r13)
        L_0x00f8:
            r22 = r10
        L_0x00fa:
            r13 = 10
            r3.zzM(r13)
            int r24 = r3.zzq()
            r3.zzM(r5)
            int r9 = r3.zzg()
            int r13 = r3.zzg()
            r3.zzM(r5)
            int r5 = r3.zzg()
            int r3 = r3.zzg()
            r8 = 65536(0x10000, float:9.18355E-41)
            r4 = -65536(0xffffffffffff0000, float:NaN)
            if (r9 != 0) goto L_0x0140
            if (r13 != r8) goto L_0x013f
            if (r5 == r4) goto L_0x012e
            if (r5 != r8) goto L_0x012c
            if (r3 != 0) goto L_0x0129
            r5 = 0
            goto L_0x012a
        L_0x0129:
            r5 = r7
        L_0x012a:
            r9 = r8
            goto L_0x0138
        L_0x012c:
            r13 = r8
            goto L_0x013f
        L_0x012e:
            if (r3 != 0) goto L_0x0132
            r9 = 0
            goto L_0x0133
        L_0x0132:
            r9 = r7
        L_0x0133:
            r67 = r9
            r9 = r5
            r5 = r67
        L_0x0138:
            if (r7 == r5) goto L_0x013d
            r3 = 90
            goto L_0x0169
        L_0x013d:
            r13 = r8
            r5 = r9
        L_0x013f:
            r9 = 0
        L_0x0140:
            if (r9 != 0) goto L_0x015d
            if (r13 != r4) goto L_0x015c
            if (r5 == r8) goto L_0x0152
            if (r5 != r4) goto L_0x0150
            if (r3 != 0) goto L_0x014c
            r5 = 0
            goto L_0x014d
        L_0x014c:
            r5 = r7
        L_0x014d:
            r9 = r5
            r5 = r4
            goto L_0x0157
        L_0x0150:
            r13 = r4
            goto L_0x015c
        L_0x0152:
            if (r3 != 0) goto L_0x0156
            r9 = 0
            goto L_0x0157
        L_0x0156:
            r9 = r7
        L_0x0157:
            if (r7 == r9) goto L_0x0150
            r3 = 270(0x10e, float:3.78E-43)
            goto L_0x0169
        L_0x015c:
            r9 = 0
        L_0x015d:
            if (r9 == r4) goto L_0x0161
            if (r9 != r8) goto L_0x016c
        L_0x0161:
            if (r13 != 0) goto L_0x016c
            if (r5 != 0) goto L_0x016c
            if (r3 != r4) goto L_0x016c
            r3 = 180(0xb4, float:2.52E-43)
        L_0x0169:
            r25 = r3
            goto L_0x016e
        L_0x016c:
            r25 = 0
        L_0x016e:
            com.google.android.gms.internal.ads.zzaiv r13 = new com.google.android.gms.internal.ads.zzaiv
            r20 = r13
            r20.<init>(r21, r22, r24, r25)
            int r3 = (r70 > r10 ? 1 : (r70 == r10 ? 0 : -1))
            if (r3 != 0) goto L_0x0180
            long r3 = r13.zzb
            r34 = r3
            goto L_0x0182
        L_0x0180:
            r34 = r70
        L_0x0182:
            com.google.android.gms.internal.ads.zzen r1 = r1.zza
            com.google.android.gms.internal.ads.zzfh r1 = zzd(r1)
            long r8 = r1.zzc
            int r1 = (r34 > r10 ? 1 : (r34 == r10 ? 0 : -1))
            if (r1 != 0) goto L_0x0191
            r24 = r10
            goto L_0x019e
        L_0x0191:
            r36 = 1000000(0xf4240, double:4.940656E-318)
            java.math.RoundingMode r40 = java.math.RoundingMode.DOWN
            r38 = r8
            long r3 = com.google.android.gms.internal.ads.zzex.zzu(r34, r36, r38, r40)
            r24 = r3
        L_0x019e:
            r1 = 1835626086(0x6d696e66, float:4.515217E27)
            com.google.android.gms.internal.ads.zzfc r1 = r2.zza(r1)
            r1.getClass()
            r3 = r1
            com.google.android.gms.internal.ads.zzfc r3 = (com.google.android.gms.internal.ads.zzfc) r3
            r3 = 1937007212(0x7374626c, float:1.9362132E31)
            com.google.android.gms.internal.ads.zzfc r1 = r1.zza(r3)
            r1.getClass()
            r3 = r1
            com.google.android.gms.internal.ads.zzfc r3 = (com.google.android.gms.internal.ads.zzfc) r3
            r3 = 1835296868(0x6d646864, float:4.418049E27)
            com.google.android.gms.internal.ads.zzfd r2 = r2.zzb(r3)
            r2.getClass()
            r3 = r2
            com.google.android.gms.internal.ads.zzfd r3 = (com.google.android.gms.internal.ads.zzfd) r3
            com.google.android.gms.internal.ads.zzen r2 = r2.zza
            r4 = 8
            r2.zzL(r4)
            int r3 = r2.zzg()
            int r3 = zza(r3)
            if (r3 != 0) goto L_0x01d8
            r5 = r4
            goto L_0x01da
        L_0x01d8:
            r5 = 16
        L_0x01da:
            r2.zzM(r5)
            long r20 = r2.zzu()
            int r5 = r2.zzc()
            r4 = 0
        L_0x01e6:
            if (r3 != 0) goto L_0x01ea
            r10 = 4
            goto L_0x01ec
        L_0x01ea:
            r10 = 8
        L_0x01ec:
            if (r4 >= r10) goto L_0x0221
            byte[] r10 = r2.zzN()
            int r11 = r5 + r4
            byte r10 = r10[r11]
            r11 = -1
            if (r10 == r11) goto L_0x0219
            if (r3 != 0) goto L_0x0200
            long r3 = r2.zzu()
            goto L_0x0204
        L_0x0200:
            long r3 = r2.zzw()
        L_0x0204:
            r34 = r3
            int r3 = (r34 > r27 ? 1 : (r34 == r27 ? 0 : -1))
            if (r3 != 0) goto L_0x020b
            goto L_0x0225
        L_0x020b:
            r36 = 1000000(0xf4240, double:4.940656E-318)
            java.math.RoundingMode r40 = java.math.RoundingMode.DOWN
            r38 = r20
            long r3 = com.google.android.gms.internal.ads.zzex.zzu(r34, r36, r38, r40)
            r37 = r3
            goto L_0x022a
        L_0x0219:
            int r4 = r4 + 1
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x01e6
        L_0x0221:
            r11 = -1
            r2.zzM(r10)
        L_0x0225:
            r37 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x022a:
            int r2 = r2.zzq()
            int r3 = r2 >> 10
            r3 = r3 & 31
            int r3 = r3 + 96
            char r3 = (char) r3
            int r4 = r2 >> 5
            r4 = r4 & 31
            int r4 = r4 + 96
            char r4 = (char) r4
            r2 = r2 & 31
            int r2 = r2 + 96
            char r2 = (char) r2
            r10 = 3
            char[] r5 = new char[r10]
            r29 = 0
            r5[r29] = r3
            r5[r7] = r4
            r18 = 2
            r5[r18] = r2
            r2 = 0
        L_0x024f:
            if (r2 >= r10) goto L_0x0262
            char r3 = r5[r2]
            r4 = 97
            if (r3 < r4) goto L_0x025f
            r4 = 122(0x7a, float:1.71E-43)
            if (r3 <= r4) goto L_0x025c
            goto L_0x025f
        L_0x025c:
            int r2 = r2 + 1
            goto L_0x024f
        L_0x025f:
            r39 = 0
            goto L_0x0269
        L_0x0262:
            java.lang.String r2 = new java.lang.String
            r2.<init>(r5)
            r39 = r2
        L_0x0269:
            com.google.android.gms.internal.ads.zzaip r29 = new com.google.android.gms.internal.ads.zzaip
            r34 = r29
            r35 = r20
            r34.<init>(r35, r37, r39)
            r2 = 1937011556(0x73747364, float:1.9367383E31)
            com.google.android.gms.internal.ads.zzfd r1 = r1.zzb(r2)
            if (r1 == 0) goto L_0x0dee
            int r5 = r13.zza
            int r4 = r13.zzd
            java.lang.String r3 = r29.zzc
            com.google.android.gms.internal.ads.zzen r2 = r1.zza
            r1 = 12
            r2.zzL(r1)
            int r11 = r2.zzg()
            com.google.android.gms.internal.ads.zzais r7 = new com.google.android.gms.internal.ads.zzais
            r7.<init>(r11)
            r0 = 0
        L_0x0298:
            if (r0 >= r11) goto L_0x0cb2
            r21 = r11
            int r11 = r2.zzc()
            r34 = r14
            int r14 = r2.zzg()
            if (r14 <= 0) goto L_0x02aa
            r1 = 1
            goto L_0x02ab
        L_0x02aa:
            r1 = 0
        L_0x02ab:
            java.lang.String r10 = "childAtomSize must be positive"
            com.google.android.gms.internal.ads.zzadz.zzc(r1, r10)
            int r1 = r2.zzg()
            r36 = r4
            r4 = 1635148593(0x61766331, float:2.840654E20)
            r37 = r6
            r6 = 1701733238(0x656e6376, float:7.035987E22)
            if (r1 == r4) goto L_0x04d7
            r4 = 1635148595(0x61766333, float:2.8406544E20)
            if (r1 == r4) goto L_0x04d7
            if (r1 == r6) goto L_0x04d7
            r4 = 1831958048(0x6d317620, float:3.4326032E27)
            if (r1 == r4) goto L_0x04d7
            r4 = 1836070006(0x6d703476, float:4.646239E27)
            if (r1 == r4) goto L_0x04d7
            r4 = 1752589105(0x68766331, float:4.6541277E24)
            if (r1 == r4) goto L_0x04d7
            r4 = 1751479857(0x68657631, float:4.3344087E24)
            if (r1 == r4) goto L_0x04d7
            r4 = 1932670515(0x73323633, float:1.4119387E31)
            if (r1 == r4) goto L_0x04d7
            r4 = 1211250227(0x48323633, float:182488.8)
            if (r1 == r4) goto L_0x04d7
            r4 = 1748121139(0x68323633, float:3.366324E24)
            if (r1 == r4) goto L_0x04d7
            r4 = 1987063864(0x76703038, float:1.21789965E33)
            if (r1 == r4) goto L_0x04d7
            r4 = 1987063865(0x76703039, float:1.2178997E33)
            if (r1 == r4) goto L_0x04d7
            r4 = 1635135537(0x61763031, float:2.8383572E20)
            if (r1 == r4) goto L_0x04d7
            r4 = 1685479798(0x64766176, float:1.8179687E22)
            if (r1 == r4) goto L_0x04d7
            r4 = 1685479729(0x64766131, float:1.817961E22)
            if (r1 == r4) goto L_0x04d7
            r4 = 1685481573(0x64766865, float:1.8181686E22)
            if (r1 == r4) goto L_0x04d7
            r4 = 1685481521(0x64766831, float:1.8181627E22)
            if (r1 == r4) goto L_0x04d7
            r4 = 1634760241(0x61707631, float:2.7723345E20)
            if (r1 != r4) goto L_0x0314
            goto L_0x04d7
        L_0x0314:
            r4 = 1836069985(0x6d703461, float:4.6462328E27)
            if (r1 == r4) goto L_0x0492
            r4 = 1701733217(0x656e6361, float:7.0359778E22)
            if (r1 == r4) goto L_0x0492
            r4 = 1633889587(0x61632d33, float:2.6191674E20)
            if (r1 == r4) goto L_0x0492
            r4 = 1700998451(0x65632d33, float:6.7050686E22)
            if (r1 == r4) goto L_0x0492
            r4 = 1633889588(0x61632d34, float:2.6191676E20)
            if (r1 == r4) goto L_0x0492
            r4 = 1835823201(0x6d6c7061, float:4.573395E27)
            if (r1 == r4) goto L_0x0492
            r4 = 1685353315(0x64747363, float:1.803728E22)
            if (r1 == r4) goto L_0x0492
            r4 = 1685353317(0x64747365, float:1.8037282E22)
            if (r1 == r4) goto L_0x0492
            r4 = 1685353320(0x64747368, float:1.8037286E22)
            if (r1 == r4) goto L_0x0492
            r4 = 1685353324(0x6474736c, float:1.803729E22)
            if (r1 == r4) goto L_0x0492
            r4 = 1685353336(0x64747378, float:1.8037304E22)
            if (r1 == r4) goto L_0x0492
            r4 = 1935764850(0x73616d72, float:1.7860208E31)
            if (r1 == r4) goto L_0x0492
            r4 = 1935767394(0x73617762, float:1.7863284E31)
            if (r1 == r4) goto L_0x0492
            r4 = 1819304813(0x6c70636d, float:1.1624469E27)
            if (r1 == r4) goto L_0x0492
            r4 = 1936684916(0x736f7774, float:1.89725E31)
            if (r1 == r4) goto L_0x0492
            r4 = 1953984371(0x74776f73, float:7.841539E31)
            if (r1 == r4) goto L_0x0492
            r4 = 778924082(0x2e6d7032, float:5.398721E-11)
            if (r1 == r4) goto L_0x0492
            r4 = 778924083(0x2e6d7033, float:5.3987214E-11)
            if (r1 == r4) goto L_0x0492
            r4 = 1835557169(0x6d686131, float:4.4948762E27)
            if (r1 == r4) goto L_0x0492
            r4 = 1835560241(0x6d686d31, float:4.495783E27)
            if (r1 == r4) goto L_0x0492
            r4 = 1634492771(0x616c6163, float:2.7252807E20)
            if (r1 == r4) goto L_0x0492
            r4 = 1634492791(0x616c6177, float:2.7252842E20)
            if (r1 == r4) goto L_0x0492
            r4 = 1970037111(0x756c6177, float:2.9964816E32)
            if (r1 == r4) goto L_0x0492
            r4 = 1332770163(0x4f707573, float:4.03422899E9)
            if (r1 == r4) goto L_0x0492
            r4 = 1716281667(0x664c6143, float:2.4128923E23)
            if (r1 == r4) goto L_0x0492
            r4 = 1767992678(0x69616d66, float:1.7032808E25)
            if (r1 == r4) goto L_0x0492
            r4 = 1768973165(0x6970636d, float:1.8163233E25)
            if (r1 == r4) goto L_0x0492
            r4 = 1718641517(0x6670636d, float:2.8380051E23)
            if (r1 != r4) goto L_0x03a5
            r4 = r1
            r20 = r11
            goto L_0x0495
        L_0x03a5:
            r4 = 1414810956(0x54544d4c, float:3.64731957E12)
            if (r1 == r4) goto L_0x0417
            r4 = 1954034535(0x74783367, float:7.865797E31)
            if (r1 == r4) goto L_0x0417
            r4 = 2004251764(0x77767474, float:4.998699E33)
            if (r1 == r4) goto L_0x0417
            r4 = 1937010800(0x73747070, float:1.9366469E31)
            if (r1 == r4) goto L_0x0417
            r4 = 1664495672(0x63363038, float:3.360782E21)
            if (r1 != r4) goto L_0x03bf
            goto L_0x0417
        L_0x03bf:
            r4 = 1835365492(0x6d657474, float:4.4383032E27)
            if (r1 != r4) goto L_0x03e5
            int r1 = r11 + 16
            r2.zzL(r1)
            r1 = 0
            r2.zzy(r1)
            java.lang.String r4 = r2.zzy(r1)
            if (r4 == 0) goto L_0x03fd
            com.google.android.gms.internal.ads.zzx r1 = new com.google.android.gms.internal.ads.zzx
            r1.<init>()
            r1.zzR(r5)
            r1.zzah(r4)
            com.google.android.gms.internal.ads.zzz r1 = r1.zzan()
            r7.zzb = r1
            goto L_0x03fd
        L_0x03e5:
            r4 = 1667329389(0x63616d6d, float:4.1584024E21)
            if (r1 != r4) goto L_0x03fd
            com.google.android.gms.internal.ads.zzx r1 = new com.google.android.gms.internal.ads.zzx
            r1.<init>()
            r1.zzR(r5)
            java.lang.String r4 = "application/x-camera-motion"
            r1.zzah(r4)
            com.google.android.gms.internal.ads.zzz r1 = r1.zzan()
            r7.zzb = r1
        L_0x03fd:
            r23 = r0
            r0 = r3
            r6 = r5
            r5 = r7
            r39 = r8
            r53 = r11
            r35 = r12
            r20 = r13
            r55 = r14
            r4 = r36
            r36 = r37
            r1 = -1
            r3 = 3
            r33 = 4
            r11 = r2
            goto L_0x04d3
        L_0x0417:
            int r4 = r11 + 16
            r2.zzL(r4)
            r4 = 1414810956(0x54544d4c, float:3.64731957E12)
            r38 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r1 != r4) goto L_0x042e
            java.lang.String r1 = "application/ttml+xml"
        L_0x0428:
            r20 = r11
            r10 = r38
        L_0x042c:
            r4 = 0
            goto L_0x0465
        L_0x042e:
            r4 = 1954034535(0x74783367, float:7.865797E31)
            if (r1 != r4) goto L_0x044b
            int r1 = r14 + -16
            byte[] r4 = new byte[r1]
            r6 = 0
            r2.zzH(r4, r6, r1)
            com.google.android.gms.internal.ads.zzfyq r1 = com.google.android.gms.internal.ads.zzfyq.zzo(r4)
            java.lang.String r4 = "application/x-quicktime-tx3g"
            r20 = r11
            r10 = r38
            r67 = r4
            r4 = r1
            r1 = r67
            goto L_0x0465
        L_0x044b:
            r4 = 2004251764(0x77767474, float:4.998699E33)
            if (r1 != r4) goto L_0x0453
            java.lang.String r1 = "application/x-mp4-vtt"
            goto L_0x0428
        L_0x0453:
            r4 = 1937010800(0x73747070, float:1.9366469E31)
            if (r1 != r4) goto L_0x045f
            java.lang.String r1 = "application/ttml+xml"
            r20 = r11
            r10 = r27
            goto L_0x042c
        L_0x045f:
            r10 = 1
            r7.zzd = r10
            java.lang.String r1 = "application/x-mp4-cea-608"
            goto L_0x0428
        L_0x0465:
            com.google.android.gms.internal.ads.zzx r6 = new com.google.android.gms.internal.ads.zzx
            r6.<init>()
            r6.zzR(r5)
            r6.zzah(r1)
            r6.zzW(r3)
            r6.zzal(r10)
            r6.zzT(r4)
            com.google.android.gms.internal.ads.zzz r1 = r6.zzan()
            r7.zzb = r1
            r23 = r0
            r11 = r2
            r0 = r3
            r6 = r5
            r5 = r7
            r39 = r8
            r35 = r12
            r55 = r14
            r53 = r20
            r4 = r36
            r36 = r37
            goto L_0x04cd
        L_0x0492:
            r20 = r11
            r4 = r1
        L_0x0495:
            r11 = 12
            r1 = r2
            r10 = r2
            r2 = r4
            r4 = r3
            r3 = r20
            r32 = r4
            r41 = r36
            r6 = 8
            r4 = r14
            r19 = r5
            r11 = 0
            r36 = r37
            r6 = r32
            r37 = r7
            r7 = r74
            r39 = r8
            r9 = -1
            r8 = r72
            r11 = 16
            r9 = r37
            r11 = r10
            r10 = r0
            zzq(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r23 = r0
            r35 = r12
            r55 = r14
            r6 = r19
            r53 = r20
            r0 = r32
            r5 = r37
            r4 = r41
        L_0x04cd:
            r1 = -1
            r3 = 3
            r33 = 4
            r20 = r13
        L_0x04d3:
            r37 = r15
            goto L_0x0c91
        L_0x04d7:
            r4 = r1
            r32 = r3
            r19 = r5
            r39 = r8
            r20 = r11
            r41 = r36
            r36 = r37
            r11 = r2
            r37 = r7
            int r1 = r20 + 16
            r11.zzL(r1)
            r1 = 16
            r11.zzM(r1)
            int r2 = r11.zzq()
            int r3 = r11.zzq()
            r5 = 50
            r11.zzM(r5)
            int r5 = r11.zzc()
            if (r4 != r6) goto L_0x0542
            r7 = r20
            android.util.Pair r4 = zzj(r11, r7, r14)
            if (r4 == 0) goto L_0x0535
            java.lang.Object r6 = r4.first
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r8 = r72
            if (r8 != 0) goto L_0x051e
            r20 = r6
            r1 = r37
            r9 = 0
            goto L_0x052c
        L_0x051e:
            java.lang.Object r9 = r4.second
            com.google.android.gms.internal.ads.zzajq r9 = (com.google.android.gms.internal.ads.zzajq) r9
            java.lang.String r9 = r9.zzb
            com.google.android.gms.internal.ads.zzs r9 = r8.zzb(r9)
            r20 = r6
            r1 = r37
        L_0x052c:
            com.google.android.gms.internal.ads.zzajq[] r6 = r1.zza
            java.lang.Object r4 = r4.second
            com.google.android.gms.internal.ads.zzajq r4 = (com.google.android.gms.internal.ads.zzajq) r4
            r6[r0] = r4
            goto L_0x053c
        L_0x0535:
            r8 = r72
            r1 = r37
            r20 = r6
            r9 = r8
        L_0x053c:
            r11.zzL(r5)
            r4 = r20
            goto L_0x0549
        L_0x0542:
            r8 = r72
            r7 = r20
            r1 = r37
            r9 = r8
        L_0x0549:
            r6 = 1831958048(0x6d317620, float:3.4326032E27)
            if (r4 != r6) goto L_0x0556
            java.lang.String r6 = "video/mpeg"
            r67 = r6
            r6 = r4
            r4 = r67
            goto L_0x0560
        L_0x0556:
            r6 = 1211250227(0x48323633, float:182488.8)
            if (r4 != r6) goto L_0x055e
            java.lang.String r4 = "video/3gpp"
            goto L_0x0560
        L_0x055e:
            r6 = r4
            r4 = 0
        L_0x0560:
            r20 = 1065353216(0x3f800000, float:1.0)
            r23 = r0
            r49 = r2
            r48 = r3
            r52 = r6
            r38 = r9
            r35 = r12
            r37 = r15
            r51 = r20
            r0 = 0
            r2 = -1
            r3 = -1
            r8 = 8
            r9 = 0
            r15 = -1
            r22 = 0
            r30 = 0
            r31 = 0
            r42 = 0
            r43 = -1
            r44 = -1
            r45 = 0
            r46 = -1
            r47 = -1
            r50 = 0
            r12 = r5
            r20 = r13
            r5 = 8
            r13 = -1
        L_0x0593:
            int r6 = r12 - r7
            if (r6 >= r14) goto L_0x0bbd
            r11.zzL(r12)
            int r6 = r11.zzc()
            int r53 = r11.zzg()
            if (r53 != 0) goto L_0x05b2
            int r53 = r11.zzc()
            r54 = r12
            int r12 = r53 - r7
            if (r12 != r14) goto L_0x05b0
            goto L_0x0bbd
        L_0x05b0:
            r12 = 0
            goto L_0x05b6
        L_0x05b2:
            r54 = r12
            r12 = r53
        L_0x05b6:
            if (r12 <= 0) goto L_0x05bc
            r53 = r7
            r7 = 1
            goto L_0x05bf
        L_0x05bc:
            r53 = r7
            r7 = 0
        L_0x05bf:
            com.google.android.gms.internal.ads.zzadz.zzc(r7, r10)
            int r7 = r11.zzg()
            r55 = r14
            r14 = 1635148611(0x61766343, float:2.8406573E20)
            if (r7 != r14) goto L_0x061a
            int r6 = r6 + 8
            if (r4 != 0) goto L_0x05d4
            r0 = 0
            r7 = 1
            goto L_0x05d6
        L_0x05d4:
            r0 = 0
            r7 = 0
        L_0x05d6:
            com.google.android.gms.internal.ads.zzadz.zzc(r7, r0)
            r11.zzL(r6)
            com.google.android.gms.internal.ads.zzacz r0 = com.google.android.gms.internal.ads.zzacz.zza(r11)
            java.util.List r2 = r0.zza
            int r3 = r0.zzb
            r1.zzc = r3
            if (r42 != 0) goto L_0x05ee
            float r3 = r0.zzk
            r51 = r3
            r7 = 0
            goto L_0x05ef
        L_0x05ee:
            r7 = 1
        L_0x05ef:
            java.lang.String r3 = r0.zzl
            int r4 = r0.zzj
            int r5 = r0.zzg
            int r6 = r0.zzh
            int r8 = r0.zzi
            int r14 = r0.zze
            int r0 = r0.zzf
            java.lang.String r15 = "video/avc"
            r56 = r1
            r50 = r3
            r43 = r4
            r60 = r6
            r42 = r7
            r59 = r10
            r4 = r15
            r1 = -1
            r3 = 3
            r33 = 4
            r15 = r5
            r5 = r14
            r67 = r8
            r8 = r0
            r0 = r2
            r2 = r67
            goto L_0x0baf
        L_0x061a:
            r14 = 1752589123(0x68766343, float:4.6541328E24)
            if (r7 != r14) goto L_0x0687
            int r6 = r6 + 8
            if (r4 != 0) goto L_0x0626
            r0 = 0
            r7 = 1
            goto L_0x0628
        L_0x0626:
            r0 = 0
            r7 = 0
        L_0x0628:
            com.google.android.gms.internal.ads.zzadz.zzc(r7, r0)
            r11.zzL(r6)
            com.google.android.gms.internal.ads.zzaek r0 = com.google.android.gms.internal.ads.zzaek.zza(r11)
            java.util.List r2 = r0.zza
            int r3 = r0.zzb
            r1.zzc = r3
            if (r42 != 0) goto L_0x0640
            float r3 = r0.zzl
            r51 = r3
            r7 = 0
            goto L_0x0641
        L_0x0640:
            r7 = 1
        L_0x0641:
            int r3 = r0.zzm
            int r4 = r0.zzc
            java.lang.String r5 = r0.zzn
            int r6 = r0.zzk
            r14 = -1
            if (r6 == r14) goto L_0x064d
            r13 = r6
        L_0x064d:
            int r6 = r0.zzd
            int r8 = r0.zze
            int r9 = r0.zzh
            int r15 = r0.zzi
            int r14 = r0.zzj
            r43 = r2
            int r2 = r0.zzf
            r42 = r2
            int r2 = r0.zzg
            com.google.android.gms.internal.ads.zzfs r0 = r0.zzo
            java.lang.String r44 = "video/hevc"
            r56 = r1
            r50 = r5
            r47 = r6
            r46 = r8
            r59 = r10
            r60 = r15
            r5 = r42
            r1 = -1
            r33 = 4
            r8 = r2
            r42 = r7
            r15 = r9
            r2 = r14
            r9 = r0
            r0 = r43
            r43 = r3
            r3 = 3
            r67 = r44
            r44 = r4
            r4 = r67
            goto L_0x0baf
        L_0x0687:
            r14 = 1818785347(0x6c687643, float:1.12411706E27)
            if (r7 != r14) goto L_0x073a
            int r6 = r6 + 8
            java.lang.String r7 = "video/hevc"
            boolean r4 = r7.equals(r4)
            java.lang.String r7 = "lhvC must follow hvcC atom"
            com.google.android.gms.internal.ads.zzadz.zzc(r4, r7)
            if (r9 == 0) goto L_0x06a8
            com.google.android.gms.internal.ads.zzfyq r4 = r9.zza
            int r4 = r4.size()
            r14 = 2
            if (r4 < r14) goto L_0x06a6
            r7 = 1
            goto L_0x06ab
        L_0x06a6:
            r7 = 0
            goto L_0x06ab
        L_0x06a8:
            r14 = 2
            r7 = 0
            r9 = 0
        L_0x06ab:
            java.lang.String r4 = "must have at least two layers"
            com.google.android.gms.internal.ads.zzadz.zzc(r7, r4)
            r11.zzL(r6)
            r9.getClass()
            r4 = r9
            com.google.android.gms.internal.ads.zzfs r4 = (com.google.android.gms.internal.ads.zzfs) r4
            com.google.android.gms.internal.ads.zzaek r4 = com.google.android.gms.internal.ads.zzaek.zzb(r11, r9)
            int r6 = r1.zzc
            int r7 = r4.zzb
            if (r6 != r7) goto L_0x06c5
            r7 = 1
            goto L_0x06c6
        L_0x06c5:
            r7 = 0
        L_0x06c6:
            java.lang.String r6 = "nalUnitLengthFieldLength must be same for both hvcC and lhvC atoms"
            com.google.android.gms.internal.ads.zzadz.zzc(r7, r6)
            int r6 = r4.zzh
            r7 = -1
            if (r6 == r7) goto L_0x06da
            if (r15 != r6) goto L_0x06d4
            r6 = 1
            goto L_0x06d5
        L_0x06d4:
            r6 = 0
        L_0x06d5:
            java.lang.String r14 = "colorSpace must be the same for both views"
            com.google.android.gms.internal.ads.zzadz.zzc(r6, r14)
        L_0x06da:
            int r6 = r4.zzi
            if (r6 == r7) goto L_0x06e8
            if (r3 != r6) goto L_0x06e2
            r6 = 1
            goto L_0x06e3
        L_0x06e2:
            r6 = 0
        L_0x06e3:
            java.lang.String r14 = "colorRange must be the same for both views"
            com.google.android.gms.internal.ads.zzadz.zzc(r6, r14)
        L_0x06e8:
            int r6 = r4.zzj
            if (r6 == r7) goto L_0x06f6
            if (r2 != r6) goto L_0x06f0
            r7 = 1
            goto L_0x06f1
        L_0x06f0:
            r7 = 0
        L_0x06f1:
            java.lang.String r6 = "colorTransfer must be the same for both views"
            com.google.android.gms.internal.ads.zzadz.zzc(r7, r6)
        L_0x06f6:
            int r6 = r4.zzf
            if (r5 != r6) goto L_0x06fc
            r7 = 1
            goto L_0x06fd
        L_0x06fc:
            r7 = 0
        L_0x06fd:
            java.lang.String r6 = "bitdepthLuma must be the same for both views"
            com.google.android.gms.internal.ads.zzadz.zzc(r7, r6)
            int r6 = r4.zzg
            if (r8 != r6) goto L_0x0708
            r7 = 1
            goto L_0x0709
        L_0x0708:
            r7 = 0
        L_0x0709:
            java.lang.String r6 = "bitdepthChroma must be the same for both views"
            com.google.android.gms.internal.ads.zzadz.zzc(r7, r6)
            if (r0 == 0) goto L_0x0724
            int r6 = com.google.android.gms.internal.ads.zzfyq.zzd
            com.google.android.gms.internal.ads.zzfyn r6 = new com.google.android.gms.internal.ads.zzfyn
            r6.<init>()
            r6.zzh(r0)
            java.util.List r0 = r4.zza
            r6.zzh(r0)
            com.google.android.gms.internal.ads.zzfyq r0 = r6.zzi()
            goto L_0x072b
        L_0x0724:
            java.lang.String r0 = "initializationData must be already set from hvcC atom"
            r6 = 0
            com.google.android.gms.internal.ads.zzadz.zzc(r6, r0)
            r0 = 0
        L_0x072b:
            java.lang.String r4 = r4.zzn
            java.lang.String r6 = "video/mv-hevc"
            r56 = r1
            r60 = r3
            r50 = r4
            r4 = r6
            r59 = r10
            goto L_0x083e
        L_0x073a:
            r14 = 1986361461(0x76657875, float:1.16355385E33)
            if (r7 != r14) goto L_0x0853
            int r7 = r6 + 8
            r11.zzL(r7)
            int r7 = r11.zzc()
            r56 = r1
            r14 = r7
            r7 = 0
        L_0x074c:
            int r1 = r14 - r6
            if (r1 >= r12) goto L_0x07df
            r11.zzL(r14)
            int r1 = r11.zzg()
            if (r1 <= 0) goto L_0x075d
            r57 = r8
            r8 = 1
            goto L_0x0760
        L_0x075d:
            r57 = r8
            r8 = 0
        L_0x0760:
            com.google.android.gms.internal.ads.zzadz.zzc(r8, r10)
            int r8 = r11.zzg()
            r58 = r5
            r5 = 1702454643(0x65796573, float:7.360879E22)
            if (r8 != r5) goto L_0x07d0
            int r5 = r14 + 8
            r11.zzL(r5)
            int r5 = r11.zzc()
        L_0x0777:
            int r7 = r5 - r14
            if (r7 >= r1) goto L_0x07ca
            r11.zzL(r5)
            int r7 = r11.zzg()
            if (r7 <= 0) goto L_0x0786
            r8 = 1
            goto L_0x0787
        L_0x0786:
            r8 = 0
        L_0x0787:
            com.google.android.gms.internal.ads.zzadz.zzc(r8, r10)
            int r8 = r11.zzg()
            r59 = r10
            r10 = 1937011305(0x73747269, float:1.936708E31)
            if (r8 != r10) goto L_0x07c4
            r8 = 4
            r11.zzM(r8)
            int r5 = r11.zzm()
            r7 = r5 & 1
            r10 = r5 & 2
            r8 = 2
            if (r10 != r8) goto L_0x07a6
            r8 = 1
            goto L_0x07a7
        L_0x07a6:
            r8 = 0
        L_0x07a7:
            r5 = r5 & 8
            r10 = 8
            if (r5 != r10) goto L_0x07af
            r5 = 1
            goto L_0x07b0
        L_0x07af:
            r5 = 0
        L_0x07b0:
            r10 = 1
            if (r10 == r7) goto L_0x07b5
            r7 = 0
            goto L_0x07b6
        L_0x07b5:
            r7 = r10
        L_0x07b6:
            com.google.android.gms.internal.ads.zzaio r10 = new com.google.android.gms.internal.ads.zzaio
            r60 = r3
            com.google.android.gms.internal.ads.zzair r3 = new com.google.android.gms.internal.ads.zzair
            r3.<init>(r7, r8, r5)
            r10.<init>(r3)
            r7 = r10
            goto L_0x07d4
        L_0x07c4:
            r60 = r3
            int r5 = r5 + r7
            r10 = r59
            goto L_0x0777
        L_0x07ca:
            r60 = r3
            r59 = r10
            r7 = 0
            goto L_0x07d4
        L_0x07d0:
            r60 = r3
            r59 = r10
        L_0x07d4:
            int r14 = r14 + r1
            r8 = r57
            r5 = r58
            r10 = r59
            r3 = r60
            goto L_0x074c
        L_0x07df:
            r60 = r3
            r58 = r5
            r57 = r8
            r59 = r10
            if (r7 != 0) goto L_0x07eb
            r5 = 0
            goto L_0x07f0
        L_0x07eb:
            com.google.android.gms.internal.ads.zzaiw r5 = new com.google.android.gms.internal.ads.zzaiw
            r5.<init>(r7)
        L_0x07f0:
            if (r5 == 0) goto L_0x0849
            if (r9 == 0) goto L_0x081d
            com.google.android.gms.internal.ads.zzfyq r1 = r9.zza
            int r1 = r1.size()
            r3 = 2
            if (r1 < r3) goto L_0x081a
            boolean r1 = r5.zzb()
            java.lang.String r3 = "both eye views must be marked as available"
            com.google.android.gms.internal.ads.zzadz.zzc(r1, r3)
            com.google.android.gms.internal.ads.zzaio r1 = r5.zza
            com.google.android.gms.internal.ads.zzair r1 = r1.zza
            boolean r1 = r1.zzc
            r3 = 1
            r1 = r1 ^ r3
            java.lang.String r5 = "for MV-HEVC, eye_views_reversed must be set to false"
            com.google.android.gms.internal.ads.zzadz.zzc(r1, r5)
            goto L_0x0849
        L_0x081a:
            r3 = 1
            r1 = -1
            goto L_0x0820
        L_0x081d:
            r3 = 1
            r1 = -1
            r9 = 0
        L_0x0820:
            if (r13 != r1) goto L_0x0840
            com.google.android.gms.internal.ads.zzaio r1 = r5.zza
            com.google.android.gms.internal.ads.zzair r1 = r1.zza
            boolean r1 = r1.zzc
            if (r3 == r1) goto L_0x0838
            r8 = r57
            r5 = r58
            r1 = -1
            r3 = 3
            r13 = 4
            goto L_0x0845
        L_0x0838:
            r13 = r16
            r8 = r57
            r5 = r58
        L_0x083e:
            r1 = -1
            goto L_0x0844
        L_0x0840:
            r8 = r57
            r5 = r58
        L_0x0844:
            r3 = 3
        L_0x0845:
            r33 = 4
            goto L_0x0baf
        L_0x0849:
            r61 = r9
            r66 = r13
            r1 = -1
            r3 = 3
            r33 = 4
            goto L_0x0ba7
        L_0x0853:
            r56 = r1
            r60 = r3
            r58 = r5
            r57 = r8
            r59 = r10
            r1 = 1685480259(0x64766343, float:1.8180206E22)
            if (r7 == r1) goto L_0x0b6b
            r1 = 1685485123(0x64767643, float:1.8185683E22)
            if (r7 == r1) goto L_0x0b6b
            r1 = 1685485379(0x64767743, float:1.8185971E22)
            if (r7 != r1) goto L_0x086e
            goto L_0x0b6b
        L_0x086e:
            r1 = 1987076931(0x76706343, float:1.21891066E33)
            if (r7 != r1) goto L_0x0909
            int r6 = r6 + 12
            if (r4 != 0) goto L_0x087a
            r1 = 0
            r7 = 1
            goto L_0x087c
        L_0x087a:
            r1 = 0
            r7 = 0
        L_0x087c:
            com.google.android.gms.internal.ads.zzadz.zzc(r7, r1)
            r11.zzL(r6)
            int r1 = r11.zzm()
            byte r1 = (byte) r1
            int r2 = r11.zzm()
            byte r2 = (byte) r2
            int r3 = r11.zzm()
            int r4 = r3 >> 4
            int r5 = r3 >> 1
            r6 = 1987063864(0x76703038, float:1.21789965E33)
            r8 = r52
            if (r8 != r6) goto L_0x089e
            java.lang.String r6 = "video/x-vnd.on2.vp8"
            goto L_0x08a0
        L_0x089e:
            java.lang.String r6 = "video/x-vnd.on2.vp9"
        L_0x08a0:
            java.lang.String r7 = "video/x-vnd.on2.vp9"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L_0x08df
            r0 = r5 & 7
            byte r5 = (byte) r4
            int r7 = com.google.android.gms.internal.ads.zzdk.zza
            byte r0 = (byte) r0
            r10 = 12
            byte[] r7 = new byte[r10]
            r14 = 1
            r15 = 0
            r7[r15] = r14
            r7[r14] = r14
            r15 = 2
            r7[r15] = r1
            r1 = 3
            r7[r1] = r15
            r33 = 4
            r7[r33] = r14
            r7[r16] = r2
            r2 = 6
            r7[r2] = r1
            r2 = 7
            r7[r2] = r14
            r2 = 8
            r7[r2] = r5
            r2 = 9
            r7[r2] = r33
            r5 = 10
            r7[r5] = r14
            r2 = 11
            r7[r2] = r0
            com.google.android.gms.internal.ads.zzfyq r0 = com.google.android.gms.internal.ads.zzfyq.zzo(r7)
            goto L_0x08e7
        L_0x08df:
            r1 = 3
            r5 = 10
            r10 = 12
            r14 = 1
            r33 = 4
        L_0x08e7:
            r2 = r3 & 1
            int r3 = r11.zzm()
            int r7 = r11.zzm()
            int r3 = com.google.android.gms.internal.ads.zzk.zza(r3)
            if (r14 == r2) goto L_0x08f9
            r2 = 2
            goto L_0x08fa
        L_0x08f9:
            r2 = 1
        L_0x08fa:
            int r7 = com.google.android.gms.internal.ads.zzk.zzb(r7)
            r60 = r2
            r15 = r3
            r5 = r4
            r2 = r7
            r52 = r8
            r3 = r1
            r8 = r5
            r4 = r6
            goto L_0x0941
        L_0x0909:
            r8 = r52
            r1 = 3
            r5 = 10
            r10 = 12
            r33 = 4
            r3 = 1635135811(0x61763143, float:2.8384055E20)
            if (r7 != r3) goto L_0x0944
            int r0 = r12 + -8
            int r6 = r6 + 8
            byte[] r2 = new byte[r0]
            r3 = 0
            r11.zzH(r2, r3, r0)
            com.google.android.gms.internal.ads.zzfyq r0 = com.google.android.gms.internal.ads.zzfyq.zzo(r2)
            r11.zzL(r6)
            com.google.android.gms.internal.ads.zzk r2 = zzl(r11)
            int r3 = r2.zzf
            int r4 = r2.zzg
            int r6 = r2.zzb
            int r7 = r2.zzc
            int r2 = r2.zzd
            java.lang.String r14 = "video/av01"
            r5 = r3
            r15 = r6
            r60 = r7
            r52 = r8
            r3 = r1
            r8 = r4
            r4 = r14
        L_0x0941:
            r1 = -1
            goto L_0x0baf
        L_0x0944:
            r3 = 1668050025(0x636c6c69, float:4.3612434E21)
            if (r7 != r3) goto L_0x096e
            if (r22 != 0) goto L_0x094f
            java.nio.ByteBuffer r22 = zzp()
        L_0x094f:
            r3 = r22
            r6 = 21
            r3.position(r6)
            short r6 = r11.zzE()
            r3.putShort(r6)
            short r6 = r11.zzE()
            r3.putShort(r6)
            r22 = r3
            r52 = r8
            r8 = r57
            r5 = r58
            r3 = r1
            goto L_0x0941
        L_0x096e:
            r3 = 1835295606(0x6d646376, float:4.4176764E27)
            if (r7 != r3) goto L_0x09e5
            if (r22 != 0) goto L_0x0979
            java.nio.ByteBuffer r22 = zzp()
        L_0x0979:
            r3 = r22
            short r6 = r11.zzE()
            short r7 = r11.zzE()
            short r14 = r11.zzE()
            short r5 = r11.zzE()
            short r10 = r11.zzE()
            short r1 = r11.zzE()
            r52 = r8
            short r8 = r11.zzE()
            r61 = r9
            short r9 = r11.zzE()
            long r62 = r11.zzu()
            long r64 = r11.zzu()
            r66 = r13
            r13 = 1
            r3.position(r13)
            r3.putShort(r10)
            r3.putShort(r1)
            r3.putShort(r6)
            r3.putShort(r7)
            r3.putShort(r14)
            r3.putShort(r5)
            r3.putShort(r8)
            r3.putShort(r9)
            r5 = 10000(0x2710, double:4.9407E-320)
            long r5 = r62 / r5
            int r1 = (int) r5
            short r1 = (short) r1
            r3.putShort(r1)
            r5 = 10000(0x2710, double:4.9407E-320)
            long r5 = r64 / r5
            int r1 = (int) r5
            short r1 = (short) r1
            r3.putShort(r1)
            r22 = r3
        L_0x09d9:
            r8 = r57
            r5 = r58
            r9 = r61
            r13 = r66
            r1 = -1
            r3 = 3
            goto L_0x0baf
        L_0x09e5:
            r52 = r8
            r61 = r9
            r66 = r13
            r1 = 1681012275(0x64323633, float:1.3149704E22)
            if (r7 != r1) goto L_0x09fe
            if (r4 != 0) goto L_0x09f5
            r1 = 0
            r7 = 1
            goto L_0x09f7
        L_0x09f5:
            r1 = 0
            r7 = 0
        L_0x09f7:
            com.google.android.gms.internal.ads.zzadz.zzc(r7, r1)
            java.lang.String r3 = "video/3gpp"
        L_0x09fc:
            r4 = r3
            goto L_0x09d9
        L_0x09fe:
            r1 = 0
            r3 = 1702061171(0x65736473, float:7.183675E22)
            if (r7 != r3) goto L_0x0a21
            if (r4 != 0) goto L_0x0a08
            r7 = 1
            goto L_0x0a09
        L_0x0a08:
            r7 = 0
        L_0x0a09:
            com.google.android.gms.internal.ads.zzadz.zzc(r7, r1)
            com.google.android.gms.internal.ads.zzain r1 = zzo(r11, r6)
            java.lang.String r3 = r1.zza
            byte[] r4 = r1.zzb
            if (r4 == 0) goto L_0x0a1e
            com.google.android.gms.internal.ads.zzfyq r0 = com.google.android.gms.internal.ads.zzfyq.zzo(r4)
        L_0x0a1e:
            r31 = r1
            goto L_0x09fc
        L_0x0a21:
            r1 = 1651798644(0x62747274, float:1.1273132E21)
            if (r7 != r1) goto L_0x0a2d
            com.google.android.gms.internal.ads.zzail r1 = zzn(r11, r6)
            r30 = r1
            goto L_0x09d9
        L_0x0a2d:
            r1 = 1885434736(0x70617370, float:2.7909473E29)
            if (r7 != r1) goto L_0x0a52
            int r6 = r6 + 8
            r11.zzL(r6)
            int r1 = r11.zzp()
            int r3 = r11.zzp()
            float r1 = (float) r1
            float r3 = (float) r3
            float r1 = r1 / r3
            r51 = r1
            r8 = r57
            r5 = r58
            r9 = r61
            r13 = r66
            r1 = -1
            r3 = 3
            r42 = 1
            goto L_0x0baf
        L_0x0a52:
            r1 = 1937126244(0x73763364, float:1.9506033E31)
            if (r7 != r1) goto L_0x0a8a
            int r1 = r6 + 8
        L_0x0a59:
            int r3 = r1 - r6
            if (r3 >= r12) goto L_0x0a7c
            r11.zzL(r1)
            int r3 = r11.zzg()
            int r3 = r3 + r1
            int r5 = r11.zzg()
            r7 = 1886547818(0x70726f6a, float:3.0012025E29)
            if (r5 != r7) goto L_0x0a7a
            byte[] r5 = r11.zzN()
            byte[] r1 = java.util.Arrays.copyOfRange(r5, r1, r3)
            r45 = r1
            goto L_0x09d9
        L_0x0a7a:
            r1 = r3
            goto L_0x0a59
        L_0x0a7c:
            r8 = r57
            r5 = r58
            r9 = r61
            r13 = r66
            r1 = -1
            r3 = 3
            r45 = 0
            goto L_0x0baf
        L_0x0a8a:
            r1 = 1936995172(0x73743364, float:1.9347576E31)
            if (r7 != r1) goto L_0x0ad2
            int r1 = r11.zzm()
            r3 = 3
            r11.zzM(r3)
            if (r1 != 0) goto L_0x0acf
            int r1 = r11.zzm()
            if (r1 == 0) goto L_0x0ac5
            r5 = 1
            if (r1 == r5) goto L_0x0abb
            r5 = 2
            if (r1 == r5) goto L_0x0ab1
            if (r1 == r3) goto L_0x0aa8
            goto L_0x0acf
        L_0x0aa8:
            r13 = r3
            r8 = r57
            r5 = r58
            r9 = r61
            goto L_0x0941
        L_0x0ab1:
            r8 = r57
            r5 = r58
            r9 = r61
            r1 = -1
            r13 = 2
            goto L_0x0baf
        L_0x0abb:
            r8 = r57
            r5 = r58
            r9 = r61
            r1 = -1
            r13 = 1
            goto L_0x0baf
        L_0x0ac5:
            r8 = r57
            r5 = r58
            r9 = r61
            r1 = -1
            r13 = 0
            goto L_0x0baf
        L_0x0acf:
            r1 = -1
            goto L_0x0ba7
        L_0x0ad2:
            r3 = 3
            r1 = 1634760259(0x61707643, float:2.7723376E20)
            if (r7 != r1) goto L_0x0b0b
            int r6 = r6 + 12
            int r0 = r12 + -12
            byte[] r1 = new byte[r0]
            r11.zzL(r6)
            r2 = 0
            r11.zzH(r1, r2, r0)
            com.google.android.gms.internal.ads.zzfyq r0 = com.google.android.gms.internal.ads.zzfyq.zzo(r1)
            com.google.android.gms.internal.ads.zzen r2 = new com.google.android.gms.internal.ads.zzen
            r2.<init>((byte[]) r1)
            com.google.android.gms.internal.ads.zzk r1 = zzk(r2)
            int r2 = r1.zzf
            int r4 = r1.zzg
            int r5 = r1.zzb
            int r6 = r1.zzc
            int r1 = r1.zzd
            java.lang.String r7 = "video/apv"
            r8 = r4
            r15 = r5
            r60 = r6
            r4 = r7
            r9 = r61
            r13 = r66
            r5 = r2
            r2 = r1
            goto L_0x0941
        L_0x0b0b:
            r1 = 1668246642(0x636f6c72, float:4.4165861E21)
            if (r7 != r1) goto L_0x0acf
            r1 = -1
            if (r15 != r1) goto L_0x0ba7
            if (r2 != r1) goto L_0x0b69
            int r2 = r11.zzg()
            r5 = 1852009592(0x6e636c78, float:1.7596057E28)
            if (r2 == r5) goto L_0x0b37
            r5 = 1852009571(0x6e636c63, float:1.7596032E28)
            if (r2 != r5) goto L_0x0b24
            goto L_0x0b37
        L_0x0b24:
            java.lang.String r5 = "Unsupported color type: "
            java.lang.String r2 = com.google.android.gms.internal.ads.zzff.zze(r2)
            java.lang.String r2 = r5.concat(r2)
            java.lang.String r5 = "BoxParsers"
            com.google.android.gms.internal.ads.zzea.zzf(r5, r2)
            r2 = r1
            r15 = r2
            goto L_0x0ba7
        L_0x0b37:
            int r2 = r11.zzq()
            int r5 = r11.zzq()
            r6 = 2
            r11.zzM(r6)
            r6 = 19
            if (r12 != r6) goto L_0x0b55
            int r6 = r11.zzm()
            r6 = r6 & 128(0x80, float:1.794E-43)
            if (r6 == 0) goto L_0x0b53
            r12 = 19
            r7 = 1
            goto L_0x0b56
        L_0x0b53:
            r12 = 19
        L_0x0b55:
            r7 = 0
        L_0x0b56:
            int r2 = com.google.android.gms.internal.ads.zzk.zza(r2)
            r6 = 1
            if (r6 == r7) goto L_0x0b5f
            r9 = 2
            goto L_0x0b60
        L_0x0b5f:
            r9 = 1
        L_0x0b60:
            int r5 = com.google.android.gms.internal.ads.zzk.zzb(r5)
            r15 = r2
            r2 = r5
            r60 = r9
            goto L_0x0ba7
        L_0x0b69:
            r15 = r1
            goto L_0x0ba7
        L_0x0b6b:
            r61 = r9
            r66 = r13
            r1 = -1
            r3 = 3
            r33 = 4
            int r5 = r12 + -8
            int r6 = r6 + 8
            byte[] r7 = new byte[r5]
            r8 = 0
            r11.zzH(r7, r8, r5)
            if (r0 == 0) goto L_0x0b91
            int r5 = com.google.android.gms.internal.ads.zzfyq.zzd
            com.google.android.gms.internal.ads.zzfyn r5 = new com.google.android.gms.internal.ads.zzfyn
            r5.<init>()
            r5.zzh(r0)
            r5.zzf(r7)
            com.google.android.gms.internal.ads.zzfyq r5 = r5.zzi()
            goto L_0x0b97
        L_0x0b91:
            java.lang.String r0 = "initializationData must already be set from hvcC or avcC atom"
            com.google.android.gms.internal.ads.zzadz.zzc(r8, r0)
            r5 = 0
        L_0x0b97:
            r11.zzL(r6)
            com.google.android.gms.internal.ads.zzez r0 = com.google.android.gms.internal.ads.zzez.zza(r11)
            if (r0 == 0) goto L_0x0ba6
            java.lang.String r0 = r0.zza
            java.lang.String r4 = "video/dolby-vision"
            r50 = r0
        L_0x0ba6:
            r0 = r5
        L_0x0ba7:
            r8 = r57
            r5 = r58
            r9 = r61
            r13 = r66
        L_0x0baf:
            int r12 = r54 + r12
            r7 = r53
            r14 = r55
            r1 = r56
            r10 = r59
            r3 = r60
            goto L_0x0593
        L_0x0bbd:
            r56 = r1
            r60 = r3
            r58 = r5
            r53 = r7
            r57 = r8
            r66 = r13
            r55 = r14
            r1 = -1
            r3 = 3
            r33 = 4
            if (r4 != 0) goto L_0x0bdb
            r6 = r19
            r0 = r32
            r4 = r41
            r5 = r56
            goto L_0x0c91
        L_0x0bdb:
            com.google.android.gms.internal.ads.zzx r5 = new com.google.android.gms.internal.ads.zzx
            r5.<init>()
            r6 = r19
            r5.zzR(r6)
            r5.zzah(r4)
            r4 = r50
            r5.zzE(r4)
            r4 = r49
            r5.zzam(r4)
            r4 = r48
            r5.zzQ(r4)
            r4 = r47
            r5.zzK(r4)
            r4 = r46
            r5.zzJ(r4)
            r4 = r51
            r5.zzad(r4)
            r4 = r41
            r5.zzag(r4)
            r7 = r45
            r5.zzae(r7)
            r13 = r66
            r5.zzak(r13)
            r5.zzT(r0)
            r0 = r43
            r5.zzY(r0)
            r0 = r44
            r5.zzZ(r0)
            r8 = r38
            r5.zzL(r8)
            r0 = r32
            r5.zzW(r0)
            com.google.android.gms.internal.ads.zzi r7 = new com.google.android.gms.internal.ads.zzi
            r7.<init>()
            r7.zzc(r15)
            r8 = r60
            r7.zzb(r8)
            r7.zzd(r2)
            if (r22 == 0) goto L_0x0c43
            byte[] r2 = r22.array()
            goto L_0x0c44
        L_0x0c43:
            r2 = 0
        L_0x0c44:
            r7.zze(r2)
            r2 = r58
            r7.zzf(r2)
            r8 = r57
            r7.zza(r8)
            com.google.android.gms.internal.ads.zzk r2 = r7.zzg()
            r5.zzF(r2)
            if (r30 == 0) goto L_0x0c71
            long r7 = r30.zza
            int r2 = com.google.android.gms.internal.ads.zzgbt.zzf(r7)
            r5.zzC(r2)
            long r7 = r30.zzb
            int r2 = com.google.android.gms.internal.ads.zzgbt.zzf(r7)
            r5.zzac(r2)
            goto L_0x0c89
        L_0x0c71:
            if (r31 == 0) goto L_0x0c89
            long r7 = r31.zzc
            int r2 = com.google.android.gms.internal.ads.zzgbt.zzf(r7)
            r5.zzC(r2)
            long r7 = r31.zzd
            int r2 = com.google.android.gms.internal.ads.zzgbt.zzf(r7)
            r5.zzac(r2)
        L_0x0c89:
            com.google.android.gms.internal.ads.zzz r2 = r5.zzan()
            r5 = r56
            r5.zzb = r2
        L_0x0c91:
            int r2 = r53 + r55
            r11.zzL(r2)
            int r2 = r23 + 1
            r10 = r3
            r7 = r5
            r5 = r6
            r13 = r20
            r14 = r34
            r12 = r35
            r6 = r36
            r15 = r37
            r8 = r39
            r1 = 12
            r18 = 2
            r3 = r0
            r0 = r2
            r2 = r11
            r11 = r21
            goto L_0x0298
        L_0x0cb2:
            r36 = r6
            r5 = r7
            r39 = r8
            r35 = r12
            r20 = r13
            r34 = r14
            r37 = r15
            if (r73 != 0) goto L_0x0d35
            r0 = 1701082227(0x65647473, float:6.742798E22)
            r1 = r37
            com.google.android.gms.internal.ads.zzfc r0 = r1.zza(r0)
            if (r0 == 0) goto L_0x0d37
            r2 = 1701606260(0x656c7374, float:6.9788014E22)
            com.google.android.gms.internal.ads.zzfd r0 = r0.zzb(r2)
            if (r0 != 0) goto L_0x0cd7
            r0 = 0
            goto L_0x0d26
        L_0x0cd7:
            com.google.android.gms.internal.ads.zzen r0 = r0.zza
            r2 = 8
            r0.zzL(r2)
            int r2 = r0.zzg()
            int r2 = zza(r2)
            int r3 = r0.zzp()
            long[] r4 = new long[r3]
            long[] r6 = new long[r3]
            r7 = 0
        L_0x0cef:
            if (r7 >= r3) goto L_0x0d22
            r8 = 1
            if (r2 != r8) goto L_0x0cf9
            long r9 = r0.zzw()
            goto L_0x0cfd
        L_0x0cf9:
            long r9 = r0.zzu()
        L_0x0cfd:
            r4[r7] = r9
            if (r2 != r8) goto L_0x0d06
            long r9 = r0.zzt()
            goto L_0x0d0b
        L_0x0d06:
            int r9 = r0.zzg()
            long r9 = (long) r9
        L_0x0d0b:
            r6[r7] = r9
            short r9 = r0.zzE()
            if (r9 != r8) goto L_0x0d1a
            r8 = 2
            r0.zzM(r8)
            int r7 = r7 + 1
            goto L_0x0cef
        L_0x0d1a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unsupported media rate."
            r0.<init>(r1)
            throw r0
        L_0x0d22:
            android.util.Pair r0 = android.util.Pair.create(r4, r6)
        L_0x0d26:
            if (r0 == 0) goto L_0x0d37
            java.lang.Object r2 = r0.first
            long[] r2 = (long[]) r2
            java.lang.Object r0 = r0.second
            long[] r0 = (long[]) r0
            r33 = r0
            r32 = r2
            goto L_0x0d3b
        L_0x0d35:
            r1 = r37
        L_0x0d37:
            r32 = 0
            r33 = 0
        L_0x0d3b:
            com.google.android.gms.internal.ads.zzz r0 = r5.zzb
            if (r0 != 0) goto L_0x0d43
            r0 = r75
            goto L_0x0092
        L_0x0d43:
            int r2 = r20.zzc
            if (r2 == 0) goto L_0x0d7d
            com.google.android.gms.internal.ads.zzfb r2 = new com.google.android.gms.internal.ads.zzfb
            int r3 = r20.zzc
            r2.<init>(r3)
            com.google.android.gms.internal.ads.zzx r3 = r0.zzb()
            com.google.android.gms.internal.ads.zzav r0 = r0.zzl
            if (r0 == 0) goto L_0x0d65
            r4 = 1
            com.google.android.gms.internal.ads.zzau[] r4 = new com.google.android.gms.internal.ads.zzau[r4]
            r6 = 0
            r4[r6] = r2
            com.google.android.gms.internal.ads.zzav r0 = r0.zzc(r4)
            goto L_0x0d75
        L_0x0d65:
            r4 = 1
            r6 = 0
            com.google.android.gms.internal.ads.zzav r0 = new com.google.android.gms.internal.ads.zzav
            com.google.android.gms.internal.ads.zzau[] r4 = new com.google.android.gms.internal.ads.zzau[r4]
            r4[r6] = r2
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.<init>(r7, r4)
        L_0x0d75:
            r3.zzaa(r0)
            com.google.android.gms.internal.ads.zzz r0 = r3.zzan()
            goto L_0x0d7e
        L_0x0d7d:
            r6 = 0
        L_0x0d7e:
            r28 = r0
            com.google.android.gms.internal.ads.zzajp r0 = new com.google.android.gms.internal.ads.zzajp
            r17 = r0
            int r18 = r20.zza
            long r20 = r29.zza
            long r26 = r29.zzb
            int r2 = r5.zzd
            r29 = r2
            com.google.android.gms.internal.ads.zzajq[] r2 = r5.zza
            r30 = r2
            int r2 = r5.zzc
            r31 = r2
            r19 = r36
            r22 = r39
            r17.<init>(r18, r19, r20, r22, r24, r26, r28, r29, r30, r31, r32, r33)
            r5 = r0
            r0 = r75
        L_0x0da6:
            java.lang.Object r2 = r0.apply(r5)
            com.google.android.gms.internal.ads.zzajp r2 = (com.google.android.gms.internal.ads.zzajp) r2
            if (r2 == 0) goto L_0x0de1
            r3 = 1835297121(0x6d646961, float:4.4181236E27)
            com.google.android.gms.internal.ads.zzfc r1 = r1.zza(r3)
            r1.getClass()
            r3 = r1
            com.google.android.gms.internal.ads.zzfc r3 = (com.google.android.gms.internal.ads.zzfc) r3
            r3 = 1835626086(0x6d696e66, float:4.515217E27)
            com.google.android.gms.internal.ads.zzfc r1 = r1.zza(r3)
            r1.getClass()
            r3 = r1
            com.google.android.gms.internal.ads.zzfc r3 = (com.google.android.gms.internal.ads.zzfc) r3
            r3 = 1937007212(0x7374626c, float:1.9362132E31)
            com.google.android.gms.internal.ads.zzfc r1 = r1.zza(r3)
            r1.getClass()
            r3 = r1
            com.google.android.gms.internal.ads.zzfc r3 = (com.google.android.gms.internal.ads.zzfc) r3
            r3 = r69
            com.google.android.gms.internal.ads.zzajs r1 = zze(r2, r1, r3)
            r2 = r35
            r2.add(r1)
            goto L_0x0de5
        L_0x0de1:
            r3 = r69
            r2 = r35
        L_0x0de5:
            int r14 = r34 + 1
            r0 = r68
            r11 = r72
            r12 = r2
            goto L_0x000a
        L_0x0dee:
            java.lang.String r0 = "Malformed sample table (stbl) missing sample description (stsd)"
            r1 = 0
            com.google.android.gms.internal.ads.zzaz r0 = com.google.android.gms.internal.ads.zzaz.zza(r0, r1)
            throw r0
        L_0x0df6:
            r2 = r12
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaix.zzf(com.google.android.gms.internal.ads.zzfc, com.google.android.gms.internal.ads.zzaej, long, com.google.android.gms.internal.ads.zzs, boolean, boolean, com.google.android.gms.internal.ads.zzfve):java.util.List");
    }

    public static void zzg(zzen zzen) {
        int zzc = zzen.zzc();
        zzen.zzM(4);
        if (zzen.zzg() != 1751411826) {
            zzc += 4;
        }
        zzen.zzL(zzc);
    }

    private static int zzh(zzen zzen) {
        int zzm = zzen.zzm();
        int i = zzm & 127;
        while ((zzm & 128) == 128) {
            zzm = zzen.zzm();
            i = (i << 7) | (zzm & 127);
        }
        return i;
    }

    private static int zzi(zzen zzen) {
        zzen.zzL(16);
        return zzen.zzg();
    }

    private static Pair zzj(zzen zzen, int i, int i2) throws zzaz {
        Pair pair;
        Integer num;
        zzajq zzajq;
        int i3;
        int i4;
        byte[] bArr;
        zzen zzen2 = zzen;
        int zzc = zzen.zzc();
        while (zzc - i < i2) {
            zzen2.zzL(zzc);
            int zzg = zzen.zzg();
            boolean z = true;
            zzadz.zzc(zzg > 0, "childAtomSize must be positive");
            if (zzen.zzg() == 1936289382) {
                int i5 = zzc + 8;
                int i6 = 0;
                int i7 = -1;
                String str = null;
                Integer num2 = null;
                while (i5 - zzc < zzg) {
                    zzen2.zzL(i5);
                    int zzg2 = zzen.zzg();
                    int zzg3 = zzen.zzg();
                    if (zzg3 == 1718775137) {
                        num2 = Integer.valueOf(zzen.zzg());
                    } else if (zzg3 == 1935894637) {
                        zzen2.zzM(4);
                        str = zzen2.zzB(4, StandardCharsets.UTF_8);
                    } else if (zzg3 == 1935894633) {
                        i7 = i5;
                        i6 = zzg2;
                    }
                    i5 += zzg2;
                }
                if ("cenc".equals(str) || "cbc1".equals(str) || "cens".equals(str) || "cbcs".equals(str)) {
                    zzadz.zzc(num2 != null, "frma atom is mandatory");
                    zzadz.zzc(i7 != -1, "schi atom is mandatory");
                    int i8 = i7 + 8;
                    while (true) {
                        if (i8 - i7 >= i6) {
                            num = num2;
                            zzajq = null;
                            break;
                        }
                        zzen2.zzL(i8);
                        int zzg4 = zzen.zzg();
                        if (zzen.zzg() == 1952804451) {
                            int zza2 = zza(zzen.zzg());
                            zzen2.zzM(1);
                            if (zza2 == 0) {
                                zzen2.zzM(1);
                                i4 = 0;
                                i3 = 0;
                            } else {
                                int zzm = zzen.zzm();
                                i4 = zzm & 15;
                                i3 = (zzm & 240) >> 4;
                            }
                            boolean z2 = zzen.zzm() == 1;
                            int zzm2 = zzen.zzm();
                            byte[] bArr2 = new byte[16];
                            zzen2.zzH(bArr2, 0, 16);
                            if (!z2 || zzm2 != 0) {
                                bArr = null;
                            } else {
                                int zzm3 = zzen.zzm();
                                byte[] bArr3 = new byte[zzm3];
                                zzen2.zzH(bArr3, 0, zzm3);
                                bArr = bArr3;
                            }
                            num = num2;
                            zzajq = new zzajq(z2, str, zzm2, bArr2, i3, i4, bArr);
                        } else {
                            Integer num3 = num2;
                            i8 += zzg4;
                        }
                    }
                    if (zzajq == null) {
                        z = false;
                    }
                    zzadz.zzc(z, "tenc atom is mandatory");
                    String str2 = zzex.zza;
                    zzajq zzajq2 = zzajq;
                    pair = Pair.create(num, zzajq);
                } else {
                    pair = null;
                }
                if (pair != null) {
                    return pair;
                }
            }
            zzc += zzg;
        }
        return null;
    }

    private static zzk zzk(zzen zzen) {
        zzi zzi = new zzi();
        byte[] zzN = zzen.zzN();
        zzem zzem = new zzem(zzN, zzN.length);
        zzem.zzl(zzen.zzc() * 8);
        zzem.zzo(1);
        int zzd = zzem.zzd(8);
        for (int i = 0; i < zzd; i++) {
            zzem.zzo(1);
            int zzd2 = zzem.zzd(8);
            for (int i2 = 0; i2 < zzd2; i2++) {
                zzem.zzn(6);
                boolean zzp = zzem.zzp();
                zzem.zzm();
                zzem.zzo(11);
                zzem.zzn(4);
                int zzd3 = zzem.zzd(4) + 8;
                zzi.zzf(zzd3);
                zzi.zza(zzd3);
                zzem.zzo(1);
                if (zzp) {
                    int zzd4 = zzem.zzd(8);
                    int zzd5 = zzem.zzd(8);
                    zzem.zzo(1);
                    boolean zzp2 = zzem.zzp();
                    zzi.zzc(zzk.zza(zzd4));
                    zzi.zzb(true != zzp2 ? 2 : 1);
                    zzi.zzd(zzk.zzb(zzd5));
                }
            }
        }
        return zzi.zzg();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0141, code lost:
        if (r6 == 1) goto L_0x014b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x017a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.gms.internal.ads.zzk zzl(com.google.android.gms.internal.ads.zzen r15) {
        /*
            com.google.android.gms.internal.ads.zzi r0 = new com.google.android.gms.internal.ads.zzi
            r0.<init>()
            com.google.android.gms.internal.ads.zzem r1 = new com.google.android.gms.internal.ads.zzem
            byte[] r2 = r15.zzN()
            int r3 = r2.length
            r1.<init>(r2, r3)
            int r15 = r15.zzc()
            r2 = 8
            int r15 = r15 * r2
            r1.zzl(r15)
            r15 = 1
            r1.zzo(r15)
            r3 = 3
            int r4 = r1.zzd(r3)
            r5 = 6
            r1.zzn(r5)
            boolean r5 = r1.zzp()
            boolean r6 = r1.zzp()
            r7 = 12
            r8 = 10
            r9 = 0
            r10 = 2
            if (r4 != r10) goto L_0x0045
            if (r5 == 0) goto L_0x0043
            if (r15 == r6) goto L_0x003b
            goto L_0x003c
        L_0x003b:
            r8 = r7
        L_0x003c:
            r0.zzf(r8)
            r0.zza(r8)
            goto L_0x0050
        L_0x0043:
            r5 = r9
            r4 = r10
        L_0x0045:
            if (r4 > r10) goto L_0x0050
            if (r15 == r5) goto L_0x004a
            r8 = r2
        L_0x004a:
            r0.zzf(r8)
            r0.zza(r8)
        L_0x0050:
            r4 = 13
            r1.zzn(r4)
            r1.zzm()
            r5 = 4
            int r6 = r1.zzd(r5)
            java.lang.String r8 = "BoxParsers"
            if (r6 == r15) goto L_0x0077
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            java.lang.String r1 = "Unsupported obu_type: "
            r15.<init>(r1)
            r15.append(r6)
            java.lang.String r15 = r15.toString()
            com.google.android.gms.internal.ads.zzea.zze(r8, r15)
            com.google.android.gms.internal.ads.zzk r15 = r0.zzg()
            return r15
        L_0x0077:
            boolean r6 = r1.zzp()
            if (r6 == 0) goto L_0x0087
            java.lang.String r15 = "Unsupported obu_extension_flag"
            com.google.android.gms.internal.ads.zzea.zze(r8, r15)
            com.google.android.gms.internal.ads.zzk r15 = r0.zzg()
            return r15
        L_0x0087:
            boolean r6 = r1.zzp()
            r1.zzm()
            if (r6 == 0) goto L_0x00a3
            int r6 = r1.zzd(r2)
            r11 = 127(0x7f, float:1.78E-43)
            if (r6 > r11) goto L_0x0099
            goto L_0x00a3
        L_0x0099:
            java.lang.String r15 = "Excessive obu_size"
            com.google.android.gms.internal.ads.zzea.zze(r8, r15)
            com.google.android.gms.internal.ads.zzk r15 = r0.zzg()
            return r15
        L_0x00a3:
            int r6 = r1.zzd(r3)
            r1.zzm()
            boolean r11 = r1.zzp()
            if (r11 == 0) goto L_0x00ba
            java.lang.String r15 = "Unsupported reduced_still_picture_header"
            com.google.android.gms.internal.ads.zzea.zze(r8, r15)
            com.google.android.gms.internal.ads.zzk r15 = r0.zzg()
            return r15
        L_0x00ba:
            boolean r11 = r1.zzp()
            if (r11 == 0) goto L_0x00ca
            java.lang.String r15 = "Unsupported timing_info_present_flag"
            com.google.android.gms.internal.ads.zzea.zze(r8, r15)
            com.google.android.gms.internal.ads.zzk r15 = r0.zzg()
            return r15
        L_0x00ca:
            boolean r11 = r1.zzp()
            if (r11 == 0) goto L_0x00da
            java.lang.String r15 = "Unsupported initial_display_delay_present_flag"
            com.google.android.gms.internal.ads.zzea.zze(r8, r15)
            com.google.android.gms.internal.ads.zzk r15 = r0.zzg()
            return r15
        L_0x00da:
            r8 = 5
            int r11 = r1.zzd(r8)
            r12 = r9
        L_0x00e0:
            r13 = 7
            if (r12 > r11) goto L_0x00f2
            r1.zzn(r7)
            int r14 = r1.zzd(r8)
            if (r14 <= r13) goto L_0x00ef
            r1.zzm()
        L_0x00ef:
            int r12 = r12 + 1
            goto L_0x00e0
        L_0x00f2:
            int r7 = r1.zzd(r5)
            int r5 = r1.zzd(r5)
            int r7 = r7 + r15
            r1.zzn(r7)
            int r5 = r5 + r15
            r1.zzn(r5)
            boolean r5 = r1.zzp()
            if (r5 == 0) goto L_0x010b
            r1.zzn(r13)
        L_0x010b:
            r1.zzn(r13)
            boolean r5 = r1.zzp()
            if (r5 == 0) goto L_0x0117
            r1.zzn(r10)
        L_0x0117:
            boolean r7 = r1.zzp()
            if (r7 == 0) goto L_0x011e
            goto L_0x0124
        L_0x011e:
            int r7 = r1.zzd(r15)
            if (r7 <= 0) goto L_0x012d
        L_0x0124:
            boolean r7 = r1.zzp()
            if (r7 != 0) goto L_0x012d
            r1.zzn(r15)
        L_0x012d:
            if (r5 == 0) goto L_0x0132
            r1.zzn(r3)
        L_0x0132:
            r1.zzn(r3)
            boolean r3 = r1.zzp()
            if (r6 != r10) goto L_0x0141
            if (r3 == 0) goto L_0x0144
            r1.zzm()
            goto L_0x0144
        L_0x0141:
            if (r6 != r15) goto L_0x0144
            goto L_0x014b
        L_0x0144:
            boolean r3 = r1.zzp()
            if (r3 == 0) goto L_0x014b
            r9 = r15
        L_0x014b:
            boolean r3 = r1.zzp()
            if (r3 == 0) goto L_0x0185
            int r3 = r1.zzd(r2)
            int r5 = r1.zzd(r2)
            int r2 = r1.zzd(r2)
            if (r9 != 0) goto L_0x016b
            if (r3 != r15) goto L_0x016b
            if (r5 != r4) goto L_0x016a
            if (r2 != 0) goto L_0x0168
            r1 = r15
            r3 = r1
            goto L_0x0170
        L_0x0168:
            r3 = r15
            goto L_0x016c
        L_0x016a:
            r3 = r15
        L_0x016b:
            r4 = r5
        L_0x016c:
            int r1 = r1.zzd(r15)
        L_0x0170:
            int r2 = com.google.android.gms.internal.ads.zzk.zza(r3)
            r0.zzc(r2)
            if (r1 != r15) goto L_0x017a
            goto L_0x017b
        L_0x017a:
            r15 = r10
        L_0x017b:
            r0.zzb(r15)
            int r15 = com.google.android.gms.internal.ads.zzk.zzb(r4)
            r0.zzd(r15)
        L_0x0185:
            com.google.android.gms.internal.ads.zzk r15 = r0.zzg()
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaix.zzl(com.google.android.gms.internal.ads.zzen):com.google.android.gms.internal.ads.zzk");
    }

    private static zzav zzm(zzen zzen) {
        short zzE = zzen.zzE();
        zzen.zzM(2);
        String zzB = zzen.zzB(zzE, StandardCharsets.UTF_8);
        int max = Math.max(zzB.lastIndexOf(43), zzB.lastIndexOf(45));
        try {
            return new zzav(-9223372036854775807L, new zzfg(Float.parseFloat(zzB.substring(0, max)), Float.parseFloat(zzB.substring(max, zzB.length() - 1))));
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return null;
        }
    }

    private static zzail zzn(zzen zzen, int i) {
        zzen.zzL(i + 8);
        zzen.zzM(4);
        return new zzail(zzen.zzu(), zzen.zzu());
    }

    private static zzain zzo(zzen zzen, int i) {
        zzen.zzL(i + 12);
        zzen.zzM(1);
        zzh(zzen);
        zzen.zzM(2);
        int zzm = zzen.zzm();
        if ((zzm & 128) != 0) {
            zzen.zzM(2);
        }
        if ((zzm & 64) != 0) {
            zzen.zzM(zzen.zzm());
        }
        if ((zzm & 32) != 0) {
            zzen.zzM(2);
        }
        zzen.zzM(1);
        zzh(zzen);
        String zzd = zzay.zzd(zzen.zzm());
        if ("audio/mpeg".equals(zzd) || "audio/vnd.dts".equals(zzd) || "audio/vnd.dts.hd".equals(zzd)) {
            return new zzain(zzd, (byte[]) null, -1, -1);
        }
        zzen.zzM(4);
        long zzu = zzen.zzu();
        long zzu2 = zzen.zzu();
        zzen.zzM(1);
        int zzh = zzh(zzen);
        byte[] bArr = new byte[zzh];
        zzen.zzH(bArr, 0, zzh);
        return new zzain(zzd, bArr, zzu2 <= 0 ? -1 : zzu2, zzu > 0 ? zzu : -1);
    }

    private static ByteBuffer zzp() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    private static void zzq(zzen zzen, int i, int i2, int i3, int i4, String str, boolean z, zzs zzs, zzais zzais, int i5) throws zzaz {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        String str2;
        String str3;
        int i11;
        String str4;
        int i12;
        int i13;
        int i14;
        String str5;
        int i15;
        int i16;
        int i17;
        String str6;
        ByteOrder byteOrder;
        int i18;
        int i19;
        int i20;
        List zzo;
        int i21;
        int i22;
        boolean z2;
        String str7;
        boolean z3;
        String str8;
        int i23;
        zzen zzen2 = zzen;
        int i24 = i;
        int i25 = i2;
        int i26 = i3;
        int i27 = i4;
        String str9 = str;
        zzs zzs2 = zzs;
        zzais zzais2 = zzais;
        zzen2.zzL(i25 + 16);
        if (z) {
            i6 = zzen.zzq();
            zzen2.zzM(6);
        } else {
            zzen2.zzM(8);
            i6 = 0;
        }
        if (i6 == 0 || i6 == 1) {
            i9 = zzen.zzq();
            zzen2.zzM(6);
            i10 = zzen.zzn();
            zzen2.zzL(zzen.zzc() - 4);
            i8 = zzen.zzg();
            if (i6 == 1) {
                zzen2.zzM(16);
            }
            i7 = -1;
        } else if (i6 == 2) {
            zzen2.zzM(16);
            i10 = (int) Math.round(Double.longBitsToDouble(zzen.zzt()));
            int zzp = zzen.zzp();
            zzen2.zzM(4);
            int zzp2 = zzen.zzp();
            int zzp3 = zzen.zzp();
            int i28 = zzp3 & 1;
            int i29 = zzp3 & 2;
            if (i28 == 0) {
                if (zzp2 == 8) {
                    i7 = 3;
                } else if (zzp2 == 16) {
                    i7 = i29 != 0 ? 268435456 : 2;
                } else if (zzp2 == 24) {
                    i7 = i29 != 0 ? 1342177280 : 21;
                } else if (zzp2 == 32) {
                    i7 = i29 != 0 ? 1610612736 : 22;
                }
                zzen2.zzM(8);
                i9 = zzp;
                i8 = 0;
            } else if (zzp2 == 32) {
                i7 = 4;
                zzen2.zzM(8);
                i9 = zzp;
                i8 = 0;
            }
            i7 = -1;
            zzen2.zzM(8);
            i9 = zzp;
            i8 = 0;
        } else {
            return;
        }
        if (i24 == 1767992678) {
            i10 = -1;
            i9 = -1;
        } else {
            if (i24 == 1935764850) {
                i23 = 8000;
            } else if (i24 == 1935767394) {
                i23 = 16000;
                i24 = 1935767394;
            }
            i9 = 1;
        }
        int zzc = zzen.zzc();
        int i30 = 1701733217;
        if (i24 == 1701733217) {
            Pair zzj = zzj(zzen2, i25, i26);
            if (zzj != null) {
                i30 = ((Integer) zzj.first).intValue();
                if (zzs2 == null) {
                    zzs2 = null;
                } else {
                    zzs2 = zzs2.zzb(((zzajq) zzj.second).zzb);
                }
                zzais2.zza[i5] = (zzajq) zzj.second;
            }
            i24 = i30;
            zzen2.zzL(zzc);
        }
        String str10 = "audio/mhm1";
        if (i24 == 1633889587) {
            str2 = "audio/ac3";
        } else if (i24 == 1700998451) {
            str2 = "audio/eac3";
        } else if (i24 == 1633889588) {
            str2 = "audio/ac4";
        } else if (i24 == 1685353315) {
            str2 = "audio/vnd.dts";
        } else if (i24 == 1685353320 || i24 == 1685353324) {
            str2 = "audio/vnd.dts.hd";
        } else if (i24 == 1685353317) {
            str2 = "audio/vnd.dts.hd;profile=lbr";
        } else if (i24 == 1685353336) {
            str2 = "audio/vnd.dts.uhd;profile=p2";
        } else if (i24 == 1935764850) {
            str2 = "audio/3gpp";
        } else if (i24 == 1935767394) {
            str2 = "audio/amr-wb";
        } else {
            if (i24 != 1936684916) {
                if (i24 == 1953984371) {
                    str2 = "audio/raw";
                    i7 = 268435456;
                } else if (i24 == 1819304813) {
                    if (i7 != -1) {
                        str2 = "audio/raw";
                    }
                } else if (i24 == 778924082 || i24 == 778924083) {
                    str2 = "audio/mpeg";
                } else if (i24 == 1835557169) {
                    str2 = "audio/mha1";
                } else if (i24 == 1835560241) {
                    str2 = str10;
                } else if (i24 == 1634492771) {
                    str2 = "audio/alac";
                } else if (i24 == 1634492791) {
                    str2 = "audio/g711-alaw";
                } else if (i24 == 1970037111) {
                    str2 = "audio/g711-mlaw";
                } else if (i24 == 1332770163) {
                    str2 = "audio/opus";
                } else if (i24 == 1716281667) {
                    str2 = "audio/flac";
                } else if (i24 == 1835823201) {
                    str2 = "audio/true-hd";
                } else if (i24 == 1767992678) {
                    str2 = "audio/iamf";
                    i24 = 1767992678;
                } else {
                    str2 = null;
                }
            }
            str2 = "audio/raw";
            i7 = 2;
        }
        int i31 = i7;
        String str11 = null;
        List list = null;
        zzain zzain = null;
        zzail zzail = null;
        while (zzc - i25 < i26) {
            zzen2.zzL(zzc);
            int zzg = zzen.zzg();
            String str12 = "childAtomSize must be positive";
            zzadz.zzc(zzg > 0, str12);
            int zzg2 = zzen.zzg();
            int i32 = i10;
            if (zzg2 == 1835557187) {
                zzen2.zzL(zzc + 8);
                zzen2.zzM(1);
                int zzm = zzen.zzm();
                zzen2.zzM(1);
                if (Objects.equals(str2, str10)) {
                    str8 = String.format("mhm1.%02X", new Object[]{Integer.valueOf(zzm)});
                } else {
                    str8 = String.format("mha1.%02X", new Object[]{Integer.valueOf(zzm)});
                }
                int zzq = zzen.zzq();
                byte[] bArr = new byte[zzq];
                str11 = str8;
                zzen2.zzH(bArr, 0, zzq);
                if (list == null) {
                    list = zzfyq.zzo(bArr);
                    str5 = str11;
                    i14 = i32;
                    i13 = i24;
                    str3 = str10;
                    zzc += zzg;
                    i25 = i2;
                    i26 = i3;
                    str11 = str4;
                    i24 = i11;
                    str10 = str3;
                    zzen2 = zzen;
                } else {
                    list = zzfyq.zzp(bArr, (byte[]) list.get(0));
                }
            } else {
                if (zzg2 == 1835557200) {
                    zzen2.zzL(zzc + 8);
                    int zzm2 = zzen.zzm();
                    if (zzm2 > 0) {
                        byte[] bArr2 = new byte[zzm2];
                        zzen2.zzH(bArr2, 0, zzm2);
                        if (list == null) {
                            list = zzfyq.zzo(bArr2);
                            str4 = str11;
                            i11 = i24;
                            str3 = str10;
                            i12 = i32;
                            zzc += zzg;
                            i25 = i2;
                            i26 = i3;
                            str11 = str4;
                            i24 = i11;
                            str10 = str3;
                            zzen2 = zzen;
                        } else {
                            list = zzfyq.zzp((byte[]) list.get(0), bArr2);
                        }
                    } else {
                        i21 = i32;
                        i11 = i24;
                        str3 = str10;
                    }
                } else {
                    if (zzg2 == 1702061171) {
                        i12 = i32;
                        str3 = str10;
                        i16 = zzc;
                        i15 = -1;
                    } else if (!z || zzg2 != 2002876005) {
                        str3 = str10;
                        if (zzg2 == 1651798644) {
                            zzail = zzn(zzen2, zzc);
                        } else {
                            if (zzg2 == 1684103987) {
                                zzen2.zzL(zzc + 8);
                                zzais2.zzb = zzacu.zzc(zzen2, Integer.toString(i4), str9, zzs2);
                            } else if (zzg2 == 1684366131) {
                                zzen2.zzL(zzc + 8);
                                zzais2.zzb = zzacu.zzd(zzen2, Integer.toString(i4), str9, zzs2);
                            } else if (zzg2 == 1684103988) {
                                zzen2.zzL(zzc + 8);
                                zzais2.zzb = zzacy.zza(zzen2, Integer.toString(i4), str9, zzs2);
                            } else if (zzg2 == 1684892784) {
                                if (i8 > 0) {
                                    str5 = str11;
                                    i13 = i24;
                                    i14 = i8;
                                    i9 = 2;
                                    zzc += zzg;
                                    i25 = i2;
                                    i26 = i3;
                                    str11 = str4;
                                    i24 = i11;
                                    str10 = str3;
                                    zzen2 = zzen;
                                } else {
                                    throw zzaz.zza("Invalid sample rate for Dolby TrueHD MLP stream: " + i8, (Throwable) null);
                                }
                            } else if (zzg2 == 1684305011 || zzg2 == 1969517683) {
                                zzx zzx = new zzx();
                                zzx.zzR(i27);
                                zzx.zzah(str2);
                                zzx.zzD(i9);
                                i12 = i32;
                                zzx.zzai(i12);
                                zzx.zzL(zzs2);
                                zzx.zzW(str9);
                                zzais2.zzb = zzx.zzan();
                                i11 = i24;
                                str4 = str11;
                                zzc += zzg;
                                i25 = i2;
                                i26 = i3;
                                str11 = str4;
                                i24 = i11;
                                str10 = str3;
                                zzen2 = zzen;
                            } else if (zzg2 == 1682927731) {
                                int i33 = zzg - 8;
                                byte[] bArr3 = zzb;
                                int length = bArr3.length;
                                byte[] copyOf = Arrays.copyOf(bArr3, length + i33);
                                zzen2.zzL(zzc + 8);
                                zzen2.zzH(copyOf, length, i33);
                                list = zzaeq.zze(copyOf);
                            } else {
                                if (zzg2 == 1684425825) {
                                    byte[] bArr4 = new byte[(zzg - 8)];
                                    bArr4[0] = 102;
                                    bArr4[1] = 76;
                                    bArr4[2] = 97;
                                    bArr4[3] = 67;
                                    zzen2.zzL(zzc + 12);
                                    zzen2.zzH(bArr4, 4, zzg - 12);
                                    zzo = zzfyq.zzo(bArr4);
                                } else {
                                    if (zzg2 == 1634492771) {
                                        int i34 = zzg - 12;
                                        byte[] bArr5 = new byte[i34];
                                        zzen2.zzL(zzc + 12);
                                        zzen2.zzH(bArr5, 0, i34);
                                        int i35 = zzdk.zza;
                                        zzen zzen3 = new zzen(bArr5);
                                        zzen3.zzL(9);
                                        int zzm3 = zzen3.zzm();
                                        zzen3.zzL(20);
                                        Pair create = Pair.create(Integer.valueOf(zzen3.zzp()), Integer.valueOf(zzm3));
                                        i19 = ((Integer) create.first).intValue();
                                        int intValue = ((Integer) create.second).intValue();
                                        list = zzfyq.zzo(bArr5);
                                        str4 = str11;
                                        i20 = i24;
                                        i9 = intValue;
                                    } else if (zzg2 == 1767990114) {
                                        zzen2.zzL(zzc + 9);
                                        int zzb2 = zzgbt.zzb(zzen.zzv());
                                        byte[] bArr6 = new byte[zzb2];
                                        zzen2.zzH(bArr6, 0, zzb2);
                                        zzo = zzfyq.zzo(bArr6);
                                    } else if (zzg2 == 1885564227) {
                                        zzen2.zzL(zzc + 12);
                                        if ((zzen.zzm() & 1) != 0) {
                                            byteOrder = ByteOrder.LITTLE_ENDIAN;
                                        } else {
                                            byteOrder = ByteOrder.BIG_ENDIAN;
                                        }
                                        int zzm4 = zzen.zzm();
                                        if (i24 == 1768973165) {
                                            i18 = zzex.zzn(zzm4, byteOrder);
                                        } else {
                                            if (i24 == 1718641517) {
                                                if (zzm4 == 32 && byteOrder.equals(ByteOrder.LITTLE_ENDIAN)) {
                                                    i18 = 4;
                                                }
                                            }
                                            i18 = i31;
                                        }
                                        str4 = str11;
                                        if (i18 != -1) {
                                            i19 = i32;
                                            i20 = i24;
                                            i31 = i18;
                                            str2 = "audio/raw";
                                        } else {
                                            i19 = i32;
                                            i20 = i24;
                                            i31 = i18;
                                        }
                                    } else {
                                        i12 = i32;
                                        i11 = i24;
                                        str4 = str11;
                                        zzc += zzg;
                                        i25 = i2;
                                        i26 = i3;
                                        str11 = str4;
                                        i24 = i11;
                                        str10 = str3;
                                        zzen2 = zzen;
                                    }
                                    zzc += zzg;
                                    i25 = i2;
                                    i26 = i3;
                                    str11 = str4;
                                    i24 = i11;
                                    str10 = str3;
                                    zzen2 = zzen;
                                }
                                str4 = str11;
                                i19 = i32;
                                i20 = i24;
                                zzc += zzg;
                                i25 = i2;
                                i26 = i3;
                                str11 = str4;
                                i24 = i11;
                                str10 = str3;
                                zzen2 = zzen;
                            }
                            i21 = i32;
                            i11 = i24;
                        }
                        str5 = str11;
                        i14 = i32;
                        i13 = i24;
                        zzc += zzg;
                        i25 = i2;
                        i26 = i3;
                        str11 = str4;
                        i24 = i11;
                        str10 = str3;
                        zzen2 = zzen;
                    } else {
                        int zzc2 = zzen.zzc();
                        if (zzc2 >= zzc) {
                            i22 = zzc2;
                            str7 = null;
                            z2 = true;
                        } else {
                            i22 = zzc2;
                            str7 = null;
                            z2 = false;
                        }
                        zzadz.zzc(z2, str7);
                        i16 = i22;
                        while (true) {
                            if (i16 - zzc >= zzg) {
                                str3 = str10;
                                i12 = i32;
                                i16 = -1;
                                break;
                            }
                            zzen2.zzL(i16);
                            int zzg3 = zzen.zzg();
                            if (zzg3 > 0) {
                                str3 = str10;
                                z3 = true;
                            } else {
                                str3 = str10;
                                z3 = false;
                            }
                            zzadz.zzc(z3, str12);
                            String str13 = str12;
                            if (zzen.zzg() == 1702061171) {
                                i12 = i32;
                                break;
                            }
                            i16 += zzg3;
                            str10 = str3;
                            str12 = str13;
                        }
                        i15 = -1;
                    }
                    if (i16 != i15) {
                        zzain = zzo(zzen2, i16);
                        String zzc3 = zzain.zza;
                        byte[] zzd = zzain.zzb;
                        if (zzd == null) {
                            i17 = i24;
                        } else if ("audio/vorbis".equals(zzc3)) {
                            zzen zzen4 = new zzen(zzd);
                            zzen4.zzM(1);
                            int i36 = 0;
                            while (zzen4.zza() > 0 && zzen4.zzf() == 255) {
                                zzen4.zzM(1);
                                i36 += KotlinVersion.MAX_COMPONENT_VALUE;
                                zzen zzen5 = zzen;
                            }
                            int zzm5 = i36 + zzen4.zzm();
                            int i37 = 0;
                            while (true) {
                                if (zzen4.zza() <= 0) {
                                    i17 = i24;
                                    break;
                                }
                                i17 = i24;
                                if (zzen4.zzf() != 255) {
                                    break;
                                }
                                zzen4.zzM(1);
                                i37 += KotlinVersion.MAX_COMPONENT_VALUE;
                                i24 = i17;
                            }
                            int zzm6 = i37 + zzen4.zzm();
                            byte[] bArr7 = new byte[zzm5];
                            int zzc4 = zzen4.zzc();
                            System.arraycopy(zzd, zzc4, bArr7, 0, zzm5);
                            int i38 = zzc4 + zzm5 + zzm6;
                            int length2 = zzd.length - i38;
                            byte[] bArr8 = new byte[length2];
                            System.arraycopy(zzd, i38, bArr8, 0, length2);
                            list = zzfyq.zzp(bArr7, bArr8);
                        } else {
                            i17 = i24;
                            if ("audio/mp4a-latm".equals(zzc3)) {
                                zzacp zza2 = zzacr.zza(zzd);
                                i12 = zza2.zza;
                                i9 = zza2.zzb;
                                str6 = zza2.zzc;
                            } else {
                                str6 = str11;
                            }
                            list = zzfyq.zzo(zzd);
                            str2 = zzc3;
                            zzc += zzg;
                            i25 = i2;
                            i26 = i3;
                            str11 = str4;
                            i24 = i11;
                            str10 = str3;
                            zzen2 = zzen;
                        }
                        str6 = str11;
                        str2 = zzc3;
                        zzc += zzg;
                        i25 = i2;
                        i26 = i3;
                        str11 = str4;
                        i24 = i11;
                        str10 = str3;
                        zzen2 = zzen;
                    }
                    i11 = i24;
                    str4 = str11;
                    zzc += zzg;
                    i25 = i2;
                    i26 = i3;
                    str11 = str4;
                    i24 = i11;
                    str10 = str3;
                    zzen2 = zzen;
                }
                str4 = str11;
                zzc += zzg;
                i25 = i2;
                i26 = i3;
                str11 = str4;
                i24 = i11;
                str10 = str3;
                zzen2 = zzen;
            }
            str5 = str11;
            i14 = i32;
            i13 = i24;
            str3 = str10;
            zzc += zzg;
            i25 = i2;
            i26 = i3;
            str11 = str4;
            i24 = i11;
            str10 = str3;
            zzen2 = zzen;
        }
        if (zzais2.zzb == null && str2 != null) {
            zzx zzx2 = new zzx();
            zzx2.zzR(i27);
            zzx2.zzah(str2);
            zzx2.zzE(str11);
            zzx2.zzD(i9);
            zzx2.zzai(i10);
            zzx2.zzab(i31);
            zzx2.zzT(list);
            zzx2.zzL(zzs2);
            zzx2.zzW(str9);
            if (zzain != null) {
                zzx2.zzC(zzgbt.zzf(zzain.zzc));
                zzx2.zzac(zzgbt.zzf(zzain.zzd));
            } else if (zzail != null) {
                zzx2.zzC(zzgbt.zzf(zzail.zza));
                zzx2.zzac(zzgbt.zzf(zzail.zzb));
            }
            zzais2.zzb = zzx2.zzan();
        }
    }
}
