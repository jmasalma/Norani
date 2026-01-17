package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayDeque;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzaht {
    private final byte[] zza = new byte[8];
    private final ArrayDeque zzb = new ArrayDeque();
    private final zzaia zzc = new zzaia();
    private zzahu zzd;
    private int zze;
    private int zzf;
    private long zzg;

    private final long zzd(zzadw zzadw, int i) throws IOException {
        byte[] bArr = this.zza;
        zzadw.zzi(bArr, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | ((long) (bArr[i2] & 255));
        }
        return j;
    }

    public final void zza(zzahu zzahu) {
        this.zzd = zzahu;
    }

    public final void zzb() {
        this.zze = 0;
        this.zzb.clear();
        this.zzc.zze();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008c, code lost:
        if (r1 == 1) goto L_0x008e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zzc(com.google.android.gms.internal.ads.zzadw r14) throws java.io.IOException {
        /*
            r13 = this;
            com.google.android.gms.internal.ads.zzahu r0 = r13.zzd
            com.google.android.gms.internal.ads.zzdd.zzb(r0)
        L_0x0005:
            java.util.ArrayDeque r0 = r13.zzb
            java.lang.Object r1 = r0.peek()
            com.google.android.gms.internal.ads.zzahr r1 = (com.google.android.gms.internal.ads.zzahr) r1
            r2 = 1
            if (r1 == 0) goto L_0x0031
            long r3 = r14.zzf()
            long r5 = r1.zzb
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 >= 0) goto L_0x001d
            goto L_0x0031
        L_0x001d:
            com.google.android.gms.internal.ads.zzahu r14 = r13.zzd
            java.lang.Object r0 = r0.pop()
            com.google.android.gms.internal.ads.zzahr r0 = (com.google.android.gms.internal.ads.zzahr) r0
            int r0 = r0.zza
            com.google.android.gms.internal.ads.zzahv r14 = (com.google.android.gms.internal.ads.zzahv) r14
            com.google.android.gms.internal.ads.zzahy r14 = r14.zza
            r14.zzj(r0)
            return r2
        L_0x0031:
            int r1 = r13.zze
            r3 = 4
            r4 = 0
            if (r1 != 0) goto L_0x008c
            com.google.android.gms.internal.ads.zzaia r1 = r13.zzc
            long r5 = r1.zzd(r14, r2, r4, r3)
            r7 = -2
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 != 0) goto L_0x007f
            r14.zzj()
        L_0x0046:
            byte[] r1 = r13.zza
            r14.zzh(r1, r4, r3)
            byte r5 = r1[r4]
            int r5 = com.google.android.gms.internal.ads.zzaia.zzb(r5)
            r6 = -1
            if (r5 == r6) goto L_0x007b
            if (r5 > r3) goto L_0x007b
            long r6 = com.google.android.gms.internal.ads.zzaia.zzc(r1, r5, r4)
            int r1 = (int) r6
            com.google.android.gms.internal.ads.zzahu r6 = r13.zzd
            com.google.android.gms.internal.ads.zzahv r6 = (com.google.android.gms.internal.ads.zzahv) r6
            com.google.android.gms.internal.ads.zzahy r6 = r6.zza
            r6 = 357149030(0x1549a966, float:4.072526E-26)
            if (r1 == r6) goto L_0x0076
            r6 = 524531317(0x1f43b675, float:4.144378E-20)
            if (r1 == r6) goto L_0x0076
            r6 = 475249515(0x1c53bb6b, float:7.0056276E-22)
            if (r1 == r6) goto L_0x0076
            r6 = 374648427(0x1654ae6b, float:1.718026E-25)
            if (r1 != r6) goto L_0x007b
            r1 = r6
        L_0x0076:
            r14.zzk(r5)
            long r5 = (long) r1
            goto L_0x007f
        L_0x007b:
            r14.zzk(r2)
            goto L_0x0046
        L_0x007f:
            r7 = -1
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 != 0) goto L_0x0086
            return r4
        L_0x0086:
            int r1 = (int) r5
            r13.zzf = r1
            r13.zze = r2
            goto L_0x008e
        L_0x008c:
            if (r1 != r2) goto L_0x009b
        L_0x008e:
            com.google.android.gms.internal.ads.zzaia r1 = r13.zzc
            r5 = 8
            long r5 = r1.zzd(r14, r4, r2, r5)
            r13.zzg = r5
            r1 = 2
            r13.zze = r1
        L_0x009b:
            com.google.android.gms.internal.ads.zzahu r1 = r13.zzd
            int r5 = r13.zzf
            com.google.android.gms.internal.ads.zzahv r1 = (com.google.android.gms.internal.ads.zzahv) r1
            com.google.android.gms.internal.ads.zzahy r1 = r1.zza
            r6 = 8
            r8 = 0
            switch(r5) {
                case 131: goto L_0x0151;
                case 134: goto L_0x0115;
                case 136: goto L_0x0151;
                case 155: goto L_0x0151;
                case 159: goto L_0x0151;
                case 160: goto L_0x00f4;
                case 161: goto L_0x00eb;
                case 163: goto L_0x00eb;
                case 165: goto L_0x00eb;
                case 166: goto L_0x00f4;
                case 174: goto L_0x00f4;
                case 176: goto L_0x0151;
                case 179: goto L_0x0151;
                case 181: goto L_0x00b3;
                case 183: goto L_0x00f4;
                case 186: goto L_0x0151;
                case 187: goto L_0x00f4;
                case 215: goto L_0x0151;
                case 224: goto L_0x00f4;
                case 225: goto L_0x00f4;
                case 231: goto L_0x0151;
                case 238: goto L_0x0151;
                case 241: goto L_0x0151;
                case 251: goto L_0x0151;
                case 16868: goto L_0x00f4;
                case 16871: goto L_0x0151;
                case 16877: goto L_0x00eb;
                case 16980: goto L_0x0151;
                case 16981: goto L_0x00eb;
                case 17026: goto L_0x0115;
                case 17029: goto L_0x0151;
                case 17143: goto L_0x0151;
                case 17545: goto L_0x00b3;
                case 18401: goto L_0x0151;
                case 18402: goto L_0x00eb;
                case 18407: goto L_0x00f4;
                case 18408: goto L_0x0151;
                case 19899: goto L_0x00f4;
                case 20529: goto L_0x0151;
                case 20530: goto L_0x0151;
                case 20532: goto L_0x00f4;
                case 20533: goto L_0x00f4;
                case 21358: goto L_0x0115;
                case 21419: goto L_0x00eb;
                case 21420: goto L_0x0151;
                case 21432: goto L_0x0151;
                case 21680: goto L_0x0151;
                case 21682: goto L_0x0151;
                case 21690: goto L_0x0151;
                case 21930: goto L_0x0151;
                case 21936: goto L_0x00f4;
                case 21938: goto L_0x0151;
                case 21945: goto L_0x0151;
                case 21946: goto L_0x0151;
                case 21947: goto L_0x0151;
                case 21948: goto L_0x0151;
                case 21949: goto L_0x0151;
                case 21968: goto L_0x00f4;
                case 21969: goto L_0x00b3;
                case 21970: goto L_0x00b3;
                case 21971: goto L_0x00b3;
                case 21972: goto L_0x00b3;
                case 21973: goto L_0x00b3;
                case 21974: goto L_0x00b3;
                case 21975: goto L_0x00b3;
                case 21976: goto L_0x00b3;
                case 21977: goto L_0x00b3;
                case 21978: goto L_0x00b3;
                case 21998: goto L_0x0151;
                case 22186: goto L_0x0151;
                case 22203: goto L_0x0151;
                case 25152: goto L_0x00f4;
                case 25188: goto L_0x0151;
                case 25506: goto L_0x00eb;
                case 28032: goto L_0x00f4;
                case 30113: goto L_0x00f4;
                case 30114: goto L_0x0151;
                case 30320: goto L_0x00f4;
                case 30321: goto L_0x0151;
                case 30322: goto L_0x00eb;
                case 30323: goto L_0x00b3;
                case 30324: goto L_0x00b3;
                case 30325: goto L_0x00b3;
                case 2274716: goto L_0x0115;
                case 2352003: goto L_0x0151;
                case 2807729: goto L_0x0151;
                case 290298740: goto L_0x00f4;
                case 357149030: goto L_0x00f4;
                case 374648427: goto L_0x00f4;
                case 408125543: goto L_0x00f4;
                case 440786851: goto L_0x00f4;
                case 475249515: goto L_0x00f4;
                case 524531317: goto L_0x00f4;
                default: goto L_0x00a9;
            }
        L_0x00a9:
            long r0 = r13.zzg
            int r0 = (int) r0
            r14.zzk(r0)
            r13.zze = r4
            goto L_0x0005
        L_0x00b3:
            long r9 = r13.zzg
            r11 = 4
            int r0 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r0 == 0) goto L_0x00d3
            int r0 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x00c0
            goto L_0x00d3
        L_0x00c0:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r0 = "Invalid float size: "
            r14.<init>(r0)
            r14.append(r9)
            java.lang.String r14 = r14.toString()
            com.google.android.gms.internal.ads.zzaz r14 = com.google.android.gms.internal.ads.zzaz.zza(r14, r8)
            throw r14
        L_0x00d3:
            int r0 = (int) r9
            long r6 = r13.zzd(r14, r0)
            if (r0 != r3) goto L_0x00e1
            int r14 = (int) r6
            float r14 = java.lang.Float.intBitsToFloat(r14)
            double r6 = (double) r14
            goto L_0x00e5
        L_0x00e1:
            double r6 = java.lang.Double.longBitsToDouble(r6)
        L_0x00e5:
            r1.zzk(r5, r6)
            r13.zze = r4
            return r2
        L_0x00eb:
            long r6 = r13.zzg
            int r0 = (int) r6
            r1.zzh(r5, r0, r14)
            r13.zze = r4
            return r2
        L_0x00f4:
            long r9 = r14.zzf()
            long r6 = r13.zzg
            long r6 = r6 + r9
            com.google.android.gms.internal.ads.zzahr r14 = new com.google.android.gms.internal.ads.zzahr
            r14.<init>(r5, r6, r8)
            r0.push(r14)
            com.google.android.gms.internal.ads.zzahu r14 = r13.zzd
            int r7 = r13.zzf
            long r0 = r13.zzg
            com.google.android.gms.internal.ads.zzahv r14 = (com.google.android.gms.internal.ads.zzahv) r14
            com.google.android.gms.internal.ads.zzahy r6 = r14.zza
            r8 = r9
            r10 = r0
            r6.zzm(r7, r8, r10)
            r13.zze = r4
            return r2
        L_0x0115:
            long r6 = r13.zzg
            r9 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r0 > 0) goto L_0x013e
            int r0 = (int) r6
            if (r0 != 0) goto L_0x0124
            java.lang.String r14 = ""
            goto L_0x0138
        L_0x0124:
            byte[] r3 = new byte[r0]
            r14.zzi(r3, r4, r0)
        L_0x0129:
            if (r0 <= 0) goto L_0x0133
            int r14 = r0 + -1
            byte r6 = r3[r14]
            if (r6 != 0) goto L_0x0133
            r0 = r14
            goto L_0x0129
        L_0x0133:
            java.lang.String r14 = new java.lang.String
            r14.<init>(r3, r4, r0)
        L_0x0138:
            r1.zzn(r5, r14)
            r13.zze = r4
            return r2
        L_0x013e:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r0 = "String element size: "
            r14.<init>(r0)
            r14.append(r6)
            java.lang.String r14 = r14.toString()
            com.google.android.gms.internal.ads.zzaz r14 = com.google.android.gms.internal.ads.zzaz.zza(r14, r8)
            throw r14
        L_0x0151:
            long r9 = r13.zzg
            int r0 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r0 > 0) goto L_0x0162
            int r0 = (int) r9
            long r6 = r13.zzd(r14, r0)
            r1.zzl(r5, r6)
            r13.zze = r4
            return r2
        L_0x0162:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r0 = "Invalid integer size: "
            r14.<init>(r0)
            r14.append(r9)
            java.lang.String r14 = r14.toString()
            com.google.android.gms.internal.ads.zzaz r14 = com.google.android.gms.internal.ads.zzaz.zza(r14, r8)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaht.zzc(com.google.android.gms.internal.ads.zzadw):boolean");
    }
}
