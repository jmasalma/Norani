package com.google.android.gms.internal.ads;

import android.graphics.Color;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzalm {
    public final String zza;
    public final int zzb;
    public final Integer zzc;
    public final Integer zzd;
    public final float zze;
    public final boolean zzf;
    public final boolean zzg;
    public final boolean zzh;
    public final boolean zzi;
    public final int zzj;

    private zzalm(String str, int i, Integer num, Integer num2, float f, boolean z, boolean z2, boolean z3, boolean z4, int i2) {
        this.zza = str;
        this.zzb = i;
        this.zzc = num;
        this.zzd = num2;
        this.zze = f;
        this.zzf = z;
        this.zzg = z2;
        this.zzh = z3;
        this.zzi = z4;
        this.zzj = i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x010b, code lost:
        if (r5 != 3) goto L_0x010d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b4 A[Catch:{ RuntimeException -> 0x0129 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b6 A[Catch:{ RuntimeException -> 0x0129 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c7 A[Catch:{ RuntimeException -> 0x0129 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ca A[Catch:{ RuntimeException -> 0x0129 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00dc A[Catch:{ RuntimeException -> 0x0129 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00df A[Catch:{ RuntimeException -> 0x0129 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00f1 A[Catch:{ RuntimeException -> 0x0129 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00f4 A[Catch:{ RuntimeException -> 0x0129 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00fa A[Catch:{ RuntimeException -> 0x0129 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.ads.zzalm zzb(java.lang.String r20, com.google.android.gms.internal.ads.zzalk r21) {
        /*
            r1 = r20
            r2 = r21
            java.lang.String r3 = "'"
            java.lang.String r4 = "Failed to parse font size: '"
            java.lang.String r0 = "Style:"
            boolean r0 = r1.startsWith(r0)
            com.google.android.gms.internal.ads.zzdd.zzd(r0)
            r0 = 6
            java.lang.String r0 = r1.substring(r0)
            java.lang.String r5 = ","
            java.lang.String[] r5 = android.text.TextUtils.split(r0, r5)
            int r0 = r5.length
            int r6 = r2.zzk
            r7 = 0
            java.lang.String r8 = "SsaStyle"
            if (r0 == r6) goto L_0x003e
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r2, r0, r1}
            java.lang.String r1 = com.google.android.gms.internal.ads.zzex.zza
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r2 = "Skipping malformed 'Style:' line (expected %s values, found %s): '%s'"
            java.lang.String r0 = java.lang.String.format(r1, r2, r0)
            com.google.android.gms.internal.ads.zzea.zzf(r8, r0)
            return r7
        L_0x003e:
            com.google.android.gms.internal.ads.zzalm r6 = new com.google.android.gms.internal.ads.zzalm     // Catch:{ RuntimeException -> 0x0129 }
            int r0 = r2.zza     // Catch:{ RuntimeException -> 0x0129 }
            r0 = r5[r0]     // Catch:{ RuntimeException -> 0x0129 }
            java.lang.String r10 = r0.trim()     // Catch:{ RuntimeException -> 0x0129 }
            int r0 = r2.zzb     // Catch:{ RuntimeException -> 0x0129 }
            r9 = -1
            if (r0 == r9) goto L_0x0059
            r0 = r5[r0]     // Catch:{ RuntimeException -> 0x0129 }
            java.lang.String r0 = r0.trim()     // Catch:{ RuntimeException -> 0x0129 }
            int r0 = zzd(r0)     // Catch:{ RuntimeException -> 0x0129 }
            r11 = r0
            goto L_0x005a
        L_0x0059:
            r11 = r9
        L_0x005a:
            int r0 = r2.zzc     // Catch:{ RuntimeException -> 0x0129 }
            if (r0 == r9) goto L_0x006a
            r0 = r5[r0]     // Catch:{ RuntimeException -> 0x0129 }
            java.lang.String r0 = r0.trim()     // Catch:{ RuntimeException -> 0x0129 }
            java.lang.Integer r0 = zzc(r0)     // Catch:{ RuntimeException -> 0x0129 }
            r12 = r0
            goto L_0x006b
        L_0x006a:
            r12 = r7
        L_0x006b:
            int r0 = r2.zzd     // Catch:{ RuntimeException -> 0x0129 }
            if (r0 == r9) goto L_0x007b
            r0 = r5[r0]     // Catch:{ RuntimeException -> 0x0129 }
            java.lang.String r0 = r0.trim()     // Catch:{ RuntimeException -> 0x0129 }
            java.lang.Integer r0 = zzc(r0)     // Catch:{ RuntimeException -> 0x0129 }
            r13 = r0
            goto L_0x007c
        L_0x007b:
            r13 = r7
        L_0x007c:
            int r0 = r2.zze     // Catch:{ RuntimeException -> 0x0129 }
            if (r0 == r9) goto L_0x00a0
            r0 = r5[r0]     // Catch:{ RuntimeException -> 0x0129 }
            java.lang.String r15 = r0.trim()     // Catch:{ RuntimeException -> 0x0129 }
            float r0 = java.lang.Float.parseFloat(r15)     // Catch:{ NumberFormatException -> 0x008c }
            r14 = r0
            goto L_0x00a3
        L_0x008c:
            r0 = move-exception
            r14 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x0129 }
            r0.<init>(r4)     // Catch:{ RuntimeException -> 0x0129 }
            r0.append(r15)     // Catch:{ RuntimeException -> 0x0129 }
            r0.append(r3)     // Catch:{ RuntimeException -> 0x0129 }
            java.lang.String r0 = r0.toString()     // Catch:{ RuntimeException -> 0x0129 }
            com.google.android.gms.internal.ads.zzea.zzg(r8, r0, r14)     // Catch:{ RuntimeException -> 0x0129 }
        L_0x00a0:
            r14 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
        L_0x00a3:
            int r0 = r2.zzf     // Catch:{ RuntimeException -> 0x0129 }
            r4 = 1
            if (r0 == r9) goto L_0x00b6
            r0 = r5[r0]     // Catch:{ RuntimeException -> 0x0129 }
            java.lang.String r0 = r0.trim()     // Catch:{ RuntimeException -> 0x0129 }
            boolean r0 = zze(r0)     // Catch:{ RuntimeException -> 0x0129 }
            if (r0 == 0) goto L_0x00b6
            r0 = r4
            goto L_0x00b7
        L_0x00b6:
            r0 = 0
        L_0x00b7:
            int r15 = r2.zzg     // Catch:{ RuntimeException -> 0x0129 }
            if (r15 == r9) goto L_0x00ca
            r15 = r5[r15]     // Catch:{ RuntimeException -> 0x0129 }
            java.lang.String r15 = r15.trim()     // Catch:{ RuntimeException -> 0x0129 }
            boolean r15 = zze(r15)     // Catch:{ RuntimeException -> 0x0129 }
            if (r15 == 0) goto L_0x00ca
            r17 = r4
            goto L_0x00cc
        L_0x00ca:
            r17 = 0
        L_0x00cc:
            int r15 = r2.zzh     // Catch:{ RuntimeException -> 0x0129 }
            if (r15 == r9) goto L_0x00df
            r15 = r5[r15]     // Catch:{ RuntimeException -> 0x0129 }
            java.lang.String r15 = r15.trim()     // Catch:{ RuntimeException -> 0x0129 }
            boolean r15 = zze(r15)     // Catch:{ RuntimeException -> 0x0129 }
            if (r15 == 0) goto L_0x00df
            r18 = r4
            goto L_0x00e1
        L_0x00df:
            r18 = 0
        L_0x00e1:
            int r15 = r2.zzi     // Catch:{ RuntimeException -> 0x0129 }
            if (r15 == r9) goto L_0x00f4
            r15 = r5[r15]     // Catch:{ RuntimeException -> 0x0129 }
            java.lang.String r15 = r15.trim()     // Catch:{ RuntimeException -> 0x0129 }
            boolean r15 = zze(r15)     // Catch:{ RuntimeException -> 0x0129 }
            if (r15 == 0) goto L_0x00f4
            r19 = r4
            goto L_0x00f6
        L_0x00f4:
            r19 = 0
        L_0x00f6:
            int r2 = r2.zzj     // Catch:{ RuntimeException -> 0x0129 }
            if (r2 == r9) goto L_0x011a
            r2 = r5[r2]     // Catch:{ RuntimeException -> 0x0129 }
            java.lang.String r2 = r2.trim()     // Catch:{ RuntimeException -> 0x0129 }
            java.lang.String r5 = r2.trim()     // Catch:{ NumberFormatException -> 0x010d }
            int r5 = java.lang.Integer.parseInt(r5)     // Catch:{ NumberFormatException -> 0x010d }
            if (r5 == r4) goto L_0x011b
            r4 = 3
            if (r5 == r4) goto L_0x011b
        L_0x010d:
            java.lang.String r4 = "Ignoring unknown BorderStyle: "
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ RuntimeException -> 0x0129 }
            java.lang.String r2 = r4.concat(r2)     // Catch:{ RuntimeException -> 0x0129 }
            com.google.android.gms.internal.ads.zzea.zzf(r8, r2)     // Catch:{ RuntimeException -> 0x0129 }
        L_0x011a:
            r5 = r9
        L_0x011b:
            r9 = r6
            r15 = r0
            r16 = r17
            r17 = r18
            r18 = r19
            r19 = r5
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)     // Catch:{ RuntimeException -> 0x0129 }
            return r6
        L_0x0129:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "Skipping malformed 'Style:' line: '"
            r2.<init>(r4)
            r2.append(r1)
            r2.append(r3)
            java.lang.String r1 = r2.toString()
            com.google.android.gms.internal.ads.zzea.zzg(r8, r1, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzalm.zzb(java.lang.String, com.google.android.gms.internal.ads.zzalk):com.google.android.gms.internal.ads.zzalm");
    }

    public static Integer zzc(String str) {
        long j;
        try {
            if (str.startsWith("&H")) {
                j = Long.parseLong(str.substring(2), 16);
            } else {
                j = Long.parseLong(str);
            }
            zzdd.zzd(j <= 4294967295L);
            return Integer.valueOf(Color.argb(zzgbt.zzb(((j >> 24) & 255) ^ 255), zzgbt.zzb(j & 255), zzgbt.zzb((j >> 8) & 255), zzgbt.zzb((j >> 16) & 255)));
        } catch (IllegalArgumentException e) {
            zzea.zzg("SsaStyle", "Failed to parse color expression: '" + str + "'", e);
            return null;
        }
    }

    /* access modifiers changed from: private */
    public static int zzd(String str) {
        try {
            int parseInt = Integer.parseInt(str.trim());
            switch (parseInt) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    return parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        zzea.zzf("SsaStyle", "Ignoring unknown alignment: ".concat(String.valueOf(str)));
        return -1;
    }

    private static boolean zze(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            return parseInt == 1 || parseInt == -1;
        } catch (NumberFormatException e) {
            zzea.zzg("SsaStyle", "Failed to parse boolean value: '" + str + "'", e);
            return false;
        }
    }
}
