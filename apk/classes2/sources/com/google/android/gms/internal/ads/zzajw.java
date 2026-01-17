package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzajw implements zzakc {
    private final zzakb zza;
    /* access modifiers changed from: private */
    public final long zzb;
    /* access modifiers changed from: private */
    public final long zzc;
    /* access modifiers changed from: private */
    public final zzakh zzd;
    private int zze;
    /* access modifiers changed from: private */
    public long zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;

    public zzajw(zzakh zzakh, long j, long j2, long j3, long j4, boolean z) {
        zzdd.zzd(j >= 0 && j2 > j);
        this.zzd = zzakh;
        this.zzb = j;
        this.zzc = j2;
        if (j3 == j2 - j || z) {
            this.zzf = j4;
            this.zze = 4;
        } else {
            this.zze = 0;
        }
        this.zza = new zzakb();
    }

    public final /* bridge */ /* synthetic */ zzaeu zze() {
        if (this.zzf != 0) {
            return new zzaju(this, (zzajv) null);
        }
        return null;
    }

    public final void zzg(long j) {
        String str = zzex.zza;
        this.zzh = Math.max(0, Math.min(j, this.zzf - 1));
        this.zze = 2;
        this.zzi = this.zzb;
        this.zzj = this.zzc;
        this.zzk = 0;
        this.zzl = this.zzf;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a7 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long zzd(com.google.android.gms.internal.ads.zzadw r23) throws java.io.IOException {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            int r2 = r0.zze
            r3 = 0
            r4 = 1
            r5 = 4
            r6 = -1
            if (r2 == 0) goto L_0x00dd
            if (r2 == r4) goto L_0x00f0
            r4 = 2
            r10 = 3
            if (r2 == r4) goto L_0x0016
            if (r2 == r10) goto L_0x00ab
            return r6
        L_0x0016:
            long r11 = r0.zzi
            long r13 = r0.zzj
            int r2 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r2 != 0) goto L_0x0021
        L_0x001e:
            r13 = r6
            goto L_0x00a3
        L_0x0021:
            long r11 = r23.zzf()
            com.google.android.gms.internal.ads.zzakb r2 = r0.zza
            boolean r4 = r2.zzc(r1, r13)
            if (r4 != 0) goto L_0x003d
            long r13 = r0.zzi
            int r2 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r2 == 0) goto L_0x0035
            goto L_0x00a3
        L_0x0035:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "No ogg page can be found."
            r1.<init>(r2)
            throw r1
        L_0x003d:
            r2.zzb(r1, r3)
            r23.zzj()
            long r13 = r0.zzh
            long r8 = r2.zzb
            long r13 = r13 - r8
            int r4 = r2.zzd
            int r2 = r2.zze
            int r4 = r4 + r2
            r15 = 0
            int r2 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r2 < 0) goto L_0x005b
            r15 = 72000(0x11940, double:3.55727E-319)
            int r15 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r15 >= 0) goto L_0x005b
            goto L_0x001e
        L_0x005b:
            if (r2 >= 0) goto L_0x0062
            r0.zzj = r11
            r0.zzl = r8
            goto L_0x006c
        L_0x0062:
            long r11 = (long) r4
            long r15 = r23.zzf()
            long r11 = r11 + r15
            r0.zzi = r11
            r0.zzk = r8
        L_0x006c:
            long r8 = r0.zzj
            long r11 = r0.zzi
            long r15 = r8 - r11
            r17 = 100000(0x186a0, double:4.94066E-319)
            int r17 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r17 >= 0) goto L_0x007d
            r0.zzj = r11
            r13 = r11
            goto L_0x00a3
        L_0x007d:
            long r3 = (long) r4
            if (r2 > 0) goto L_0x0083
            r18 = 2
            goto L_0x0085
        L_0x0083:
            r18 = 1
        L_0x0085:
            long r20 = r23.zzf()
            long r3 = r3 * r18
            long r20 = r20 - r3
            long r13 = r13 * r15
            long r2 = r0.zzl
            r15 = r11
            long r10 = r0.zzk
            long r2 = r2 - r10
            long r13 = r13 / r2
            long r2 = r20 + r13
            long r8 = r8 + r6
            java.lang.String r10 = com.google.android.gms.internal.ads.zzex.zza
            long r2 = java.lang.Math.min(r2, r8)
            r8 = r15
            long r13 = java.lang.Math.max(r8, r2)
        L_0x00a3:
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x00a8
            return r13
        L_0x00a8:
            r2 = 3
            r0.zze = r2
        L_0x00ab:
            com.google.android.gms.internal.ads.zzakb r2 = r0.zza
            r2.zzc(r1, r6)
            r3 = 0
            r2.zzb(r1, r3)
            long r3 = r2.zzb
            long r8 = r0.zzh
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 <= 0) goto L_0x00c8
            r23.zzj()
            r0.zze = r5
            long r1 = r0.zzk
            r8 = 2
            long r1 = r1 + r8
            long r1 = -r1
            return r1
        L_0x00c8:
            r8 = 2
            int r3 = r2.zzd
            int r4 = r2.zze
            int r3 = r3 + r4
            r1.zzk(r3)
            long r3 = r23.zzf()
            r0.zzi = r3
            long r2 = r2.zzb
            r0.zzk = r2
            goto L_0x00ab
        L_0x00dd:
            long r2 = r23.zzf()
            r0.zzg = r2
            r0.zze = r4
            long r8 = r0.zzc
            r10 = -65307(0xffffffffffff00e5, double:NaN)
            long r8 = r8 + r10
            int r2 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x00f0
            return r8
        L_0x00f0:
            com.google.android.gms.internal.ads.zzakb r2 = r0.zza
            r2.zza()
            boolean r3 = r2.zzc(r1, r6)
            if (r3 == 0) goto L_0x013a
            r3 = 0
            r2.zzb(r1, r3)
            int r3 = r2.zzd
            int r8 = r2.zze
            int r3 = r3 + r8
            r1.zzk(r3)
            long r8 = r2.zzb
        L_0x0109:
            int r3 = r2.zza
            r3 = r3 & r5
            if (r3 == r5) goto L_0x0133
            boolean r3 = r2.zzc(r1, r6)
            if (r3 == 0) goto L_0x0133
            long r10 = r23.zzf()
            long r12 = r0.zzc
            int r3 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r3 >= 0) goto L_0x0133
            boolean r3 = r2.zzb(r1, r4)
            if (r3 == 0) goto L_0x0133
            int r3 = r2.zzd
            int r10 = r2.zze
            int r3 = r3 + r10
            boolean r3 = com.google.android.gms.internal.ads.zzadz.zzf(r1, r3)
            if (r3 != 0) goto L_0x0130
            goto L_0x0133
        L_0x0130:
            long r8 = r2.zzb
            goto L_0x0109
        L_0x0133:
            r0.zzf = r8
            r0.zze = r5
            long r1 = r0.zzg
            return r1
        L_0x013a:
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzajw.zzd(com.google.android.gms.internal.ads.zzadw):long");
    }
}
