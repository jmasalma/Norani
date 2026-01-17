package com.google.android.gms.internal.ads;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzalj implements zzakt {
    private static final Pattern zza = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    private final boolean zzb;
    private final zzali zzc;
    private final zzen zzd;
    private Map zze;
    private float zzf;
    private float zzg;

    public zzalj() {
        this((List) null);
    }

    private static float zzb(int i) {
        if (i == 0) {
            return 0.05f;
        }
        if (i != 1) {
            return i != 2 ? -3.4028235E38f : 0.95f;
        }
        return 0.5f;
    }

    private static int zzc(long j, List list, List list2) {
        int i;
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                if (((Long) list.get(size)).longValue() != j) {
                    if (((Long) list.get(size)).longValue() < j) {
                        i = size + 1;
                        break;
                    }
                } else {
                    return size;
                }
            } else {
                i = 0;
                break;
            }
        }
        list.add(i, Long.valueOf(j));
        list2.add(i, i == 0 ? new ArrayList() : new ArrayList((Collection) list2.get(i - 1)));
        return i;
    }

    private static long zzd(String str) {
        Matcher matcher = zza.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String group = matcher.group(1);
        String str2 = zzex.zza;
        String str3 = group;
        String group2 = matcher.group(2);
        String str4 = group2;
        String group3 = matcher.group(3);
        String str5 = group3;
        String group4 = matcher.group(4);
        String str6 = group4;
        return (Long.parseLong(group) * 3600000000L) + (Long.parseLong(group2) * 60000000) + (Long.parseLong(group3) * 1000000) + (Long.parseLong(group4) * 10000);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0050, code lost:
        if (r3.equals("playresx") != false) goto L_0x0054;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zze(com.google.android.gms.internal.ads.zzen r7, java.nio.charset.Charset r8) {
        /*
            r6 = this;
        L_0x0000:
            java.lang.String r0 = r7.zzz(r8)
            if (r0 == 0) goto L_0x00dd
            java.lang.String r1 = "[Script Info]"
            boolean r1 = r1.equalsIgnoreCase(r0)
            r2 = 91
            if (r1 == 0) goto L_0x0073
        L_0x0010:
            java.lang.String r0 = r7.zzz(r8)
            if (r0 == 0) goto L_0x0000
            int r1 = r7.zza()
            if (r1 == 0) goto L_0x0022
            int r1 = r7.zze(r8)
            if (r1 == r2) goto L_0x0000
        L_0x0022:
            java.lang.String r1 = ":"
            java.lang.String[] r0 = r0.split(r1)
            int r1 = r0.length
            r3 = 2
            if (r1 != r3) goto L_0x0010
            r1 = 0
            r3 = r0[r1]
            java.lang.String r3 = r3.trim()
            java.lang.String r3 = com.google.android.gms.internal.ads.zzfuv.zza(r3)
            int r4 = r3.hashCode()
            r5 = 1
            switch(r4) {
                case 1879649548: goto L_0x004a;
                case 1879649549: goto L_0x0040;
                default: goto L_0x003f;
            }
        L_0x003f:
            goto L_0x0053
        L_0x0040:
            java.lang.String r1 = "playresy"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x0053
            r1 = r5
            goto L_0x0054
        L_0x004a:
            java.lang.String r4 = "playresx"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0053
            goto L_0x0054
        L_0x0053:
            r1 = -1
        L_0x0054:
            if (r1 == 0) goto L_0x0066
            if (r1 == r5) goto L_0x0059
            goto L_0x0010
        L_0x0059:
            r0 = r0[r5]     // Catch:{ NumberFormatException -> 0x0010 }
            java.lang.String r0 = r0.trim()     // Catch:{ NumberFormatException -> 0x0010 }
            float r0 = java.lang.Float.parseFloat(r0)     // Catch:{ NumberFormatException -> 0x0010 }
            r6.zzg = r0     // Catch:{ NumberFormatException -> 0x0010 }
            goto L_0x0010
        L_0x0066:
            r0 = r0[r5]     // Catch:{ NumberFormatException -> 0x0010 }
            java.lang.String r0 = r0.trim()     // Catch:{ NumberFormatException -> 0x0010 }
            float r0 = java.lang.Float.parseFloat(r0)     // Catch:{ NumberFormatException -> 0x0010 }
            r6.zzf = r0     // Catch:{ NumberFormatException -> 0x0010 }
            goto L_0x0010
        L_0x0073:
            java.lang.String r1 = "[V4+ Styles]"
            boolean r1 = r1.equalsIgnoreCase(r0)
            java.lang.String r3 = "SsaParser"
            if (r1 == 0) goto L_0x00c6
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r1 = 0
        L_0x0083:
            java.lang.String r4 = r7.zzz(r8)
            if (r4 == 0) goto L_0x00c2
            int r5 = r7.zza()
            if (r5 == 0) goto L_0x0095
            int r5 = r7.zze(r8)
            if (r5 == r2) goto L_0x00c2
        L_0x0095:
            java.lang.String r5 = "Format:"
            boolean r5 = r4.startsWith(r5)
            if (r5 == 0) goto L_0x00a2
            com.google.android.gms.internal.ads.zzalk r1 = com.google.android.gms.internal.ads.zzalk.zza(r4)
            goto L_0x0083
        L_0x00a2:
            java.lang.String r5 = "Style:"
            boolean r5 = r4.startsWith(r5)
            if (r5 == 0) goto L_0x0083
            if (r1 != 0) goto L_0x00b6
            java.lang.String r5 = "Skipping 'Style:' line before 'Format:' line: "
            java.lang.String r4 = r5.concat(r4)
            com.google.android.gms.internal.ads.zzea.zzf(r3, r4)
            goto L_0x0083
        L_0x00b6:
            com.google.android.gms.internal.ads.zzalm r4 = com.google.android.gms.internal.ads.zzalm.zzb(r4, r1)
            if (r4 == 0) goto L_0x0083
            java.lang.String r5 = r4.zza
            r0.put(r5, r4)
            goto L_0x0083
        L_0x00c2:
            r6.zze = r0
            goto L_0x0000
        L_0x00c6:
            java.lang.String r1 = "[V4 Styles]"
            boolean r1 = r1.equalsIgnoreCase(r0)
            if (r1 == 0) goto L_0x00d5
            java.lang.String r0 = "[V4 Styles] are not supported"
            com.google.android.gms.internal.ads.zzea.zze(r3, r0)
            goto L_0x0000
        L_0x00d5:
            java.lang.String r1 = "[Events]"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0000
        L_0x00dd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzalj.zze(com.google.android.gms.internal.ads.zzen, java.nio.charset.Charset):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0241, code lost:
        if (r8 == -3.4028235E38f) goto L_0x0255;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0245, code lost:
        if (r7 == -3.4028235E38f) goto L_0x0255;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0247, code lost:
        r1.zzh(r0.x / r7);
        r1.zze(r0.y / r8, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0255, code lost:
        r1.zzh(zzb(r1.zzb()));
        r1.zze(zzb(r1.zza()), 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x026c, code lost:
        r0 = r1.zzq();
        r1 = zzc(r14, r3, r2);
        r4 = zzc(r21, r3, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x027a, code lost:
        if (r1 >= r4) goto L_0x029c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x027c, code lost:
        ((java.util.List) r2.get(r1)).add(r0);
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00d0, code lost:
        r7 = r4.zzd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01fd, code lost:
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01fe, code lost:
        r1.zzm(r6);
        r10 = kotlin.jvm.internal.IntCompanionObject.MIN_VALUE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0203, code lost:
        switch(r0) {
            case -1: goto L_0x021c;
            case 0: goto L_0x0206;
            case 1: goto L_0x021a;
            case 2: goto L_0x0218;
            case 3: goto L_0x0216;
            case 4: goto L_0x021a;
            case 5: goto L_0x0218;
            case 6: goto L_0x0216;
            case 7: goto L_0x021a;
            case 8: goto L_0x0218;
            case 9: goto L_0x0216;
            default: goto L_0x0206;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0206, code lost:
        com.google.android.gms.internal.ads.zzea.zzf("SsaParser", "Unknown alignment: " + r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0216, code lost:
        r6 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0218, code lost:
        r6 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x021a, code lost:
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x021c, code lost:
        r6 = Integer.MIN_VALUE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x021d, code lost:
        r1.zzi(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0220, code lost:
        switch(r0) {
            case -1: goto L_0x0238;
            case 0: goto L_0x0223;
            case 1: goto L_0x0237;
            case 2: goto L_0x0237;
            case 3: goto L_0x0237;
            case 4: goto L_0x0235;
            case 5: goto L_0x0235;
            case 6: goto L_0x0235;
            case 7: goto L_0x0233;
            case 8: goto L_0x0233;
            case 9: goto L_0x0233;
            default: goto L_0x0223;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0223, code lost:
        com.google.android.gms.internal.ads.zzea.zzf("SsaParser", "Unknown alignment: " + r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0233, code lost:
        r10 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0235, code lost:
        r10 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0237, code lost:
        r10 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0238, code lost:
        r1.zzf(r10);
        r0 = r9.zzb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x023d, code lost:
        if (r0 == null) goto L_0x0255;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01af  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01bf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(byte[] r24, int r25, int r26, com.google.android.gms.internal.ads.zzaks r27, com.google.android.gms.internal.ads.zzdn r28) {
        /*
            r23 = this;
            r0 = r23
            r1 = r25
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int r4 = r1 + r26
            com.google.android.gms.internal.ads.zzen r5 = r0.zzd
            r6 = r24
            r5.zzJ(r6, r4)
            r5.zzL(r1)
            java.nio.charset.Charset r1 = r5.zzC()
            if (r1 != 0) goto L_0x0022
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8
        L_0x0022:
            boolean r4 = r0.zzb
            if (r4 != 0) goto L_0x002b
            r0.zze(r5, r1)
            r4 = 0
            goto L_0x002d
        L_0x002b:
            com.google.android.gms.internal.ads.zzali r4 = r0.zzc
        L_0x002d:
            java.lang.String r7 = r5.zzz(r1)
            r8 = -1
            if (r7 == 0) goto L_0x02a6
            java.lang.String r11 = "Format:"
            boolean r11 = r7.startsWith(r11)
            if (r11 == 0) goto L_0x0041
            com.google.android.gms.internal.ads.zzali r4 = com.google.android.gms.internal.ads.zzali.zza(r7)
            goto L_0x002d
        L_0x0041:
            java.lang.String r11 = "Dialogue:"
            boolean r12 = r7.startsWith(r11)
            if (r12 == 0) goto L_0x0296
            java.lang.String r12 = "SsaParser"
            if (r4 != 0) goto L_0x0058
            java.lang.String r8 = "Skipping dialogue line before complete format: "
            java.lang.String r7 = r8.concat(r7)
            com.google.android.gms.internal.ads.zzea.zzf(r12, r7)
            goto L_0x0296
        L_0x0058:
            boolean r11 = r7.startsWith(r11)
            com.google.android.gms.internal.ads.zzdd.zzd(r11)
            r11 = 9
            java.lang.String r11 = r7.substring(r11)
            int r13 = r4.zzf
            java.lang.String r14 = ","
            java.lang.String[] r11 = r11.split(r14, r13)
            int r14 = r11.length
            if (r14 == r13) goto L_0x007b
            java.lang.String r8 = "Skipping dialogue line with fewer columns than format: "
            java.lang.String r7 = r8.concat(r7)
            com.google.android.gms.internal.ads.zzea.zzf(r12, r7)
            goto L_0x0296
        L_0x007b:
            int r13 = r4.zza
            if (r13 == r8) goto L_0x009b
            r13 = r11[r13]     // Catch:{ RuntimeException -> 0x008a }
            java.lang.String r13 = r13.trim()     // Catch:{ RuntimeException -> 0x008a }
            int r13 = java.lang.Integer.parseInt(r13)     // Catch:{ RuntimeException -> 0x008a }
            goto L_0x009c
        L_0x008a:
            int r13 = r4.zza
            r13 = r11[r13]
            java.lang.String r13 = java.lang.String.valueOf(r13)
            java.lang.String r14 = "Fail to parse layer: "
            java.lang.String r13 = r14.concat(r13)
            com.google.android.gms.internal.ads.zzea.zzf(r12, r13)
        L_0x009b:
            r13 = 0
        L_0x009c:
            int r14 = r4.zzb
            r14 = r11[r14]
            long r14 = zzd(r14)
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r18 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            java.lang.String r6 = "Skipping invalid timing: "
            if (r18 != 0) goto L_0x00b8
            java.lang.String r6 = r6.concat(r7)
            com.google.android.gms.internal.ads.zzea.zzf(r12, r6)
            goto L_0x0296
        L_0x00b8:
            int r9 = r4.zzc
            r9 = r11[r9]
            r27 = r11
            long r10 = zzd(r9)
            int r9 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r9 == 0) goto L_0x0288
            int r9 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r9 > 0) goto L_0x00cc
            goto L_0x0288
        L_0x00cc:
            java.util.Map r6 = r0.zze
            if (r6 == 0) goto L_0x00e1
            int r7 = r4.zzd
            if (r7 == r8) goto L_0x00e1
            r7 = r27[r7]
            java.lang.String r7 = r7.trim()
            java.lang.Object r6 = r6.get(r7)
            com.google.android.gms.internal.ads.zzalm r6 = (com.google.android.gms.internal.ads.zzalm) r6
            goto L_0x00e2
        L_0x00e1:
            r6 = 0
        L_0x00e2:
            int r7 = r4.zze
            r7 = r27[r7]
            com.google.android.gms.internal.ads.zzall r9 = com.google.android.gms.internal.ads.zzall.zza(r7)
            java.lang.String r7 = com.google.android.gms.internal.ads.zzall.zzb(r7)
            java.lang.String r8 = "\\N"
            r16 = r1
            java.lang.String r1 = "\n"
            java.lang.String r7 = r7.replace(r8, r1)
            java.lang.String r8 = "\\n"
            java.lang.String r1 = r7.replace(r8, r1)
            java.lang.String r7 = "\\h"
            java.lang.String r8 = " "
            java.lang.String r1 = r1.replace(r7, r8)
            float r7 = r0.zzf
            float r8 = r0.zzg
            android.text.SpannableString r0 = new android.text.SpannableString
            r0.<init>(r1)
            com.google.android.gms.internal.ads.zzcs r1 = new com.google.android.gms.internal.ads.zzcs
            r1.<init>()
            r1.zzl(r0)
            r1.zzp(r13)
            r17 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            if (r6 == 0) goto L_0x01cc
            java.lang.Integer r13 = r6.zzc
            r19 = r4
            if (r13 == 0) goto L_0x013d
            android.text.style.ForegroundColorSpan r4 = new android.text.style.ForegroundColorSpan
            int r13 = r13.intValue()
            r4.<init>(r13)
            int r13 = r0.length()
            r20 = r5
            r21 = r10
            r5 = 33
            r10 = 0
            r0.setSpan(r4, r10, r13, r5)
            goto L_0x0141
        L_0x013d:
            r20 = r5
            r21 = r10
        L_0x0141:
            int r4 = r6.zzj
            r5 = 3
            if (r4 != r5) goto L_0x015d
            java.lang.Integer r4 = r6.zzd
            if (r4 == 0) goto L_0x015d
            android.text.style.BackgroundColorSpan r10 = new android.text.style.BackgroundColorSpan
            int r4 = r4.intValue()
            r10.<init>(r4)
            int r4 = r0.length()
            r11 = 33
            r13 = 0
            r0.setSpan(r10, r13, r4, r11)
        L_0x015d:
            float r4 = r6.zze
            int r10 = (r4 > r17 ? 1 : (r4 == r17 ? 0 : -1))
            if (r10 == 0) goto L_0x016c
            int r10 = (r8 > r17 ? 1 : (r8 == r17 ? 0 : -1))
            if (r10 == 0) goto L_0x016c
            float r4 = r4 / r8
            r10 = 1
            r1.zzn(r4, r10)
        L_0x016c:
            boolean r4 = r6.zzf
            if (r4 == 0) goto L_0x0195
            boolean r4 = r6.zzg
            if (r4 == 0) goto L_0x0184
            android.text.style.StyleSpan r4 = new android.text.style.StyleSpan
            r4.<init>(r5)
            int r5 = r0.length()
            r10 = 33
            r11 = 0
            r0.setSpan(r4, r11, r5, r10)
            goto L_0x01aa
        L_0x0184:
            r10 = 33
            r11 = 0
            android.text.style.StyleSpan r4 = new android.text.style.StyleSpan
            r5 = 1
            r4.<init>(r5)
            int r5 = r0.length()
            r0.setSpan(r4, r11, r5, r10)
            goto L_0x01aa
        L_0x0195:
            r10 = 33
            r11 = 0
            boolean r4 = r6.zzg
            if (r4 == 0) goto L_0x01aa
            android.text.style.StyleSpan r4 = new android.text.style.StyleSpan
            r5 = 2
            r4.<init>(r5)
            int r13 = r0.length()
            r0.setSpan(r4, r11, r13, r10)
            goto L_0x01ab
        L_0x01aa:
            r5 = 2
        L_0x01ab:
            boolean r4 = r6.zzh
            if (r4 == 0) goto L_0x01bb
            android.text.style.UnderlineSpan r4 = new android.text.style.UnderlineSpan
            r4.<init>()
            int r13 = r0.length()
            r0.setSpan(r4, r11, r13, r10)
        L_0x01bb:
            boolean r4 = r6.zzi
            if (r4 == 0) goto L_0x01d3
            android.text.style.StrikethroughSpan r4 = new android.text.style.StrikethroughSpan
            r4.<init>()
            int r13 = r0.length()
            r0.setSpan(r4, r11, r13, r10)
            goto L_0x01d3
        L_0x01cc:
            r19 = r4
            r20 = r5
            r21 = r10
            r5 = 2
        L_0x01d3:
            int r0 = r9.zza
            r4 = -1
            if (r0 == r4) goto L_0x01d9
            goto L_0x01df
        L_0x01d9:
            if (r6 == 0) goto L_0x01de
            int r0 = r6.zzb
            goto L_0x01df
        L_0x01de:
            r0 = -1
        L_0x01df:
            java.lang.String r4 = "Unknown alignment: "
            switch(r0) {
                case -1: goto L_0x01fd;
                case 0: goto L_0x01e4;
                case 1: goto L_0x01fa;
                case 2: goto L_0x01f7;
                case 3: goto L_0x01f4;
                case 4: goto L_0x01fa;
                case 5: goto L_0x01f7;
                case 6: goto L_0x01f4;
                case 7: goto L_0x01fa;
                case 8: goto L_0x01f7;
                case 9: goto L_0x01f4;
                default: goto L_0x01e4;
            }
        L_0x01e4:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r4)
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            com.google.android.gms.internal.ads.zzea.zzf(r12, r6)
            goto L_0x01fd
        L_0x01f4:
            android.text.Layout$Alignment r6 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            goto L_0x01fe
        L_0x01f7:
            android.text.Layout$Alignment r6 = android.text.Layout.Alignment.ALIGN_CENTER
            goto L_0x01fe
        L_0x01fa:
            android.text.Layout$Alignment r6 = android.text.Layout.Alignment.ALIGN_NORMAL
            goto L_0x01fe
        L_0x01fd:
            r6 = 0
        L_0x01fe:
            r1.zzm(r6)
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            switch(r0) {
                case -1: goto L_0x021c;
                case 0: goto L_0x0206;
                case 1: goto L_0x021a;
                case 2: goto L_0x0218;
                case 3: goto L_0x0216;
                case 4: goto L_0x021a;
                case 5: goto L_0x0218;
                case 6: goto L_0x0216;
                case 7: goto L_0x021a;
                case 8: goto L_0x0218;
                case 9: goto L_0x0216;
                default: goto L_0x0206;
            }
        L_0x0206:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r4)
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            com.google.android.gms.internal.ads.zzea.zzf(r12, r6)
            goto L_0x021c
        L_0x0216:
            r6 = r5
            goto L_0x021d
        L_0x0218:
            r6 = 1
            goto L_0x021d
        L_0x021a:
            r6 = 0
            goto L_0x021d
        L_0x021c:
            r6 = r10
        L_0x021d:
            r1.zzi(r6)
            switch(r0) {
                case -1: goto L_0x0238;
                case 0: goto L_0x0223;
                case 1: goto L_0x0237;
                case 2: goto L_0x0237;
                case 3: goto L_0x0237;
                case 4: goto L_0x0235;
                case 5: goto L_0x0235;
                case 6: goto L_0x0235;
                case 7: goto L_0x0233;
                case 8: goto L_0x0233;
                case 9: goto L_0x0233;
                default: goto L_0x0223;
            }
        L_0x0223:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r4)
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            com.google.android.gms.internal.ads.zzea.zzf(r12, r0)
            goto L_0x0238
        L_0x0233:
            r10 = 0
            goto L_0x0238
        L_0x0235:
            r10 = 1
            goto L_0x0238
        L_0x0237:
            r10 = r5
        L_0x0238:
            r1.zzf(r10)
            android.graphics.PointF r0 = r9.zzb
            if (r0 == 0) goto L_0x0255
            int r4 = (r8 > r17 ? 1 : (r8 == r17 ? 0 : -1))
            if (r4 == 0) goto L_0x0255
            int r4 = (r7 > r17 ? 1 : (r7 == r17 ? 0 : -1))
            if (r4 == 0) goto L_0x0255
            float r4 = r0.x
            float r4 = r4 / r7
            r1.zzh(r4)
            float r0 = r0.y
            float r0 = r0 / r8
            r10 = 0
            r1.zze(r0, r10)
            goto L_0x026c
        L_0x0255:
            r10 = 0
            int r0 = r1.zzb()
            float r0 = zzb(r0)
            r1.zzh(r0)
            int r0 = r1.zza()
            float r0 = zzb(r0)
            r1.zze(r0, r10)
        L_0x026c:
            com.google.android.gms.internal.ads.zzcu r0 = r1.zzq()
            int r1 = zzc(r14, r3, r2)
            r4 = r21
            int r4 = zzc(r4, r3, r2)
        L_0x027a:
            if (r1 >= r4) goto L_0x029c
            java.lang.Object r5 = r2.get(r1)
            java.util.List r5 = (java.util.List) r5
            r5.add(r0)
            int r1 = r1 + 1
            goto L_0x027a
        L_0x0288:
            r16 = r1
            r19 = r4
            r20 = r5
            java.lang.String r0 = r6.concat(r7)
            com.google.android.gms.internal.ads.zzea.zzf(r12, r0)
            goto L_0x029c
        L_0x0296:
            r16 = r1
            r19 = r4
            r20 = r5
        L_0x029c:
            r0 = r23
            r1 = r16
            r4 = r19
            r5 = r20
            goto L_0x002d
        L_0x02a6:
            r10 = 0
            r0 = r10
        L_0x02a8:
            int r1 = r2.size()
            if (r0 >= r1) goto L_0x02f6
            java.lang.Object r1 = r2.get(r0)
            r5 = r1
            java.util.List r5 = (java.util.List) r5
            boolean r1 = r5.isEmpty()
            if (r1 == 0) goto L_0x02c3
            if (r0 == 0) goto L_0x02c2
            r4 = r28
            r1 = 1
            r11 = -1
            goto L_0x02ee
        L_0x02c2:
            r0 = r10
        L_0x02c3:
            int r1 = r2.size()
            r11 = -1
            int r1 = r1 + r11
            if (r0 == r1) goto L_0x02f0
            java.lang.Object r1 = r3.get(r0)
            java.lang.Long r1 = (java.lang.Long) r1
            long r6 = r1.longValue()
            int r1 = r0 + 1
            java.lang.Object r1 = r3.get(r1)
            java.lang.Long r1 = (java.lang.Long) r1
            long r8 = r1.longValue()
            long r8 = r8 - r6
            com.google.android.gms.internal.ads.zzakl r1 = new com.google.android.gms.internal.ads.zzakl
            r4 = r1
            r4.<init>(r5, r6, r8)
            r4 = r28
            r4.zza(r1)
            r1 = 1
        L_0x02ee:
            int r0 = r0 + r1
            goto L_0x02a8
        L_0x02f0:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x02f6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzalj.zza(byte[], int, int, com.google.android.gms.internal.ads.zzaks, com.google.android.gms.internal.ads.zzdn):void");
    }

    public zzalj(List list) {
        this.zzf = -3.4028235E38f;
        this.zzg = -3.4028235E38f;
        this.zzd = new zzen();
        if (list == null || list.isEmpty()) {
            this.zzb = false;
            this.zzc = null;
            return;
        }
        this.zzb = true;
        String zzB = zzex.zzB((byte[]) list.get(0));
        zzdd.zzd(zzB.startsWith("Format:"));
        zzali zza2 = zzali.zza(zzB);
        zza2.getClass();
        zzali zzali = zza2;
        this.zzc = zza2;
        zze(new zzen((byte[]) list.get(1)), StandardCharsets.UTF_8);
    }
}
