package com.google.android.gms.internal.ads;

import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzalt implements zzakt {
    static final Pattern zza = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    static final Pattern zzb = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");
    private static final Pattern zzc = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    private static final Pattern zzd = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    private static final Pattern zze = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    private static final Pattern zzf = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");
    private static final Pattern zzg = Pattern.compile("^(\\d+) (\\d+)$");
    private static final zzalr zzh = new zzalr(30.0f, 1, 1);
    private final XmlPullParserFactory zzi;

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00d6, code lost:
        if (r13.equals("s") != false) goto L_0x0102;
     */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x011f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static long zzc(java.lang.String r13, com.google.android.gms.internal.ads.zzalr r14) throws com.google.android.gms.internal.ads.zzakp {
        /*
            java.util.regex.Pattern r0 = zzc
            java.util.regex.Matcher r0 = r0.matcher(r13)
            boolean r1 = r0.matches()
            r2 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            r4 = 5
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 1
            if (r1 == 0) goto L_0x0085
            java.lang.String r13 = r0.group(r8)
            r13.getClass()
            r1 = r13
            java.lang.String r1 = (java.lang.String) r1
            long r8 = java.lang.Long.parseLong(r13)
            r10 = 3600(0xe10, double:1.7786E-320)
            long r8 = r8 * r10
            java.lang.String r13 = r0.group(r7)
            r13.getClass()
            double r7 = (double) r8
            r1 = r13
            java.lang.String r1 = (java.lang.String) r1
            long r9 = java.lang.Long.parseLong(r13)
            r11 = 60
            long r9 = r9 * r11
            java.lang.String r13 = r0.group(r6)
            r13.getClass()
            double r9 = (double) r9
            double r7 = r7 + r9
            r1 = r13
            java.lang.String r1 = (java.lang.String) r1
            long r9 = java.lang.Long.parseLong(r13)
            double r9 = (double) r9
            java.lang.String r13 = r0.group(r5)
            r5 = 0
            if (r13 == 0) goto L_0x0057
            double r11 = java.lang.Double.parseDouble(r13)
            goto L_0x0058
        L_0x0057:
            r11 = r5
        L_0x0058:
            double r7 = r7 + r9
            java.lang.String r13 = r0.group(r4)
            if (r13 == 0) goto L_0x0069
            long r9 = java.lang.Long.parseLong(r13)
            float r13 = (float) r9
            float r1 = r14.zza
            float r13 = r13 / r1
            double r9 = (double) r13
            goto L_0x006a
        L_0x0069:
            r9 = r5
        L_0x006a:
            double r7 = r7 + r11
            r13 = 6
            java.lang.String r13 = r0.group(r13)
            if (r13 == 0) goto L_0x0080
            long r0 = java.lang.Long.parseLong(r13)
            double r0 = (double) r0
            int r13 = r14.zzb
            double r4 = (double) r13
            float r13 = r14.zza
            double r13 = (double) r13
            double r0 = r0 / r4
            double r5 = r0 / r13
        L_0x0080:
            double r7 = r7 + r9
            double r7 = r7 + r5
            double r7 = r7 * r2
            long r13 = (long) r7
            return r13
        L_0x0085:
            java.util.regex.Pattern r0 = zzd
            java.util.regex.Matcher r0 = r0.matcher(r13)
            boolean r1 = r0.matches()
            if (r1 == 0) goto L_0x0128
            java.lang.String r13 = r0.group(r8)
            r13.getClass()
            r1 = r13
            java.lang.String r1 = (java.lang.String) r1
            double r9 = java.lang.Double.parseDouble(r13)
            java.lang.String r13 = r0.group(r7)
            r13.getClass()
            r0 = r13
            java.lang.String r0 = (java.lang.String) r0
            int r0 = r13.hashCode()
            r1 = 102(0x66, float:1.43E-43)
            if (r0 == r1) goto L_0x00f7
            r1 = 104(0x68, float:1.46E-43)
            if (r0 == r1) goto L_0x00ed
            r1 = 109(0x6d, float:1.53E-43)
            if (r0 == r1) goto L_0x00e3
            r1 = 3494(0xda6, float:4.896E-42)
            if (r0 == r1) goto L_0x00d9
            r1 = 115(0x73, float:1.61E-43)
            if (r0 == r1) goto L_0x00d0
            r1 = 116(0x74, float:1.63E-43)
            if (r0 == r1) goto L_0x00c6
            goto L_0x0101
        L_0x00c6:
            java.lang.String r0 = "t"
            boolean r13 = r13.equals(r0)
            if (r13 == 0) goto L_0x0101
            r7 = r4
            goto L_0x0102
        L_0x00d0:
            java.lang.String r0 = "s"
            boolean r13 = r13.equals(r0)
            if (r13 == 0) goto L_0x0101
            goto L_0x0102
        L_0x00d9:
            java.lang.String r0 = "ms"
            boolean r13 = r13.equals(r0)
            if (r13 == 0) goto L_0x0101
            r7 = r6
            goto L_0x0102
        L_0x00e3:
            java.lang.String r0 = "m"
            boolean r13 = r13.equals(r0)
            if (r13 == 0) goto L_0x0101
            r7 = r8
            goto L_0x0102
        L_0x00ed:
            java.lang.String r0 = "h"
            boolean r13 = r13.equals(r0)
            if (r13 == 0) goto L_0x0101
            r7 = 0
            goto L_0x0102
        L_0x00f7:
            java.lang.String r0 = "f"
            boolean r13 = r13.equals(r0)
            if (r13 == 0) goto L_0x0101
            r7 = r5
            goto L_0x0102
        L_0x0101:
            r7 = -1
        L_0x0102:
            if (r7 == 0) goto L_0x011f
            if (r7 == r8) goto L_0x011c
            if (r7 == r6) goto L_0x0115
            if (r7 == r5) goto L_0x0111
            if (r7 == r4) goto L_0x010d
            goto L_0x0125
        L_0x010d:
            int r13 = r14.zzc
            double r13 = (double) r13
            goto L_0x011a
        L_0x0111:
            float r13 = r14.zza
            double r13 = (double) r13
            goto L_0x011a
        L_0x0115:
            r13 = 4652007308841189376(0x408f400000000000, double:1000.0)
        L_0x011a:
            double r9 = r9 / r13
            goto L_0x0125
        L_0x011c:
            r13 = 4633641066610819072(0x404e000000000000, double:60.0)
            goto L_0x0124
        L_0x011f:
            r13 = 4660134898793709568(0x40ac200000000000, double:3600.0)
        L_0x0124:
            double r9 = r9 * r13
        L_0x0125:
            double r9 = r9 * r2
            long r13 = (long) r9
            return r13
        L_0x0128:
            java.lang.String r13 = java.lang.String.valueOf(r13)
            com.google.android.gms.internal.ads.zzakp r14 = new com.google.android.gms.internal.ads.zzakp
            java.lang.String r0 = "Malformed time expression: "
            java.lang.String r13 = r0.concat(r13)
            r14.<init>(r13)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzalt.zzc(java.lang.String, com.google.android.gms.internal.ads.zzalr):long");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.text.Layout.Alignment zzd(java.lang.String r5) {
        /*
            java.lang.String r5 = com.google.android.gms.internal.ads.zzfuv.zza(r5)
            int r0 = r5.hashCode()
            r1 = 4
            r2 = 3
            r3 = 2
            r4 = 1
            switch(r0) {
                case -1364013995: goto L_0x0038;
                case 100571: goto L_0x002e;
                case 3317767: goto L_0x0024;
                case 108511772: goto L_0x001a;
                case 109757538: goto L_0x0010;
                default: goto L_0x000f;
            }
        L_0x000f:
            goto L_0x0042
        L_0x0010:
            java.lang.String r0 = "start"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0042
            r5 = r4
            goto L_0x0043
        L_0x001a:
            java.lang.String r0 = "right"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0042
            r5 = r3
            goto L_0x0043
        L_0x0024:
            java.lang.String r0 = "left"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0042
            r5 = 0
            goto L_0x0043
        L_0x002e:
            java.lang.String r0 = "end"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0042
            r5 = r2
            goto L_0x0043
        L_0x0038:
            java.lang.String r0 = "center"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0042
            r5 = r1
            goto L_0x0043
        L_0x0042:
            r5 = -1
        L_0x0043:
            if (r5 == 0) goto L_0x0055
            if (r5 == r4) goto L_0x0055
            if (r5 == r3) goto L_0x0052
            if (r5 == r2) goto L_0x0052
            if (r5 == r1) goto L_0x004f
            r5 = 0
            return r5
        L_0x004f:
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_CENTER
            return r5
        L_0x0052:
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            return r5
        L_0x0055:
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_NORMAL
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzalt.zzd(java.lang.String):android.text.Layout$Alignment");
    }

    private static zzalw zze(zzalw zzalw) {
        return zzalw == null ? new zzalw() : zzalw;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.gms.internal.ads.zzalw zzf(org.xmlpull.v1.XmlPullParser r16, com.google.android.gms.internal.ads.zzalw r17) {
        /*
            r1 = r16
            int r2 = r16.getAttributeCount()
            r3 = 0
            r0 = r17
            r4 = r3
        L_0x000a:
            if (r4 >= r2) goto L_0x041f
            java.lang.String r5 = r1.getAttributeValue(r4)
            java.lang.String r6 = r1.getAttributeName(r4)
            int r7 = r6.hashCode()
            r8 = 5
            r9 = 4
            r10 = -1
            r11 = 3
            r12 = 2
            r13 = 1
            switch(r7) {
                case -1550943582: goto L_0x00d4;
                case -1289044182: goto L_0x00c9;
                case -1224696685: goto L_0x00bf;
                case -1065511464: goto L_0x00b5;
                case -1008619738: goto L_0x00aa;
                case -879295043: goto L_0x009f;
                case -734428249: goto L_0x0095;
                case 3355: goto L_0x008b;
                case 3511770: goto L_0x0080;
                case 94842723: goto L_0x0075;
                case 109403361: goto L_0x0069;
                case 110138194: goto L_0x005d;
                case 365601008: goto L_0x0052;
                case 921125321: goto L_0x0046;
                case 1115953443: goto L_0x003a;
                case 1287124693: goto L_0x002f;
                case 1754920356: goto L_0x0023;
                default: goto L_0x0021;
            }
        L_0x0021:
            goto L_0x00de
        L_0x0023:
            java.lang.String r7 = "multiRowAlign"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x00de
            r6 = 8
            goto L_0x00df
        L_0x002f:
            java.lang.String r7 = "backgroundColor"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x00de
            r6 = r13
            goto L_0x00df
        L_0x003a:
            java.lang.String r7 = "rubyPosition"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x00de
            r6 = 11
            goto L_0x00df
        L_0x0046:
            java.lang.String r7 = "textEmphasis"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x00de
            r6 = 13
            goto L_0x00df
        L_0x0052:
            java.lang.String r7 = "fontSize"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x00de
            r6 = r9
            goto L_0x00df
        L_0x005d:
            java.lang.String r7 = "textCombine"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x00de
            r6 = 9
            goto L_0x00df
        L_0x0069:
            java.lang.String r7 = "shear"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x00de
            r6 = 14
            goto L_0x00df
        L_0x0075:
            java.lang.String r7 = "color"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x00de
            r6 = r12
            goto L_0x00df
        L_0x0080:
            java.lang.String r7 = "ruby"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x00de
            r6 = 10
            goto L_0x00df
        L_0x008b:
            java.lang.String r7 = "id"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x00de
            r6 = r3
            goto L_0x00df
        L_0x0095:
            java.lang.String r7 = "fontWeight"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x00de
            r6 = r8
            goto L_0x00df
        L_0x009f:
            java.lang.String r7 = "textDecoration"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x00de
            r6 = 12
            goto L_0x00df
        L_0x00aa:
            java.lang.String r7 = "origin"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x00de
            r6 = 15
            goto L_0x00df
        L_0x00b5:
            java.lang.String r7 = "textAlign"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x00de
            r6 = 7
            goto L_0x00df
        L_0x00bf:
            java.lang.String r7 = "fontFamily"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x00de
            r6 = r11
            goto L_0x00df
        L_0x00c9:
            java.lang.String r7 = "extent"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x00de
            r6 = 16
            goto L_0x00df
        L_0x00d4:
            java.lang.String r7 = "fontStyle"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x00de
            r6 = 6
            goto L_0x00df
        L_0x00de:
            r6 = r10
        L_0x00df:
            r7 = 0
            java.lang.String r14 = "TtmlParser"
            switch(r6) {
                case 0: goto L_0x0407;
                case 1: goto L_0x03ed;
                case 2: goto L_0x03d3;
                case 3: goto L_0x03cb;
                case 4: goto L_0x02e4;
                case 5: goto L_0x02d5;
                case 6: goto L_0x02c6;
                case 7: goto L_0x02b9;
                case 8: goto L_0x02ac;
                case 9: goto L_0x026e;
                case 10: goto L_0x01f5;
                case 11: goto L_0x01b7;
                case 12: goto L_0x0156;
                case 13: goto L_0x0149;
                case 14: goto L_0x00f9;
                case 15: goto L_0x00f0;
                case 16: goto L_0x00e7;
                default: goto L_0x00e5;
            }
        L_0x00e5:
            goto L_0x041a
        L_0x00e7:
            com.google.android.gms.internal.ads.zzalw r0 = zze(r0)
            r0.zzo(r5)
            goto L_0x041a
        L_0x00f0:
            com.google.android.gms.internal.ads.zzalw r0 = zze(r0)
            r0.zzx(r5)
            goto L_0x041a
        L_0x00f9:
            com.google.android.gms.internal.ads.zzalw r6 = zze(r0)
            java.util.regex.Pattern r0 = zza
            java.util.regex.Matcher r0 = r0.matcher(r5)
            boolean r8 = r0.matches()
            r9 = 2139095039(0x7f7fffff, float:3.4028235E38)
            if (r8 != 0) goto L_0x011a
            java.lang.String r0 = java.lang.String.valueOf(r5)
            java.lang.String r5 = "Invalid value for shear: "
            java.lang.String r0 = r5.concat(r0)
            com.google.android.gms.internal.ads.zzea.zzf(r14, r0)
            goto L_0x0143
        L_0x011a:
            java.lang.String r0 = r0.group(r13)     // Catch:{ NumberFormatException -> 0x0135 }
            if (r0 == 0) goto L_0x0134
            r7 = r0
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ NumberFormatException -> 0x0135 }
            float r0 = java.lang.Float.parseFloat(r0)     // Catch:{ NumberFormatException -> 0x0135 }
            r7 = -1027080192(0xffffffffc2c80000, float:-100.0)
            float r0 = java.lang.Math.max(r7, r0)     // Catch:{ NumberFormatException -> 0x0135 }
            r7 = 1120403456(0x42c80000, float:100.0)
            float r9 = java.lang.Math.min(r7, r0)     // Catch:{ NumberFormatException -> 0x0135 }
            goto L_0x0143
        L_0x0134:
            throw r7     // Catch:{ NumberFormatException -> 0x0135 }
        L_0x0135:
            r0 = move-exception
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r7 = "Failed to parse shear: "
            java.lang.String r5 = r7.concat(r5)
            com.google.android.gms.internal.ads.zzea.zzg(r14, r5, r0)
        L_0x0143:
            r6.zzA(r9)
            r0 = r6
            goto L_0x041a
        L_0x0149:
            com.google.android.gms.internal.ads.zzalw r0 = zze(r0)
            com.google.android.gms.internal.ads.zzalp r5 = com.google.android.gms.internal.ads.zzalp.zza(r5)
            r0.zzD(r5)
            goto L_0x041a
        L_0x0156:
            java.lang.String r5 = com.google.android.gms.internal.ads.zzfuv.zza(r5)
            int r6 = r5.hashCode()
            switch(r6) {
                case -1461280213: goto L_0x0180;
                case -1026963764: goto L_0x0176;
                case 913457136: goto L_0x016c;
                case 1679736913: goto L_0x0162;
                default: goto L_0x0161;
            }
        L_0x0161:
            goto L_0x0189
        L_0x0162:
            java.lang.String r6 = "linethrough"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x0189
            r10 = r3
            goto L_0x0189
        L_0x016c:
            java.lang.String r6 = "nolinethrough"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x0189
            r10 = r13
            goto L_0x0189
        L_0x0176:
            java.lang.String r6 = "underline"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x0189
            r10 = r12
            goto L_0x0189
        L_0x0180:
            java.lang.String r6 = "nounderline"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x0189
            r10 = r11
        L_0x0189:
            if (r10 == 0) goto L_0x01ae
            if (r10 == r13) goto L_0x01a5
            if (r10 == r12) goto L_0x019c
            if (r10 == r11) goto L_0x0193
            goto L_0x041a
        L_0x0193:
            com.google.android.gms.internal.ads.zzalw r0 = zze(r0)
            r0.zzE(r3)
            goto L_0x041a
        L_0x019c:
            com.google.android.gms.internal.ads.zzalw r0 = zze(r0)
            r0.zzE(r13)
            goto L_0x041a
        L_0x01a5:
            com.google.android.gms.internal.ads.zzalw r0 = zze(r0)
            r0.zzv(r3)
            goto L_0x041a
        L_0x01ae:
            com.google.android.gms.internal.ads.zzalw r0 = zze(r0)
            r0.zzv(r13)
            goto L_0x041a
        L_0x01b7:
            java.lang.String r5 = com.google.android.gms.internal.ads.zzfuv.zza(r5)
            int r6 = r5.hashCode()
            r7 = -1392885889(0xffffffffacfa3f7f, float:-7.112477E-12)
            if (r6 == r7) goto L_0x01d4
            r7 = 92734940(0x58705dc, float:1.2697491E-35)
            if (r6 == r7) goto L_0x01ca
            goto L_0x01dd
        L_0x01ca:
            java.lang.String r6 = "after"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x01dd
            r10 = r13
            goto L_0x01dd
        L_0x01d4:
            java.lang.String r6 = "before"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x01dd
            r10 = r3
        L_0x01dd:
            if (r10 == 0) goto L_0x01ec
            if (r10 == r13) goto L_0x01e3
            goto L_0x041a
        L_0x01e3:
            com.google.android.gms.internal.ads.zzalw r0 = zze(r0)
            r0.zzy(r12)
            goto L_0x041a
        L_0x01ec:
            com.google.android.gms.internal.ads.zzalw r0 = zze(r0)
            r0.zzy(r13)
            goto L_0x041a
        L_0x01f5:
            java.lang.String r5 = com.google.android.gms.internal.ads.zzfuv.zza(r5)
            int r6 = r5.hashCode()
            switch(r6) {
                case -618561360: goto L_0x0233;
                case -410956671: goto L_0x0229;
                case -250518009: goto L_0x021f;
                case -136074796: goto L_0x0215;
                case 3016401: goto L_0x020b;
                case 3556653: goto L_0x0201;
                default: goto L_0x0200;
            }
        L_0x0200:
            goto L_0x023c
        L_0x0201:
            java.lang.String r6 = "text"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x023c
            r10 = r11
            goto L_0x023c
        L_0x020b:
            java.lang.String r6 = "base"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x023c
            r10 = r13
            goto L_0x023c
        L_0x0215:
            java.lang.String r6 = "textContainer"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x023c
            r10 = r9
            goto L_0x023c
        L_0x021f:
            java.lang.String r6 = "delimiter"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x023c
            r10 = r8
            goto L_0x023c
        L_0x0229:
            java.lang.String r6 = "container"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x023c
            r10 = r3
            goto L_0x023c
        L_0x0233:
            java.lang.String r6 = "baseContainer"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x023c
            r10 = r12
        L_0x023c:
            if (r10 == 0) goto L_0x0265
            if (r10 == r13) goto L_0x025c
            if (r10 == r12) goto L_0x025c
            if (r10 == r11) goto L_0x0253
            if (r10 == r9) goto L_0x0253
            if (r10 == r8) goto L_0x024a
            goto L_0x041a
        L_0x024a:
            com.google.android.gms.internal.ads.zzalw r0 = zze(r0)
            r0.zzz(r9)
            goto L_0x041a
        L_0x0253:
            com.google.android.gms.internal.ads.zzalw r0 = zze(r0)
            r0.zzz(r11)
            goto L_0x041a
        L_0x025c:
            com.google.android.gms.internal.ads.zzalw r0 = zze(r0)
            r0.zzz(r12)
            goto L_0x041a
        L_0x0265:
            com.google.android.gms.internal.ads.zzalw r0 = zze(r0)
            r0.zzz(r13)
            goto L_0x041a
        L_0x026e:
            java.lang.String r5 = com.google.android.gms.internal.ads.zzfuv.zza(r5)
            int r6 = r5.hashCode()
            r7 = 96673(0x179a1, float:1.35468E-40)
            if (r6 == r7) goto L_0x028b
            r7 = 3387192(0x33af38, float:4.746467E-39)
            if (r6 == r7) goto L_0x0281
            goto L_0x0294
        L_0x0281:
            java.lang.String r6 = "none"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x0294
            r10 = r3
            goto L_0x0294
        L_0x028b:
            java.lang.String r6 = "all"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x0294
            r10 = r13
        L_0x0294:
            if (r10 == 0) goto L_0x02a3
            if (r10 == r13) goto L_0x029a
            goto L_0x041a
        L_0x029a:
            com.google.android.gms.internal.ads.zzalw r0 = zze(r0)
            r0.zzC(r13)
            goto L_0x041a
        L_0x02a3:
            com.google.android.gms.internal.ads.zzalw r0 = zze(r0)
            r0.zzC(r3)
            goto L_0x041a
        L_0x02ac:
            com.google.android.gms.internal.ads.zzalw r0 = zze(r0)
            android.text.Layout$Alignment r5 = zzd(r5)
            r0.zzw(r5)
            goto L_0x041a
        L_0x02b9:
            com.google.android.gms.internal.ads.zzalw r0 = zze(r0)
            android.text.Layout$Alignment r5 = zzd(r5)
            r0.zzB(r5)
            goto L_0x041a
        L_0x02c6:
            com.google.android.gms.internal.ads.zzalw r0 = zze(r0)
            java.lang.String r6 = "italic"
            boolean r5 = r6.equalsIgnoreCase(r5)
            r0.zzu(r5)
            goto L_0x041a
        L_0x02d5:
            com.google.android.gms.internal.ads.zzalw r0 = zze(r0)
            java.lang.String r6 = "bold"
            boolean r5 = r6.equalsIgnoreCase(r5)
            r0.zzn(r5)
            goto L_0x041a
        L_0x02e4:
            com.google.android.gms.internal.ads.zzalw r0 = zze(r0)     // Catch:{ zzakp -> 0x03bd }
            java.lang.String r6 = "\\s+"
            java.lang.String r8 = com.google.android.gms.internal.ads.zzex.zza     // Catch:{ zzakp -> 0x03bd }
            java.lang.String[] r6 = r5.split(r6, r10)     // Catch:{ zzakp -> 0x03bd }
            int r8 = r6.length     // Catch:{ zzakp -> 0x03bd }
            if (r8 != r13) goto L_0x02fa
            java.util.regex.Pattern r6 = zze     // Catch:{ zzakp -> 0x03bd }
            java.util.regex.Matcher r6 = r6.matcher(r5)     // Catch:{ zzakp -> 0x03bd }
            goto L_0x0309
        L_0x02fa:
            if (r8 != r12) goto L_0x03a1
            java.util.regex.Pattern r8 = zze     // Catch:{ zzakp -> 0x03bd }
            r6 = r6[r13]     // Catch:{ zzakp -> 0x03bd }
            java.util.regex.Matcher r6 = r8.matcher(r6)     // Catch:{ zzakp -> 0x03bd }
            java.lang.String r8 = "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first."
            com.google.android.gms.internal.ads.zzea.zzf(r14, r8)     // Catch:{ zzakp -> 0x03bd }
        L_0x0309:
            boolean r8 = r6.matches()     // Catch:{ zzakp -> 0x03bd }
            java.lang.String r9 = "'."
            if (r8 == 0) goto L_0x0387
            java.lang.String r8 = r6.group(r11)     // Catch:{ zzakp -> 0x03bd }
            if (r8 == 0) goto L_0x0386
            r15 = r8
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ zzakp -> 0x03bd }
            int r15 = r8.hashCode()     // Catch:{ zzakp -> 0x03bd }
            r3 = 37
            if (r15 == r3) goto L_0x033f
            r3 = 3240(0xca8, float:4.54E-42)
            if (r15 == r3) goto L_0x0335
            r3 = 3592(0xe08, float:5.033E-42)
            if (r15 == r3) goto L_0x032b
            goto L_0x0348
        L_0x032b:
            java.lang.String r3 = "px"
            boolean r3 = r8.equals(r3)
            if (r3 == 0) goto L_0x0348
            r10 = 0
            goto L_0x0348
        L_0x0335:
            java.lang.String r3 = "em"
            boolean r3 = r8.equals(r3)
            if (r3 == 0) goto L_0x0348
            r10 = r13
            goto L_0x0348
        L_0x033f:
            java.lang.String r3 = "%"
            boolean r3 = r8.equals(r3)
            if (r3 == 0) goto L_0x0348
            r10 = r12
        L_0x0348:
            if (r10 == 0) goto L_0x0370
            if (r10 == r13) goto L_0x036c
            if (r10 != r12) goto L_0x0352
            r0.zzs(r11)     // Catch:{ zzakp -> 0x03bd }
            goto L_0x0373
        L_0x0352:
            com.google.android.gms.internal.ads.zzakp r3 = new com.google.android.gms.internal.ads.zzakp     // Catch:{ zzakp -> 0x03bd }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ zzakp -> 0x03bd }
            r6.<init>()     // Catch:{ zzakp -> 0x03bd }
            java.lang.String r7 = "Invalid unit for fontSize: '"
            r6.append(r7)     // Catch:{ zzakp -> 0x03bd }
            r6.append(r8)     // Catch:{ zzakp -> 0x03bd }
            r6.append(r9)     // Catch:{ zzakp -> 0x03bd }
            java.lang.String r6 = r6.toString()     // Catch:{ zzakp -> 0x03bd }
            r3.<init>(r6)     // Catch:{ zzakp -> 0x03bd }
            throw r3     // Catch:{ zzakp -> 0x03bd }
        L_0x036c:
            r0.zzs(r12)     // Catch:{ zzakp -> 0x03bd }
            goto L_0x0373
        L_0x0370:
            r0.zzs(r13)     // Catch:{ zzakp -> 0x03bd }
        L_0x0373:
            java.lang.String r3 = r6.group(r13)     // Catch:{ zzakp -> 0x03bd }
            if (r3 == 0) goto L_0x0385
            r6 = r3
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ zzakp -> 0x03bd }
            float r3 = java.lang.Float.parseFloat(r3)     // Catch:{ zzakp -> 0x03bd }
            r0.zzr(r3)     // Catch:{ zzakp -> 0x03bd }
            goto L_0x041a
        L_0x0385:
            throw r7     // Catch:{ zzakp -> 0x03bd }
        L_0x0386:
            throw r7     // Catch:{ zzakp -> 0x03bd }
        L_0x0387:
            com.google.android.gms.internal.ads.zzakp r3 = new com.google.android.gms.internal.ads.zzakp     // Catch:{ zzakp -> 0x03bd }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ zzakp -> 0x03bd }
            r6.<init>()     // Catch:{ zzakp -> 0x03bd }
            java.lang.String r7 = "Invalid expression for fontSize: '"
            r6.append(r7)     // Catch:{ zzakp -> 0x03bd }
            r6.append(r5)     // Catch:{ zzakp -> 0x03bd }
            r6.append(r9)     // Catch:{ zzakp -> 0x03bd }
            java.lang.String r6 = r6.toString()     // Catch:{ zzakp -> 0x03bd }
            r3.<init>(r6)     // Catch:{ zzakp -> 0x03bd }
            throw r3     // Catch:{ zzakp -> 0x03bd }
        L_0x03a1:
            com.google.android.gms.internal.ads.zzakp r3 = new com.google.android.gms.internal.ads.zzakp     // Catch:{ zzakp -> 0x03bd }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ zzakp -> 0x03bd }
            r6.<init>()     // Catch:{ zzakp -> 0x03bd }
            java.lang.String r7 = "Invalid number of entries for fontSize: "
            r6.append(r7)     // Catch:{ zzakp -> 0x03bd }
            r6.append(r8)     // Catch:{ zzakp -> 0x03bd }
            java.lang.String r7 = "."
            r6.append(r7)     // Catch:{ zzakp -> 0x03bd }
            java.lang.String r6 = r6.toString()     // Catch:{ zzakp -> 0x03bd }
            r3.<init>(r6)     // Catch:{ zzakp -> 0x03bd }
            throw r3     // Catch:{ zzakp -> 0x03bd }
        L_0x03bd:
            java.lang.String r3 = java.lang.String.valueOf(r5)
            java.lang.String r5 = "Failed parsing fontSize value: "
            java.lang.String r3 = r5.concat(r3)
            com.google.android.gms.internal.ads.zzea.zzf(r14, r3)
            goto L_0x041a
        L_0x03cb:
            com.google.android.gms.internal.ads.zzalw r0 = zze(r0)
            r0.zzq(r5)
            goto L_0x041a
        L_0x03d3:
            com.google.android.gms.internal.ads.zzalw r0 = zze(r0)
            int r3 = com.google.android.gms.internal.ads.zzdl.zzb(r5)     // Catch:{ IllegalArgumentException -> 0x03df }
            r0.zzp(r3)     // Catch:{ IllegalArgumentException -> 0x03df }
            goto L_0x041a
        L_0x03df:
            java.lang.String r3 = java.lang.String.valueOf(r5)
            java.lang.String r5 = "Failed parsing color value: "
            java.lang.String r3 = r5.concat(r3)
            com.google.android.gms.internal.ads.zzea.zzf(r14, r3)
            goto L_0x041a
        L_0x03ed:
            com.google.android.gms.internal.ads.zzalw r0 = zze(r0)
            int r3 = com.google.android.gms.internal.ads.zzdl.zzb(r5)     // Catch:{ IllegalArgumentException -> 0x03f9 }
            r0.zzm(r3)     // Catch:{ IllegalArgumentException -> 0x03f9 }
            goto L_0x041a
        L_0x03f9:
            java.lang.String r3 = java.lang.String.valueOf(r5)
            java.lang.String r5 = "Failed parsing background value: "
            java.lang.String r3 = r5.concat(r3)
            com.google.android.gms.internal.ads.zzea.zzf(r14, r3)
            goto L_0x041a
        L_0x0407:
            java.lang.String r3 = r16.getName()
            java.lang.String r6 = "style"
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L_0x041a
            com.google.android.gms.internal.ads.zzalw r0 = zze(r0)
            r0.zzt(r5)
        L_0x041a:
            int r4 = r4 + 1
            r3 = 0
            goto L_0x000a
        L_0x041f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzalt.zzf(org.xmlpull.v1.XmlPullParser, com.google.android.gms.internal.ads.zzalw):com.google.android.gms.internal.ads.zzalw");
    }

    private static String[] zzg(String str) {
        String trim = str.trim();
        if (trim.isEmpty()) {
            return new String[0];
        }
        String str2 = zzex.zza;
        return trim.split("\\s+", -1);
    }

    public final void zza(byte[] bArr, int i, int i2, zzaks zzaks, zzdn zzdn) {
        zzakn.zza(zzb(bArr, i, i2), zzaks, zzdn);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v15, resolved type: com.google.android.gms.internal.ads.zzalr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v19, resolved type: com.google.android.gms.internal.ads.zzalr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v37, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v39, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v42, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v36, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v77, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v78, resolved type: com.google.android.gms.internal.ads.zzalr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v79, resolved type: com.google.android.gms.internal.ads.zzalr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v81, resolved type: com.google.android.gms.internal.ads.zzalr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v128, resolved type: int} */
    /* JADX WARNING: type inference failed for: r10v7 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x028c A[Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }, LOOP:1: B:131:0x028c->B:309:0x0550, LOOP_START, PHI: r2 r10 
      PHI: (r2v31 com.google.android.gms.internal.ads.zzalr) = (r2v10 com.google.android.gms.internal.ads.zzalr), (r2v32 com.google.android.gms.internal.ads.zzalr) binds: [B:130:0x028a, B:309:0x0550] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r10v36 java.lang.String) = (r10v6 java.lang.String), (r10v37 java.lang.String) binds: [B:130:0x028a, B:309:0x0550] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x04c5  */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x04d0  */
    /* JADX WARNING: Removed duplicated region for block: B:277:0x04e9 A[Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }] */
    /* JADX WARNING: Removed duplicated region for block: B:297:0x0524  */
    /* JADX WARNING: Removed duplicated region for block: B:300:0x052b  */
    /* JADX WARNING: Removed duplicated region for block: B:305:0x053f A[Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }] */
    /* JADX WARNING: Removed duplicated region for block: B:309:0x0550 A[LOOP:1: B:131:0x028c->B:309:0x0550, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:310:0x0556  */
    /* JADX WARNING: Removed duplicated region for block: B:396:0x066f  */
    /* JADX WARNING: Removed duplicated region for block: B:410:0x068f  */
    /* JADX WARNING: Removed duplicated region for block: B:417:0x06a6 A[Catch:{ zzakp -> 0x06b1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:485:0x054a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0192 A[Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01f8 A[SYNTHETIC, Splitter:B:98:0x01f8] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzako zzb(byte[] r39, int r40, int r41) {
        /*
            r38 = this;
            java.lang.String r1 = ""
            java.lang.String r2 = "http://www.w3.org/ns/ttml#parameter"
            r3 = r38
            org.xmlpull.v1.XmlPullParserFactory r4 = r3.zzi     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            org.xmlpull.v1.XmlPullParser r4 = r4.newPullParser()     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            java.util.HashMap r5 = new java.util.HashMap     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            r5.<init>()     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            java.util.HashMap r6 = new java.util.HashMap     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            r6.<init>()     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            java.util.HashMap r7 = new java.util.HashMap     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            r7.<init>()     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            com.google.android.gms.internal.ads.zzalu r15 = new com.google.android.gms.internal.ads.zzalu     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            java.lang.String r9 = ""
            r17 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r18 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r15
            r10 = r17
            r11 = r17
            r12 = r18
            r13 = r18
            r14 = r17
            r19 = r15
            r15 = r17
            r16 = r18
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            r8 = r19
            r6.put(r1, r8)     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            java.io.ByteArrayInputStream r8 = new java.io.ByteArrayInputStream     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            r9 = r39
            r10 = r40
            r11 = r41
            r8.<init>(r9, r10, r11)     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            r9 = 0
            r4.setInput(r8, r9)     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            java.util.ArrayDeque r8 = new java.util.ArrayDeque     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            r8.<init>()     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            int r10 = r4.getEventType()     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            com.google.android.gms.internal.ads.zzalr r11 = zzh     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            r14 = r9
            r18 = r14
            r16 = r11
            r15 = 0
            r17 = 15
        L_0x005f:
            r12 = 1
            if (r10 == r12) goto L_0x0740
            java.lang.Object r19 = r8.peek()     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            r9 = r19
            com.google.android.gms.internal.ads.zzalq r9 = (com.google.android.gms.internal.ads.zzalq) r9     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            r12 = 2
            if (r15 != 0) goto L_0x0710
            java.lang.String r13 = r4.getName()     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            r20 = r1
            java.lang.String r1 = "tt"
            if (r10 != r12) goto L_0x06cb
            boolean r10 = r1.equals(r13)     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            r21 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r12 = "TtmlParser"
            if (r10 == 0) goto L_0x01da
            java.lang.String r10 = "frameRate"
            java.lang.String r10 = r4.getAttributeValue(r2, r10)     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            if (r10 == 0) goto L_0x008e
            int r10 = java.lang.Integer.parseInt(r10)     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            goto L_0x0090
        L_0x008e:
            r10 = 30
        L_0x0090:
            java.lang.String r3 = "frameRateMultiplier"
            java.lang.String r3 = r4.getAttributeValue(r2, r3)     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            r22 = r14
            java.lang.String r14 = " "
            if (r3 == 0) goto L_0x00c6
            java.lang.String r16 = com.google.android.gms.internal.ads.zzex.zza     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            r23 = r15
            r15 = -1
            java.lang.String[] r3 = r3.split(r14, r15)     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            int r15 = r3.length     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            r24 = r8
            r8 = 2
            if (r15 != r8) goto L_0x00ad
            r8 = 1
            goto L_0x00ae
        L_0x00ad:
            r8 = 0
        L_0x00ae:
            java.lang.String r15 = "frameRateMultiplier doesn't have 2 parts"
            com.google.android.gms.internal.ads.zzdd.zze(r8, r15)     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            r8 = 0
            r15 = r3[r8]     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            int r15 = java.lang.Integer.parseInt(r15)     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            float r15 = (float) r15     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            r16 = 1
            r3 = r3[r16]     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            int r3 = java.lang.Integer.parseInt(r3)     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            float r3 = (float) r3     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            float r15 = r15 / r3
            goto L_0x00cd
        L_0x00c6:
            r24 = r8
            r23 = r15
            r8 = 0
            r15 = r21
        L_0x00cd:
            int r3 = r11.zzb     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            java.lang.String r8 = "subFrameRate"
            java.lang.String r8 = r4.getAttributeValue(r2, r8)     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            if (r8 == 0) goto L_0x00db
            int r3 = java.lang.Integer.parseInt(r8)     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
        L_0x00db:
            int r8 = r11.zzc     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            r16 = r8
            java.lang.String r8 = "tickRate"
            java.lang.String r8 = r4.getAttributeValue(r2, r8)     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            if (r8 == 0) goto L_0x00ee
            int r8 = java.lang.Integer.parseInt(r8)     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            r25 = r11
            goto L_0x00f2
        L_0x00ee:
            r25 = r11
            r8 = r16
        L_0x00f2:
            com.google.android.gms.internal.ads.zzalr r11 = new com.google.android.gms.internal.ads.zzalr     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            float r10 = (float) r10     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            float r10 = r10 * r15
            r11.<init>(r10, r3, r8)     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            java.lang.String r3 = "cellResolution"
            java.lang.String r3 = r4.getAttributeValue(r2, r3)     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            if (r3 != 0) goto L_0x0109
        L_0x0101:
            r26 = r2
            r16 = r11
        L_0x0105:
            r17 = 15
            goto L_0x0187
        L_0x0109:
            java.util.regex.Pattern r8 = zzg     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            java.util.regex.Matcher r8 = r8.matcher(r3)     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            boolean r10 = r8.matches()     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            if (r10 != 0) goto L_0x011f
            java.lang.String r8 = "Ignoring malformed cell resolution: "
            java.lang.String r3 = r8.concat(r3)     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            com.google.android.gms.internal.ads.zzea.zzf(r12, r3)     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            goto L_0x0101
        L_0x011f:
            r10 = 1
            java.lang.String r15 = r8.group(r10)     // Catch:{ NumberFormatException -> 0x0178 }
            if (r15 == 0) goto L_0x0172
            r10 = r15
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ NumberFormatException -> 0x0178 }
            int r10 = java.lang.Integer.parseInt(r15)     // Catch:{ NumberFormatException -> 0x0178 }
            r15 = 2
            java.lang.String r8 = r8.group(r15)     // Catch:{ NumberFormatException -> 0x0178 }
            if (r8 == 0) goto L_0x016c
            r15 = r8
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ NumberFormatException -> 0x0178 }
            int r8 = java.lang.Integer.parseInt(r8)     // Catch:{ NumberFormatException -> 0x0178 }
            if (r10 == 0) goto L_0x0149
            if (r8 == 0) goto L_0x0144
            r26 = r2
            r15 = r8
            r8 = 1
            goto L_0x014d
        L_0x0144:
            r26 = r2
            r8 = 0
            r15 = 0
            goto L_0x014d
        L_0x0149:
            r26 = r2
            r15 = r8
            r8 = 0
        L_0x014d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x017a }
            r2.<init>()     // Catch:{ NumberFormatException -> 0x017a }
            r16 = r11
            java.lang.String r11 = "Invalid cell resolution "
            r2.append(r11)     // Catch:{ NumberFormatException -> 0x017c }
            r2.append(r10)     // Catch:{ NumberFormatException -> 0x017c }
            r2.append(r14)     // Catch:{ NumberFormatException -> 0x017c }
            r2.append(r15)     // Catch:{ NumberFormatException -> 0x017c }
            java.lang.String r2 = r2.toString()     // Catch:{ NumberFormatException -> 0x017c }
            com.google.android.gms.internal.ads.zzdd.zze(r8, r2)     // Catch:{ NumberFormatException -> 0x017c }
            r17 = r15
            goto L_0x0187
        L_0x016c:
            r26 = r2
            r16 = r11
            r2 = 0
            throw r2     // Catch:{ NumberFormatException -> 0x017c }
        L_0x0172:
            r26 = r2
            r16 = r11
            r2 = 0
            throw r2     // Catch:{ NumberFormatException -> 0x017c }
        L_0x0178:
            r26 = r2
        L_0x017a:
            r16 = r11
        L_0x017c:
            java.lang.String r2 = "Ignoring malformed cell resolution: "
            java.lang.String r2 = r2.concat(r3)     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            com.google.android.gms.internal.ads.zzea.zzf(r12, r2)     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            goto L_0x0105
        L_0x0187:
            java.lang.String r2 = "extent"
            java.lang.String r2 = com.google.android.gms.internal.ads.zzey.zza(r4, r2)     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            if (r2 != 0) goto L_0x0192
        L_0x018f:
            r18 = 0
            goto L_0x01e4
        L_0x0192:
            java.util.regex.Pattern r3 = zzf     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            java.util.regex.Matcher r3 = r3.matcher(r2)     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            boolean r8 = r3.matches()     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            if (r8 != 0) goto L_0x01a8
            java.lang.String r3 = "Ignoring non-pixel tts extent: "
            java.lang.String r2 = r3.concat(r2)     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            com.google.android.gms.internal.ads.zzea.zzf(r12, r2)     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            goto L_0x018f
        L_0x01a8:
            r8 = 1
            java.lang.String r10 = r3.group(r8)     // Catch:{ NumberFormatException -> 0x01d0 }
            if (r10 == 0) goto L_0x01ce
            r8 = r10
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ NumberFormatException -> 0x01d0 }
            int r8 = java.lang.Integer.parseInt(r10)     // Catch:{ NumberFormatException -> 0x01d0 }
            r10 = 2
            java.lang.String r3 = r3.group(r10)     // Catch:{ NumberFormatException -> 0x01d0 }
            if (r3 == 0) goto L_0x01cc
            r10 = r3
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ NumberFormatException -> 0x01d0 }
            int r3 = java.lang.Integer.parseInt(r3)     // Catch:{ NumberFormatException -> 0x01d0 }
            com.google.android.gms.internal.ads.zzals r10 = new com.google.android.gms.internal.ads.zzals     // Catch:{ NumberFormatException -> 0x01d0 }
            r10.<init>(r8, r3)     // Catch:{ NumberFormatException -> 0x01d0 }
            r18 = r10
            goto L_0x01e4
        L_0x01cc:
            r3 = 0
            throw r3     // Catch:{ NumberFormatException -> 0x01d0 }
        L_0x01ce:
            r3 = 0
            throw r3     // Catch:{ NumberFormatException -> 0x01d0 }
        L_0x01d0:
            java.lang.String r3 = "Ignoring malformed tts extent: "
            java.lang.String r2 = r3.concat(r2)     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            com.google.android.gms.internal.ads.zzea.zzf(r12, r2)     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            goto L_0x018f
        L_0x01da:
            r26 = r2
            r24 = r8
            r25 = r11
            r22 = r14
            r23 = r15
        L_0x01e4:
            r2 = r16
            r3 = r17
            r8 = r18
            boolean r1 = r13.equals(r1)     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            java.lang.String r10 = "metadata"
            java.lang.String r11 = "region"
            java.lang.String r14 = "head"
            java.lang.String r15 = "style"
            if (r1 != 0) goto L_0x0286
            boolean r1 = r13.equals(r14)     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            if (r1 != 0) goto L_0x0286
            java.lang.String r1 = "body"
            boolean r1 = r13.equals(r1)     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            if (r1 != 0) goto L_0x0286
            java.lang.String r1 = "div"
            boolean r1 = r13.equals(r1)     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            if (r1 != 0) goto L_0x0286
            java.lang.String r1 = "p"
            boolean r1 = r13.equals(r1)     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            if (r1 != 0) goto L_0x0286
            java.lang.String r1 = "span"
            boolean r1 = r13.equals(r1)     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            if (r1 != 0) goto L_0x0286
            java.lang.String r1 = "br"
            boolean r1 = r13.equals(r1)     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            if (r1 != 0) goto L_0x0286
            boolean r1 = r13.equals(r15)     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            if (r1 != 0) goto L_0x0286
            java.lang.String r1 = "styling"
            boolean r1 = r13.equals(r1)     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            if (r1 != 0) goto L_0x0286
            java.lang.String r1 = "layout"
            boolean r1 = r13.equals(r1)     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            if (r1 != 0) goto L_0x0286
            boolean r1 = r13.equals(r11)     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            if (r1 != 0) goto L_0x0286
            boolean r1 = r13.equals(r10)     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            if (r1 != 0) goto L_0x0286
            java.lang.String r1 = "image"
            boolean r1 = r13.equals(r1)     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            if (r1 != 0) goto L_0x0286
            java.lang.String r1 = "data"
            boolean r1 = r13.equals(r1)     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            if (r1 != 0) goto L_0x0286
            java.lang.String r1 = "information"
            boolean r1 = r13.equals(r1)     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            if (r1 == 0) goto L_0x0261
            goto L_0x0286
        L_0x0261:
            java.lang.String r1 = r4.getName()     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            r9.<init>()     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            java.lang.String r10 = "Ignoring unsupported tag: "
            r9.append(r10)     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            r9.append(r1)     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            java.lang.String r1 = r9.toString()     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            com.google.android.gms.internal.ads.zzea.zze(r12, r1)     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            r16 = r2
            r17 = r3
            r18 = r8
            r14 = r22
            r11 = r24
            r15 = 1
            goto L_0x072d
        L_0x0286:
            boolean r1 = r14.equals(r13)     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            if (r1 == 0) goto L_0x0556
        L_0x028c:
            r4.next()     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            boolean r1 = com.google.android.gms.internal.ads.zzey.zzc(r4, r15)     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            if (r1 == 0) goto L_0x02cc
            java.lang.String r1 = com.google.android.gms.internal.ads.zzey.zza(r4, r15)     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            com.google.android.gms.internal.ads.zzalw r9 = new com.google.android.gms.internal.ads.zzalw     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            r9.<init>()     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            com.google.android.gms.internal.ads.zzalw r9 = zzf(r4, r9)     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            if (r1 == 0) goto L_0x02c0
            java.lang.String[] r1 = zzg(r1)     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            int r13 = r1.length     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            r16 = r2
            r2 = 0
        L_0x02ac:
            if (r2 >= r13) goto L_0x02c2
            r17 = r13
            r13 = r1[r2]     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            java.lang.Object r13 = r5.get(r13)     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            com.google.android.gms.internal.ads.zzalw r13 = (com.google.android.gms.internal.ads.zzalw) r13     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            r9.zzl(r13)     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            int r2 = r2 + 1
            r13 = r17
            goto L_0x02ac
        L_0x02c0:
            r16 = r2
        L_0x02c2:
            java.lang.String r1 = r9.zzH()     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            if (r1 == 0) goto L_0x02fa
            r5.put(r1, r9)     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            goto L_0x02fa
        L_0x02cc:
            r16 = r2
            boolean r1 = com.google.android.gms.internal.ads.zzey.zzc(r4, r11)     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            java.lang.String r2 = "id"
            if (r1 != 0) goto L_0x02fe
            boolean r1 = com.google.android.gms.internal.ads.zzey.zzc(r4, r10)     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            if (r1 == 0) goto L_0x02fa
        L_0x02dc:
            r4.next()     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            java.lang.String r1 = "image"
            boolean r1 = com.google.android.gms.internal.ads.zzey.zzc(r4, r1)     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            if (r1 == 0) goto L_0x02f4
            java.lang.String r1 = com.google.android.gms.internal.ads.zzey.zza(r4, r2)     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            if (r1 == 0) goto L_0x02f4
            java.lang.String r9 = r4.nextText()     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            r7.put(r1, r9)     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
        L_0x02f4:
            boolean r1 = com.google.android.gms.internal.ads.zzey.zzb(r4, r10)     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            if (r1 == 0) goto L_0x02dc
        L_0x02fa:
            r18 = r10
            goto L_0x0544
        L_0x02fe:
            java.lang.String r28 = com.google.android.gms.internal.ads.zzey.zza(r4, r2)     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            if (r28 != 0) goto L_0x0309
        L_0x0304:
            r18 = r10
        L_0x0306:
            r1 = 0
            goto L_0x053d
        L_0x0309:
            java.lang.String r1 = "origin"
            java.lang.String r1 = com.google.android.gms.internal.ads.zzey.zza(r4, r1)     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            if (r1 != 0) goto L_0x0323
            java.lang.String r2 = com.google.android.gms.internal.ads.zzey.zza(r4, r15)     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            if (r2 == 0) goto L_0x0323
            java.lang.Object r2 = r5.get(r2)     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            com.google.android.gms.internal.ads.zzalw r2 = (com.google.android.gms.internal.ads.zzalw) r2     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            if (r2 == 0) goto L_0x0323
            java.lang.String r1 = r2.zzI()     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
        L_0x0323:
            if (r1 == 0) goto L_0x03ba
            java.util.regex.Pattern r9 = zzb     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            java.util.regex.Matcher r9 = r9.matcher(r1)     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            java.util.regex.Pattern r13 = zzf     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            java.util.regex.Matcher r13 = r13.matcher(r1)     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            boolean r17 = r9.matches()     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            if (r17 == 0) goto L_0x0368
            r2 = 1
            java.lang.String r13 = r9.group(r2)     // Catch:{ NumberFormatException -> 0x035e }
            if (r13 == 0) goto L_0x035c
            r2 = r13
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ NumberFormatException -> 0x035e }
            float r2 = java.lang.Float.parseFloat(r13)     // Catch:{ NumberFormatException -> 0x035e }
            r13 = 1120403456(0x42c80000, float:100.0)
            float r2 = r2 / r13
            r13 = 2
            java.lang.String r9 = r9.group(r13)     // Catch:{ NumberFormatException -> 0x035e }
            if (r9 == 0) goto L_0x035a
            r13 = r9
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ NumberFormatException -> 0x035e }
            float r9 = java.lang.Float.parseFloat(r9)     // Catch:{ NumberFormatException -> 0x035e }
            r13 = 1120403456(0x42c80000, float:100.0)
        L_0x0358:
            float r9 = r9 / r13
            goto L_0x03bc
        L_0x035a:
            r2 = 0
            throw r2     // Catch:{ NumberFormatException -> 0x035e }
        L_0x035c:
            r2 = 0
            throw r2     // Catch:{ NumberFormatException -> 0x035e }
        L_0x035e:
            java.lang.String r2 = "Ignoring region with malformed origin: "
            java.lang.String r1 = r2.concat(r1)     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            com.google.android.gms.internal.ads.zzea.zzf(r12, r1)     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            goto L_0x0304
        L_0x0368:
            boolean r2 = r13.matches()     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            if (r2 == 0) goto L_0x03af
            if (r8 != 0) goto L_0x037a
            java.lang.String r2 = "Ignoring region with missing tts:extent: "
            java.lang.String r1 = r2.concat(r1)     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            com.google.android.gms.internal.ads.zzea.zzf(r12, r1)     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            goto L_0x0304
        L_0x037a:
            r2 = 1
            java.lang.String r9 = r13.group(r2)     // Catch:{ NumberFormatException -> 0x03a4 }
            if (r9 == 0) goto L_0x03a2
            r2 = r9
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ NumberFormatException -> 0x03a4 }
            int r2 = java.lang.Integer.parseInt(r9)     // Catch:{ NumberFormatException -> 0x03a4 }
            r9 = 2
            java.lang.String r13 = r13.group(r9)     // Catch:{ NumberFormatException -> 0x03a4 }
            if (r13 == 0) goto L_0x03a0
            r9 = r13
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ NumberFormatException -> 0x03a4 }
            int r9 = java.lang.Integer.parseInt(r13)     // Catch:{ NumberFormatException -> 0x03a4 }
            float r2 = (float) r2     // Catch:{ NumberFormatException -> 0x03a4 }
            int r13 = r8.zza     // Catch:{ NumberFormatException -> 0x03a4 }
            float r13 = (float) r13     // Catch:{ NumberFormatException -> 0x03a4 }
            float r2 = r2 / r13
            float r9 = (float) r9     // Catch:{ NumberFormatException -> 0x03a4 }
            int r13 = r8.zzb     // Catch:{ NumberFormatException -> 0x03a4 }
            float r13 = (float) r13     // Catch:{ NumberFormatException -> 0x03a4 }
            goto L_0x0358
        L_0x03a0:
            r2 = 0
            throw r2     // Catch:{ NumberFormatException -> 0x03a4 }
        L_0x03a2:
            r2 = 0
            throw r2     // Catch:{ NumberFormatException -> 0x03a4 }
        L_0x03a4:
            java.lang.String r2 = "Ignoring region with malformed origin: "
            java.lang.String r1 = r2.concat(r1)     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            com.google.android.gms.internal.ads.zzea.zzf(r12, r1)     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            goto L_0x0304
        L_0x03af:
            java.lang.String r2 = "Ignoring region with unsupported origin: "
            java.lang.String r1 = r2.concat(r1)     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            com.google.android.gms.internal.ads.zzea.zzf(r12, r1)     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            goto L_0x0304
        L_0x03ba:
            r9 = 0
            r2 = 0
        L_0x03bc:
            r29 = r2
            java.lang.String r2 = "extent"
            java.lang.String r2 = com.google.android.gms.internal.ads.zzey.zza(r4, r2)     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            if (r2 != 0) goto L_0x03d8
            java.lang.String r13 = com.google.android.gms.internal.ads.zzey.zza(r4, r15)     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            if (r13 == 0) goto L_0x03d8
            java.lang.Object r13 = r5.get(r13)     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            com.google.android.gms.internal.ads.zzalw r13 = (com.google.android.gms.internal.ads.zzalw) r13     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            if (r13 == 0) goto L_0x03d8
            java.lang.String r2 = r13.zzF()     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
        L_0x03d8:
            if (r2 == 0) goto L_0x048d
            java.util.regex.Pattern r13 = zzb     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            java.util.regex.Matcher r13 = r13.matcher(r2)     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            r18 = r10
            java.util.regex.Pattern r10 = zzf     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            java.util.regex.Matcher r2 = r10.matcher(r2)     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            boolean r10 = r13.matches()     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            if (r10 == 0) goto L_0x0429
            r10 = 1
            java.lang.String r2 = r13.group(r10)     // Catch:{ NumberFormatException -> 0x041a }
            if (r2 == 0) goto L_0x0418
            r10 = r2
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ NumberFormatException -> 0x041a }
            float r2 = java.lang.Float.parseFloat(r2)     // Catch:{ NumberFormatException -> 0x041a }
            r10 = 1120403456(0x42c80000, float:100.0)
            float r2 = r2 / r10
            r10 = 2
            java.lang.String r13 = r13.group(r10)     // Catch:{ NumberFormatException -> 0x041a }
            if (r13 == 0) goto L_0x0416
            r10 = r13
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ NumberFormatException -> 0x041a }
            float r1 = java.lang.Float.parseFloat(r13)     // Catch:{ NumberFormatException -> 0x041a }
            r10 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 / r10
            r34 = r1
            r33 = r2
            goto L_0x0493
        L_0x0416:
            r2 = 0
            throw r2     // Catch:{ NumberFormatException -> 0x041a }
        L_0x0418:
            r2 = 0
            throw r2     // Catch:{ NumberFormatException -> 0x041a }
        L_0x041a:
            java.lang.String r2 = "Ignoring region with malformed extent: "
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            java.lang.String r1 = r2.concat(r1)     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            com.google.android.gms.internal.ads.zzea.zzf(r12, r1)     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            goto L_0x0306
        L_0x0429:
            boolean r10 = r2.matches()     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            if (r10 == 0) goto L_0x047e
            if (r8 != 0) goto L_0x0440
            java.lang.String r2 = "Ignoring region with missing tts:extent: "
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            java.lang.String r1 = r2.concat(r1)     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            com.google.android.gms.internal.ads.zzea.zzf(r12, r1)     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            goto L_0x0306
        L_0x0440:
            r10 = 1
            java.lang.String r13 = r2.group(r10)     // Catch:{ NumberFormatException -> 0x046f }
            if (r13 == 0) goto L_0x046d
            r10 = r13
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ NumberFormatException -> 0x046f }
            int r10 = java.lang.Integer.parseInt(r13)     // Catch:{ NumberFormatException -> 0x046f }
            r13 = 2
            java.lang.String r2 = r2.group(r13)     // Catch:{ NumberFormatException -> 0x046f }
            if (r2 == 0) goto L_0x046b
            r13 = r2
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ NumberFormatException -> 0x046f }
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ NumberFormatException -> 0x046f }
            float r10 = (float) r10     // Catch:{ NumberFormatException -> 0x046f }
            int r13 = r8.zza     // Catch:{ NumberFormatException -> 0x046f }
            float r13 = (float) r13     // Catch:{ NumberFormatException -> 0x046f }
            float r10 = r10 / r13
            float r2 = (float) r2     // Catch:{ NumberFormatException -> 0x046f }
            int r1 = r8.zzb     // Catch:{ NumberFormatException -> 0x046f }
            float r1 = (float) r1     // Catch:{ NumberFormatException -> 0x046f }
            float r2 = r2 / r1
            r34 = r2
            r33 = r10
            goto L_0x0493
        L_0x046b:
            r2 = 0
            throw r2     // Catch:{ NumberFormatException -> 0x046f }
        L_0x046d:
            r2 = 0
            throw r2     // Catch:{ NumberFormatException -> 0x046f }
        L_0x046f:
            java.lang.String r2 = "Ignoring region with malformed extent: "
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            java.lang.String r1 = r2.concat(r1)     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            com.google.android.gms.internal.ads.zzea.zzf(r12, r1)     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            goto L_0x0306
        L_0x047e:
            java.lang.String r2 = "Ignoring region with unsupported extent: "
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            java.lang.String r1 = r2.concat(r1)     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            com.google.android.gms.internal.ads.zzea.zzf(r12, r1)     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            goto L_0x0306
        L_0x048d:
            r18 = r10
            r33 = r21
            r34 = r33
        L_0x0493:
            java.lang.String r1 = "displayAlign"
            java.lang.String r1 = com.google.android.gms.internal.ads.zzey.zza(r4, r1)     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            if (r1 == 0) goto L_0x04da
            java.lang.String r1 = com.google.android.gms.internal.ads.zzfuv.zza(r1)     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            int r2 = r1.hashCode()     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            r10 = -1364013995(0xffffffffaeb2cc55, float:-8.1307995E-11)
            if (r2 == r10) goto L_0x04b8
            r10 = 92734940(0x58705dc, float:1.2697491E-35)
            if (r2 == r10) goto L_0x04ae
            goto L_0x04c2
        L_0x04ae:
            java.lang.String r2 = "after"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x04c2
            r1 = 1
            goto L_0x04c3
        L_0x04b8:
            java.lang.String r2 = "center"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x04c2
            r1 = 0
            goto L_0x04c3
        L_0x04c2:
            r1 = -1
        L_0x04c3:
            if (r1 == 0) goto L_0x04d0
            r2 = 1
            if (r1 == r2) goto L_0x04c9
            goto L_0x04da
        L_0x04c9:
            float r9 = r9 + r34
            r30 = r9
            r32 = 2
            goto L_0x04de
        L_0x04d0:
            r1 = 1073741824(0x40000000, float:2.0)
            float r1 = r34 / r1
            float r9 = r9 + r1
            r30 = r9
            r32 = 1
            goto L_0x04de
        L_0x04da:
            r30 = r9
            r32 = 0
        L_0x04de:
            float r1 = (float) r3
            float r36 = r21 / r1
            java.lang.String r1 = "writingMode"
            java.lang.String r1 = com.google.android.gms.internal.ads.zzey.zza(r4, r1)     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            if (r1 == 0) goto L_0x052e
            java.lang.String r1 = com.google.android.gms.internal.ads.zzfuv.zza(r1)     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            int r2 = r1.hashCode()     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            r9 = 3694(0xe6e, float:5.176E-42)
            if (r2 == r9) goto L_0x0514
            r9 = 3553396(0x363874, float:4.979368E-39)
            if (r2 == r9) goto L_0x050a
            r9 = 3553576(0x363928, float:4.97962E-39)
            if (r2 == r9) goto L_0x0500
            goto L_0x051e
        L_0x0500:
            java.lang.String r2 = "tbrl"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x051e
            r1 = 2
            goto L_0x051f
        L_0x050a:
            java.lang.String r2 = "tblr"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x051e
            r1 = 1
            goto L_0x051f
        L_0x0514:
            java.lang.String r2 = "tb"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x051e
            r1 = 0
            goto L_0x051f
        L_0x051e:
            r1 = -1
        L_0x051f:
            if (r1 == 0) goto L_0x052b
            r2 = 1
            if (r1 == r2) goto L_0x052b
            r2 = 2
            if (r1 == r2) goto L_0x0528
            goto L_0x052e
        L_0x0528:
            r37 = 1
            goto L_0x0532
        L_0x052b:
            r37 = 2
            goto L_0x0532
        L_0x052e:
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r37 = r1
        L_0x0532:
            com.google.android.gms.internal.ads.zzalu r1 = new com.google.android.gms.internal.ads.zzalu     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            r31 = 0
            r35 = 1
            r27 = r1
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
        L_0x053d:
            if (r1 == 0) goto L_0x0544
            java.lang.String r2 = r1.zza     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            r6.put(r2, r1)     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
        L_0x0544:
            boolean r1 = com.google.android.gms.internal.ads.zzey.zzb(r4, r14)     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            if (r1 == 0) goto L_0x0550
            r21 = r16
            r11 = r24
            goto L_0x06a9
        L_0x0550:
            r2 = r16
            r10 = r18
            goto L_0x028c
        L_0x0556:
            r16 = r2
            int r1 = r4.getAttributeCount()     // Catch:{ zzakp -> 0x06b7 }
            r2 = 0
            com.google.android.gms.internal.ads.zzalw r32 = zzf(r4, r2)     // Catch:{ zzakp -> 0x06b7 }
            r34 = r20
            r2 = 0
            r17 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r27 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r29 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r33 = 0
            r35 = 0
        L_0x0577:
            if (r2 >= r1) goto L_0x0630
            java.lang.String r10 = r4.getAttributeName(r2)     // Catch:{ zzakp -> 0x0625 }
            java.lang.String r13 = r4.getAttributeValue(r2)     // Catch:{ zzakp -> 0x0625 }
            int r14 = r10.hashCode()     // Catch:{ zzakp -> 0x0625 }
            r21 = r1
            r1 = 5
            switch(r14) {
                case -934795532: goto L_0x05bc;
                case 99841: goto L_0x05b2;
                case 100571: goto L_0x05a8;
                case 93616297: goto L_0x059e;
                case 109780401: goto L_0x0596;
                case 1292595405: goto L_0x058c;
                default: goto L_0x058b;
            }
        L_0x058b:
            goto L_0x05c4
        L_0x058c:
            java.lang.String r14 = "backgroundImage"
            boolean r10 = r10.equals(r14)
            if (r10 == 0) goto L_0x05c4
            r10 = r1
            goto L_0x05c5
        L_0x0596:
            boolean r10 = r10.equals(r15)
            if (r10 == 0) goto L_0x05c4
            r10 = 3
            goto L_0x05c5
        L_0x059e:
            java.lang.String r14 = "begin"
            boolean r10 = r10.equals(r14)
            if (r10 == 0) goto L_0x05c4
            r10 = 0
            goto L_0x05c5
        L_0x05a8:
            java.lang.String r14 = "end"
            boolean r10 = r10.equals(r14)
            if (r10 == 0) goto L_0x05c4
            r10 = 1
            goto L_0x05c5
        L_0x05b2:
            java.lang.String r14 = "dur"
            boolean r10 = r10.equals(r14)
            if (r10 == 0) goto L_0x05c4
            r10 = 2
            goto L_0x05c5
        L_0x05bc:
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L_0x05c4
            r10 = 4
            goto L_0x05c5
        L_0x05c4:
            r10 = -1
        L_0x05c5:
            if (r10 == 0) goto L_0x0616
            r14 = 1
            if (r10 == r14) goto L_0x060e
            r14 = 2
            if (r10 == r14) goto L_0x0606
            r14 = 3
            if (r10 == r14) goto L_0x05f4
            r14 = 4
            if (r10 == r14) goto L_0x05ea
            if (r10 == r1) goto L_0x05d7
        L_0x05d5:
            r1 = 1
            goto L_0x05fe
        L_0x05d7:
            java.lang.String r1 = "#"
            boolean r1 = r13.startsWith(r1)     // Catch:{ zzakp -> 0x05e7 }
            if (r1 == 0) goto L_0x05d5
            r1 = 1
            java.lang.String r10 = r13.substring(r1)     // Catch:{ zzakp -> 0x0601 }
            r35 = r10
            goto L_0x05fe
        L_0x05e7:
            r0 = move-exception
            r1 = 1
            goto L_0x0602
        L_0x05ea:
            r1 = 1
            boolean r10 = r6.containsKey(r13)     // Catch:{ zzakp -> 0x0601 }
            if (r10 == 0) goto L_0x05fe
            r34 = r13
            goto L_0x05fe
        L_0x05f4:
            r1 = 1
            java.lang.String[] r10 = zzg(r13)     // Catch:{ zzakp -> 0x0601 }
            int r13 = r10.length     // Catch:{ zzakp -> 0x0601 }
            if (r13 <= 0) goto L_0x05fe
            r33 = r10
        L_0x05fe:
            r10 = r16
            goto L_0x061d
        L_0x0601:
            r0 = move-exception
        L_0x0602:
            r2 = r0
            r21 = r16
            goto L_0x062c
        L_0x0606:
            r10 = r16
            r1 = 1
            long r29 = zzc(r13, r10)     // Catch:{ zzakp -> 0x0661 }
            goto L_0x061d
        L_0x060e:
            r1 = r14
            r10 = r16
            long r17 = zzc(r13, r10)     // Catch:{ zzakp -> 0x0661 }
            goto L_0x061d
        L_0x0616:
            r10 = r16
            r1 = 1
            long r27 = zzc(r13, r10)     // Catch:{ zzakp -> 0x0661 }
        L_0x061d:
            int r2 = r2 + 1
            r16 = r10
            r1 = r21
            goto L_0x0577
        L_0x0625:
            r0 = move-exception
            r10 = r16
            r1 = 1
        L_0x0629:
            r2 = r0
            r21 = r10
        L_0x062c:
            r11 = r24
            goto L_0x06be
        L_0x0630:
            r10 = r16
            r1 = 1
            if (r9 == 0) goto L_0x0663
            long r13 = r9.zzd     // Catch:{ zzakp -> 0x0661 }
            r36 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r13 > r36 ? 1 : (r13 == r36 ? 0 : -1))
            if (r2 == 0) goto L_0x065d
            int r2 = (r27 > r36 ? 1 : (r27 == r36 ? 0 : -1))
            if (r2 == 0) goto L_0x0647
            long r15 = r27 + r13
            goto L_0x0649
        L_0x0647:
            r15 = r36
        L_0x0649:
            int r2 = (r17 > r36 ? 1 : (r17 == r36 ? 0 : -1))
            if (r2 == 0) goto L_0x0651
            long r17 = r17 + r13
            r2 = r9
            goto L_0x0666
        L_0x0651:
            r2 = r9
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r17 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x066b
        L_0x065d:
            r2 = r9
            r15 = r27
            goto L_0x0666
        L_0x0661:
            r0 = move-exception
            goto L_0x0629
        L_0x0663:
            r15 = r27
            r2 = 0
        L_0x0666:
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x066b:
            int r11 = (r17 > r13 ? 1 : (r17 == r13 ? 0 : -1))
            if (r11 != 0) goto L_0x068f
            int r11 = (r29 > r13 ? 1 : (r29 == r13 ? 0 : -1))
            if (r11 == 0) goto L_0x067a
            long r29 = r15 + r29
            r21 = r10
            r30 = r29
            goto L_0x0693
        L_0x067a:
            if (r2 == 0) goto L_0x068a
            r21 = r10
            long r10 = r2.zze     // Catch:{ zzakp -> 0x0687 }
            int r17 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r17 == 0) goto L_0x068c
            r30 = r10
            goto L_0x0693
        L_0x0687:
            r0 = move-exception
            r2 = r0
            goto L_0x062c
        L_0x068a:
            r21 = r10
        L_0x068c:
            r30 = r13
            goto L_0x0693
        L_0x068f:
            r21 = r10
            r30 = r17
        L_0x0693:
            java.lang.String r27 = r4.getName()     // Catch:{ zzakp -> 0x06b3 }
            r28 = r15
            r36 = r2
            com.google.android.gms.internal.ads.zzalq r2 = com.google.android.gms.internal.ads.zzalq.zzb(r27, r28, r30, r32, r33, r34, r35, r36)     // Catch:{ zzakp -> 0x06b3 }
            r11 = r24
            r11.push(r2)     // Catch:{ zzakp -> 0x06b1 }
            if (r9 == 0) goto L_0x06a9
            r9.zzf(r2)     // Catch:{ zzakp -> 0x06b1 }
        L_0x06a9:
            r17 = r3
            r18 = r8
            r16 = r21
            goto L_0x0729
        L_0x06b1:
            r0 = move-exception
            goto L_0x06bd
        L_0x06b3:
            r0 = move-exception
            r11 = r24
            goto L_0x06bd
        L_0x06b7:
            r0 = move-exception
            r21 = r16
            r11 = r24
            r1 = 1
        L_0x06bd:
            r2 = r0
        L_0x06be:
            java.lang.String r9 = "Suppressing parser error"
            com.google.android.gms.internal.ads.zzea.zzg(r12, r9, r2)     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            r15 = r1
            r17 = r3
            r18 = r8
            r16 = r21
            goto L_0x0720
        L_0x06cb:
            r26 = r2
            r25 = r11
            r22 = r14
            r23 = r15
            r2 = 4
            r11 = r8
            if (r10 != r2) goto L_0x06ea
            if (r9 == 0) goto L_0x06e8
            r1 = r9
            com.google.android.gms.internal.ads.zzalq r1 = (com.google.android.gms.internal.ads.zzalq) r1     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            java.lang.String r1 = r4.getText()     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            com.google.android.gms.internal.ads.zzalq r1 = com.google.android.gms.internal.ads.zzalq.zzc(r1)     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            r9.zzf(r1)     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            goto L_0x0729
        L_0x06e8:
            r1 = 0
            throw r1     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
        L_0x06ea:
            r2 = 3
            if (r10 != r2) goto L_0x0729
            java.lang.String r2 = r4.getName()     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            boolean r1 = r2.equals(r1)     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            if (r1 == 0) goto L_0x070a
            com.google.android.gms.internal.ads.zzalx r14 = new com.google.android.gms.internal.ads.zzalx     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            java.lang.Object r1 = r11.peek()     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            com.google.android.gms.internal.ads.zzalq r1 = (com.google.android.gms.internal.ads.zzalq) r1     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            if (r1 == 0) goto L_0x0708
            r2 = r1
            com.google.android.gms.internal.ads.zzalq r2 = (com.google.android.gms.internal.ads.zzalq) r2     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            r14.<init>(r1, r5, r6, r7)     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            goto L_0x070c
        L_0x0708:
            r1 = 0
            throw r1     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
        L_0x070a:
            r14 = r22
        L_0x070c:
            r11.pop()     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            goto L_0x072b
        L_0x0710:
            r20 = r1
            r26 = r2
            r25 = r11
            r1 = r12
            r22 = r14
            r23 = r15
            r11 = r8
            if (r10 != r1) goto L_0x0723
            int r15 = r23 + 1
        L_0x0720:
            r14 = r22
            goto L_0x072d
        L_0x0723:
            r1 = 3
            if (r10 != r1) goto L_0x0729
            int r15 = r23 + -1
            goto L_0x0720
        L_0x0729:
            r14 = r22
        L_0x072b:
            r15 = r23
        L_0x072d:
            r4.next()     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            int r10 = r4.getEventType()     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            r3 = r38
            r8 = r11
            r1 = r20
            r11 = r25
            r2 = r26
            r9 = 0
            goto L_0x005f
        L_0x0740:
            r22 = r14
            if (r22 == 0) goto L_0x0749
            r14 = r22
            com.google.android.gms.internal.ads.zzako r14 = (com.google.android.gms.internal.ads.zzako) r14     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
            return r14
        L_0x0749:
            r1 = 0
            throw r1     // Catch:{ XmlPullParserException -> 0x0755, IOException -> 0x074b }
        L_0x074b:
            r0 = move-exception
            r1 = r0
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "Unexpected error when reading input."
            r2.<init>(r3, r1)
            throw r2
        L_0x0755:
            r0 = move-exception
            r1 = r0
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "Unable to decode source"
            r2.<init>(r3, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzalt.zzb(byte[], int, int):com.google.android.gms.internal.ads.zzako");
    }

    public zzalt() {
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.zzi = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }
}
