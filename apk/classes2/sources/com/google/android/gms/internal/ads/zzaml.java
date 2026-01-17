package com.google.android.gms.internal.ads;

import android.graphics.Color;
import android.text.TextUtils;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.KotlinVersion;
import kotlin.jvm.internal.IntCompanionObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzaml {
    public static final Pattern zza = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)((?:.|\\f)*)?$");
    private static final Pattern zzb = Pattern.compile("(\\S+?):(\\S+)");
    private static final Map zzc;
    private static final Map zzd;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("white", Integer.valueOf(Color.rgb(KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE)));
        hashMap.put("lime", Integer.valueOf(Color.rgb(0, KotlinVersion.MAX_COMPONENT_VALUE, 0)));
        hashMap.put("cyan", Integer.valueOf(Color.rgb(0, KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE)));
        hashMap.put("red", Integer.valueOf(Color.rgb(KotlinVersion.MAX_COMPONENT_VALUE, 0, 0)));
        hashMap.put("yellow", Integer.valueOf(Color.rgb(KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE, 0)));
        hashMap.put("magenta", Integer.valueOf(Color.rgb(KotlinVersion.MAX_COMPONENT_VALUE, 0, KotlinVersion.MAX_COMPONENT_VALUE)));
        hashMap.put("blue", Integer.valueOf(Color.rgb(0, 0, KotlinVersion.MAX_COMPONENT_VALUE)));
        hashMap.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        zzc = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("bg_white", Integer.valueOf(Color.rgb(KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE)));
        hashMap2.put("bg_lime", Integer.valueOf(Color.rgb(0, KotlinVersion.MAX_COMPONENT_VALUE, 0)));
        hashMap2.put("bg_cyan", Integer.valueOf(Color.rgb(0, KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE)));
        hashMap2.put("bg_red", Integer.valueOf(Color.rgb(KotlinVersion.MAX_COMPONENT_VALUE, 0, 0)));
        hashMap2.put("bg_yellow", Integer.valueOf(Color.rgb(KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE, 0)));
        hashMap2.put("bg_magenta", Integer.valueOf(Color.rgb(KotlinVersion.MAX_COMPONENT_VALUE, 0, KotlinVersion.MAX_COMPONENT_VALUE)));
        hashMap2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, KotlinVersion.MAX_COMPONENT_VALUE)));
        hashMap2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        zzd = Collections.unmodifiableMap(hashMap2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:111:0x01ce  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x01fb  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0200  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x012d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static android.text.SpannedString zza(java.lang.String r17, java.lang.String r18, java.util.List r19) {
        /*
            r0 = r17
            r1 = r18
            r2 = r19
            android.text.SpannableStringBuilder r3 = new android.text.SpannableStringBuilder
            r3.<init>()
            java.util.ArrayDeque r4 = new java.util.ArrayDeque
            r4.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r6 = 0
            r7 = r6
        L_0x0017:
            int r8 = r18.length()
            if (r7 < r8) goto L_0x003d
        L_0x001d:
            boolean r1 = r4.isEmpty()
            if (r1 != 0) goto L_0x002d
            java.lang.Object r1 = r4.pop()
            com.google.android.gms.internal.ads.zzamh r1 = (com.google.android.gms.internal.ads.zzamh) r1
            zzg(r0, r1, r5, r3, r2)
            goto L_0x001d
        L_0x002d:
            com.google.android.gms.internal.ads.zzamh r1 = com.google.android.gms.internal.ads.zzamh.zzb()
            java.util.List r4 = java.util.Collections.emptyList()
            zzg(r0, r1, r4, r3, r2)
            android.text.SpannedString r0 = android.text.SpannedString.valueOf(r3)
            return r0
        L_0x003d:
            int r8 = r7 + 1
            char r9 = r1.charAt(r7)
            r10 = 62
            r11 = 60
            r12 = 38
            r14 = 2
            r15 = -1
            r13 = 1
            if (r9 == r12) goto L_0x0170
            if (r9 == r11) goto L_0x0055
            r3.append(r9)
            goto L_0x020b
        L_0x0055:
            int r9 = r18.length()
            if (r8 < r9) goto L_0x005d
            goto L_0x020b
        L_0x005d:
            char r9 = r1.charAt(r8)
            int r8 = r1.indexOf(r10, r8)
            if (r8 != r15) goto L_0x006c
            int r8 = r18.length()
            goto L_0x006e
        L_0x006c:
            int r8 = r8 + 1
        L_0x006e:
            int r10 = r8 + -2
            char r11 = r1.charAt(r10)
            r12 = 47
            if (r11 != r12) goto L_0x007a
            r11 = r13
            goto L_0x007b
        L_0x007a:
            r11 = r6
        L_0x007b:
            if (r9 != r12) goto L_0x0080
            r16 = r14
            goto L_0x0082
        L_0x0080:
            r16 = r13
        L_0x0082:
            int r7 = r7 + r16
            if (r11 == 0) goto L_0x0087
            goto L_0x0089
        L_0x0087:
            int r10 = r8 + -1
        L_0x0089:
            java.lang.String r7 = r1.substring(r7, r10)
            java.lang.String r10 = r7.trim()
            boolean r10 = r10.isEmpty()
            if (r10 == 0) goto L_0x0099
            goto L_0x020b
        L_0x0099:
            java.lang.String r10 = r7.trim()
            boolean r16 = r10.isEmpty()
            r16 = r16 ^ 1
            com.google.android.gms.internal.ads.zzdd.zzd(r16)
            java.lang.String r16 = com.google.android.gms.internal.ads.zzex.zza
            java.lang.String r13 = "[ \\.]"
            java.lang.String[] r10 = r10.split(r13, r14)
            r10 = r10[r6]
            int r13 = r10.hashCode()
            r6 = 98
            if (r13 == r6) goto L_0x011d
            r6 = 99
            if (r13 == r6) goto L_0x0113
            r6 = 105(0x69, float:1.47E-43)
            if (r13 == r6) goto L_0x0109
            r6 = 3650(0xe42, float:5.115E-42)
            if (r13 == r6) goto L_0x00ff
            r6 = 3314158(0x3291ee, float:4.644125E-39)
            if (r13 == r6) goto L_0x00f5
            r6 = 3511770(0x3595da, float:4.921038E-39)
            if (r13 == r6) goto L_0x00eb
            r6 = 117(0x75, float:1.64E-43)
            if (r13 == r6) goto L_0x00e1
            r6 = 118(0x76, float:1.65E-43)
            if (r13 == r6) goto L_0x00d7
            goto L_0x0127
        L_0x00d7:
            java.lang.String r6 = "v"
            boolean r6 = r10.equals(r6)
            if (r6 == 0) goto L_0x0127
            r13 = 7
            goto L_0x0128
        L_0x00e1:
            java.lang.String r6 = "u"
            boolean r6 = r10.equals(r6)
            if (r6 == 0) goto L_0x0127
            r13 = 6
            goto L_0x0128
        L_0x00eb:
            java.lang.String r6 = "ruby"
            boolean r6 = r10.equals(r6)
            if (r6 == 0) goto L_0x0127
            r13 = 4
            goto L_0x0128
        L_0x00f5:
            java.lang.String r6 = "lang"
            boolean r6 = r10.equals(r6)
            if (r6 == 0) goto L_0x0127
            r13 = 3
            goto L_0x0128
        L_0x00ff:
            java.lang.String r6 = "rt"
            boolean r6 = r10.equals(r6)
            if (r6 == 0) goto L_0x0127
            r13 = 5
            goto L_0x0128
        L_0x0109:
            java.lang.String r6 = "i"
            boolean r6 = r10.equals(r6)
            if (r6 == 0) goto L_0x0127
            r13 = r14
            goto L_0x0128
        L_0x0113:
            java.lang.String r6 = "c"
            boolean r6 = r10.equals(r6)
            if (r6 == 0) goto L_0x0127
            r13 = 1
            goto L_0x0128
        L_0x011d:
            java.lang.String r6 = "b"
            boolean r6 = r10.equals(r6)
            if (r6 == 0) goto L_0x0127
            r13 = 0
            goto L_0x0128
        L_0x0127:
            r13 = r15
        L_0x0128:
            switch(r13) {
                case 0: goto L_0x012d;
                case 1: goto L_0x012d;
                case 2: goto L_0x012d;
                case 3: goto L_0x012d;
                case 4: goto L_0x012d;
                case 5: goto L_0x012d;
                case 6: goto L_0x012d;
                case 7: goto L_0x012d;
                default: goto L_0x012b;
            }
        L_0x012b:
            goto L_0x020b
        L_0x012d:
            if (r9 != r12) goto L_0x0161
        L_0x012f:
            boolean r6 = r4.isEmpty()
            if (r6 == 0) goto L_0x0137
            goto L_0x020b
        L_0x0137:
            java.lang.Object r6 = r4.pop()
            com.google.android.gms.internal.ads.zzamh r6 = (com.google.android.gms.internal.ads.zzamh) r6
            zzg(r0, r6, r5, r3, r2)
            boolean r7 = r4.isEmpty()
            if (r7 != 0) goto L_0x0154
            com.google.android.gms.internal.ads.zzamg r7 = new com.google.android.gms.internal.ads.zzamg
            int r9 = r3.length()
            r11 = 0
            r7.<init>(r6, r9, r11)
            r5.add(r7)
            goto L_0x0157
        L_0x0154:
            r5.clear()
        L_0x0157:
            java.lang.String r6 = r6.zza
            boolean r6 = r6.equals(r10)
            if (r6 == 0) goto L_0x012f
            goto L_0x020b
        L_0x0161:
            if (r11 != 0) goto L_0x020b
            int r6 = r3.length()
            com.google.android.gms.internal.ads.zzamh r6 = com.google.android.gms.internal.ads.zzamh.zza(r7, r6)
            r4.push(r6)
            goto L_0x020b
        L_0x0170:
            r6 = 59
            int r6 = r1.indexOf(r6, r8)
            r7 = 32
            int r13 = r1.indexOf(r7, r8)
            if (r6 != r15) goto L_0x0180
            r6 = r13
            goto L_0x0186
        L_0x0180:
            if (r13 == r15) goto L_0x0186
            int r6 = java.lang.Math.min(r6, r13)
        L_0x0186:
            if (r6 == r15) goto L_0x0208
            java.lang.String r8 = r1.substring(r8, r6)
            int r9 = r8.hashCode()
            r15 = 3309(0xced, float:4.637E-42)
            if (r9 == r15) goto L_0x01c1
            r15 = 3464(0xd88, float:4.854E-42)
            if (r9 == r15) goto L_0x01b7
            r15 = 96708(0x179c4, float:1.35517E-40)
            if (r9 == r15) goto L_0x01ad
            r15 = 3374865(0x337f11, float:4.729193E-39)
            if (r9 == r15) goto L_0x01a3
            goto L_0x01cb
        L_0x01a3:
            java.lang.String r9 = "nbsp"
            boolean r9 = r8.equals(r9)
            if (r9 == 0) goto L_0x01cb
            r15 = r14
            goto L_0x01cc
        L_0x01ad:
            java.lang.String r9 = "amp"
            boolean r9 = r8.equals(r9)
            if (r9 == 0) goto L_0x01cb
            r15 = 3
            goto L_0x01cc
        L_0x01b7:
            java.lang.String r9 = "lt"
            boolean r9 = r8.equals(r9)
            if (r9 == 0) goto L_0x01cb
            r15 = 0
            goto L_0x01cc
        L_0x01c1:
            java.lang.String r9 = "gt"
            boolean r9 = r8.equals(r9)
            if (r9 == 0) goto L_0x01cb
            r15 = 1
            goto L_0x01cc
        L_0x01cb:
            r15 = -1
        L_0x01cc:
            if (r15 == 0) goto L_0x01fb
            r9 = 1
            if (r15 == r9) goto L_0x01f7
            if (r15 == r14) goto L_0x01f3
            r9 = 3
            if (r15 == r9) goto L_0x01ef
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r9 = "ignoring unsupported entity: '&"
            r7.<init>(r9)
            r7.append(r8)
            java.lang.String r8 = ";'"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "WebvttCueParser"
            com.google.android.gms.internal.ads.zzea.zzf(r8, r7)
            goto L_0x01fe
        L_0x01ef:
            r3.append(r12)
            goto L_0x01fe
        L_0x01f3:
            r3.append(r7)
            goto L_0x01fe
        L_0x01f7:
            r3.append(r10)
            goto L_0x01fe
        L_0x01fb:
            r3.append(r11)
        L_0x01fe:
            if (r6 != r13) goto L_0x0205
            java.lang.String r7 = " "
            r3.append(r7)
        L_0x0205:
            int r7 = r6 + 1
            goto L_0x020c
        L_0x0208:
            r3.append(r9)
        L_0x020b:
            r7 = r8
        L_0x020c:
            r6 = 0
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaml.zza(java.lang.String, java.lang.String, java.util.List):android.text.SpannedString");
    }

    static zzcs zzb(String str) {
        zzamj zzamj = new zzamj();
        zzh(str, zzamj);
        return zzamj.zza();
    }

    public static zzame zzc(zzen zzen, List list) {
        String zzz = zzen.zzz(StandardCharsets.UTF_8);
        if (zzz != null) {
            Pattern pattern = zza;
            Matcher matcher = pattern.matcher(zzz);
            if (matcher.matches()) {
                return zze((String) null, matcher, zzen, list);
            }
            String zzz2 = zzen.zzz(StandardCharsets.UTF_8);
            if (zzz2 != null) {
                Matcher matcher2 = pattern.matcher(zzz2);
                if (matcher2.matches()) {
                    return zze(zzz.trim(), matcher2, zzen, list);
                }
            }
        }
        return null;
    }

    private static int zzd(List list, String str, zzamh zzamh) {
        List zzf = zzf(list, str, zzamh);
        for (int i = 0; i < zzf.size(); i++) {
            zzamd zzamd = ((zzami) zzf.get(i)).zzb;
            if (zzamd.zze() != -1) {
                return zzamd.zze();
            }
        }
        return -1;
    }

    private static zzame zze(String str, Matcher matcher, zzen zzen, List list) {
        zzamj zzamj = new zzamj();
        try {
            String group = matcher.group(1);
            if (group != null) {
                String str2 = group;
                zzamj.zza = zzamn.zzb(group);
                String group2 = matcher.group(2);
                if (group2 != null) {
                    String str3 = group2;
                    zzamj.zzb = zzamn.zzb(group2);
                    String group3 = matcher.group(3);
                    group3.getClass();
                    String str4 = group3;
                    zzh(group3, zzamj);
                    StringBuilder sb = new StringBuilder();
                    String zzz = zzen.zzz(StandardCharsets.UTF_8);
                    while (!TextUtils.isEmpty(zzz)) {
                        if (sb.length() > 0) {
                            sb.append("\n");
                        }
                        sb.append(zzz.trim());
                        zzz = zzen.zzz(StandardCharsets.UTF_8);
                    }
                    zzamj.zzc = zza(str, sb.toString(), list);
                    return new zzame(zzamj.zza().zzq(), zzamj.zza, zzamj.zzb);
                }
                throw null;
            }
            throw null;
        } catch (IllegalArgumentException unused) {
            zzea.zzf("WebvttCueParser", "Skipping cue with bad header: ".concat(String.valueOf(matcher.group())));
            return null;
        }
    }

    private static List zzf(List list, String str, zzamh zzamh) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            zzamd zzamd = (zzamd) list.get(i);
            int zzf = zzamd.zzf(str, zzamh.zza, zzamh.zzd, zzamh.zzc);
            if (zzf > 0) {
                arrayList.add(new zzami(zzf, zzamd));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:115:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x017f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void zzg(java.lang.String r17, com.google.android.gms.internal.ads.zzamh r18, java.util.List r19, android.text.SpannableStringBuilder r20, java.util.List r21) {
        /*
            r0 = r17
            r1 = r18
            r2 = r20
            r3 = r21
            int r4 = r1.zzb
            int r5 = r20.length()
            java.lang.String r6 = r1.zza
            int r7 = r6.hashCode()
            r11 = -1
            if (r7 == 0) goto L_0x007c
            r13 = 105(0x69, float:1.47E-43)
            if (r7 == r13) goto L_0x0072
            r13 = 3314158(0x3291ee, float:4.644125E-39)
            if (r7 == r13) goto L_0x0068
            r13 = 3511770(0x3595da, float:4.921038E-39)
            if (r7 == r13) goto L_0x005e
            r13 = 98
            if (r7 == r13) goto L_0x0054
            r13 = 99
            if (r7 == r13) goto L_0x004a
            r13 = 117(0x75, float:1.64E-43)
            if (r7 == r13) goto L_0x0040
            r13 = 118(0x76, float:1.65E-43)
            if (r7 == r13) goto L_0x0036
            goto L_0x0086
        L_0x0036:
            java.lang.String r7 = "v"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0086
            r6 = 5
            goto L_0x0087
        L_0x0040:
            java.lang.String r7 = "u"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0086
            r6 = 3
            goto L_0x0087
        L_0x004a:
            java.lang.String r7 = "c"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0086
            r6 = 4
            goto L_0x0087
        L_0x0054:
            java.lang.String r7 = "b"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0086
            r6 = 0
            goto L_0x0087
        L_0x005e:
            java.lang.String r7 = "ruby"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0086
            r6 = 2
            goto L_0x0087
        L_0x0068:
            java.lang.String r7 = "lang"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0086
            r6 = 6
            goto L_0x0087
        L_0x0072:
            java.lang.String r7 = "i"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0086
            r6 = 1
            goto L_0x0087
        L_0x007c:
            java.lang.String r7 = ""
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0086
            r6 = 7
            goto L_0x0087
        L_0x0086:
            r6 = r11
        L_0x0087:
            r7 = 33
            switch(r6) {
                case 0: goto L_0x016b;
                case 1: goto L_0x0161;
                case 2: goto L_0x00ec;
                case 3: goto L_0x00e2;
                case 4: goto L_0x009a;
                case 5: goto L_0x008e;
                case 6: goto L_0x0174;
                case 7: goto L_0x0174;
                default: goto L_0x008c;
            }
        L_0x008c:
            goto L_0x0235
        L_0x008e:
            java.lang.String r6 = r1.zzc
            com.google.android.gms.internal.ads.zzdc r13 = new com.google.android.gms.internal.ads.zzdc
            r13.<init>(r6)
            r2.setSpan(r13, r4, r5, r7)
            goto L_0x0174
        L_0x009a:
            java.util.Set r6 = r1.zzd
            java.util.Iterator r6 = r6.iterator()
        L_0x00a0:
            boolean r13 = r6.hasNext()
            if (r13 == 0) goto L_0x0174
            java.lang.Object r13 = r6.next()
            java.lang.String r13 = (java.lang.String) r13
            java.util.Map r14 = zzc
            boolean r15 = r14.containsKey(r13)
            if (r15 == 0) goto L_0x00c7
            java.lang.Object r13 = r14.get(r13)
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            android.text.style.ForegroundColorSpan r14 = new android.text.style.ForegroundColorSpan
            r14.<init>(r13)
            r2.setSpan(r14, r4, r5, r7)
            goto L_0x00a0
        L_0x00c7:
            java.util.Map r14 = zzd
            boolean r15 = r14.containsKey(r13)
            if (r15 == 0) goto L_0x00a0
            java.lang.Object r13 = r14.get(r13)
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            android.text.style.BackgroundColorSpan r14 = new android.text.style.BackgroundColorSpan
            r14.<init>(r13)
            r2.setSpan(r14, r4, r5, r7)
            goto L_0x00a0
        L_0x00e2:
            android.text.style.UnderlineSpan r6 = new android.text.style.UnderlineSpan
            r6.<init>()
            r2.setSpan(r6, r4, r5, r7)
            goto L_0x0174
        L_0x00ec:
            int r6 = zzd(r3, r0, r1)
            java.util.ArrayList r13 = new java.util.ArrayList
            int r14 = r19.size()
            r13.<init>(r14)
            r14 = r19
            r13.addAll(r14)
            java.util.Comparator r14 = com.google.android.gms.internal.ads.zzamg.zza
            java.util.Collections.sort(r13, r14)
            r10 = r4
            r14 = 0
            r15 = 0
        L_0x0108:
            int r8 = r13.size()
            if (r14 >= r8) goto L_0x0174
            java.lang.Object r8 = r13.get(r14)
            com.google.android.gms.internal.ads.zzamg r8 = (com.google.android.gms.internal.ads.zzamg) r8
            com.google.android.gms.internal.ads.zzamh r8 = r8.zzb
            java.lang.String r8 = r8.zza
            java.lang.String r12 = "rt"
            boolean r8 = r12.equals(r8)
            if (r8 == 0) goto L_0x015d
            java.lang.Object r8 = r13.get(r14)
            com.google.android.gms.internal.ads.zzamg r8 = (com.google.android.gms.internal.ads.zzamg) r8
            com.google.android.gms.internal.ads.zzamh r12 = r8.zzb
            int r12 = zzd(r3, r0, r12)
            if (r12 == r11) goto L_0x0133
            goto L_0x0138
        L_0x0133:
            if (r6 == r11) goto L_0x0137
            r12 = r6
            goto L_0x0138
        L_0x0137:
            r12 = 1
        L_0x0138:
            com.google.android.gms.internal.ads.zzamh r11 = r8.zzb
            int r11 = r11.zzb
            int r11 = r11 - r15
            int r8 = r8.zzc
            int r8 = r8 - r15
            java.lang.CharSequence r16 = r2.subSequence(r11, r8)
            r2.delete(r11, r8)
            com.google.android.gms.internal.ads.zzcz r8 = new com.google.android.gms.internal.ads.zzcz
            java.lang.String r9 = r16.toString()
            r8.<init>(r9, r12)
            r2.setSpan(r8, r10, r11, r7)
            int r8 = r16.length()
            int r15 = r15 + r8
            r10 = r11
        L_0x015d:
            int r14 = r14 + 1
            r11 = -1
            goto L_0x0108
        L_0x0161:
            android.text.style.StyleSpan r6 = new android.text.style.StyleSpan
            r8 = 2
            r6.<init>(r8)
            r2.setSpan(r6, r4, r5, r7)
            goto L_0x0174
        L_0x016b:
            android.text.style.StyleSpan r6 = new android.text.style.StyleSpan
            r8 = 1
            r6.<init>(r8)
            r2.setSpan(r6, r4, r5, r7)
        L_0x0174:
            java.util.List r0 = zzf(r3, r0, r1)
            r10 = 0
        L_0x0179:
            int r1 = r0.size()
            if (r10 >= r1) goto L_0x0235
            java.lang.Object r1 = r0.get(r10)
            com.google.android.gms.internal.ads.zzami r1 = (com.google.android.gms.internal.ads.zzami) r1
            com.google.android.gms.internal.ads.zzamd r1 = r1.zzb
            if (r1 != 0) goto L_0x018f
            r6 = -1
            r8 = 2
            r9 = 3
            r12 = 1
            goto L_0x0231
        L_0x018f:
            int r3 = r1.zzg()
            r6 = -1
            if (r3 == r6) goto L_0x01a2
            android.text.style.StyleSpan r3 = new android.text.style.StyleSpan
            int r8 = r1.zzg()
            r3.<init>(r8)
            com.google.android.gms.internal.ads.zzda.zzb(r2, r3, r4, r5, r7)
        L_0x01a2:
            boolean r3 = r1.zzz()
            if (r3 == 0) goto L_0x01b0
            android.text.style.UnderlineSpan r3 = new android.text.style.UnderlineSpan
            r3.<init>()
            r2.setSpan(r3, r4, r5, r7)
        L_0x01b0:
            boolean r3 = r1.zzy()
            if (r3 == 0) goto L_0x01c2
            android.text.style.ForegroundColorSpan r3 = new android.text.style.ForegroundColorSpan
            int r8 = r1.zzc()
            r3.<init>(r8)
            com.google.android.gms.internal.ads.zzda.zzb(r2, r3, r4, r5, r7)
        L_0x01c2:
            boolean r3 = r1.zzx()
            if (r3 == 0) goto L_0x01d4
            android.text.style.BackgroundColorSpan r3 = new android.text.style.BackgroundColorSpan
            int r8 = r1.zzb()
            r3.<init>(r8)
            com.google.android.gms.internal.ads.zzda.zzb(r2, r3, r4, r5, r7)
        L_0x01d4:
            java.lang.String r3 = r1.zzr()
            if (r3 == 0) goto L_0x01e6
            android.text.style.TypefaceSpan r3 = new android.text.style.TypefaceSpan
            java.lang.String r8 = r1.zzr()
            r3.<init>(r8)
            com.google.android.gms.internal.ads.zzda.zzb(r2, r3, r4, r5, r7)
        L_0x01e6:
            int r3 = r1.zzd()
            r8 = 1
            if (r3 == r8) goto L_0x0213
            r8 = 2
            if (r3 == r8) goto L_0x0205
            r9 = 3
            if (r3 == r9) goto L_0x01f5
        L_0x01f3:
            r12 = 1
            goto L_0x0223
        L_0x01f5:
            android.text.style.RelativeSizeSpan r3 = new android.text.style.RelativeSizeSpan
            float r11 = r1.zza()
            r12 = 1120403456(0x42c80000, float:100.0)
            float r11 = r11 / r12
            r3.<init>(r11)
            com.google.android.gms.internal.ads.zzda.zzb(r2, r3, r4, r5, r7)
            goto L_0x01f3
        L_0x0205:
            r9 = 3
            android.text.style.RelativeSizeSpan r3 = new android.text.style.RelativeSizeSpan
            float r11 = r1.zza()
            r3.<init>(r11)
            com.google.android.gms.internal.ads.zzda.zzb(r2, r3, r4, r5, r7)
            goto L_0x01f3
        L_0x0213:
            r8 = 2
            r9 = 3
            android.text.style.AbsoluteSizeSpan r3 = new android.text.style.AbsoluteSizeSpan
            float r11 = r1.zza()
            int r11 = (int) r11
            r12 = 1
            r3.<init>(r11, r12)
            com.google.android.gms.internal.ads.zzda.zzb(r2, r3, r4, r5, r7)
        L_0x0223:
            boolean r1 = r1.zzw()
            if (r1 == 0) goto L_0x0231
            com.google.android.gms.internal.ads.zzcy r1 = new com.google.android.gms.internal.ads.zzcy
            r1.<init>()
            r2.setSpan(r1, r4, r5, r7)
        L_0x0231:
            int r10 = r10 + 1
            goto L_0x0179
        L_0x0235:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaml.zzg(java.lang.String, com.google.android.gms.internal.ads.zzamh, java.util.List, android.text.SpannableStringBuilder, java.util.List):void");
    }

    private static void zzh(String str, zzamj zzamj) {
        zzamj zzamj2 = zzamj;
        Matcher matcher = zzb.matcher(str);
        while (matcher.find()) {
            int i = 1;
            String group = matcher.group(1);
            group.getClass();
            String str2 = group;
            int i2 = 2;
            String group2 = matcher.group(2);
            group2.getClass();
            String str3 = group2;
            try {
                char c = 65535;
                if ("line".equals(group)) {
                    int indexOf = group2.indexOf(44);
                    if (indexOf != -1) {
                        String substring = group2.substring(indexOf + 1);
                        switch (substring.hashCode()) {
                            case -1364013995:
                                if (substring.equals("center")) {
                                    c = 1;
                                    break;
                                }
                                break;
                            case -1074341483:
                                if (substring.equals("middle")) {
                                    c = 2;
                                    break;
                                }
                                break;
                            case 100571:
                                if (substring.equals("end")) {
                                    c = 3;
                                    break;
                                }
                                break;
                            case 109757538:
                                if (substring.equals("start")) {
                                    c = 0;
                                    break;
                                }
                                break;
                        }
                        if (c == 0) {
                            i2 = 0;
                        } else if (c == 1 || c == 2) {
                            i2 = 1;
                        } else if (c != 3) {
                            zzea.zzf("WebvttCueParser", "Invalid anchor value: ".concat(String.valueOf(substring)));
                            i2 = IntCompanionObject.MIN_VALUE;
                        }
                        zzamj2.zzg = i2;
                        group2 = group2.substring(0, indexOf);
                    }
                    if (group2.endsWith("%")) {
                        zzamj2.zze = zzamn.zza(group2);
                        zzamj2.zzf = 0;
                    } else {
                        zzamj2.zze = (float) Integer.parseInt(group2);
                        zzamj2.zzf = 1;
                    }
                } else if ("align".equals(group)) {
                    switch (group2.hashCode()) {
                        case -1364013995:
                            if (group2.equals("center")) {
                                c = 2;
                                break;
                            }
                            break;
                        case -1074341483:
                            if (group2.equals("middle")) {
                                c = 3;
                                break;
                            }
                            break;
                        case 100571:
                            if (group2.equals("end")) {
                                c = 4;
                                break;
                            }
                            break;
                        case 3317767:
                            if (group2.equals("left")) {
                                c = 1;
                                break;
                            }
                            break;
                        case 108511772:
                            if (group2.equals("right")) {
                                c = 5;
                                break;
                            }
                            break;
                        case 109757538:
                            if (group2.equals("start")) {
                                c = 0;
                                break;
                            }
                            break;
                    }
                    if (c != 0) {
                        if (c != 1) {
                            if (!(c == 2 || c == 3)) {
                                if (c != 4) {
                                    i = 5;
                                    if (c != 5) {
                                        zzea.zzf("WebvttCueParser", "Invalid alignment value: ".concat(group2));
                                    }
                                } else {
                                    i = 3;
                                }
                            }
                            i = 2;
                        } else {
                            i = 4;
                        }
                    }
                    zzamj2.zzd = i;
                } else if ("position".equals(group)) {
                    int indexOf2 = group2.indexOf(44);
                    if (indexOf2 != -1) {
                        String substring2 = group2.substring(indexOf2 + 1);
                        switch (substring2.hashCode()) {
                            case -1842484672:
                                if (substring2.equals("line-left")) {
                                    c = 0;
                                    break;
                                }
                                break;
                            case -1364013995:
                                if (substring2.equals("center")) {
                                    c = 2;
                                    break;
                                }
                                break;
                            case -1276788989:
                                if (substring2.equals("line-right")) {
                                    c = 4;
                                    break;
                                }
                                break;
                            case -1074341483:
                                if (substring2.equals("middle")) {
                                    c = 3;
                                    break;
                                }
                                break;
                            case 100571:
                                if (substring2.equals("end")) {
                                    c = 5;
                                    break;
                                }
                                break;
                            case 109757538:
                                if (substring2.equals("start")) {
                                    c = 1;
                                    break;
                                }
                                break;
                        }
                        if (c == 0 || c == 1) {
                            i = 0;
                        } else if (!(c == 2 || c == 3)) {
                            if (c == 4 || c == 5) {
                                i = 2;
                            } else {
                                zzea.zzf("WebvttCueParser", "Invalid anchor value: ".concat(String.valueOf(substring2)));
                                i = IntCompanionObject.MIN_VALUE;
                            }
                        }
                        zzamj2.zzi = i;
                        group2 = group2.substring(0, indexOf2);
                    }
                    zzamj2.zzh = zzamn.zza(group2);
                } else if ("size".equals(group)) {
                    zzamj2.zzj = zzamn.zza(group2);
                } else if (!"vertical".equals(group)) {
                    zzea.zzf("WebvttCueParser", "Unknown cue setting " + group + ":" + group2);
                } else {
                    int hashCode = group2.hashCode();
                    if (hashCode != 3462) {
                        if (hashCode == 3642 && group2.equals("rl")) {
                            c = 0;
                        }
                    } else if (group2.equals("lr")) {
                        c = 1;
                    }
                    if (c != 0) {
                        if (c != 1) {
                            zzea.zzf("WebvttCueParser", "Invalid 'vertical' value: ".concat(group2));
                            i = IntCompanionObject.MIN_VALUE;
                        } else {
                            i = 2;
                        }
                    }
                    zzamj2.zzk = i;
                }
            } catch (NumberFormatException unused) {
                zzea.zzf("WebvttCueParser", "Skipping bad cue setting: ".concat(String.valueOf(matcher.group())));
            }
        }
    }
}
