package com.google.android.gms.internal.ads;

import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzamc {
    private static final Pattern zza = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    private static final Pattern zzb = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    private final zzen zzc = new zzen();
    private final StringBuilder zzd = new StringBuilder();

    static String zza(zzen zzen, StringBuilder sb) {
        zzc(zzen);
        if (zzen.zza() == 0) {
            return null;
        }
        String zzd2 = zzd(zzen, sb);
        if (!"".equals(zzd2)) {
            return zzd2;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((char) zzen.zzm());
        return sb2.toString();
    }

    static void zzc(zzen zzen) {
        while (true) {
            boolean z = true;
            while (zzen.zza() > 0 && z) {
                char c = (char) zzen.zzN()[zzen.zzc()];
                if (c == 9 || c == 10 || c == 12 || c == 13 || c == ' ') {
                    zzen.zzM(1);
                } else {
                    int zzc2 = zzen.zzc();
                    int zzd2 = zzen.zzd();
                    byte[] zzN = zzen.zzN();
                    if (zzc2 + 2 <= zzd2) {
                        int i = zzc2 + 1;
                        if (zzN[zzc2] == 47) {
                            int i2 = zzc2 + 2;
                            if (zzN[i] == 42) {
                                while (true) {
                                    int i3 = i2 + 1;
                                    if (i3 >= zzd2) {
                                        break;
                                    } else if (((char) zzN[i2]) == '*' && ((char) zzN[i3]) == '/') {
                                        zzd2 = i2 + 2;
                                        i2 = zzd2;
                                    } else {
                                        i2 = i3;
                                    }
                                }
                                zzen.zzM(zzd2 - zzen.zzc());
                            }
                        } else {
                            continue;
                        }
                    }
                    z = false;
                }
            }
            return;
        }
    }

    private static String zzd(zzen zzen, StringBuilder sb) {
        sb.setLength(0);
        int zzc2 = zzen.zzc();
        int zzd2 = zzen.zzd();
        loop0:
        while (true) {
            boolean z = false;
            while (zzc2 < zzd2 && !z) {
                char c = (char) zzen.zzN()[zzc2];
                if ((c < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !((c >= '0' && c <= '9') || c == '#' || c == '-' || c == '.' || c == '_'))) {
                    z = true;
                } else {
                    sb.append(c);
                    zzc2++;
                }
            }
        }
        zzen.zzM(zzc2 - zzen.zzc());
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00aa, code lost:
        if (")".equals(zza(r4, r1)) == false) goto L_0x003e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x02d5  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x02e8  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x030d A[EDGE_INSN: B:160:0x030d->B:158:0x030d ?: BREAK  
    EDGE_INSN: B:161:0x030d->B:158:0x030d ?: BREAK  , RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00bb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List zzb(com.google.android.gms.internal.ads.zzen r18) {
        /*
            r17 = this;
            r0 = r17
            java.lang.StringBuilder r1 = r0.zzd
            r2 = 0
            r1.setLength(r2)
            int r3 = r18.zzc()
        L_0x000c:
            java.nio.charset.Charset r4 = java.nio.charset.StandardCharsets.UTF_8
            r5 = r18
            java.lang.String r4 = r5.zzz(r4)
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L_0x000c
            com.google.android.gms.internal.ads.zzen r4 = r0.zzc
            byte[] r6 = r18.zzN()
            int r5 = r18.zzc()
            r4.zzJ(r6, r5)
            r4.zzL(r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L_0x002f:
            zzc(r4)
            int r5 = r4.zza()
            java.lang.String r6 = "{"
            r7 = 5
            java.lang.String r8 = ""
            r10 = 1
            if (r5 >= r7) goto L_0x0041
        L_0x003e:
            r5 = 0
            goto L_0x00ad
        L_0x0041:
            java.nio.charset.Charset r5 = java.nio.charset.StandardCharsets.UTF_8
            java.lang.String r5 = r4.zzB(r7, r5)
            java.lang.String r7 = "::cue"
            boolean r5 = r7.equals(r5)
            if (r5 != 0) goto L_0x0050
            goto L_0x003e
        L_0x0050:
            int r5 = r4.zzc()
            java.lang.String r7 = zza(r4, r1)
            if (r7 != 0) goto L_0x005b
            goto L_0x003e
        L_0x005b:
            boolean r11 = r6.equals(r7)
            if (r11 == 0) goto L_0x0066
            r4.zzL(r5)
            r5 = r8
            goto L_0x00ad
        L_0x0066:
            java.lang.String r5 = "("
            boolean r5 = r5.equals(r7)
            if (r5 == 0) goto L_0x009f
            int r5 = r4.zzc()
            int r7 = r4.zzd()
            r11 = r2
        L_0x0077:
            if (r5 >= r7) goto L_0x008d
            if (r11 != 0) goto L_0x008d
            byte[] r11 = r4.zzN()
            int r12 = r5 + 1
            byte r5 = r11[r5]
            char r5 = (char) r5
            r11 = 41
            if (r5 != r11) goto L_0x008a
            r11 = r10
            goto L_0x008b
        L_0x008a:
            r11 = r2
        L_0x008b:
            r5 = r12
            goto L_0x0077
        L_0x008d:
            int r5 = r5 + -1
            int r7 = r4.zzc()
            int r5 = r5 - r7
            java.nio.charset.Charset r7 = java.nio.charset.StandardCharsets.UTF_8
            java.lang.String r5 = r4.zzB(r5, r7)
            java.lang.String r5 = r5.trim()
            goto L_0x00a0
        L_0x009f:
            r5 = 0
        L_0x00a0:
            java.lang.String r7 = zza(r4, r1)
            java.lang.String r11 = ")"
            boolean r7 = r11.equals(r7)
            if (r7 != 0) goto L_0x00ad
            goto L_0x003e
        L_0x00ad:
            if (r5 == 0) goto L_0x030d
            java.lang.String r7 = zza(r4, r1)
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x00bb
            goto L_0x030d
        L_0x00bb:
            com.google.android.gms.internal.ads.zzamd r6 = new com.google.android.gms.internal.ads.zzamd
            r6.<init>()
            boolean r7 = r8.equals(r5)
            r11 = -1
            if (r7 == 0) goto L_0x00ca
        L_0x00c7:
            r5 = r2
            r7 = 0
            goto L_0x0126
        L_0x00ca:
            r7 = 91
            int r7 = r5.indexOf(r7)
            if (r7 == r11) goto L_0x00f3
            java.util.regex.Pattern r12 = zza
            java.lang.String r13 = r5.substring(r7)
            java.util.regex.Matcher r12 = r12.matcher(r13)
            boolean r13 = r12.matches()
            if (r13 == 0) goto L_0x00ef
            java.lang.String r12 = r12.group(r10)
            r12.getClass()
            r13 = r12
            java.lang.String r13 = (java.lang.String) r13
            r6.zzv(r12)
        L_0x00ef:
            java.lang.String r5 = r5.substring(r2, r7)
        L_0x00f3:
            java.lang.String r7 = com.google.android.gms.internal.ads.zzex.zza
            java.lang.String r7 = "\\."
            java.lang.String[] r5 = r5.split(r7, r11)
            r7 = r5[r2]
            r12 = 35
            int r12 = r7.indexOf(r12)
            if (r12 == r11) goto L_0x0116
            java.lang.String r13 = r7.substring(r2, r12)
            r6.zzu(r13)
            int r12 = r12 + 1
            java.lang.String r7 = r7.substring(r12)
            r6.zzt(r7)
            goto L_0x0119
        L_0x0116:
            r6.zzu(r7)
        L_0x0119:
            int r7 = r5.length
            if (r7 <= r10) goto L_0x00c7
            java.lang.Object[] r5 = java.util.Arrays.copyOfRange(r5, r10, r7)
            java.lang.String[] r5 = (java.lang.String[]) r5
            r6.zzs(r5)
            goto L_0x00c7
        L_0x0126:
            java.lang.String r12 = "}"
            if (r5 != 0) goto L_0x0301
            int r5 = r4.zzc()
            java.lang.String r7 = zza(r4, r1)
            if (r7 == 0) goto L_0x013d
            boolean r13 = r12.equals(r7)
            if (r13 == 0) goto L_0x013b
            goto L_0x013d
        L_0x013b:
            r13 = r2
            goto L_0x013e
        L_0x013d:
            r13 = r10
        L_0x013e:
            if (r13 != 0) goto L_0x02fc
            r4.zzL(r5)
            zzc(r4)
            java.lang.String r5 = zzd(r4, r1)
            boolean r14 = r8.equals(r5)
            if (r14 == 0) goto L_0x0152
            goto L_0x02fc
        L_0x0152:
            java.lang.String r14 = zza(r4, r1)
            java.lang.String r15 = ":"
            boolean r14 = r15.equals(r14)
            if (r14 != 0) goto L_0x0160
            goto L_0x02fc
        L_0x0160:
            zzc(r4)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r15 = r2
        L_0x0169:
            java.lang.String r2 = ";"
            if (r15 != 0) goto L_0x0190
            int r9 = r4.zzc()
            java.lang.String r11 = zza(r4, r1)
            if (r11 != 0) goto L_0x0179
            r9 = 0
            goto L_0x0194
        L_0x0179:
            boolean r16 = r12.equals(r11)
            if (r16 != 0) goto L_0x018a
            boolean r2 = r2.equals(r11)
            if (r2 == 0) goto L_0x0186
            goto L_0x018a
        L_0x0186:
            r14.append(r11)
            goto L_0x018e
        L_0x018a:
            r4.zzL(r9)
            r15 = r10
        L_0x018e:
            r11 = -1
            goto L_0x0169
        L_0x0190:
            java.lang.String r9 = r14.toString()
        L_0x0194:
            if (r9 == 0) goto L_0x02fc
            boolean r11 = r8.equals(r9)
            if (r11 == 0) goto L_0x019e
            goto L_0x02fc
        L_0x019e:
            int r11 = r4.zzc()
            java.lang.String r14 = zza(r4, r1)
            boolean r2 = r2.equals(r14)
            if (r2 == 0) goto L_0x01ad
            goto L_0x01b6
        L_0x01ad:
            boolean r2 = r12.equals(r14)
            if (r2 == 0) goto L_0x02fc
            r4.zzL(r11)
        L_0x01b6:
            java.lang.String r2 = "color"
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x01c7
            int r2 = com.google.android.gms.internal.ads.zzdl.zza(r9)
            r6.zzk(r2)
            goto L_0x02fc
        L_0x01c7:
            java.lang.String r2 = "background-color"
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x01d8
            int r2 = com.google.android.gms.internal.ads.zzdl.zza(r9)
            r6.zzh(r2)
            goto L_0x02fc
        L_0x01d8:
            java.lang.String r2 = "ruby-position"
            boolean r2 = r2.equals(r5)
            r11 = 2
            if (r2 == 0) goto L_0x01fb
            java.lang.String r2 = "over"
            boolean r2 = r2.equals(r9)
            if (r2 == 0) goto L_0x01ee
            r6.zzp(r10)
            goto L_0x02fc
        L_0x01ee:
            java.lang.String r2 = "under"
            boolean r2 = r2.equals(r9)
            if (r2 == 0) goto L_0x02fc
            r6.zzp(r11)
            goto L_0x02fc
        L_0x01fb:
            java.lang.String r2 = "text-combine-upright"
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x021c
            java.lang.String r2 = "all"
            boolean r2 = r2.equals(r9)
            if (r2 != 0) goto L_0x0216
            java.lang.String r2 = "digits"
            boolean r2 = r9.startsWith(r2)
            if (r2 == 0) goto L_0x0214
            goto L_0x0216
        L_0x0214:
            r2 = 0
            goto L_0x0217
        L_0x0216:
            r2 = r10
        L_0x0217:
            r6.zzj(r2)
            goto L_0x02fc
        L_0x021c:
            java.lang.String r2 = "text-decoration"
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x0231
            java.lang.String r2 = "underline"
            boolean r2 = r2.equals(r9)
            if (r2 == 0) goto L_0x02fc
            r6.zzq(r10)
            goto L_0x02fc
        L_0x0231:
            java.lang.String r2 = "font-family"
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x023e
            r6.zzl(r9)
            goto L_0x02fc
        L_0x023e:
            java.lang.String r2 = "font-weight"
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x0253
            java.lang.String r2 = "bold"
            boolean r2 = r2.equals(r9)
            if (r2 == 0) goto L_0x02fc
            r6.zzi(r10)
            goto L_0x02fc
        L_0x0253:
            java.lang.String r2 = "font-style"
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x0268
            java.lang.String r2 = "italic"
            boolean r2 = r2.equals(r9)
            if (r2 == 0) goto L_0x02fc
            r6.zzo(r10)
            goto L_0x02fc
        L_0x0268:
            java.lang.String r2 = "font-size"
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x02fc
            java.util.regex.Pattern r2 = zzb
            java.lang.String r5 = com.google.android.gms.internal.ads.zzfuv.zza(r9)
            java.util.regex.Matcher r2 = r2.matcher(r5)
            boolean r5 = r2.matches()
            if (r5 != 0) goto L_0x0299
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "Invalid font-size: '"
            r2.<init>(r5)
            r2.append(r9)
            java.lang.String r5 = "'."
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            java.lang.String r5 = "WebvttCssParser"
            com.google.android.gms.internal.ads.zzea.zzf(r5, r2)
            goto L_0x02fc
        L_0x0299:
            java.lang.String r5 = r2.group(r11)
            r5.getClass()
            r9 = r5
            java.lang.String r9 = (java.lang.String) r9
            int r9 = r5.hashCode()
            r12 = 37
            if (r9 == r12) goto L_0x02c8
            r12 = 3240(0xca8, float:4.54E-42)
            if (r9 == r12) goto L_0x02be
            r12 = 3592(0xe08, float:5.033E-42)
            if (r9 == r12) goto L_0x02b4
            goto L_0x02d2
        L_0x02b4:
            java.lang.String r9 = "px"
            boolean r5 = r5.equals(r9)
            if (r5 == 0) goto L_0x02d2
            r5 = 0
            goto L_0x02d3
        L_0x02be:
            java.lang.String r9 = "em"
            boolean r5 = r5.equals(r9)
            if (r5 == 0) goto L_0x02d2
            r5 = r10
            goto L_0x02d3
        L_0x02c8:
            java.lang.String r9 = "%"
            boolean r5 = r5.equals(r9)
            if (r5 == 0) goto L_0x02d2
            r5 = r11
            goto L_0x02d3
        L_0x02d2:
            r5 = -1
        L_0x02d3:
            if (r5 == 0) goto L_0x02e8
            if (r5 == r10) goto L_0x02e4
            if (r5 != r11) goto L_0x02de
            r5 = 3
            r6.zzn(r5)
            goto L_0x02eb
        L_0x02de:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x02e4:
            r6.zzn(r11)
            goto L_0x02eb
        L_0x02e8:
            r6.zzn(r10)
        L_0x02eb:
            java.lang.String r2 = r2.group(r10)
            r2.getClass()
            r5 = r2
            java.lang.String r5 = (java.lang.String) r5
            float r2 = java.lang.Float.parseFloat(r2)
            r6.zzm(r2)
        L_0x02fc:
            r5 = r13
            r2 = 0
            r11 = -1
            goto L_0x0126
        L_0x0301:
            boolean r2 = r12.equals(r7)
            if (r2 == 0) goto L_0x030a
            r3.add(r6)
        L_0x030a:
            r2 = 0
            goto L_0x002f
        L_0x030d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzamc.zzb(com.google.android.gms.internal.ads.zzen):java.util.List");
    }
}
