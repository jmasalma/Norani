package com.google.android.gms.internal.ads;

import java.nio.ShortBuffer;
import java.util.Arrays;
import kotlin.KotlinVersion;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzcp {
    private final int zza;
    private final int zzb;
    private final float zzc;
    private final float zzd;
    private final float zze;
    private final int zzf;
    private final int zzg;
    private final int zzh;
    private final short[] zzi;
    private short[] zzj;
    private int zzk;
    private short[] zzl;
    private int zzm;
    private short[] zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private int zzt;
    private int zzu;
    private int zzv;
    private double zzw;

    public zzcp(int i, int i2, float f, float f2, int i3) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = f;
        this.zzd = f2;
        this.zze = ((float) i) / ((float) i3);
        this.zzf = i / 400;
        int i4 = i / 65;
        this.zzg = i4;
        int i5 = i4 + i4;
        this.zzh = i5;
        this.zzi = new short[i5];
        int i6 = i5 * i2;
        this.zzj = new short[i6];
        this.zzl = new short[i6];
        this.zzn = new short[i6];
    }

    private final int zzg(short[] sArr, int i, int i2, int i3) {
        int i4 = 1;
        int i5 = KotlinVersion.MAX_COMPONENT_VALUE;
        int i6 = 0;
        int i7 = 0;
        while (i2 <= i3) {
            int i8 = 0;
            for (int i9 = 0; i9 < i2; i9++) {
                int i10 = this.zzb * i;
                i8 += Math.abs(sArr[i10 + i9] - sArr[(i10 + i2) + i9]);
            }
            int i11 = i8 * i6;
            int i12 = i4 * i2;
            if (i11 < i12) {
                i4 = i8;
            }
            if (i11 < i12) {
                i6 = i2;
            }
            int i13 = i8 * i5;
            int i14 = i7 * i2;
            if (i13 > i14) {
                i7 = i8;
            }
            if (i13 > i14) {
                i5 = i2;
            }
            i2++;
        }
        this.zzu = i4 / i6;
        this.zzv = i7 / i5;
        return i6;
    }

    private final void zzh(short[] sArr, int i, int i2) {
        short[] zzl2 = zzl(this.zzl, this.zzm, i2);
        this.zzl = zzl2;
        int i3 = this.zzm;
        int i4 = this.zzb;
        System.arraycopy(sArr, i * i4, zzl2, i3 * i4, i2 * i4);
        this.zzm += i2;
    }

    private final void zzi(short[] sArr, int i, int i2) {
        int i3;
        for (int i4 = 0; i4 < this.zzh / i2; i4++) {
            int i5 = 0;
            int i6 = 0;
            while (true) {
                int i7 = this.zzb;
                i3 = i7 * i2;
                if (i5 >= i3) {
                    break;
                }
                i6 += sArr[(i7 * i) + (i3 * i4) + i5];
                i5++;
            }
            this.zzi[i4] = (short) (i6 / i3);
        }
    }

    private static void zzj(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i4 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i3 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                sArr[i9] = (short) (((sArr2[i7] * (i - i10)) + (sArr3[i8] * i10)) / i);
                i9 += i2;
                i7 += i2;
                i8 += i2;
            }
        }
    }

    private final short[] zzl(short[] sArr, int i, int i2) {
        int length = sArr.length;
        int i3 = this.zzb;
        int i4 = length / i3;
        if (i + i2 <= i4) {
            return sArr;
        }
        return Arrays.copyOf(sArr, (((i4 * 3) / 2) + i2) * i3);
    }

    public final int zza() {
        zzdd.zzf(this.zzm >= 0);
        int i = this.zzm * this.zzb;
        return i + i;
    }

    public final int zzb() {
        int i = this.zzk * this.zzb;
        return i + i;
    }

    public final void zzc() {
        this.zzk = 0;
        this.zzm = 0;
        this.zzo = 0;
        this.zzp = 0;
        this.zzq = 0;
        this.zzr = 0;
        this.zzs = 0;
        this.zzt = 0;
        this.zzu = 0;
        this.zzv = 0;
        this.zzw = 0.0d;
    }

    public final void zzd(ShortBuffer shortBuffer) {
        zzdd.zzf(this.zzm >= 0);
        int remaining = shortBuffer.remaining();
        int i = this.zzb;
        int min = Math.min(remaining / i, this.zzm);
        int i2 = min * i;
        shortBuffer.put(this.zzl, 0, i2);
        int i3 = this.zzm - min;
        this.zzm = i3;
        short[] sArr = this.zzl;
        System.arraycopy(sArr, i2, sArr, 0, i3 * i);
    }

    public final void zze() {
        int i = this.zzk;
        int i2 = this.zzr;
        int i3 = this.zzm;
        float f = this.zzc;
        float f2 = this.zzd;
        int i4 = i3 + ((int) ((((((((double) (i - i2)) / ((double) (f / f2))) + ((double) i2)) + this.zzw) + ((double) this.zzo)) / ((double) (this.zze * f2))) + 0.5d));
        this.zzw = 0.0d;
        int i5 = this.zzh;
        int i6 = i5 + i5;
        this.zzj = zzl(this.zzj, i, i + i6);
        int i7 = 0;
        while (true) {
            int i8 = this.zzb;
            if (i7 >= i6 * i8) {
                break;
            }
            this.zzj[(i8 * i) + i7] = 0;
            i7++;
        }
        this.zzk += i6;
        zzk();
        if (this.zzm > i4) {
            this.zzm = Math.max(i4, 0);
        }
        this.zzk = 0;
        this.zzr = 0;
        this.zzo = 0;
    }

    public final void zzf(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int i = this.zzb;
        int i2 = remaining / i;
        int i3 = i2 * i;
        short[] zzl2 = zzl(this.zzj, this.zzk, i2);
        this.zzj = zzl2;
        shortBuffer.get(zzl2, this.zzk * i, (i3 + i3) / 2);
        this.zzk += i2;
        zzk();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x019e: MOVE  (r3v1 int) = (r18v0 int)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:122)
        	at jadx.core.dex.visitors.regions.TernaryMod.visitRegion(TernaryMod.java:34)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:73)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:31)
        */
    /* JADX WARNING: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01a4  */
    private final void zzk() {
        /*
            r22 = this;
            r0 = r22
            float r1 = r0.zzc
            float r2 = r0.zzd
            float r1 = r1 / r2
            double r3 = (double) r1
            r5 = 4607182463897174016(0x3ff0000a80000000, double:1.0000100135803223)
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            int r5 = r0.zzm
            r6 = 0
            r7 = 1
            if (r1 > 0) goto L_0x0029
            r8 = 4607182328605704192(0x3fefffeb00000000, double:0.9999899864196777)
            int r1 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r1 >= 0) goto L_0x001f
            goto L_0x0029
        L_0x001f:
            short[] r1 = r0.zzj
            int r3 = r0.zzk
            r0.zzh(r1, r6, r3)
            r0.zzk = r6
            goto L_0x002f
        L_0x0029:
            int r1 = r0.zzk
            int r8 = r0.zzh
            if (r1 >= r8) goto L_0x0033
        L_0x002f:
            r18 = r5
            goto L_0x0193
        L_0x0033:
            r15 = r6
        L_0x0034:
            int r9 = r0.zzr
            if (r9 <= 0) goto L_0x004d
            int r9 = java.lang.Math.min(r8, r9)
            short[] r10 = r0.zzj
            r0.zzh(r10, r15, r9)
            int r10 = r0.zzr
            int r10 = r10 - r9
            r0.zzr = r10
            int r15 = r15 + r9
            r19 = r3
            r18 = r5
            goto L_0x0180
        L_0x004d:
            short[] r9 = r0.zzj
            int r10 = r0.zza
            r11 = 4000(0xfa0, float:5.605E-42)
            if (r10 <= r11) goto L_0x0058
            int r10 = r10 / 4000
            goto L_0x0059
        L_0x0058:
            r10 = r7
        L_0x0059:
            int r11 = r0.zzb
            if (r11 != r7) goto L_0x006c
            if (r10 != r7) goto L_0x006b
            int r10 = r0.zzf
            int r11 = r0.zzg
            int r9 = r0.zzg(r9, r15, r10, r11)
            r18 = r5
            r10 = r7
            goto L_0x00a2
        L_0x006b:
            r11 = r7
        L_0x006c:
            r0.zzi(r9, r15, r10)
            short[] r12 = r0.zzi
            int r13 = r0.zzf
            int r14 = r0.zzg
            int r7 = r14 / r10
            r18 = r5
            int r5 = r13 / r10
            int r5 = r0.zzg(r12, r6, r5, r7)
            r7 = 1
            if (r10 == r7) goto L_0x00a0
            int r5 = r5 * r10
            int r10 = r10 * 4
            int r7 = r5 - r10
            if (r7 >= r13) goto L_0x008a
            goto L_0x008b
        L_0x008a:
            r13 = r7
        L_0x008b:
            int r5 = r5 + r10
            if (r5 <= r14) goto L_0x008f
            goto L_0x0090
        L_0x008f:
            r14 = r5
        L_0x0090:
            r5 = 1
            if (r11 != r5) goto L_0x0098
            int r9 = r0.zzg(r9, r15, r13, r14)
            goto L_0x00a1
        L_0x0098:
            r0.zzi(r9, r15, r5)
            int r9 = r0.zzg(r12, r6, r13, r14)
            goto L_0x00a1
        L_0x00a0:
            r9 = r5
        L_0x00a1:
            r10 = r11
        L_0x00a2:
            int r5 = r0.zzu
            int r7 = r0.zzv
            if (r5 == 0) goto L_0x00bd
            int r11 = r0.zzs
            if (r11 != 0) goto L_0x00ad
            goto L_0x00bd
        L_0x00ad:
            int r12 = r5 * 3
            if (r7 <= r12) goto L_0x00b2
            goto L_0x00bd
        L_0x00b2:
            int r7 = r5 + r5
            int r12 = r0.zzt
            int r12 = r12 * 3
            if (r7 > r12) goto L_0x00bb
            goto L_0x00bd
        L_0x00bb:
            r7 = r11
            goto L_0x00be
        L_0x00bd:
            r7 = r9
        L_0x00be:
            int r16 = r15 + r7
            r0.zzt = r5
            r0.zzs = r9
            r11 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r5 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            double r13 = (double) r7
            r19 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            if (r5 <= 0) goto L_0x011f
            short[] r5 = r0.zzj
            double r19 = r3 + r19
            r11 = 4611686018427387904(0x4000000000000000, double:2.0)
            int r9 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r9 < 0) goto L_0x00e9
            double r11 = r0.zzw
            double r13 = r13 / r19
            double r13 = r13 + r11
            long r11 = java.lang.Math.round(r13)
            int r9 = (int) r11
            double r11 = (double) r9
            double r13 = r13 - r11
            r0.zzw = r13
            r21 = r7
            r6 = r9
            goto L_0x00ff
        L_0x00e9:
            double r11 = r11 - r3
            r21 = r7
            double r6 = r0.zzw
            double r13 = r13 * r11
            double r13 = r13 / r19
            double r13 = r13 + r6
            long r6 = java.lang.Math.round(r13)
            int r6 = (int) r6
            r0.zzr = r6
            double r6 = (double) r6
            double r13 = r13 - r6
            r0.zzw = r13
            r6 = r21
        L_0x00ff:
            short[] r7 = r0.zzl
            int r9 = r0.zzm
            short[] r11 = r0.zzl(r7, r9, r6)
            r0.zzl = r11
            int r12 = r0.zzm
            r9 = r6
            r13 = r5
            r14 = r15
            r7 = r15
            r15 = r5
            zzj(r9, r10, r11, r12, r13, r14, r15, r16)
            int r5 = r0.zzm
            int r5 = r5 + r6
            r0.zzm = r5
            int r5 = r21 + r6
            int r15 = r7 + r5
            r19 = r3
            goto L_0x0180
        L_0x011f:
            r21 = r7
            r7 = r15
            short[] r15 = r0.zzj
            double r11 = r11 - r3
            r5 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 >= 0) goto L_0x013c
            double r13 = r13 * r3
            double r5 = r0.zzw
            double r13 = r13 / r11
            double r13 = r13 + r5
            long r5 = java.lang.Math.round(r13)
            int r5 = (int) r5
            double r11 = (double) r5
            double r13 = r13 - r11
            r0.zzw = r13
            r19 = r3
            goto L_0x0154
        L_0x013c:
            double r5 = r3 + r3
            double r5 = r5 + r19
            r19 = r3
            double r3 = r0.zzw
            double r13 = r13 * r5
            double r13 = r13 / r11
            double r13 = r13 + r3
            long r3 = java.lang.Math.round(r13)
            int r3 = (int) r3
            r0.zzr = r3
            double r3 = (double) r3
            double r13 = r13 - r3
            r0.zzw = r13
            r5 = r21
        L_0x0154:
            short[] r3 = r0.zzl
            int r4 = r0.zzm
            int r6 = r21 + r5
            short[] r3 = r0.zzl(r3, r4, r6)
            r0.zzl = r3
            int r4 = r7 * r10
            int r9 = r0.zzm
            int r9 = r9 * r10
            int r11 = r21 * r10
            java.lang.System.arraycopy(r15, r4, r3, r9, r11)
            short[] r11 = r0.zzl
            int r3 = r0.zzm
            int r12 = r3 + r21
            r9 = r5
            r13 = r15
            r14 = r16
            r16 = r7
            zzj(r9, r10, r11, r12, r13, r14, r15, r16)
            int r3 = r0.zzm
            int r3 = r3 + r6
            r0.zzm = r3
            int r15 = r7 + r5
        L_0x0180:
            int r3 = r15 + r8
            if (r3 <= r1) goto L_0x028f
            int r1 = r0.zzk
            int r1 = r1 - r15
            short[] r3 = r0.zzj
            int r4 = r0.zzb
            int r15 = r15 * r4
            int r4 = r4 * r1
            r5 = 0
            java.lang.System.arraycopy(r3, r15, r3, r5, r4)
            r0.zzk = r1
        L_0x0193:
            float r1 = r0.zze
            float r1 = r1 * r2
            r2 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x028e
            int r2 = r0.zzm
            r3 = r18
            if (r2 != r3) goto L_0x01a4
            goto L_0x028e
        L_0x01a4:
            int r2 = r0.zza
            float r4 = (float) r2
            float r4 = r4 / r1
            long r1 = (long) r2
            long r4 = (long) r4
        L_0x01aa:
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c5
            int r8 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c5
            r8 = 2
            long r10 = r4 % r8
            int r10 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r10 != 0) goto L_0x01c5
            long r10 = r1 % r8
            int r6 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r6 != 0) goto L_0x01c5
            long r4 = r4 / r8
            long r1 = r1 / r8
            goto L_0x01aa
        L_0x01c5:
            int r6 = r0.zzm
            int r6 = r6 - r3
            short[] r7 = r0.zzn
            int r8 = r0.zzo
            short[] r7 = r0.zzl(r7, r8, r6)
            r0.zzn = r7
            short[] r8 = r0.zzl
            int r9 = r0.zzb
            int r10 = r3 * r9
            int r11 = r0.zzo
            int r11 = r11 * r9
            int r12 = r6 * r9
            java.lang.System.arraycopy(r8, r10, r7, r11, r12)
            r0.zzm = r3
            int r3 = r0.zzo
            int r3 = r3 + r6
            r0.zzo = r3
            r3 = 0
        L_0x01e8:
            int r6 = r0.zzo
            int r7 = r6 + -1
            if (r3 >= r7) goto L_0x027a
        L_0x01ee:
            int r6 = r0.zzp
            r7 = 1
            int r6 = r6 + r7
            long r10 = (long) r6
            long r12 = r10 * r4
            int r8 = r0.zzq
            long r14 = (long) r8
            long r16 = r14 * r1
            int r8 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r8 <= 0) goto L_0x0258
            short[] r6 = r0.zzl
            int r8 = r0.zzm
            short[] r6 = r0.zzl(r6, r8, r7)
            r0.zzl = r6
            r6 = 0
        L_0x0209:
            if (r6 >= r9) goto L_0x0244
            short[] r7 = r0.zzl
            int r8 = r0.zzm
            int r8 = r8 * r9
            short[] r10 = r0.zzn
            int r11 = r3 * r9
            int r11 = r11 + r6
            short r12 = r10[r11]
            int r11 = r11 + r9
            short r10 = r10[r11]
            int r11 = r0.zzq
            long r13 = (long) r11
            long r13 = r13 * r1
            int r11 = r0.zzp
            r18 = r1
            long r1 = (long) r11
            long r1 = r1 * r4
            r15 = 1
            int r11 = r11 + r15
            r15 = r6
            r16 = r7
            long r6 = (long) r11
            long r6 = r6 * r4
            long r11 = (long) r12
            r20 = r9
            long r9 = (long) r10
            long r1 = r6 - r1
            long r6 = r6 - r13
            long r13 = r1 - r6
            long r6 = r6 * r11
            long r13 = r13 * r9
            long r6 = r6 + r13
            long r6 = r6 / r1
            int r1 = (int) r6
            int r8 = r8 + r15
            short r1 = (short) r1
            r16[r8] = r1
            int r6 = r15 + 1
            r1 = r18
            r9 = r20
            goto L_0x0209
        L_0x0244:
            r18 = r1
            r20 = r9
            int r1 = r0.zzq
            r9 = 1
            int r1 = r1 + r9
            r0.zzq = r1
            int r1 = r0.zzm
            int r1 = r1 + r9
            r0.zzm = r1
            r1 = r18
            r9 = r20
            goto L_0x01ee
        L_0x0258:
            r18 = r1
            r20 = r9
            r9 = r7
            r0.zzp = r6
            int r1 = (r10 > r18 ? 1 : (r10 == r18 ? 0 : -1))
            r10 = 0
            if (r1 != 0) goto L_0x0272
            r0.zzp = r10
            int r1 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r1 != 0) goto L_0x026c
            r7 = r9
            goto L_0x026d
        L_0x026c:
            r7 = r10
        L_0x026d:
            com.google.android.gms.internal.ads.zzdd.zzf(r7)
            r0.zzq = r10
        L_0x0272:
            int r3 = r3 + 1
            r1 = r18
            r9 = r20
            goto L_0x01e8
        L_0x027a:
            r20 = r9
            r10 = 0
            if (r7 == 0) goto L_0x028e
            short[] r1 = r0.zzn
            int r9 = r7 * r20
            int r6 = r6 - r7
            int r6 = r6 * r20
            java.lang.System.arraycopy(r1, r9, r1, r10, r6)
            int r1 = r0.zzo
            int r1 = r1 - r7
            r0.zzo = r1
        L_0x028e:
            return
        L_0x028f:
            r5 = r18
            r3 = r19
            r6 = 0
            r7 = 1
            goto L_0x0034
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcp.zzk():void");
    }
}
