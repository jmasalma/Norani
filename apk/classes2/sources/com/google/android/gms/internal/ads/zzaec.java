package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzaec {
    public static int zza(zzen zzen, int i) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return zzen.zzm() + 1;
            case 7:
                return zzen.zzq() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i - 8);
            default:
                return -1;
        }
    }

    public static long zzb(zzadw zzadw, zzaeg zzaeg) throws IOException {
        zzadw.zzj();
        zzadw.zzg(1);
        byte[] bArr = new byte[1];
        zzadw.zzh(bArr, 0, 1);
        byte b = bArr[0] & 1;
        boolean z = 1 == b;
        zzadw.zzg(2);
        int i = 1 != b ? 6 : 7;
        zzen zzen = new zzen(i);
        zzen.zzK(zzadz.zzb(zzadw, zzen.zzN(), 0, i));
        zzadw.zzj();
        zzaeb zzaeb = new zzaeb();
        if (zzd(zzen, zzaeg, z, zzaeb)) {
            return zzaeb.zza;
        }
        throw zzaz.zza((String) null, (Throwable) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007d, code lost:
        if (r3 != r1.zzf) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008a, code lost:
        if ((r21.zzm() * com.google.android.gms.internal.ads.zzbcj.zzq.zzf) == r5) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0099, code lost:
        if (r4 == r5) goto L_0x009b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean zzc(com.google.android.gms.internal.ads.zzen r21, com.google.android.gms.internal.ads.zzaeg r22, int r23, com.google.android.gms.internal.ads.zzaeb r24) {
        /*
            r0 = r21
            r1 = r22
            int r2 = r21.zzc()
            long r3 = r21.zzu()
            r5 = 16
            long r5 = r3 >>> r5
            r7 = r23
            long r7 = (long) r7
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            r8 = 0
            if (r7 == 0) goto L_0x0019
            return r8
        L_0x0019:
            r9 = 1
            long r5 = r5 & r9
            int r5 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            r6 = 1
            if (r5 != 0) goto L_0x0023
            r5 = r6
            goto L_0x0024
        L_0x0023:
            r5 = r8
        L_0x0024:
            r7 = 12
            long r11 = r3 >> r7
            r13 = 8
            long r13 = r3 >> r13
            r15 = 4
            long r15 = r3 >> r15
            long r17 = r3 >> r6
            long r3 = r3 & r9
            r19 = 15
            long r6 = r15 & r19
            int r6 = (int) r6
            r7 = 7
            r15 = -1
            if (r6 > r7) goto L_0x0041
            int r7 = r1.zzg
            int r7 = r7 + r15
            if (r6 != r7) goto L_0x00b0
            goto L_0x004a
        L_0x0041:
            r7 = 10
            if (r6 > r7) goto L_0x00b0
            int r6 = r1.zzg
            r7 = 2
            if (r6 != r7) goto L_0x00b0
        L_0x004a:
            r6 = 7
            long r6 = r17 & r6
            int r6 = (int) r6
            if (r6 != 0) goto L_0x0052
            goto L_0x0056
        L_0x0052:
            int r7 = r1.zzi
            if (r6 != r7) goto L_0x00b0
        L_0x0056:
            int r3 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r3 == 0) goto L_0x00b0
            r3 = r24
            boolean r3 = zzd(r0, r1, r5, r3)
            if (r3 == 0) goto L_0x00b0
            long r3 = r11 & r19
            int r3 = (int) r3
            int r3 = zza(r0, r3)
            if (r3 == r15) goto L_0x00b0
            int r4 = r1.zzb
            if (r3 > r4) goto L_0x00b0
            long r3 = r13 & r19
            int r5 = r1.zze
            int r3 = (int) r3
            if (r3 != 0) goto L_0x0077
            goto L_0x009b
        L_0x0077:
            r4 = 11
            if (r3 > r4) goto L_0x0080
            int r1 = r1.zzf
            if (r3 == r1) goto L_0x009b
            goto L_0x00b0
        L_0x0080:
            r1 = 12
            if (r3 != r1) goto L_0x008d
            int r1 = r21.zzm()
            int r1 = r1 * 1000
            if (r1 != r5) goto L_0x00b0
            goto L_0x009b
        L_0x008d:
            r1 = 14
            if (r3 > r1) goto L_0x00b0
            int r4 = r21.zzq()
            if (r3 != r1) goto L_0x0099
            int r4 = r4 * 10
        L_0x0099:
            if (r4 != r5) goto L_0x00b0
        L_0x009b:
            int r1 = r21.zzm()
            int r3 = r21.zzc()
            byte[] r0 = r21.zzN()
            int r3 = r3 + r15
            int r0 = com.google.android.gms.internal.ads.zzex.zzg(r0, r2, r3, r8)
            if (r1 != r0) goto L_0x00b0
            r0 = 1
            return r0
        L_0x00b0:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaec.zzc(com.google.android.gms.internal.ads.zzen, com.google.android.gms.internal.ads.zzaeg, int, com.google.android.gms.internal.ads.zzaeb):boolean");
    }

    private static boolean zzd(zzen zzen, zzaeg zzaeg, boolean z, zzaeb zzaeb) {
        try {
            long zzx = zzen.zzx();
            if (!z) {
                zzx *= (long) zzaeg.zzb;
            }
            zzaeb.zza = zzx;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
