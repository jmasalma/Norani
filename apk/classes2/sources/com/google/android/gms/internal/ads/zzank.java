package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzank implements zzamz {
    private final String zza;
    private final int zzb;
    private final String zzc = "video/mp2t";
    private final zzen zzd;
    private final zzem zze;
    private zzafb zzf;
    private String zzg;
    private zzz zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private long zzm;
    private boolean zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private boolean zzr;
    private long zzs;
    private int zzt;
    private long zzu;
    private int zzv;
    private String zzw;

    public zzank(String str, int i, String str2) {
        this.zza = str;
        this.zzb = i;
        zzen zzen = new zzen(1024);
        this.zzd = zzen;
        byte[] zzN = zzen.zzN();
        this.zze = new zzem(zzN, zzN.length);
        this.zzm = -9223372036854775807L;
    }

    private final int zzf(zzem zzem) throws zzaz {
        int zza2 = zzem.zza();
        zzacp zzb2 = zzacr.zzb(zzem, true);
        this.zzw = zzb2.zzc;
        this.zzt = zzb2.zza;
        this.zzv = zzb2.zzb;
        return zza2 - zzem.zza();
    }

    private static long zzg(zzem zzem) {
        return (long) zzem.zzd((zzem.zzd(2) + 1) * 8);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x015a, code lost:
        if (r14.zzn == false) goto L_0x01c4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(com.google.android.gms.internal.ads.zzen r15) throws com.google.android.gms.internal.ads.zzaz {
        /*
            r14 = this;
            com.google.android.gms.internal.ads.zzafb r0 = r14.zzf
            com.google.android.gms.internal.ads.zzdd.zzb(r0)
        L_0x0005:
            int r0 = r15.zza()
            if (r0 <= 0) goto L_0x0221
            int r0 = r14.zzi
            r1 = 86
            r2 = 1
            if (r0 == 0) goto L_0x0217
            r3 = 2
            r4 = 0
            if (r0 == r2) goto L_0x0201
            r1 = 3
            r5 = 8
            if (r0 == r3) goto L_0x01d9
            int r0 = r15.zza()
            int r3 = r14.zzk
            int r6 = r14.zzj
            int r3 = r3 - r6
            int r0 = java.lang.Math.min(r0, r3)
            com.google.android.gms.internal.ads.zzem r3 = r14.zze
            byte[] r6 = r3.zza
            int r7 = r14.zzj
            r15.zzH(r6, r7, r0)
            int r6 = r14.zzj
            int r6 = r6 + r0
            r14.zzj = r6
            int r0 = r14.zzk
            if (r6 != r0) goto L_0x0005
            r3.zzl(r4)
            boolean r0 = r3.zzp()
            r6 = 0
            if (r0 != 0) goto L_0x0158
            r14.zzn = r2
            int r0 = r3.zzd(r2)
            if (r0 != r2) goto L_0x0052
            int r0 = r3.zzd(r2)
            r7 = r2
            goto L_0x0054
        L_0x0052:
            r7 = r0
            r0 = r4
        L_0x0054:
            r14.zzo = r0
            if (r0 != 0) goto L_0x0153
            if (r7 != r2) goto L_0x005e
            zzg(r3)
            r7 = r2
        L_0x005e:
            boolean r0 = r3.zzp()
            if (r0 == 0) goto L_0x014e
            r0 = 6
            int r8 = r3.zzd(r0)
            r14.zzp = r8
            r8 = 4
            int r9 = r3.zzd(r8)
            int r10 = r3.zzd(r1)
            if (r9 != 0) goto L_0x0149
            if (r10 != 0) goto L_0x0149
            if (r7 != 0) goto L_0x00de
            int r9 = r3.zzc()
            int r10 = r14.zzf(r3)
            r3.zzl(r9)
            int r9 = r10 + 7
            int r9 = r9 / r5
            byte[] r9 = new byte[r9]
            r3.zzh(r9, r4, r10)
            com.google.android.gms.internal.ads.zzx r10 = new com.google.android.gms.internal.ads.zzx
            r10.<init>()
            java.lang.String r11 = r14.zzg
            r10.zzS(r11)
            java.lang.String r11 = r14.zzc
            r10.zzG(r11)
            java.lang.String r11 = "audio/mp4a-latm"
            r10.zzah(r11)
            java.lang.String r11 = r14.zzw
            r10.zzE(r11)
            int r11 = r14.zzv
            r10.zzD(r11)
            int r11 = r14.zzt
            r10.zzai(r11)
            java.util.List r9 = java.util.Collections.singletonList(r9)
            r10.zzT(r9)
            java.lang.String r9 = r14.zza
            r10.zzW(r9)
            int r9 = r14.zzb
            r10.zzaf(r9)
            com.google.android.gms.internal.ads.zzz r9 = r10.zzan()
            com.google.android.gms.internal.ads.zzz r10 = r14.zzh
            boolean r10 = r9.equals(r10)
            if (r10 != 0) goto L_0x00eb
            r14.zzh = r9
            int r10 = r9.zzH
            long r10 = (long) r10
            r12 = 1024000000(0x3d090000, double:5.059232213E-315)
            long r12 = r12 / r10
            r14.zzu = r12
            com.google.android.gms.internal.ads.zzafb r10 = r14.zzf
            r10.zzm(r9)
            goto L_0x00eb
        L_0x00de:
            long r9 = zzg(r3)
            int r9 = (int) r9
            int r10 = r14.zzf(r3)
            int r9 = r9 - r10
            r3.zzn(r9)
        L_0x00eb:
            int r9 = r3.zzd(r1)
            r14.zzq = r9
            if (r9 == 0) goto L_0x0116
            if (r9 == r2) goto L_0x0110
            if (r9 == r1) goto L_0x010c
            if (r9 == r8) goto L_0x010c
            r1 = 5
            if (r9 == r1) goto L_0x010c
            if (r9 == r0) goto L_0x0108
            r0 = 7
            if (r9 != r0) goto L_0x0102
            goto L_0x0108
        L_0x0102:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            r15.<init>()
            throw r15
        L_0x0108:
            r3.zzn(r2)
            goto L_0x0119
        L_0x010c:
            r3.zzn(r0)
            goto L_0x0119
        L_0x0110:
            r0 = 9
            r3.zzn(r0)
            goto L_0x0119
        L_0x0116:
            r3.zzn(r5)
        L_0x0119:
            boolean r0 = r3.zzp()
            r14.zzr = r0
            r8 = 0
            r14.zzs = r8
            if (r0 == 0) goto L_0x013f
            if (r7 == r2) goto L_0x0139
        L_0x0127:
            boolean r0 = r3.zzp()
            long r7 = r14.zzs
            long r7 = r7 << r5
            int r1 = r3.zzd(r5)
            long r9 = (long) r1
            long r7 = r7 + r9
            r14.zzs = r7
            if (r0 != 0) goto L_0x0127
            goto L_0x013f
        L_0x0139:
            long r0 = zzg(r3)
            r14.zzs = r0
        L_0x013f:
            boolean r0 = r3.zzp()
            if (r0 == 0) goto L_0x015d
            r3.zzn(r5)
            goto L_0x015d
        L_0x0149:
            com.google.android.gms.internal.ads.zzaz r15 = com.google.android.gms.internal.ads.zzaz.zza(r6, r6)
            throw r15
        L_0x014e:
            com.google.android.gms.internal.ads.zzaz r15 = com.google.android.gms.internal.ads.zzaz.zza(r6, r6)
            throw r15
        L_0x0153:
            com.google.android.gms.internal.ads.zzaz r15 = com.google.android.gms.internal.ads.zzaz.zza(r6, r6)
            throw r15
        L_0x0158:
            boolean r0 = r14.zzn
            if (r0 != 0) goto L_0x015d
            goto L_0x01c4
        L_0x015d:
            int r0 = r14.zzo
            if (r0 != 0) goto L_0x01d4
            int r0 = r14.zzp
            if (r0 != 0) goto L_0x01cf
            int r0 = r14.zzq
            if (r0 != 0) goto L_0x01ca
            r0 = r4
        L_0x016a:
            int r1 = r3.zzd(r5)
            int r10 = r0 + r1
            r0 = 255(0xff, float:3.57E-43)
            if (r1 == r0) goto L_0x01c8
            int r0 = r3.zzc()
            r1 = r0 & 7
            if (r1 != 0) goto L_0x0184
            com.google.android.gms.internal.ads.zzen r1 = r14.zzd
            int r0 = r0 >> 3
            r1.zzL(r0)
            goto L_0x0192
        L_0x0184:
            com.google.android.gms.internal.ads.zzen r0 = r14.zzd
            int r1 = r10 * 8
            byte[] r5 = r0.zzN()
            r3.zzh(r5, r4, r1)
            r0.zzL(r4)
        L_0x0192:
            com.google.android.gms.internal.ads.zzafb r0 = r14.zzf
            com.google.android.gms.internal.ads.zzen r1 = r14.zzd
            r0.zzr(r1, r10)
            long r0 = r14.zzm
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x01a5
            goto L_0x01a6
        L_0x01a5:
            r2 = r4
        L_0x01a6:
            com.google.android.gms.internal.ads.zzdd.zzf(r2)
            com.google.android.gms.internal.ads.zzafb r6 = r14.zzf
            long r7 = r14.zzm
            r11 = 0
            r12 = 0
            r9 = 1
            r6.zzt(r7, r9, r10, r11, r12)
            long r0 = r14.zzm
            long r5 = r14.zzu
            long r0 = r0 + r5
            r14.zzm = r0
            boolean r0 = r14.zzr
            if (r0 == 0) goto L_0x01c4
            long r0 = r14.zzs
            int r0 = (int) r0
            r3.zzn(r0)
        L_0x01c4:
            r14.zzi = r4
            goto L_0x0005
        L_0x01c8:
            r0 = r10
            goto L_0x016a
        L_0x01ca:
            com.google.android.gms.internal.ads.zzaz r15 = com.google.android.gms.internal.ads.zzaz.zza(r6, r6)
            throw r15
        L_0x01cf:
            com.google.android.gms.internal.ads.zzaz r15 = com.google.android.gms.internal.ads.zzaz.zza(r6, r6)
            throw r15
        L_0x01d4:
            com.google.android.gms.internal.ads.zzaz r15 = com.google.android.gms.internal.ads.zzaz.zza(r6, r6)
            throw r15
        L_0x01d9:
            int r0 = r14.zzl
            r0 = r0 & -225(0xffffffffffffff1f, float:NaN)
            int r0 = r0 << r5
            int r2 = r15.zzm()
            r0 = r0 | r2
            r14.zzk = r0
            com.google.android.gms.internal.ads.zzen r2 = r14.zzd
            byte[] r3 = r2.zzN()
            int r3 = r3.length
            if (r0 <= r3) goto L_0x01fb
            r2.zzI(r0)
            com.google.android.gms.internal.ads.zzem r0 = r14.zze
            byte[] r2 = r2.zzN()
            int r3 = r2.length
            r0.zzk(r2, r3)
        L_0x01fb:
            r14.zzj = r4
            r14.zzi = r1
            goto L_0x0005
        L_0x0201:
            int r0 = r15.zzm()
            r2 = r0 & 224(0xe0, float:3.14E-43)
            r5 = 224(0xe0, float:3.14E-43)
            if (r2 != r5) goto L_0x0211
            r14.zzl = r0
            r14.zzi = r3
            goto L_0x0005
        L_0x0211:
            if (r0 == r1) goto L_0x0005
            r14.zzi = r4
            goto L_0x0005
        L_0x0217:
            int r0 = r15.zzm()
            if (r0 != r1) goto L_0x0005
            r14.zzi = r2
            goto L_0x0005
        L_0x0221:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzank.zza(com.google.android.gms.internal.ads.zzen):void");
    }

    public final void zzb(zzady zzady, zzaon zzaon) {
        zzaon.zzc();
        this.zzf = zzady.zzw(zzaon.zza(), 1);
        this.zzg = zzaon.zzb();
    }

    public final void zzc(boolean z) {
    }

    public final void zzd(long j, int i) {
        this.zzm = j;
    }

    public final void zze() {
        this.zzi = 0;
        this.zzm = -9223372036854775807L;
        this.zzn = false;
    }
}
