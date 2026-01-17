package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import com.google.common.base.Ascii;
import java.io.IOException;
import java.util.List;
import kotlin.io.ConstantsKt;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzanz implements zzadv {
    private final zzeu zza = new zzeu(0);
    private final SparseArray zzb = new SparseArray();
    private final zzen zzc = new zzen((int) ConstantsKt.DEFAULT_BLOCK_SIZE);
    private final zzanx zzd = new zzanx();
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private long zzh;
    private zzanw zzi;
    private zzady zzj;
    private boolean zzk;

    /* JADX WARNING: Removed duplicated region for block: B:59:0x013b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zzb(com.google.android.gms.internal.ads.zzadw r17, com.google.android.gms.internal.ads.zzaer r18) throws java.io.IOException {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            com.google.android.gms.internal.ads.zzady r3 = r0.zzj
            com.google.android.gms.internal.ads.zzdd.zzb(r3)
            long r10 = r17.zzd()
            r12 = -1
            int r3 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r3 == 0) goto L_0x0023
            com.google.android.gms.internal.ads.zzanx r4 = r0.zzd
            boolean r5 = r4.zze()
            if (r5 == 0) goto L_0x001e
            goto L_0x0023
        L_0x001e:
            int r1 = r4.zza(r1, r2)
            return r1
        L_0x0023:
            boolean r4 = r0.zzk
            r14 = 1
            if (r4 != 0) goto L_0x0064
            r0.zzk = r14
            com.google.android.gms.internal.ads.zzanx r4 = r0.zzd
            long r5 = r4.zzb()
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 == 0) goto L_0x0054
            com.google.android.gms.internal.ads.zzanw r15 = new com.google.android.gms.internal.ads.zzanw
            com.google.android.gms.internal.ads.zzeu r5 = r4.zzd()
            long r6 = r4.zzb()
            r4 = r15
            r8 = r10
            r4.<init>(r5, r6, r8)
            r0.zzi = r15
            com.google.android.gms.internal.ads.zzady r4 = r0.zzj
            com.google.android.gms.internal.ads.zzaeu r5 = r15.zzb()
            r4.zzP(r5)
            goto L_0x0064
        L_0x0054:
            com.google.android.gms.internal.ads.zzady r5 = r0.zzj
            com.google.android.gms.internal.ads.zzaet r6 = new com.google.android.gms.internal.ads.zzaet
            long r7 = r4.zzb()
            r14 = 0
            r6.<init>(r7, r14)
            r5.zzP(r6)
        L_0x0064:
            com.google.android.gms.internal.ads.zzanw r5 = r0.zzi
            if (r5 == 0) goto L_0x0074
            boolean r6 = r5.zze()
            if (r6 != 0) goto L_0x006f
            goto L_0x0074
        L_0x006f:
            int r1 = r5.zza(r1, r2)
            return r1
        L_0x0074:
            r17.zzj()
            if (r3 == 0) goto L_0x007f
            long r2 = r17.zze()
            long r10 = r10 - r2
            goto L_0x0080
        L_0x007f:
            r10 = r12
        L_0x0080:
            int r2 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            r3 = -1
            if (r2 == 0) goto L_0x008d
            r5 = 4
            int r2 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r2 < 0) goto L_0x008c
            goto L_0x008d
        L_0x008c:
            return r3
        L_0x008d:
            com.google.android.gms.internal.ads.zzen r2 = r0.zzc
            byte[] r5 = r2.zzN()
            r6 = 4
            r7 = 0
            r4 = 1
            boolean r5 = r1.zzm(r5, r7, r6, r4)
            if (r5 != 0) goto L_0x009d
            return r3
        L_0x009d:
            r2.zzL(r7)
            int r5 = r2.zzg()
            r6 = 441(0x1b9, float:6.18E-43)
            if (r5 != r6) goto L_0x00a9
            return r3
        L_0x00a9:
            r3 = 442(0x1ba, float:6.2E-43)
            if (r5 != r3) goto L_0x00c7
            byte[] r3 = r2.zzN()
            r4 = 10
            r1.zzh(r3, r7, r4)
            r3 = 9
            r2.zzL(r3)
            int r2 = r2.zzm()
            r2 = r2 & 7
            int r2 = r2 + 14
            r1.zzk(r2)
            return r7
        L_0x00c7:
            r3 = 443(0x1bb, float:6.21E-43)
            r6 = 2
            r8 = 6
            if (r5 != r3) goto L_0x00e0
            byte[] r3 = r2.zzN()
            r1.zzh(r3, r7, r6)
            r2.zzL(r7)
            int r2 = r2.zzq()
            int r2 = r2 + r8
            r1.zzk(r2)
            return r7
        L_0x00e0:
            int r3 = r5 >> 8
            r4 = 1
            if (r3 == r4) goto L_0x00e9
            r1.zzk(r4)
            return r7
        L_0x00e9:
            r3 = r5 & 255(0xff, float:3.57E-43)
            android.util.SparseArray r9 = r0.zzb
            java.lang.Object r10 = r9.get(r3)
            com.google.android.gms.internal.ads.zzany r10 = (com.google.android.gms.internal.ads.zzany) r10
            boolean r11 = r0.zze
            if (r11 != 0) goto L_0x0173
            if (r10 != 0) goto L_0x0153
            r11 = 189(0xbd, float:2.65E-43)
            java.lang.String r12 = "video/mp2p"
            r13 = 0
            if (r3 != r11) goto L_0x0110
            com.google.android.gms.internal.ads.zzamr r5 = new com.google.android.gms.internal.ads.zzamr
            r5.<init>(r13, r7, r12)
            r4 = 1
            r0.zzf = r4
            long r11 = r17.zzf()
            r0.zzh = r11
        L_0x010e:
            r13 = r5
            goto L_0x0139
        L_0x0110:
            r4 = 1
            r11 = r5 & 224(0xe0, float:3.14E-43)
            r14 = 192(0xc0, float:2.69E-43)
            if (r11 != r14) goto L_0x0125
            com.google.android.gms.internal.ads.zzanl r5 = new com.google.android.gms.internal.ads.zzanl
            r5.<init>(r13, r7, r12)
            r0.zzf = r4
            long r11 = r17.zzf()
            r0.zzh = r11
            goto L_0x010e
        L_0x0125:
            r5 = r5 & 240(0xf0, float:3.36E-43)
            r11 = 224(0xe0, float:3.14E-43)
            if (r5 != r11) goto L_0x0139
            com.google.android.gms.internal.ads.zzanb r5 = new com.google.android.gms.internal.ads.zzanb
            r5.<init>(r13, r12)
            r0.zzg = r4
            long r11 = r17.zzf()
            r0.zzh = r11
            goto L_0x010e
        L_0x0139:
            if (r13 == 0) goto L_0x0153
            com.google.android.gms.internal.ads.zzaon r5 = new com.google.android.gms.internal.ads.zzaon
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            r11 = 256(0x100, float:3.59E-43)
            r5.<init>(r10, r3, r11)
            com.google.android.gms.internal.ads.zzady r10 = r0.zzj
            r13.zzb(r10, r5)
            com.google.android.gms.internal.ads.zzeu r5 = r0.zza
            com.google.android.gms.internal.ads.zzany r10 = new com.google.android.gms.internal.ads.zzany
            r10.<init>(r13, r5)
            r9.put(r3, r10)
        L_0x0153:
            boolean r3 = r0.zzf
            r11 = 1048576(0x100000, double:5.180654E-318)
            if (r3 == 0) goto L_0x0163
            boolean r3 = r0.zzg
            if (r3 == 0) goto L_0x0163
            long r11 = r0.zzh
            r13 = 8192(0x2000, double:4.0474E-320)
            long r11 = r11 + r13
        L_0x0163:
            long r13 = r17.zzf()
            int r3 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r3 <= 0) goto L_0x0173
            r3 = 1
            r0.zze = r3
            com.google.android.gms.internal.ads.zzady r3 = r0.zzj
            r3.zzG()
        L_0x0173:
            byte[] r3 = r2.zzN()
            r1.zzh(r3, r7, r6)
            r2.zzL(r7)
            int r3 = r2.zzq()
            int r3 = r3 + r8
            if (r10 != 0) goto L_0x0188
            r1.zzk(r3)
            goto L_0x019f
        L_0x0188:
            r2.zzI(r3)
            byte[] r4 = r2.zzN()
            r1.zzi(r4, r7, r3)
            r2.zzL(r8)
            r10.zza(r2)
            int r1 = r2.zzb()
            r2.zzK(r1)
        L_0x019f:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzanz.zzb(com.google.android.gms.internal.ads.zzadw, com.google.android.gms.internal.ads.zzaer):int");
    }

    public final /* synthetic */ zzadv zzc() {
        return this;
    }

    public final /* synthetic */ List zzd() {
        return zzfyq.zzn();
    }

    public final void zze(zzady zzady) {
        this.zzj = zzady;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001f, code lost:
        if (r0 != r7) goto L_0x0021;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0034 A[LOOP:0: B:12:0x002c->B:14:0x0034, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0040 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzf(long r5, long r7) {
        /*
            r4 = this;
            com.google.android.gms.internal.ads.zzeu r5 = r4.zza
            long r0 = r5.zzf()
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L_0x0021
            long r0 = r5.zzd()
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L_0x0024
            r2 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L_0x0024
            int r6 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r6 == 0) goto L_0x0024
        L_0x0021:
            r5.zzi(r7)
        L_0x0024:
            com.google.android.gms.internal.ads.zzanw r5 = r4.zzi
            r6 = 0
            if (r5 == 0) goto L_0x002c
            r5.zzd(r7)
        L_0x002c:
            android.util.SparseArray r5 = r4.zzb
            int r7 = r5.size()
            if (r6 >= r7) goto L_0x0040
            java.lang.Object r5 = r5.valueAt(r6)
            com.google.android.gms.internal.ads.zzany r5 = (com.google.android.gms.internal.ads.zzany) r5
            r5.zzb()
            int r6 = r6 + 1
            goto L_0x002c
        L_0x0040:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzanz.zzf(long, long):void");
    }

    public final boolean zzi(zzadw zzadw) throws IOException {
        byte[] bArr = new byte[14];
        zzadl zzadl = (zzadl) zzadw;
        zzadl.zzm(bArr, 0, 14, false);
        if ((((bArr[0] & 255) << Ascii.CAN) | ((bArr[1] & 255) << Ascii.DLE) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) != 442 || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        zzadl.zzl(bArr[13] & 7, false);
        zzadl.zzm(bArr, 0, 3, false);
        return ((((bArr[0] & 255) << Ascii.DLE) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255)) == 1;
    }
}
