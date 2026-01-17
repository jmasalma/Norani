package com.google.android.gms.internal.ads;

import java.util.Collections;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzani implements zzamz {
    private final zzaod zza;
    private String zzb;
    private zzafb zzc;
    private zzanh zzd;
    private boolean zze;
    private final boolean[] zzf = new boolean[3];
    private final zzanr zzg = new zzanr(32, 128);
    private final zzanr zzh = new zzanr(33, 128);
    private final zzanr zzi = new zzanr(34, 128);
    private final zzanr zzj = new zzanr(39, 128);
    private final zzanr zzk = new zzanr(40, 128);
    private long zzl;
    private long zzm = -9223372036854775807L;
    private final zzen zzn = new zzen();

    public zzani(zzaod zzaod, String str) {
        this.zza = zzaod;
    }

    @RequiresNonNull({"output", "sampleReader"})
    private final void zzf(long j, int i, int i2, long j2) {
        int i3 = i2;
        long j3 = j2;
        this.zzd.zza(j, i, this.zze);
        if (!this.zze) {
            zzanr zzanr = this.zzg;
            zzanr.zzd(i3);
            zzanr zzanr2 = this.zzh;
            zzanr2.zzd(i3);
            zzanr zzanr3 = this.zzi;
            zzanr3.zzd(i3);
            if (zzanr.zze() && zzanr2.zze() && zzanr3.zze()) {
                String str = this.zzb;
                int i4 = zzanr.zzb;
                byte[] bArr = new byte[(zzanr2.zzb + i4 + zzanr3.zzb)];
                boolean z = false;
                System.arraycopy(zzanr.zza, 0, bArr, 0, i4);
                System.arraycopy(zzanr2.zza, 0, bArr, zzanr.zzb, zzanr2.zzb);
                System.arraycopy(zzanr3.zza, 0, bArr, zzanr.zzb + zzanr2.zzb, zzanr3.zzb);
                String str2 = null;
                zzfp zzd2 = zzfv.zzd(zzanr2.zza, 3, zzanr2.zzb, (zzfs) null);
                zzfk zzfk = zzd2.zzb;
                if (zzfk != null) {
                    int i5 = zzfk.zzf;
                    int[] iArr = zzfk.zze;
                    int i6 = zzfk.zzd;
                    str2 = zzdk.zzd(zzfk.zza, zzfk.zzb, zzfk.zzc, i6, iArr, i5);
                }
                zzx zzx = new zzx();
                zzx.zzS(str);
                zzx.zzG("video/mp2t");
                zzx.zzah("video/hevc");
                zzx.zzE(str2);
                zzx.zzam(zzd2.zze);
                zzx.zzQ(zzd2.zzf);
                zzx.zzK(zzd2.zzg);
                zzx.zzJ(zzd2.zzh);
                zzi zzi2 = new zzi();
                zzi2.zzc(zzd2.zzk);
                zzi2.zzb(zzd2.zzl);
                zzi2.zzd(zzd2.zzm);
                zzi2.zzf(zzd2.zzc + 8);
                zzi2.zza(zzd2.zzd + 8);
                zzx.zzF(zzi2.zzg());
                zzx.zzad(zzd2.zzi);
                zzx.zzY(zzd2.zzj);
                zzx.zzZ(zzd2.zza + 1);
                zzx.zzT(Collections.singletonList(bArr));
                zzz zzan = zzx.zzan();
                this.zzc.zzm(zzan);
                int i7 = zzan.zzq;
                if (i7 != -1) {
                    z = true;
                }
                zzfvp.zzl(z);
                this.zza.zzf(i7);
                this.zze = true;
            }
        }
        zzanr zzanr4 = this.zzj;
        if (zzanr4.zzd(i3)) {
            int zzc2 = zzfv.zzc(zzanr4.zza, zzanr4.zzb);
            zzen zzen = this.zzn;
            zzen.zzJ(zzanr4.zza, zzc2);
            zzen.zzM(5);
            this.zza.zzc(j3, zzen);
        }
        zzanr zzanr5 = this.zzk;
        if (zzanr5.zzd(i3)) {
            int zzc3 = zzfv.zzc(zzanr5.zza, zzanr5.zzb);
            zzen zzen2 = this.zzn;
            zzen2.zzJ(zzanr5.zza, zzc3);
            zzen2.zzM(5);
            this.zza.zzc(j3, zzen2);
        }
    }

    @RequiresNonNull({"sampleReader"})
    private final void zzg(byte[] bArr, int i, int i2) {
        this.zzd.zzb(bArr, i, i2);
        if (!this.zze) {
            this.zzg.zza(bArr, i, i2);
            this.zzh.zza(bArr, i, i2);
            this.zzi.zza(bArr, i, i2);
        }
        this.zzj.zza(bArr, i, i2);
        this.zzk.zza(bArr, i, i2);
    }

    @RequiresNonNull({"sampleReader"})
    private final void zzh(long j, int i, int i2, long j2) {
        this.zzd.zzd(j, i, i2, j2, this.zze);
        if (!this.zze) {
            this.zzg.zzc(i2);
            this.zzh.zzc(i2);
            this.zzi.zzc(i2);
        }
        this.zzj.zzc(i2);
        this.zzk.zzc(i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0061  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(com.google.android.gms.internal.ads.zzen r18) {
        /*
            r17 = this;
            r7 = r17
            com.google.android.gms.internal.ads.zzafb r0 = r7.zzc
            com.google.android.gms.internal.ads.zzdd.zzb(r0)
            java.lang.String r0 = com.google.android.gms.internal.ads.zzex.zza
        L_0x0009:
            int r0 = r18.zza()
            if (r0 <= 0) goto L_0x007b
            int r0 = r18.zzc()
            int r8 = r18.zzd()
            byte[] r9 = r18.zzN()
            long r1 = r7.zzl
            int r3 = r18.zza()
            long r3 = (long) r3
            long r1 = r1 + r3
            r7.zzl = r1
            com.google.android.gms.internal.ads.zzafb r1 = r7.zzc
            int r2 = r18.zza()
            r10 = r18
            r1.zzr(r10, r2)
        L_0x0030:
            if (r0 >= r8) goto L_0x0009
            boolean[] r1 = r7.zzf
            int r1 = com.google.android.gms.internal.ads.zzfv.zza(r9, r0, r8, r1)
            if (r1 == r8) goto L_0x0078
            int r2 = r1 + 3
            byte r2 = r9[r2]
            r2 = r2 & 126(0x7e, float:1.77E-43)
            r3 = 3
            if (r1 <= 0) goto L_0x004d
            int r4 = r1 + -1
            byte r5 = r9[r4]
            if (r5 != 0) goto L_0x004d
            r3 = 4
            r12 = r3
            r11 = r4
            goto L_0x004f
        L_0x004d:
            r11 = r1
            r12 = r3
        L_0x004f:
            int r1 = r11 - r0
            if (r1 <= 0) goto L_0x0056
            r7.zzg(r9, r0, r11)
        L_0x0056:
            int r13 = r8 - r11
            long r3 = r7.zzl
            long r5 = (long) r13
            long r14 = r3 - r5
            if (r1 >= 0) goto L_0x0061
            int r0 = -r1
            goto L_0x0062
        L_0x0061:
            r0 = 0
        L_0x0062:
            r4 = r0
            int r16 = r2 >> 1
            long r5 = r7.zzm
            r0 = r17
            r1 = r14
            r3 = r13
            r0.zzf(r1, r3, r4, r5)
            long r5 = r7.zzm
            r4 = r16
            r0.zzh(r1, r3, r4, r5)
            int r0 = r11 + r12
            goto L_0x0030
        L_0x0078:
            r7.zzg(r9, r0, r8)
        L_0x007b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzani.zza(com.google.android.gms.internal.ads.zzen):void");
    }

    public final void zzb(zzady zzady, zzaon zzaon) {
        zzaon.zzc();
        this.zzb = zzaon.zzb();
        this.zzc = zzady.zzw(zzaon.zza(), 2);
        this.zzd = new zzanh(this.zzc);
        this.zza.zzd(zzady, zzaon);
    }

    public final void zzc(boolean z) {
        zzdd.zzb(this.zzc);
        String str = zzex.zza;
        if (z) {
            this.zza.zze();
            zzf(this.zzl, 0, 0, this.zzm);
            zzh(this.zzl, 0, 48, this.zzm);
        }
    }

    public final void zzd(long j, int i) {
        this.zzm = j;
    }

    public final void zze() {
        this.zzl = 0;
        this.zzm = -9223372036854775807L;
        zzfv.zzi(this.zzf);
        this.zzg.zzb();
        this.zzh.zzb();
        this.zzi.zzb();
        this.zzj.zzb();
        this.zzk.zzb();
        this.zza.zzb();
        zzanh zzanh = this.zzd;
        if (zzanh != null) {
            zzanh.zzc();
        }
    }
}
