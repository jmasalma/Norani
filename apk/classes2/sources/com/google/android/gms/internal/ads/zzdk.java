package com.google.android.gms.internal.ads;

import java.util.Locale;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdk {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb = {0, 0, 0, 1};
    private static final String[] zzc = {"", "A", "B", "C"};
    private static final Pattern zzd = Pattern.compile("^\\D?(\\d+)$");

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x02a3  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x02be  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x010c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair zza(com.google.android.gms.internal.ads.zzz r19) {
        /*
            r0 = r19
            java.lang.String r1 = r0.zzk
            if (r1 != 0) goto L_0x0009
        L_0x0006:
            r2 = 0
            goto L_0x0671
        L_0x0009:
            java.lang.String r3 = "\\."
            java.lang.String[] r3 = r1.split(r3)
            java.lang.String r4 = r0.zzo
            java.lang.String r5 = "video/dolby-vision"
            boolean r4 = r5.equals(r4)
            r7 = 512(0x200, float:7.175E-43)
            r8 = 256(0x100, float:3.59E-43)
            r9 = 128(0x80, float:1.794E-43)
            r10 = 64
            r11 = 32
            r13 = 16
            r14 = 8
            r15 = 3
            r2 = 4
            r5 = 2
            java.lang.String r12 = "CodecSpecificDataUtil"
            r6 = 1
            if (r4 == 0) goto L_0x01ea
            int r0 = r3.length
            if (r0 >= r15) goto L_0x003a
            java.lang.String r0 = "Ignoring malformed Dolby Vision codec string: "
            java.lang.String r0 = r0.concat(r1)
            com.google.android.gms.internal.ads.zzea.zzf(r12, r0)
            goto L_0x0006
        L_0x003a:
            java.util.regex.Pattern r0 = zzd
            r4 = r3[r6]
            java.util.regex.Matcher r0 = r0.matcher(r4)
            boolean r4 = r0.matches()
            if (r4 != 0) goto L_0x0052
            java.lang.String r0 = "Ignoring malformed Dolby Vision codec string: "
            java.lang.String r0 = r0.concat(r1)
            com.google.android.gms.internal.ads.zzea.zzf(r12, r0)
            goto L_0x0006
        L_0x0052:
            java.lang.String r0 = r0.group(r6)
            if (r0 != 0) goto L_0x005b
        L_0x0058:
            r1 = 0
            goto L_0x00fb
        L_0x005b:
            int r1 = r0.hashCode()
            r4 = 1567(0x61f, float:2.196E-42)
            if (r1 == r4) goto L_0x00ec
            switch(r1) {
                case 1536: goto L_0x00df;
                case 1537: goto L_0x00d2;
                case 1538: goto L_0x00c5;
                case 1539: goto L_0x00b8;
                case 1540: goto L_0x00ab;
                case 1541: goto L_0x009e;
                case 1542: goto L_0x0091;
                case 1543: goto L_0x0083;
                case 1544: goto L_0x0075;
                case 1545: goto L_0x0067;
                default: goto L_0x0066;
            }
        L_0x0066:
            goto L_0x0058
        L_0x0067:
            java.lang.String r1 = "09"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0058
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            goto L_0x00fb
        L_0x0075:
            java.lang.String r1 = "08"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0058
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            goto L_0x00fb
        L_0x0083:
            java.lang.String r1 = "07"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0058
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            goto L_0x00fb
        L_0x0091:
            java.lang.String r1 = "06"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0058
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            goto L_0x00fb
        L_0x009e:
            java.lang.String r1 = "05"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0058
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            goto L_0x00fb
        L_0x00ab:
            java.lang.String r1 = "04"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0058
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            goto L_0x00fb
        L_0x00b8:
            java.lang.String r1 = "03"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0058
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            goto L_0x00fb
        L_0x00c5:
            java.lang.String r1 = "02"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0058
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            goto L_0x00fb
        L_0x00d2:
            java.lang.String r1 = "01"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0058
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            goto L_0x00fb
        L_0x00df:
            java.lang.String r1 = "00"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0058
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            goto L_0x00fb
        L_0x00ec:
            java.lang.String r1 = "10"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0058
            r1 = 1024(0x400, float:1.435E-42)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            r1 = r4
        L_0x00fb:
            if (r1 != 0) goto L_0x010c
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Unknown Dolby Vision profile string: "
            java.lang.String r0 = r1.concat(r0)
            com.google.android.gms.internal.ads.zzea.zzf(r12, r0)
            goto L_0x0006
        L_0x010c:
            r0 = r3[r5]
            if (r0 != 0) goto L_0x0113
        L_0x0110:
            r2 = 0
            goto L_0x01d1
        L_0x0113:
            int r3 = r0.hashCode()
            switch(r3) {
                case 1537: goto L_0x01c5;
                case 1538: goto L_0x01b8;
                case 1539: goto L_0x01ab;
                case 1540: goto L_0x019e;
                case 1541: goto L_0x0191;
                case 1542: goto L_0x0184;
                case 1543: goto L_0x0177;
                case 1544: goto L_0x016a;
                case 1545: goto L_0x015c;
                default: goto L_0x011a;
            }
        L_0x011a:
            switch(r3) {
                case 1567: goto L_0x014e;
                case 1568: goto L_0x013e;
                case 1569: goto L_0x012e;
                case 1570: goto L_0x011e;
                default: goto L_0x011d;
            }
        L_0x011d:
            goto L_0x0110
        L_0x011e:
            java.lang.String r2 = "13"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x0110
            r4 = 4096(0x1000, float:5.74E-42)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            goto L_0x01d1
        L_0x012e:
            java.lang.String r2 = "12"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x0110
            r16 = 2048(0x800, float:2.87E-42)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r16)
            goto L_0x01d1
        L_0x013e:
            java.lang.String r2 = "11"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x0110
            r17 = 1024(0x400, float:1.435E-42)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r17)
            goto L_0x01d1
        L_0x014e:
            java.lang.String r2 = "10"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x0110
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            goto L_0x01d1
        L_0x015c:
            java.lang.String r2 = "09"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x0110
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)
            goto L_0x01d1
        L_0x016a:
            java.lang.String r2 = "08"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x0110
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)
            goto L_0x01d1
        L_0x0177:
            java.lang.String r2 = "07"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x0110
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)
            goto L_0x01d1
        L_0x0184:
            java.lang.String r2 = "06"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x0110
            java.lang.Integer r2 = java.lang.Integer.valueOf(r11)
            goto L_0x01d1
        L_0x0191:
            java.lang.String r2 = "05"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x0110
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
            goto L_0x01d1
        L_0x019e:
            java.lang.String r2 = "04"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x0110
            java.lang.Integer r2 = java.lang.Integer.valueOf(r14)
            goto L_0x01d1
        L_0x01ab:
            java.lang.String r3 = "03"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0110
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x01d1
        L_0x01b8:
            java.lang.String r2 = "02"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x0110
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            goto L_0x01d1
        L_0x01c5:
            java.lang.String r2 = "01"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x0110
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
        L_0x01d1:
            if (r2 != 0) goto L_0x01e2
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Unknown Dolby Vision level string: "
            java.lang.String r0 = r1.concat(r0)
            com.google.android.gms.internal.ads.zzea.zzf(r12, r0)
            goto L_0x0006
        L_0x01e2:
            android.util.Pair r0 = new android.util.Pair
            r0.<init>(r1, r2)
            r2 = r0
            goto L_0x0671
        L_0x01ea:
            r16 = 2048(0x800, float:2.87E-42)
            r17 = 1024(0x400, float:1.435E-42)
            r4 = 0
            r7 = r3[r4]
            int r18 = r7.hashCode()
            r8 = 6
            r9 = -1
            switch(r18) {
                case 2986313: goto L_0x024c;
                case 3004662: goto L_0x0242;
                case 3006243: goto L_0x0238;
                case 3006244: goto L_0x022e;
                case 3199032: goto L_0x0224;
                case 3214780: goto L_0x021a;
                case 3356560: goto L_0x0210;
                case 3475740: goto L_0x0206;
                case 3624515: goto L_0x01fc;
                default: goto L_0x01fa;
            }
        L_0x01fa:
            goto L_0x0256
        L_0x01fc:
            java.lang.String r10 = "vp09"
            boolean r7 = r7.equals(r10)
            if (r7 == 0) goto L_0x0256
            r7 = r15
            goto L_0x0257
        L_0x0206:
            java.lang.String r10 = "s263"
            boolean r7 = r7.equals(r10)
            if (r7 == 0) goto L_0x0256
            r7 = r4
            goto L_0x0257
        L_0x0210:
            java.lang.String r10 = "mp4a"
            boolean r7 = r7.equals(r10)
            if (r7 == 0) goto L_0x0256
            r7 = 7
            goto L_0x0257
        L_0x021a:
            java.lang.String r10 = "hvc1"
            boolean r7 = r7.equals(r10)
            if (r7 == 0) goto L_0x0256
            r7 = 5
            goto L_0x0257
        L_0x0224:
            java.lang.String r10 = "hev1"
            boolean r7 = r7.equals(r10)
            if (r7 == 0) goto L_0x0256
            r7 = r2
            goto L_0x0257
        L_0x022e:
            java.lang.String r10 = "avc2"
            boolean r7 = r7.equals(r10)
            if (r7 == 0) goto L_0x0256
            r7 = r5
            goto L_0x0257
        L_0x0238:
            java.lang.String r10 = "avc1"
            boolean r7 = r7.equals(r10)
            if (r7 == 0) goto L_0x0256
            r7 = r6
            goto L_0x0257
        L_0x0242:
            java.lang.String r10 = "av01"
            boolean r7 = r7.equals(r10)
            if (r7 == 0) goto L_0x0256
            r7 = r8
            goto L_0x0257
        L_0x024c:
            java.lang.String r10 = "ac-4"
            boolean r7 = r7.equals(r10)
            if (r7 == 0) goto L_0x0256
            r7 = r14
            goto L_0x0257
        L_0x0256:
            r7 = r9
        L_0x0257:
            r10 = 20
            switch(r7) {
                case 0: goto L_0x062d;
                case 1: goto L_0x0532;
                case 2: goto L_0x0532;
                case 3: goto L_0x0470;
                case 4: goto L_0x0467;
                case 5: goto L_0x0467;
                case 6: goto L_0x0382;
                case 7: goto L_0x0300;
                case 8: goto L_0x025e;
                default: goto L_0x025c;
            }
        L_0x025c:
            goto L_0x0006
        L_0x025e:
            int r0 = r3.length
            if (r0 == r2) goto L_0x026c
            java.lang.String r0 = "Ignoring malformed AC-4 codec string: "
            java.lang.String r0 = r0.concat(r1)
            com.google.android.gms.internal.ads.zzea.zzf(r12, r0)
            goto L_0x0006
        L_0x026c:
            r0 = r3[r6]     // Catch:{ NumberFormatException -> 0x02f5 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x02f5 }
            r7 = r3[r5]     // Catch:{ NumberFormatException -> 0x02f5 }
            int r7 = java.lang.Integer.parseInt(r7)     // Catch:{ NumberFormatException -> 0x02f5 }
            r3 = r3[r15]     // Catch:{ NumberFormatException -> 0x02f5 }
            int r1 = java.lang.Integer.parseInt(r3)     // Catch:{ NumberFormatException -> 0x02f5 }
            if (r0 == 0) goto L_0x029d
            if (r0 == r6) goto L_0x0293
            if (r0 == r5) goto L_0x0287
        L_0x0284:
            r4 = r7
            r3 = r9
            goto L_0x02a1
        L_0x0287:
            if (r7 != r6) goto L_0x028d
            r3 = 1026(0x402, float:1.438E-42)
        L_0x028b:
            r4 = r6
            goto L_0x02a1
        L_0x028d:
            if (r7 != r5) goto L_0x0284
            r3 = 1028(0x404, float:1.44E-42)
            r4 = r5
            goto L_0x02a1
        L_0x0293:
            if (r7 != 0) goto L_0x0298
            r3 = 513(0x201, float:7.19E-43)
            goto L_0x02a1
        L_0x0298:
            if (r7 != r6) goto L_0x0284
            r3 = 514(0x202, float:7.2E-43)
            goto L_0x028b
        L_0x029d:
            if (r7 != 0) goto L_0x0284
            r3 = 257(0x101, float:3.6E-43)
        L_0x02a1:
            if (r3 != r9) goto L_0x02be
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unknown AC-4 profile: "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = "."
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = r1.toString()
            com.google.android.gms.internal.ads.zzea.zzf(r12, r0)
            goto L_0x0006
        L_0x02be:
            if (r1 == 0) goto L_0x02d0
            if (r1 == r6) goto L_0x02ce
            if (r1 == r5) goto L_0x02cc
            if (r1 == r15) goto L_0x02ca
            if (r1 == r2) goto L_0x02d1
            r13 = r9
            goto L_0x02d1
        L_0x02ca:
            r13 = r14
            goto L_0x02d1
        L_0x02cc:
            r13 = r2
            goto L_0x02d1
        L_0x02ce:
            r13 = r5
            goto L_0x02d1
        L_0x02d0:
            r13 = r6
        L_0x02d1:
            if (r13 != r9) goto L_0x02e6
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Unknown AC-4 level: "
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.google.android.gms.internal.ads.zzea.zzf(r12, r0)
            goto L_0x0006
        L_0x02e6:
            android.util.Pair r2 = new android.util.Pair
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            r2.<init>(r0, r1)
            goto L_0x0671
        L_0x02f5:
            java.lang.String r0 = "Ignoring malformed AC-4 codec string: "
            java.lang.String r0 = r0.concat(r1)
            com.google.android.gms.internal.ads.zzea.zzf(r12, r0)
            goto L_0x0006
        L_0x0300:
            java.lang.String r0 = r0.zzk
            int r1 = r3.length
            if (r1 == r15) goto L_0x0314
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Ignoring malformed MP4A codec string: "
            java.lang.String r0 = r1.concat(r0)
            com.google.android.gms.internal.ads.zzea.zzf(r12, r0)
            goto L_0x0006
        L_0x0314:
            r1 = r3[r6]     // Catch:{ NumberFormatException -> 0x0373 }
            int r1 = java.lang.Integer.parseInt(r1, r13)     // Catch:{ NumberFormatException -> 0x0373 }
            java.lang.String r1 = com.google.android.gms.internal.ads.zzay.zzd(r1)     // Catch:{ NumberFormatException -> 0x0373 }
            java.lang.String r7 = "audio/mp4a-latm"
            boolean r1 = r7.equals(r1)     // Catch:{ NumberFormatException -> 0x0373 }
            if (r1 == 0) goto L_0x0006
            r1 = r3[r5]     // Catch:{ NumberFormatException -> 0x0373 }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x0373 }
            r3 = 17
            if (r1 == r3) goto L_0x035f
            if (r1 == r10) goto L_0x035d
            r3 = 23
            if (r1 == r3) goto L_0x035a
            r3 = 29
            if (r1 == r3) goto L_0x0357
            r3 = 39
            if (r1 == r3) goto L_0x0354
            r3 = 42
            if (r1 == r3) goto L_0x0351
            switch(r1) {
                case 1: goto L_0x034f;
                case 2: goto L_0x034d;
                case 3: goto L_0x0361;
                case 4: goto L_0x034b;
                case 5: goto L_0x0349;
                case 6: goto L_0x0347;
                default: goto L_0x0345;
            }     // Catch:{ NumberFormatException -> 0x0373 }
        L_0x0345:
            r15 = r9
            goto L_0x0361
        L_0x0347:
            r15 = r8
            goto L_0x0361
        L_0x0349:
            r15 = 5
            goto L_0x0361
        L_0x034b:
            r15 = r2
            goto L_0x0361
        L_0x034d:
            r15 = r5
            goto L_0x0361
        L_0x034f:
            r15 = r6
            goto L_0x0361
        L_0x0351:
            r15 = 42
            goto L_0x0361
        L_0x0354:
            r15 = 39
            goto L_0x0361
        L_0x0357:
            r15 = 29
            goto L_0x0361
        L_0x035a:
            r15 = 23
            goto L_0x0361
        L_0x035d:
            r15 = r10
            goto L_0x0361
        L_0x035f:
            r15 = 17
        L_0x0361:
            if (r15 == r9) goto L_0x0006
            android.util.Pair r1 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x0373 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r15)     // Catch:{ NumberFormatException -> 0x0373 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)     // Catch:{ NumberFormatException -> 0x0373 }
            r1.<init>(r2, r3)     // Catch:{ NumberFormatException -> 0x0373 }
            r2 = r1
            goto L_0x0671
        L_0x0373:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Ignoring malformed MP4A codec string: "
            java.lang.String r0 = r1.concat(r0)
            com.google.android.gms.internal.ads.zzea.zzf(r12, r0)
            goto L_0x0006
        L_0x0382:
            java.lang.String r1 = r0.zzk
            com.google.android.gms.internal.ads.zzk r0 = r0.zzE
            int r7 = r3.length
            if (r7 >= r2) goto L_0x0398
            java.lang.String r0 = java.lang.String.valueOf(r1)
            java.lang.String r1 = "Ignoring malformed AV1 codec string: "
            java.lang.String r0 = r1.concat(r0)
            com.google.android.gms.internal.ads.zzea.zzf(r12, r0)
            goto L_0x0006
        L_0x0398:
            r7 = r3[r6]     // Catch:{ NumberFormatException -> 0x0458 }
            int r7 = java.lang.Integer.parseInt(r7)     // Catch:{ NumberFormatException -> 0x0458 }
            r10 = r3[r5]     // Catch:{ NumberFormatException -> 0x0458 }
            java.lang.String r4 = r10.substring(r4, r5)     // Catch:{ NumberFormatException -> 0x0458 }
            int r4 = java.lang.Integer.parseInt(r4)     // Catch:{ NumberFormatException -> 0x0458 }
            r3 = r3[r15]     // Catch:{ NumberFormatException -> 0x0458 }
            int r1 = java.lang.Integer.parseInt(r3)     // Catch:{ NumberFormatException -> 0x0458 }
            if (r7 == 0) goto L_0x03c3
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unknown AV1 profile: "
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            com.google.android.gms.internal.ads.zzea.zzf(r12, r0)
            goto L_0x0006
        L_0x03c3:
            if (r1 == r14) goto L_0x03ee
            r3 = 10
            if (r1 == r3) goto L_0x03dc
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Unknown AV1 bit depth: "
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.google.android.gms.internal.ads.zzea.zzf(r12, r0)
            goto L_0x0006
        L_0x03dc:
            if (r0 == 0) goto L_0x03ec
            byte[] r1 = r0.zze
            if (r1 != 0) goto L_0x03e9
            int r0 = r0.zzd
            r1 = 7
            if (r0 == r1) goto L_0x03e9
            if (r0 != r8) goto L_0x03ec
        L_0x03e9:
            r0 = 4096(0x1000, float:5.74E-42)
            goto L_0x03ef
        L_0x03ec:
            r0 = r5
            goto L_0x03ef
        L_0x03ee:
            r0 = r6
        L_0x03ef:
            switch(r4) {
                case 0: goto L_0x0433;
                case 1: goto L_0x0434;
                case 2: goto L_0x0431;
                case 3: goto L_0x042f;
                case 4: goto L_0x042d;
                case 5: goto L_0x042b;
                case 6: goto L_0x0428;
                case 7: goto L_0x0425;
                case 8: goto L_0x0422;
                case 9: goto L_0x041f;
                case 10: goto L_0x041c;
                case 11: goto L_0x0419;
                case 12: goto L_0x0416;
                case 13: goto L_0x0413;
                case 14: goto L_0x0410;
                case 15: goto L_0x040c;
                case 16: goto L_0x0409;
                case 17: goto L_0x0406;
                case 18: goto L_0x0403;
                case 19: goto L_0x0400;
                case 20: goto L_0x03fd;
                case 21: goto L_0x03fa;
                case 22: goto L_0x03f7;
                case 23: goto L_0x03f4;
                default: goto L_0x03f2;
            }
        L_0x03f2:
            r5 = r9
            goto L_0x0434
        L_0x03f4:
            r5 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0434
        L_0x03f7:
            r5 = 4194304(0x400000, float:5.877472E-39)
            goto L_0x0434
        L_0x03fa:
            r5 = 2097152(0x200000, float:2.938736E-39)
            goto L_0x0434
        L_0x03fd:
            r5 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x0434
        L_0x0400:
            r5 = 524288(0x80000, float:7.34684E-40)
            goto L_0x0434
        L_0x0403:
            r5 = 262144(0x40000, float:3.67342E-40)
            goto L_0x0434
        L_0x0406:
            r5 = 131072(0x20000, float:1.83671E-40)
            goto L_0x0434
        L_0x0409:
            r5 = 65536(0x10000, float:9.18355E-41)
            goto L_0x0434
        L_0x040c:
            r5 = 32768(0x8000, float:4.5918E-41)
            goto L_0x0434
        L_0x0410:
            r5 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0434
        L_0x0413:
            r5 = 8192(0x2000, float:1.14794E-41)
            goto L_0x0434
        L_0x0416:
            r5 = 4096(0x1000, float:5.74E-42)
            goto L_0x0434
        L_0x0419:
            r5 = r16
            goto L_0x0434
        L_0x041c:
            r5 = r17
            goto L_0x0434
        L_0x041f:
            r5 = 512(0x200, float:7.175E-43)
            goto L_0x0434
        L_0x0422:
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x0434
        L_0x0425:
            r5 = 128(0x80, float:1.794E-43)
            goto L_0x0434
        L_0x0428:
            r5 = 64
            goto L_0x0434
        L_0x042b:
            r5 = r11
            goto L_0x0434
        L_0x042d:
            r5 = r13
            goto L_0x0434
        L_0x042f:
            r5 = r14
            goto L_0x0434
        L_0x0431:
            r5 = r2
            goto L_0x0434
        L_0x0433:
            r5 = r6
        L_0x0434:
            if (r5 != r9) goto L_0x0449
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unknown AV1 level: "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.google.android.gms.internal.ads.zzea.zzf(r12, r0)
            goto L_0x0006
        L_0x0449:
            android.util.Pair r2 = new android.util.Pair
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            r2.<init>(r0, r1)
            goto L_0x0671
        L_0x0458:
            java.lang.String r0 = java.lang.String.valueOf(r1)
            java.lang.String r1 = "Ignoring malformed AV1 codec string: "
            java.lang.String r0 = r1.concat(r0)
            com.google.android.gms.internal.ads.zzea.zzf(r12, r0)
            goto L_0x0006
        L_0x0467:
            java.lang.String r1 = r0.zzk
            com.google.android.gms.internal.ads.zzk r0 = r0.zzE
            android.util.Pair r0 = zzb(r1, r3, r0)
            return r0
        L_0x0470:
            java.lang.String r0 = r0.zzk
            int r1 = r3.length
            if (r1 >= r15) goto L_0x0484
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Ignoring malformed VP9 codec string: "
            java.lang.String r0 = r1.concat(r0)
            com.google.android.gms.internal.ads.zzea.zzf(r12, r0)
            goto L_0x0006
        L_0x0484:
            r1 = r3[r6]     // Catch:{ NumberFormatException -> 0x0523 }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x0523 }
            r3 = r3[r5]     // Catch:{ NumberFormatException -> 0x0523 }
            int r0 = java.lang.Integer.parseInt(r3)     // Catch:{ NumberFormatException -> 0x0523 }
            if (r1 == 0) goto L_0x04a0
            if (r1 == r6) goto L_0x049e
            if (r1 == r5) goto L_0x049c
            if (r1 == r15) goto L_0x049a
            r3 = r9
            goto L_0x04a1
        L_0x049a:
            r3 = r14
            goto L_0x04a1
        L_0x049c:
            r3 = r2
            goto L_0x04a1
        L_0x049e:
            r3 = r5
            goto L_0x04a1
        L_0x04a0:
            r3 = r6
        L_0x04a1:
            if (r3 != r9) goto L_0x04b6
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Unknown VP9 profile: "
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.google.android.gms.internal.ads.zzea.zzf(r12, r0)
            goto L_0x0006
        L_0x04b6:
            r1 = 10
            if (r0 == r1) goto L_0x04fe
            r1 = 11
            if (r0 == r1) goto L_0x04ff
            if (r0 == r10) goto L_0x04fc
            r1 = 21
            if (r0 == r1) goto L_0x04fa
            r1 = 30
            if (r0 == r1) goto L_0x04f8
            r1 = 31
            if (r0 == r1) goto L_0x04f6
            r1 = 40
            if (r0 == r1) goto L_0x04f3
            r1 = 41
            if (r0 == r1) goto L_0x04f0
            r1 = 50
            if (r0 == r1) goto L_0x04ed
            r1 = 51
            if (r0 == r1) goto L_0x04ea
            switch(r0) {
                case 60: goto L_0x04e7;
                case 61: goto L_0x04e4;
                case 62: goto L_0x04e1;
                default: goto L_0x04df;
            }
        L_0x04df:
            r5 = r9
            goto L_0x04ff
        L_0x04e1:
            r5 = 8192(0x2000, float:1.14794E-41)
            goto L_0x04ff
        L_0x04e4:
            r5 = 4096(0x1000, float:5.74E-42)
            goto L_0x04ff
        L_0x04e7:
            r5 = r16
            goto L_0x04ff
        L_0x04ea:
            r5 = 512(0x200, float:7.175E-43)
            goto L_0x04ff
        L_0x04ed:
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x04ff
        L_0x04f0:
            r5 = 128(0x80, float:1.794E-43)
            goto L_0x04ff
        L_0x04f3:
            r5 = 64
            goto L_0x04ff
        L_0x04f6:
            r5 = r11
            goto L_0x04ff
        L_0x04f8:
            r5 = r13
            goto L_0x04ff
        L_0x04fa:
            r5 = r14
            goto L_0x04ff
        L_0x04fc:
            r5 = r2
            goto L_0x04ff
        L_0x04fe:
            r5 = r6
        L_0x04ff:
            if (r5 != r9) goto L_0x0514
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unknown VP9 level: "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.google.android.gms.internal.ads.zzea.zzf(r12, r0)
            goto L_0x0006
        L_0x0514:
            android.util.Pair r2 = new android.util.Pair
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            r2.<init>(r0, r1)
            goto L_0x0671
        L_0x0523:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Ignoring malformed VP9 codec string: "
            java.lang.String r0 = r1.concat(r0)
            com.google.android.gms.internal.ads.zzea.zzf(r12, r0)
            goto L_0x0006
        L_0x0532:
            java.lang.String r0 = r0.zzk
            int r1 = r3.length
            java.lang.String r7 = "Ignoring malformed AVC codec string: "
            if (r1 >= r5) goto L_0x0546
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r0 = r7.concat(r0)
            com.google.android.gms.internal.ads.zzea.zzf(r12, r0)
            goto L_0x0006
        L_0x0546:
            r10 = r3[r6]     // Catch:{ NumberFormatException -> 0x0620 }
            int r10 = r10.length()     // Catch:{ NumberFormatException -> 0x0620 }
            if (r10 != r8) goto L_0x0563
            r1 = r3[r6]     // Catch:{ NumberFormatException -> 0x0620 }
            java.lang.String r1 = r1.substring(r4, r5)     // Catch:{ NumberFormatException -> 0x0620 }
            int r1 = java.lang.Integer.parseInt(r1, r13)     // Catch:{ NumberFormatException -> 0x0620 }
            r3 = r3[r6]     // Catch:{ NumberFormatException -> 0x0620 }
            java.lang.String r3 = r3.substring(r2)     // Catch:{ NumberFormatException -> 0x0620 }
            int r0 = java.lang.Integer.parseInt(r3, r13)     // Catch:{ NumberFormatException -> 0x0620 }
            goto L_0x0571
        L_0x0563:
            if (r1 < r15) goto L_0x060f
            r1 = r3[r6]     // Catch:{ NumberFormatException -> 0x0620 }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x0620 }
            r3 = r3[r5]     // Catch:{ NumberFormatException -> 0x0620 }
            int r0 = java.lang.Integer.parseInt(r3)     // Catch:{ NumberFormatException -> 0x0620 }
        L_0x0571:
            r3 = 66
            if (r1 == r3) goto L_0x059a
            r3 = 77
            if (r1 == r3) goto L_0x059b
            r3 = 88
            if (r1 == r3) goto L_0x0598
            r3 = 100
            if (r1 == r3) goto L_0x0596
            r3 = 110(0x6e, float:1.54E-43)
            if (r1 == r3) goto L_0x0594
            r3 = 122(0x7a, float:1.71E-43)
            if (r1 == r3) goto L_0x0592
            r3 = 244(0xf4, float:3.42E-43)
            if (r1 == r3) goto L_0x058f
            r5 = r9
            goto L_0x059b
        L_0x058f:
            r5 = 64
            goto L_0x059b
        L_0x0592:
            r5 = r11
            goto L_0x059b
        L_0x0594:
            r5 = r13
            goto L_0x059b
        L_0x0596:
            r5 = r14
            goto L_0x059b
        L_0x0598:
            r5 = r2
            goto L_0x059b
        L_0x059a:
            r5 = r6
        L_0x059b:
            if (r5 != r9) goto L_0x05b0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Unknown AVC profile: "
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.google.android.gms.internal.ads.zzea.zzf(r12, r0)
            goto L_0x0006
        L_0x05b0:
            switch(r0) {
                case 10: goto L_0x05eb;
                case 11: goto L_0x05e9;
                case 12: goto L_0x05e7;
                case 13: goto L_0x05e5;
                default: goto L_0x05b3;
            }
        L_0x05b3:
            switch(r0) {
                case 20: goto L_0x05e3;
                case 21: goto L_0x05e0;
                case 22: goto L_0x05dd;
                default: goto L_0x05b6;
            }
        L_0x05b6:
            switch(r0) {
                case 30: goto L_0x05da;
                case 31: goto L_0x05d7;
                case 32: goto L_0x05d4;
                default: goto L_0x05b9;
            }
        L_0x05b9:
            switch(r0) {
                case 40: goto L_0x05d1;
                case 41: goto L_0x05ce;
                case 42: goto L_0x05cb;
                default: goto L_0x05bc;
            }
        L_0x05bc:
            switch(r0) {
                case 50: goto L_0x05c8;
                case 51: goto L_0x05c4;
                case 52: goto L_0x05c1;
                default: goto L_0x05bf;
            }
        L_0x05bf:
            r1 = r9
            goto L_0x05ec
        L_0x05c1:
            r1 = 65536(0x10000, float:9.18355E-41)
            goto L_0x05ec
        L_0x05c4:
            r1 = 32768(0x8000, float:4.5918E-41)
            goto L_0x05ec
        L_0x05c8:
            r1 = 16384(0x4000, float:2.2959E-41)
            goto L_0x05ec
        L_0x05cb:
            r1 = 8192(0x2000, float:1.14794E-41)
            goto L_0x05ec
        L_0x05ce:
            r1 = 4096(0x1000, float:5.74E-42)
            goto L_0x05ec
        L_0x05d1:
            r1 = r16
            goto L_0x05ec
        L_0x05d4:
            r1 = r17
            goto L_0x05ec
        L_0x05d7:
            r1 = 512(0x200, float:7.175E-43)
            goto L_0x05ec
        L_0x05da:
            r1 = 256(0x100, float:3.59E-43)
            goto L_0x05ec
        L_0x05dd:
            r1 = 128(0x80, float:1.794E-43)
            goto L_0x05ec
        L_0x05e0:
            r1 = 64
            goto L_0x05ec
        L_0x05e3:
            r1 = r11
            goto L_0x05ec
        L_0x05e5:
            r1 = r13
            goto L_0x05ec
        L_0x05e7:
            r1 = r14
            goto L_0x05ec
        L_0x05e9:
            r1 = r2
            goto L_0x05ec
        L_0x05eb:
            r1 = r6
        L_0x05ec:
            if (r1 != r9) goto L_0x0601
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unknown AVC level: "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.google.android.gms.internal.ads.zzea.zzf(r12, r0)
            goto L_0x0006
        L_0x0601:
            android.util.Pair r2 = new android.util.Pair
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.<init>(r0, r1)
            goto L_0x0671
        L_0x060f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x0620 }
            r1.<init>(r7)     // Catch:{ NumberFormatException -> 0x0620 }
            r1.append(r0)     // Catch:{ NumberFormatException -> 0x0620 }
            java.lang.String r1 = r1.toString()     // Catch:{ NumberFormatException -> 0x0620 }
            com.google.android.gms.internal.ads.zzea.zzf(r12, r1)     // Catch:{ NumberFormatException -> 0x0620 }
            goto L_0x0006
        L_0x0620:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r0 = r7.concat(r0)
            com.google.android.gms.internal.ads.zzea.zzf(r12, r0)
            goto L_0x0006
        L_0x062d:
            java.lang.String r0 = r0.zzk
            android.util.Pair r2 = new android.util.Pair
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            r2.<init>(r1, r1)
            int r1 = r3.length
            if (r1 >= r15) goto L_0x0649
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Ignoring malformed H263 codec string: "
            java.lang.String r0 = r1.concat(r0)
            com.google.android.gms.internal.ads.zzea.zzf(r12, r0)
            goto L_0x0671
        L_0x0649:
            r1 = r3[r6]     // Catch:{ NumberFormatException -> 0x0664 }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x0664 }
            r3 = r3[r5]     // Catch:{ NumberFormatException -> 0x0664 }
            int r3 = java.lang.Integer.parseInt(r3)     // Catch:{ NumberFormatException -> 0x0664 }
            android.util.Pair r4 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x0664 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ NumberFormatException -> 0x0664 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ NumberFormatException -> 0x0664 }
            r4.<init>(r1, r3)     // Catch:{ NumberFormatException -> 0x0664 }
            r2 = r4
            goto L_0x0671
        L_0x0664:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Ignoring malformed H263 codec string: "
            java.lang.String r0 = r1.concat(r0)
            com.google.android.gms.internal.ads.zzea.zzf(r12, r0)
        L_0x0671:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdk.zza(com.google.android.gms.internal.ads.zzz):android.util.Pair");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00be, code lost:
        if (r11.equals("L123") != false) goto L_0x0197;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair zzb(java.lang.String r10, java.lang.String[] r11, com.google.android.gms.internal.ads.zzk r12) {
        /*
            int r0 = r11.length
            java.lang.String r1 = "Ignoring malformed HEVC codec string: "
            java.lang.String r2 = "CodecSpecificDataUtil"
            r3 = 0
            r4 = 4
            if (r0 >= r4) goto L_0x0015
            java.lang.String r10 = java.lang.String.valueOf(r10)
            java.lang.String r10 = r1.concat(r10)
            com.google.android.gms.internal.ads.zzea.zzf(r2, r10)
            return r3
        L_0x0015:
            java.util.regex.Pattern r0 = zzd
            r5 = 1
            r6 = r11[r5]
            java.util.regex.Matcher r0 = r0.matcher(r6)
            boolean r6 = r0.matches()
            if (r6 != 0) goto L_0x0030
            java.lang.String r10 = java.lang.String.valueOf(r10)
            java.lang.String r10 = r1.concat(r10)
            com.google.android.gms.internal.ads.zzea.zzf(r2, r10)
            return r3
        L_0x0030:
            java.lang.String r10 = r0.group(r5)
            java.lang.String r0 = "1"
            boolean r0 = r0.equals(r10)
            r1 = 4096(0x1000, float:5.74E-42)
            r6 = 6
            r7 = 2
            if (r0 == 0) goto L_0x0042
            r10 = r5
            goto L_0x005d
        L_0x0042:
            java.lang.String r0 = "2"
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x0054
            if (r12 == 0) goto L_0x0052
            int r10 = r12.zzd
            if (r10 != r6) goto L_0x0052
            r10 = r1
            goto L_0x005d
        L_0x0052:
            r10 = r7
            goto L_0x005d
        L_0x0054:
            java.lang.String r12 = "6"
            boolean r12 = r12.equals(r10)
            if (r12 == 0) goto L_0x026a
            r10 = r6
        L_0x005d:
            r12 = 3
            r11 = r11[r12]
            if (r11 != 0) goto L_0x0065
        L_0x0062:
            r12 = r3
            goto L_0x0250
        L_0x0065:
            int r0 = r11.hashCode()
            r8 = 8
            r9 = 16
            switch(r0) {
                case 70821: goto L_0x018b;
                case 70914: goto L_0x0180;
                case 70917: goto L_0x0175;
                case 71007: goto L_0x016b;
                case 71010: goto L_0x0160;
                case 74665: goto L_0x0156;
                case 74758: goto L_0x014c;
                case 74761: goto L_0x0142;
                case 74851: goto L_0x0138;
                case 74854: goto L_0x012d;
                case 2193639: goto L_0x0121;
                case 2193642: goto L_0x0115;
                case 2193732: goto L_0x0109;
                case 2193735: goto L_0x00fd;
                case 2193738: goto L_0x00f1;
                case 2193825: goto L_0x00e5;
                case 2193828: goto L_0x00d9;
                case 2193831: goto L_0x00cd;
                case 2312803: goto L_0x00c2;
                case 2312806: goto L_0x00b8;
                case 2312896: goto L_0x00ad;
                case 2312899: goto L_0x00a2;
                case 2312902: goto L_0x0096;
                case 2312989: goto L_0x008a;
                case 2312992: goto L_0x007e;
                case 2312995: goto L_0x0072;
                default: goto L_0x0070;
            }
        L_0x0070:
            goto L_0x0196
        L_0x0072:
            java.lang.String r12 = "L186"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L_0x0196
            r6 = 12
            goto L_0x0197
        L_0x007e:
            java.lang.String r12 = "L183"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L_0x0196
            r6 = 11
            goto L_0x0197
        L_0x008a:
            java.lang.String r12 = "L180"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L_0x0196
            r6 = 10
            goto L_0x0197
        L_0x0096:
            java.lang.String r12 = "L156"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L_0x0196
            r6 = 9
            goto L_0x0197
        L_0x00a2:
            java.lang.String r12 = "L153"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L_0x0196
            r6 = r8
            goto L_0x0197
        L_0x00ad:
            java.lang.String r12 = "L150"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L_0x0196
            r6 = 7
            goto L_0x0197
        L_0x00b8:
            java.lang.String r12 = "L123"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L_0x0196
            goto L_0x0197
        L_0x00c2:
            java.lang.String r12 = "L120"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L_0x0196
            r6 = 5
            goto L_0x0197
        L_0x00cd:
            java.lang.String r12 = "H186"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L_0x0196
            r6 = 25
            goto L_0x0197
        L_0x00d9:
            java.lang.String r12 = "H183"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L_0x0196
            r6 = 24
            goto L_0x0197
        L_0x00e5:
            java.lang.String r12 = "H180"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L_0x0196
            r6 = 23
            goto L_0x0197
        L_0x00f1:
            java.lang.String r12 = "H156"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L_0x0196
            r6 = 22
            goto L_0x0197
        L_0x00fd:
            java.lang.String r12 = "H153"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L_0x0196
            r6 = 21
            goto L_0x0197
        L_0x0109:
            java.lang.String r12 = "H150"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L_0x0196
            r6 = 20
            goto L_0x0197
        L_0x0115:
            java.lang.String r12 = "H123"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L_0x0196
            r6 = 19
            goto L_0x0197
        L_0x0121:
            java.lang.String r12 = "H120"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L_0x0196
            r6 = 18
            goto L_0x0197
        L_0x012d:
            java.lang.String r12 = "L93"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L_0x0196
            r6 = r4
            goto L_0x0197
        L_0x0138:
            java.lang.String r0 = "L90"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x0196
            r6 = r12
            goto L_0x0197
        L_0x0142:
            java.lang.String r12 = "L63"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L_0x0196
            r6 = r7
            goto L_0x0197
        L_0x014c:
            java.lang.String r12 = "L60"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L_0x0196
            r6 = r5
            goto L_0x0197
        L_0x0156:
            java.lang.String r12 = "L30"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L_0x0196
            r6 = 0
            goto L_0x0197
        L_0x0160:
            java.lang.String r12 = "H93"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L_0x0196
            r6 = 17
            goto L_0x0197
        L_0x016b:
            java.lang.String r12 = "H90"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L_0x0196
            r6 = r9
            goto L_0x0197
        L_0x0175:
            java.lang.String r12 = "H63"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L_0x0196
            r6 = 15
            goto L_0x0197
        L_0x0180:
            java.lang.String r12 = "H60"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L_0x0196
            r6 = 14
            goto L_0x0197
        L_0x018b:
            java.lang.String r12 = "H30"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L_0x0196
            r6 = 13
            goto L_0x0197
        L_0x0196:
            r6 = -1
        L_0x0197:
            switch(r6) {
                case 0: goto L_0x024c;
                case 1: goto L_0x0247;
                case 2: goto L_0x0242;
                case 3: goto L_0x023b;
                case 4: goto L_0x0234;
                case 5: goto L_0x022d;
                case 6: goto L_0x0228;
                case 7: goto L_0x0221;
                case 8: goto L_0x021a;
                case 9: goto L_0x0213;
                case 10: goto L_0x020c;
                case 11: goto L_0x0205;
                case 12: goto L_0x01fe;
                case 13: goto L_0x01f9;
                case 14: goto L_0x01f4;
                case 15: goto L_0x01ed;
                case 16: goto L_0x01e5;
                case 17: goto L_0x01dd;
                case 18: goto L_0x01d5;
                case 19: goto L_0x01cd;
                case 20: goto L_0x01c4;
                case 21: goto L_0x01bc;
                case 22: goto L_0x01b4;
                case 23: goto L_0x01ac;
                case 24: goto L_0x01a4;
                case 25: goto L_0x019c;
                default: goto L_0x019a;
            }
        L_0x019a:
            goto L_0x0062
        L_0x019c:
            r12 = 33554432(0x2000000, float:9.403955E-38)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            goto L_0x0250
        L_0x01a4:
            r12 = 8388608(0x800000, float:1.17549435E-38)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            goto L_0x0250
        L_0x01ac:
            r12 = 2097152(0x200000, float:2.938736E-39)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            goto L_0x0250
        L_0x01b4:
            r12 = 524288(0x80000, float:7.34684E-40)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            goto L_0x0250
        L_0x01bc:
            r12 = 131072(0x20000, float:1.83671E-40)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            goto L_0x0250
        L_0x01c4:
            r12 = 32768(0x8000, float:4.5918E-41)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            goto L_0x0250
        L_0x01cd:
            r12 = 8192(0x2000, float:1.14794E-41)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            goto L_0x0250
        L_0x01d5:
            r12 = 2048(0x800, float:2.87E-42)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            goto L_0x0250
        L_0x01dd:
            r12 = 512(0x200, float:7.175E-43)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            goto L_0x0250
        L_0x01e5:
            r12 = 128(0x80, float:1.794E-43)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            goto L_0x0250
        L_0x01ed:
            r12 = 32
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            goto L_0x0250
        L_0x01f4:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r8)
            goto L_0x0250
        L_0x01f9:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r7)
            goto L_0x0250
        L_0x01fe:
            r12 = 16777216(0x1000000, float:2.3509887E-38)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            goto L_0x0250
        L_0x0205:
            r12 = 4194304(0x400000, float:5.877472E-39)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            goto L_0x0250
        L_0x020c:
            r12 = 1048576(0x100000, float:1.469368E-39)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            goto L_0x0250
        L_0x0213:
            r12 = 262144(0x40000, float:3.67342E-40)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            goto L_0x0250
        L_0x021a:
            r12 = 65536(0x10000, float:9.18355E-41)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            goto L_0x0250
        L_0x0221:
            r12 = 16384(0x4000, float:2.2959E-41)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            goto L_0x0250
        L_0x0228:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r1)
            goto L_0x0250
        L_0x022d:
            r12 = 1024(0x400, float:1.435E-42)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            goto L_0x0250
        L_0x0234:
            r12 = 256(0x100, float:3.59E-43)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            goto L_0x0250
        L_0x023b:
            r12 = 64
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            goto L_0x0250
        L_0x0242:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r9)
            goto L_0x0250
        L_0x0247:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r4)
            goto L_0x0250
        L_0x024c:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r5)
        L_0x0250:
            if (r12 != 0) goto L_0x0260
            java.lang.String r10 = java.lang.String.valueOf(r11)
            java.lang.String r11 = "Unknown HEVC level string: "
            java.lang.String r10 = r11.concat(r10)
            com.google.android.gms.internal.ads.zzea.zzf(r2, r10)
            return r3
        L_0x0260:
            android.util.Pair r11 = new android.util.Pair
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r11.<init>(r10, r12)
            return r11
        L_0x026a:
            java.lang.String r10 = java.lang.String.valueOf(r10)
            java.lang.String r11 = "Unknown HEVC profile string: "
            java.lang.String r10 = r11.concat(r10)
            com.google.android.gms.internal.ads.zzea.zzf(r2, r10)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdk.zzb(java.lang.String, java.lang.String[], com.google.android.gms.internal.ads.zzk):android.util.Pair");
    }

    public static String zzc(int i, int i2, int i3) {
        return String.format("avc1.%02X%02X%02X", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
    }

    public static String zzd(int i, boolean z, int i2, int i3, int[] iArr, int i4) {
        int i5;
        Object[] objArr = {zzc[i], Integer.valueOf(i2), Integer.valueOf(i3), Character.valueOf(true != z ? 'L' : 'H'), Integer.valueOf(i4)};
        String str = zzex.zza;
        StringBuilder sb = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int i6 = 6;
        while (true) {
            if (i6 <= 0) {
                break;
            }
            int i7 = i6 - 1;
            if (iArr[i7] != 0) {
                break;
            }
            i6 = i7;
        }
        for (i5 = 0; i5 < i6; i5++) {
            sb.append(String.format(".%02X", new Object[]{Integer.valueOf(iArr[i5])}));
        }
        return sb.toString();
    }

    public static byte[] zze(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[(i2 + 4)];
        System.arraycopy(zzb, 0, bArr2, 0, 4);
        System.arraycopy(bArr, i, bArr2, 4, i2);
        return bArr2;
    }
}
