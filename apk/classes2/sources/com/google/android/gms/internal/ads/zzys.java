package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzys extends zzyp {
    private final boolean zze;
    private final zzyi zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final int zzm;
    private final int zzn;
    private final int zzo;
    private final boolean zzp;
    private final int zzq;
    private final int zzr;
    private final boolean zzs;
    private final boolean zzt;
    private final int zzu;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004d, code lost:
        if (r1 >= 0) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0055, code lost:
        if (r1 >= 0) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0062, code lost:
        if (r1 >= 0.0f) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x006a, code lost:
        if (r12 >= 0) goto L_0x006c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x00b4 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0106 A[EDGE_INSN: B:137:0x0106->B:76:0x0106 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0128  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzys(int r5, com.google.android.gms.internal.ads.zzbm r6, int r7, com.google.android.gms.internal.ads.zzyi r8, int r9, java.lang.String r10, int r11, boolean r12) {
        /*
            r4 = this;
            r4.<init>(r5, r6, r7)
            r4.zzf = r8
            boolean r5 = r8.zzI
            r6 = 1
            if (r6 == r5) goto L_0x000d
            r5 = 16
            goto L_0x000f
        L_0x000d:
            r5 = 24
        L_0x000f:
            boolean r7 = r8.zzH
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            r11 = -1
            r0 = 0
            if (r12 == 0) goto L_0x0040
            com.google.android.gms.internal.ads.zzz r1 = r4.zzd
            int r2 = r1.zzv
            if (r2 == r11) goto L_0x0021
            int r3 = r8.zza
            if (r2 > r3) goto L_0x0040
        L_0x0021:
            int r2 = r1.zzw
            if (r2 == r11) goto L_0x0029
            int r3 = r8.zzb
            if (r2 > r3) goto L_0x0040
        L_0x0029:
            float r2 = r1.zzz
            int r3 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x0036
            int r3 = r8.zzc
            float r3 = (float) r3
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 > 0) goto L_0x0040
        L_0x0036:
            int r1 = r1.zzj
            if (r1 == r11) goto L_0x003e
            int r2 = r8.zzd
            if (r1 > r2) goto L_0x0040
        L_0x003e:
            r1 = r6
            goto L_0x0041
        L_0x0040:
            r1 = r0
        L_0x0041:
            r4.zze = r1
            if (r12 == 0) goto L_0x006e
            com.google.android.gms.internal.ads.zzz r12 = r4.zzd
            int r1 = r12.zzv
            if (r1 == r11) goto L_0x004f
            int r2 = r8.zze
            if (r1 < 0) goto L_0x006e
        L_0x004f:
            int r1 = r12.zzw
            if (r1 == r11) goto L_0x0057
            int r2 = r8.zzf
            if (r1 < 0) goto L_0x006e
        L_0x0057:
            float r1 = r12.zzz
            int r2 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r2 == 0) goto L_0x0064
            int r2 = r8.zzg
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 < 0) goto L_0x006e
        L_0x0064:
            int r12 = r12.zzj
            if (r12 == r11) goto L_0x006c
            int r1 = r8.zzh
            if (r12 < 0) goto L_0x006e
        L_0x006c:
            r12 = r6
            goto L_0x006f
        L_0x006e:
            r12 = r0
        L_0x006f:
            r4.zzg = r12
            boolean r12 = com.google.android.gms.internal.ads.zzmb.zza(r9, r0)
            r4.zzh = r12
            com.google.android.gms.internal.ads.zzz r12 = r4.zzd
            float r1 = r12.zzz
            int r7 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r7 == 0) goto L_0x0087
            r7 = 1092616192(0x41200000, float:10.0)
            int r7 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r7 < 0) goto L_0x0087
            r7 = r6
            goto L_0x0088
        L_0x0087:
            r7 = r0
        L_0x0088:
            r4.zzi = r7
            int r7 = r12.zzj
            r4.zzj = r7
            int r7 = r12.zza()
            r4.zzk = r7
            r7 = r0
        L_0x0095:
            com.google.android.gms.internal.ads.zzfyq r12 = r8.zzn
            int r12 = r12.size()
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r7 >= r12) goto L_0x00b4
            com.google.android.gms.internal.ads.zzz r12 = r4.zzd
            com.google.android.gms.internal.ads.zzfyq r2 = r8.zzn
            java.lang.Object r2 = r2.get(r7)
            java.lang.String r2 = (java.lang.String) r2
            int r12 = com.google.android.gms.internal.ads.zzyu.zzc(r12, r2, r0)
            if (r12 <= 0) goto L_0x00b1
            goto L_0x00b6
        L_0x00b1:
            int r7 = r7 + 1
            goto L_0x0095
        L_0x00b4:
            r12 = r0
            r7 = r1
        L_0x00b6:
            r4.zzm = r7
            r4.zzn = r12
            com.google.android.gms.internal.ads.zzz r7 = r4.zzd
            int r7 = r7.zzf
            int r12 = r8.zzo
            int r7 = com.google.android.gms.internal.ads.zzyu.zzb(r7, r0)
            r4.zzo = r7
            com.google.android.gms.internal.ads.zzz r7 = r4.zzd
            int r7 = r7.zzf
            if (r7 == 0) goto L_0x00d2
            r7 = r7 & r6
            if (r7 == 0) goto L_0x00d0
            goto L_0x00d2
        L_0x00d0:
            r7 = r0
            goto L_0x00d3
        L_0x00d2:
            r7 = r6
        L_0x00d3:
            r4.zzp = r7
            java.lang.String r7 = com.google.android.gms.internal.ads.zzyu.zzh(r10)
            if (r7 != 0) goto L_0x00dd
            r7 = r6
            goto L_0x00de
        L_0x00dd:
            r7 = r0
        L_0x00de:
            com.google.android.gms.internal.ads.zzz r12 = r4.zzd
            int r7 = com.google.android.gms.internal.ads.zzyu.zzc(r12, r10, r7)
            r4.zzq = r7
            r7 = r0
        L_0x00e7:
            com.google.android.gms.internal.ads.zzfyq r10 = r8.zzm
            int r10 = r10.size()
            if (r7 >= r10) goto L_0x0106
            com.google.android.gms.internal.ads.zzz r10 = r4.zzd
            java.lang.String r10 = r10.zzo
            if (r10 == 0) goto L_0x0103
            com.google.android.gms.internal.ads.zzfyq r12 = r8.zzm
            java.lang.Object r12 = r12.get(r7)
            boolean r10 = r10.equals(r12)
            if (r10 == 0) goto L_0x0103
            r1 = r7
            goto L_0x0106
        L_0x0103:
            int r7 = r7 + 1
            goto L_0x00e7
        L_0x0106:
            r4.zzl = r1
            r7 = r9 & 384(0x180, float:5.38E-43)
            r8 = 128(0x80, float:1.794E-43)
            if (r7 != r8) goto L_0x0110
            r7 = r6
            goto L_0x0111
        L_0x0110:
            r7 = r0
        L_0x0111:
            r4.zzs = r7
            r7 = r9 & 64
            r8 = 64
            if (r7 != r8) goto L_0x011b
            r7 = r6
            goto L_0x011c
        L_0x011b:
            r7 = r0
        L_0x011c:
            r4.zzt = r7
            com.google.android.gms.internal.ads.zzz r7 = r4.zzd
            java.lang.String r8 = r7.zzo
            r10 = 2
            if (r8 != 0) goto L_0x0128
        L_0x0125:
            r1 = r0
            goto L_0x0177
        L_0x0128:
            int r12 = r8.hashCode()
            r1 = 4
            r2 = 3
            switch(r12) {
                case -1851077871: goto L_0x015a;
                case -1662735862: goto L_0x0150;
                case -1662541442: goto L_0x0146;
                case 1331836730: goto L_0x013c;
                case 1599127257: goto L_0x0132;
                default: goto L_0x0131;
            }
        L_0x0131:
            goto L_0x0164
        L_0x0132:
            java.lang.String r12 = "video/x-vnd.on2.vp9"
            boolean r8 = r8.equals(r12)
            if (r8 == 0) goto L_0x0164
            r8 = r2
            goto L_0x0165
        L_0x013c:
            java.lang.String r12 = "video/avc"
            boolean r8 = r8.equals(r12)
            if (r8 == 0) goto L_0x0164
            r8 = r1
            goto L_0x0165
        L_0x0146:
            java.lang.String r12 = "video/hevc"
            boolean r8 = r8.equals(r12)
            if (r8 == 0) goto L_0x0164
            r8 = r10
            goto L_0x0165
        L_0x0150:
            java.lang.String r12 = "video/av01"
            boolean r8 = r8.equals(r12)
            if (r8 == 0) goto L_0x0164
            r8 = r6
            goto L_0x0165
        L_0x015a:
            java.lang.String r12 = "video/dolby-vision"
            boolean r8 = r8.equals(r12)
            if (r8 == 0) goto L_0x0164
            r8 = r0
            goto L_0x0165
        L_0x0164:
            r8 = r11
        L_0x0165:
            if (r8 == 0) goto L_0x0176
            if (r8 == r6) goto L_0x0177
            if (r8 == r10) goto L_0x0174
            if (r8 == r2) goto L_0x0172
            if (r8 == r1) goto L_0x0170
            goto L_0x0125
        L_0x0170:
            r1 = r6
            goto L_0x0177
        L_0x0172:
            r1 = r10
            goto L_0x0177
        L_0x0174:
            r1 = r2
            goto L_0x0177
        L_0x0176:
            r1 = 5
        L_0x0177:
            r4.zzu = r1
            int r8 = r7.zzf
            r8 = r8 & 16384(0x4000, float:2.2959E-41)
            if (r8 == 0) goto L_0x0181
        L_0x017f:
            r6 = r0
            goto L_0x01ad
        L_0x0181:
            com.google.android.gms.internal.ads.zzyi r8 = r4.zzf
            boolean r12 = r8.zzR
            boolean r12 = com.google.android.gms.internal.ads.zzmb.zza(r9, r12)
            if (r12 != 0) goto L_0x018c
            goto L_0x017f
        L_0x018c:
            boolean r12 = r4.zze
            if (r12 != 0) goto L_0x0195
            boolean r1 = r8.zzG
            if (r1 != 0) goto L_0x0195
            goto L_0x017f
        L_0x0195:
            boolean r0 = com.google.android.gms.internal.ads.zzmb.zza(r9, r0)
            if (r0 == 0) goto L_0x01ad
            boolean r0 = r4.zzg
            if (r0 == 0) goto L_0x01ad
            if (r12 == 0) goto L_0x01ad
            int r7 = r7.zzj
            if (r7 == r11) goto L_0x01ad
            boolean r7 = r8.zzC
            boolean r7 = r8.zzB
            r5 = r5 & r9
            if (r5 == 0) goto L_0x01ad
            r6 = r10
        L_0x01ad:
            r4.zzr = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzys.<init>(int, com.google.android.gms.internal.ads.zzbm, int, com.google.android.gms.internal.ads.zzyi, int, java.lang.String, int, boolean):void");
    }

    public static /* synthetic */ int zza(zzys zzys, zzys zzys2) {
        zzgab zzgab;
        if (!zzys.zze || !zzys.zzh) {
            zzgab = zzyu.zzc.zza();
        } else {
            zzgab = zzyu.zzc;
        }
        zzfyf zzj2 = zzfyf.zzj();
        boolean z = zzys.zzf.zzB;
        return zzj2.zzc(Integer.valueOf(zzys.zzk), Integer.valueOf(zzys2.zzk), zzgab).zzc(Integer.valueOf(zzys.zzj), Integer.valueOf(zzys2.zzj), zzgab).zza();
    }

    public static /* synthetic */ int zzd(zzys zzys, zzys zzys2) {
        zzfyf zzc = zzfyf.zzj().zzd(zzys.zzh, zzys2.zzh).zzc(Integer.valueOf(zzys.zzm), Integer.valueOf(zzys2.zzm), zzgab.zzc().zza()).zzb(zzys.zzn, zzys2.zzn).zzb(zzys.zzo, zzys2.zzo).zzd(zzys.zzp, zzys2.zzp).zzb(zzys.zzq, zzys2.zzq).zzd(zzys.zzi, zzys2.zzi).zzd(zzys.zze, zzys2.zze).zzd(zzys.zzg, zzys2.zzg).zzc(Integer.valueOf(zzys.zzl), Integer.valueOf(zzys2.zzl), zzgab.zzc().zza());
        boolean z = zzys.zzs;
        zzfyf zzd = zzc.zzd(z, zzys2.zzs);
        boolean z2 = zzys.zzt;
        zzfyf zzd2 = zzd.zzd(z2, zzys2.zzt);
        if (z && z2) {
            zzd2 = zzd2.zzb(zzys.zzu, zzys2.zzu);
        }
        return zzd2.zza();
    }

    public final int zzb() {
        return this.zzr;
    }

    public final /* bridge */ /* synthetic */ boolean zzc(zzyp zzyp) {
        zzys zzys = (zzys) zzyp;
        if (!Objects.equals(this.zzd.zzo, zzys.zzd.zzo)) {
            return false;
        }
        boolean z = this.zzf.zzJ;
        return this.zzs == zzys.zzs && this.zzt == zzys.zzt;
    }
}
