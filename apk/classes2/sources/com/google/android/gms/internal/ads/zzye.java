package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzye extends zzyp implements Comparable {
    private final int zze;
    private final boolean zzf;
    private final String zzg;
    private final zzyi zzh;
    private final boolean zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final boolean zzm;
    private final int zzn;
    private final int zzo;
    private final boolean zzp;
    private final int zzq;
    private final int zzr;
    private final int zzs;
    private final int zzt;
    private final boolean zzu;
    private final boolean zzv;
    private final boolean zzw;

    /* JADX WARNING: Removed duplicated region for block: B:107:0x0113 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0139 A[EDGE_INSN: B:109:0x0139->B:76:0x0139 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00f6 A[LOOP:1: B:57:0x00f3->B:59:0x00f6, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0166  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzye(int r7, com.google.android.gms.internal.ads.zzbm r8, int r9, com.google.android.gms.internal.ads.zzyi r10, int r11, boolean r12, com.google.android.gms.internal.ads.zzfvq r13, int r14) {
        /*
            r6 = this;
            r6.<init>(r7, r8, r9)
            r6.zzh = r10
            boolean r7 = r10.zzP
            r8 = 1
            if (r8 == r7) goto L_0x000d
            r7 = 16
            goto L_0x000f
        L_0x000d:
            r7 = 24
        L_0x000f:
            boolean r9 = r10.zzL
            com.google.android.gms.internal.ads.zzz r9 = r6.zzd
            java.lang.String r9 = r9.zzd
            java.lang.String r9 = com.google.android.gms.internal.ads.zzyu.zzh(r9)
            r6.zzg = r9
            r9 = 0
            boolean r14 = com.google.android.gms.internal.ads.zzmb.zza(r11, r9)
            r6.zzi = r14
            r14 = r9
        L_0x0023:
            com.google.android.gms.internal.ads.zzfyq r0 = r10.zzp
            int r0 = r0.size()
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r14 >= r0) goto L_0x0042
            com.google.android.gms.internal.ads.zzz r0 = r6.zzd
            com.google.android.gms.internal.ads.zzfyq r2 = r10.zzp
            java.lang.Object r2 = r2.get(r14)
            java.lang.String r2 = (java.lang.String) r2
            int r0 = com.google.android.gms.internal.ads.zzyu.zzc(r0, r2, r9)
            if (r0 <= 0) goto L_0x003f
            goto L_0x0044
        L_0x003f:
            int r14 = r14 + 1
            goto L_0x0023
        L_0x0042:
            r0 = r9
            r14 = r1
        L_0x0044:
            r6.zzk = r14
            r6.zzj = r0
            com.google.android.gms.internal.ads.zzz r14 = r6.zzd
            int r14 = r14.zzf
            int r0 = r10.zzq
            int r14 = com.google.android.gms.internal.ads.zzyu.zzb(r14, r9)
            r6.zzl = r14
            com.google.android.gms.internal.ads.zzz r14 = r6.zzd
            int r0 = r14.zzf
            if (r0 == 0) goto L_0x0060
            r0 = r0 & r8
            if (r0 == 0) goto L_0x005e
            goto L_0x0060
        L_0x005e:
            r0 = r9
            goto L_0x0061
        L_0x0060:
            r0 = r8
        L_0x0061:
            r6.zzm = r0
            int r0 = r14.zze
            r0 = r0 & r8
            if (r8 == r0) goto L_0x006a
            r0 = r9
            goto L_0x006b
        L_0x006a:
            r0 = r8
        L_0x006b:
            r6.zzp = r0
            java.lang.String r0 = r14.zzo
            r2 = 2
            r3 = -1
            if (r0 != 0) goto L_0x0075
        L_0x0073:
            r0 = r9
            goto L_0x00b0
        L_0x0075:
            int r4 = r0.hashCode()
            r5 = -2123537834(0xffffffff816d6256, float:-4.3600578E-38)
            if (r4 == r5) goto L_0x009d
            r5 = 187078297(0xb269699, float:3.2083734E-32)
            if (r4 == r5) goto L_0x0093
            r5 = 1504698186(0x59afdf4a, float:6.1879537E15)
            if (r4 == r5) goto L_0x0089
            goto L_0x00a7
        L_0x0089:
            java.lang.String r4 = "audio/iamf"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x00a7
            r0 = r2
            goto L_0x00a8
        L_0x0093:
            java.lang.String r4 = "audio/ac4"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x00a7
            r0 = r8
            goto L_0x00a8
        L_0x009d:
            java.lang.String r4 = "audio/eac3-joc"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x00a7
            r0 = r9
            goto L_0x00a8
        L_0x00a7:
            r0 = r3
        L_0x00a8:
            if (r0 == 0) goto L_0x00af
            if (r0 == r8) goto L_0x00af
            if (r0 == r2) goto L_0x00af
            goto L_0x0073
        L_0x00af:
            r0 = r8
        L_0x00b0:
            r6.zzw = r0
            int r0 = r14.zzG
            r6.zzq = r0
            int r0 = r14.zzH
            r6.zzr = r0
            int r0 = r14.zzj
            r6.zzs = r0
            int r0 = r14.zzj
            if (r0 == r3) goto L_0x00c9
            int r4 = r10.zzs
            if (r0 > r4) goto L_0x00c7
            goto L_0x00c9
        L_0x00c7:
            r13 = r9
            goto L_0x00d8
        L_0x00c9:
            int r0 = r14.zzG
            if (r0 == r3) goto L_0x00d1
            int r4 = r10.zzr
            if (r0 > r4) goto L_0x00c7
        L_0x00d1:
            boolean r13 = r13.zza(r14)
            if (r13 == 0) goto L_0x00c7
            r13 = r8
        L_0x00d8:
            r6.zzf = r13
            java.lang.String r13 = com.google.android.gms.internal.ads.zzex.zza
            android.content.res.Resources r13 = android.content.res.Resources.getSystem()
            android.content.res.Configuration r13 = r13.getConfiguration()
            android.os.LocaleList r13 = r13.getLocales()
            java.lang.String r13 = r13.toLanguageTags()
            java.lang.String r14 = ","
            java.lang.String[] r13 = r13.split(r14, r3)
            r14 = r9
        L_0x00f3:
            int r0 = r13.length
            if (r14 >= r0) goto L_0x0101
            r0 = r13[r14]
            java.lang.String r0 = com.google.android.gms.internal.ads.zzex.zzE(r0)
            r13[r14] = r0
            int r14 = r14 + 1
            goto L_0x00f3
        L_0x0101:
            r14 = r9
        L_0x0102:
            int r0 = r13.length
            if (r14 >= r0) goto L_0x0113
            com.google.android.gms.internal.ads.zzz r0 = r6.zzd
            r4 = r13[r14]
            int r0 = com.google.android.gms.internal.ads.zzyu.zzc(r0, r4, r9)
            if (r0 <= 0) goto L_0x0110
            goto L_0x0115
        L_0x0110:
            int r14 = r14 + 1
            goto L_0x0102
        L_0x0113:
            r0 = r9
            r14 = r1
        L_0x0115:
            r6.zzn = r14
            r6.zzo = r0
            r13 = r9
        L_0x011a:
            com.google.android.gms.internal.ads.zzfyq r14 = r10.zzt
            int r14 = r14.size()
            if (r13 >= r14) goto L_0x0139
            com.google.android.gms.internal.ads.zzz r14 = r6.zzd
            java.lang.String r14 = r14.zzo
            if (r14 == 0) goto L_0x0136
            com.google.android.gms.internal.ads.zzfyq r0 = r10.zzt
            java.lang.Object r0 = r0.get(r13)
            boolean r14 = r14.equals(r0)
            if (r14 == 0) goto L_0x0136
            r1 = r13
            goto L_0x0139
        L_0x0136:
            int r13 = r13 + 1
            goto L_0x011a
        L_0x0139:
            r6.zzt = r1
            r10 = r11 & 384(0x180, float:5.38E-43)
            r13 = 128(0x80, float:1.794E-43)
            if (r10 != r13) goto L_0x0143
            r10 = r8
            goto L_0x0144
        L_0x0143:
            r10 = r9
        L_0x0144:
            r6.zzu = r10
            r10 = r11 & 64
            r13 = 64
            if (r10 != r13) goto L_0x014e
            r10 = r8
            goto L_0x014f
        L_0x014e:
            r10 = r9
        L_0x014f:
            r6.zzv = r10
            com.google.android.gms.internal.ads.zzyi r10 = r6.zzh
            boolean r13 = r10.zzR
            boolean r13 = com.google.android.gms.internal.ads.zzmb.zza(r11, r13)
            if (r13 != 0) goto L_0x015d
        L_0x015b:
            r8 = r9
            goto L_0x0186
        L_0x015d:
            boolean r13 = r6.zzf
            if (r13 != 0) goto L_0x0166
            boolean r14 = r10.zzK
            if (r14 != 0) goto L_0x0166
            goto L_0x015b
        L_0x0166:
            com.google.android.gms.internal.ads.zzbp r14 = r10.zzu
            int r14 = r14.zzb
            boolean r9 = com.google.android.gms.internal.ads.zzmb.zza(r11, r9)
            if (r9 == 0) goto L_0x0186
            if (r13 == 0) goto L_0x0186
            com.google.android.gms.internal.ads.zzz r9 = r6.zzd
            int r9 = r9.zzj
            if (r9 == r3) goto L_0x0186
            boolean r9 = r10.zzC
            boolean r9 = r10.zzB
            boolean r9 = r10.zzT
            if (r9 != 0) goto L_0x0182
            if (r12 != 0) goto L_0x0186
        L_0x0182:
            r7 = r7 & r11
            if (r7 == 0) goto L_0x0186
            r8 = r2
        L_0x0186:
            r6.zze = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzye.<init>(int, com.google.android.gms.internal.ads.zzbm, int, com.google.android.gms.internal.ads.zzyi, int, boolean, com.google.android.gms.internal.ads.zzfvq, int):void");
    }

    public final int zzb() {
        return this.zze;
    }

    public final /* bridge */ /* synthetic */ boolean zzc(zzyp zzyp) {
        String str;
        zzyi zzyi = this.zzh;
        zzye zzye = (zzye) zzyp;
        boolean z = zzyi.zzN;
        zzz zzz = this.zzd;
        int i = zzz.zzG;
        if (i == -1) {
            return false;
        }
        zzz zzz2 = zzye.zzd;
        if (i != zzz2.zzG || (str = zzz.zzo) == null || !TextUtils.equals(str, zzz2.zzo)) {
            return false;
        }
        boolean z2 = zzyi.zzM;
        int i2 = zzz.zzH;
        if (i2 == -1 || i2 != zzz2.zzH) {
            return false;
        }
        boolean z3 = zzyi.zzO;
        return this.zzu == zzye.zzu && this.zzv == zzye.zzv;
    }

    /* renamed from: zza */
    public final int compareTo(zzye zzye) {
        zzgab zzgab;
        boolean z = this.zzf;
        if (!z || !this.zzi) {
            zzgab = zzyu.zzc.zza();
        } else {
            zzgab = zzyu.zzc;
        }
        zzfyf zzc = zzfyf.zzj().zzd(this.zzi, zzye.zzi).zzc(Integer.valueOf(this.zzk), Integer.valueOf(zzye.zzk), zzgab.zzc().zza()).zzb(this.zzj, zzye.zzj).zzb(this.zzl, zzye.zzl).zzd(this.zzp, zzye.zzp).zzd(this.zzm, zzye.zzm).zzc(Integer.valueOf(this.zzn), Integer.valueOf(zzye.zzn), zzgab.zzc().zza()).zzb(this.zzo, zzye.zzo).zzd(z, zzye.zzf).zzc(Integer.valueOf(this.zzt), Integer.valueOf(zzye.zzt), zzgab.zzc().zza());
        boolean z2 = this.zzh.zzB;
        zzfyf zzc2 = zzc.zzd(this.zzu, zzye.zzu).zzd(this.zzv, zzye.zzv).zzd(this.zzw, zzye.zzw).zzc(Integer.valueOf(this.zzq), Integer.valueOf(zzye.zzq), zzgab).zzc(Integer.valueOf(this.zzr), Integer.valueOf(zzye.zzr), zzgab);
        if (Objects.equals(this.zzg, zzye.zzg)) {
            zzc2 = zzc2.zzc(Integer.valueOf(this.zzs), Integer.valueOf(zzye.zzs), zzgab);
        }
        return zzc2.zza();
    }
}
