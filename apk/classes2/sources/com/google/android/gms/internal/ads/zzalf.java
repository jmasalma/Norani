package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import com.google.common.base.Ascii;
import java.util.List;
import kotlin.KotlinVersion;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzalf implements zzakt {
    private static final byte[] zza = {0, 7, 8, Ascii.SI};
    private static final byte[] zzb = {0, 119, -120, -1};
    private static final byte[] zzc = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    private final Paint zzd;
    private final Paint zze;
    private final Canvas zzf = new Canvas();
    private final zzaky zzg = new zzaky(719, 575, 0, 719, 0, 575);
    private final zzakx zzh = new zzakx(0, zzg(), zzh(), zzi());
    private final zzale zzi;
    private Bitmap zzj;

    public zzalf(List list) {
        zzen zzen = new zzen((byte[]) list.get(0));
        int zzq = zzen.zzq();
        int zzq2 = zzen.zzq();
        Paint paint = new Paint();
        this.zzd = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect((PathEffect) null);
        Paint paint2 = new Paint();
        this.zze = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect((PathEffect) null);
        this.zzi = new zzale(zzq, zzq2);
    }

    private static int zzb(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    private static zzakx zzc(zzem zzem, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        zzem zzem2 = zzem;
        int i6 = 8;
        int zzd2 = zzem2.zzd(8);
        zzem2.zzn(8);
        int[] zzg2 = zzg();
        int[] zzh2 = zzh();
        int[] zzi2 = zzi();
        int i7 = i - 2;
        while (i7 > 0) {
            int zzd3 = zzem2.zzd(i6);
            int zzd4 = zzem2.zzd(i6);
            int[] iArr = (zzd4 & 128) != 0 ? zzg2 : (zzd4 & 64) != 0 ? zzh2 : zzi2;
            if ((zzd4 & 1) != 0) {
                i5 = zzem2.zzd(i6);
                i4 = zzem2.zzd(i6);
                i3 = zzem2.zzd(i6);
                i2 = zzem2.zzd(i6);
                i7 -= 6;
            } else {
                int zzd5 = zzem2.zzd(2) << 6;
                i7 -= 4;
                i3 = zzem2.zzd(4) << 4;
                i2 = zzd5;
                i5 = zzem2.zzd(6) << 2;
                i4 = zzem2.zzd(4) << 4;
            }
            if (i5 == 0) {
                i2 = 255;
            }
            if (i5 == 0) {
                i3 = 0;
            }
            if (i5 == 0) {
                i4 = 0;
            }
            double d = (double) i5;
            String str = zzex.zza;
            double d2 = (double) (i4 - 128);
            double d3 = (double) (i3 - 128);
            iArr[zzd3] = zzb((byte) (255 - (i2 & KotlinVersion.MAX_COMPONENT_VALUE)), Math.max(0, Math.min((int) (d + (1.402d * d2)), KotlinVersion.MAX_COMPONENT_VALUE)), Math.max(0, Math.min((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), KotlinVersion.MAX_COMPONENT_VALUE)), Math.max(0, Math.min((int) (d + (d3 * 1.772d)), KotlinVersion.MAX_COMPONENT_VALUE)));
            zzd2 = zzd2;
            i6 = 8;
        }
        return new zzakx(zzd2, zzg2, zzh2, zzi2);
    }

    private static zzakz zzd(zzem zzem) {
        byte[] bArr;
        int zzd2 = zzem.zzd(16);
        zzem.zzn(4);
        int zzd3 = zzem.zzd(2);
        boolean zzp = zzem.zzp();
        zzem.zzn(1);
        byte[] bArr2 = zzex.zzb;
        if (zzd3 == 1) {
            zzem.zzn(zzem.zzd(8) * 16);
        } else if (zzd3 == 0) {
            int zzd4 = zzem.zzd(16);
            int zzd5 = zzem.zzd(16);
            if (zzd4 > 0) {
                bArr2 = new byte[zzd4];
                zzem.zzi(bArr2, 0, zzd4);
            }
            if (zzd5 > 0) {
                bArr = new byte[zzd5];
                zzem.zzi(bArr, 0, zzd5);
                return new zzakz(zzd2, zzp, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new zzakz(zzd2, zzp, bArr2, bArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v25, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v44, resolved type: byte} */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r2v12, types: [byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r3v16, types: [byte] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x01ef A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0228 A[LOOP:3: B:85:0x0172->B:116:0x0228, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0222 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0181  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void zze(byte[] r24, int[] r25, int r26, int r27, int r28, android.graphics.Paint r29, android.graphics.Canvas r30) {
        /*
            r0 = r24
            r1 = r26
            r8 = r29
            com.google.android.gms.internal.ads.zzem r9 = new com.google.android.gms.internal.ads.zzem
            int r2 = r0.length
            r9.<init>(r0, r2)
            r2 = r27
            r10 = r28
            r11 = 0
            r12 = 0
            r13 = 0
        L_0x0013:
            int r3 = r9.zza()
            if (r3 == 0) goto L_0x0233
            r14 = 8
            int r3 = r9.zzd(r14)
            r4 = 240(0xf0, float:3.36E-43)
            if (r3 == r4) goto L_0x022d
            r15 = 3
            r7 = 4
            r6 = 1
            r5 = 2
            r16 = 0
            switch(r3) {
                case 16: goto L_0x0155;
                case 17: goto L_0x009e;
                case 18: goto L_0x0041;
                default: goto L_0x002c;
            }
        L_0x002c:
            switch(r3) {
                case 32: goto L_0x003c;
                case 33: goto L_0x0037;
                case 34: goto L_0x0030;
                default: goto L_0x002f;
            }
        L_0x002f:
            goto L_0x0013
        L_0x0030:
            r3 = 16
            byte[] r12 = zzf(r3, r14, r9)
            goto L_0x0013
        L_0x0037:
            byte[] r11 = zzf(r7, r14, r9)
            goto L_0x0013
        L_0x003c:
            byte[] r13 = zzf(r7, r7, r9)
            goto L_0x0013
        L_0x0041:
            r15 = r2
            r2 = r16
        L_0x0044:
            int r3 = r9.zzd(r14)
            if (r3 == 0) goto L_0x004f
            r17 = r2
            r18 = r6
            goto L_0x0077
        L_0x004f:
            boolean r3 = r9.zzp()
            r4 = 7
            if (r3 != 0) goto L_0x006a
            int r3 = r9.zzd(r4)
            if (r3 == 0) goto L_0x0063
            r17 = r2
            r18 = r3
            r3 = r16
            goto L_0x0077
        L_0x0063:
            r17 = r6
            r3 = r16
            r18 = r3
            goto L_0x0077
        L_0x006a:
            int r3 = r9.zzd(r4)
            int r4 = r9.zzd(r14)
            r17 = r2
            r18 = r3
            r3 = r4
        L_0x0077:
            if (r18 == 0) goto L_0x0092
            if (r8 == 0) goto L_0x0092
            int r2 = r10 + 1
            float r4 = (float) r10
            r3 = r25[r3]
            r8.setColor(r3)
            float r3 = (float) r15
            int r5 = r15 + r18
            float r5 = (float) r5
            float r7 = (float) r2
            r2 = r30
            r0 = r6
            r6 = r7
            r7 = r29
            r2.drawRect(r3, r4, r5, r6, r7)
            goto L_0x0093
        L_0x0092:
            r0 = r6
        L_0x0093:
            int r15 = r15 + r18
            if (r17 != 0) goto L_0x009b
            r6 = r0
            r2 = r17
            goto L_0x0044
        L_0x009b:
            r2 = r15
            goto L_0x0013
        L_0x009e:
            r0 = r6
            if (r1 != r15) goto L_0x00ab
            if (r12 != 0) goto L_0x00a8
            byte[] r3 = zzc
            r17 = r3
            goto L_0x00ad
        L_0x00a8:
            r17 = r12
            goto L_0x00ad
        L_0x00ab:
            r17 = 0
        L_0x00ad:
            r6 = r2
            r2 = r16
        L_0x00b0:
            int r3 = r9.zzd(r7)
            if (r3 == 0) goto L_0x00bc
            r19 = r0
            r18 = r2
            goto L_0x011c
        L_0x00bc:
            boolean r3 = r9.zzp()
            if (r3 != 0) goto L_0x00d8
            int r3 = r9.zzd(r15)
            if (r3 == 0) goto L_0x00d1
            int r3 = r3 + 2
            r18 = r2
            r19 = r3
        L_0x00ce:
            r3 = r16
            goto L_0x011c
        L_0x00d1:
            r18 = r0
        L_0x00d3:
            r3 = r16
            r19 = r3
            goto L_0x011c
        L_0x00d8:
            boolean r3 = r9.zzp()
            if (r3 != 0) goto L_0x00ed
            int r3 = r9.zzd(r5)
            int r3 = r3 + r7
            int r4 = r9.zzd(r7)
        L_0x00e7:
            r18 = r2
            r19 = r3
            r3 = r4
            goto L_0x011c
        L_0x00ed:
            int r3 = r9.zzd(r5)
            if (r3 == 0) goto L_0x0117
            if (r3 == r0) goto L_0x0112
            if (r3 == r5) goto L_0x0107
            if (r3 == r15) goto L_0x00fc
            r18 = r2
            goto L_0x00d3
        L_0x00fc:
            int r3 = r9.zzd(r14)
            int r3 = r3 + 25
            int r4 = r9.zzd(r7)
            goto L_0x00e7
        L_0x0107:
            int r3 = r9.zzd(r7)
            int r3 = r3 + 9
            int r4 = r9.zzd(r7)
            goto L_0x00e7
        L_0x0112:
            r18 = r2
            r19 = r5
            goto L_0x00ce
        L_0x0117:
            r19 = r0
            r18 = r2
            goto L_0x00ce
        L_0x011c:
            if (r19 == 0) goto L_0x0140
            if (r8 == 0) goto L_0x0140
            int r2 = r10 + 1
            float r4 = (float) r10
            if (r17 == 0) goto L_0x0127
            byte r3 = r17[r3]
        L_0x0127:
            float r2 = (float) r2
            r3 = r25[r3]
            r8.setColor(r3)
            float r3 = (float) r6
            int r5 = r6 + r19
            float r5 = (float) r5
            r20 = r2
            r2 = r30
            r14 = 2
            r22 = r6
            r6 = r20
            r7 = r29
            r2.drawRect(r3, r4, r5, r6, r7)
            goto L_0x0143
        L_0x0140:
            r14 = r5
            r22 = r6
        L_0x0143:
            int r6 = r22 + r19
            if (r18 == 0) goto L_0x014d
            r9.zzf()
            r2 = r6
            goto L_0x0013
        L_0x014d:
            r5 = r14
            r2 = r18
            r7 = 4
            r14 = 8
            goto L_0x00b0
        L_0x0155:
            r14 = r5
            r0 = r6
            if (r1 != r15) goto L_0x0163
            if (r11 != 0) goto L_0x0160
            byte[] r3 = zzb
        L_0x015d:
            r17 = r3
            goto L_0x016f
        L_0x0160:
            r17 = r11
            goto L_0x016f
        L_0x0163:
            if (r1 != r14) goto L_0x016d
            if (r13 != 0) goto L_0x016a
            byte[] r3 = zza
            goto L_0x015d
        L_0x016a:
            r17 = r13
            goto L_0x016f
        L_0x016d:
            r17 = 0
        L_0x016f:
            r7 = r2
            r6 = r16
        L_0x0172:
            int r2 = r9.zzd(r14)
            if (r2 == 0) goto L_0x0181
            r18 = r0
        L_0x017a:
            r19 = r6
        L_0x017c:
            r4 = 4
            r5 = 8
            goto L_0x01ed
        L_0x0181:
            boolean r2 = r9.zzp()
            if (r2 == 0) goto L_0x0194
            int r2 = r9.zzd(r15)
            int r2 = r2 + r15
            int r3 = r9.zzd(r14)
            r18 = r2
            r2 = r3
            goto L_0x017a
        L_0x0194:
            boolean r2 = r9.zzp()
            if (r2 == 0) goto L_0x01a1
            r18 = r0
            r19 = r6
            r2 = r16
            goto L_0x017c
        L_0x01a1:
            int r2 = r9.zzd(r14)
            if (r2 == 0) goto L_0x01e4
            if (r2 == r0) goto L_0x01da
            if (r2 == r14) goto L_0x01c7
            if (r2 == r15) goto L_0x01b4
            r19 = r6
            r2 = r16
            r18 = r2
            goto L_0x017c
        L_0x01b4:
            r5 = 8
            int r2 = r9.zzd(r5)
            int r2 = r2 + 29
            int r3 = r9.zzd(r14)
            r18 = r2
            r2 = r3
            r19 = r6
            r4 = 4
            goto L_0x01ed
        L_0x01c7:
            r4 = 4
            r5 = 8
            int r2 = r9.zzd(r4)
            int r2 = r2 + 12
            int r3 = r9.zzd(r14)
            r18 = r2
            r2 = r3
            r19 = r6
            goto L_0x01ed
        L_0x01da:
            r4 = 4
            r5 = 8
            r19 = r6
            r18 = r14
            r2 = r16
            goto L_0x01ed
        L_0x01e4:
            r4 = 4
            r5 = 8
            r19 = r0
            r2 = r16
            r18 = r2
        L_0x01ed:
            if (r18 == 0) goto L_0x0219
            if (r8 == 0) goto L_0x0219
            int r3 = r10 + 1
            float r6 = (float) r10
            if (r17 == 0) goto L_0x01f8
            byte r2 = r17[r2]
        L_0x01f8:
            float r3 = (float) r3
            r2 = r25[r2]
            r8.setColor(r2)
            float r2 = (float) r7
            int r0 = r7 + r18
            float r0 = (float) r0
            r21 = r2
            r2 = r30
            r22 = r3
            r3 = r21
            r21 = r4
            r4 = r6
            r23 = r5
            r5 = r0
            r6 = r22
            r0 = r7
            r7 = r29
            r2.drawRect(r3, r4, r5, r6, r7)
            goto L_0x021e
        L_0x0219:
            r21 = r4
            r23 = r5
            r0 = r7
        L_0x021e:
            int r7 = r0 + r18
            if (r19 == 0) goto L_0x0228
            r9.zzf()
            r2 = r7
            goto L_0x0013
        L_0x0228:
            r6 = r19
            r0 = 1
            goto L_0x0172
        L_0x022d:
            int r10 = r10 + 2
            r2 = r27
            goto L_0x0013
        L_0x0233:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzalf.zze(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    private static byte[] zzf(int i, int i2, zzem zzem) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) zzem.zzd(i2);
        }
        return bArr;
    }

    private static int[] zzg() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    private static int[] zzh() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i = 1; i < 16; i++) {
            int i2 = i & 4;
            int i3 = i & 2;
            int i4 = i & 1;
            if (i < 8) {
                iArr[i] = zzb(KotlinVersion.MAX_COMPONENT_VALUE, 1 != i4 ? 0 : 255, i3 != 0 ? 255 : 0, i2 != 0 ? 255 : 0);
            } else {
                int i5 = 127;
                int i6 = 1 != i4 ? 0 : 127;
                int i7 = i3 != 0 ? 127 : 0;
                if (i2 == 0) {
                    i5 = 0;
                }
                iArr[i] = zzb(KotlinVersion.MAX_COMPONENT_VALUE, i6, i7, i5);
            }
        }
        return iArr;
    }

    private static int[] zzi() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i = 0; i < 256; i++) {
            int i2 = KotlinVersion.MAX_COMPONENT_VALUE;
            if (i < 8) {
                int i3 = i & 2;
                int i4 = i & 4;
                int i5 = 1 != (i & 1) ? 0 : 255;
                int i6 = i3 != 0 ? 255 : 0;
                if (i4 == 0) {
                    i2 = 0;
                }
                iArr[i] = zzb(63, i5, i6, i2);
            } else {
                int i7 = i & 136;
                int i8 = 170;
                int i9 = 85;
                if (i7 == 0) {
                    int i10 = i & 16;
                    int i11 = i & 32;
                    int i12 = i & 2;
                    int i13 = i & 64;
                    int i14 = i & 4;
                    int i15 = 1 != (i & 1) ? 0 : 85;
                    int i16 = i10 != 0 ? 170 : 0;
                    int i17 = i12 != 0 ? 85 : 0;
                    int i18 = i11 != 0 ? 170 : 0;
                    if (i14 == 0) {
                        i9 = 0;
                    }
                    if (i13 == 0) {
                        i8 = 0;
                    }
                    iArr[i] = zzb(KotlinVersion.MAX_COMPONENT_VALUE, i15 + i16, i17 + i18, i9 + i8);
                } else if (i7 != 8) {
                    int i19 = 43;
                    if (i7 == 128) {
                        int i20 = i & 16;
                        int i21 = i & 32;
                        int i22 = i & 2;
                        int i23 = i & 64;
                        int i24 = i & 4;
                        int i25 = (1 != (i & 1) ? 0 : 43) + 127;
                        int i26 = i20 != 0 ? 85 : 0;
                        int i27 = (i22 != 0 ? 43 : 0) + 127;
                        int i28 = i21 != 0 ? 85 : 0;
                        if (i24 == 0) {
                            i19 = 0;
                        }
                        int i29 = i19 + 127;
                        if (i23 == 0) {
                            i9 = 0;
                        }
                        iArr[i] = zzb(KotlinVersion.MAX_COMPONENT_VALUE, i25 + i26, i27 + i28, i29 + i9);
                    } else if (i7 == 136) {
                        int i30 = i & 16;
                        int i31 = i & 32;
                        int i32 = i & 2;
                        int i33 = i & 64;
                        int i34 = i & 4;
                        int i35 = 1 != (i & 1) ? 0 : 43;
                        int i36 = i30 != 0 ? 85 : 0;
                        int i37 = i32 != 0 ? 43 : 0;
                        int i38 = i31 != 0 ? 85 : 0;
                        if (i34 == 0) {
                            i19 = 0;
                        }
                        if (i33 == 0) {
                            i9 = 0;
                        }
                        iArr[i] = zzb(KotlinVersion.MAX_COMPONENT_VALUE, i35 + i36, i37 + i38, i19 + i9);
                    }
                } else {
                    int i39 = i & 16;
                    int i40 = i & 32;
                    int i41 = i & 2;
                    int i42 = i & 64;
                    int i43 = i & 4;
                    int i44 = 1 != (i & 1) ? 0 : 85;
                    int i45 = i39 != 0 ? 170 : 0;
                    int i46 = i41 != 0 ? 85 : 0;
                    int i47 = i40 != 0 ? 170 : 0;
                    if (i43 == 0) {
                        i9 = 0;
                    }
                    if (i42 == 0) {
                        i8 = 0;
                    }
                    iArr[i] = zzb(127, i44 + i45, i46 + i47, i9 + i8);
                }
            }
        }
        return iArr;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v12, resolved type: com.google.android.gms.internal.ads.zzakz} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v26, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v10, resolved type: com.google.android.gms.internal.ads.zzakx} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(byte[] r35, int r36, int r37, com.google.android.gms.internal.ads.zzaks r38, com.google.android.gms.internal.ads.zzdn r39) {
        /*
            r34 = this;
            r0 = r34
            r1 = r36
            int r2 = r1 + r37
            com.google.android.gms.internal.ads.zzem r3 = new com.google.android.gms.internal.ads.zzem
            r4 = r35
            r3.<init>(r4, r2)
            r3.zzl(r1)
        L_0x0010:
            int r1 = r3.zza()
            r2 = 48
            r4 = 3
            r5 = 1
            r6 = 2
            if (r1 < r2) goto L_0x0209
            r1 = 8
            int r2 = r3.zzd(r1)
            r8 = 15
            if (r2 != r8) goto L_0x0209
            com.google.android.gms.internal.ads.zzale r2 = r0.zzi
            int r8 = r3.zzd(r1)
            r9 = 16
            int r10 = r3.zzd(r9)
            int r11 = r3.zzd(r9)
            int r12 = r3.zzb()
            int r12 = r12 + r11
            int r13 = r11 * 8
            int r14 = r3.zza()
            if (r13 <= r14) goto L_0x0051
            java.lang.String r1 = "DvbParser"
            java.lang.String r2 = "Data field length exceeds limit"
            com.google.android.gms.internal.ads.zzea.zzf(r1, r2)
            int r1 = r3.zza()
            r3.zzn(r1)
            goto L_0x0010
        L_0x0051:
            r13 = 4
            switch(r8) {
                case 16: goto L_0x01a2;
                case 17: goto L_0x00de;
                case 18: goto L_0x00bc;
                case 19: goto L_0x009a;
                case 20: goto L_0x0057;
                default: goto L_0x0055;
            }
        L_0x0055:
            goto L_0x01ff
        L_0x0057:
            int r1 = r2.zza
            if (r10 != r1) goto L_0x01ff
            r3.zzn(r13)
            boolean r1 = r3.zzp()
            r3.zzn(r4)
            int r14 = r3.zzd(r9)
            int r15 = r3.zzd(r9)
            if (r1 == 0) goto L_0x0088
            int r7 = r3.zzd(r9)
            int r1 = r3.zzd(r9)
            int r4 = r3.zzd(r9)
            int r5 = r3.zzd(r9)
            r17 = r1
            r18 = r4
            r19 = r5
            r16 = r7
            goto L_0x0090
        L_0x0088:
            r17 = r14
            r19 = r15
            r16 = 0
            r18 = 0
        L_0x0090:
            com.google.android.gms.internal.ads.zzaky r1 = new com.google.android.gms.internal.ads.zzaky
            r13 = r1
            r13.<init>(r14, r15, r16, r17, r18, r19)
            r2.zzh = r1
            goto L_0x01ff
        L_0x009a:
            int r1 = r2.zza
            if (r10 != r1) goto L_0x00ab
            com.google.android.gms.internal.ads.zzakz r1 = zzd(r3)
            android.util.SparseArray r2 = r2.zze
            int r4 = r1.zza
            r2.put(r4, r1)
            goto L_0x01ff
        L_0x00ab:
            int r1 = r2.zzb
            if (r10 != r1) goto L_0x01ff
            com.google.android.gms.internal.ads.zzakz r1 = zzd(r3)
            android.util.SparseArray r2 = r2.zzg
            int r4 = r1.zza
            r2.put(r4, r1)
            goto L_0x01ff
        L_0x00bc:
            int r1 = r2.zza
            if (r10 != r1) goto L_0x00cd
            com.google.android.gms.internal.ads.zzakx r1 = zzc(r3, r11)
            android.util.SparseArray r2 = r2.zzd
            int r4 = r1.zza
            r2.put(r4, r1)
            goto L_0x01ff
        L_0x00cd:
            int r1 = r2.zzb
            if (r10 != r1) goto L_0x01ff
            com.google.android.gms.internal.ads.zzakx r1 = zzc(r3, r11)
            android.util.SparseArray r2 = r2.zzf
            int r4 = r1.zza
            r2.put(r4, r1)
            goto L_0x01ff
        L_0x00de:
            com.google.android.gms.internal.ads.zzala r8 = r2.zzi
            int r14 = r2.zza
            if (r10 != r14) goto L_0x01ff
            if (r8 == 0) goto L_0x01ff
            int r16 = r3.zzd(r1)
            r3.zzn(r13)
            boolean r17 = r3.zzp()
            r3.zzn(r4)
            int r18 = r3.zzd(r9)
            int r19 = r3.zzd(r9)
            int r20 = r3.zzd(r4)
            int r21 = r3.zzd(r4)
            r3.zzn(r6)
            int r22 = r3.zzd(r1)
            int r23 = r3.zzd(r1)
            int r24 = r3.zzd(r13)
            int r25 = r3.zzd(r6)
            r3.zzn(r6)
            int r11 = r11 + -10
            android.util.SparseArray r4 = new android.util.SparseArray
            r4.<init>()
        L_0x0121:
            if (r11 <= 0) goto L_0x0167
            int r10 = r3.zzd(r9)
            int r14 = r3.zzd(r6)
            int r28 = r3.zzd(r6)
            r15 = 12
            int r29 = r3.zzd(r15)
            r3.zzn(r13)
            int r30 = r3.zzd(r15)
            int r15 = r11 + -6
            if (r14 == r5) goto L_0x014c
            if (r14 != r6) goto L_0x0144
            r14 = r6
            goto L_0x014c
        L_0x0144:
            r27 = r14
            r11 = r15
            r31 = 0
            r32 = 0
            goto L_0x015c
        L_0x014c:
            int r15 = r3.zzd(r1)
            int r26 = r3.zzd(r1)
            int r11 = r11 + -8
            r27 = r14
            r31 = r15
            r32 = r26
        L_0x015c:
            com.google.android.gms.internal.ads.zzald r14 = new com.google.android.gms.internal.ads.zzald
            r26 = r14
            r26.<init>(r27, r28, r29, r30, r31, r32)
            r4.put(r10, r14)
            goto L_0x0121
        L_0x0167:
            com.google.android.gms.internal.ads.zzalc r1 = new com.google.android.gms.internal.ads.zzalc
            r15 = r1
            r26 = r4
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            int r4 = r8.zzb
            if (r4 != 0) goto L_0x019a
            android.util.SparseArray r4 = r2.zzc
            int r5 = r1.zza
            java.lang.Object r4 = r4.get(r5)
            com.google.android.gms.internal.ads.zzalc r4 = (com.google.android.gms.internal.ads.zzalc) r4
            if (r4 == 0) goto L_0x019a
            r7 = 0
        L_0x0180:
            android.util.SparseArray r5 = r4.zzj
            int r6 = r5.size()
            if (r7 >= r6) goto L_0x019a
            android.util.SparseArray r6 = r1.zzj
            int r8 = r5.keyAt(r7)
            java.lang.Object r5 = r5.valueAt(r7)
            com.google.android.gms.internal.ads.zzald r5 = (com.google.android.gms.internal.ads.zzald) r5
            r6.put(r8, r5)
            int r7 = r7 + 1
            goto L_0x0180
        L_0x019a:
            android.util.SparseArray r2 = r2.zzc
            int r4 = r1.zza
            r2.put(r4, r1)
            goto L_0x01ff
        L_0x01a2:
            int r4 = r2.zza
            if (r10 != r4) goto L_0x01ff
            com.google.android.gms.internal.ads.zzala r4 = r2.zzi
            int r5 = r3.zzd(r1)
            int r7 = r3.zzd(r13)
            int r8 = r3.zzd(r6)
            r3.zzn(r6)
            int r11 = r11 + -2
            android.util.SparseArray r6 = new android.util.SparseArray
            r6.<init>()
        L_0x01be:
            if (r11 <= 0) goto L_0x01da
            int r10 = r3.zzd(r1)
            r3.zzn(r1)
            int r13 = r3.zzd(r9)
            int r14 = r3.zzd(r9)
            com.google.android.gms.internal.ads.zzalb r15 = new com.google.android.gms.internal.ads.zzalb
            r15.<init>(r13, r14)
            r6.put(r10, r15)
            int r11 = r11 + -6
            goto L_0x01be
        L_0x01da:
            com.google.android.gms.internal.ads.zzala r1 = new com.google.android.gms.internal.ads.zzala
            r1.<init>(r5, r7, r8, r6)
            int r5 = r1.zzb
            if (r5 == 0) goto L_0x01f5
            r2.zzi = r1
            android.util.SparseArray r1 = r2.zzc
            r1.clear()
            android.util.SparseArray r1 = r2.zzd
            r1.clear()
            android.util.SparseArray r1 = r2.zze
            r1.clear()
            goto L_0x01ff
        L_0x01f5:
            if (r4 == 0) goto L_0x01ff
            int r5 = r1.zza
            int r4 = r4.zza
            if (r4 == r5) goto L_0x01ff
            r2.zzi = r1
        L_0x01ff:
            int r1 = r3.zzb()
            int r12 = r12 - r1
            r3.zzo(r12)
            goto L_0x0010
        L_0x0209:
            com.google.android.gms.internal.ads.zzale r1 = r0.zzi
            com.google.android.gms.internal.ads.zzala r2 = r1.zzi
            if (r2 != 0) goto L_0x0223
            com.google.android.gms.internal.ads.zzakl r1 = new com.google.android.gms.internal.ads.zzakl
            com.google.android.gms.internal.ads.zzfyq r9 = com.google.android.gms.internal.ads.zzfyq.zzn()
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8 = r1
            r10 = r12
            r8.<init>(r9, r10, r12)
        L_0x021f:
            r2 = r39
            goto L_0x040e
        L_0x0223:
            com.google.android.gms.internal.ads.zzaky r3 = r1.zzh
            if (r3 != 0) goto L_0x0229
            com.google.android.gms.internal.ads.zzaky r3 = r0.zzg
        L_0x0229:
            android.graphics.Bitmap r8 = r0.zzj
            if (r8 == 0) goto L_0x0241
            int r9 = r3.zza
            int r9 = r9 + r5
            int r8 = r8.getWidth()
            if (r9 != r8) goto L_0x0241
            int r8 = r3.zzb
            int r8 = r8 + r5
            android.graphics.Bitmap r9 = r0.zzj
            int r9 = r9.getHeight()
            if (r8 == r9) goto L_0x0254
        L_0x0241:
            int r8 = r3.zza
            int r8 = r8 + r5
            int r9 = r3.zzb
            int r9 = r9 + r5
            android.graphics.Bitmap$Config r10 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r8 = android.graphics.Bitmap.createBitmap(r8, r9, r10)
            r0.zzj = r8
            android.graphics.Canvas r9 = r0.zzf
            r9.setBitmap(r8)
        L_0x0254:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            android.util.SparseArray r2 = r2.zzc
            r8 = 0
        L_0x025c:
            int r9 = r2.size()
            if (r8 >= r9) goto L_0x03ff
            android.graphics.Canvas r9 = r0.zzf
            r9.save()
            java.lang.Object r10 = r2.valueAt(r8)
            com.google.android.gms.internal.ads.zzalb r10 = (com.google.android.gms.internal.ads.zzalb) r10
            int r12 = r2.keyAt(r8)
            android.util.SparseArray r13 = r1.zzc
            java.lang.Object r12 = r13.get(r12)
            r15 = r12
            com.google.android.gms.internal.ads.zzalc r15 = (com.google.android.gms.internal.ads.zzalc) r15
            int r12 = r10.zza
            int r13 = r3.zzc
            int r14 = r12 + r13
            int r10 = r10.zzb
            int r12 = r3.zze
            int r10 = r10 + r12
            int r13 = r15.zzc
            int r12 = r14 + r13
            int r7 = r3.zzd
            int r7 = java.lang.Math.min(r12, r7)
            int r5 = r15.zzd
            int r6 = r10 + r5
            int r4 = r3.zzf
            int r4 = java.lang.Math.min(r6, r4)
            r9.clipRect(r14, r10, r7, r4)
            int r4 = r15.zzf
            android.util.SparseArray r7 = r1.zzd
            java.lang.Object r7 = r7.get(r4)
            com.google.android.gms.internal.ads.zzakx r7 = (com.google.android.gms.internal.ads.zzakx) r7
            if (r7 != 0) goto L_0x02b5
            android.util.SparseArray r7 = r1.zzf
            java.lang.Object r4 = r7.get(r4)
            r7 = r4
            com.google.android.gms.internal.ads.zzakx r7 = (com.google.android.gms.internal.ads.zzakx) r7
            if (r7 != 0) goto L_0x02b5
            com.google.android.gms.internal.ads.zzakx r7 = r0.zzh
        L_0x02b5:
            android.util.SparseArray r4 = r15.zzj
            r19 = r2
            r16 = r12
            r2 = 0
        L_0x02bc:
            int r12 = r4.size()
            if (r2 >= r12) goto L_0x0363
            int r12 = r4.keyAt(r2)
            java.lang.Object r17 = r4.valueAt(r2)
            r20 = r4
            r4 = r17
            com.google.android.gms.internal.ads.zzald r4 = (com.google.android.gms.internal.ads.zzald) r4
            r17 = r13
            android.util.SparseArray r13 = r1.zze
            java.lang.Object r13 = r13.get(r12)
            com.google.android.gms.internal.ads.zzakz r13 = (com.google.android.gms.internal.ads.zzakz) r13
            if (r13 != 0) goto L_0x02e5
            android.util.SparseArray r13 = r1.zzg
            java.lang.Object r12 = r13.get(r12)
            r13 = r12
            com.google.android.gms.internal.ads.zzakz r13 = (com.google.android.gms.internal.ads.zzakz) r13
        L_0x02e5:
            if (r13 == 0) goto L_0x033c
            boolean r12 = r13.zzb
            if (r12 == 0) goto L_0x02ed
            r12 = 0
            goto L_0x02ef
        L_0x02ed:
            android.graphics.Paint r12 = r0.zzd
        L_0x02ef:
            r21 = r12
            int r12 = r15.zze
            r22 = r1
            int r1 = r4.zza
            int r1 = r1 + r14
            int r4 = r4.zzb
            int r4 = r4 + r10
            r18 = r14
            r14 = 3
            if (r12 != r14) goto L_0x0305
            int[] r14 = r7.zzd
        L_0x0302:
            r23 = r14
            goto L_0x030e
        L_0x0305:
            r14 = 2
            if (r12 != r14) goto L_0x030b
            int[] r14 = r7.zzc
            goto L_0x0302
        L_0x030b:
            int[] r14 = r7.zzb
            goto L_0x0302
        L_0x030e:
            byte[] r14 = r13.zzc
            r24 = r8
            r25 = r12
            r8 = r16
            r12 = r14
            r26 = r11
            r11 = r13
            r14 = r17
            r13 = r23
            r27 = r3
            r33 = r14
            r3 = r18
            r14 = r25
            r28 = r5
            r5 = r15
            r15 = r1
            r16 = r4
            r17 = r21
            r18 = r9
            zze(r12, r13, r14, r15, r16, r17, r18)
            byte[] r12 = r11.zzd
            r11 = 1
            int r16 = r4 + 1
            zze(r12, r13, r14, r15, r16, r17, r18)
            goto L_0x034d
        L_0x033c:
            r22 = r1
            r27 = r3
            r28 = r5
            r24 = r8
            r26 = r11
            r3 = r14
            r5 = r15
            r8 = r16
            r33 = r17
            r11 = 1
        L_0x034d:
            int r2 = r2 + 1
            r14 = r3
            r15 = r5
            r16 = r8
            r4 = r20
            r1 = r22
            r8 = r24
            r11 = r26
            r3 = r27
            r5 = r28
            r13 = r33
            goto L_0x02bc
        L_0x0363:
            r22 = r1
            r27 = r3
            r28 = r5
            r24 = r8
            r26 = r11
            r33 = r13
            r3 = r14
            r5 = r15
            r8 = r16
            r11 = 1
            float r1 = (float) r10
            float r2 = (float) r3
            boolean r4 = r5.zzb
            if (r4 == 0) goto L_0x03ac
            int r4 = r5.zze
            r15 = 3
            if (r4 != r15) goto L_0x0387
            int[] r4 = r7.zzd
            int r5 = r5.zzg
            r4 = r4[r5]
            r14 = 2
            goto L_0x0397
        L_0x0387:
            r14 = 2
            if (r4 != r14) goto L_0x0391
            int[] r4 = r7.zzc
            int r5 = r5.zzh
            r4 = r4[r5]
            goto L_0x0397
        L_0x0391:
            int[] r4 = r7.zzb
            int r5 = r5.zzi
            r4 = r4[r5]
        L_0x0397:
            android.graphics.Paint r5 = r0.zze
            r5.setColor(r4)
            float r4 = (float) r6
            float r6 = (float) r8
            r12 = r9
            r13 = r2
            r7 = r14
            r14 = r1
            r8 = r15
            r15 = r6
            r16 = r4
            r17 = r5
            r12.drawRect(r13, r14, r15, r16, r17)
            goto L_0x03ae
        L_0x03ac:
            r7 = 2
            r8 = 3
        L_0x03ae:
            com.google.android.gms.internal.ads.zzcs r4 = new com.google.android.gms.internal.ads.zzcs
            r4.<init>()
            android.graphics.Bitmap r5 = r0.zzj
            r12 = r28
            r6 = r33
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r5, r3, r10, r6, r12)
            r4.zzc(r3)
            r3 = r27
            int r5 = r3.zza
            float r5 = (float) r5
            float r2 = r2 / r5
            r4.zzh(r2)
            r2 = 0
            r4.zzi(r2)
            int r10 = r3.zzb
            float r10 = (float) r10
            float r1 = r1 / r10
            r4.zze(r1, r2)
            r4.zzf(r2)
            float r1 = (float) r6
            float r1 = r1 / r5
            r4.zzk(r1)
            float r1 = (float) r12
            float r1 = r1 / r10
            r4.zzd(r1)
            com.google.android.gms.internal.ads.zzcu r1 = r4.zzq()
            r4 = r26
            r4.add(r1)
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.CLEAR
            r9.drawColor(r2, r1)
            r9.restore()
            int r1 = r24 + 1
            r6 = r7
            r5 = r11
            r2 = r19
            r11 = r4
            r4 = r8
            r8 = r1
            r1 = r22
            goto L_0x025c
        L_0x03ff:
            r4 = r11
            com.google.android.gms.internal.ads.zzakl r1 = new com.google.android.gms.internal.ads.zzakl
            r14 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r10 = r1
            r12 = r14
            r10.<init>(r11, r12, r14)
            goto L_0x021f
        L_0x040e:
            r2.zza(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzalf.zza(byte[], int, int, com.google.android.gms.internal.ads.zzaks, com.google.android.gms.internal.ads.zzdn):void");
    }
}
