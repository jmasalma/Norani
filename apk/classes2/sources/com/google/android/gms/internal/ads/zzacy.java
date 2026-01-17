package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbcj;
import com.google.common.primitives.SignedBytes;
import kotlin.KotlinVersion;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzacy {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {2002, 2000, 1920, 1601, 1600, 1001, zzbcj.zzq.zzf, 960, 800, 800, 480, 400, 400, 2048};

    /* JADX WARNING: Removed duplicated region for block: B:136:0x01ee  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x01fe  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0201  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0245  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x025e  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0277  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0282  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x02c6  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x02d7  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x031c  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0131  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.ads.zzz zza(com.google.android.gms.internal.ads.zzen r18, java.lang.String r19, java.lang.String r20, com.google.android.gms.internal.ads.zzs r21) throws com.google.android.gms.internal.ads.zzaz {
        /*
            com.google.android.gms.internal.ads.zzem r0 = new com.google.android.gms.internal.ads.zzem
            r0.<init>()
            r1 = r18
            r0.zzj(r1)
            int r1 = r0.zza()
            r2 = 3
            int r3 = r0.zzd(r2)
            r4 = 1
            if (r3 > r4) goto L_0x0323
            r5 = 7
            int r6 = r0.zzd(r5)
            boolean r7 = r0.zzp()
            if (r4 == r7) goto L_0x0025
            r7 = 44100(0xac44, float:6.1797E-41)
            goto L_0x0028
        L_0x0025:
            r7 = 48000(0xbb80, float:6.7262E-41)
        L_0x0028:
            r8 = 4
            r0.zzn(r8)
            r9 = 9
            int r9 = r0.zzd(r9)
            r10 = 16
            if (r6 <= r4) goto L_0x0054
            if (r3 == 0) goto L_0x004d
            boolean r11 = r0.zzp()
            if (r11 == 0) goto L_0x0054
            r0.zzn(r10)
            boolean r11 = r0.zzp()
            if (r11 == 0) goto L_0x0054
            r11 = 128(0x80, float:1.794E-43)
            r0.zzn(r11)
            goto L_0x0054
        L_0x004d:
            java.lang.String r0 = "Invalid AC-4 DSI version: 0"
            com.google.android.gms.internal.ads.zzaz r0 = com.google.android.gms.internal.ads.zzaz.zzc(r0)
            throw r0
        L_0x0054:
            if (r3 != r4) goto L_0x0067
            boolean r11 = zzg(r0)
            if (r11 == 0) goto L_0x0060
            r0.zzf()
            goto L_0x0067
        L_0x0060:
            java.lang.String r0 = "Invalid AC-4 DSI bitrate."
            com.google.android.gms.internal.ads.zzaz r0 = com.google.android.gms.internal.ads.zzaz.zzc(r0)
            throw r0
        L_0x0067:
            com.google.android.gms.internal.ads.zzacv r11 = new com.google.android.gms.internal.ads.zzacv
            r12 = 0
            r11.<init>(r12)
            r13 = 0
        L_0x006e:
            r12 = 6
            r8 = 5
            r15 = 8
            r14 = 2
            if (r13 >= r9) goto L_0x0279
            if (r3 != 0) goto L_0x008b
            boolean r9 = r0.zzp()
            int r16 = r0.zzd(r8)
            int r17 = r0.zzd(r8)
            r5 = r16
            r15 = r17
            r2 = 0
            r4 = 0
            r10 = 0
            goto L_0x00bf
        L_0x008b:
            int r5 = r0.zzd(r15)
            int r4 = r0.zzd(r15)
            r2 = 255(0xff, float:3.57E-43)
            if (r4 != r2) goto L_0x009c
            int r4 = r0.zzd(r10)
            int r4 = r4 + r2
        L_0x009c:
            if (r5 <= r14) goto L_0x00aa
            int r4 = r4 * 8
            r0.zzn(r4)
            int r13 = r13 + 1
            r2 = 3
            r4 = 1
            r5 = 7
            r8 = 4
            goto L_0x006e
        L_0x00aa:
            int r2 = r0.zza()
            int r2 = r1 - r2
            int r2 = r2 / r15
            int r9 = r0.zzd(r8)
            r10 = 31
            if (r9 != r10) goto L_0x00bb
            r10 = 1
            goto L_0x00bc
        L_0x00bb:
            r10 = 0
        L_0x00bc:
            r15 = r5
            r5 = r9
            r9 = 0
        L_0x00bf:
            r11.zzf = r15
            if (r9 != 0) goto L_0x00cc
            if (r10 != 0) goto L_0x00cc
            if (r5 == r12) goto L_0x00c8
            goto L_0x00cc
        L_0x00c8:
            r5 = 7
            r8 = 2
            goto L_0x01ef
        L_0x00cc:
            r12 = 3
            int r14 = r0.zzd(r12)
            r11.zzg = r14
            boolean r12 = r0.zzp()
            if (r12 == 0) goto L_0x00dc
            r0.zzn(r8)
        L_0x00dc:
            r12 = 2
            r0.zzn(r12)
            r14 = 1
            if (r3 != r14) goto L_0x00eb
            if (r15 == r14) goto L_0x00e8
            if (r15 != r12) goto L_0x00eb
            r15 = r12
        L_0x00e8:
            r0.zzn(r12)
        L_0x00eb:
            r0.zzn(r8)
            r12 = 10
            r0.zzn(r12)
            r12 = 1
            if (r3 != r12) goto L_0x0169
            if (r15 <= 0) goto L_0x00fe
            boolean r14 = r0.zzp()
            r11.zza = r14
        L_0x00fe:
            boolean r14 = r11.zza
            if (r14 == 0) goto L_0x0138
            if (r15 == r12) goto L_0x010e
            r12 = 2
            if (r15 != r12) goto L_0x0109
            r12 = 2
            goto L_0x010f
        L_0x0109:
            r8 = r12
            r12 = r15
        L_0x010b:
            r14 = 24
            goto L_0x0133
        L_0x010e:
            r12 = 1
        L_0x010f:
            int r14 = r0.zzd(r8)
            if (r14 < 0) goto L_0x011b
            r8 = 15
            if (r14 > r8) goto L_0x011b
            r11.zzb = r14
        L_0x011b:
            r8 = 11
            if (r14 < r8) goto L_0x0131
            r8 = 14
            if (r14 > r8) goto L_0x0131
            boolean r8 = r0.zzp()
            r11.zzd = r8
            r8 = 2
            int r14 = r0.zzd(r8)
            r11.zze = r14
            goto L_0x010b
        L_0x0131:
            r8 = 2
            goto L_0x010b
        L_0x0133:
            r0.zzn(r14)
            r14 = 1
            goto L_0x013b
        L_0x0138:
            r8 = 2
            r14 = r12
            r12 = r15
        L_0x013b:
            if (r15 == r14) goto L_0x013f
            if (r15 != r8) goto L_0x0168
        L_0x013f:
            boolean r14 = r0.zzp()
            if (r14 == 0) goto L_0x014e
            boolean r14 = r0.zzp()
            if (r14 == 0) goto L_0x014e
            r0.zzn(r8)
        L_0x014e:
            boolean r8 = r0.zzp()
            if (r8 == 0) goto L_0x0168
            r0.zzm()
            r8 = 8
            int r14 = r0.zzd(r8)
            r15 = 0
        L_0x015e:
            if (r15 >= r14) goto L_0x0168
            r0.zzn(r8)
            int r15 = r15 + 1
            r8 = 8
            goto L_0x015e
        L_0x0168:
            r15 = r12
        L_0x0169:
            if (r9 != 0) goto L_0x01da
            if (r10 == 0) goto L_0x016f
            goto L_0x01da
        L_0x016f:
            r0.zzm()
            if (r5 == 0) goto L_0x01c4
            r8 = 1
            if (r5 == r8) goto L_0x01c4
            r8 = 2
            if (r5 == r8) goto L_0x01c4
            r8 = 3
            if (r5 == r8) goto L_0x01ad
            r8 = 4
            if (r5 == r8) goto L_0x01ad
            r8 = 5
            if (r5 == r8) goto L_0x0195
            r5 = 7
            int r8 = r0.zzd(r5)
            r5 = 0
        L_0x0189:
            if (r5 >= r8) goto L_0x0193
            r9 = 8
            r0.zzn(r9)
            int r5 = r5 + 1
            goto L_0x0189
        L_0x0193:
            r8 = 2
            goto L_0x01e5
        L_0x0195:
            if (r15 != 0) goto L_0x019c
            zzd(r0, r11)
        L_0x019a:
            r8 = 2
            goto L_0x01e0
        L_0x019c:
            r5 = 3
            int r8 = r0.zzd(r5)
            r5 = 0
        L_0x01a2:
            r9 = 2
            int r14 = r8 + 2
            if (r5 >= r14) goto L_0x0193
            zze(r0, r11)
            int r5 = r5 + 1
            goto L_0x01a2
        L_0x01ad:
            if (r15 != 0) goto L_0x01b9
            r5 = 0
            r8 = 3
        L_0x01b1:
            if (r5 >= r8) goto L_0x019a
            zzd(r0, r11)
            int r5 = r5 + 1
            goto L_0x01b1
        L_0x01b9:
            r8 = 3
            r5 = 0
        L_0x01bb:
            if (r5 >= r8) goto L_0x0193
            zze(r0, r11)
            int r5 = r5 + 1
            r8 = 3
            goto L_0x01bb
        L_0x01c4:
            if (r15 != 0) goto L_0x01d0
            r5 = 0
            r8 = 2
        L_0x01c8:
            if (r5 >= r8) goto L_0x01e0
            zzd(r0, r11)
            int r5 = r5 + 1
            goto L_0x01c8
        L_0x01d0:
            r8 = 2
            r5 = 0
        L_0x01d2:
            if (r5 >= r8) goto L_0x01e5
            zze(r0, r11)
            int r5 = r5 + 1
            goto L_0x01d2
        L_0x01da:
            r8 = 2
            if (r15 != 0) goto L_0x01e2
            zzd(r0, r11)
        L_0x01e0:
            r15 = 0
            goto L_0x01e5
        L_0x01e2:
            zze(r0, r11)
        L_0x01e5:
            r0.zzm()
            boolean r5 = r0.zzp()
            if (r5 == 0) goto L_0x01fe
            r5 = 7
        L_0x01ef:
            int r9 = r0.zzd(r5)
            r10 = 0
        L_0x01f4:
            if (r10 >= r9) goto L_0x01ff
            r12 = 15
            r0.zzn(r12)
            int r10 = r10 + 1
            goto L_0x01f4
        L_0x01fe:
            r5 = 7
        L_0x01ff:
            if (r15 <= 0) goto L_0x023b
            boolean r9 = r0.zzp()
            if (r9 == 0) goto L_0x0215
            boolean r9 = zzg(r0)
            if (r9 == 0) goto L_0x020e
            goto L_0x0215
        L_0x020e:
            java.lang.String r0 = "Can't parse bitrate DSI."
            com.google.android.gms.internal.ads.zzaz r0 = com.google.android.gms.internal.ads.zzaz.zzc(r0)
            throw r0
        L_0x0215:
            boolean r9 = r0.zzp()
            if (r9 == 0) goto L_0x023b
            r0.zzf()
            r9 = 16
            int r9 = r0.zzd(r9)
            r0.zzo(r9)
            r9 = 5
            int r10 = r0.zzd(r9)
            r12 = 0
        L_0x022d:
            r14 = 3
            if (r12 >= r10) goto L_0x023d
            r0.zzn(r14)
            r15 = 8
            r0.zzn(r15)
            int r12 = r12 + 1
            goto L_0x022d
        L_0x023b:
            r9 = 5
            r14 = 3
        L_0x023d:
            r15 = 8
            r0.zzf()
            r10 = 1
            if (r3 != r10) goto L_0x025a
            int r3 = r0.zza()
            int r1 = r1 - r3
            int r1 = r1 / r15
            int r1 = r1 - r2
            if (r4 < r1) goto L_0x0253
            int r4 = r4 - r1
            r0.zzo(r4)
            goto L_0x025a
        L_0x0253:
            java.lang.String r0 = "pres_bytes is smaller than presentation bytes read."
            com.google.android.gms.internal.ads.zzaz r0 = com.google.android.gms.internal.ads.zzaz.zzc(r0)
            throw r0
        L_0x025a:
            boolean r0 = r11.zza
            if (r0 == 0) goto L_0x0277
            int r0 = r11.zzb
            r1 = -1
            if (r0 == r1) goto L_0x0264
            goto L_0x027e
        L_0x0264:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Can't determine channel mode of presentation "
            r0.<init>(r1)
            r0.append(r13)
            java.lang.String r0 = r0.toString()
            com.google.android.gms.internal.ads.zzaz r0 = com.google.android.gms.internal.ads.zzaz.zzc(r0)
            throw r0
        L_0x0277:
            r1 = -1
            goto L_0x027e
        L_0x0279:
            r9 = r8
            r8 = r14
            r1 = -1
            r5 = 7
            r14 = r2
        L_0x027e:
            boolean r0 = r11.zza
            if (r0 == 0) goto L_0x02c6
            int r0 = r11.zzb
            boolean r2 = r11.zzd
            int r3 = r11.zze
            r4 = 13
            r10 = 12
            switch(r0) {
                case 0: goto L_0x02a9;
                case 1: goto L_0x02a7;
                case 2: goto L_0x02a5;
                case 3: goto L_0x02a3;
                case 4: goto L_0x02a1;
                case 5: goto L_0x029f;
                case 6: goto L_0x029d;
                case 7: goto L_0x029f;
                case 8: goto L_0x029d;
                case 9: goto L_0x029f;
                case 10: goto L_0x029d;
                case 11: goto L_0x029a;
                case 12: goto L_0x0298;
                case 13: goto L_0x0296;
                case 14: goto L_0x0293;
                case 15: goto L_0x0290;
                default: goto L_0x028f;
            }
        L_0x028f:
            goto L_0x02aa
        L_0x0290:
            r1 = 24
            goto L_0x02aa
        L_0x0293:
            r1 = 14
            goto L_0x02aa
        L_0x0296:
            r1 = r4
            goto L_0x02aa
        L_0x0298:
            r1 = r10
            goto L_0x02aa
        L_0x029a:
            r1 = 11
            goto L_0x02aa
        L_0x029d:
            r1 = r15
            goto L_0x02aa
        L_0x029f:
            r1 = r5
            goto L_0x02aa
        L_0x02a1:
            r1 = 6
            goto L_0x02aa
        L_0x02a3:
            r1 = r9
            goto L_0x02aa
        L_0x02a5:
            r1 = r14
            goto L_0x02aa
        L_0x02a7:
            r1 = r8
            goto L_0x02aa
        L_0x02a9:
            r1 = 1
        L_0x02aa:
            r5 = 11
            if (r0 == r5) goto L_0x02b6
            if (r0 == r10) goto L_0x02b6
            if (r0 == r4) goto L_0x02b6
            r4 = 14
            if (r0 != r4) goto L_0x02d5
        L_0x02b6:
            if (r2 != 0) goto L_0x02ba
            int r1 = r1 + -2
        L_0x02ba:
            if (r3 == 0) goto L_0x02c3
            r0 = 1
            if (r3 == r0) goto L_0x02c0
            goto L_0x02d5
        L_0x02c0:
            int r1 = r1 + -2
            goto L_0x02d5
        L_0x02c3:
            int r1 = r1 + -4
            goto L_0x02d5
        L_0x02c6:
            r0 = 1
            int r1 = r11.zzc
            int r1 = r1 + r0
            int r0 = r11.zzg
            r2 = 4
            if (r0 != r2) goto L_0x02d5
            r0 = 17
            if (r1 != r0) goto L_0x02d5
            r1 = 21
        L_0x02d5:
            if (r1 <= 0) goto L_0x031c
            int r0 = r11.zzf
            int r2 = r11.zzg
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r0 = new java.lang.Object[]{r3, r0, r2}
            java.lang.String r2 = com.google.android.gms.internal.ads.zzex.zza
            java.util.Locale r2 = java.util.Locale.US
            java.lang.String r3 = "ac-4.%02d.%02d.%02d"
            java.lang.String r0 = java.lang.String.format(r2, r3, r0)
            com.google.android.gms.internal.ads.zzx r2 = new com.google.android.gms.internal.ads.zzx
            r2.<init>()
            r3 = r19
            r2.zzS(r3)
            java.lang.String r3 = "audio/ac4"
            r2.zzah(r3)
            r2.zzD(r1)
            r2.zzai(r7)
            r1 = r21
            r2.zzL(r1)
            r1 = r20
            r2.zzW(r1)
            r2.zzE(r0)
            com.google.android.gms.internal.ads.zzz r0 = r2.zzan()
            return r0
        L_0x031c:
            java.lang.String r0 = "Can't determine channel count of presentation."
            com.google.android.gms.internal.ads.zzaz r0 = com.google.android.gms.internal.ads.zzaz.zzc(r0)
            throw r0
        L_0x0323:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unsupported AC-4 DSI version: "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.google.android.gms.internal.ads.zzaz r0 = com.google.android.gms.internal.ads.zzaz.zzc(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzacy.zza(com.google.android.gms.internal.ads.zzen, java.lang.String, java.lang.String, com.google.android.gms.internal.ads.zzs):com.google.android.gms.internal.ads.zzz");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0090, code lost:
        if (r12 != 11) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0095, code lost:
        if (r12 != 11) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x009a, code lost:
        if (r12 != 8) goto L_0x009e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.ads.zzacw zzb(com.google.android.gms.internal.ads.zzem r12) {
        /*
            r0 = 16
            int r1 = r12.zzd(r0)
            int r0 = r12.zzd(r0)
            r2 = 65535(0xffff, float:9.1834E-41)
            r3 = 4
            if (r0 != r2) goto L_0x0018
            r0 = 24
            int r0 = r12.zzd(r0)
            r2 = 7
            goto L_0x0019
        L_0x0018:
            r2 = r3
        L_0x0019:
            int r0 = r0 + r2
            r2 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r2) goto L_0x0021
            int r0 = r0 + 2
        L_0x0021:
            r8 = r0
            r0 = 2
            int r1 = r12.zzd(r0)
            r2 = 0
            r4 = 3
            if (r1 != r4) goto L_0x003d
            r1 = r2
        L_0x002c:
            int r5 = r12.zzd(r0)
            int r1 = r1 + r5
            boolean r5 = r12.zzp()
            if (r5 != 0) goto L_0x0039
            int r1 = r1 + r4
            goto L_0x003d
        L_0x0039:
            int r1 = r1 + 1
            int r1 = r1 << r0
            goto L_0x002c
        L_0x003d:
            r5 = r1
            r1 = 10
            int r1 = r12.zzd(r1)
            boolean r6 = r12.zzp()
            if (r6 == 0) goto L_0x0053
            int r6 = r12.zzd(r4)
            if (r6 <= 0) goto L_0x0053
            r12.zzn(r0)
        L_0x0053:
            boolean r6 = r12.zzp()
            r7 = 44100(0xac44, float:6.1797E-41)
            r9 = 48000(0xbb80, float:6.7262E-41)
            r10 = 1
            if (r10 == r6) goto L_0x0062
            r11 = r7
            goto L_0x0063
        L_0x0062:
            r11 = r9
        L_0x0063:
            int r12 = r12.zzd(r3)
            if (r11 != r7) goto L_0x0073
            r6 = 13
            if (r12 != r6) goto L_0x0073
            int[] r12 = zzb
            r12 = r12[r6]
            r9 = r12
            goto L_0x009f
        L_0x0073:
            if (r11 != r9) goto L_0x009e
            r6 = 14
            if (r12 >= r6) goto L_0x009e
            int[] r2 = zzb
            r2 = r2[r12]
            int r1 = r1 % 5
            r6 = 8
            if (r1 == r10) goto L_0x0098
            r7 = 11
            if (r1 == r0) goto L_0x0093
            if (r1 == r4) goto L_0x0098
            if (r1 == r3) goto L_0x008c
            goto L_0x009e
        L_0x008c:
            if (r12 == r4) goto L_0x009c
            if (r12 == r6) goto L_0x009c
            if (r12 != r7) goto L_0x009e
            goto L_0x009c
        L_0x0093:
            if (r12 == r6) goto L_0x009c
            if (r12 != r7) goto L_0x009e
            goto L_0x009c
        L_0x0098:
            if (r12 == r4) goto L_0x009c
            if (r12 != r6) goto L_0x009e
        L_0x009c:
            int r2 = r2 + 1
        L_0x009e:
            r9 = r2
        L_0x009f:
            com.google.android.gms.internal.ads.zzacw r12 = new com.google.android.gms.internal.ads.zzacw
            r6 = 2
            r10 = 0
            r4 = r12
            r7 = r11
            r4.<init>(r5, r6, r7, r8, r9, r10)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzacy.zzb(com.google.android.gms.internal.ads.zzem):com.google.android.gms.internal.ads.zzacw");
    }

    public static void zzc(int i, zzen zzen) {
        zzen.zzI(7);
        byte[] zzN = zzen.zzN();
        zzN[0] = -84;
        zzN[1] = SignedBytes.MAX_POWER_OF_TWO;
        zzN[2] = -1;
        zzN[3] = -1;
        zzN[4] = (byte) ((i >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
        zzN[5] = (byte) ((i >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        zzN[6] = (byte) (i & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    private static void zzd(zzem zzem, zzacv zzacv) throws zzaz {
        int zzd = zzem.zzd(5);
        zzem.zzn(2);
        if (zzem.zzp()) {
            zzem.zzn(5);
        }
        if (zzd >= 7 && zzd <= 10) {
            zzem.zzm();
        }
        if (zzem.zzp()) {
            int zzd2 = zzem.zzd(3);
            if (zzacv.zzb == -1 && zzd >= 0 && zzd <= 15 && (zzd2 == 0 || zzd2 == 1)) {
                zzacv.zzb = zzd;
            }
            if (zzem.zzp()) {
                zzf(zzem);
            }
        }
    }

    private static void zze(zzem zzem, zzacv zzacv) throws zzaz {
        zzem.zzn(2);
        boolean zzp = zzem.zzp();
        int zzd = zzem.zzd(8);
        for (int i = 0; i < zzd; i++) {
            zzem.zzn(2);
            if (zzem.zzp()) {
                zzem.zzn(5);
            }
            if (zzp) {
                zzem.zzn(24);
            } else {
                if (zzem.zzp()) {
                    if (!zzem.zzp()) {
                        zzem.zzn(4);
                    }
                    zzacv.zzc = zzem.zzd(6) + 1;
                }
                zzem.zzn(4);
            }
        }
        if (zzem.zzp()) {
            zzem.zzn(3);
            if (zzem.zzp()) {
                zzf(zzem);
            }
        }
    }

    private static void zzf(zzem zzem) throws zzaz {
        int zzd = zzem.zzd(6);
        if (zzd < 2 || zzd > 42) {
            throw zzaz.zzc(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", new Object[]{Integer.valueOf(zzd)}));
        }
        zzem.zzn(zzd * 8);
    }

    private static boolean zzg(zzem zzem) {
        if (zzem.zza() < 66) {
            return false;
        }
        zzem.zzn(66);
        return true;
    }
}
