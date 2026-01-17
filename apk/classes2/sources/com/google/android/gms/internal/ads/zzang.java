package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzang implements zzamz {
    private final zzaod zza;
    private final String zzb = "video/mp2t";
    private final zzanr zzc = new zzanr(7, 128);
    private final zzanr zzd = new zzanr(8, 128);
    private final zzanr zze = new zzanr(6, 128);
    private long zzf;
    private final boolean[] zzg = new boolean[3];
    private String zzh;
    private zzafb zzi;
    private zzanf zzj;
    private boolean zzk;
    private long zzl = -9223372036854775807L;
    private boolean zzm;
    private final zzen zzn = new zzen();

    public zzang(zzaod zzaod, boolean z, boolean z2, String str) {
        this.zza = zzaod;
    }

    @RequiresNonNull({"sampleReader"})
    private final void zzg(byte[] bArr, int i, int i2) {
        if (!this.zzk) {
            this.zzc.zza(bArr, i, i2);
            this.zzd.zza(bArr, i, i2);
        }
        this.zze.zza(bArr, i, i2);
    }

    @RequiresNonNull({"sampleReader"})
    private final void zzh(long j, int i, long j2) {
        if (!this.zzk) {
            this.zzc.zzc(i);
            this.zzd.zzc(i);
        }
        this.zze.zzc(i);
        this.zzj.zzd(j, i, j2, this.zzm);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0058  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(com.google.android.gms.internal.ads.zzen r16) {
        /*
            r15 = this;
            r7 = r15
            com.google.android.gms.internal.ads.zzafb r0 = r7.zzi
            com.google.android.gms.internal.ads.zzdd.zzb(r0)
            java.lang.String r0 = com.google.android.gms.internal.ads.zzex.zza
            int r0 = r16.zzc()
            int r8 = r16.zzd()
            byte[] r9 = r16.zzN()
            long r1 = r7.zzf
            int r3 = r16.zza()
            long r3 = (long) r3
            long r1 = r1 + r3
            r7.zzf = r1
            com.google.android.gms.internal.ads.zzafb r1 = r7.zzi
            int r2 = r16.zza()
            r3 = r16
            r1.zzr(r3, r2)
        L_0x0029:
            boolean[] r1 = r7.zzg
            int r1 = com.google.android.gms.internal.ads.zzfv.zza(r9, r0, r8, r1)
            if (r1 == r8) goto L_0x006a
            int r2 = r1 + 3
            byte r2 = r9[r2]
            r10 = r2 & 31
            r2 = 3
            if (r1 <= 0) goto L_0x0044
            int r3 = r1 + -1
            byte r4 = r9[r3]
            if (r4 != 0) goto L_0x0044
            r2 = 4
            r12 = r2
            r11 = r3
            goto L_0x0046
        L_0x0044:
            r11 = r1
            r12 = r2
        L_0x0046:
            int r1 = r11 - r0
            if (r1 <= 0) goto L_0x004d
            r15.zzg(r9, r0, r11)
        L_0x004d:
            int r3 = r8 - r11
            long r4 = r7.zzf
            long r13 = (long) r3
            long r13 = r4 - r13
            if (r1 >= 0) goto L_0x0058
            int r0 = -r1
            goto L_0x0059
        L_0x0058:
            r0 = 0
        L_0x0059:
            r4 = r0
            long r5 = r7.zzl
            r0 = r15
            r1 = r13
            r0.zzf(r1, r3, r4, r5)
            long r4 = r7.zzl
            r3 = r10
            r0.zzh(r1, r3, r4)
            int r0 = r11 + r12
            goto L_0x0029
        L_0x006a:
            r15.zzg(r9, r0, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzang.zza(com.google.android.gms.internal.ads.zzen):void");
    }

    public final void zzb(zzady zzady, zzaon zzaon) {
        zzaon.zzc();
        this.zzh = zzaon.zzb();
        this.zzi = zzady.zzw(zzaon.zza(), 2);
        this.zzj = new zzanf(this.zzi, false, false);
        this.zza.zzd(zzady, zzaon);
    }

    public final void zzc(boolean z) {
        zzdd.zzb(this.zzi);
        String str = zzex.zza;
        if (z) {
            this.zza.zze();
            zzf(this.zzf, 0, 0, this.zzl);
            zzh(this.zzf, 9, this.zzl);
            zzf(this.zzf, 0, 0, this.zzl);
        }
    }

    public final void zzd(long j, int i) {
        this.zzl = j;
        int i2 = i & 2;
        this.zzm = (i2 != 0) | this.zzm;
    }

    public final void zze() {
        this.zzf = 0;
        this.zzm = false;
        this.zzl = -9223372036854775807L;
        zzfv.zzi(this.zzg);
        this.zzc.zzb();
        this.zzd.zzb();
        this.zze.zzb();
        this.zza.zzb();
        zzanf zzanf = this.zzj;
        if (zzanf != null) {
            zzanf.zzc();
        }
    }

    @RequiresNonNull({"output", "sampleReader"})
    private final void zzf(long j, int i, int i2, long j2) {
        int i3 = i2;
        if (!this.zzk) {
            zzanr zzanr = this.zzc;
            zzanr.zzd(i3);
            zzanr zzanr2 = this.zzd;
            zzanr2.zzd(i3);
            if (!this.zzk) {
                if (zzanr.zze() && zzanr2.zze()) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Arrays.copyOf(zzanr.zza, zzanr.zzb));
                    arrayList.add(Arrays.copyOf(zzanr2.zza, zzanr2.zzb));
                    zzfu zzg2 = zzfv.zzg(zzanr.zza, 4, zzanr.zzb);
                    zzft zzf2 = zzfv.zzf(zzanr2.zza, 4, zzanr2.zzb);
                    String zzc2 = zzdk.zzc(zzg2.zza, zzg2.zzb, zzg2.zzc);
                    zzafb zzafb = this.zzi;
                    zzx zzx = new zzx();
                    zzx.zzS(this.zzh);
                    zzx.zzG(this.zzb);
                    zzx.zzah("video/avc");
                    zzx.zzE(zzc2);
                    zzx.zzam(zzg2.zze);
                    zzx.zzQ(zzg2.zzf);
                    zzi zzi2 = new zzi();
                    zzi2.zzc(zzg2.zzj);
                    zzi2.zzb(zzg2.zzk);
                    zzi2.zzd(zzg2.zzl);
                    zzi2.zzf(zzg2.zzh + 8);
                    zzi2.zza(zzg2.zzi + 8);
                    zzx.zzF(zzi2.zzg());
                    zzx.zzad(zzg2.zzg);
                    zzx.zzT(arrayList);
                    int i4 = zzg2.zzm;
                    zzx.zzY(i4);
                    zzafb.zzm(zzx.zzan());
                    this.zzk = true;
                    this.zza.zzf(i4);
                    this.zzj.zzb(zzg2);
                    this.zzj.zza(zzf2);
                    zzanr.zzb();
                    zzanr2.zzb();
                }
            } else if (zzanr.zze()) {
                zzfu zzg3 = zzfv.zzg(zzanr.zza, 4, zzanr.zzb);
                this.zza.zzf(zzg3.zzm);
                this.zzj.zzb(zzg3);
                zzanr.zzb();
            } else if (zzanr2.zze()) {
                this.zzj.zza(zzfv.zzf(zzanr2.zza, 4, zzanr2.zzb));
                zzanr2.zzb();
            }
        }
        zzanr zzanr3 = this.zze;
        if (zzanr3.zzd(i3)) {
            int zzc3 = zzfv.zzc(zzanr3.zza, zzanr3.zzb);
            zzen zzen = this.zzn;
            zzen.zzJ(zzanr3.zza, zzc3);
            zzen.zzL(4);
            this.zza.zzc(j2, zzen);
        }
        long j3 = j;
        int i5 = i;
        if (this.zzj.zze(j, i, this.zzk)) {
            this.zzm = false;
        }
    }
}
