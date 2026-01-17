package com.google.android.gms.internal.ads;

import android.util.Pair;
import android.util.SparseArray;
import com.google.common.base.Ascii;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.IntCompanionObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzajd implements zzadv {
    private static final byte[] zza = {-94, 57, 79, 82, 90, -101, 79, Ascii.DC4, -94, 68, 108, 66, 124, 100, -115, -12};
    private static final zzz zzb;
    private long zzA;
    private long zzB;
    private zzajc zzC;
    private int zzD;
    private int zzE;
    private int zzF;
    private boolean zzG;
    private boolean zzH;
    private zzady zzI;
    private zzafb[] zzJ;
    private zzafb[] zzK;
    private boolean zzL;
    private long zzM;
    private final zzakr zzc;
    private final int zzd;
    private final List zze;
    private final SparseArray zzf;
    private final zzen zzg;
    private final zzen zzh;
    private final zzen zzi;
    private final byte[] zzj;
    private final zzen zzk;
    private final zzags zzl;
    private final zzen zzm;
    private final ArrayDeque zzn;
    private final ArrayDeque zzo;
    private final zzfz zzp;
    private final zzadj zzq;
    private zzfyq zzr;
    private int zzs;
    private int zzt;
    private long zzu;
    private int zzv;
    private zzen zzw;
    private long zzx;
    private int zzy;
    private long zzz;

    static {
        zzx zzx2 = new zzx();
        zzx2.zzah("application/x-emsg");
        zzb = zzx2.zzan();
    }

    @Deprecated
    public zzajd() {
        this(zzakr.zza, 32, (zzeu) null, (zzajp) null, zzfyq.zzn(), (zzafb) null);
    }

    private static int zzg(int i) throws zzaz {
        if (i >= 0) {
            return i;
        }
        throw zzaz.zza("Unexpected negative value: " + i, (Throwable) null);
    }

    private static Pair zzh(zzen zzen, long j) throws zzaz {
        long j2;
        long j3;
        zzen zzen2 = zzen;
        zzen2.zzL(8);
        int zza2 = zzaix.zza(zzen.zzg());
        zzen2.zzM(4);
        long zzu2 = zzen.zzu();
        if (zza2 == 0) {
            j3 = zzen.zzu();
            j2 = zzen.zzu();
        } else {
            j3 = zzen.zzw();
            j2 = zzen.zzw();
        }
        long j4 = j3;
        long j5 = j + j2;
        long zzu3 = zzex.zzu(j4, 1000000, zzu2, RoundingMode.DOWN);
        zzen2.zzM(2);
        int zzq2 = zzen.zzq();
        int[] iArr = new int[zzq2];
        long[] jArr = new long[zzq2];
        long[] jArr2 = new long[zzq2];
        long[] jArr3 = new long[zzq2];
        long j6 = zzu3;
        long j7 = j4;
        int i = 0;
        long j8 = j7;
        while (i < zzq2) {
            int zzg2 = zzen.zzg();
            if ((Integer.MIN_VALUE & zzg2) == 0) {
                long zzu4 = zzen.zzu();
                iArr[i] = zzg2 & IntCompanionObject.MAX_VALUE;
                jArr[i] = j5;
                jArr3[i] = j6;
                long j9 = j8 + zzu4;
                long[] jArr4 = jArr3;
                long[] jArr5 = jArr;
                int i2 = zzq2;
                int[] iArr2 = iArr;
                long zzu5 = zzex.zzu(j9, 1000000, zzu2, RoundingMode.DOWN);
                long[] jArr6 = jArr2;
                jArr6[i] = zzu5 - jArr4[i];
                zzen2.zzM(4);
                j5 += (long) iArr2[i];
                i++;
                iArr = iArr2;
                jArr2 = jArr6;
                jArr = jArr5;
                zzq2 = i2;
                jArr3 = jArr4;
                long j10 = zzu5;
                j8 = j9;
                j6 = j10;
            } else {
                throw zzaz.zza("Unhandled indirect reference", (Throwable) null);
            }
        }
        return Pair.create(Long.valueOf(zzu3), new zzadi(iArr, jArr, jArr2, jArr3));
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0116  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.gms.internal.ads.zzs zzj(java.util.List r18) {
        /*
            int r0 = r18.size()
            r1 = 0
            r3 = r1
            r4 = 0
        L_0x0007:
            if (r3 >= r0) goto L_0x012b
            r5 = r18
            java.lang.Object r6 = r5.get(r3)
            com.google.android.gms.internal.ads.zzfd r6 = (com.google.android.gms.internal.ads.zzfd) r6
            int r7 = r6.zzd
            r8 = 1886614376(0x70737368, float:3.013775E29)
            if (r7 != r8) goto L_0x0124
            if (r4 != 0) goto L_0x001f
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L_0x001f:
            com.google.android.gms.internal.ads.zzen r6 = r6.zza
            byte[] r6 = r6.zzN()
            com.google.android.gms.internal.ads.zzen r7 = new com.google.android.gms.internal.ads.zzen
            r7.<init>((byte[]) r6)
            int r9 = r7.zzd()
            r10 = 32
            if (r9 >= r10) goto L_0x0039
        L_0x0032:
            r16 = r3
            r17 = r4
        L_0x0036:
            r2 = 0
            goto L_0x0104
        L_0x0039:
            r7.zzL(r1)
            int r9 = r7.zza()
            int r10 = r7.zzg()
            java.lang.String r11 = "PsshAtomUtil"
            if (r10 == r9) goto L_0x0062
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Advertised atom size ("
            r7.<init>(r8)
            r7.append(r10)
            java.lang.String r8 = ") does not match buffer size: "
            r7.append(r8)
            r7.append(r9)
            java.lang.String r7 = r7.toString()
            com.google.android.gms.internal.ads.zzea.zzf(r11, r7)
            goto L_0x0032
        L_0x0062:
            int r9 = r7.zzg()
            if (r9 == r8) goto L_0x007a
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Atom type is not pssh: "
            r7.<init>(r8)
            r7.append(r9)
            java.lang.String r7 = r7.toString()
            com.google.android.gms.internal.ads.zzea.zzf(r11, r7)
            goto L_0x0032
        L_0x007a:
            int r8 = r7.zzg()
            int r8 = com.google.android.gms.internal.ads.zzaix.zza(r8)
            r9 = 1
            if (r8 <= r9) goto L_0x0097
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r9 = "Unsupported pssh version: "
            r7.<init>(r9)
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            com.google.android.gms.internal.ads.zzea.zzf(r11, r7)
            goto L_0x0032
        L_0x0097:
            java.util.UUID r10 = new java.util.UUID
            long r12 = r7.zzt()
            long r14 = r7.zzt()
            r10.<init>(r12, r14)
            if (r8 != r9) goto L_0x00d0
            int r9 = r7.zzp()
            java.util.UUID[] r12 = new java.util.UUID[r9]
            r13 = r1
        L_0x00ad:
            if (r13 >= r9) goto L_0x00cb
            java.util.UUID r14 = new java.util.UUID
            r16 = r3
            long r2 = r7.zzt()
            r17 = r4
            long r4 = r7.zzt()
            r14.<init>(r2, r4)
            r12[r13] = r14
            int r13 = r13 + 1
            r5 = r18
            r3 = r16
            r4 = r17
            goto L_0x00ad
        L_0x00cb:
            r16 = r3
            r17 = r4
            goto L_0x00d5
        L_0x00d0:
            r16 = r3
            r17 = r4
            r12 = 0
        L_0x00d5:
            int r2 = r7.zzp()
            int r3 = r7.zza()
            if (r2 == r3) goto L_0x00fa
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Atom data size ("
            r4.<init>(r5)
            r4.append(r2)
            java.lang.String r2 = ") does not match the bytes left: "
            r4.append(r2)
            r4.append(r3)
            java.lang.String r2 = r4.toString()
            com.google.android.gms.internal.ads.zzea.zzf(r11, r2)
            goto L_0x0036
        L_0x00fa:
            byte[] r3 = new byte[r2]
            r7.zzH(r3, r1, r2)
            com.google.android.gms.internal.ads.zzajl r2 = new com.google.android.gms.internal.ads.zzajl
            r2.<init>(r10, r8, r3, r12)
        L_0x0104:
            if (r2 != 0) goto L_0x0108
            r2 = 0
            goto L_0x010a
        L_0x0108:
            java.util.UUID r2 = r2.zza
        L_0x010a:
            if (r2 != 0) goto L_0x0116
            java.lang.String r2 = "FragmentedMp4Extractor"
            java.lang.String r3 = "Skipped pssh atom (failed to extract uuid)"
            com.google.android.gms.internal.ads.zzea.zzf(r2, r3)
            r4 = r17
            goto L_0x0126
        L_0x0116:
            com.google.android.gms.internal.ads.zzr r3 = new com.google.android.gms.internal.ads.zzr
            java.lang.String r4 = "video/mp4"
            r5 = 0
            r3.<init>(r2, r5, r4, r6)
            r4 = r17
            r4.add(r3)
            goto L_0x0127
        L_0x0124:
            r16 = r3
        L_0x0126:
            r5 = 0
        L_0x0127:
            int r3 = r16 + 1
            goto L_0x0007
        L_0x012b:
            r5 = 0
            if (r4 != 0) goto L_0x012f
            return r5
        L_0x012f:
            com.google.android.gms.internal.ads.zzs r0 = new com.google.android.gms.internal.ads.zzs
            r0.<init>((java.util.List) r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzajd.zzj(java.util.List):com.google.android.gms.internal.ads.zzs");
    }

    private final void zzk() {
        this.zzs = 0;
        this.zzv = 0;
    }

    private static void zzl(zzen zzen, int i, zzajr zzajr) throws zzaz {
        zzen.zzL(i + 8);
        int zzg2 = zzen.zzg();
        int i2 = zzaix.zza;
        if ((zzg2 & 1) == 0) {
            boolean z = (zzg2 & 2) != 0;
            int zzp2 = zzen.zzp();
            if (zzp2 == 0) {
                Arrays.fill(zzajr.zzl, 0, zzajr.zze, false);
                return;
            }
            int i3 = zzajr.zze;
            if (zzp2 == i3) {
                Arrays.fill(zzajr.zzl, 0, zzp2, z);
                zzajr.zza(zzen.zza());
                zzen zzen2 = zzajr.zzn;
                zzen.zzH(zzen2.zzN(), 0, zzen2.zzd());
                zzen2.zzL(0);
                zzajr.zzo = false;
                return;
            }
            throw zzaz.zza("Senc sample count " + zzp2 + " is different from fragment sample count" + i3, (Throwable) null);
        }
        throw zzaz.zzc("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:119:0x033e, code lost:
        if ((com.google.android.gms.internal.ads.zzex.zzu(r36, 1000000, r9.zzd, java.math.RoundingMode.DOWN) + com.google.android.gms.internal.ads.zzex.zzu(r0[0], 1000000, r9.zzc, java.math.RoundingMode.DOWN)) < r9.zze) goto L_0x0352;
     */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0361  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0363  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0373  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zzm(long r53) throws com.google.android.gms.internal.ads.zzaz {
        /*
            r52 = this;
            r0 = r52
        L_0x0002:
            java.util.ArrayDeque r1 = r0.zzn
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L_0x06fe
            java.lang.Object r2 = r1.peek()
            com.google.android.gms.internal.ads.zzfc r2 = (com.google.android.gms.internal.ads.zzfc) r2
            long r2 = r2.zza
            int r2 = (r2 > r53 ? 1 : (r2 == r53 ? 0 : -1))
            if (r2 != 0) goto L_0x06fe
            java.lang.Object r2 = r1.pop()
            r3 = r2
            com.google.android.gms.internal.ads.zzfc r3 = (com.google.android.gms.internal.ads.zzfc) r3
            int r2 = r3.zzd
            r4 = 1836019574(0x6d6f6f76, float:4.631354E27)
            r7 = 12
            r9 = 8
            if (r2 != r4) goto L_0x0140
            java.util.List r1 = r3.zzb
            com.google.android.gms.internal.ads.zzs r1 = zzj(r1)
            r2 = 1836475768(0x6d766578, float:4.7659988E27)
            com.google.android.gms.internal.ads.zzfc r2 = r3.zza(r2)
            r2.getClass()
            r4 = r2
            com.google.android.gms.internal.ads.zzfc r4 = (com.google.android.gms.internal.ads.zzfc) r4
            android.util.SparseArray r13 = new android.util.SparseArray
            r13.<init>()
            java.util.List r2 = r2.zzb
            int r4 = r2.size()
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r10 = 0
        L_0x004c:
            if (r10 >= r4) goto L_0x00b5
            java.lang.Object r14 = r2.get(r10)
            com.google.android.gms.internal.ads.zzfd r14 = (com.google.android.gms.internal.ads.zzfd) r14
            int r15 = r14.zzd
            r12 = 1953654136(0x74726578, float:7.6818474E31)
            if (r15 != r12) goto L_0x0093
            com.google.android.gms.internal.ads.zzen r12 = r14.zza
            r12.zzL(r7)
            int r14 = r12.zzg()
            int r15 = r12.zzg()
            int r15 = r15 + -1
            int r7 = r12.zzg()
            int r11 = r12.zzg()
            int r12 = r12.zzg()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            com.google.android.gms.internal.ads.zzaiy r8 = new com.google.android.gms.internal.ads.zzaiy
            r8.<init>(r15, r7, r11, r12)
            android.util.Pair r7 = android.util.Pair.create(r14, r8)
            java.lang.Object r8 = r7.first
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            java.lang.Object r7 = r7.second
            com.google.android.gms.internal.ads.zzaiy r7 = (com.google.android.gms.internal.ads.zzaiy) r7
            r13.put(r8, r7)
            goto L_0x00b0
        L_0x0093:
            r7 = 1835362404(0x6d656864, float:4.4373917E27)
            if (r15 != r7) goto L_0x00b0
            com.google.android.gms.internal.ads.zzen r5 = r14.zza
            r5.zzL(r9)
            int r6 = r5.zzg()
            int r6 = com.google.android.gms.internal.ads.zzaix.zza(r6)
            if (r6 != 0) goto L_0x00ac
            long r5 = r5.zzu()
            goto L_0x00b0
        L_0x00ac:
            long r5 = r5.zzw()
        L_0x00b0:
            int r10 = r10 + 1
            r7 = 12
            goto L_0x004c
        L_0x00b5:
            com.google.android.gms.internal.ads.zzaej r4 = new com.google.android.gms.internal.ads.zzaej
            r4.<init>()
            int r2 = r0.zzd
            r7 = 16
            r2 = r2 & r7
            if (r2 == 0) goto L_0x00c3
            r8 = 1
            goto L_0x00c4
        L_0x00c3:
            r8 = 0
        L_0x00c4:
            com.google.android.gms.internal.ads.zzaiz r10 = new com.google.android.gms.internal.ads.zzaiz
            r10.<init>(r0)
            r9 = 0
            r7 = r1
            java.util.List r1 = com.google.android.gms.internal.ads.zzaix.zzf(r3, r4, r5, r7, r8, r9, r10)
            int r2 = r1.size()
            android.util.SparseArray r3 = r0.zzf
            int r4 = r3.size()
            if (r4 != 0) goto L_0x0117
            java.lang.String r4 = com.google.android.gms.internal.ads.zzajg.zza(r1)
            r12 = 0
        L_0x00e0:
            if (r12 >= r2) goto L_0x0110
            java.lang.Object r5 = r1.get(r12)
            com.google.android.gms.internal.ads.zzajs r5 = (com.google.android.gms.internal.ads.zzajs) r5
            com.google.android.gms.internal.ads.zzajp r6 = r5.zza
            com.google.android.gms.internal.ads.zzady r7 = r0.zzI
            int r8 = r6.zzb
            com.google.android.gms.internal.ads.zzafb r7 = r7.zzw(r12, r8)
            long r8 = r6.zze
            r7.zzl(r8)
            int r6 = r6.zza
            com.google.android.gms.internal.ads.zzajc r10 = new com.google.android.gms.internal.ads.zzajc
            com.google.android.gms.internal.ads.zzaiy r11 = zzn(r13, r6)
            r10.<init>(r7, r5, r11, r4)
            r3.put(r6, r10)
            long r5 = r0.zzA
            long r5 = java.lang.Math.max(r5, r8)
            r0.zzA = r5
            int r12 = r12 + 1
            goto L_0x00e0
        L_0x0110:
            com.google.android.gms.internal.ads.zzady r1 = r0.zzI
            r1.zzG()
            goto L_0x0002
        L_0x0117:
            int r4 = r3.size()
            if (r4 != r2) goto L_0x011f
            r11 = 1
            goto L_0x0120
        L_0x011f:
            r11 = 0
        L_0x0120:
            com.google.android.gms.internal.ads.zzdd.zzf(r11)
            r12 = 0
        L_0x0124:
            if (r12 >= r2) goto L_0x0002
            java.lang.Object r4 = r1.get(r12)
            com.google.android.gms.internal.ads.zzajs r4 = (com.google.android.gms.internal.ads.zzajs) r4
            com.google.android.gms.internal.ads.zzajp r5 = r4.zza
            int r5 = r5.zza
            java.lang.Object r6 = r3.get(r5)
            com.google.android.gms.internal.ads.zzajc r6 = (com.google.android.gms.internal.ads.zzajc) r6
            com.google.android.gms.internal.ads.zzaiy r5 = zzn(r13, r5)
            r6.zzh(r4, r5)
            int r12 = r12 + 1
            goto L_0x0124
        L_0x0140:
            r4 = 1836019558(0x6d6f6f66, float:4.6313494E27)
            if (r2 != r4) goto L_0x06ec
            android.util.SparseArray r1 = r0.zzf
            int r2 = r0.zzd
            byte[] r4 = r0.zzj
            java.util.List r7 = r3.zzc
            int r8 = r7.size()
            r10 = 0
        L_0x0152:
            if (r10 >= r8) goto L_0x0686
            java.lang.Object r11 = r7.get(r10)
            com.google.android.gms.internal.ads.zzfc r11 = (com.google.android.gms.internal.ads.zzfc) r11
            int r12 = r11.zzd
            r13 = 1953653094(0x74726166, float:7.6813435E31)
            if (r12 != r13) goto L_0x0660
            r12 = 1952868452(0x74666864, float:7.301914E31)
            com.google.android.gms.internal.ads.zzfd r12 = r11.zzb(r12)
            r12.getClass()
            r13 = r12
            com.google.android.gms.internal.ads.zzfd r13 = (com.google.android.gms.internal.ads.zzfd) r13
            com.google.android.gms.internal.ads.zzen r12 = r12.zza
            r12.zzL(r9)
            int r13 = r12.zzg()
            int r14 = com.google.android.gms.internal.ads.zzaix.zza
            int r14 = r12.zzg()
            java.lang.Object r14 = r1.get(r14)
            com.google.android.gms.internal.ads.zzajc r14 = (com.google.android.gms.internal.ads.zzajc) r14
            if (r14 != 0) goto L_0x0187
            r14 = 0
            goto L_0x01d0
        L_0x0187:
            r18 = r13 & 1
            if (r18 == 0) goto L_0x0195
            long r5 = r12.zzw()
            com.google.android.gms.internal.ads.zzajr r15 = r14.zzb
            r15.zzb = r5
            r15.zzc = r5
        L_0x0195:
            com.google.android.gms.internal.ads.zzaiy r5 = r14.zze
            r6 = r13 & 2
            if (r6 == 0) goto L_0x01a2
            int r6 = r12.zzg()
            int r6 = r6 + -1
            goto L_0x01a4
        L_0x01a2:
            int r6 = r5.zza
        L_0x01a4:
            r15 = r13 & 8
            if (r15 == 0) goto L_0x01ad
            int r15 = r12.zzg()
            goto L_0x01af
        L_0x01ad:
            int r15 = r5.zzb
        L_0x01af:
            r19 = r13 & 16
            if (r19 == 0) goto L_0x01ba
            int r19 = r12.zzg()
            r9 = r19
            goto L_0x01bc
        L_0x01ba:
            int r9 = r5.zzc
        L_0x01bc:
            r13 = r13 & 32
            if (r13 == 0) goto L_0x01c5
            int r5 = r12.zzg()
            goto L_0x01c7
        L_0x01c5:
            int r5 = r5.zzd
        L_0x01c7:
            com.google.android.gms.internal.ads.zzajr r12 = r14.zzb
            com.google.android.gms.internal.ads.zzaiy r13 = new com.google.android.gms.internal.ads.zzaiy
            r13.<init>(r6, r15, r9, r5)
            r12.zza = r13
        L_0x01d0:
            if (r14 != 0) goto L_0x01e3
            r27 = r1
            r45 = r2
            r28 = r3
            r20 = r7
            r22 = r8
            r30 = r10
            r0 = 1
            r6 = 8
            goto L_0x066e
        L_0x01e3:
            com.google.android.gms.internal.ads.zzajr r5 = r14.zzb
            long r12 = r5.zzp
            boolean r6 = r5.zzq
            r14.zzi()
            r9 = 1
            r14.zzm = true
            r15 = 1952867444(0x74666474, float:7.3014264E31)
            com.google.android.gms.internal.ads.zzfd r15 = r11.zzb(r15)
            if (r15 == 0) goto L_0x021c
            r17 = r2 & 2
            if (r17 != 0) goto L_0x021c
            com.google.android.gms.internal.ads.zzen r6 = r15.zza
            r12 = 8
            r6.zzL(r12)
            int r12 = r6.zzg()
            int r12 = com.google.android.gms.internal.ads.zzaix.zza(r12)
            if (r12 != r9) goto L_0x0213
            long r12 = r6.zzw()
            goto L_0x0217
        L_0x0213:
            long r12 = r6.zzu()
        L_0x0217:
            r5.zzp = r12
            r5.zzq = r9
            goto L_0x0220
        L_0x021c:
            r5.zzp = r12
            r5.zzq = r6
        L_0x0220:
            java.util.List r6 = r11.zzb
            int r9 = r6.size()
            r20 = r7
            r12 = 0
            r13 = 0
            r15 = 0
        L_0x022b:
            r7 = 1953658222(0x7472756e, float:7.683823E31)
            if (r12 >= r9) goto L_0x0255
            java.lang.Object r21 = r6.get(r12)
            r22 = r8
            r8 = r21
            com.google.android.gms.internal.ads.zzfd r8 = (com.google.android.gms.internal.ads.zzfd) r8
            int r0 = r8.zzd
            if (r0 != r7) goto L_0x024e
            com.google.android.gms.internal.ads.zzen r0 = r8.zza
            r7 = 12
            r0.zzL(r7)
            int r0 = r0.zzp()
            if (r0 <= 0) goto L_0x024e
            int r15 = r15 + r0
            int r13 = r13 + 1
        L_0x024e:
            int r12 = r12 + 1
            r0 = r52
            r8 = r22
            goto L_0x022b
        L_0x0255:
            r22 = r8
            r0 = 0
            r14.zzh = r0
            r14.zzg = r0
            r14.zzf = r0
            r5.zzd = r13
            r5.zze = r15
            int[] r0 = r5.zzg
            int r0 = r0.length
            if (r0 >= r13) goto L_0x026f
            long[] r0 = new long[r13]
            r5.zzf = r0
            int[] r0 = new int[r13]
            r5.zzg = r0
        L_0x026f:
            int[] r0 = r5.zzh
            int r0 = r0.length
            if (r0 >= r15) goto L_0x0288
            int r15 = r15 * 125
            int r15 = r15 / 100
            int[] r0 = new int[r15]
            r5.zzh = r0
            long[] r0 = new long[r15]
            r5.zzi = r0
            boolean[] r0 = new boolean[r15]
            r5.zzj = r0
            boolean[] r0 = new boolean[r15]
            r5.zzl = r0
        L_0x0288:
            r0 = 0
            r8 = 0
            r12 = 0
        L_0x028b:
            r23 = 0
            if (r0 >= r9) goto L_0x043b
            java.lang.Object r15 = r6.get(r0)
            com.google.android.gms.internal.ads.zzfd r15 = (com.google.android.gms.internal.ads.zzfd) r15
            int r13 = r15.zzd
            if (r13 != r7) goto L_0x0412
            int r13 = r8 + 1
            com.google.android.gms.internal.ads.zzen r15 = r15.zza
            r7 = 8
            r15.zzL(r7)
            int r7 = r15.zzg()
            r25 = r9
            com.google.android.gms.internal.ads.zzajs r9 = r14.zzd
            com.google.android.gms.internal.ads.zzajp r9 = r9.zza
            r26 = r13
            com.google.android.gms.internal.ads.zzaiy r13 = r5.zza
            java.lang.String r27 = com.google.android.gms.internal.ads.zzex.zza
            r27 = r13
            com.google.android.gms.internal.ads.zzaiy r27 = (com.google.android.gms.internal.ads.zzaiy) r27
            r27 = r1
            int[] r1 = r5.zzg
            int r28 = r15.zzp()
            r1[r8] = r28
            long[] r1 = r5.zzf
            r28 = r3
            r29 = r4
            long r3 = r5.zzb
            r1[r8] = r3
            r30 = r7 & 1
            if (r30 == 0) goto L_0x02db
            r30 = r10
            int r10 = r15.zzg()
            r31 = r11
            long r10 = (long) r10
            long r3 = r3 + r10
            r1[r8] = r3
            goto L_0x02df
        L_0x02db:
            r30 = r10
            r31 = r11
        L_0x02df:
            r1 = r7 & 4
            if (r1 == 0) goto L_0x02e5
            r1 = 1
            goto L_0x02e6
        L_0x02e5:
            r1 = 0
        L_0x02e6:
            int r3 = r13.zzd
            if (r1 == 0) goto L_0x02ef
            int r4 = r15.zzg()
            goto L_0x02f0
        L_0x02ef:
            r4 = r3
        L_0x02f0:
            r10 = r7 & 256(0x100, float:3.59E-43)
            r11 = r7 & 512(0x200, float:7.175E-43)
            r32 = r3
            r3 = r7 & 1024(0x400, float:1.435E-42)
            r7 = r7 & 2048(0x800, float:2.87E-42)
            r33 = r4
            long[] r4 = r9.zzi
            if (r4 == 0) goto L_0x034a
            r34 = r6
            int r6 = r4.length
            r35 = r0
            r0 = 1
            if (r6 != r0) goto L_0x0347
            long[] r0 = r9.zzj
            if (r0 != 0) goto L_0x030d
            goto L_0x0347
        L_0x030d:
            r6 = 0
            r36 = r4[r6]
            int r4 = (r36 > r23 ? 1 : (r36 == r23 ? 0 : -1))
            if (r4 != 0) goto L_0x0319
            r43 = r3
            r44 = r7
            goto L_0x0341
        L_0x0319:
            r4 = r7
            long r6 = r9.zzd
            java.math.RoundingMode r42 = java.math.RoundingMode.DOWN
            r38 = 1000000(0xf4240, double:4.940656E-318)
            r40 = r6
            long r6 = com.google.android.gms.internal.ads.zzex.zzu(r36, r38, r40, r42)
            r16 = 0
            r36 = r0[r16]
            r43 = r3
            r44 = r4
            long r3 = r9.zzc
            java.math.RoundingMode r42 = java.math.RoundingMode.DOWN
            r40 = r3
            long r3 = com.google.android.gms.internal.ads.zzex.zzu(r36, r38, r40, r42)
            long r6 = r6 + r3
            long r3 = r9.zze
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 >= 0) goto L_0x0341
            goto L_0x0352
        L_0x0341:
            long[] r0 = (long[]) r0
            r3 = 0
            r23 = r0[r3]
            goto L_0x0352
        L_0x0347:
            r43 = r3
            goto L_0x0350
        L_0x034a:
            r35 = r0
            r43 = r3
            r34 = r6
        L_0x0350:
            r44 = r7
        L_0x0352:
            int[] r0 = r5.zzh
            long[] r3 = r5.zzi
            boolean[] r4 = r5.zzj
            int r6 = r9.zzb
            r7 = 2
            if (r6 != r7) goto L_0x0363
            r6 = r2 & 1
            if (r6 == 0) goto L_0x0363
            r6 = 1
            goto L_0x0364
        L_0x0363:
            r6 = 0
        L_0x0364:
            int[] r7 = r5.zzg
            r7 = r7[r8]
            int r7 = r7 + r12
            long r8 = r9.zzc
            r45 = r2
            r21 = r3
            long r2 = r5.zzp
        L_0x0371:
            if (r12 >= r7) goto L_0x0409
            if (r10 == 0) goto L_0x037e
            int r36 = r15.zzg()
            r46 = r7
            r7 = r36
            goto L_0x0382
        L_0x037e:
            r46 = r7
            int r7 = r13.zzb
        L_0x0382:
            zzg(r7)
            if (r11 == 0) goto L_0x0390
            int r36 = r15.zzg()
            r47 = r10
            r10 = r36
            goto L_0x0394
        L_0x0390:
            r47 = r10
            int r10 = r13.zzc
        L_0x0394:
            zzg(r10)
            if (r43 == 0) goto L_0x03a0
            int r36 = r15.zzg()
            r48 = r36
            goto L_0x03ab
        L_0x03a0:
            if (r12 != 0) goto L_0x03a9
            if (r1 == 0) goto L_0x03a8
            r48 = r33
            r12 = 0
            goto L_0x03ab
        L_0x03a8:
            r12 = 0
        L_0x03a9:
            r48 = r32
        L_0x03ab:
            if (r44 == 0) goto L_0x03ba
            int r36 = r15.zzg()
            r49 = r1
            r50 = r6
            r51 = r7
            r1 = r36
            goto L_0x03c1
        L_0x03ba:
            r49 = r1
            r50 = r6
            r51 = r7
            r1 = 0
        L_0x03c1:
            long r6 = (long) r1
            long r6 = r6 + r2
            long r36 = r6 - r23
            r38 = 1000000(0xf4240, double:4.940656E-318)
            java.math.RoundingMode r42 = java.math.RoundingMode.DOWN
            r40 = r8
            long r6 = com.google.android.gms.internal.ads.zzex.zzu(r36, r38, r40, r42)
            r21[r12] = r6
            boolean r1 = r5.zzq
            if (r1 != 0) goto L_0x03e0
            com.google.android.gms.internal.ads.zzajs r1 = r14.zzd
            r36 = r8
            long r8 = r1.zzh
            long r6 = r6 + r8
            r21[r12] = r6
            goto L_0x03e2
        L_0x03e0:
            r36 = r8
        L_0x03e2:
            r0[r12] = r10
            r1 = 16
            int r6 = r48 >> 16
            r1 = 1
            r6 = r6 & r1
            if (r6 != 0) goto L_0x03f5
            if (r50 == 0) goto L_0x03f3
            if (r12 != 0) goto L_0x03f5
            r6 = r1
            r12 = 0
            goto L_0x03f6
        L_0x03f3:
            r6 = r1
            goto L_0x03f6
        L_0x03f5:
            r6 = 0
        L_0x03f6:
            r4[r12] = r6
            r7 = r51
            long r6 = (long) r7
            long r2 = r2 + r6
            int r12 = r12 + r1
            r8 = r36
            r7 = r46
            r10 = r47
            r1 = r49
            r6 = r50
            goto L_0x0371
        L_0x0409:
            r46 = r7
            r5.zzp = r2
            r8 = r26
            r12 = r46
            goto L_0x0424
        L_0x0412:
            r35 = r0
            r27 = r1
            r45 = r2
            r28 = r3
            r29 = r4
            r34 = r6
            r25 = r9
            r30 = r10
            r31 = r11
        L_0x0424:
            int r0 = r35 + 1
            r9 = r25
            r1 = r27
            r3 = r28
            r4 = r29
            r10 = r30
            r11 = r31
            r6 = r34
            r2 = r45
            r7 = 1953658222(0x7472756e, float:7.683823E31)
            goto L_0x028b
        L_0x043b:
            r27 = r1
            r45 = r2
            r28 = r3
            r29 = r4
            r34 = r6
            r30 = r10
            r31 = r11
            com.google.android.gms.internal.ads.zzajs r0 = r14.zzd
            com.google.android.gms.internal.ads.zzajp r0 = r0.zza
            com.google.android.gms.internal.ads.zzaiy r1 = r5.zza
            r1.getClass()
            r2 = r1
            com.google.android.gms.internal.ads.zzaiy r2 = (com.google.android.gms.internal.ads.zzaiy) r2
            int r1 = r1.zza
            com.google.android.gms.internal.ads.zzajq r0 = r0.zzb(r1)
            r1 = 1935763834(0x7361697a, float:1.785898E31)
            r11 = r31
            com.google.android.gms.internal.ads.zzfd r1 = r11.zzb(r1)
            if (r1 == 0) goto L_0x04db
            r0.getClass()
            r2 = r0
            com.google.android.gms.internal.ads.zzajq r2 = (com.google.android.gms.internal.ads.zzajq) r2
            int r2 = r0.zzd
            com.google.android.gms.internal.ads.zzen r1 = r1.zza
            r3 = 8
            r1.zzL(r3)
            int r4 = r1.zzg()
            r6 = 1
            r4 = r4 & r6
            if (r4 != r6) goto L_0x0480
            r1.zzM(r3)
        L_0x0480:
            int r3 = r1.zzm()
            int r4 = r1.zzp()
            int r6 = r5.zze
            if (r4 > r6) goto L_0x04bf
            if (r3 != 0) goto L_0x04a5
            boolean[] r3 = r5.zzl
            r6 = 0
            r7 = 0
        L_0x0492:
            if (r6 >= r4) goto L_0x04a3
            int r8 = r1.zzm()
            int r7 = r7 + r8
            if (r8 <= r2) goto L_0x049d
            r8 = 1
            goto L_0x049e
        L_0x049d:
            r8 = 0
        L_0x049e:
            r3[r6] = r8
            int r6 = r6 + 1
            goto L_0x0492
        L_0x04a3:
            r3 = 0
            goto L_0x04b2
        L_0x04a5:
            if (r3 <= r2) goto L_0x04a9
            r1 = 1
            goto L_0x04aa
        L_0x04a9:
            r1 = 0
        L_0x04aa:
            int r7 = r3 * r4
            boolean[] r2 = r5.zzl
            r3 = 0
            java.util.Arrays.fill(r2, r3, r4, r1)
        L_0x04b2:
            boolean[] r1 = r5.zzl
            int r2 = r5.zze
            java.util.Arrays.fill(r1, r4, r2, r3)
            if (r7 <= 0) goto L_0x04db
            r5.zza(r7)
            goto L_0x04db
        L_0x04bf:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Saiz sample count "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r1 = " is greater than fragment sample count"
            r0.append(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            r1 = 0
            com.google.android.gms.internal.ads.zzaz r0 = com.google.android.gms.internal.ads.zzaz.zza(r0, r1)
            throw r0
        L_0x04db:
            r1 = 1935763823(0x7361696f, float:1.7858967E31)
            com.google.android.gms.internal.ads.zzfd r1 = r11.zzb(r1)
            if (r1 == 0) goto L_0x0526
            com.google.android.gms.internal.ads.zzen r1 = r1.zza
            r2 = 8
            r1.zzL(r2)
            int r3 = r1.zzg()
            r4 = r3 & 1
            r6 = 1
            if (r4 != r6) goto L_0x04f7
            r1.zzM(r2)
        L_0x04f7:
            int r2 = r1.zzp()
            if (r2 != r6) goto L_0x0512
            int r2 = com.google.android.gms.internal.ads.zzaix.zza(r3)
            long r3 = r5.zzc
            if (r2 != 0) goto L_0x050a
            long r1 = r1.zzu()
            goto L_0x050e
        L_0x050a:
            long r1 = r1.zzw()
        L_0x050e:
            long r3 = r3 + r1
            r5.zzc = r3
            goto L_0x0526
        L_0x0512:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unexpected saio entry count: "
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r1 = 0
            com.google.android.gms.internal.ads.zzaz r0 = com.google.android.gms.internal.ads.zzaz.zza(r0, r1)
            throw r0
        L_0x0526:
            r1 = 0
            r2 = 1936027235(0x73656e63, float:1.8177412E31)
            com.google.android.gms.internal.ads.zzfd r2 = r11.zzb(r2)
            if (r2 == 0) goto L_0x0536
            com.google.android.gms.internal.ads.zzen r2 = r2.zza
            r3 = 0
            zzl(r2, r3, r5)
        L_0x0536:
            if (r0 == 0) goto L_0x053c
            java.lang.String r0 = r0.zzb
            r8 = r0
            goto L_0x053d
        L_0x053c:
            r8 = r1
        L_0x053d:
            r0 = r1
            r2 = r0
            r3 = 0
        L_0x0540:
            int r4 = r34.size()
            if (r3 >= r4) goto L_0x057d
            r4 = r34
            java.lang.Object r6 = r4.get(r3)
            com.google.android.gms.internal.ads.zzfd r6 = (com.google.android.gms.internal.ads.zzfd) r6
            com.google.android.gms.internal.ads.zzen r7 = r6.zza
            int r6 = r6.zzd
            r9 = 1935828848(0x73626770, float:1.7937577E31)
            r10 = 1936025959(0x73656967, float:1.817587E31)
            if (r6 != r9) goto L_0x0567
            r14 = 12
            r7.zzL(r14)
            int r6 = r7.zzg()
            if (r6 != r10) goto L_0x0578
            r0 = r7
            goto L_0x0578
        L_0x0567:
            r14 = 12
            r9 = 1936158820(0x73677064, float:1.8336489E31)
            if (r6 != r9) goto L_0x0578
            r7.zzL(r14)
            int r6 = r7.zzg()
            if (r6 != r10) goto L_0x0578
            r2 = r7
        L_0x0578:
            int r3 = r3 + 1
            r34 = r4
            goto L_0x0540
        L_0x057d:
            r4 = r34
            r14 = 12
            if (r0 == 0) goto L_0x061c
            if (r2 != 0) goto L_0x0587
            goto L_0x061c
        L_0x0587:
            r3 = 8
            r0.zzL(r3)
            int r6 = r0.zzg()
            int r6 = com.google.android.gms.internal.ads.zzaix.zza(r6)
            r7 = 4
            r0.zzM(r7)
            r9 = 1
            if (r6 != r9) goto L_0x059e
            r0.zzM(r7)
        L_0x059e:
            int r0 = r0.zzg()
            if (r0 != r9) goto L_0x0615
            r2.zzL(r3)
            int r0 = r2.zzg()
            int r0 = com.google.android.gms.internal.ads.zzaix.zza(r0)
            r2.zzM(r7)
            if (r0 != r9) goto L_0x05c4
            long r9 = r2.zzu()
            int r0 = (r9 > r23 ? 1 : (r9 == r23 ? 0 : -1))
            if (r0 == 0) goto L_0x05bd
            goto L_0x05ca
        L_0x05bd:
            java.lang.String r0 = "Variable length description in sgpd found (unsupported)"
            com.google.android.gms.internal.ads.zzaz r0 = com.google.android.gms.internal.ads.zzaz.zzc(r0)
            throw r0
        L_0x05c4:
            r3 = 2
            if (r0 < r3) goto L_0x05ca
            r2.zzM(r7)
        L_0x05ca:
            long r9 = r2.zzu()
            r11 = 1
            int r0 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x060e
            r0 = 1
            r2.zzM(r0)
            int r3 = r2.zzm()
            r6 = r3 & 240(0xf0, float:3.36E-43)
            int r11 = r6 >> 4
            r12 = r3 & 15
            int r3 = r2.zzm()
            if (r3 != r0) goto L_0x061d
            int r9 = r2.zzm()
            r3 = 16
            byte[] r10 = new byte[r3]
            r6 = 0
            r2.zzH(r10, r6, r3)
            if (r9 != 0) goto L_0x0601
            int r1 = r2.zzm()
            byte[] r15 = new byte[r1]
            r2.zzH(r15, r6, r1)
            r13 = r15
            goto L_0x0602
        L_0x0601:
            r13 = r1
        L_0x0602:
            r5.zzk = r0
            com.google.android.gms.internal.ads.zzajq r1 = new com.google.android.gms.internal.ads.zzajq
            r7 = 1
            r6 = r1
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            r5.zzm = r1
            goto L_0x061d
        L_0x060e:
            java.lang.String r0 = "Entry count in sgpd != 1 (unsupported)."
            com.google.android.gms.internal.ads.zzaz r0 = com.google.android.gms.internal.ads.zzaz.zzc(r0)
            throw r0
        L_0x0615:
            java.lang.String r0 = "Entry count in sbgp != 1 (unsupported)."
            com.google.android.gms.internal.ads.zzaz r0 = com.google.android.gms.internal.ads.zzaz.zzc(r0)
            throw r0
        L_0x061c:
            r0 = 1
        L_0x061d:
            int r1 = r4.size()
            r2 = 0
        L_0x0622:
            if (r2 >= r1) goto L_0x0658
            java.lang.Object r3 = r4.get(r2)
            com.google.android.gms.internal.ads.zzfd r3 = (com.google.android.gms.internal.ads.zzfd) r3
            int r6 = r3.zzd
            r7 = 1970628964(0x75756964, float:3.1109627E32)
            if (r6 != r7) goto L_0x064c
            com.google.android.gms.internal.ads.zzen r3 = r3.zza
            r6 = 8
            r3.zzL(r6)
            r8 = r29
            r7 = 0
            r9 = 16
            r3.zzH(r8, r7, r9)
            byte[] r10 = zza
            boolean r10 = java.util.Arrays.equals(r8, r10)
            if (r10 == 0) goto L_0x0653
            zzl(r3, r9, r5)
            goto L_0x0653
        L_0x064c:
            r8 = r29
            r6 = 8
            r7 = 0
            r9 = 16
        L_0x0653:
            int r2 = r2 + 1
            r29 = r8
            goto L_0x0622
        L_0x0658:
            r8 = r29
            r6 = 8
            r7 = 0
            r9 = 16
            goto L_0x0674
        L_0x0660:
            r27 = r1
            r45 = r2
            r28 = r3
            r20 = r7
            r22 = r8
            r6 = r9
            r30 = r10
            r0 = 1
        L_0x066e:
            r7 = 0
            r9 = 16
            r14 = 12
            r8 = r4
        L_0x0674:
            int r10 = r30 + 1
            r0 = r52
            r9 = r6
            r4 = r8
            r7 = r20
            r8 = r22
            r1 = r27
            r3 = r28
            r2 = r45
            goto L_0x0152
        L_0x0686:
            r27 = r1
            r2 = r3
            r7 = 0
            java.util.List r0 = r2.zzb
            com.google.android.gms.internal.ads.zzs r0 = zzj(r0)
            if (r0 == 0) goto L_0x06a7
            int r1 = r27.size()
            r2 = r7
        L_0x0697:
            if (r2 >= r1) goto L_0x06a7
            r3 = r27
            java.lang.Object r4 = r3.valueAt(r2)
            com.google.android.gms.internal.ads.zzajc r4 = (com.google.android.gms.internal.ads.zzajc) r4
            r4.zzj(r0)
            int r2 = r2 + 1
            goto L_0x0697
        L_0x06a7:
            r3 = r27
            r0 = r52
            long r1 = r0.zzz
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 == 0) goto L_0x0002
            int r1 = r3.size()
            r12 = r7
        L_0x06bb:
            if (r12 >= r1) goto L_0x06e3
            java.lang.Object r2 = r3.valueAt(r12)
            com.google.android.gms.internal.ads.zzajc r2 = (com.google.android.gms.internal.ads.zzajc) r2
            long r4 = r0.zzz
            int r6 = r2.zzf
        L_0x06c7:
            com.google.android.gms.internal.ads.zzajr r7 = r2.zzb
            int r8 = r7.zze
            if (r6 >= r8) goto L_0x06e0
            long[] r8 = r7.zzi
            r9 = r8[r6]
            int r8 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r8 > 0) goto L_0x06e0
            boolean[] r7 = r7.zzj
            boolean r7 = r7[r6]
            if (r7 == 0) goto L_0x06dd
            r2.zzi = r6
        L_0x06dd:
            int r6 = r6 + 1
            goto L_0x06c7
        L_0x06e0:
            int r12 = r12 + 1
            goto L_0x06bb
        L_0x06e3:
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.zzz = r4
            goto L_0x0002
        L_0x06ec:
            r2 = r3
            boolean r3 = r1.isEmpty()
            if (r3 != 0) goto L_0x0002
            java.lang.Object r1 = r1.peek()
            com.google.android.gms.internal.ads.zzfc r1 = (com.google.android.gms.internal.ads.zzfc) r1
            r1.zzc(r2)
            goto L_0x0002
        L_0x06fe:
            r52.zzk()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzajd.zzm(long):void");
    }

    private static final zzaiy zzn(SparseArray sparseArray, int i) {
        if (sparseArray.size() == 1) {
            return (zzaiy) sparseArray.valueAt(0);
        }
        zzaiy zzaiy = (zzaiy) sparseArray.get(i);
        zzaiy.getClass();
        zzaiy zzaiy2 = zzaiy;
        return zzaiy;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v108, resolved type: com.google.android.gms.internal.ads.zzajc} */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01e7, code lost:
        if ((r19 & com.google.common.base.Ascii.US) != 6) goto L_0x01e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01f5, code lost:
        if (com.google.android.gms.internal.ads.zzay.zzg(r11.zzk, "video/hevc") == false) goto L_0x0206;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01fd, code lost:
        if (((r19 & 126) >> 1) != 39) goto L_0x0206;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01ff, code lost:
        r9 = true;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:367:0x022b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01a6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zzb(com.google.android.gms.internal.ads.zzadw r28, com.google.android.gms.internal.ads.zzaer r29) throws java.io.IOException {
        /*
            r27 = this;
            r0 = r27
            r1 = r28
        L_0x0004:
            int r2 = r0.zzs
            r3 = 1701671783(0x656d7367, float:7.0083103E22)
            r5 = 2
            r6 = 1936286840(0x73696478, float:1.8491255E31)
            r7 = 0
            r8 = 8
            r9 = 1
            if (r2 == 0) goto L_0x050e
            java.lang.String r11 = "FragmentedMp4Extractor"
            if (r2 == r9) goto L_0x036c
            r12 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r3 = 3
            if (r2 == r5) goto L_0x0315
            com.google.android.gms.internal.ads.zzajc r2 = r0.zzC
            if (r2 != 0) goto L_0x0094
            android.util.SparseArray r2 = r0.zzf
            int r6 = r2.size()
            r13 = r12
            r15 = 0
            r12 = r7
        L_0x002c:
            if (r15 >= r6) goto L_0x0062
            java.lang.Object r16 = r2.valueAt(r15)
            r4 = r16
            com.google.android.gms.internal.ads.zzajc r4 = (com.google.android.gms.internal.ads.zzajc) r4
            boolean r16 = r4.zzm
            if (r16 != 0) goto L_0x0044
            int r5 = r4.zzf
            com.google.android.gms.internal.ads.zzajs r10 = r4.zzd
            int r10 = r10.zzb
            if (r5 == r10) goto L_0x005e
        L_0x0044:
            boolean r5 = r4.zzm
            if (r5 == 0) goto L_0x0053
            int r5 = r4.zzh
            com.google.android.gms.internal.ads.zzajr r10 = r4.zzb
            int r10 = r10.zzd
            if (r5 != r10) goto L_0x0053
            goto L_0x005e
        L_0x0053:
            long r18 = r4.zzd()
            int r5 = (r18 > r13 ? 1 : (r18 == r13 ? 0 : -1))
            if (r5 >= 0) goto L_0x005e
            r12 = r4
            r13 = r18
        L_0x005e:
            int r15 = r15 + 1
            r5 = 2
            goto L_0x002c
        L_0x0062:
            if (r12 != 0) goto L_0x007c
            long r2 = r0.zzx
            long r4 = r28.zzf()
            long r2 = r2 - r4
            int r2 = (int) r2
            if (r2 < 0) goto L_0x0075
            r1.zzk(r2)
            r27.zzk()
            goto L_0x0004
        L_0x0075:
            java.lang.String r1 = "Offset to end of mdat was negative."
            com.google.android.gms.internal.ads.zzaz r1 = com.google.android.gms.internal.ads.zzaz.zza(r1, r7)
            throw r1
        L_0x007c:
            long r4 = r12.zzd()
            long r13 = r28.zzf()
            long r4 = r4 - r13
            int r2 = (int) r4
            if (r2 >= 0) goto L_0x008e
            java.lang.String r2 = "Ignoring negative offset to sample data."
            com.google.android.gms.internal.ads.zzea.zzf(r11, r2)
            r2 = 0
        L_0x008e:
            r1.zzk(r2)
            r0.zzC = r12
            r2 = r12
        L_0x0094:
            int r4 = r0.zzs
            r5 = 6
            java.lang.String r6 = "video/hevc"
            java.lang.String r10 = "video/avc"
            r11 = 4
            if (r4 != r3) goto L_0x013e
            int r4 = r2.zzb()
            r0.zzD = r4
            com.google.android.gms.internal.ads.zzajs r4 = r2.zzd
            com.google.android.gms.internal.ads.zzajp r4 = r4.zza
            com.google.android.gms.internal.ads.zzz r4 = r4.zzg
            java.lang.String r4 = r4.zzo
            boolean r12 = java.util.Objects.equals(r4, r10)
            if (r12 != 0) goto L_0x00b5
            java.util.Objects.equals(r4, r6)
        L_0x00b5:
            r0.zzG = r9
            int r4 = r2.zzf
            int r12 = r2.zzi
            if (r4 >= r12) goto L_0x00ef
            int r4 = r0.zzD
            r1.zzk(r4)
            com.google.android.gms.internal.ads.zzajq r1 = r2.zzf()
            if (r1 != 0) goto L_0x00c9
            goto L_0x00e4
        L_0x00c9:
            com.google.android.gms.internal.ads.zzajr r4 = r2.zzb
            com.google.android.gms.internal.ads.zzen r6 = r4.zzn
            int r1 = r1.zzd
            if (r1 == 0) goto L_0x00d4
            r6.zzM(r1)
        L_0x00d4:
            int r1 = r2.zzf
            boolean r1 = r4.zzb(r1)
            if (r1 == 0) goto L_0x00e4
            int r1 = r6.zzq()
            int r1 = r1 * r5
            r6.zzM(r1)
        L_0x00e4:
            boolean r1 = r2.zzl()
            if (r1 != 0) goto L_0x00ec
            r0.zzC = r7
        L_0x00ec:
            r1 = r3
            goto L_0x0311
        L_0x00ef:
            com.google.android.gms.internal.ads.zzajs r4 = r2.zzd
            com.google.android.gms.internal.ads.zzajp r4 = r4.zza
            int r4 = r4.zzh
            if (r4 != r9) goto L_0x0100
            int r4 = r0.zzD
            int r4 = r4 + -8
            r0.zzD = r4
            r1.zzk(r8)
        L_0x0100:
            com.google.android.gms.internal.ads.zzajs r4 = r2.zzd
            com.google.android.gms.internal.ads.zzajp r4 = r4.zza
            com.google.android.gms.internal.ads.zzz r4 = r4.zzg
            java.lang.String r8 = "audio/ac4"
            java.lang.String r4 = r4.zzo
            boolean r4 = r8.equals(r4)
            if (r4 == 0) goto L_0x012c
            int r4 = r0.zzD
            r8 = 7
            int r4 = r2.zzc(r4, r8)
            r0.zzE = r4
            int r4 = r0.zzD
            com.google.android.gms.internal.ads.zzen r12 = r0.zzk
            com.google.android.gms.internal.ads.zzacy.zzc(r4, r12)
            com.google.android.gms.internal.ads.zzafb r4 = r2.zza
            r4.zzr(r12, r8)
            int r4 = r0.zzE
            int r4 = r4 + r8
            r0.zzE = r4
            r8 = 0
            goto L_0x0135
        L_0x012c:
            int r4 = r0.zzD
            r8 = 0
            int r4 = r2.zzc(r4, r8)
            r0.zzE = r4
        L_0x0135:
            int r12 = r0.zzD
            int r12 = r12 + r4
            r0.zzD = r12
            r0.zzs = r11
            r0.zzF = r8
        L_0x013e:
            com.google.android.gms.internal.ads.zzajs r4 = r2.zzd
            com.google.android.gms.internal.ads.zzajp r4 = r4.zza
            com.google.android.gms.internal.ads.zzafb r8 = r2.zza
            long r12 = r2.zze()
            int r14 = r4.zzk
            if (r14 != 0) goto L_0x015e
        L_0x014c:
            int r4 = r0.zzE
            int r5 = r0.zzD
            if (r4 >= r5) goto L_0x02aa
            int r5 = r5 - r4
            r15 = 0
            int r4 = r8.zzf(r1, r5, r15)
            int r5 = r0.zzE
            int r5 = r5 + r4
            r0.zzE = r5
            goto L_0x014c
        L_0x015e:
            r15 = 0
            com.google.android.gms.internal.ads.zzen r3 = r0.zzh
            byte[] r7 = r3.zzN()
            r7[r15] = r15
            r7[r9] = r15
            r16 = 2
            r7[r16] = r15
            int r15 = 4 - r14
        L_0x016f:
            int r9 = r0.zzE
            int r5 = r0.zzD
            if (r9 >= r5) goto L_0x02aa
            int r5 = r0.zzF
            if (r5 != 0) goto L_0x0233
            com.google.android.gms.internal.ads.zzafb[] r5 = r0.zzK
            int r5 = r5.length
            if (r5 > 0) goto L_0x0182
            boolean r5 = r0.zzG
            if (r5 != 0) goto L_0x0193
        L_0x0182:
            com.google.android.gms.internal.ads.zzz r5 = r4.zzg
            int r5 = com.google.android.gms.internal.ads.zzfv.zzb(r5)
            int r9 = r14 + r5
            int r11 = r0.zzD
            r19 = r5
            int r5 = r0.zzE
            int r11 = r11 - r5
            if (r9 <= r11) goto L_0x0195
        L_0x0193:
            r5 = 0
            goto L_0x0197
        L_0x0195:
            r5 = r19
        L_0x0197:
            int r9 = r14 + r5
            r1.zzi(r7, r15, r9)
            r9 = 0
            r3.zzL(r9)
            int r11 = r3.zzg()
            if (r11 < 0) goto L_0x022b
            int r11 = r11 - r5
            r0.zzF = r11
            com.google.android.gms.internal.ads.zzen r11 = r0.zzg
            r11.zzL(r9)
            r9 = 4
            r8.zzr(r11, r9)
            int r11 = r0.zzE
            int r11 = r11 + r9
            r0.zzE = r11
            int r11 = r0.zzD
            int r11 = r11 + r15
            r0.zzD = r11
            com.google.android.gms.internal.ads.zzafb[] r11 = r0.zzK
            int r11 = r11.length
            if (r11 <= 0) goto L_0x0201
            if (r5 <= 0) goto L_0x0201
            com.google.android.gms.internal.ads.zzz r11 = r4.zzg
            byte r19 = r7[r9]
            byte[] r9 = com.google.android.gms.internal.ads.zzfv.zza
            java.lang.String r9 = r11.zzo
            boolean r20 = java.util.Objects.equals(r9, r10)
            if (r20 != 0) goto L_0x01e0
            r20 = r14
            java.lang.String r14 = r11.zzk
            boolean r14 = com.google.android.gms.internal.ads.zzay.zzg(r14, r10)
            if (r14 == 0) goto L_0x01dc
            goto L_0x01e2
        L_0x01dc:
            r21 = r10
            r10 = 6
            goto L_0x01e9
        L_0x01e0:
            r20 = r14
        L_0x01e2:
            r14 = r19 & 31
            r21 = r10
            r10 = 6
            if (r14 == r10) goto L_0x01ff
        L_0x01e9:
            boolean r9 = java.util.Objects.equals(r9, r6)
            if (r9 != 0) goto L_0x01f7
            java.lang.String r9 = r11.zzk
            boolean r9 = com.google.android.gms.internal.ads.zzay.zzg(r9, r6)
            if (r9 == 0) goto L_0x0206
        L_0x01f7:
            r9 = r19 & 126(0x7e, float:1.77E-43)
            r11 = 1
            int r9 = r9 >> r11
            r11 = 39
            if (r9 != r11) goto L_0x0206
        L_0x01ff:
            r9 = 1
            goto L_0x0207
        L_0x0201:
            r21 = r10
            r20 = r14
            r10 = 6
        L_0x0206:
            r9 = 0
        L_0x0207:
            r0.zzH = r9
            r8.zzr(r3, r5)
            int r9 = r0.zzE
            int r9 = r9 + r5
            r0.zzE = r9
            if (r5 <= 0) goto L_0x0223
            boolean r9 = r0.zzG
            if (r9 != 0) goto L_0x0223
            com.google.android.gms.internal.ads.zzz r9 = r4.zzg
            r11 = 4
            boolean r5 = com.google.android.gms.internal.ads.zzfv.zzj(r7, r11, r5, r9)
            if (r5 == 0) goto L_0x0223
            r5 = 1
            r0.zzG = r5
        L_0x0223:
            r5 = r10
            r14 = r20
            r10 = r21
            r11 = 4
            goto L_0x016f
        L_0x022b:
            java.lang.String r1 = "Invalid NAL length"
            r2 = 0
            com.google.android.gms.internal.ads.zzaz r1 = com.google.android.gms.internal.ads.zzaz.zza(r1, r2)
            throw r1
        L_0x0233:
            r21 = r10
            r20 = r14
            r10 = 6
            boolean r9 = r0.zzH
            if (r9 == 0) goto L_0x0293
            com.google.android.gms.internal.ads.zzen r9 = r0.zzi
            r9.zzI(r5)
            byte[] r5 = r9.zzN()
            int r11 = r0.zzF
            r14 = 0
            r1.zzi(r5, r14, r11)
            int r5 = r0.zzF
            r8.zzr(r9, r5)
            int r5 = r0.zzF
            byte[] r11 = r9.zzN()
            int r10 = r9.zzd()
            int r10 = com.google.android.gms.internal.ads.zzfv.zzc(r11, r10)
            r9.zzL(r14)
            r9.zzK(r10)
            com.google.android.gms.internal.ads.zzz r10 = r4.zzg
            int r10 = r10.zzq
            r11 = -1
            if (r10 != r11) goto L_0x0277
            com.google.android.gms.internal.ads.zzfz r10 = r0.zzp
            int r11 = r10.zza()
            if (r11 == 0) goto L_0x0282
            r10.zze(r14)
            goto L_0x0282
        L_0x0277:
            com.google.android.gms.internal.ads.zzfz r11 = r0.zzp
            int r14 = r11.zza()
            if (r14 == r10) goto L_0x0282
            r11.zze(r10)
        L_0x0282:
            com.google.android.gms.internal.ads.zzfz r10 = r0.zzp
            r10.zzb(r12, r9)
            int r9 = r2.zza()
            r11 = 4
            r9 = r9 & r11
            if (r9 == 0) goto L_0x0299
            r10.zzd()
            goto L_0x0299
        L_0x0293:
            r9 = 0
            r11 = 4
            int r5 = r8.zzf(r1, r5, r9)
        L_0x0299:
            int r9 = r0.zzE
            int r9 = r9 + r5
            r0.zzE = r9
            int r9 = r0.zzF
            int r9 = r9 - r5
            r0.zzF = r9
            r14 = r20
            r10 = r21
            r5 = 6
            goto L_0x016f
        L_0x02aa:
            int r1 = r2.zza()
            boolean r3 = r0.zzG
            if (r3 != 0) goto L_0x02b5
            r3 = 67108864(0x4000000, float:1.5046328E-36)
            r1 = r1 | r3
        L_0x02b5:
            r21 = r1
            com.google.android.gms.internal.ads.zzajq r1 = r2.zzf()
            if (r1 == 0) goto L_0x02c2
            com.google.android.gms.internal.ads.zzafa r1 = r1.zzc
            r24 = r1
            goto L_0x02c4
        L_0x02c2:
            r24 = 0
        L_0x02c4:
            int r1 = r0.zzD
            r23 = 0
            r18 = r8
            r19 = r12
            r22 = r1
            r18.zzt(r19, r21, r22, r23, r24)
        L_0x02d1:
            java.util.ArrayDeque r1 = r0.zzo
            boolean r3 = r1.isEmpty()
            if (r3 != 0) goto L_0x0307
            java.lang.Object r1 = r1.removeFirst()
            com.google.android.gms.internal.ads.zzajb r1 = (com.google.android.gms.internal.ads.zzajb) r1
            int r3 = r0.zzy
            int r11 = r1.zzc
            int r3 = r3 - r11
            r0.zzy = r3
            long r3 = r1.zza
            boolean r1 = r1.zzb
            if (r1 == 0) goto L_0x02ed
            long r3 = r3 + r12
        L_0x02ed:
            r14 = r3
            com.google.android.gms.internal.ads.zzafb[] r1 = r0.zzJ
            int r3 = r1.length
            r10 = 0
        L_0x02f2:
            if (r10 >= r3) goto L_0x02d1
            r4 = r1[r10]
            int r9 = r0.zzy
            r16 = 0
            r7 = 1
            r5 = r14
            r8 = r11
            r17 = r10
            r10 = r16
            r4.zzt(r5, r7, r8, r9, r10)
            int r10 = r17 + 1
            goto L_0x02f2
        L_0x0307:
            boolean r1 = r2.zzl()
            if (r1 != 0) goto L_0x0310
            r1 = 0
            r0.zzC = r1
        L_0x0310:
            r1 = 3
        L_0x0311:
            r0.zzs = r1
            r1 = 0
            return r1
        L_0x0315:
            android.util.SparseArray r2 = r0.zzf
            int r3 = r2.size()
            r4 = 0
            r5 = 0
        L_0x031d:
            if (r4 >= r3) goto L_0x033b
            java.lang.Object r6 = r2.valueAt(r4)
            com.google.android.gms.internal.ads.zzajc r6 = (com.google.android.gms.internal.ads.zzajc) r6
            com.google.android.gms.internal.ads.zzajr r6 = r6.zzb
            boolean r7 = r6.zzo
            if (r7 == 0) goto L_0x0338
            long r6 = r6.zzc
            int r8 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r8 >= 0) goto L_0x0338
            java.lang.Object r5 = r2.valueAt(r4)
            com.google.android.gms.internal.ads.zzajc r5 = (com.google.android.gms.internal.ads.zzajc) r5
            r12 = r6
        L_0x0338:
            int r4 = r4 + 1
            goto L_0x031d
        L_0x033b:
            if (r5 != 0) goto L_0x0342
            r2 = 3
            r0.zzs = r2
            goto L_0x0004
        L_0x0342:
            long r2 = r28.zzf()
            long r12 = r12 - r2
            int r2 = (int) r12
            if (r2 < 0) goto L_0x0364
            r1.zzk(r2)
            com.google.android.gms.internal.ads.zzajr r2 = r5.zzb
            com.google.android.gms.internal.ads.zzen r3 = r2.zzn
            byte[] r4 = r3.zzN()
            int r5 = r3.zzd()
            r6 = 0
            r1.zzi(r4, r6, r5)
            r3.zzL(r6)
            r2.zzo = r6
            goto L_0x0004
        L_0x0364:
            java.lang.String r1 = "Offset to encryption data was negative."
            r2 = 0
            com.google.android.gms.internal.ads.zzaz r1 = com.google.android.gms.internal.ads.zzaz.zza(r1, r2)
            throw r1
        L_0x036c:
            long r4 = r0.zzu
            int r2 = r0.zzv
            long r9 = (long) r2
            long r4 = r4 - r9
            com.google.android.gms.internal.ads.zzen r2 = r0.zzw
            int r4 = (int) r4
            if (r2 == 0) goto L_0x0502
            byte[] r5 = r2.zzN()
            r1.zzi(r5, r8, r4)
            com.google.android.gms.internal.ads.zzfd r4 = new com.google.android.gms.internal.ads.zzfd
            int r5 = r0.zzt
            r4.<init>(r5, r2)
            java.util.ArrayDeque r2 = r0.zzn
            boolean r5 = r2.isEmpty()
            if (r5 != 0) goto L_0x0398
            java.lang.Object r2 = r2.peek()
            com.google.android.gms.internal.ads.zzfc r2 = (com.google.android.gms.internal.ads.zzfc) r2
            r2.zzd(r4)
            goto L_0x0505
        L_0x0398:
            int r2 = r4.zzd
            if (r2 != r6) goto L_0x03cb
            com.google.android.gms.internal.ads.zzen r2 = r4.zza
            long r3 = r28.zzf()
            android.util.Pair r2 = zzh(r2, r3)
            com.google.android.gms.internal.ads.zzadj r3 = r0.zzq
            java.lang.Object r4 = r2.second
            com.google.android.gms.internal.ads.zzadi r4 = (com.google.android.gms.internal.ads.zzadi) r4
            r3.zzb(r4)
            boolean r3 = r0.zzL
            if (r3 != 0) goto L_0x0505
            java.lang.Object r3 = r2.first
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            r0.zzB = r3
            com.google.android.gms.internal.ads.zzady r3 = r0.zzI
            java.lang.Object r2 = r2.second
            com.google.android.gms.internal.ads.zzaeu r2 = (com.google.android.gms.internal.ads.zzaeu) r2
            r3.zzP(r2)
            r2 = 1
            r0.zzL = r2
            goto L_0x0505
        L_0x03cb:
            if (r2 != r3) goto L_0x0505
            com.google.android.gms.internal.ads.zzen r2 = r4.zza
            com.google.android.gms.internal.ads.zzafb[] r3 = r0.zzJ
            int r3 = r3.length
            if (r3 == 0) goto L_0x0505
            r2.zzL(r8)
            int r3 = r2.zzg()
            int r3 = com.google.android.gms.internal.ads.zzaix.zza(r3)
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r3 == 0) goto L_0x043f
            r6 = 1
            if (r3 == r6) goto L_0x03fc
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "Skipping unsupported emsg version: "
            r2.<init>(r4)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.google.android.gms.internal.ads.zzea.zzf(r11, r2)
            goto L_0x0505
        L_0x03fc:
            long r6 = r2.zzu()
            long r19 = r2.zzw()
            r21 = 1000000(0xf4240, double:4.940656E-318)
            java.math.RoundingMode r25 = java.math.RoundingMode.DOWN
            r23 = r6
            long r8 = com.google.android.gms.internal.ads.zzex.zzu(r19, r21, r23, r25)
            long r19 = r2.zzu()
            r21 = 1000(0x3e8, double:4.94E-321)
            java.math.RoundingMode r25 = java.math.RoundingMode.DOWN
            long r6 = com.google.android.gms.internal.ads.zzex.zzu(r19, r21, r23, r25)
            long r10 = r2.zzu()
            r3 = 0
            java.lang.String r12 = r2.zzy(r3)
            r12.getClass()
            r13 = r12
            java.lang.String r13 = (java.lang.String) r13
            java.lang.String r13 = r2.zzy(r3)
            r13.getClass()
            r14 = r13
            java.lang.String r14 = (java.lang.String) r14
            r22 = r6
            r24 = r10
            r20 = r12
            r21 = r13
            r13 = r8
            r8 = r4
            goto L_0x048b
        L_0x043f:
            r3 = 0
            java.lang.String r12 = r2.zzy(r3)
            r12.getClass()
            r6 = r12
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r13 = r2.zzy(r3)
            r13.getClass()
            r3 = r13
            java.lang.String r3 = (java.lang.String) r3
            long r6 = r2.zzu()
            long r19 = r2.zzu()
            r21 = 1000000(0xf4240, double:4.940656E-318)
            java.math.RoundingMode r25 = java.math.RoundingMode.DOWN
            r23 = r6
            long r8 = com.google.android.gms.internal.ads.zzex.zzu(r19, r21, r23, r25)
            long r10 = r0.zzB
            int r3 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r3 == 0) goto L_0x046f
            long r10 = r10 + r8
            goto L_0x0470
        L_0x046f:
            r10 = r4
        L_0x0470:
            long r19 = r2.zzu()
            r21 = 1000(0x3e8, double:4.94E-321)
            java.math.RoundingMode r25 = java.math.RoundingMode.DOWN
            r23 = r6
            long r6 = com.google.android.gms.internal.ads.zzex.zzu(r19, r21, r23, r25)
            long r14 = r2.zzu()
            r22 = r6
            r20 = r12
            r21 = r13
            r24 = r14
            r13 = r10
        L_0x048b:
            int r3 = r2.zza()
            byte[] r3 = new byte[r3]
            int r6 = r2.zza()
            r7 = 0
            r2.zzH(r3, r7, r6)
            com.google.android.gms.internal.ads.zzagr r2 = new com.google.android.gms.internal.ads.zzagr
            r19 = r2
            r26 = r3
            r19.<init>(r20, r21, r22, r24, r26)
            com.google.android.gms.internal.ads.zzags r3 = r0.zzl
            com.google.android.gms.internal.ads.zzen r6 = new com.google.android.gms.internal.ads.zzen
            byte[] r2 = r3.zza(r2)
            r6.<init>((byte[]) r2)
            int r2 = r6.zza()
            com.google.android.gms.internal.ads.zzafb[] r3 = r0.zzJ
            int r7 = r3.length
            r10 = 0
        L_0x04b5:
            if (r10 >= r7) goto L_0x04c3
            r11 = r3[r10]
            r12 = 0
            r6.zzL(r12)
            r11.zzr(r6, r2)
            int r10 = r10 + 1
            goto L_0x04b5
        L_0x04c3:
            int r3 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r3 != 0) goto L_0x04d8
            java.util.ArrayDeque r3 = r0.zzo
            com.google.android.gms.internal.ads.zzajb r4 = new com.google.android.gms.internal.ads.zzajb
            r5 = 1
            r4.<init>(r8, r5, r2)
            r3.addLast(r4)
            int r3 = r0.zzy
            int r3 = r3 + r2
            r0.zzy = r3
            goto L_0x0505
        L_0x04d8:
            java.util.ArrayDeque r3 = r0.zzo
            boolean r4 = r3.isEmpty()
            if (r4 != 0) goto L_0x04ef
            com.google.android.gms.internal.ads.zzajb r4 = new com.google.android.gms.internal.ads.zzajb
            r5 = 0
            r4.<init>(r13, r5, r2)
            r3.addLast(r4)
            int r3 = r0.zzy
            int r3 = r3 + r2
            r0.zzy = r3
            goto L_0x0505
        L_0x04ef:
            com.google.android.gms.internal.ads.zzafb[] r3 = r0.zzJ
            int r4 = r3.length
            r5 = 0
        L_0x04f3:
            if (r5 >= r4) goto L_0x0505
            r6 = r3[r5]
            r11 = 0
            r12 = 0
            r9 = 1
            r7 = r13
            r10 = r2
            r6.zzt(r7, r9, r10, r11, r12)
            int r5 = r5 + 1
            goto L_0x04f3
        L_0x0502:
            r1.zzk(r4)
        L_0x0505:
            long r2 = r28.zzf()
            r0.zzm(r2)
            goto L_0x0004
        L_0x050e:
            int r2 = r0.zzv
            r4 = 0
            r9 = -1
            if (r2 != 0) goto L_0x0558
            com.google.android.gms.internal.ads.zzen r2 = r0.zzm
            byte[] r7 = r2.zzN()
            r11 = 1
            r12 = 0
            boolean r7 = r1.zzn(r7, r12, r8, r11)
            if (r7 != 0) goto L_0x0543
            long r1 = r0.zzM
            int r1 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r1 == 0) goto L_0x053c
            r7 = r29
            r7.zza = r4
            r0.zzM = r9
            com.google.android.gms.internal.ads.zzady r1 = r0.zzI
            com.google.android.gms.internal.ads.zzadj r2 = r0.zzq
            com.google.android.gms.internal.ads.zzadi r2 = r2.zza()
            r1.zzP(r2)
            return r11
        L_0x053c:
            com.google.android.gms.internal.ads.zzfz r1 = r0.zzp
            r1.zzd()
            r1 = -1
            return r1
        L_0x0543:
            r7 = r29
            r0.zzv = r8
            r11 = 0
            r2.zzL(r11)
            long r11 = r2.zzu()
            r0.zzu = r11
            int r2 = r2.zzg()
            r0.zzt = r2
            goto L_0x055a
        L_0x0558:
            r7 = r29
        L_0x055a:
            long r11 = r0.zzu
            r13 = 1
            int r2 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r2 != 0) goto L_0x0577
            com.google.android.gms.internal.ads.zzen r2 = r0.zzm
            byte[] r4 = r2.zzN()
            r1.zzi(r4, r8, r8)
            int r4 = r0.zzv
            int r4 = r4 + r8
            r0.zzv = r4
            long r4 = r2.zzw()
            r0.zzu = r4
            goto L_0x05a4
        L_0x0577:
            int r2 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r2 != 0) goto L_0x05a4
            long r4 = r28.zzd()
            int r2 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r2 != 0) goto L_0x0595
            java.util.ArrayDeque r2 = r0.zzn
            boolean r4 = r2.isEmpty()
            if (r4 != 0) goto L_0x0594
            java.lang.Object r2 = r2.peek()
            com.google.android.gms.internal.ads.zzfc r2 = (com.google.android.gms.internal.ads.zzfc) r2
            long r4 = r2.zza
            goto L_0x0595
        L_0x0594:
            r4 = r9
        L_0x0595:
            int r2 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r2 == 0) goto L_0x05a4
            long r11 = r28.zzf()
            long r4 = r4 - r11
            int r2 = r0.zzv
            long r11 = (long) r2
            long r4 = r4 + r11
            r0.zzu = r4
        L_0x05a4:
            long r4 = r0.zzu
            int r2 = r0.zzv
            long r11 = (long) r2
            int r2 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r2 < 0) goto L_0x0775
            long r13 = r0.zzM
            int r2 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r2 == 0) goto L_0x05fd
            int r2 = r0.zzt
            if (r2 != r6) goto L_0x05f2
            com.google.android.gms.internal.ads.zzen r2 = r0.zzk
            int r3 = (int) r4
            r2.zzI(r3)
            com.google.android.gms.internal.ads.zzen r3 = r0.zzm
            byte[] r3 = r3.zzN()
            byte[] r4 = r2.zzN()
            r5 = 0
            java.lang.System.arraycopy(r3, r5, r4, r5, r8)
            byte[] r3 = r2.zzN()
            long r4 = r0.zzu
            int r9 = r0.zzv
            long r9 = (long) r9
            long r4 = r4 - r9
            int r4 = (int) r4
            r1.zzi(r3, r8, r4)
            com.google.android.gms.internal.ads.zzfd r3 = new com.google.android.gms.internal.ads.zzfd
            r3.<init>(r6, r2)
            com.google.android.gms.internal.ads.zzen r2 = r3.zza
            long r3 = r28.zze()
            android.util.Pair r2 = zzh(r2, r3)
            com.google.android.gms.internal.ads.zzadj r3 = r0.zzq
            java.lang.Object r2 = r2.second
            com.google.android.gms.internal.ads.zzadi r2 = (com.google.android.gms.internal.ads.zzadi) r2
            r3.zzb(r2)
            goto L_0x05f8
        L_0x05f2:
            long r4 = r4 - r11
            int r2 = (int) r4
            r3 = 1
            r1.zzo(r2, r3)
        L_0x05f8:
            r27.zzk()
            goto L_0x0004
        L_0x05fd:
            long r4 = r28.zzf()
            long r4 = r4 - r11
            int r2 = r0.zzt
            r9 = 1835295092(0x6d646174, float:4.4175247E27)
            r10 = 1836019558(0x6d6f6f66, float:4.6313494E27)
            if (r2 == r10) goto L_0x060e
            if (r2 != r9) goto L_0x0621
        L_0x060e:
            boolean r2 = r0.zzL
            if (r2 != 0) goto L_0x0621
            com.google.android.gms.internal.ads.zzady r2 = r0.zzI
            com.google.android.gms.internal.ads.zzaet r11 = new com.google.android.gms.internal.ads.zzaet
            long r12 = r0.zzA
            r11.<init>(r12, r4)
            r2.zzP(r11)
            r2 = 1
            r0.zzL = r2
        L_0x0621:
            int r2 = r0.zzt
            if (r2 != r10) goto L_0x063d
            android.util.SparseArray r2 = r0.zzf
            int r11 = r2.size()
            r12 = 0
        L_0x062c:
            if (r12 >= r11) goto L_0x063d
            java.lang.Object r13 = r2.valueAt(r12)
            com.google.android.gms.internal.ads.zzajc r13 = (com.google.android.gms.internal.ads.zzajc) r13
            com.google.android.gms.internal.ads.zzajr r13 = r13.zzb
            r13.zzc = r4
            r13.zzb = r4
            int r12 = r12 + 1
            goto L_0x062c
        L_0x063d:
            int r2 = r0.zzt
            if (r2 != r9) goto L_0x064e
            r9 = 0
            r0.zzC = r9
            long r2 = r0.zzu
            long r4 = r4 + r2
            r0.zzx = r4
            r2 = 2
            r0.zzs = r2
            goto L_0x0004
        L_0x064e:
            r4 = 1836019574(0x6d6f6f76, float:4.631354E27)
            if (r2 == r4) goto L_0x074e
            r4 = 1953653099(0x7472616b, float:7.681346E31)
            if (r2 == r4) goto L_0x074e
            r4 = 1835297121(0x6d646961, float:4.4181236E27)
            if (r2 == r4) goto L_0x074e
            r4 = 1835626086(0x6d696e66, float:4.515217E27)
            if (r2 == r4) goto L_0x074e
            r4 = 1937007212(0x7374626c, float:1.9362132E31)
            if (r2 == r4) goto L_0x074e
            if (r2 == r10) goto L_0x074e
            r4 = 1953653094(0x74726166, float:7.6813435E31)
            if (r2 == r4) goto L_0x074e
            r4 = 1836475768(0x6d766578, float:4.7659988E27)
            if (r2 == r4) goto L_0x074e
            r4 = 1701082227(0x65647473, float:6.742798E22)
            if (r2 != r4) goto L_0x067a
            goto L_0x074e
        L_0x067a:
            r4 = 1751411826(0x68646c72, float:4.3148E24)
            r9 = 2147483647(0x7fffffff, double:1.060997895E-314)
            if (r2 == r4) goto L_0x0719
            r4 = 1835296868(0x6d646864, float:4.418049E27)
            if (r2 == r4) goto L_0x0719
            r4 = 1836476516(0x6d766864, float:4.7662196E27)
            if (r2 == r4) goto L_0x0719
            if (r2 == r6) goto L_0x0719
            r4 = 1937011556(0x73747364, float:1.9367383E31)
            if (r2 == r4) goto L_0x0719
            r4 = 1937011827(0x73747473, float:1.9367711E31)
            if (r2 == r4) goto L_0x0719
            r4 = 1668576371(0x63747473, float:4.5093966E21)
            if (r2 == r4) goto L_0x0719
            r4 = 1937011555(0x73747363, float:1.9367382E31)
            if (r2 == r4) goto L_0x0719
            r4 = 1937011578(0x7374737a, float:1.936741E31)
            if (r2 == r4) goto L_0x0719
            r4 = 1937013298(0x73747a32, float:1.9369489E31)
            if (r2 == r4) goto L_0x0719
            r4 = 1937007471(0x7374636f, float:1.9362445E31)
            if (r2 == r4) goto L_0x0719
            r4 = 1668232756(0x636f3634, float:4.4126776E21)
            if (r2 == r4) goto L_0x0719
            r4 = 1937011571(0x73747373, float:1.9367401E31)
            if (r2 == r4) goto L_0x0719
            r4 = 1952867444(0x74666474, float:7.3014264E31)
            if (r2 == r4) goto L_0x0719
            r4 = 1952868452(0x74666864, float:7.301914E31)
            if (r2 == r4) goto L_0x0719
            r4 = 1953196132(0x746b6864, float:7.46037E31)
            if (r2 == r4) goto L_0x0719
            r4 = 1953654136(0x74726578, float:7.6818474E31)
            if (r2 == r4) goto L_0x0719
            r4 = 1953658222(0x7472756e, float:7.683823E31)
            if (r2 == r4) goto L_0x0719
            r4 = 1886614376(0x70737368, float:3.013775E29)
            if (r2 == r4) goto L_0x0719
            r4 = 1935763834(0x7361697a, float:1.785898E31)
            if (r2 == r4) goto L_0x0719
            r4 = 1935763823(0x7361696f, float:1.7858967E31)
            if (r2 == r4) goto L_0x0719
            r4 = 1936027235(0x73656e63, float:1.8177412E31)
            if (r2 == r4) goto L_0x0719
            r4 = 1970628964(0x75756964, float:3.1109627E32)
            if (r2 == r4) goto L_0x0719
            r4 = 1935828848(0x73626770, float:1.7937577E31)
            if (r2 == r4) goto L_0x0719
            r4 = 1936158820(0x73677064, float:1.8336489E31)
            if (r2 == r4) goto L_0x0719
            r4 = 1701606260(0x656c7374, float:6.9788014E22)
            if (r2 == r4) goto L_0x0719
            r4 = 1835362404(0x6d656864, float:4.4373917E27)
            if (r2 == r4) goto L_0x0719
            if (r2 != r3) goto L_0x0704
            goto L_0x0719
        L_0x0704:
            long r2 = r0.zzu
            int r2 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r2 > 0) goto L_0x0712
            r2 = 0
            r0.zzw = r2
            r2 = 1
            r0.zzs = r2
            goto L_0x0004
        L_0x0712:
            java.lang.String r1 = "Skipping atom with length > 2147483647 (unsupported)."
            com.google.android.gms.internal.ads.zzaz r1 = com.google.android.gms.internal.ads.zzaz.zzc(r1)
            throw r1
        L_0x0719:
            int r2 = r0.zzv
            if (r2 != r8) goto L_0x0747
            long r2 = r0.zzu
            int r2 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r2 > 0) goto L_0x0740
            com.google.android.gms.internal.ads.zzen r2 = new com.google.android.gms.internal.ads.zzen
            long r3 = r0.zzu
            int r3 = (int) r3
            r2.<init>((int) r3)
            com.google.android.gms.internal.ads.zzen r3 = r0.zzm
            byte[] r3 = r3.zzN()
            byte[] r4 = r2.zzN()
            r5 = 0
            java.lang.System.arraycopy(r3, r5, r4, r5, r8)
            r0.zzw = r2
            r2 = 1
            r0.zzs = r2
            goto L_0x0004
        L_0x0740:
            java.lang.String r1 = "Leaf atom with length > 2147483647 (unsupported)."
            com.google.android.gms.internal.ads.zzaz r1 = com.google.android.gms.internal.ads.zzaz.zzc(r1)
            throw r1
        L_0x0747:
            java.lang.String r1 = "Leaf atom defines extended atom size (unsupported)."
            com.google.android.gms.internal.ads.zzaz r1 = com.google.android.gms.internal.ads.zzaz.zzc(r1)
            throw r1
        L_0x074e:
            long r3 = r28.zzf()
            long r5 = r0.zzu
            long r3 = r3 + r5
            java.util.ArrayDeque r5 = r0.zzn
            com.google.android.gms.internal.ads.zzfc r6 = new com.google.android.gms.internal.ads.zzfc
            r8 = -8
            long r3 = r3 + r8
            r6.<init>(r2, r3)
            r5.push(r6)
            long r5 = r0.zzu
            int r2 = r0.zzv
            long r8 = (long) r2
            int r2 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r2 != 0) goto L_0x0770
            r0.zzm(r3)
            goto L_0x0004
        L_0x0770:
            r27.zzk()
            goto L_0x0004
        L_0x0775:
            java.lang.String r1 = "Atom size less than header length (unsupported)."
            com.google.android.gms.internal.ads.zzaz r1 = com.google.android.gms.internal.ads.zzaz.zzc(r1)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzajd.zzb(com.google.android.gms.internal.ads.zzadw, com.google.android.gms.internal.ads.zzaer):int");
    }

    public final /* synthetic */ zzadv zzc() {
        return this;
    }

    public final /* synthetic */ List zzd() {
        return this.zzr;
    }

    public final void zze(zzady zzady) {
        int i;
        int i2 = this.zzd;
        if ((i2 & 32) == 0) {
            zzady = new zzaku(zzady, this.zzc);
        }
        this.zzI = zzady;
        zzk();
        zzafb[] zzafbArr = new zzafb[2];
        this.zzJ = zzafbArr;
        int i3 = 100;
        int i4 = 0;
        if ((i2 & 4) != 0) {
            zzafbArr[0] = this.zzI.zzw(100, 5);
            i = 1;
            i3 = 101;
        } else {
            i = 0;
        }
        zzafb[] zzafbArr2 = (zzafb[]) zzex.zzQ(this.zzJ, i);
        this.zzJ = zzafbArr2;
        for (zzafb zzm2 : zzafbArr2) {
            zzm2.zzm(zzb);
        }
        List list = this.zze;
        this.zzK = new zzafb[list.size()];
        while (i4 < this.zzK.length) {
            zzafb zzw2 = this.zzI.zzw(i3, 3);
            zzw2.zzm((zzz) list.get(i4));
            this.zzK[i4] = zzw2;
            i4++;
            i3++;
        }
    }

    public final void zzf(long j, long j2) {
        SparseArray sparseArray = this.zzf;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            ((zzajc) sparseArray.valueAt(i)).zzi();
        }
        this.zzo.clear();
        this.zzy = 0;
        this.zzp.zzc();
        this.zzz = j2;
        this.zzn.clear();
        zzk();
    }

    public final boolean zzi(zzadw zzadw) throws IOException {
        zzaey zza2 = zzajo.zza(zzadw);
        this.zzr = zza2 != null ? zzfyq.zzo(zza2) : zzfyq.zzn();
        return zza2 == null;
    }

    public zzajd(zzakr zzakr, int i, zzeu zzeu, zzajp zzajp, List list, zzafb zzafb) {
        this.zzc = zzakr;
        this.zzd = i;
        this.zze = Collections.unmodifiableList(list);
        this.zzl = new zzags();
        this.zzm = new zzen(16);
        this.zzg = new zzen(zzfv.zza);
        this.zzh = new zzen(6);
        this.zzi = new zzen();
        byte[] bArr = new byte[16];
        this.zzj = bArr;
        this.zzk = new zzen(bArr);
        this.zzn = new ArrayDeque();
        this.zzo = new ArrayDeque();
        this.zzf = new SparseArray();
        this.zzr = zzfyq.zzn();
        this.zzA = -9223372036854775807L;
        this.zzz = -9223372036854775807L;
        this.zzB = -9223372036854775807L;
        this.zzI = zzady.zza;
        this.zzJ = new zzafb[0];
        this.zzK = new zzafb[0];
        this.zzp = new zzfz(new zzaja(this));
        this.zzq = new zzadj();
        this.zzM = -1;
    }
}
