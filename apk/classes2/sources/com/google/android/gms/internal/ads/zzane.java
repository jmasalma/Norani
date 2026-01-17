package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzane implements zzamz {
    private static final float[] zza = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    private final zzaor zzb;
    private final zzen zzc = new zzen();
    private final boolean[] zzd = new boolean[4];
    private final zzanc zze = new zzanc(128);
    private final zzanr zzf = new zzanr(178, 128);
    private zzand zzg;
    private long zzh;
    private String zzi;
    private zzafb zzj;
    private boolean zzk;
    private long zzl = -9223372036854775807L;

    zzane(zzaor zzaor, String str) {
        this.zzb = zzaor;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x012d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(com.google.android.gms.internal.ads.zzen r18) {
        /*
            r17 = this;
            r0 = r17
            com.google.android.gms.internal.ads.zzand r1 = r0.zzg
            com.google.android.gms.internal.ads.zzdd.zzb(r1)
            com.google.android.gms.internal.ads.zzafb r1 = r0.zzj
            com.google.android.gms.internal.ads.zzdd.zzb(r1)
            int r1 = r18.zzc()
            int r2 = r18.zzd()
            byte[] r3 = r18.zzN()
            long r4 = r0.zzh
            int r6 = r18.zza()
            long r6 = (long) r6
            long r4 = r4 + r6
            r0.zzh = r4
            com.google.android.gms.internal.ads.zzafb r4 = r0.zzj
            int r5 = r18.zza()
            r6 = r18
            r4.zzr(r6, r5)
        L_0x002d:
            boolean[] r4 = r0.zzd
            int r4 = com.google.android.gms.internal.ads.zzfv.zza(r3, r1, r2, r4)
            if (r4 != r2) goto L_0x0049
            boolean r4 = r0.zzk
            if (r4 != 0) goto L_0x003e
            com.google.android.gms.internal.ads.zzanc r4 = r0.zze
            r4.zza(r3, r1, r2)
        L_0x003e:
            com.google.android.gms.internal.ads.zzand r4 = r0.zzg
            r4.zza(r3, r1, r2)
            com.google.android.gms.internal.ads.zzanr r4 = r0.zzf
            r4.zza(r3, r1, r2)
            return
        L_0x0049:
            byte[] r5 = r18.zzN()
            int r7 = r4 + 3
            byte r5 = r5[r7]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r8 = r4 - r1
            boolean r9 = r0.zzk
            if (r9 != 0) goto L_0x0184
            if (r8 <= 0) goto L_0x0060
            com.google.android.gms.internal.ads.zzanc r9 = r0.zze
            r9.zza(r3, r1, r4)
        L_0x0060:
            if (r8 >= 0) goto L_0x0064
            int r9 = -r8
            goto L_0x0065
        L_0x0064:
            r9 = 0
        L_0x0065:
            com.google.android.gms.internal.ads.zzanc r12 = r0.zze
            boolean r9 = r12.zzc(r5, r9)
            if (r9 == 0) goto L_0x0184
            com.google.android.gms.internal.ads.zzafb r9 = r0.zzj
            int r13 = r12.zzb
            java.lang.String r14 = r0.zzi
            r14.getClass()
            r15 = r14
            java.lang.String r15 = (java.lang.String) r15
            byte[] r15 = r12.zzc
            int r12 = r12.zza
            byte[] r12 = java.util.Arrays.copyOf(r15, r12)
            com.google.android.gms.internal.ads.zzem r15 = new com.google.android.gms.internal.ads.zzem
            int r10 = r12.length
            r15.<init>(r12, r10)
            r15.zzo(r13)
            r10 = 4
            r15.zzo(r10)
            r15.zzm()
            r13 = 8
            r15.zzn(r13)
            boolean r16 = r15.zzp()
            r11 = 3
            if (r16 == 0) goto L_0x00a3
            r15.zzn(r10)
            r15.zzn(r11)
        L_0x00a3:
            int r10 = r15.zzd(r10)
            r16 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r11 = "Invalid aspect ratio"
            java.lang.String r13 = "H263Reader"
            r6 = 15
            if (r10 != r6) goto L_0x00c6
            r6 = 8
            int r10 = r15.zzd(r6)
            int r6 = r15.zzd(r6)
            if (r6 != 0) goto L_0x00c1
            com.google.android.gms.internal.ads.zzea.zzf(r13, r11)
            goto L_0x00d1
        L_0x00c1:
            float r10 = (float) r10
            float r6 = (float) r6
            float r16 = r10 / r6
            goto L_0x00d1
        L_0x00c6:
            r6 = 7
            if (r10 >= r6) goto L_0x00ce
            float[] r6 = zza
            r16 = r6[r10]
            goto L_0x00d1
        L_0x00ce:
            com.google.android.gms.internal.ads.zzea.zzf(r13, r11)
        L_0x00d1:
            r6 = r16
            boolean r10 = r15.zzp()
            r11 = 2
            if (r10 == 0) goto L_0x010f
            r15.zzn(r11)
            r10 = 1
            r15.zzn(r10)
            boolean r10 = r15.zzp()
            if (r10 == 0) goto L_0x010f
            r10 = 15
            r15.zzn(r10)
            r15.zzm()
            r15.zzn(r10)
            r15.zzm()
            r15.zzn(r10)
            r15.zzm()
            r11 = 3
            r15.zzn(r11)
            r11 = 11
            r15.zzn(r11)
            r15.zzm()
            r15.zzn(r10)
            r15.zzm()
            r10 = 2
            goto L_0x0110
        L_0x010f:
            r10 = r11
        L_0x0110:
            int r10 = r15.zzd(r10)
            if (r10 == 0) goto L_0x011b
            java.lang.String r10 = "Unhandled video object layer shape"
            com.google.android.gms.internal.ads.zzea.zzf(r13, r10)
        L_0x011b:
            r15.zzm()
            r10 = 16
            int r10 = r15.zzd(r10)
            r15.zzm()
            boolean r11 = r15.zzp()
            if (r11 == 0) goto L_0x0142
            if (r10 != 0) goto L_0x0135
            java.lang.String r10 = "Invalid vop_increment_time_resolution"
            com.google.android.gms.internal.ads.zzea.zzf(r13, r10)
            goto L_0x0142
        L_0x0135:
            int r10 = r10 + -1
            r11 = 0
        L_0x0138:
            if (r10 <= 0) goto L_0x013f
            int r10 = r10 >> 1
            int r11 = r11 + 1
            goto L_0x0138
        L_0x013f:
            r15.zzn(r11)
        L_0x0142:
            r15.zzm()
            r10 = 13
            int r11 = r15.zzd(r10)
            r15.zzm()
            int r10 = r15.zzd(r10)
            r15.zzm()
            r15.zzm()
            com.google.android.gms.internal.ads.zzx r13 = new com.google.android.gms.internal.ads.zzx
            r13.<init>()
            r13.zzS(r14)
            java.lang.String r14 = "video/mp2t"
            r13.zzG(r14)
            java.lang.String r14 = "video/mp4v-es"
            r13.zzah(r14)
            r13.zzam(r11)
            r13.zzQ(r10)
            r13.zzad(r6)
            java.util.List r6 = java.util.Collections.singletonList(r12)
            r13.zzT(r6)
            com.google.android.gms.internal.ads.zzz r6 = r13.zzan()
            r9.zzm(r6)
            r6 = 1
            r0.zzk = r6
        L_0x0184:
            com.google.android.gms.internal.ads.zzand r6 = r0.zzg
            r6.zza(r3, r1, r4)
            com.google.android.gms.internal.ads.zzanr r6 = r0.zzf
            if (r8 <= 0) goto L_0x0192
            r6.zza(r3, r1, r4)
            r10 = 0
            goto L_0x0193
        L_0x0192:
            int r10 = -r8
        L_0x0193:
            boolean r1 = r6.zzd(r10)
            if (r1 == 0) goto L_0x01b7
            byte[] r1 = r6.zza
            int r8 = r6.zzb
            int r1 = com.google.android.gms.internal.ads.zzfv.zzc(r1, r8)
            com.google.android.gms.internal.ads.zzen r8 = r0.zzc
            java.lang.String r9 = com.google.android.gms.internal.ads.zzex.zza
            r9 = r8
            com.google.android.gms.internal.ads.zzen r9 = (com.google.android.gms.internal.ads.zzen) r9
            byte[] r9 = r6.zza
            r8.zzJ(r9, r1)
            com.google.android.gms.internal.ads.zzaor r1 = r0.zzb
            r9 = r1
            com.google.android.gms.internal.ads.zzaor r9 = (com.google.android.gms.internal.ads.zzaor) r9
            long r9 = r0.zzl
            r1.zzb(r9, r8)
        L_0x01b7:
            r1 = 178(0xb2, float:2.5E-43)
            if (r5 != r1) goto L_0x01ca
            byte[] r5 = r18.zzN()
            int r8 = r4 + 2
            byte r5 = r5[r8]
            r8 = 1
            if (r5 != r8) goto L_0x01c9
            r6.zzc(r1)
        L_0x01c9:
            r5 = r1
        L_0x01ca:
            int r1 = r2 - r4
            long r8 = r0.zzh
            long r10 = (long) r1
            long r8 = r8 - r10
            com.google.android.gms.internal.ads.zzand r4 = r0.zzg
            boolean r6 = r0.zzk
            r4.zzb(r8, r1, r6)
            com.google.android.gms.internal.ads.zzand r1 = r0.zzg
            long r8 = r0.zzl
            r1.zzc(r5, r8)
            r6 = r18
            r1 = r7
            goto L_0x002d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzane.zza(com.google.android.gms.internal.ads.zzen):void");
    }

    public final void zzb(zzady zzady, zzaon zzaon) {
        zzaon.zzc();
        this.zzi = zzaon.zzb();
        this.zzj = zzady.zzw(zzaon.zza(), 2);
        this.zzg = new zzand(this.zzj);
        this.zzb.zzc(zzady, zzaon);
    }

    public final void zzc(boolean z) {
        zzdd.zzb(this.zzg);
        if (z) {
            this.zzg.zzb(this.zzh, 0, this.zzk);
            this.zzg.zzd();
        }
    }

    public final void zzd(long j, int i) {
        this.zzl = j;
    }

    public final void zze() {
        zzfv.zzi(this.zzd);
        this.zze.zzb();
        zzand zzand = this.zzg;
        if (zzand != null) {
            zzand.zzd();
        }
        this.zzf.zzb();
        this.zzh = 0;
        this.zzl = -9223372036854775807L;
    }
}
