package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzanb implements zzamz {
    private static final double[] zza = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    private String zzb;
    private zzafb zzc;
    private final zzaor zzd;
    private final String zze;
    private final zzen zzf;
    private final zzanr zzg;
    private final boolean[] zzh = new boolean[4];
    private final zzana zzi = new zzana(128);
    private long zzj;
    private boolean zzk;
    private boolean zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private boolean zzq;
    private boolean zzr;

    zzanb(zzaor zzaor, String str) {
        zzen zzen;
        this.zzd = zzaor;
        this.zze = str;
        if (zzaor != null) {
            this.zzg = new zzanr(178, 128);
            zzen = new zzen();
        } else {
            zzen = null;
            this.zzg = null;
        }
        this.zzf = zzen;
        this.zzn = -9223372036854775807L;
        this.zzp = -9223372036854775807L;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0180  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(com.google.android.gms.internal.ads.zzen r21) {
        /*
            r20 = this;
            r0 = r20
            com.google.android.gms.internal.ads.zzafb r1 = r0.zzc
            com.google.android.gms.internal.ads.zzdd.zzb(r1)
            int r1 = r21.zzc()
            int r2 = r21.zzd()
            byte[] r3 = r21.zzN()
            long r4 = r0.zzj
            int r6 = r21.zza()
            long r6 = (long) r6
            long r4 = r4 + r6
            r0.zzj = r4
            com.google.android.gms.internal.ads.zzafb r4 = r0.zzc
            int r5 = r21.zza()
            r6 = r21
            r4.zzr(r6, r5)
        L_0x0028:
            boolean[] r4 = r0.zzh
            int r4 = com.google.android.gms.internal.ads.zzfv.zza(r3, r1, r2, r4)
            if (r4 != r2) goto L_0x0041
            boolean r4 = r0.zzl
            if (r4 != 0) goto L_0x0039
            com.google.android.gms.internal.ads.zzana r4 = r0.zzi
            r4.zza(r3, r1, r2)
        L_0x0039:
            com.google.android.gms.internal.ads.zzanr r4 = r0.zzg
            if (r4 == 0) goto L_0x0040
            r4.zza(r3, r1, r2)
        L_0x0040:
            return
        L_0x0041:
            byte[] r5 = r21.zzN()
            int r7 = r4 + 3
            byte r5 = r5[r7]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r8 = r4 - r1
            boolean r9 = r0.zzl
            if (r9 != 0) goto L_0x012a
            if (r8 <= 0) goto L_0x0058
            com.google.android.gms.internal.ads.zzana r9 = r0.zzi
            r9.zza(r3, r1, r4)
        L_0x0058:
            if (r8 >= 0) goto L_0x005c
            int r9 = -r8
            goto L_0x005d
        L_0x005c:
            r9 = 0
        L_0x005d:
            com.google.android.gms.internal.ads.zzana r12 = r0.zzi
            boolean r9 = r12.zzc(r5, r9)
            if (r9 == 0) goto L_0x012a
            java.lang.String r9 = r0.zzb
            r9.getClass()
            java.lang.String r13 = r0.zze
            r14 = r9
            java.lang.String r14 = (java.lang.String) r14
            byte[] r14 = r12.zzc
            int r15 = r12.zza
            byte[] r14 = java.util.Arrays.copyOf(r14, r15)
            r15 = 4
            byte r10 = r14[r15]
            r10 = r10 & 255(0xff, float:3.57E-43)
            r16 = 5
            byte r11 = r14[r16]
            r15 = r11 & 255(0xff, float:3.57E-43)
            r17 = 6
            byte r6 = r14[r17]
            r6 = r6 & 255(0xff, float:3.57E-43)
            r17 = 7
            r18 = r7
            byte r7 = r14[r17]
            r7 = r7 & 240(0xf0, float:3.36E-43)
            r11 = r11 & 15
            r19 = r2
            r2 = 4
            int r10 = r10 << r2
            int r15 = r15 >> r2
            r10 = r10 | r15
            int r7 = r7 >> r2
            r15 = 8
            int r11 = r11 << r15
            r6 = r6 | r11
            r11 = 2
            if (r7 == r11) goto L_0x00b2
            r11 = 3
            if (r7 == r11) goto L_0x00ad
            if (r7 == r2) goto L_0x00a8
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L_0x00b9
        L_0x00a8:
            int r2 = r6 * 121
            int r7 = r10 * 100
            goto L_0x00b6
        L_0x00ad:
            int r2 = r6 * 16
            int r7 = r10 * 9
            goto L_0x00b6
        L_0x00b2:
            int r2 = r6 * 4
            int r7 = r10 * 3
        L_0x00b6:
            float r2 = (float) r2
            float r7 = (float) r7
            float r2 = r2 / r7
        L_0x00b9:
            com.google.android.gms.internal.ads.zzx r7 = new com.google.android.gms.internal.ads.zzx
            r7.<init>()
            r7.zzS(r9)
            r7.zzG(r13)
            java.lang.String r9 = "video/mpeg2"
            r7.zzah(r9)
            r7.zzam(r10)
            r7.zzQ(r6)
            r7.zzad(r2)
            java.util.List r2 = java.util.Collections.singletonList(r14)
            r7.zzT(r2)
            com.google.android.gms.internal.ads.zzz r2 = r7.zzan()
            byte r6 = r14[r17]
            r6 = r6 & 15
            int r6 = r6 + -1
            r9 = 0
            if (r6 < 0) goto L_0x010b
            if (r6 >= r15) goto L_0x010b
            double[] r7 = zza
            r6 = r7[r6]
            int r9 = r12.zzb
            int r9 = r9 + 9
            byte r9 = r14[r9]
            r10 = r9 & 96
            int r10 = r10 >> 5
            r9 = r9 & 31
            if (r10 == r9) goto L_0x0104
            double r10 = (double) r10
            int r9 = r9 + 1
            r12 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r10 = r10 + r12
            double r12 = (double) r9
            double r10 = r10 / r12
            double r6 = r6 * r10
        L_0x0104:
            r9 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r9 = r9 / r6
            long r9 = (long) r9
        L_0x010b:
            java.lang.Long r6 = java.lang.Long.valueOf(r9)
            android.util.Pair r2 = android.util.Pair.create(r2, r6)
            com.google.android.gms.internal.ads.zzafb r6 = r0.zzc
            java.lang.Object r7 = r2.first
            com.google.android.gms.internal.ads.zzz r7 = (com.google.android.gms.internal.ads.zzz) r7
            r6.zzm(r7)
            java.lang.Object r2 = r2.second
            java.lang.Long r2 = (java.lang.Long) r2
            long r6 = r2.longValue()
            r0.zzm = r6
            r2 = 1
            r0.zzl = r2
            goto L_0x012e
        L_0x012a:
            r19 = r2
            r18 = r7
        L_0x012e:
            com.google.android.gms.internal.ads.zzanr r2 = r0.zzg
            if (r2 == 0) goto L_0x0171
            if (r8 <= 0) goto L_0x0139
            r2.zza(r3, r1, r4)
            r1 = 0
            goto L_0x013a
        L_0x0139:
            int r1 = -r8
        L_0x013a:
            boolean r1 = r2.zzd(r1)
            if (r1 == 0) goto L_0x015e
            byte[] r1 = r2.zza
            int r6 = r2.zzb
            int r1 = com.google.android.gms.internal.ads.zzfv.zzc(r1, r6)
            com.google.android.gms.internal.ads.zzen r6 = r0.zzf
            java.lang.String r7 = com.google.android.gms.internal.ads.zzex.zza
            r7 = r6
            com.google.android.gms.internal.ads.zzen r7 = (com.google.android.gms.internal.ads.zzen) r7
            byte[] r7 = r2.zza
            r6.zzJ(r7, r1)
            com.google.android.gms.internal.ads.zzaor r1 = r0.zzd
            r7 = r1
            com.google.android.gms.internal.ads.zzaor r7 = (com.google.android.gms.internal.ads.zzaor) r7
            long r7 = r0.zzp
            r1.zzb(r7, r6)
        L_0x015e:
            r1 = 178(0xb2, float:2.5E-43)
            if (r5 != r1) goto L_0x0171
            byte[] r5 = r21.zzN()
            int r6 = r4 + 2
            byte r5 = r5[r6]
            r6 = 1
            if (r5 != r6) goto L_0x0170
            r2.zzc(r1)
        L_0x0170:
            r5 = r1
        L_0x0171:
            if (r5 == 0) goto L_0x0180
            r1 = 179(0xb3, float:2.51E-43)
            if (r5 != r1) goto L_0x0178
            goto L_0x0180
        L_0x0178:
            r1 = 184(0xb8, float:2.58E-43)
            if (r5 != r1) goto L_0x01e0
            r1 = 1
            r0.zzq = r1
            goto L_0x01e0
        L_0x0180:
            int r2 = r19 - r4
            boolean r1 = r0.zzr
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 == 0) goto L_0x01a6
            boolean r1 = r0.zzl
            if (r1 == 0) goto L_0x01a6
            long r7 = r0.zzp
            int r1 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r1 == 0) goto L_0x01a6
            boolean r9 = r0.zzq
            long r10 = r0.zzj
            long r13 = r0.zzo
            long r10 = r10 - r13
            int r1 = (int) r10
            int r10 = r1 - r2
            com.google.android.gms.internal.ads.zzafb r6 = r0.zzc
            r12 = 0
            r11 = r2
            r6.zzt(r7, r9, r10, r11, r12)
        L_0x01a6:
            boolean r1 = r0.zzk
            if (r1 == 0) goto L_0x01b2
            boolean r1 = r0.zzr
            if (r1 == 0) goto L_0x01af
            goto L_0x01b2
        L_0x01af:
            r1 = 0
            r2 = 1
            goto L_0x01d9
        L_0x01b2:
            long r6 = r0.zzj
            long r1 = (long) r2
            long r6 = r6 - r1
            r0.zzo = r6
            long r1 = r0.zzn
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x01c4
            goto L_0x01cf
        L_0x01c4:
            long r1 = r0.zzp
            int r4 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x01ce
            long r8 = r0.zzm
            long r1 = r1 + r8
            goto L_0x01cf
        L_0x01ce:
            r1 = r6
        L_0x01cf:
            r0.zzp = r1
            r1 = 0
            r0.zzq = r1
            r0.zzn = r6
            r2 = 1
            r0.zzk = r2
        L_0x01d9:
            if (r5 != 0) goto L_0x01dd
            r10 = r2
            goto L_0x01de
        L_0x01dd:
            r10 = r1
        L_0x01de:
            r0.zzr = r10
        L_0x01e0:
            r6 = r21
            r1 = r18
            r2 = r19
            goto L_0x0028
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzanb.zza(com.google.android.gms.internal.ads.zzen):void");
    }

    public final void zzb(zzady zzady, zzaon zzaon) {
        zzaon.zzc();
        this.zzb = zzaon.zzb();
        this.zzc = zzady.zzw(zzaon.zza(), 2);
        zzaor zzaor = this.zzd;
        if (zzaor != null) {
            zzaor.zzc(zzady, zzaon);
        }
    }

    public final void zzc(boolean z) {
        zzdd.zzb(this.zzc);
        if (z) {
            boolean z2 = this.zzq;
            long j = this.zzj - this.zzo;
            this.zzc.zzt(this.zzp, z2 ? 1 : 0, (int) j, 0, (zzafa) null);
        }
    }

    public final void zzd(long j, int i) {
        this.zzn = j;
    }

    public final void zze() {
        zzfv.zzi(this.zzh);
        this.zzi.zzb();
        zzanr zzanr = this.zzg;
        if (zzanr != null) {
            zzanr.zzb();
        }
        this.zzj = 0;
        this.zzk = false;
        this.zzn = -9223372036854775807L;
        this.zzp = -9223372036854775807L;
    }
}
