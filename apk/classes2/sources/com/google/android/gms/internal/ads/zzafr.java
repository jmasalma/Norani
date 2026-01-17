package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzafr implements zzafj {
    public final zzfyq zza;
    private final int zzb;

    private zzafr(int i, zzfyq zzfyq) {
        this.zzb = i;
        this.zza = zzfyq;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.ads.zzafr zzc(int r13, com.google.android.gms.internal.ads.zzen r14) {
        /*
            com.google.android.gms.internal.ads.zzfyn r0 = new com.google.android.gms.internal.ads.zzfyn
            r0.<init>()
            int r1 = r14.zzd()
            r2 = -2
        L_0x000a:
            int r3 = r14.zza()
            r4 = 8
            if (r3 <= r4) goto L_0x0167
            int r3 = r14.zzi()
            int r4 = r14.zzi()
            int r5 = r14.zzc()
            int r5 = r5 + r4
            r14.zzK(r5)
            r4 = 1414744396(0x5453494c, float:3.62987127E12)
            if (r3 != r4) goto L_0x0031
            int r3 = r14.zzi()
            com.google.android.gms.internal.ads.zzafr r3 = zzc(r3, r14)
            goto L_0x014a
        L_0x0031:
            r4 = 0
            switch(r3) {
                case 1718776947: goto L_0x004a;
                case 1751742049: goto L_0x0044;
                case 1752331379: goto L_0x003e;
                case 1852994675: goto L_0x0038;
                default: goto L_0x0035;
            }
        L_0x0035:
            r3 = r4
            goto L_0x014a
        L_0x0038:
            com.google.android.gms.internal.ads.zzaft r3 = com.google.android.gms.internal.ads.zzaft.zzb(r14)
            goto L_0x014a
        L_0x003e:
            com.google.android.gms.internal.ads.zzafp r3 = com.google.android.gms.internal.ads.zzafp.zzd(r14)
            goto L_0x014a
        L_0x0044:
            com.google.android.gms.internal.ads.zzafo r3 = com.google.android.gms.internal.ads.zzafo.zzb(r14)
            goto L_0x014a
        L_0x004a:
            r3 = 2
            java.lang.String r6 = "StreamFormatChunk"
            if (r2 != r3) goto L_0x00a1
            r3 = 4
            r14.zzM(r3)
            int r7 = r14.zzi()
            int r8 = r14.zzi()
            r14.zzM(r3)
            int r3 = r14.zzi()
            switch(r3) {
                case 808802372: goto L_0x0073;
                case 826496577: goto L_0x0070;
                case 828601953: goto L_0x0070;
                case 842289229: goto L_0x006d;
                case 859066445: goto L_0x006a;
                case 875967048: goto L_0x0070;
                case 877677894: goto L_0x0073;
                case 1145656883: goto L_0x0073;
                case 1145656920: goto L_0x0073;
                case 1196444237: goto L_0x0067;
                case 1482049860: goto L_0x0073;
                case 1684633208: goto L_0x0073;
                case 1735420525: goto L_0x0067;
                case 2021026148: goto L_0x0073;
                default: goto L_0x0065;
            }
        L_0x0065:
            r9 = r4
            goto L_0x0075
        L_0x0067:
            java.lang.String r9 = "video/mjpeg"
            goto L_0x0075
        L_0x006a:
            java.lang.String r9 = "video/mp43"
            goto L_0x0075
        L_0x006d:
            java.lang.String r9 = "video/mp42"
            goto L_0x0075
        L_0x0070:
            java.lang.String r9 = "video/avc"
            goto L_0x0075
        L_0x0073:
            java.lang.String r9 = "video/mp4v-es"
        L_0x0075:
            if (r9 != 0) goto L_0x0089
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Ignoring track with unsupported compression "
            r7.<init>(r8)
            r7.append(r3)
            java.lang.String r3 = r7.toString()
            com.google.android.gms.internal.ads.zzea.zzf(r6, r3)
            goto L_0x0035
        L_0x0089:
            com.google.android.gms.internal.ads.zzx r3 = new com.google.android.gms.internal.ads.zzx
            r3.<init>()
            r3.zzam(r7)
            r3.zzQ(r8)
            r3.zzah(r9)
            com.google.android.gms.internal.ads.zzafs r4 = new com.google.android.gms.internal.ads.zzafs
            com.google.android.gms.internal.ads.zzz r3 = r3.zzan()
            r4.<init>(r3)
            goto L_0x0035
        L_0x00a1:
            r3 = 1
            if (r2 != r3) goto L_0x013b
            int r7 = r14.zzk()
            java.lang.String r8 = "audio/mp4a-latm"
            java.lang.String r9 = "audio/raw"
            if (r7 == r3) goto L_0x00cb
            r3 = 85
            if (r7 == r3) goto L_0x00c8
            r3 = 255(0xff, float:3.57E-43)
            if (r7 == r3) goto L_0x00c6
            r3 = 8192(0x2000, float:1.14794E-41)
            if (r7 == r3) goto L_0x00c3
            r3 = 8193(0x2001, float:1.1481E-41)
            if (r7 == r3) goto L_0x00c0
            r3 = r4
            goto L_0x00cc
        L_0x00c0:
            java.lang.String r3 = "audio/vnd.dts"
            goto L_0x00cc
        L_0x00c3:
            java.lang.String r3 = "audio/ac3"
            goto L_0x00cc
        L_0x00c6:
            r3 = r8
            goto L_0x00cc
        L_0x00c8:
            java.lang.String r3 = "audio/mpeg"
            goto L_0x00cc
        L_0x00cb:
            r3 = r9
        L_0x00cc:
            if (r3 != 0) goto L_0x00e1
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r8 = "Ignoring track with unsupported format tag "
            r3.<init>(r8)
            r3.append(r7)
            java.lang.String r3 = r3.toString()
            com.google.android.gms.internal.ads.zzea.zzf(r6, r3)
            goto L_0x0035
        L_0x00e1:
            int r4 = r14.zzk()
            int r6 = r14.zzi()
            r7 = 6
            r14.zzM(r7)
            int r7 = r14.zzk()
            java.nio.ByteOrder r10 = java.nio.ByteOrder.LITTLE_ENDIAN
            int r7 = com.google.android.gms.internal.ads.zzex.zzn(r7, r10)
            int r10 = r14.zza()
            r11 = 0
            if (r10 <= 0) goto L_0x0103
            int r10 = r14.zzk()
            goto L_0x0104
        L_0x0103:
            r10 = r11
        L_0x0104:
            com.google.android.gms.internal.ads.zzx r12 = new com.google.android.gms.internal.ads.zzx
            r12.<init>()
            r12.zzah(r3)
            r12.zzD(r4)
            r12.zzai(r6)
            boolean r4 = r3.equals(r9)
            if (r4 == 0) goto L_0x011d
            if (r7 == 0) goto L_0x011d
            r12.zzab(r7)
        L_0x011d:
            boolean r3 = r3.equals(r8)
            if (r3 == 0) goto L_0x0131
            if (r10 <= 0) goto L_0x0131
            byte[] r3 = new byte[r10]
            r14.zzH(r3, r11, r10)
            com.google.android.gms.internal.ads.zzfyq r3 = com.google.android.gms.internal.ads.zzfyq.zzo(r3)
            r12.zzT(r3)
        L_0x0131:
            com.google.android.gms.internal.ads.zzafs r3 = new com.google.android.gms.internal.ads.zzafs
            com.google.android.gms.internal.ads.zzz r4 = r12.zzan()
            r3.<init>(r4)
            goto L_0x014a
        L_0x013b:
            java.lang.String r3 = "Ignoring strf box for unsupported track type: "
            java.lang.String r7 = com.google.android.gms.internal.ads.zzex.zzD(r2)
            java.lang.String r3 = r3.concat(r7)
            com.google.android.gms.internal.ads.zzea.zzf(r6, r3)
            goto L_0x0035
        L_0x014a:
            if (r3 == 0) goto L_0x015f
            int r4 = r3.zza()
            r6 = 1752331379(0x68727473, float:4.5798432E24)
            if (r4 != r6) goto L_0x015c
            r2 = r3
            com.google.android.gms.internal.ads.zzafp r2 = (com.google.android.gms.internal.ads.zzafp) r2
            int r2 = r2.zzb()
        L_0x015c:
            r0.zzf(r3)
        L_0x015f:
            r14.zzL(r5)
            r14.zzK(r1)
            goto L_0x000a
        L_0x0167:
            com.google.android.gms.internal.ads.zzafr r14 = new com.google.android.gms.internal.ads.zzafr
            com.google.android.gms.internal.ads.zzfyq r0 = r0.zzi()
            r14.<init>(r13, r0)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzafr.zzc(int, com.google.android.gms.internal.ads.zzen):com.google.android.gms.internal.ads.zzafr");
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzafj zzb(Class cls) {
        zzfyq zzfyq = this.zza;
        int size = zzfyq.size();
        int i = 0;
        while (i < size) {
            zzafj zzafj = (zzafj) zzfyq.get(i);
            i++;
            if (zzafj.getClass() == cls) {
                return zzafj;
            }
        }
        return null;
    }
}
