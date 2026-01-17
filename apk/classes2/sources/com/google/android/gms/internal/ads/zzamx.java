package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzamx implements zzamz {
    private final zzen zza;
    private final AtomicInteger zzb = new AtomicInteger();
    private final String zzc;
    private final int zzd;
    private final String zze;
    private String zzf;
    private zzafb zzg;
    private int zzh = 0;
    private int zzi;
    private int zzj;
    private long zzk;
    private zzz zzl;
    private int zzm;
    private int zzn;
    private int zzo = -1;
    private int zzp = -1;
    private long zzq = -9223372036854775807L;

    public zzamx(String str, int i, int i2, String str2) {
        this.zza = new zzen(new byte[i2]);
        this.zzc = str;
        this.zzd = i;
        this.zze = "video/mp2t";
    }

    @RequiresNonNull({"output"})
    private final void zzf(zzads zzads) {
        int i;
        zzx zzx;
        int i2 = zzads.zzb;
        if (i2 != -2147483647 && (i = zzads.zzc) != -1) {
            zzz zzz = this.zzl;
            if (zzz == null || i != zzz.zzG || i2 != zzz.zzH || !Objects.equals(zzads.zza, zzz.zzo)) {
                zzz zzz2 = this.zzl;
                if (zzz2 == null) {
                    zzx = new zzx();
                } else {
                    zzx = zzz2.zzb();
                }
                zzx.zzS(this.zzf);
                zzx.zzG(this.zze);
                zzx.zzah(zzads.zza);
                zzx.zzD(i);
                zzx.zzai(i2);
                zzx.zzW(this.zzc);
                zzx.zzaf(this.zzd);
                zzz zzan = zzx.zzan();
                this.zzl = zzan;
                this.zzg.zzm(zzan);
            }
        }
    }

    private final boolean zzg(zzen zzen, byte[] bArr, int i) {
        int min = Math.min(zzen.zza(), i - this.zzi);
        zzen.zzH(bArr, this.zzi, min);
        int i2 = this.zzi + min;
        this.zzi = i2;
        return i2 == i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:63:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01be  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01de  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(com.google.android.gms.internal.ads.zzen r21) throws com.google.android.gms.internal.ads.zzaz {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            com.google.android.gms.internal.ads.zzafb r2 = r0.zzg
            com.google.android.gms.internal.ads.zzdd.zzb(r2)
        L_0x0009:
            int r2 = r21.zza()
            if (r2 <= 0) goto L_0x029f
            int r2 = r0.zzh
            r3 = 8
            r4 = 3
            r5 = 2
            r6 = 0
            r7 = 4
            r8 = 1
            if (r2 == 0) goto L_0x020b
            r9 = 5
            r10 = 7
            r11 = 6
            if (r2 == r8) goto L_0x0126
            if (r2 == r5) goto L_0x010c
            r12 = 0
            r14 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r2 == r4) goto L_0x00d7
            if (r2 == r7) goto L_0x00ac
            if (r2 == r9) goto L_0x0071
            int r2 = r21.zza()
            int r3 = r0.zzm
            int r4 = r0.zzi
            int r3 = r3 - r4
            int r2 = java.lang.Math.min(r2, r3)
            com.google.android.gms.internal.ads.zzafb r3 = r0.zzg
            r3.zzr(r1, r2)
            int r3 = r0.zzi
            int r3 = r3 + r2
            r0.zzi = r3
            int r2 = r0.zzm
            if (r3 != r2) goto L_0x0009
            long r2 = r0.zzq
            int r2 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r2 == 0) goto L_0x0051
            r2 = r8
            goto L_0x0052
        L_0x0051:
            r2 = r6
        L_0x0052:
            com.google.android.gms.internal.ads.zzdd.zzf(r2)
            com.google.android.gms.internal.ads.zzafb r9 = r0.zzg
            long r10 = r0.zzq
            int r2 = r0.zzn
            if (r2 != r7) goto L_0x005f
            r12 = r6
            goto L_0x0060
        L_0x005f:
            r12 = r8
        L_0x0060:
            int r13 = r0.zzm
            r14 = 0
            r15 = 0
            r9.zzt(r10, r12, r13, r14, r15)
            long r2 = r0.zzq
            long r4 = r0.zzk
            long r2 = r2 + r4
            r0.zzq = r2
            r0.zzh = r6
            goto L_0x0009
        L_0x0071:
            com.google.android.gms.internal.ads.zzen r2 = r0.zza
            byte[] r3 = r2.zzN()
            int r5 = r0.zzp
            boolean r3 = r0.zzg(r1, r3, r5)
            if (r3 == 0) goto L_0x0009
            java.util.concurrent.atomic.AtomicInteger r3 = r0.zzb
            byte[] r5 = r2.zzN()
            com.google.android.gms.internal.ads.zzads r3 = com.google.android.gms.internal.ads.zzadu.zze(r5, r3)
            int r5 = r0.zzn
            if (r5 != r4) goto L_0x0090
            r0.zzf(r3)
        L_0x0090:
            int r4 = r3.zzd
            r0.zzm = r4
            long r3 = r3.zze
            int r5 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r5 != 0) goto L_0x009b
            goto L_0x009c
        L_0x009b:
            r12 = r3
        L_0x009c:
            r0.zzk = r12
            r2.zzL(r6)
            com.google.android.gms.internal.ads.zzafb r3 = r0.zzg
            int r4 = r0.zzp
            r3.zzr(r2, r4)
            r0.zzh = r11
            goto L_0x0009
        L_0x00ac:
            com.google.android.gms.internal.ads.zzen r2 = r0.zza
            byte[] r3 = r2.zzN()
            boolean r3 = r0.zzg(r1, r3, r11)
            if (r3 == 0) goto L_0x0009
            byte[] r2 = r2.zzN()
            int r2 = com.google.android.gms.internal.ads.zzadu.zzb(r2)
            r0.zzp = r2
            int r3 = r0.zzi
            if (r3 <= r2) goto L_0x00d3
            int r2 = r3 - r2
            int r3 = r3 - r2
            r0.zzi = r3
            int r3 = r21.zzc()
            int r3 = r3 - r2
            r1.zzL(r3)
        L_0x00d3:
            r0.zzh = r9
            goto L_0x0009
        L_0x00d7:
            com.google.android.gms.internal.ads.zzen r2 = r0.zza
            byte[] r3 = r2.zzN()
            int r4 = r0.zzo
            boolean r3 = r0.zzg(r1, r3, r4)
            if (r3 == 0) goto L_0x0009
            byte[] r3 = r2.zzN()
            com.google.android.gms.internal.ads.zzads r3 = com.google.android.gms.internal.ads.zzadu.zzd(r3)
            r0.zzf(r3)
            int r4 = r3.zzd
            r0.zzm = r4
            long r3 = r3.zze
            int r5 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r5 != 0) goto L_0x00fb
            goto L_0x00fc
        L_0x00fb:
            r12 = r3
        L_0x00fc:
            r0.zzk = r12
            r2.zzL(r6)
            com.google.android.gms.internal.ads.zzafb r3 = r0.zzg
            int r4 = r0.zzo
            r3.zzr(r2, r4)
            r0.zzh = r11
            goto L_0x0009
        L_0x010c:
            com.google.android.gms.internal.ads.zzen r2 = r0.zza
            byte[] r3 = r2.zzN()
            boolean r3 = r0.zzg(r1, r3, r10)
            if (r3 == 0) goto L_0x0009
            byte[] r2 = r2.zzN()
            int r2 = com.google.android.gms.internal.ads.zzadu.zza(r2)
            r0.zzo = r2
            r0.zzh = r4
            goto L_0x0009
        L_0x0126:
            com.google.android.gms.internal.ads.zzen r2 = r0.zza
            byte[] r12 = r2.zzN()
            r13 = 18
            boolean r12 = r0.zzg(r1, r12, r13)
            if (r12 == 0) goto L_0x0009
            byte[] r12 = r2.zzN()
            com.google.android.gms.internal.ads.zzz r14 = r0.zzl
            if (r14 != 0) goto L_0x0158
            java.lang.String r15 = r0.zzf
            java.lang.String r14 = r0.zzc
            int r13 = r0.zzd
            java.lang.String r5 = r0.zze
            r19 = 0
            r16 = r14
            r14 = r12
            r17 = r13
            r18 = r5
            com.google.android.gms.internal.ads.zzz r5 = com.google.android.gms.internal.ads.zzadu.zzc(r14, r15, r16, r17, r18, r19)
            r0.zzl = r5
            com.google.android.gms.internal.ads.zzafb r13 = r0.zzg
            r13.zzm(r5)
        L_0x0158:
            int r5 = com.google.android.gms.internal.ads.zzadu.zza
            byte r5 = r12[r6]
            r13 = 31
            r14 = -1
            r15 = -2
            if (r5 == r15) goto L_0x01a1
            if (r5 == r14) goto L_0x0188
            if (r5 == r13) goto L_0x0173
            byte r3 = r12[r9]
            r3 = r3 & r4
            int r3 = r3 << 12
            byte r4 = r12[r11]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << r7
            byte r6 = r12[r10]
            goto L_0x01ad
        L_0x0173:
            byte r6 = r12[r11]
            r4 = r4 & r6
            int r4 = r4 << 12
            byte r6 = r12[r10]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r6 = r6 << r7
            byte r3 = r12[r3]
            r3 = r3 & 60
            r17 = 2
            int r3 = r3 >> 2
            r4 = r4 | r6
            r3 = r3 | r4
            goto L_0x019e
        L_0x0188:
            byte r3 = r12[r10]
            r3 = r3 & r4
            int r3 = r3 << 12
            byte r4 = r12[r11]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << r7
            r6 = 9
            byte r6 = r12[r6]
            r6 = r6 & 60
            r17 = 2
            int r6 = r6 >> 2
            r3 = r3 | r4
            r3 = r3 | r6
        L_0x019e:
            int r3 = r3 + r8
            r4 = r8
            goto L_0x01b4
        L_0x01a1:
            byte r3 = r12[r7]
            r3 = r3 & r4
            int r3 = r3 << 12
            byte r4 = r12[r10]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << r7
            byte r6 = r12[r11]
        L_0x01ad:
            r6 = r6 & 240(0xf0, float:3.36E-43)
            int r6 = r6 >> r7
            r3 = r3 | r4
            r3 = r3 | r6
            int r3 = r3 + r8
            r4 = 0
        L_0x01b4:
            if (r4 == 0) goto L_0x01ba
            int r3 = r3 * 16
            int r3 = r3 / 14
        L_0x01ba:
            r0.zzm = r3
            if (r5 == r15) goto L_0x01de
            if (r5 == r14) goto L_0x01d4
            if (r5 == r13) goto L_0x01cc
            byte r3 = r12[r7]
            r3 = r3 & r8
            int r3 = r3 << r11
            byte r4 = r12[r9]
            r4 = r4 & 252(0xfc, float:3.53E-43)
            r5 = 2
            goto L_0x01e7
        L_0x01cc:
            r5 = 2
            byte r3 = r12[r9]
            r3 = r3 & r10
            int r3 = r3 << r7
            byte r4 = r12[r11]
            goto L_0x01db
        L_0x01d4:
            r5 = 2
            byte r3 = r12[r7]
            r3 = r3 & r10
            int r3 = r3 << r7
            byte r4 = r12[r10]
        L_0x01db:
            r4 = r4 & 60
            goto L_0x01e7
        L_0x01de:
            r5 = 2
            byte r3 = r12[r9]
            r3 = r3 & r8
            int r3 = r3 << r11
            byte r4 = r12[r7]
            r4 = r4 & 252(0xfc, float:3.53E-43)
        L_0x01e7:
            int r4 = r4 >> r5
            r3 = r3 | r4
            int r3 = r3 + r8
            com.google.android.gms.internal.ads.zzz r4 = r0.zzl
            int r4 = r4.zzH
            int r3 = r3 * 32
            long r5 = (long) r3
            long r3 = com.google.android.gms.internal.ads.zzex.zzt(r5, r4)
            int r3 = com.google.android.gms.internal.ads.zzgbt.zzb(r3)
            long r3 = (long) r3
            r0.zzk = r3
            r3 = 0
            r2.zzL(r3)
            com.google.android.gms.internal.ads.zzafb r3 = r0.zzg
            r4 = 18
            r3.zzr(r2, r4)
            r0.zzh = r11
            goto L_0x0009
        L_0x020b:
            int r2 = r21.zza()
            if (r2 <= 0) goto L_0x0009
            int r2 = r0.zzj
            int r2 = r2 << r3
            r0.zzj = r2
            int r5 = r21.zzm()
            r2 = r2 | r5
            r0.zzj = r2
            int r5 = com.google.android.gms.internal.ads.zzadu.zza
            r5 = 2147385345(0x7ffe8001, float:NaN)
            if (r2 == r5) goto L_0x025d
            r5 = -25230976(0xfffffffffe7f0180, float:-8.474023E37)
            if (r2 == r5) goto L_0x025d
            r5 = 536864768(0x1fffe800, float:1.0838051E-19)
            if (r2 == r5) goto L_0x025d
            r5 = -14745368(0xffffffffff1f00e8, float:-2.1135196E38)
            if (r2 != r5) goto L_0x0234
            goto L_0x025d
        L_0x0234:
            r5 = 1683496997(0x64582025, float:1.5947252E22)
            if (r2 == r5) goto L_0x025b
            r5 = 622876772(0x25205864, float:1.3907736E-16)
            if (r2 != r5) goto L_0x023f
            goto L_0x025b
        L_0x023f:
            r5 = 1078008818(0x40411bf2, float:3.0173306)
            if (r2 == r5) goto L_0x0259
            r5 = -233094848(0xfffffffff21b4140, float:-3.0751398E30)
            if (r2 != r5) goto L_0x024a
            goto L_0x0259
        L_0x024a:
            r5 = 1908687592(0x71c442e8, float:1.9436783E30)
            if (r2 == r5) goto L_0x0257
            r5 = -398277519(0xffffffffe842c471, float:-3.6790512E24)
            if (r2 != r5) goto L_0x0255
            goto L_0x0257
        L_0x0255:
            r2 = 0
            goto L_0x025e
        L_0x0257:
            r2 = r7
            goto L_0x025e
        L_0x0259:
            r2 = r4
            goto L_0x025e
        L_0x025b:
            r2 = 2
            goto L_0x025e
        L_0x025d:
            r2 = r8
        L_0x025e:
            r0.zzn = r2
            if (r2 == 0) goto L_0x020b
            com.google.android.gms.internal.ads.zzen r3 = r0.zza
            byte[] r3 = r3.zzN()
            int r5 = r0.zzj
            int r6 = r5 >> 24
            r6 = r6 & 255(0xff, float:3.57E-43)
            byte r6 = (byte) r6
            r9 = 0
            r3[r9] = r6
            int r6 = r5 >> 16
            r6 = r6 & 255(0xff, float:3.57E-43)
            byte r6 = (byte) r6
            r3[r8] = r6
            int r6 = r5 >> 8
            r6 = r6 & 255(0xff, float:3.57E-43)
            byte r6 = (byte) r6
            r9 = 2
            r3[r9] = r6
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r5 = (byte) r5
            r3[r4] = r5
            r0.zzi = r7
            r5 = 0
            r0.zzj = r5
            if (r2 == r4) goto L_0x029b
            if (r2 != r7) goto L_0x0290
            goto L_0x029b
        L_0x0290:
            if (r2 != r8) goto L_0x0296
            r0.zzh = r8
            goto L_0x0009
        L_0x0296:
            r2 = 2
            r0.zzh = r2
            goto L_0x0009
        L_0x029b:
            r0.zzh = r7
            goto L_0x0009
        L_0x029f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzamx.zza(com.google.android.gms.internal.ads.zzen):void");
    }

    public final void zzb(zzady zzady, zzaon zzaon) {
        zzaon.zzc();
        this.zzf = zzaon.zzb();
        this.zzg = zzady.zzw(zzaon.zza(), 1);
    }

    public final void zzc(boolean z) {
    }

    public final void zzd(long j, int i) {
        this.zzq = j;
    }

    public final void zze() {
        this.zzh = 0;
        this.zzi = 0;
        this.zzj = 0;
        this.zzq = -9223372036854775807L;
        this.zzb.set(0);
    }
}
