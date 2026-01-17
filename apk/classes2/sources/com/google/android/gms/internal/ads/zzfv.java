package com.google.android.gms.internal.ads;

import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzfv {
    public static final byte[] zza = {0, 0, 0, 1};
    public static final float[] zzb = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    private static final Object zzc = new Object();
    private static int[] zzd = new int[10];

    public static int zza(byte[] bArr, int i, int i2, boolean[] zArr) {
        boolean z;
        int i3 = i2 - i;
        boolean z2 = false;
        zzdd.zzf(i3 >= 0);
        if (i3 == 0) {
            return i2;
        }
        if (zArr[0]) {
            zzi(zArr);
            return i - 3;
        } else if (i3 > 1 && zArr[1] && bArr[i] == 1) {
            zzi(zArr);
            return i - 2;
        } else if (i3 <= 2 || !zArr[2] || bArr[i] != 0 || bArr[i + 1] != 1) {
            int i4 = i2 - 1;
            int i5 = i + 2;
            while (i5 < i4) {
                byte b = bArr[i5];
                if ((b & 254) == 0) {
                    int i6 = i5 - 2;
                    if (bArr[i6] == 0 && bArr[i5 - 1] == 0 && b == 1) {
                        zzi(zArr);
                        return i6;
                    }
                    i5 = i6;
                }
                i5 += 3;
            }
            if (i3 <= 2 ? i3 != 2 ? !zArr[1] || bArr[i4] != 1 : !(zArr[2] && bArr[i2 - 2] == 0 && bArr[i4] == 1) : !(bArr[i2 - 3] == 0 && bArr[i2 - 2] == 0 && bArr[i4] == 1)) {
                z = false;
            } else {
                z = true;
            }
            zArr[0] = z;
            zArr[1] = i3 <= 1 ? !(!zArr[2] || bArr[i4] != 0) : bArr[i2 + -2] == 0 && bArr[i4] == 0;
            if (bArr[i4] == 0) {
                z2 = true;
            }
            zArr[2] = z2;
            return i2;
        } else {
            zzi(zArr);
            return i - 1;
        }
    }

    public static int zzb(zzz zzz) {
        String str = zzz.zzo;
        if (Objects.equals(str, "video/avc")) {
            return 1;
        }
        return (Objects.equals(str, "video/hevc") || zzay.zzg(zzz.zzk, "video/hevc")) ? 2 : 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x031e  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0339  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x03db  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x03ea  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x03f2  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01bc  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01da  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.ads.zzfp zzd(byte[] r36, int r37, int r38, com.google.android.gms.internal.ads.zzfs r39) {
        /*
            r0 = r36
            r1 = r37
            r2 = r38
            r3 = r39
            com.google.android.gms.internal.ads.zzfw r4 = new com.google.android.gms.internal.ads.zzfw
            r4.<init>(r0, r1, r2)
            com.google.android.gms.internal.ads.zzfj r6 = zzm(r4)
            com.google.android.gms.internal.ads.zzfw r4 = new com.google.android.gms.internal.ads.zzfw
            r5 = 2
            int r1 = r1 + r5
            r4.<init>(r0, r1, r2)
            r0 = 4
            r4.zzf(r0)
            r1 = 3
            int r2 = r4.zza(r1)
            int r7 = r6.zzb
            r8 = 1
            if (r7 == 0) goto L_0x002c
            r10 = 7
            if (r2 != r10) goto L_0x002c
            r2 = r10
            r10 = r8
            goto L_0x002d
        L_0x002c:
            r10 = 0
        L_0x002d:
            r11 = -1
            if (r3 == 0) goto L_0x004a
            com.google.android.gms.internal.ads.zzfyq r12 = r3.zza
            boolean r13 = r12.isEmpty()
            if (r13 != 0) goto L_0x004a
            int r13 = r12.size()
            int r13 = r13 + r11
            int r7 = java.lang.Math.min(r7, r13)
            java.lang.Object r7 = r12.get(r7)
            com.google.android.gms.internal.ads.zzfi r7 = (com.google.android.gms.internal.ads.zzfi) r7
            int r7 = r7.zza
            goto L_0x004b
        L_0x004a:
            r7 = 0
        L_0x004b:
            r12 = 0
            if (r10 != 0) goto L_0x0056
            r4.zze()
            com.google.android.gms.internal.ads.zzfk r12 = zzn(r4, r8, r2, r12)
            goto L_0x006c
        L_0x0056:
            if (r3 == 0) goto L_0x006c
            com.google.android.gms.internal.ads.zzfl r13 = r3.zzb
            int[] r14 = r13.zzb
            r14 = r14[r7]
            com.google.android.gms.internal.ads.zzfyq r13 = r13.zza
            int r15 = r13.size()
            if (r15 <= r14) goto L_0x006c
            java.lang.Object r12 = r13.get(r14)
            com.google.android.gms.internal.ads.zzfk r12 = (com.google.android.gms.internal.ads.zzfk) r12
        L_0x006c:
            int r13 = r4.zzc()
            r14 = 8
            if (r10 == 0) goto L_0x00b9
            boolean r15 = r4.zzh()
            if (r15 == 0) goto L_0x007f
            int r15 = r4.zza(r14)
            goto L_0x0080
        L_0x007f:
            r15 = r11
        L_0x0080:
            if (r3 == 0) goto L_0x00b0
            com.google.android.gms.internal.ads.zzfn r9 = r3.zzc
            if (r9 == 0) goto L_0x00b0
            if (r15 != r11) goto L_0x008c
            int[] r15 = r9.zzb
            r15 = r15[r7]
        L_0x008c:
            if (r15 == r11) goto L_0x00b0
            com.google.android.gms.internal.ads.zzfyq r9 = r9.zza
            int r11 = r9.size()
            if (r11 <= r15) goto L_0x00b0
            java.lang.Object r9 = r9.get(r15)
            com.google.android.gms.internal.ads.zzfm r9 = (com.google.android.gms.internal.ads.zzfm) r9
            int r11 = r9.zza
            int r15 = r9.zzd
            int r14 = r9.zze
            int r5 = r9.zzb
            int r9 = r9.zzc
            r0 = r5
            r20 = r14
            r1 = r15
            r35 = r11
            r11 = r9
            r9 = r35
            goto L_0x00fe
        L_0x00b0:
            r0 = 0
            r1 = 0
            r9 = 0
            r11 = 0
            r14 = 0
            r15 = 0
            r20 = 0
            goto L_0x00fe
        L_0x00b9:
            int r5 = r4.zzc()
            if (r5 != r1) goto L_0x00c4
            r4.zze()
            r9 = r1
            goto L_0x00c5
        L_0x00c4:
            r9 = r5
        L_0x00c5:
            int r11 = r4.zzc()
            int r14 = r4.zzc()
            boolean r15 = r4.zzh()
            if (r15 == 0) goto L_0x00ec
            int r15 = r4.zzc()
            int r1 = r4.zzc()
            int r0 = r4.zzc()
            int r8 = r4.zzc()
            int r1 = zzl(r11, r9, r15, r1)
            int r0 = zzk(r14, r9, r0, r8)
            goto L_0x00ee
        L_0x00ec:
            r1 = r11
            r0 = r14
        L_0x00ee:
            int r8 = r4.zzc()
            int r9 = r4.zzc()
            r15 = r1
            r1 = r11
            r20 = r14
            r14 = r0
            r0 = r8
            r11 = r9
            r9 = r5
        L_0x00fe:
            int r5 = r4.zzc()
            if (r10 != 0) goto L_0x012c
            boolean r8 = r4.zzh()
            r21 = r1
            r1 = 1
            if (r1 == r8) goto L_0x010f
            r1 = r2
            goto L_0x0110
        L_0x010f:
            r1 = 0
        L_0x0110:
            r8 = -1
        L_0x0111:
            if (r1 > r2) goto L_0x0128
            r4.zzc()
            r22 = r15
            int r15 = r4.zzc()
            int r8 = java.lang.Math.max(r15, r8)
            r4.zzc()
            int r1 = r1 + 1
            r15 = r22
            goto L_0x0111
        L_0x0128:
            r22 = r15
            r1 = r8
            goto L_0x0131
        L_0x012c:
            r21 = r1
            r22 = r15
            r1 = -1
        L_0x0131:
            r4.zzc()
            r4.zzc()
            r4.zzc()
            r4.zzc()
            r4.zzc()
            r4.zzc()
            boolean r8 = r4.zzh()
            if (r8 == 0) goto L_0x01ae
            r8 = 6
            if (r10 == 0) goto L_0x0156
            boolean r10 = r4.zzh()
            if (r10 == 0) goto L_0x0156
            r4.zzf(r8)
            goto L_0x01ae
        L_0x0156:
            boolean r10 = r4.zzh()
            if (r10 == 0) goto L_0x01ae
            r10 = 0
            r15 = 4
        L_0x015e:
            if (r10 >= r15) goto L_0x01ae
            r15 = 0
        L_0x0161:
            if (r15 >= r8) goto L_0x01a2
            boolean r23 = r4.zzh()
            if (r23 != 0) goto L_0x0174
            r4.zzc()
            r25 = r1
            r23 = r13
            r1 = 3
            r18 = 4
            goto L_0x0196
        L_0x0174:
            int r23 = r10 + r10
            r18 = 4
            int r23 = r23 + 4
            r25 = r1
            r8 = 1
            int r1 = r8 << r23
            r23 = r13
            r13 = 64
            int r1 = java.lang.Math.min(r13, r1)
            if (r10 <= r8) goto L_0x018c
            r4.zzb()
        L_0x018c:
            r8 = 0
        L_0x018d:
            if (r8 >= r1) goto L_0x0195
            r4.zzb()
            int r8 = r8 + 1
            goto L_0x018d
        L_0x0195:
            r1 = 3
        L_0x0196:
            if (r10 != r1) goto L_0x019a
            r1 = 3
            goto L_0x019b
        L_0x019a:
            r1 = 1
        L_0x019b:
            int r15 = r15 + r1
            r13 = r23
            r1 = r25
            r8 = 6
            goto L_0x0161
        L_0x01a2:
            r25 = r1
            r23 = r13
            r18 = 4
            int r10 = r10 + 1
            r15 = r18
            r8 = 6
            goto L_0x015e
        L_0x01ae:
            r25 = r1
            r23 = r13
            r1 = 2
            r4.zzf(r1)
            boolean r1 = r4.zzh()
            if (r1 == 0) goto L_0x01ca
            r1 = 8
            r4.zzf(r1)
            r4.zzc()
            r4.zzc()
            r4.zze()
        L_0x01ca:
            int r1 = r4.zzc()
            r8 = 0
            int[] r10 = new int[r8]
            int[] r13 = new int[r8]
            r15 = r8
            r18 = r11
            r8 = -1
            r11 = -1
        L_0x01d8:
            if (r15 >= r1) goto L_0x030e
            if (r15 == 0) goto L_0x02ae
            boolean r24 = r4.zzh()
            if (r24 == 0) goto L_0x02ae
            r24 = r1
            int r1 = r8 + r11
            boolean r26 = r4.zzh()
            int r27 = r4.zzc()
            r19 = 1
            int r27 = r27 + 1
            int r26 = r26 + r26
            int r26 = 1 - r26
            r28 = r0
            int r0 = r1 + 1
            r29 = r9
            boolean[] r9 = new boolean[r0]
            r30 = r12
            r12 = 0
        L_0x0201:
            if (r12 > r1) goto L_0x0217
            boolean r31 = r4.zzh()
            if (r31 != 0) goto L_0x0210
            boolean r31 = r4.zzh()
            r9[r12] = r31
            goto L_0x0212
        L_0x0210:
            r9[r12] = r19
        L_0x0212:
            int r12 = r12 + 1
            r19 = 1
            goto L_0x0201
        L_0x0217:
            int r12 = r11 + -1
            r31 = r12
            int[] r12 = new int[r0]
            int[] r0 = new int[r0]
            r32 = 0
        L_0x0221:
            int r33 = r26 * r27
            if (r31 < 0) goto L_0x023a
            r34 = r13[r31]
            int r34 = r34 + r33
            if (r34 >= 0) goto L_0x0237
            int r33 = r8 + r31
            boolean r33 = r9[r33]
            if (r33 == 0) goto L_0x0237
            int r33 = r32 + 1
            r12[r32] = r34
            r32 = r33
        L_0x0237:
            int r31 = r31 + -1
            goto L_0x0221
        L_0x023a:
            if (r33 >= 0) goto L_0x0246
            boolean r26 = r9[r1]
            if (r26 == 0) goto L_0x0246
            int r26 = r32 + 1
            r12[r32] = r33
            r32 = r26
        L_0x0246:
            r26 = r2
            r27 = r6
            r2 = r32
            r6 = 0
        L_0x024d:
            if (r6 >= r8) goto L_0x0262
            r31 = r10[r6]
            int r31 = r31 + r33
            if (r31 >= 0) goto L_0x025f
            boolean r32 = r9[r6]
            if (r32 == 0) goto L_0x025f
            int r32 = r2 + 1
            r12[r2] = r31
            r2 = r32
        L_0x025f:
            int r6 = r6 + 1
            goto L_0x024d
        L_0x0262:
            int[] r6 = java.util.Arrays.copyOf(r12, r2)
            int r12 = r8 + -1
            r31 = 0
        L_0x026a:
            if (r12 < 0) goto L_0x027f
            r32 = r10[r12]
            int r32 = r32 + r33
            if (r32 <= 0) goto L_0x027c
            boolean r34 = r9[r12]
            if (r34 == 0) goto L_0x027c
            int r34 = r31 + 1
            r0[r31] = r32
            r31 = r34
        L_0x027c:
            int r12 = r12 + -1
            goto L_0x026a
        L_0x027f:
            if (r33 <= 0) goto L_0x028b
            boolean r1 = r9[r1]
            if (r1 == 0) goto L_0x028b
            int r1 = r31 + 1
            r0[r31] = r33
            r31 = r1
        L_0x028b:
            r1 = r31
            r10 = 0
        L_0x028e:
            if (r10 >= r11) goto L_0x02a5
            r12 = r13[r10]
            int r12 = r12 + r33
            if (r12 <= 0) goto L_0x02a2
            int r31 = r8 + r10
            boolean r31 = r9[r31]
            if (r31 == 0) goto L_0x02a2
            int r31 = r1 + 1
            r0[r1] = r12
            r1 = r31
        L_0x02a2:
            int r10 = r10 + 1
            goto L_0x028e
        L_0x02a5:
            int[] r0 = java.util.Arrays.copyOf(r0, r1)
            r13 = r0
            r11 = r1
            r8 = r2
            r10 = r6
            goto L_0x02fe
        L_0x02ae:
            r28 = r0
            r24 = r1
            r26 = r2
            r27 = r6
            r29 = r9
            r30 = r12
            int r0 = r4.zzc()
            int r1 = r4.zzc()
            int[] r2 = new int[r0]
            r6 = 0
        L_0x02c5:
            if (r6 >= r0) goto L_0x02de
            if (r6 <= 0) goto L_0x02ce
            int r8 = r6 + -1
            r8 = r2[r8]
            goto L_0x02cf
        L_0x02ce:
            r8 = 0
        L_0x02cf:
            int r9 = r4.zzc()
            r10 = 1
            int r9 = r9 + r10
            int r8 = r8 - r9
            r2[r6] = r8
            r4.zze()
            int r6 = r6 + 1
            goto L_0x02c5
        L_0x02de:
            int[] r6 = new int[r1]
            r8 = 0
        L_0x02e1:
            if (r8 >= r1) goto L_0x02fa
            if (r8 <= 0) goto L_0x02ea
            int r9 = r8 + -1
            r9 = r6[r9]
            goto L_0x02eb
        L_0x02ea:
            r9 = 0
        L_0x02eb:
            int r10 = r4.zzc()
            r11 = 1
            int r10 = r10 + r11
            int r9 = r9 + r10
            r6[r8] = r9
            r4.zze()
            int r8 = r8 + 1
            goto L_0x02e1
        L_0x02fa:
            r8 = r0
            r11 = r1
            r10 = r2
            r13 = r6
        L_0x02fe:
            int r15 = r15 + 1
            r1 = r24
            r2 = r26
            r6 = r27
            r0 = r28
            r9 = r29
            r12 = r30
            goto L_0x01d8
        L_0x030e:
            r28 = r0
            r26 = r2
            r27 = r6
            r29 = r9
            r30 = r12
            boolean r0 = r4.zzh()
            if (r0 == 0) goto L_0x032d
            int r0 = r4.zzc()
            r9 = 0
        L_0x0323:
            if (r9 >= r0) goto L_0x032d
            int r1 = r5 + 5
            r4.zzf(r1)
            int r9 = r9 + 1
            goto L_0x0323
        L_0x032d:
            r0 = 2
            r4.zzf(r0)
            boolean r1 = r4.zzh()
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r1 == 0) goto L_0x03f2
            boolean r1 = r4.zzh()
            if (r1 == 0) goto L_0x0377
            r1 = 8
            int r5 = r4.zza(r1)
            r1 = 255(0xff, float:3.57E-43)
            if (r5 != r1) goto L_0x035b
            r1 = 16
            int r5 = r4.zza(r1)
            int r1 = r4.zza(r1)
            if (r5 == 0) goto L_0x0377
            if (r1 == 0) goto L_0x0377
            float r2 = (float) r5
            float r1 = (float) r1
            float r2 = r2 / r1
            goto L_0x0377
        L_0x035b:
            r1 = 17
            if (r5 >= r1) goto L_0x0364
            float[] r1 = zzb
            r2 = r1[r5]
            goto L_0x0377
        L_0x0364:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r6 = "Unexpected aspect_ratio_idc value: "
            r1.<init>(r6)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            java.lang.String r5 = "NalUnitUtil"
            com.google.android.gms.internal.ads.zzea.zzf(r5, r1)
        L_0x0377:
            boolean r1 = r4.zzh()
            if (r1 == 0) goto L_0x0380
            r4.zze()
        L_0x0380:
            boolean r1 = r4.zzh()
            if (r1 == 0) goto L_0x03b2
            r1 = 3
            r4.zzf(r1)
            boolean r1 = r4.zzh()
            r3 = 1
            if (r3 == r1) goto L_0x0393
            r5 = r0
            goto L_0x0394
        L_0x0393:
            r5 = r3
        L_0x0394:
            boolean r0 = r4.zzh()
            if (r0 == 0) goto L_0x03b0
            r0 = 8
            int r1 = r4.zza(r0)
            int r3 = r4.zza(r0)
            r4.zzf(r0)
            int r11 = com.google.android.gms.internal.ads.zzk.zza(r1)
            int r0 = com.google.android.gms.internal.ads.zzk.zzb(r3)
            goto L_0x03d5
        L_0x03b0:
            r0 = -1
            goto L_0x03d4
        L_0x03b2:
            if (r3 == 0) goto L_0x03d2
            com.google.android.gms.internal.ads.zzfr r0 = r3.zzd
            if (r0 == 0) goto L_0x03d2
            int[] r1 = r0.zzb
            r1 = r1[r7]
            com.google.android.gms.internal.ads.zzfyq r0 = r0.zza
            int r3 = r0.size()
            if (r3 <= r1) goto L_0x03d2
            java.lang.Object r0 = r0.get(r1)
            com.google.android.gms.internal.ads.zzfq r0 = (com.google.android.gms.internal.ads.zzfq) r0
            int r11 = r0.zza
            int r1 = r0.zzb
            int r0 = r0.zzc
            r5 = r1
            goto L_0x03d5
        L_0x03d2:
            r0 = -1
            r5 = -1
        L_0x03d4:
            r11 = -1
        L_0x03d5:
            boolean r1 = r4.zzh()
            if (r1 == 0) goto L_0x03e1
            r4.zzc()
            r4.zzc()
        L_0x03e1:
            r4.zze()
            boolean r1 = r4.zzh()
            if (r1 == 0) goto L_0x03eb
            int r14 = r14 + r14
        L_0x03eb:
            r1 = r0
            r17 = r2
            r0 = r5
            r19 = r11
            goto L_0x03f8
        L_0x03f2:
            r17 = r2
            r0 = -1
            r1 = -1
            r19 = -1
        L_0x03f8:
            com.google.android.gms.internal.ads.zzfp r2 = new com.google.android.gms.internal.ads.zzfp
            r5 = r2
            r6 = r27
            r7 = r26
            r8 = r30
            r9 = r29
            r10 = r28
            r11 = r18
            r12 = r23
            r13 = r22
            r15 = r21
            r16 = r20
            r18 = r25
            r20 = r0
            r21 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfv.zzd(byte[], int, int, com.google.android.gms.internal.ads.zzfs):com.google.android.gms.internal.ads.zzfp");
    }

    /* JADX WARNING: Removed duplicated region for block: B:277:0x056e  */
    /* JADX WARNING: Removed duplicated region for block: B:290:0x05c1  */
    /* JADX WARNING: Removed duplicated region for block: B:499:0x05d7 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0135  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.ads.zzfs zze(byte[] r36, int r37, int r38) {
        /*
            com.google.android.gms.internal.ads.zzfw r0 = new com.google.android.gms.internal.ads.zzfw
            r1 = r36
            r2 = r37
            r3 = r38
            r0.<init>(r1, r2, r3)
            com.google.android.gms.internal.ads.zzfj r2 = zzm(r0)
            r1 = 4
            r0.zzf(r1)
            boolean r3 = r0.zzh()
            boolean r4 = r0.zzh()
            r5 = 6
            int r6 = r0.zza(r5)
            int r7 = r6 + 1
            r8 = 3
            int r9 = r0.zza(r8)
            r10 = 17
            r0.zzf(r10)
            r10 = 1
            r11 = 0
            com.google.android.gms.internal.ads.zzfk r12 = zzn(r0, r10, r9, r11)
            boolean r13 = r0.zzh()
            r14 = 0
            if (r10 == r13) goto L_0x003b
            r13 = r9
            goto L_0x003c
        L_0x003b:
            r13 = r14
        L_0x003c:
            if (r13 > r9) goto L_0x004a
            r0.zzc()
            r0.zzc()
            r0.zzc()
            int r13 = r13 + 1
            goto L_0x003c
        L_0x004a:
            int r13 = r0.zza(r5)
            int r15 = r0.zzc()
            int r15 = r15 + r10
            com.google.android.gms.internal.ads.zzfyq r11 = com.google.android.gms.internal.ads.zzfyq.zzo(r12)
            com.google.android.gms.internal.ads.zzfl r5 = new com.google.android.gms.internal.ads.zzfl
            int[] r8 = new int[r10]
            r5.<init>(r11, r8)
            r8 = 2
            if (r7 < r8) goto L_0x0065
            if (r15 < r8) goto L_0x0065
            r11 = r10
            goto L_0x0066
        L_0x0065:
            r11 = r14
        L_0x0066:
            if (r3 == 0) goto L_0x006c
            if (r4 == 0) goto L_0x006c
            r3 = r10
            goto L_0x006d
        L_0x006c:
            r3 = r14
        L_0x006d:
            int r4 = r13 + 1
            if (r11 == 0) goto L_0x0839
            if (r3 == 0) goto L_0x0839
            if (r4 >= r7) goto L_0x0077
            goto L_0x0839
        L_0x0077:
            int[] r3 = new int[r8]
            r3[r10] = r4
            r3[r14] = r15
            java.lang.Class r11 = java.lang.Integer.TYPE
            java.lang.Object r3 = java.lang.reflect.Array.newInstance(r11, r3)
            int[][] r3 = (int[][]) r3
            int[] r11 = new int[r15]
            int[] r8 = new int[r15]
            r16 = r3[r14]
            r16[r14] = r14
            r11[r14] = r10
            r8[r14] = r14
        L_0x0091:
            if (r10 >= r15) goto L_0x00b0
            r18 = r14
        L_0x0095:
            if (r14 > r13) goto L_0x00ac
            boolean r19 = r0.zzh()
            if (r19 == 0) goto L_0x00a7
            r19 = r3[r10]
            int r20 = r18 + 1
            r19[r18] = r14
            r8[r10] = r14
            r18 = r20
        L_0x00a7:
            r11[r10] = r18
            int r14 = r14 + 1
            goto L_0x0095
        L_0x00ac:
            int r10 = r10 + 1
            r14 = 0
            goto L_0x0091
        L_0x00b0:
            boolean r10 = r0.zzh()
            if (r10 == 0) goto L_0x0166
            r10 = 64
            r0.zzf(r10)
            boolean r10 = r0.zzh()
            if (r10 == 0) goto L_0x00c4
            r0.zzc()
        L_0x00c4:
            int r10 = r0.zzc()
            r1 = 0
        L_0x00c9:
            if (r1 >= r10) goto L_0x0166
            r0.zzc()
            if (r1 == 0) goto L_0x00de
            boolean r19 = r0.zzh()
            if (r19 == 0) goto L_0x00d7
            goto L_0x00de
        L_0x00d7:
            r19 = 0
            r20 = 0
        L_0x00db:
            r21 = 0
            goto L_0x0105
        L_0x00de:
            boolean r19 = r0.zzh()
            boolean r20 = r0.zzh()
            if (r19 != 0) goto L_0x00ea
            if (r20 == 0) goto L_0x00db
        L_0x00ea:
            boolean r21 = r0.zzh()
            if (r21 == 0) goto L_0x00f5
            r14 = 19
            r0.zzf(r14)
        L_0x00f5:
            r14 = 8
            r0.zzf(r14)
            if (r21 == 0) goto L_0x0100
            r14 = 4
            r0.zzf(r14)
        L_0x0100:
            r14 = 15
            r0.zzf(r14)
        L_0x0105:
            r14 = 0
        L_0x0106:
            if (r14 > r9) goto L_0x015c
            boolean r22 = r0.zzh()
            if (r22 != 0) goto L_0x0121
            boolean r22 = r0.zzh()
            if (r22 == 0) goto L_0x0115
            goto L_0x0121
        L_0x0115:
            boolean r22 = r0.zzh()
            if (r22 == 0) goto L_0x0124
            r22 = r8
            r23 = r10
            r10 = 0
            goto L_0x012e
        L_0x0121:
            r0.zzc()
        L_0x0124:
            int r22 = r0.zzc()
            r23 = r10
            r10 = r22
            r22 = r8
        L_0x012e:
            int r8 = r19 + r20
            r24 = r3
            r3 = 0
        L_0x0133:
            if (r3 >= r8) goto L_0x0153
            r25 = r8
            r8 = 0
        L_0x0138:
            if (r8 > r10) goto L_0x014e
            r0.zzc()
            r0.zzc()
            if (r21 == 0) goto L_0x0148
            r0.zzc()
            r0.zzc()
        L_0x0148:
            r0.zze()
            int r8 = r8 + 1
            goto L_0x0138
        L_0x014e:
            int r3 = r3 + 1
            r8 = r25
            goto L_0x0133
        L_0x0153:
            int r14 = r14 + 1
            r8 = r22
            r10 = r23
            r3 = r24
            goto L_0x0106
        L_0x015c:
            r24 = r3
            r22 = r8
            r23 = r10
            int r1 = r1 + 1
            goto L_0x00c9
        L_0x0166:
            r24 = r3
            r22 = r8
            boolean r1 = r0.zzh()
            if (r1 != 0) goto L_0x017e
            com.google.android.gms.internal.ads.zzfs r0 = new com.google.android.gms.internal.ads.zzfs
            r6 = 0
            r7 = 0
            r3 = 0
            r1 = r0
            r4 = r5
            r5 = r6
            r6 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            goto L_0x0849
        L_0x017e:
            r0.zzd()
            r1 = 0
            com.google.android.gms.internal.ads.zzfk r3 = zzn(r0, r1, r9, r12)
            boolean r1 = r0.zzh()
            r8 = 16
            boolean[] r10 = new boolean[r8]
            r19 = r3
            r3 = 0
            r14 = 0
        L_0x0192:
            if (r14 >= r8) goto L_0x01a1
            boolean r20 = r0.zzh()
            r10[r14] = r20
            if (r20 == 0) goto L_0x019e
            int r3 = r3 + 1
        L_0x019e:
            int r14 = r14 + 1
            goto L_0x0192
        L_0x01a1:
            if (r3 == 0) goto L_0x0828
            r14 = 1
            boolean r20 = r10[r14]
            if (r20 != 0) goto L_0x01aa
            goto L_0x0828
        L_0x01aa:
            int r14 = r3 + 1
            int[] r8 = new int[r3]
            r23 = r11
            r21 = r12
            r12 = 0
        L_0x01b3:
            int r11 = r3 - r1
            if (r12 >= r11) goto L_0x01c1
            r11 = 3
            int r25 = r0.zza(r11)
            r8[r12] = r25
            int r12 = r12 + 1
            goto L_0x01b3
        L_0x01c1:
            int[] r11 = new int[r14]
            if (r1 == 0) goto L_0x01e0
            r12 = 1
        L_0x01c6:
            if (r12 >= r3) goto L_0x01dd
            r14 = 0
        L_0x01c9:
            if (r14 >= r12) goto L_0x01da
            r25 = r11[r12]
            r26 = r8[r14]
            r16 = 1
            int r26 = r26 + 1
            int r25 = r25 + r26
            r11[r12] = r25
            int r14 = r14 + 1
            goto L_0x01c9
        L_0x01da:
            int r12 = r12 + 1
            goto L_0x01c6
        L_0x01dd:
            r12 = 6
            r11[r3] = r12
        L_0x01e0:
            r12 = 2
            int[] r14 = new int[r12]
            r12 = 1
            r14[r12] = r3
            r12 = 0
            r14[r12] = r7
            java.lang.Class r12 = java.lang.Integer.TYPE
            java.lang.Object r12 = java.lang.reflect.Array.newInstance(r12, r14)
            int[][] r12 = (int[][]) r12
            int[] r14 = new int[r7]
            r17 = 0
            r14[r17] = r17
            boolean r25 = r0.zzh()
            r26 = r9
            r27 = r15
            r9 = 1
        L_0x0200:
            if (r9 >= r7) goto L_0x0251
            if (r25 == 0) goto L_0x020c
            r15 = 6
            int r29 = r0.zza(r15)
            r14[r9] = r29
            goto L_0x020f
        L_0x020c:
            r15 = 6
            r14[r9] = r9
        L_0x020f:
            if (r1 != 0) goto L_0x022c
            r15 = 0
        L_0x0212:
            if (r15 >= r3) goto L_0x0229
            r28 = r12[r9]
            r29 = r8[r15]
            r30 = r1
            r16 = 1
            int r1 = r29 + 1
            int r1 = r0.zza(r1)
            r28[r15] = r1
            int r15 = r15 + 1
            r1 = r30
            goto L_0x0212
        L_0x0229:
            r30 = r1
            goto L_0x024c
        L_0x022c:
            r30 = r1
            r1 = 0
        L_0x022f:
            if (r1 >= r3) goto L_0x024c
            r15 = r12[r9]
            r29 = r14[r9]
            int r31 = r1 + 1
            r32 = r11[r31]
            r16 = 1
            int r32 = r16 << r32
            r28 = -1
            int r32 = r32 + -1
            r29 = r29 & r32
            r32 = r11[r1]
            int r29 = r29 >> r32
            r15[r1] = r29
            r1 = r31
            goto L_0x022f
        L_0x024c:
            int r9 = r9 + 1
            r1 = r30
            goto L_0x0200
        L_0x0251:
            int[] r1 = new int[r4]
            r3 = 1
            r8 = 0
        L_0x0255:
            if (r8 >= r7) goto L_0x0296
            r9 = r14[r8]
            r11 = -1
            r1[r9] = r11
            r9 = 0
            r11 = 0
        L_0x025e:
            r15 = 16
            if (r9 >= r15) goto L_0x027e
            boolean r15 = r10[r9]
            if (r15 == 0) goto L_0x027b
            r15 = 1
            if (r9 != r15) goto L_0x0274
            r9 = r14[r8]
            r16 = r12[r8]
            r16 = r16[r11]
            r1[r9] = r16
            r16 = r15
            goto L_0x0276
        L_0x0274:
            r16 = r9
        L_0x0276:
            int r11 = r11 + 1
            r9 = r16
            goto L_0x027c
        L_0x027b:
            r15 = 1
        L_0x027c:
            int r9 = r9 + r15
            goto L_0x025e
        L_0x027e:
            if (r8 <= 0) goto L_0x0293
            r9 = 0
        L_0x0281:
            if (r9 >= r8) goto L_0x0291
            r11 = r14[r8]
            r11 = r1[r11]
            r15 = r14[r9]
            r15 = r1[r15]
            if (r11 != r15) goto L_0x028e
            goto L_0x0293
        L_0x028e:
            int r9 = r9 + 1
            goto L_0x0281
        L_0x0291:
            int r3 = r3 + 1
        L_0x0293:
            int r8 = r8 + 1
            goto L_0x0255
        L_0x0296:
            r8 = 4
            int r9 = r0.zza(r8)
            r8 = 2
            if (r3 < r8) goto L_0x0817
            if (r9 != 0) goto L_0x02a2
            goto L_0x0817
        L_0x02a2:
            int[] r8 = new int[r3]
            r10 = 0
        L_0x02a5:
            if (r10 >= r3) goto L_0x02b0
            int r11 = r0.zza(r9)
            r8[r10] = r11
            int r10 = r10 + 1
            goto L_0x02a5
        L_0x02b0:
            int[] r9 = new int[r4]
            r10 = 0
        L_0x02b3:
            if (r10 >= r7) goto L_0x02c0
            r11 = r14[r10]
            int r11 = java.lang.Math.min(r11, r13)
            r9[r11] = r10
            int r10 = r10 + 1
            goto L_0x02b3
        L_0x02c0:
            com.google.android.gms.internal.ads.zzfyn r10 = new com.google.android.gms.internal.ads.zzfyn
            r10.<init>()
            r11 = 0
        L_0x02c6:
            if (r11 > r13) goto L_0x02e8
            r12 = r1[r11]
            r25 = r1
            r15 = -1
            int r1 = r3 + -1
            int r1 = java.lang.Math.min(r12, r1)
            if (r1 < 0) goto L_0x02d8
            r1 = r8[r1]
            goto L_0x02d9
        L_0x02d8:
            r1 = -1
        L_0x02d9:
            com.google.android.gms.internal.ads.zzfi r12 = new com.google.android.gms.internal.ads.zzfi
            r15 = r9[r11]
            r12.<init>(r15, r1)
            r10.zzf(r12)
            int r11 = r11 + 1
            r1 = r25
            goto L_0x02c6
        L_0x02e8:
            com.google.android.gms.internal.ads.zzfyq r3 = r10.zzi()
            r1 = 0
            java.lang.Object r8 = r3.get(r1)
            com.google.android.gms.internal.ads.zzfi r8 = (com.google.android.gms.internal.ads.zzfi) r8
            int r1 = r8.zzb
            r8 = -1
            if (r1 != r8) goto L_0x0306
            com.google.android.gms.internal.ads.zzfs r0 = new com.google.android.gms.internal.ads.zzfs
            r6 = 0
            r7 = 0
            r3 = 0
            r1 = r0
            r4 = r5
            r5 = r6
            r6 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            goto L_0x0849
        L_0x0306:
            r1 = 1
        L_0x0307:
            if (r1 > r13) goto L_0x0318
            java.lang.Object r8 = r3.get(r1)
            com.google.android.gms.internal.ads.zzfi r8 = (com.google.android.gms.internal.ads.zzfi) r8
            int r8 = r8.zzb
            r9 = -1
            if (r8 == r9) goto L_0x0315
            goto L_0x031a
        L_0x0315:
            int r1 = r1 + 1
            goto L_0x0307
        L_0x0318:
            r9 = -1
            r1 = r9
        L_0x031a:
            if (r1 != r9) goto L_0x032a
            com.google.android.gms.internal.ads.zzfs r0 = new com.google.android.gms.internal.ads.zzfs
            r6 = 0
            r7 = 0
            r3 = 0
            r1 = r0
            r4 = r5
            r5 = r6
            r6 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            goto L_0x0849
        L_0x032a:
            r8 = 2
            int[] r9 = new int[r8]
            r10 = 1
            r9[r10] = r7
            r11 = 0
            r9[r11] = r7
            java.lang.Class r12 = java.lang.Boolean.TYPE
            java.lang.Object r9 = java.lang.reflect.Array.newInstance(r12, r9)
            boolean[][] r9 = (boolean[][]) r9
            int[] r12 = new int[r8]
            r12[r10] = r7
            r12[r11] = r7
            java.lang.Class r8 = java.lang.Boolean.TYPE
            java.lang.Object r8 = java.lang.reflect.Array.newInstance(r8, r12)
            boolean[][] r8 = (boolean[][]) r8
            r10 = 1
        L_0x034a:
            if (r10 >= r7) goto L_0x0361
            r11 = 0
        L_0x034d:
            if (r11 >= r10) goto L_0x035e
            r12 = r9[r10]
            r13 = r8[r10]
            boolean r15 = r0.zzh()
            r13[r11] = r15
            r12[r11] = r15
            int r11 = r11 + 1
            goto L_0x034d
        L_0x035e:
            int r10 = r10 + 1
            goto L_0x034a
        L_0x0361:
            r10 = 1
        L_0x0362:
            if (r10 >= r7) goto L_0x0383
            r11 = 0
        L_0x0365:
            if (r11 >= r6) goto L_0x0380
            r12 = 0
        L_0x0368:
            if (r12 >= r10) goto L_0x037d
            r13 = r8[r10]
            boolean r15 = r13[r12]
            if (r15 == 0) goto L_0x037a
            r15 = r8[r12]
            boolean r15 = r15[r11]
            if (r15 == 0) goto L_0x037a
            r15 = 1
            r13[r11] = r15
            goto L_0x037d
        L_0x037a:
            int r12 = r12 + 1
            goto L_0x0368
        L_0x037d:
            int r11 = r11 + 1
            goto L_0x0365
        L_0x0380:
            int r10 = r10 + 1
            goto L_0x0362
        L_0x0383:
            int[] r10 = new int[r4]
            r11 = 0
        L_0x0386:
            if (r11 >= r7) goto L_0x039b
            r12 = 0
            r13 = 0
        L_0x038a:
            if (r12 >= r11) goto L_0x0394
            r15 = r9[r11]
            boolean r15 = r15[r12]
            int r13 = r13 + r15
            int r12 = r12 + 1
            goto L_0x038a
        L_0x0394:
            r12 = r14[r11]
            r10[r12] = r13
            int r11 = r11 + 1
            goto L_0x0386
        L_0x039b:
            r11 = 0
            r12 = 0
        L_0x039d:
            if (r11 >= r7) goto L_0x03aa
            r13 = r14[r11]
            r13 = r10[r13]
            if (r13 != 0) goto L_0x03a7
            int r12 = r12 + 1
        L_0x03a7:
            int r11 = r11 + 1
            goto L_0x039d
        L_0x03aa:
            r11 = 1
            if (r12 <= r11) goto L_0x03bb
            com.google.android.gms.internal.ads.zzfs r0 = new com.google.android.gms.internal.ads.zzfs
            r6 = 0
            r7 = 0
            r3 = 0
            r1 = r0
            r4 = r5
            r5 = r6
            r6 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            goto L_0x0849
        L_0x03bb:
            int[] r11 = new int[r7]
            r15 = r27
            int[] r12 = new int[r15]
            boolean r13 = r0.zzh()
            if (r13 == 0) goto L_0x03dd
            r13 = 0
        L_0x03c8:
            if (r13 >= r7) goto L_0x03d8
            r25 = r14
            r14 = 3
            int r27 = r0.zza(r14)
            r11[r13] = r27
            int r13 = r13 + 1
            r14 = r25
            goto L_0x03c8
        L_0x03d8:
            r25 = r14
            r13 = r26
            goto L_0x03e5
        L_0x03dd:
            r25 = r14
            r13 = r26
            r14 = 0
            java.util.Arrays.fill(r11, r14, r7, r13)
        L_0x03e5:
            r14 = 0
        L_0x03e6:
            if (r14 >= r15) goto L_0x0416
            r27 = r1
            r37 = r8
            r26 = r10
            r8 = 0
            r10 = 0
        L_0x03f0:
            r1 = r23[r14]
            if (r10 >= r1) goto L_0x0409
            r1 = r24[r14]
            r1 = r1[r10]
            java.lang.Object r1 = r3.get(r1)
            com.google.android.gms.internal.ads.zzfi r1 = (com.google.android.gms.internal.ads.zzfi) r1
            int r1 = r1.zza
            r1 = r11[r1]
            int r8 = java.lang.Math.max(r8, r1)
            int r10 = r10 + 1
            goto L_0x03f0
        L_0x0409:
            int r8 = r8 + 1
            r12[r14] = r8
            int r14 = r14 + 1
            r8 = r37
            r10 = r26
            r1 = r27
            goto L_0x03e6
        L_0x0416:
            r27 = r1
            r37 = r8
            r26 = r10
            boolean r1 = r0.zzh()
            if (r1 == 0) goto L_0x0439
            r1 = 0
        L_0x0423:
            if (r1 >= r6) goto L_0x0439
            int r8 = r1 + 1
            r10 = r8
        L_0x0428:
            if (r10 >= r7) goto L_0x0437
            r11 = r9[r10]
            boolean r11 = r11[r1]
            if (r11 == 0) goto L_0x0434
            r11 = 3
            r0.zzf(r11)
        L_0x0434:
            int r10 = r10 + 1
            goto L_0x0428
        L_0x0437:
            r1 = r8
            goto L_0x0423
        L_0x0439:
            r0.zze()
            int r1 = r0.zzc()
            r6 = 1
            int r1 = r1 + r6
            com.google.android.gms.internal.ads.zzfyn r8 = new com.google.android.gms.internal.ads.zzfyn
            r8.<init>()
            r10 = r21
            r8.zzf(r10)
            if (r1 <= r6) goto L_0x0464
            r6 = r19
            r8.zzf(r6)
            r10 = 2
        L_0x0454:
            if (r10 >= r1) goto L_0x0464
            boolean r11 = r0.zzh()
            com.google.android.gms.internal.ads.zzfk r6 = zzn(r0, r11, r13, r6)
            r8.zzf(r6)
            int r10 = r10 + 1
            goto L_0x0454
        L_0x0464:
            com.google.android.gms.internal.ads.zzfyq r6 = r8.zzi()
            int r8 = r0.zzc()
            int r8 = r8 + r15
            if (r8 <= r15) goto L_0x047d
            com.google.android.gms.internal.ads.zzfs r0 = new com.google.android.gms.internal.ads.zzfs
            r6 = 0
            r7 = 0
            r3 = 0
            r1 = r0
            r4 = r5
            r5 = r6
            r6 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            goto L_0x0849
        L_0x047d:
            r10 = 2
            int r11 = r0.zza(r10)
            int[] r13 = new int[r10]
            r10 = 1
            r13[r10] = r4
            r10 = 0
            r13[r10] = r8
            java.lang.Class r14 = java.lang.Boolean.TYPE
            java.lang.Object r13 = java.lang.reflect.Array.newInstance(r14, r13)
            boolean[][] r13 = (boolean[][]) r13
            int[] r14 = new int[r8]
            int[] r10 = new int[r8]
            r19 = r6
            r6 = 0
        L_0x0499:
            if (r6 >= r15) goto L_0x04ef
            r21 = r15
            r15 = 0
            r14[r6] = r15
            r15 = r22[r6]
            r10[r6] = r15
            if (r11 != 0) goto L_0x04bb
            r15 = r13[r6]
            r28 = r9
            r9 = r23[r6]
            r30 = r7
            r29 = r12
            r7 = 1
            r12 = 0
            java.util.Arrays.fill(r15, r12, r9, r7)
            r9 = r23[r6]
            r14[r6] = r9
        L_0x04b9:
            r9 = 0
            goto L_0x04e4
        L_0x04bb:
            r30 = r7
            r28 = r9
            r29 = r12
            r7 = 1
            if (r11 != r7) goto L_0x04dd
            r7 = 0
        L_0x04c5:
            r9 = r23[r6]
            if (r7 >= r9) goto L_0x04d9
            r9 = r13[r6]
            r12 = r24[r6]
            r12 = r12[r7]
            if (r12 != r15) goto L_0x04d3
            r12 = 1
            goto L_0x04d4
        L_0x04d3:
            r12 = 0
        L_0x04d4:
            r9[r7] = r12
            int r7 = r7 + 1
            goto L_0x04c5
        L_0x04d9:
            r7 = 1
            r14[r6] = r7
            goto L_0x04b9
        L_0x04dd:
            r9 = 0
            r12 = r13[r9]
            r12[r9] = r7
            r14[r9] = r7
        L_0x04e4:
            int r6 = r6 + 1
            r15 = r21
            r9 = r28
            r12 = r29
            r7 = r30
            goto L_0x0499
        L_0x04ef:
            r30 = r7
            r28 = r9
            r29 = r12
            r21 = r15
            r7 = 1
            r9 = 0
            int[] r6 = new int[r4]
            r12 = 2
            int[] r15 = new int[r12]
            r15[r7] = r4
            r15[r9] = r8
            java.lang.Class r4 = java.lang.Boolean.TYPE
            java.lang.Object r4 = java.lang.reflect.Array.newInstance(r4, r15)
            boolean[][] r4 = (boolean[][]) r4
            r7 = 0
            r9 = 1
        L_0x050c:
            if (r9 >= r8) goto L_0x0602
            if (r11 != r12) goto L_0x0532
            r12 = 0
        L_0x0511:
            r15 = r23[r9]
            if (r12 >= r15) goto L_0x0532
            r15 = r13[r9]
            boolean r22 = r0.zzh()
            r15[r12] = r22
            r15 = r14[r9]
            r22 = r13[r9]
            boolean r22 = r22[r12]
            int r15 = r15 + r22
            r14[r9] = r15
            if (r22 == 0) goto L_0x052f
            r15 = r24[r9]
            r15 = r15[r12]
            r10[r9] = r15
        L_0x052f:
            int r12 = r12 + 1
            goto L_0x0511
        L_0x0532:
            if (r7 != 0) goto L_0x0565
            r7 = r24[r9]
            r12 = 0
            r7 = r7[r12]
            if (r7 != 0) goto L_0x055f
            r7 = r13[r9]
            boolean r7 = r7[r12]
            if (r7 == 0) goto L_0x055f
            r7 = r12
            r15 = 1
        L_0x0543:
            r12 = r23[r9]
            if (r15 >= r12) goto L_0x0565
            r12 = r24[r9]
            r12 = r12[r15]
            r22 = r11
            r11 = r27
            if (r12 != r11) goto L_0x0558
            r12 = r13[r9]
            boolean r12 = r12[r11]
            if (r12 == 0) goto L_0x0558
            r7 = r9
        L_0x0558:
            int r15 = r15 + 1
            r27 = r11
            r11 = r22
            goto L_0x0543
        L_0x055f:
            r22 = r11
            r11 = r27
            r7 = 0
            goto L_0x0569
        L_0x0565:
            r22 = r11
            r11 = r27
        L_0x0569:
            r12 = 0
        L_0x056a:
            r15 = r23[r9]
            if (r12 >= r15) goto L_0x05e1
            r15 = 1
            if (r1 <= r15) goto L_0x05d0
            r15 = r4[r9]
            r27 = r13[r9]
            boolean r27 = r27[r12]
            r15[r12] = r27
            r15 = r10
            r27 = r11
            double r10 = (double) r1
            r31 = r1
            java.math.RoundingMode r1 = java.math.RoundingMode.CEILING
            int r1 = com.google.android.gms.internal.ads.zzgbj.zza(r10, r1)
            r10 = r4[r9]
            boolean r10 = r10[r12]
            if (r10 != 0) goto L_0x05b9
            r10 = r24[r9]
            r10 = r10[r12]
            java.lang.Object r10 = r3.get(r10)
            com.google.android.gms.internal.ads.zzfi r10 = (com.google.android.gms.internal.ads.zzfi) r10
            int r10 = r10.zza
            r11 = 0
        L_0x0598:
            if (r11 >= r12) goto L_0x05b9
            r32 = r24[r9]
            r33 = r13
            r13 = r32[r11]
            java.lang.Object r13 = r3.get(r13)
            com.google.android.gms.internal.ads.zzfi r13 = (com.google.android.gms.internal.ads.zzfi) r13
            int r13 = r13.zza
            r32 = r37[r10]
            boolean r13 = r32[r13]
            if (r13 == 0) goto L_0x05b4
            r10 = r4[r9]
            r11 = 1
            r10[r12] = r11
            goto L_0x05bb
        L_0x05b4:
            int r11 = r11 + 1
            r13 = r33
            goto L_0x0598
        L_0x05b9:
            r33 = r13
        L_0x05bb:
            r10 = r4[r9]
            boolean r10 = r10[r12]
            if (r10 == 0) goto L_0x05d7
            if (r7 <= 0) goto L_0x05cc
            if (r9 != r7) goto L_0x05cc
            int r1 = r0.zza(r1)
            r6[r12] = r1
            goto L_0x05d7
        L_0x05cc:
            r0.zzf(r1)
            goto L_0x05d7
        L_0x05d0:
            r31 = r1
            r15 = r10
            r27 = r11
            r33 = r13
        L_0x05d7:
            int r12 = r12 + 1
            r10 = r15
            r11 = r27
            r1 = r31
            r13 = r33
            goto L_0x056a
        L_0x05e1:
            r31 = r1
            r15 = r10
            r27 = r11
            r33 = r13
            r1 = r14[r9]
            r10 = 1
            if (r1 != r10) goto L_0x05f6
            r1 = r15[r9]
            r1 = r26[r1]
            if (r1 <= 0) goto L_0x05f6
            r0.zze()
        L_0x05f6:
            int r9 = r9 + 1
            r10 = r15
            r11 = r22
            r1 = r31
            r13 = r33
            r12 = 2
            goto L_0x050c
        L_0x0602:
            if (r7 != 0) goto L_0x0612
            com.google.android.gms.internal.ads.zzfs r0 = new com.google.android.gms.internal.ads.zzfs
            r6 = 0
            r7 = 0
            r3 = 0
            r1 = r0
            r4 = r5
            r5 = r6
            r6 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            goto L_0x0849
        L_0x0612:
            int r1 = r0.zzc()
            int r5 = r1 + 1
            com.google.android.gms.internal.ads.zzfyn r7 = com.google.android.gms.internal.ads.zzfyq.zzi(r5)
            r9 = r30
            int[] r10 = new int[r9]
            r11 = 0
        L_0x0621:
            if (r11 >= r5) goto L_0x0695
            r12 = 16
            int r13 = r0.zza(r12)
            int r14 = r0.zza(r12)
            boolean r15 = r0.zzh()
            if (r15 == 0) goto L_0x064c
            r15 = 2
            int r12 = r0.zza(r15)
            r15 = 3
            if (r12 != r15) goto L_0x063e
            r0.zze()
        L_0x063e:
            r15 = 4
            int r22 = r0.zza(r15)
            int r24 = r0.zza(r15)
            r32 = r22
            r33 = r24
            goto L_0x0651
        L_0x064c:
            r12 = 0
            r32 = 0
            r33 = 0
        L_0x0651:
            boolean r15 = r0.zzh()
            if (r15 == 0) goto L_0x0676
            int r15 = r0.zzc()
            r37 = r3
            int r3 = r0.zzc()
            r22 = r2
            int r2 = r0.zzc()
            r24 = r6
            int r6 = r0.zzc()
            int r13 = zzl(r13, r12, r15, r3)
            int r14 = zzk(r14, r12, r2, r6)
            goto L_0x067c
        L_0x0676:
            r22 = r2
            r37 = r3
            r24 = r6
        L_0x067c:
            r34 = r13
            r35 = r14
            com.google.android.gms.internal.ads.zzfm r2 = new com.google.android.gms.internal.ads.zzfm
            r30 = r2
            r31 = r12
            r30.<init>(r31, r32, r33, r34, r35)
            r7.zzf(r2)
            int r11 = r11 + 1
            r3 = r37
            r2 = r22
            r6 = r24
            goto L_0x0621
        L_0x0695:
            r22 = r2
            r37 = r3
            r24 = r6
            r2 = 1
            if (r5 <= r2) goto L_0x06b7
            boolean r2 = r0.zzh()
            if (r2 == 0) goto L_0x06b7
            double r1 = (double) r5
            java.math.RoundingMode r3 = java.math.RoundingMode.CEILING
            int r1 = com.google.android.gms.internal.ads.zzgbj.zza(r1, r3)
            r2 = 1
        L_0x06ac:
            if (r2 >= r9) goto L_0x06c3
            int r3 = r0.zza(r1)
            r10[r2] = r3
            int r2 = r2 + 1
            goto L_0x06ac
        L_0x06b7:
            r2 = 1
        L_0x06b8:
            if (r2 >= r9) goto L_0x06c3
            int r3 = java.lang.Math.min(r2, r1)
            r10[r2] = r3
            int r2 = r2 + 1
            goto L_0x06b8
        L_0x06c3:
            com.google.android.gms.internal.ads.zzfn r5 = new com.google.android.gms.internal.ads.zzfn
            com.google.android.gms.internal.ads.zzfyq r1 = r7.zzi()
            r5.<init>(r1, r10)
            r1 = 2
            r0.zzf(r1)
            r1 = 1
        L_0x06d1:
            if (r1 >= r9) goto L_0x06df
            r2 = r25[r1]
            r2 = r26[r2]
            if (r2 != 0) goto L_0x06dc
            r0.zze()
        L_0x06dc:
            int r1 = r1 + 1
            goto L_0x06d1
        L_0x06df:
            r1 = 1
        L_0x06e0:
            if (r1 >= r8) goto L_0x0718
            boolean r2 = r0.zzh()
            r3 = 0
        L_0x06e7:
            r6 = r29[r1]
            if (r3 >= r6) goto L_0x0715
            if (r3 <= 0) goto L_0x06f4
            if (r2 == 0) goto L_0x06f4
            boolean r6 = r0.zzh()
            goto L_0x06f9
        L_0x06f4:
            if (r3 != 0) goto L_0x06f8
            r6 = 1
            goto L_0x06f9
        L_0x06f8:
            r6 = 0
        L_0x06f9:
            if (r6 == 0) goto L_0x0712
            r6 = 0
        L_0x06fc:
            r7 = r23[r1]
            if (r6 >= r7) goto L_0x070c
            r7 = r4[r1]
            boolean r7 = r7[r6]
            if (r7 == 0) goto L_0x0709
            r0.zzc()
        L_0x0709:
            int r6 = r6 + 1
            goto L_0x06fc
        L_0x070c:
            r0.zzc()
            r0.zzc()
        L_0x0712:
            int r3 = r3 + 1
            goto L_0x06e7
        L_0x0715:
            int r1 = r1 + 1
            goto L_0x06e0
        L_0x0718:
            int r1 = r0.zzc()
            r14 = 2
            int r1 = r1 + r14
            boolean r2 = r0.zzh()
            if (r2 == 0) goto L_0x0728
            r0.zzf(r1)
            goto L_0x073d
        L_0x0728:
            r2 = 1
        L_0x0729:
            if (r2 >= r9) goto L_0x073d
            r3 = 0
        L_0x072c:
            if (r3 >= r2) goto L_0x073a
            r4 = r28[r2]
            boolean r4 = r4[r3]
            if (r4 == 0) goto L_0x0737
            r0.zzf(r1)
        L_0x0737:
            int r3 = r3 + 1
            goto L_0x072c
        L_0x073a:
            int r2 = r2 + 1
            goto L_0x0729
        L_0x073d:
            int r1 = r0.zzc()
            r2 = 1
        L_0x0742:
            if (r2 > r1) goto L_0x074c
            r3 = 8
            r0.zzf(r3)
            int r2 = r2 + 1
            goto L_0x0742
        L_0x074c:
            boolean r1 = r0.zzh()
            if (r1 == 0) goto L_0x0802
            r0.zzd()
            boolean r1 = r0.zzh()
            if (r1 != 0) goto L_0x0761
            boolean r1 = r0.zzh()
            if (r1 == 0) goto L_0x0764
        L_0x0761:
            r0.zze()
        L_0x0764:
            boolean r1 = r0.zzh()
            boolean r2 = r0.zzh()
            if (r1 != 0) goto L_0x0770
            if (r2 == 0) goto L_0x079e
        L_0x0770:
            r15 = r21
            r3 = 0
        L_0x0773:
            if (r3 >= r15) goto L_0x079e
            r4 = 0
        L_0x0776:
            r6 = r29[r3]
            if (r4 >= r6) goto L_0x079b
            if (r1 == 0) goto L_0x0781
            boolean r6 = r0.zzh()
            goto L_0x0782
        L_0x0781:
            r6 = 0
        L_0x0782:
            if (r2 == 0) goto L_0x0789
            boolean r7 = r0.zzh()
            goto L_0x078a
        L_0x0789:
            r7 = 0
        L_0x078a:
            if (r6 == 0) goto L_0x0791
            r6 = 32
            r0.zzf(r6)
        L_0x0791:
            if (r7 == 0) goto L_0x0798
            r6 = 18
            r0.zzf(r6)
        L_0x0798:
            int r4 = r4 + 1
            goto L_0x0776
        L_0x079b:
            int r3 = r3 + 1
            goto L_0x0773
        L_0x079e:
            boolean r1 = r0.zzh()
            if (r1 == 0) goto L_0x07ac
            r2 = 4
            int r3 = r0.zza(r2)
            r2 = 1
            int r3 = r3 + r2
            goto L_0x07ae
        L_0x07ac:
            r2 = 1
            r3 = r9
        L_0x07ae:
            com.google.android.gms.internal.ads.zzfyn r4 = com.google.android.gms.internal.ads.zzfyq.zzi(r3)
            int[] r6 = new int[r9]
            r7 = 0
        L_0x07b5:
            if (r7 >= r3) goto L_0x07e5
            r8 = 3
            r0.zzf(r8)
            boolean r10 = r0.zzh()
            if (r2 == r10) goto L_0x07c3
            r2 = r14
            goto L_0x07c4
        L_0x07c3:
            r2 = 1
        L_0x07c4:
            r10 = 8
            int r11 = r0.zza(r10)
            int r11 = com.google.android.gms.internal.ads.zzk.zza(r11)
            int r12 = r0.zza(r10)
            int r12 = com.google.android.gms.internal.ads.zzk.zzb(r12)
            r0.zzf(r10)
            com.google.android.gms.internal.ads.zzfq r13 = new com.google.android.gms.internal.ads.zzfq
            r13.<init>(r11, r2, r12)
            r4.zzf(r13)
            int r7 = r7 + 1
            r2 = 1
            goto L_0x07b5
        L_0x07e5:
            if (r1 == 0) goto L_0x07f7
            r1 = 1
            if (r3 <= r1) goto L_0x07f7
            r14 = 0
        L_0x07eb:
            if (r14 >= r9) goto L_0x07f7
            r1 = 4
            int r2 = r0.zza(r1)
            r6[r14] = r2
            int r14 = r14 + 1
            goto L_0x07eb
        L_0x07f7:
            com.google.android.gms.internal.ads.zzfr r0 = new com.google.android.gms.internal.ads.zzfr
            com.google.android.gms.internal.ads.zzfyq r1 = r4.zzi()
            r0.<init>(r1, r6)
            r6 = r0
            goto L_0x0803
        L_0x0802:
            r6 = 0
        L_0x0803:
            com.google.android.gms.internal.ads.zzfs r0 = new com.google.android.gms.internal.ads.zzfs
            com.google.android.gms.internal.ads.zzfl r4 = new com.google.android.gms.internal.ads.zzfl
            r1 = r19
            r2 = r24
            r4.<init>(r1, r2)
            r1 = r0
            r2 = r22
            r3 = r37
            r1.<init>(r2, r3, r4, r5, r6)
            goto L_0x0849
        L_0x0817:
            r22 = r2
            com.google.android.gms.internal.ads.zzfs r0 = new com.google.android.gms.internal.ads.zzfs
            r6 = 0
            r7 = 0
            r3 = 0
            r1 = r0
            r2 = r22
            r4 = r5
            r5 = r6
            r6 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            goto L_0x0849
        L_0x0828:
            r22 = r2
            com.google.android.gms.internal.ads.zzfs r0 = new com.google.android.gms.internal.ads.zzfs
            r6 = 0
            r7 = 0
            r3 = 0
            r1 = r0
            r2 = r22
            r4 = r5
            r5 = r6
            r6 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            goto L_0x0849
        L_0x0839:
            r22 = r2
            com.google.android.gms.internal.ads.zzfs r0 = new com.google.android.gms.internal.ads.zzfs
            r6 = 0
            r7 = 0
            r3 = 0
            r1 = r0
            r2 = r22
            r4 = r5
            r5 = r6
            r6 = r7
            r1.<init>(r2, r3, r4, r5, r6)
        L_0x0849:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfv.zze(byte[], int, int):com.google.android.gms.internal.ads.zzfs");
    }

    public static zzft zzf(byte[] bArr, int i, int i2) {
        zzfw zzfw = new zzfw(bArr, 4, i2);
        int zzc2 = zzfw.zzc();
        int zzc3 = zzfw.zzc();
        zzfw.zze();
        return new zzft(zzc2, zzc3, zzfw.zzh());
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x01bc  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01c5  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x01f5  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x01fe  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x020a  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0215  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x021e  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0231  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x024e  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0258  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0177  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.ads.zzfu zzg(byte[] r32, int r33, int r34) {
        /*
            com.google.android.gms.internal.ads.zzfw r0 = new com.google.android.gms.internal.ads.zzfw
            r1 = r32
            r2 = r33
            r3 = r34
            r0.<init>(r1, r2, r3)
            r1 = 8
            int r2 = r0.zza(r1)
            int r5 = r0.zza(r1)
            int r6 = r0.zza(r1)
            int r7 = r0.zzc()
            r3 = 86
            r4 = 44
            r8 = 122(0x7a, float:1.71E-43)
            r9 = 110(0x6e, float:1.54E-43)
            r10 = 244(0xf4, float:3.42E-43)
            r11 = 3
            r12 = 16
            r14 = 1
            r15 = 100
            if (r2 == r15) goto L_0x0053
            if (r2 == r9) goto L_0x0053
            if (r2 == r8) goto L_0x0053
            if (r2 == r10) goto L_0x0053
            if (r2 == r4) goto L_0x0053
            r13 = 83
            if (r2 == r13) goto L_0x0053
            if (r2 == r3) goto L_0x0053
            r13 = 118(0x76, float:1.65E-43)
            if (r2 == r13) goto L_0x0053
            r13 = 128(0x80, float:1.794E-43)
            if (r2 == r13) goto L_0x0053
            r13 = 138(0x8a, float:1.93E-43)
            if (r2 != r13) goto L_0x004b
            r2 = r13
            goto L_0x0053
        L_0x004b:
            r13 = r14
            r16 = 0
            r17 = 0
            r18 = 0
            goto L_0x00b1
        L_0x0053:
            int r13 = r0.zzc()
            if (r13 != r11) goto L_0x005f
            boolean r16 = r0.zzh()
            r1 = r11
            goto L_0x0062
        L_0x005f:
            r1 = r13
            r16 = 0
        L_0x0062:
            int r17 = r0.zzc()
            int r18 = r0.zzc()
            r0.zze()
            boolean r19 = r0.zzh()
            if (r19 == 0) goto L_0x00b1
            if (r1 == r11) goto L_0x0078
            r1 = 8
            goto L_0x007a
        L_0x0078:
            r1 = 12
        L_0x007a:
            r10 = 0
        L_0x007b:
            if (r10 >= r1) goto L_0x00b1
            boolean r19 = r0.zzh()
            if (r19 == 0) goto L_0x00a8
            r8 = 6
            if (r10 >= r8) goto L_0x0088
            r8 = r12
            goto L_0x008a
        L_0x0088:
            r8 = 64
        L_0x008a:
            r9 = 0
            r20 = 8
            r21 = 8
        L_0x008f:
            if (r9 >= r8) goto L_0x00a8
            if (r20 == 0) goto L_0x009f
            int r20 = r0.zzb()
            int r15 = r21 + r20
            int r15 = r15 + 256
            int r15 = r15 % 256
            r20 = r15
        L_0x009f:
            if (r20 == 0) goto L_0x00a3
            r21 = r20
        L_0x00a3:
            int r9 = r9 + 1
            r15 = 100
            goto L_0x008f
        L_0x00a8:
            int r10 = r10 + 1
            r8 = 122(0x7a, float:1.71E-43)
            r9 = 110(0x6e, float:1.54E-43)
            r15 = 100
            goto L_0x007b
        L_0x00b1:
            int r1 = r0.zzc()
            int r1 = r1 + 4
            int r8 = r0.zzc()
            if (r8 != 0) goto L_0x00ca
            int r9 = r0.zzc()
            int r9 = r9 + 4
            r24 = r8
            r25 = r9
        L_0x00c7:
            r26 = 0
            goto L_0x00f3
        L_0x00ca:
            if (r8 != r14) goto L_0x00ee
            boolean r8 = r0.zzh()
            r0.zzb()
            r0.zzb()
            int r9 = r0.zzc()
            long r9 = (long) r9
            r15 = 0
        L_0x00dc:
            long r3 = (long) r15
            int r3 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r3 >= 0) goto L_0x00e7
            r0.zzc()
            int r15 = r15 + 1
            goto L_0x00dc
        L_0x00e7:
            r26 = r8
            r24 = r14
            r25 = 0
            goto L_0x00f3
        L_0x00ee:
            r24 = r8
            r25 = 0
            goto L_0x00c7
        L_0x00f3:
            int r8 = r0.zzc()
            r0.zze()
            int r3 = r0.zzc()
            int r3 = r3 + r14
            int r4 = r0.zzc()
            int r4 = r4 + r14
            boolean r15 = r0.zzh()
            int r9 = 2 - r15
            if (r15 != 0) goto L_0x010f
            r0.zze()
        L_0x010f:
            int r4 = r4 * r9
            r0.zze()
            int r3 = r3 * r12
            int r4 = r4 * r12
            boolean r10 = r0.zzh()
            r27 = 2
            if (r10 == 0) goto L_0x014b
            int r10 = r0.zzc()
            int r28 = r0.zzc()
            int r29 = r0.zzc()
            int r30 = r0.zzc()
            if (r13 != 0) goto L_0x0132
            r31 = r14
            goto L_0x0140
        L_0x0132:
            if (r13 != r11) goto L_0x0137
            r31 = r14
            goto L_0x0139
        L_0x0137:
            r31 = r27
        L_0x0139:
            if (r13 != r14) goto L_0x013e
            r13 = r27
            goto L_0x013f
        L_0x013e:
            r13 = r14
        L_0x013f:
            int r9 = r9 * r13
        L_0x0140:
            int r10 = r10 + r28
            int r10 = r10 * r31
            int r3 = r3 - r10
            int r29 = r29 + r30
            int r29 = r29 * r9
            int r4 = r4 - r29
        L_0x014b:
            r9 = r3
            r10 = r4
            r3 = 44
            if (r2 == r3) goto L_0x0166
            r3 = 86
            if (r2 == r3) goto L_0x0166
            r3 = 100
            if (r2 == r3) goto L_0x0166
            r3 = 110(0x6e, float:1.54E-43)
            if (r2 == r3) goto L_0x0166
            r3 = 122(0x7a, float:1.71E-43)
            if (r2 == r3) goto L_0x0166
            r3 = 244(0xf4, float:3.42E-43)
            if (r2 != r3) goto L_0x016d
            r2 = r3
        L_0x0166:
            r3 = r5 & 16
            if (r3 == 0) goto L_0x016d
            r4 = r2
            r13 = 0
            goto L_0x016f
        L_0x016d:
            r4 = r2
            r13 = r12
        L_0x016f:
            boolean r2 = r0.zzh()
            r19 = -1
            if (r2 == 0) goto L_0x0258
            boolean r2 = r0.zzh()
            if (r2 == 0) goto L_0x01b4
            r2 = 8
            int r3 = r0.zza(r2)
            r2 = 255(0xff, float:3.57E-43)
            if (r3 != r2) goto L_0x0198
            int r2 = r0.zza(r12)
            int r3 = r0.zza(r12)
            if (r2 == 0) goto L_0x01b4
            if (r3 == 0) goto L_0x01b4
            float r2 = (float) r2
            float r3 = (float) r3
            float r3 = r2 / r3
            goto L_0x01b6
        L_0x0198:
            r2 = 17
            if (r3 >= r2) goto L_0x01a1
            float[] r2 = zzb
            r3 = r2[r3]
            goto L_0x01b6
        L_0x01a1:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r12 = "Unexpected aspect_ratio_idc value: "
            r2.<init>(r12)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "NalUnitUtil"
            com.google.android.gms.internal.ads.zzea.zzf(r3, r2)
        L_0x01b4:
            r3 = 1065353216(0x3f800000, float:1.0)
        L_0x01b6:
            boolean r2 = r0.zzh()
            if (r2 == 0) goto L_0x01bf
            r0.zze()
        L_0x01bf:
            boolean r2 = r0.zzh()
            if (r2 == 0) goto L_0x01f5
            r0.zzf(r11)
            boolean r2 = r0.zzh()
            if (r14 == r2) goto L_0x01d0
            r14 = r27
        L_0x01d0:
            boolean r2 = r0.zzh()
            if (r2 == 0) goto L_0x01ef
            r2 = 8
            int r11 = r0.zza(r2)
            int r12 = r0.zza(r2)
            r0.zzf(r2)
            int r19 = com.google.android.gms.internal.ads.zzk.zza(r11)
            int r2 = com.google.android.gms.internal.ads.zzk.zzb(r12)
            r11 = r2
            r2 = r19
            goto L_0x01f2
        L_0x01ef:
            r2 = r19
            r11 = r2
        L_0x01f2:
            r19 = r14
            goto L_0x01f8
        L_0x01f5:
            r2 = r19
            r11 = r2
        L_0x01f8:
            boolean r12 = r0.zzh()
            if (r12 == 0) goto L_0x0204
            r0.zzc()
            r0.zzc()
        L_0x0204:
            boolean r12 = r0.zzh()
            if (r12 == 0) goto L_0x020f
            r12 = 65
            r0.zzf(r12)
        L_0x020f:
            boolean r12 = r0.zzh()
            if (r12 == 0) goto L_0x0218
            zzo(r0)
        L_0x0218:
            boolean r14 = r0.zzh()
            if (r14 == 0) goto L_0x0221
            zzo(r0)
        L_0x0221:
            if (r12 != 0) goto L_0x0225
            if (r14 == 0) goto L_0x0228
        L_0x0225:
            r0.zze()
        L_0x0228:
            r0.zze()
            boolean r12 = r0.zzh()
            if (r12 == 0) goto L_0x024e
            r0.zze()
            r0.zzc()
            r0.zzc()
            r0.zzc()
            r0.zzc()
            int r12 = r0.zzc()
            r0.zzc()
            r20 = r2
            r22 = r11
            r23 = r12
            goto L_0x0254
        L_0x024e:
            r20 = r2
            r22 = r11
            r23 = r13
        L_0x0254:
            r21 = r19
            r11 = r3
            goto L_0x0262
        L_0x0258:
            r23 = r13
            r20 = r19
            r21 = r20
            r22 = r21
            r11 = 1065353216(0x3f800000, float:1.0)
        L_0x0262:
            com.google.android.gms.internal.ads.zzfu r0 = new com.google.android.gms.internal.ads.zzfu
            r3 = r0
            r12 = r17
            r13 = r18
            r14 = r16
            r16 = r1
            r17 = r24
            r18 = r25
            r19 = r26
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfv.zzg(byte[], int, int):com.google.android.gms.internal.ads.zzfu");
    }

    public static String zzh(List list) {
        for (int i = 0; i < list.size(); i++) {
            byte[] bArr = (byte[]) list.get(i);
            int length = bArr.length;
            if (length > 3) {
                boolean[] zArr = new boolean[3];
                int i2 = zzfyq.zzd;
                zzfyn zzfyn = new zzfyn();
                int i3 = 0;
                while (true) {
                    int length2 = bArr.length;
                    if (i3 >= length2) {
                        break;
                    }
                    int zza2 = zza(bArr, i3, length2, zArr);
                    if (zza2 != length2) {
                        zzfyn.zzf(Integer.valueOf(zza2));
                    }
                    i3 = zza2 + 3;
                }
                zzfyq zzi = zzfyn.zzi();
                for (int i4 = 0; i4 < zzi.size(); i4++) {
                    if (((Integer) zzi.get(i4)).intValue() + 3 < length) {
                        zzfw zzfw = new zzfw(bArr, ((Integer) zzi.get(i4)).intValue() + 3, length);
                        zzfj zzm = zzm(zzfw);
                        if (zzm.zza == 33 && zzm.zzb == 0) {
                            zzfw.zzf(4);
                            int zza3 = zzfw.zza(3);
                            zzfw.zze();
                            zzfk zzn = zzn(zzfw, true, zza3, (zzfk) null);
                            return zzdk.zzd(zzn.zza, zzn.zzb, zzn.zzc, zzn.zzd, zzn.zze, zzn.zzf);
                        }
                    }
                }
                continue;
            }
        }
        return null;
    }

    public static void zzi(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static boolean zzj(byte[] bArr, int i, int i2, zzz zzz) {
        byte b;
        String str = zzz.zzo;
        if (Objects.equals(str, "video/avc")) {
            byte b2 = bArr[4];
            if (((b2 & 96) >> 5) == 0 && ((b = b2 & Ascii.US) == 1 || b == 9 || b == 14)) {
                return false;
            }
        } else if (Objects.equals(str, "video/hevc")) {
            zzfj zzm = zzm(new zzfw(bArr, 4, i2 + 4));
            int i3 = zzm.zza;
            if (i3 == 35) {
                return false;
            }
            if (i3 <= 14 && i3 % 2 == 0 && zzm.zzc == zzz.zzF - 1) {
                return false;
            }
        }
        return true;
    }

    private static int zzk(int i, int i2, int i3, int i4) {
        int i5 = 1;
        if (i2 == 1) {
            i5 = 2;
        }
        return i - (i5 * (i3 + i4));
    }

    private static int zzl(int i, int i2, int i3, int i4) {
        int i5 = 2;
        if (!(i2 == 1 || i2 == 2)) {
            i5 = 1;
        }
        return i - (i5 * (i3 + i4));
    }

    private static zzfj zzm(zzfw zzfw) {
        zzfw.zze();
        return new zzfj(zzfw.zza(6), zzfw.zza(6), zzfw.zza(3) - 1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0074  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.gms.internal.ads.zzfk zzn(com.google.android.gms.internal.ads.zzfw r18, boolean r19, int r20, com.google.android.gms.internal.ads.zzfk r21) {
        /*
            r0 = r18
            r1 = r20
            r2 = r21
            r3 = 6
            int[] r4 = new int[r3]
            r5 = 8
            r6 = 0
            if (r19 == 0) goto L_0x003c
            r2 = 2
            int r2 = r0.zza(r2)
            boolean r7 = r18.zzh()
            r8 = 5
            int r8 = r0.zza(r8)
            r9 = r6
            r10 = r9
        L_0x001e:
            r11 = 32
            if (r9 >= r11) goto L_0x002e
            boolean r11 = r18.zzh()
            if (r11 == 0) goto L_0x002b
            r11 = 1
            int r11 = r11 << r9
            r10 = r10 | r11
        L_0x002b:
            int r9 = r9 + 1
            goto L_0x001e
        L_0x002e:
            r9 = r6
        L_0x002f:
            if (r9 >= r3) goto L_0x003a
            int r11 = r0.zza(r5)
            r4[r9] = r11
            int r9 = r9 + 1
            goto L_0x002f
        L_0x003a:
            r12 = r2
            goto L_0x0049
        L_0x003c:
            if (r2 == 0) goto L_0x004f
            int r3 = r2.zza
            boolean r7 = r2.zzb
            int r8 = r2.zzc
            int r10 = r2.zzd
            int[] r4 = r2.zze
            r12 = r3
        L_0x0049:
            r16 = r4
            r13 = r7
            r14 = r8
            r15 = r10
            goto L_0x0055
        L_0x004f:
            r16 = r4
            r12 = r6
            r13 = r12
            r14 = r13
            r15 = r14
        L_0x0055:
            int r17 = r0.zza(r5)
            r2 = r6
        L_0x005a:
            if (r6 >= r1) goto L_0x006f
            boolean r3 = r18.zzh()
            if (r3 == 0) goto L_0x0064
            int r2 = r2 + 88
        L_0x0064:
            boolean r3 = r18.zzh()
            if (r3 == 0) goto L_0x006c
            int r2 = r2 + 8
        L_0x006c:
            int r6 = r6 + 1
            goto L_0x005a
        L_0x006f:
            r0.zzf(r2)
            if (r1 <= 0) goto L_0x0079
            int r5 = r5 - r1
            int r5 = r5 + r5
            r0.zzf(r5)
        L_0x0079:
            com.google.android.gms.internal.ads.zzfk r0 = new com.google.android.gms.internal.ads.zzfk
            r11 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfv.zzn(com.google.android.gms.internal.ads.zzfw, boolean, int, com.google.android.gms.internal.ads.zzfk):com.google.android.gms.internal.ads.zzfk");
    }

    private static void zzo(zzfw zzfw) {
        int zzc2 = zzfw.zzc() + 1;
        zzfw.zzf(8);
        for (int i = 0; i < zzc2; i++) {
            zzfw.zzc();
            zzfw.zzc();
            zzfw.zze();
        }
        zzfw.zzf(20);
    }

    public static int zzc(byte[] bArr, int i) {
        int i2;
        synchronized (zzc) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                while (true) {
                    if (i3 >= i - 2) {
                        i3 = i;
                        break;
                    }
                    int i5 = i3 + 1;
                    if (bArr[i3] == 0 && bArr[i5] == 0 && bArr[i3 + 2] == 3) {
                        break;
                    }
                    i3 = i5;
                }
                if (i3 < i) {
                    int[] iArr = zzd;
                    int length = iArr.length;
                    if (length <= i4) {
                        zzd = Arrays.copyOf(iArr, length + length);
                    }
                    zzd[i4] = i3;
                    i3 += 3;
                    i4++;
                }
            }
            i2 = i - i4;
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            while (i6 < i4) {
                try {
                    int i9 = zzd[i6] - i7;
                    System.arraycopy(bArr, i7, bArr, i8, i9);
                    int i10 = i8 + i9;
                    int i11 = i10 + 1;
                    bArr[i10] = 0;
                    i8 = i10 + 2;
                    bArr[i11] = 0;
                    i7 += i9 + 3;
                    i6++;
                } catch (Throwable th) {
                    throw th;
                }
            }
            System.arraycopy(bArr, i7, bArr, i8, i2 - i8);
        }
        return i2;
    }
}
