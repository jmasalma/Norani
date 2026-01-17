package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzay {
    public static final /* synthetic */ int zza = 0;
    private static final ArrayList zzb = new ArrayList();
    private static final Pattern zzc = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int zza(java.lang.String r7, java.lang.String r8) {
        /*
            int r0 = r7.hashCode()
            r1 = 7
            r2 = 9
            r3 = 5
            r4 = 6
            r5 = 8
            r6 = 0
            switch(r0) {
                case -2123537834: goto L_0x0084;
                case -1365340241: goto L_0x007a;
                case -1095064472: goto L_0x0070;
                case -53558318: goto L_0x0066;
                case 187078296: goto L_0x005c;
                case 187078297: goto L_0x0052;
                case 550520934: goto L_0x0048;
                case 1504578661: goto L_0x003e;
                case 1504831518: goto L_0x0034;
                case 1504891608: goto L_0x0028;
                case 1505942594: goto L_0x001d;
                case 1556697186: goto L_0x0011;
                default: goto L_0x000f;
            }
        L_0x000f:
            goto L_0x008e
        L_0x0011:
            java.lang.String r0 = "audio/true-hd"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x008e
            r7 = 10
            goto L_0x008f
        L_0x001d:
            java.lang.String r0 = "audio/vnd.dts.hd"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x008e
            r7 = r1
            goto L_0x008f
        L_0x0028:
            java.lang.String r0 = "audio/opus"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x008e
            r7 = 11
            goto L_0x008f
        L_0x0034:
            java.lang.String r0 = "audio/mpeg"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x008e
            r7 = r6
            goto L_0x008f
        L_0x003e:
            java.lang.String r0 = "audio/eac3"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x008e
            r7 = 3
            goto L_0x008f
        L_0x0048:
            java.lang.String r0 = "audio/vnd.dts.uhd;profile=p2"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x008e
            r7 = r2
            goto L_0x008f
        L_0x0052:
            java.lang.String r0 = "audio/ac4"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x008e
            r7 = r3
            goto L_0x008f
        L_0x005c:
            java.lang.String r0 = "audio/ac3"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x008e
            r7 = 2
            goto L_0x008f
        L_0x0066:
            java.lang.String r0 = "audio/mp4a-latm"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x008e
            r7 = 1
            goto L_0x008f
        L_0x0070:
            java.lang.String r0 = "audio/vnd.dts"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x008e
            r7 = r4
            goto L_0x008f
        L_0x007a:
            java.lang.String r0 = "audio/vnd.dts.hd;profile=lbr"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x008e
            r7 = r5
            goto L_0x008f
        L_0x0084:
            java.lang.String r0 = "audio/eac3-joc"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x008e
            r7 = 4
            goto L_0x008f
        L_0x008e:
            r7 = -1
        L_0x008f:
            switch(r7) {
                case 0: goto L_0x00b5;
                case 1: goto L_0x00a6;
                case 2: goto L_0x00a5;
                case 3: goto L_0x00a4;
                case 4: goto L_0x00a1;
                case 5: goto L_0x009e;
                case 6: goto L_0x009d;
                case 7: goto L_0x009c;
                case 8: goto L_0x009c;
                case 9: goto L_0x0099;
                case 10: goto L_0x0096;
                case 11: goto L_0x0093;
                default: goto L_0x0092;
            }
        L_0x0092:
            return r6
        L_0x0093:
            r7 = 20
            return r7
        L_0x0096:
            r7 = 14
            return r7
        L_0x0099:
            r7 = 30
            return r7
        L_0x009c:
            return r5
        L_0x009d:
            return r1
        L_0x009e:
            r7 = 17
            return r7
        L_0x00a1:
            r7 = 18
            return r7
        L_0x00a4:
            return r4
        L_0x00a5:
            return r3
        L_0x00a6:
            if (r8 != 0) goto L_0x00a9
            return r6
        L_0x00a9:
            com.google.android.gms.internal.ads.zzax r7 = zzc(r8)
            if (r7 != 0) goto L_0x00b0
            return r6
        L_0x00b0:
            int r7 = r7.zza()
            return r7
        L_0x00b5:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzay.zza(java.lang.String, java.lang.String):int");
    }

    public static int zzb(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (zzh(str)) {
            return 1;
        }
        if (zzj(str)) {
            return 2;
        }
        if ("text".equals(zzk(str)) || "application/x-media3-cues".equals(str) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str)) {
            return 3;
        }
        if (zzi(str)) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        ArrayList arrayList = zzb;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            zzaw zzaw = (zzaw) arrayList.get(i);
            String str2 = zzaw.zza;
            if (str.equals((Object) null)) {
                int i2 = zzaw.zzc;
                return 0;
            }
        }
        return -1;
    }

    static zzax zzc(String str) {
        Matcher matcher = zzc.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String group = matcher.group(1);
        group.getClass();
        String str2 = group;
        String group2 = matcher.group(2);
        try {
            return new zzax(Integer.parseInt(group, 16), group2 != null ? Integer.parseInt(group2) : 0);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static String zzd(int i) {
        if (i == 32) {
            return "video/mp4v-es";
        }
        if (i == 33) {
            return "video/avc";
        }
        if (i == 35) {
            return "video/hevc";
        }
        if (i == 64) {
            return "audio/mp4a-latm";
        }
        if (i == 163) {
            return "video/wvc1";
        }
        if (i == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i == 221) {
            return "audio/vorbis";
        }
        if (i == 165) {
            return "audio/ac3";
        }
        if (i == 166) {
            return "audio/eac3";
        }
        switch (i) {
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
                return "video/mpeg2";
            case 102:
            case 103:
            case 104:
                return "audio/mp4a-latm";
            case 105:
            case 107:
                return "audio/mpeg";
            case 106:
                return "video/mpeg";
            case 108:
                return "image/jpeg";
            default:
                switch (i) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String zze(java.lang.String r1) {
        /*
            if (r1 != 0) goto L_0x0004
            r1 = 0
            return r1
        L_0x0004:
            java.lang.String r1 = com.google.android.gms.internal.ads.zzfuv.zza(r1)
            int r0 = r1.hashCode()
            switch(r0) {
                case -1833600100: goto L_0x004c;
                case -1007807498: goto L_0x0042;
                case -979095690: goto L_0x0038;
                case -586683234: goto L_0x002e;
                case -432836268: goto L_0x0024;
                case -432836267: goto L_0x001a;
                case 187090231: goto L_0x0010;
                default: goto L_0x000f;
            }
        L_0x000f:
            goto L_0x0056
        L_0x0010:
            java.lang.String r0 = "audio/mp3"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0056
            r0 = 2
            goto L_0x0057
        L_0x001a:
            java.lang.String r0 = "audio/mpeg-l2"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0056
            r0 = 6
            goto L_0x0057
        L_0x0024:
            java.lang.String r0 = "audio/mpeg-l1"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0056
            r0 = 5
            goto L_0x0057
        L_0x002e:
            java.lang.String r0 = "audio/x-wav"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0056
            r0 = 3
            goto L_0x0057
        L_0x0038:
            java.lang.String r0 = "application/x-mpegurl"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0056
            r0 = 4
            goto L_0x0057
        L_0x0042:
            java.lang.String r0 = "audio/x-flac"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0056
            r0 = 1
            goto L_0x0057
        L_0x004c:
            java.lang.String r0 = "video/x-mvhevc"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0056
            r0 = 0
            goto L_0x0057
        L_0x0056:
            r0 = -1
        L_0x0057:
            switch(r0) {
                case 0: goto L_0x006d;
                case 1: goto L_0x006a;
                case 2: goto L_0x0067;
                case 3: goto L_0x0064;
                case 4: goto L_0x0061;
                case 5: goto L_0x005e;
                case 6: goto L_0x005b;
                default: goto L_0x005a;
            }
        L_0x005a:
            return r1
        L_0x005b:
            java.lang.String r1 = "audio/mpeg-L2"
            return r1
        L_0x005e:
            java.lang.String r1 = "audio/mpeg-L1"
            return r1
        L_0x0061:
            java.lang.String r1 = "application/x-mpegURL"
            return r1
        L_0x0064:
            java.lang.String r1 = "audio/wav"
            return r1
        L_0x0067:
            java.lang.String r1 = "audio/mpeg"
            return r1
        L_0x006a:
            java.lang.String r1 = "audio/flac"
            return r1
        L_0x006d:
            java.lang.String r1 = "video/mv-hevc"
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzay.zze(java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0090, code lost:
        r3 = (r3 = zzc(r4)).zza();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean zzf(java.lang.String r3, java.lang.String r4) {
        /*
            r0 = 0
            if (r3 != 0) goto L_0x0004
            return r0
        L_0x0004:
            int r1 = r3.hashCode()
            r2 = 1
            switch(r1) {
                case -2123537834: goto L_0x0076;
                case -432837260: goto L_0x006c;
                case -432837259: goto L_0x0062;
                case -53558318: goto L_0x0057;
                case 187078296: goto L_0x004d;
                case 187094639: goto L_0x0043;
                case 1504578661: goto L_0x0038;
                case 1504619009: goto L_0x002e;
                case 1504831518: goto L_0x0024;
                case 1903231877: goto L_0x0019;
                case 1903589369: goto L_0x000e;
                default: goto L_0x000c;
            }
        L_0x000c:
            goto L_0x0081
        L_0x000e:
            java.lang.String r1 = "audio/g711-mlaw"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L_0x0081
            r3 = 5
            goto L_0x0082
        L_0x0019:
            java.lang.String r1 = "audio/g711-alaw"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L_0x0081
            r3 = 4
            goto L_0x0082
        L_0x0024:
            java.lang.String r1 = "audio/mpeg"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L_0x0081
            r3 = r0
            goto L_0x0082
        L_0x002e:
            java.lang.String r1 = "audio/flac"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L_0x0081
            r3 = 6
            goto L_0x0082
        L_0x0038:
            java.lang.String r1 = "audio/eac3"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L_0x0081
            r3 = 8
            goto L_0x0082
        L_0x0043:
            java.lang.String r1 = "audio/raw"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L_0x0081
            r3 = 3
            goto L_0x0082
        L_0x004d:
            java.lang.String r1 = "audio/ac3"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L_0x0081
            r3 = 7
            goto L_0x0082
        L_0x0057:
            java.lang.String r1 = "audio/mp4a-latm"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L_0x0081
            r3 = 10
            goto L_0x0082
        L_0x0062:
            java.lang.String r1 = "audio/mpeg-L2"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L_0x0081
            r3 = 2
            goto L_0x0082
        L_0x006c:
            java.lang.String r1 = "audio/mpeg-L1"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L_0x0081
            r3 = r2
            goto L_0x0082
        L_0x0076:
            java.lang.String r1 = "audio/eac3-joc"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L_0x0081
            r3 = 9
            goto L_0x0082
        L_0x0081:
            r3 = -1
        L_0x0082:
            switch(r3) {
                case 0: goto L_0x009c;
                case 1: goto L_0x009c;
                case 2: goto L_0x009c;
                case 3: goto L_0x009c;
                case 4: goto L_0x009c;
                case 5: goto L_0x009c;
                case 6: goto L_0x009c;
                case 7: goto L_0x009c;
                case 8: goto L_0x009c;
                case 9: goto L_0x009c;
                case 10: goto L_0x0086;
                default: goto L_0x0085;
            }
        L_0x0085:
            return r0
        L_0x0086:
            if (r4 != 0) goto L_0x0089
            return r0
        L_0x0089:
            com.google.android.gms.internal.ads.zzax r3 = zzc(r4)
            if (r3 != 0) goto L_0x0090
            return r0
        L_0x0090:
            int r3 = r3.zza()
            if (r3 == 0) goto L_0x009b
            r4 = 16
            if (r3 == r4) goto L_0x009b
            return r2
        L_0x009b:
            return r0
        L_0x009c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzay.zzf(java.lang.String, java.lang.String):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b8, code lost:
        r6 = zzc(r6);
     */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x01f4  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0202 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean zzg(java.lang.String r12, java.lang.String r13) {
        /*
            r0 = 0
            r1 = 0
            if (r12 == 0) goto L_0x0210
            java.lang.String r2 = com.google.android.gms.internal.ads.zzex.zza
            boolean r2 = android.text.TextUtils.isEmpty(r12)
            if (r2 == 0) goto L_0x000f
            java.lang.String[] r12 = new java.lang.String[r0]
            goto L_0x001a
        L_0x000f:
            java.lang.String r12 = r12.trim()
            java.lang.String r2 = "(\\s*,\\s*)"
            r3 = -1
            java.lang.String[] r12 = r12.split(r2, r3)
        L_0x001a:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            int r3 = r12.length
            r4 = r0
        L_0x0021:
            if (r4 >= r3) goto L_0x0206
            r5 = r12[r4]
            if (r5 != 0) goto L_0x002a
        L_0x0027:
            r6 = r1
            goto L_0x01ee
        L_0x002a:
            java.lang.String r6 = r5.trim()
            java.lang.String r6 = com.google.android.gms.internal.ads.zzfuv.zza(r6)
            java.lang.String r7 = "avc1"
            boolean r7 = r6.startsWith(r7)
            if (r7 != 0) goto L_0x01ec
            java.lang.String r7 = "avc3"
            boolean r7 = r6.startsWith(r7)
            if (r7 == 0) goto L_0x0044
            goto L_0x01ec
        L_0x0044:
            java.lang.String r7 = "hev1"
            boolean r7 = r6.startsWith(r7)
            if (r7 != 0) goto L_0x01e9
            java.lang.String r7 = "hvc1"
            boolean r7 = r6.startsWith(r7)
            if (r7 == 0) goto L_0x0056
            goto L_0x01e9
        L_0x0056:
            java.lang.String r7 = "dvav"
            boolean r7 = r6.startsWith(r7)
            if (r7 != 0) goto L_0x01e6
            java.lang.String r7 = "dva1"
            boolean r7 = r6.startsWith(r7)
            if (r7 != 0) goto L_0x01e6
            java.lang.String r7 = "dvhe"
            boolean r7 = r6.startsWith(r7)
            if (r7 != 0) goto L_0x01e6
            java.lang.String r7 = "dvh1"
            boolean r7 = r6.startsWith(r7)
            if (r7 == 0) goto L_0x0078
            goto L_0x01e6
        L_0x0078:
            java.lang.String r7 = "av01"
            boolean r7 = r6.startsWith(r7)
            if (r7 == 0) goto L_0x0084
            java.lang.String r6 = "video/av01"
            goto L_0x01ee
        L_0x0084:
            java.lang.String r7 = "vp9"
            boolean r7 = r6.startsWith(r7)
            if (r7 != 0) goto L_0x01e3
            java.lang.String r7 = "vp09"
            boolean r7 = r6.startsWith(r7)
            if (r7 == 0) goto L_0x0096
            goto L_0x01e3
        L_0x0096:
            java.lang.String r7 = "vp8"
            boolean r7 = r6.startsWith(r7)
            if (r7 != 0) goto L_0x01e0
            java.lang.String r7 = "vp08"
            boolean r7 = r6.startsWith(r7)
            if (r7 == 0) goto L_0x00a8
            goto L_0x01e0
        L_0x00a8:
            java.lang.String r7 = "mp4a"
            boolean r7 = r6.startsWith(r7)
            if (r7 == 0) goto L_0x00cc
            java.lang.String r7 = "mp4a."
            boolean r7 = r6.startsWith(r7)
            if (r7 == 0) goto L_0x00c5
            com.google.android.gms.internal.ads.zzax r6 = zzc(r6)
            if (r6 == 0) goto L_0x00c5
            int r6 = r6.zza
            java.lang.String r6 = zzd(r6)
            goto L_0x00c6
        L_0x00c5:
            r6 = r1
        L_0x00c6:
            if (r6 != 0) goto L_0x01ee
            java.lang.String r6 = "audio/mp4a-latm"
            goto L_0x01ee
        L_0x00cc:
            java.lang.String r7 = "mha1"
            boolean r7 = r6.startsWith(r7)
            if (r7 == 0) goto L_0x00d8
            java.lang.String r6 = "audio/mha1"
            goto L_0x01ee
        L_0x00d8:
            java.lang.String r7 = "mhm1"
            boolean r7 = r6.startsWith(r7)
            if (r7 == 0) goto L_0x00e4
            java.lang.String r6 = "audio/mhm1"
            goto L_0x01ee
        L_0x00e4:
            java.lang.String r7 = "ac-3"
            boolean r7 = r6.startsWith(r7)
            if (r7 != 0) goto L_0x01dd
            java.lang.String r7 = "dac3"
            boolean r7 = r6.startsWith(r7)
            if (r7 == 0) goto L_0x00f6
            goto L_0x01dd
        L_0x00f6:
            java.lang.String r7 = "ec-3"
            boolean r7 = r6.startsWith(r7)
            if (r7 != 0) goto L_0x01da
            java.lang.String r7 = "dec3"
            boolean r7 = r6.startsWith(r7)
            if (r7 == 0) goto L_0x0108
            goto L_0x01da
        L_0x0108:
            java.lang.String r7 = "ec+3"
            boolean r7 = r6.startsWith(r7)
            if (r7 == 0) goto L_0x0114
            java.lang.String r6 = "audio/eac3-joc"
            goto L_0x01ee
        L_0x0114:
            java.lang.String r7 = "ac-4"
            boolean r7 = r6.startsWith(r7)
            if (r7 != 0) goto L_0x01d7
            java.lang.String r7 = "dac4"
            boolean r7 = r6.startsWith(r7)
            if (r7 == 0) goto L_0x0126
            goto L_0x01d7
        L_0x0126:
            java.lang.String r7 = "dtsc"
            boolean r7 = r6.startsWith(r7)
            if (r7 == 0) goto L_0x0132
            java.lang.String r6 = "audio/vnd.dts"
            goto L_0x01ee
        L_0x0132:
            java.lang.String r7 = "dtse"
            boolean r7 = r6.startsWith(r7)
            if (r7 == 0) goto L_0x013e
            java.lang.String r6 = "audio/vnd.dts.hd;profile=lbr"
            goto L_0x01ee
        L_0x013e:
            java.lang.String r7 = "dtsh"
            boolean r7 = r6.startsWith(r7)
            if (r7 != 0) goto L_0x01d4
            java.lang.String r7 = "dtsl"
            boolean r7 = r6.startsWith(r7)
            if (r7 == 0) goto L_0x0150
            goto L_0x01d4
        L_0x0150:
            java.lang.String r7 = "dtsx"
            boolean r7 = r6.startsWith(r7)
            if (r7 == 0) goto L_0x015c
            java.lang.String r6 = "audio/vnd.dts.uhd;profile=p2"
            goto L_0x01ee
        L_0x015c:
            java.lang.String r7 = "opus"
            boolean r7 = r6.startsWith(r7)
            if (r7 == 0) goto L_0x0168
            java.lang.String r6 = "audio/opus"
            goto L_0x01ee
        L_0x0168:
            java.lang.String r7 = "vorbis"
            boolean r7 = r6.startsWith(r7)
            if (r7 == 0) goto L_0x0174
            java.lang.String r6 = "audio/vorbis"
            goto L_0x01ee
        L_0x0174:
            java.lang.String r7 = "flac"
            boolean r7 = r6.startsWith(r7)
            if (r7 == 0) goto L_0x0180
            java.lang.String r6 = "audio/flac"
            goto L_0x01ee
        L_0x0180:
            java.lang.String r7 = "stpp"
            boolean r7 = r6.startsWith(r7)
            if (r7 == 0) goto L_0x018c
            java.lang.String r6 = "application/ttml+xml"
            goto L_0x01ee
        L_0x018c:
            java.lang.String r7 = "wvtt"
            boolean r7 = r6.startsWith(r7)
            if (r7 == 0) goto L_0x0197
            java.lang.String r6 = "text/vtt"
            goto L_0x01ee
        L_0x0197:
            java.lang.String r7 = "cea708"
            boolean r7 = r6.contains(r7)
            if (r7 == 0) goto L_0x01a2
            java.lang.String r6 = "application/cea-708"
            goto L_0x01ee
        L_0x01a2:
            java.lang.String r7 = "eia608"
            boolean r7 = r6.contains(r7)
            if (r7 != 0) goto L_0x01d1
            java.lang.String r7 = "cea608"
            boolean r7 = r6.contains(r7)
            if (r7 == 0) goto L_0x01b3
            goto L_0x01d1
        L_0x01b3:
            java.util.ArrayList r7 = zzb
            int r8 = r7.size()
            r9 = r0
        L_0x01ba:
            if (r9 >= r8) goto L_0x0027
            java.lang.Object r10 = r7.get(r9)
            com.google.android.gms.internal.ads.zzaw r10 = (com.google.android.gms.internal.ads.zzaw) r10
            java.lang.String r11 = r10.zzb
            boolean r11 = r6.startsWith(r1)
            if (r11 == 0) goto L_0x01ce
            java.lang.String r6 = r10.zza
            goto L_0x0027
        L_0x01ce:
            int r9 = r9 + 1
            goto L_0x01ba
        L_0x01d1:
            java.lang.String r6 = "application/cea-608"
            goto L_0x01ee
        L_0x01d4:
            java.lang.String r6 = "audio/vnd.dts.hd"
            goto L_0x01ee
        L_0x01d7:
            java.lang.String r6 = "audio/ac4"
            goto L_0x01ee
        L_0x01da:
            java.lang.String r6 = "audio/eac3"
            goto L_0x01ee
        L_0x01dd:
            java.lang.String r6 = "audio/ac3"
            goto L_0x01ee
        L_0x01e0:
            java.lang.String r6 = "video/x-vnd.on2.vp8"
            goto L_0x01ee
        L_0x01e3:
            java.lang.String r6 = "video/x-vnd.on2.vp9"
            goto L_0x01ee
        L_0x01e6:
            java.lang.String r6 = "video/dolby-vision"
            goto L_0x01ee
        L_0x01e9:
            java.lang.String r6 = "video/hevc"
            goto L_0x01ee
        L_0x01ec:
            java.lang.String r6 = "video/avc"
        L_0x01ee:
            boolean r6 = r13.equals(r6)
            if (r6 == 0) goto L_0x0202
            int r6 = r2.length()
            if (r6 <= 0) goto L_0x01ff
            java.lang.String r6 = ","
            r2.append(r6)
        L_0x01ff:
            r2.append(r5)
        L_0x0202:
            int r4 = r4 + 1
            goto L_0x0021
        L_0x0206:
            int r12 = r2.length()
            if (r12 <= 0) goto L_0x0210
            java.lang.String r1 = r2.toString()
        L_0x0210:
            if (r1 == 0) goto L_0x0214
            r12 = 1
            return r12
        L_0x0214:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzay.zzg(java.lang.String, java.lang.String):boolean");
    }

    public static boolean zzh(String str) {
        return "audio".equals(zzk(str));
    }

    public static boolean zzi(String str) {
        return "image".equals(zzk(str)) || "application/x-image-uri".equals(str);
    }

    public static boolean zzj(String str) {
        return "video".equals(zzk(str));
    }

    private static String zzk(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }
}
