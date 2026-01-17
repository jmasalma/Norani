package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzaos implements zzaot {
    private static final int[] zza = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    private static final int[] zzb = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
    private final zzady zzc;
    private final zzafb zzd;
    private final zzaow zze;
    private final int zzf;
    private final byte[] zzg;
    private final zzen zzh;
    private final int zzi;
    private final zzz zzj;
    private int zzk;
    private long zzl;
    private int zzm;
    private long zzn;

    public zzaos(zzady zzady, zzafb zzafb, zzaow zzaow) throws zzaz {
        this.zzc = zzady;
        this.zzd = zzafb;
        this.zze = zzaow;
        int max = Math.max(1, zzaow.zzc / 10);
        this.zzi = max;
        zzen zzen = new zzen(zzaow.zzf);
        zzen.zzk();
        int zzk2 = zzen.zzk();
        this.zzf = zzk2;
        int i = zzaow.zzb;
        int i2 = (((zzaow.zzd - (i * 4)) * 8) / (zzaow.zze * i)) + 1;
        if (zzk2 == i2) {
            String str = zzex.zza;
            int i3 = ((max + zzk2) - 1) / zzk2;
            this.zzg = new byte[(zzaow.zzd * i3)];
            this.zzh = new zzen(i3 * (zzk2 + zzk2) * i);
            int i4 = ((zzaow.zzc * zzaow.zzd) * 8) / zzk2;
            zzx zzx = new zzx();
            zzx.zzah("audio/raw");
            zzx.zzC(i4);
            zzx.zzac(i4);
            zzx.zzX((max + max) * i);
            zzx.zzD(zzaow.zzb);
            zzx.zzai(zzaow.zzc);
            zzx.zzab(2);
            this.zzj = zzx.zzan();
            return;
        }
        throw zzaz.zza("Expected frames per block: " + i2 + "; got: " + zzk2, (Throwable) null);
    }

    private final int zzd(int i) {
        int i2 = this.zze.zzb;
        return i / (i2 + i2);
    }

    private final int zze(int i) {
        return (i + i) * this.zze.zzb;
    }

    private final void zzf(int i) {
        long zzu = this.zzl + zzex.zzu(this.zzn, 1000000, (long) this.zze.zzc, RoundingMode.DOWN);
        int zze2 = zze(i);
        this.zzd.zzt(zzu, 1, zze2, this.zzm - zze2, (zzafa) null);
        this.zzn += (long) i;
        this.zzm -= zze2;
    }

    public final void zza(int i, long j) {
        zzaoz zzaoz = new zzaoz(this.zze, this.zzf, (long) i, j);
        this.zzc.zzP(zzaoz);
        zzafb zzafb = this.zzd;
        zzafb.zzm(this.zzj);
        zzafb.zzl(zzaoz.zza());
    }

    public final void zzb(long j) {
        this.zzk = 0;
        this.zzl = j;
        this.zzm = 0;
        this.zzn = 0;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0045 A[EDGE_INSN: B:39:0x0045->B:10:0x0045 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x0026  */
    public final boolean zzc(com.google.android.gms.internal.ads.zzadw r26, long r27) throws java.io.IOException {
        /*
            r25 = this;
            r0 = r25
            r1 = r27
            int r3 = r0.zzm
            int r3 = r0.zzd(r3)
            int r4 = r0.zzi
            int r3 = r4 - r3
            java.lang.String r5 = com.google.android.gms.internal.ads.zzex.zza
            int r5 = r0.zzf
            int r3 = r3 + r5
            r6 = -1
            int r3 = r3 + r6
            int r3 = r3 / r5
            com.google.android.gms.internal.ads.zzaow r7 = r0.zze
            int r8 = r7.zzd
            int r3 = r3 * r8
            r9 = 0
            int r9 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r9 != 0) goto L_0x0023
        L_0x0021:
            r9 = 1
            goto L_0x0024
        L_0x0023:
            r9 = 0
        L_0x0024:
            if (r9 != 0) goto L_0x0045
            int r12 = r0.zzk
            if (r12 >= r3) goto L_0x0045
            int r12 = r3 - r12
            long r12 = (long) r12
            long r12 = java.lang.Math.min(r12, r1)
            int r12 = (int) r12
            byte[] r13 = r0.zzg
            int r14 = r0.zzk
            r15 = r26
            int r12 = r15.zza(r13, r14, r12)
            if (r12 != r6) goto L_0x003f
            goto L_0x0021
        L_0x003f:
            int r13 = r0.zzk
            int r13 = r13 + r12
            r0.zzk = r13
            goto L_0x0024
        L_0x0045:
            int r1 = r0.zzk
            int r1 = r1 / r8
            if (r1 <= 0) goto L_0x014d
            byte[] r2 = r0.zzg
            com.google.android.gms.internal.ads.zzen r3 = r0.zzh
            r6 = 0
        L_0x004f:
            if (r6 >= r1) goto L_0x0121
            r12 = 0
        L_0x0052:
            int r13 = r7.zzb
            if (r12 >= r13) goto L_0x0115
            byte[] r14 = r3.zzN()
            int r15 = r6 * r8
            int r16 = r8 / r13
            int r16 = r16 + -4
            int r17 = r12 * 4
            int r15 = r15 + r17
            int r17 = r15 + 1
            byte r10 = r2[r17]
            r10 = r10 & 255(0xff, float:3.57E-43)
            byte r11 = r2[r15]
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r18 = r15 + 2
            r19 = r7
            byte r7 = r2[r18]
            r7 = r7 & 255(0xff, float:3.57E-43)
            r18 = r9
            r9 = 88
            int r7 = java.lang.Math.min(r7, r9)
            int[] r20 = zzb
            r21 = r20[r7]
            int r22 = r6 * r5
            int r22 = r22 * r13
            int r22 = r22 + r12
            int r10 = r10 << 8
            r10 = r10 | r11
            short r10 = (short) r10
            r11 = r10 & 255(0xff, float:3.57E-43)
            int r22 = r22 + r22
            byte r11 = (byte) r11
            r14[r22] = r11
            int r11 = r22 + 1
            int r9 = r10 >> 8
            byte r9 = (byte) r9
            r14[r11] = r9
            r9 = 0
        L_0x009b:
            int r11 = r16 + r16
            if (r9 >= r11) goto L_0x0109
            int r11 = r13 * 4
            int r11 = r11 + r15
            int r23 = r9 / 8
            int r24 = r9 / 2
            int r24 = r24 % 4
            int r23 = r23 * r13
            int r23 = r23 * 4
            int r11 = r11 + r23
            int r11 = r11 + r24
            byte r11 = r2[r11]
            r23 = r2
            r2 = r11 & 255(0xff, float:3.57E-43)
            int r24 = r9 % 2
            if (r24 != 0) goto L_0x00bd
            r2 = r11 & 15
            goto L_0x00bf
        L_0x00bd:
            int r2 = r2 >> 4
        L_0x00bf:
            r11 = r2 & 7
            int r11 = r11 + r11
            r17 = 1
            int r11 = r11 + 1
            int r11 = r11 * r21
            r21 = r2 & 8
            int r11 = r11 >> 3
            if (r21 == 0) goto L_0x00cf
            int r11 = -r11
        L_0x00cf:
            int r10 = r10 + r11
            r11 = 32767(0x7fff, float:4.5916E-41)
            int r10 = java.lang.Math.min(r10, r11)
            r11 = -32768(0xffffffffffff8000, float:NaN)
            int r10 = java.lang.Math.max(r11, r10)
            int r11 = r13 + r13
            int r22 = r22 + r11
            r11 = r10 & 255(0xff, float:3.57E-43)
            byte r11 = (byte) r11
            r14[r22] = r11
            int r11 = r22 + 1
            r21 = r13
            int r13 = r10 >> 8
            byte r13 = (byte) r13
            r14[r11] = r13
            int[] r11 = zza
            r2 = r11[r2]
            int r7 = r7 + r2
            r2 = 88
            int r7 = java.lang.Math.min(r7, r2)
            r11 = 0
            int r7 = java.lang.Math.max(r11, r7)
            r11 = r20[r7]
            int r9 = r9 + 1
            r13 = r21
            r2 = r23
            r21 = r11
            goto L_0x009b
        L_0x0109:
            r23 = r2
            r17 = 1
            int r12 = r12 + 1
            r9 = r18
            r7 = r19
            goto L_0x0052
        L_0x0115:
            r23 = r2
            r19 = r7
            r18 = r9
            r17 = 1
            int r6 = r6 + 1
            goto L_0x004f
        L_0x0121:
            r18 = r9
            int r5 = r5 * r1
            int r2 = r0.zze(r5)
            r5 = 0
            r3.zzL(r5)
            r3.zzK(r2)
            int r2 = r0.zzk
            int r1 = r1 * r8
            int r2 = r2 - r1
            r0.zzk = r2
            int r1 = r3.zzd()
            com.google.android.gms.internal.ads.zzafb r2 = r0.zzd
            r2.zzr(r3, r1)
            int r2 = r0.zzm
            int r2 = r2 + r1
            r0.zzm = r2
            int r1 = r0.zzd(r2)
            if (r1 < r4) goto L_0x014f
            r0.zzf(r4)
            goto L_0x014f
        L_0x014d:
            r18 = r9
        L_0x014f:
            if (r18 == 0) goto L_0x015c
            int r1 = r0.zzm
            int r1 = r0.zzd(r1)
            if (r1 <= 0) goto L_0x015c
            r0.zzf(r1)
        L_0x015c:
            return r18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaos.zzc(com.google.android.gms.internal.ads.zzadw, long):boolean");
    }
}
