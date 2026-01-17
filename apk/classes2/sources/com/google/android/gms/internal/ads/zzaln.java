package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzaln implements zzakt {
    private static final Pattern zza = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*");
    private static final Pattern zzb = Pattern.compile("\\{\\\\.*?\\}");
    private final StringBuilder zzc = new StringBuilder();
    private final ArrayList zzd = new ArrayList();
    private final zzen zze = new zzen();

    public static float zzb(int i) {
        if (i == 0) {
            return 0.08f;
        }
        if (i == 1) {
            return 0.5f;
        }
        if (i == 2) {
            return 0.92f;
        }
        throw new IllegalArgumentException();
    }

    private static long zzc(Matcher matcher, int i) {
        String group = matcher.group(i + 1);
        long parseLong = group != null ? Long.parseLong(group) * 3600000 : 0;
        String group2 = matcher.group(i + 2);
        group2.getClass();
        String str = group2;
        long parseLong2 = parseLong + (Long.parseLong(group2) * 60000);
        String group3 = matcher.group(i + 3);
        group3.getClass();
        String str2 = group3;
        long parseLong3 = parseLong2 + (Long.parseLong(group3) * 1000);
        String group4 = matcher.group(i + 4);
        if (group4 != null) {
            parseLong3 += Long.parseLong(group4);
        }
        return parseLong3 * 1000;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(byte[] r18, int r19, int r20, com.google.android.gms.internal.ads.zzaks r21, com.google.android.gms.internal.ads.zzdn r22) {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            java.lang.String r2 = "SubripParser"
            int r3 = r1 + r20
            com.google.android.gms.internal.ads.zzen r4 = r0.zze
            r5 = r18
            r4.zzJ(r5, r3)
            r4.zzL(r1)
            java.nio.charset.Charset r1 = r4.zzC()
            if (r1 != 0) goto L_0x001a
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8
        L_0x001a:
            java.lang.String r3 = r4.zzz(r1)
            if (r3 == 0) goto L_0x01fe
            int r5 = r3.length()
            if (r5 == 0) goto L_0x01f4
            java.lang.Integer.parseInt(r3)     // Catch:{ NumberFormatException -> 0x01e6 }
            com.google.android.gms.internal.ads.zzen r3 = r0.zze
            java.lang.String r5 = r3.zzz(r1)
            if (r5 != 0) goto L_0x0037
            java.lang.String r1 = "Unexpected end"
            com.google.android.gms.internal.ads.zzea.zzf(r2, r1)
            return
        L_0x0037:
            java.util.regex.Pattern r6 = zza
            java.util.regex.Matcher r6 = r6.matcher(r5)
            boolean r7 = r6.matches()
            if (r7 == 0) goto L_0x01d8
            r5 = 1
            long r9 = zzc(r6, r5)
            r7 = 6
            long r6 = zzc(r6, r7)
            java.lang.StringBuilder r8 = r0.zzc
            r11 = 0
            r8.setLength(r11)
            java.util.ArrayList r12 = r0.zzd
            r12.clear()
            java.lang.String r13 = r3.zzz(r1)
        L_0x005c:
            boolean r14 = android.text.TextUtils.isEmpty(r13)
            if (r14 != 0) goto L_0x00b7
            int r14 = r8.length()
            if (r14 <= 0) goto L_0x006d
            java.lang.String r14 = "<br>"
            r8.append(r14)
        L_0x006d:
            java.lang.String r13 = r13.trim()
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>(r13)
            java.util.regex.Pattern r15 = zzb
            java.util.regex.Matcher r13 = r15.matcher(r13)
            r15 = r11
        L_0x007d:
            boolean r16 = r13.find()
            if (r16 == 0) goto L_0x00a5
            java.lang.String r11 = r13.group()
            r12.add(r11)
            int r16 = r13.start()
            int r5 = r16 - r15
            int r11 = r11.length()
            int r0 = r5 + r11
            r16 = r4
            java.lang.String r4 = ""
            r14.replace(r5, r0, r4)
            int r15 = r15 + r11
            r0 = r17
            r4 = r16
            r5 = 1
            r11 = 0
            goto L_0x007d
        L_0x00a5:
            r16 = r4
            java.lang.String r0 = r14.toString()
            r8.append(r0)
            java.lang.String r13 = r3.zzz(r1)
            r0 = r17
            r5 = 1
            r11 = 0
            goto L_0x005c
        L_0x00b7:
            r16 = r4
            java.lang.String r0 = r8.toString()
            android.text.Spanned r0 = android.text.Html.fromHtml(r0)
            r3 = 0
        L_0x00c2:
            int r4 = r12.size()
            if (r3 >= r4) goto L_0x00da
            java.lang.Object r4 = r12.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = "\\{\\\\an[1-9]\\}"
            boolean r5 = r4.matches(r5)
            if (r5 == 0) goto L_0x00d7
            goto L_0x00db
        L_0x00d7:
            int r3 = r3 + 1
            goto L_0x00c2
        L_0x00da:
            r4 = 0
        L_0x00db:
            com.google.android.gms.internal.ads.zzakl r3 = new com.google.android.gms.internal.ads.zzakl
            com.google.android.gms.internal.ads.zzcs r5 = new com.google.android.gms.internal.ads.zzcs
            r5.<init>()
            r5.zzl(r0)
            if (r4 != 0) goto L_0x00ed
            com.google.android.gms.internal.ads.zzcu r0 = r5.zzq()
            goto L_0x01c8
        L_0x00ed:
            int r0 = r4.hashCode()
            java.lang.String r8 = "{\\an9}"
            java.lang.String r11 = "{\\an7}"
            java.lang.String r12 = "{\\an3}"
            java.lang.String r13 = "{\\an1}"
            r14 = 2
            switch(r0) {
                case -685620710: goto L_0x012a;
                case -685620648: goto L_0x0122;
                case -685620617: goto L_0x0118;
                case -685620555: goto L_0x010e;
                case -685620524: goto L_0x0106;
                case -685620462: goto L_0x00fe;
                default: goto L_0x00fd;
            }
        L_0x00fd:
            goto L_0x0132
        L_0x00fe:
            boolean r0 = r4.equals(r8)
            if (r0 == 0) goto L_0x0132
            r0 = 5
            goto L_0x0133
        L_0x0106:
            boolean r0 = r4.equals(r11)
            if (r0 == 0) goto L_0x0132
            r0 = r14
            goto L_0x0133
        L_0x010e:
            java.lang.String r0 = "{\\an6}"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0132
            r0 = 4
            goto L_0x0133
        L_0x0118:
            java.lang.String r0 = "{\\an4}"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0132
            r0 = 1
            goto L_0x0133
        L_0x0122:
            boolean r0 = r4.equals(r12)
            if (r0 == 0) goto L_0x0132
            r0 = 3
            goto L_0x0133
        L_0x012a:
            boolean r0 = r4.equals(r13)
            if (r0 == 0) goto L_0x0132
            r0 = 0
            goto L_0x0133
        L_0x0132:
            r0 = -1
        L_0x0133:
            if (r0 == 0) goto L_0x014c
            r15 = 1
            if (r0 == r15) goto L_0x014c
            if (r0 == r14) goto L_0x014c
            r14 = 3
            if (r0 == r14) goto L_0x0147
            r14 = 4
            if (r0 == r14) goto L_0x0147
            r14 = 5
            if (r0 == r14) goto L_0x0147
            r5.zzi(r15)
            goto L_0x0150
        L_0x0147:
            r0 = 2
            r5.zzi(r0)
            goto L_0x0150
        L_0x014c:
            r0 = 0
            r5.zzi(r0)
        L_0x0150:
            int r0 = r4.hashCode()
            switch(r0) {
                case -685620710: goto L_0x0184;
                case -685620679: goto L_0x017a;
                case -685620648: goto L_0x0172;
                case -685620524: goto L_0x016a;
                case -685620493: goto L_0x0160;
                case -685620462: goto L_0x0158;
                default: goto L_0x0157;
            }
        L_0x0157:
            goto L_0x018c
        L_0x0158:
            boolean r0 = r4.equals(r8)
            if (r0 == 0) goto L_0x018c
            r0 = 5
            goto L_0x018d
        L_0x0160:
            java.lang.String r0 = "{\\an8}"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x018c
            r0 = 4
            goto L_0x018d
        L_0x016a:
            boolean r0 = r4.equals(r11)
            if (r0 == 0) goto L_0x018c
            r0 = 3
            goto L_0x018d
        L_0x0172:
            boolean r0 = r4.equals(r12)
            if (r0 == 0) goto L_0x018c
            r0 = 2
            goto L_0x018d
        L_0x017a:
            java.lang.String r0 = "{\\an2}"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x018c
            r0 = 1
            goto L_0x018d
        L_0x0184:
            boolean r0 = r4.equals(r13)
            if (r0 == 0) goto L_0x018c
            r0 = 0
            goto L_0x018d
        L_0x018c:
            r0 = -1
        L_0x018d:
            if (r0 == 0) goto L_0x01a9
            r4 = 1
            if (r0 == r4) goto L_0x01a9
            r8 = 2
            if (r0 == r8) goto L_0x01a7
            r8 = 3
            if (r0 == r8) goto L_0x01a2
            r8 = 4
            if (r0 == r8) goto L_0x01a2
            r8 = 5
            if (r0 == r8) goto L_0x01a2
            r5.zzf(r4)
            goto L_0x01ad
        L_0x01a2:
            r0 = 0
            r5.zzf(r0)
            goto L_0x01ad
        L_0x01a7:
            r0 = r8
            goto L_0x01aa
        L_0x01a9:
            r0 = 2
        L_0x01aa:
            r5.zzf(r0)
        L_0x01ad:
            int r0 = r5.zzb()
            float r0 = zzb(r0)
            r5.zzh(r0)
            int r0 = r5.zza()
            float r0 = zzb(r0)
            r4 = 0
            r5.zze(r0, r4)
            com.google.android.gms.internal.ads.zzcu r0 = r5.zzq()
        L_0x01c8:
            long r11 = r6 - r9
            com.google.android.gms.internal.ads.zzfyq r8 = com.google.android.gms.internal.ads.zzfyq.zzo(r0)
            r7 = r3
            r7.<init>(r8, r9, r11)
            r0 = r22
            r0.zza(r3)
            goto L_0x01f8
        L_0x01d8:
            r0 = r22
            r16 = r4
            java.lang.String r3 = "Skipping invalid timing: "
            java.lang.String r3 = r3.concat(r5)
            com.google.android.gms.internal.ads.zzea.zzf(r2, r3)
            goto L_0x01f8
        L_0x01e6:
            r0 = r22
            r16 = r4
            java.lang.String r4 = "Skipping invalid index: "
            java.lang.String r3 = r4.concat(r3)
            com.google.android.gms.internal.ads.zzea.zzf(r2, r3)
            goto L_0x01f8
        L_0x01f4:
            r0 = r22
            r16 = r4
        L_0x01f8:
            r0 = r17
            r4 = r16
            goto L_0x001a
        L_0x01fe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaln.zza(byte[], int, int, com.google.android.gms.internal.ads.zzaks, com.google.android.gms.internal.ads.zzdn):void");
    }
}
