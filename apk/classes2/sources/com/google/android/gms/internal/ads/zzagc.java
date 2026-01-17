package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzagc implements zzadv {
    private final zzen zza = new zzen(4);
    private final zzen zzb = new zzen(9);
    private final zzen zzc = new zzen(11);
    private final zzen zzd = new zzen();
    private final zzagd zze = new zzagd();
    private zzady zzf;
    private int zzg = 1;
    private boolean zzh;
    private long zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private long zzm;
    private boolean zzn;
    private zzagb zzo;
    private zzagg zzp;

    private final zzen zza(zzadw zzadw) throws IOException {
        zzen zzen = this.zzd;
        if (this.zzl > zzen.zzb()) {
            int zzb2 = zzen.zzb();
            zzen.zzJ(new byte[Math.max(zzb2 + zzb2, this.zzl)], 0);
        } else {
            zzen.zzL(0);
        }
        zzen.zzK(this.zzl);
        zzadw.zzi(zzen.zzN(), 0, this.zzl);
        return zzen;
    }

    @RequiresNonNull({"extractorOutput"})
    private final void zzg() {
        if (!this.zzn) {
            this.zzf.zzP(new zzaet(-9223372036854775807L, 0));
            this.zzn = true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00bd A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0009 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zzb(com.google.android.gms.internal.ads.zzadw r17, com.google.android.gms.internal.ads.zzaer r18) throws java.io.IOException {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            com.google.android.gms.internal.ads.zzady r2 = r0.zzf
            com.google.android.gms.internal.ads.zzdd.zzb(r2)
        L_0x0009:
            int r2 = r0.zzg
            r3 = -1
            r4 = 8
            r5 = 9
            r6 = 2
            r7 = 4
            r8 = 0
            r9 = 1
            if (r2 == r9) goto L_0x010b
            r10 = 3
            if (r2 == r6) goto L_0x0100
            if (r2 == r10) goto L_0x00c4
            if (r2 != r7) goto L_0x00be
            boolean r2 = r0.zzh
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r2 == 0) goto L_0x002c
            long r2 = r0.zzi
            long r14 = r0.zzm
            long r2 = r2 + r14
            goto L_0x003b
        L_0x002c:
            com.google.android.gms.internal.ads.zzagd r2 = r0.zze
            long r2 = r2.zzc()
            int r2 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r2 != 0) goto L_0x0039
            r2 = 0
            goto L_0x003b
        L_0x0039:
            long r2 = r0.zzm
        L_0x003b:
            int r14 = r0.zzk
            if (r14 != r4) goto L_0x0052
            com.google.android.gms.internal.ads.zzagb r14 = r0.zzo
            if (r14 == 0) goto L_0x0053
            r16.zzg()
            com.google.android.gms.internal.ads.zzagb r4 = r0.zzo
            com.google.android.gms.internal.ads.zzen r5 = r16.zza(r17)
            boolean r2 = r4.zzf(r5, r2)
        L_0x0050:
            r3 = r9
            goto L_0x009d
        L_0x0052:
            r4 = r14
        L_0x0053:
            if (r4 != r5) goto L_0x0067
            com.google.android.gms.internal.ads.zzagg r4 = r0.zzp
            if (r4 == 0) goto L_0x0096
            r16.zzg()
            com.google.android.gms.internal.ads.zzagg r4 = r0.zzp
            com.google.android.gms.internal.ads.zzen r5 = r16.zza(r17)
            boolean r2 = r4.zzf(r5, r2)
            goto L_0x0050
        L_0x0067:
            r5 = 18
            if (r4 != r5) goto L_0x0096
            boolean r4 = r0.zzn
            if (r4 != 0) goto L_0x0096
            com.google.android.gms.internal.ads.zzagd r4 = r0.zze
            com.google.android.gms.internal.ads.zzen r5 = r16.zza(r17)
            boolean r2 = r4.zzf(r5, r2)
            long r14 = r4.zzc()
            int r3 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r3 == 0) goto L_0x0050
            com.google.android.gms.internal.ads.zzady r3 = r0.zzf
            com.google.android.gms.internal.ads.zzaem r5 = new com.google.android.gms.internal.ads.zzaem
            long[] r10 = r4.zzd()
            long[] r4 = r4.zze()
            r5.<init>(r10, r4, r14)
            r3.zzP(r5)
            r0.zzn = r9
            goto L_0x0050
        L_0x0096:
            int r2 = r0.zzl
            r1.zzk(r2)
            r2 = r8
            r3 = r2
        L_0x009d:
            boolean r4 = r0.zzh
            if (r4 != 0) goto L_0x00b7
            if (r2 == 0) goto L_0x00b7
            r0.zzh = r9
            com.google.android.gms.internal.ads.zzagd r2 = r0.zze
            long r4 = r2.zzc()
            int r2 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r2 != 0) goto L_0x00b3
            long r4 = r0.zzm
            long r10 = -r4
            goto L_0x00b5
        L_0x00b3:
            r10 = 0
        L_0x00b5:
            r0.zzi = r10
        L_0x00b7:
            r0.zzj = r7
            r0.zzg = r6
            if (r3 == 0) goto L_0x0009
            return r8
        L_0x00be:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x00c4:
            com.google.android.gms.internal.ads.zzen r2 = r0.zzc
            byte[] r4 = r2.zzN()
            r5 = 11
            boolean r4 = r1.zzn(r4, r8, r5, r9)
            if (r4 != 0) goto L_0x00d3
            return r3
        L_0x00d3:
            r2.zzL(r8)
            int r3 = r2.zzm()
            r0.zzk = r3
            int r3 = r2.zzo()
            r0.zzl = r3
            int r3 = r2.zzo()
            long r3 = (long) r3
            r0.zzm = r3
            int r3 = r2.zzm()
            int r3 = r3 << 24
            long r4 = r0.zzm
            long r8 = (long) r3
            long r3 = r8 | r4
            r5 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r5
            r0.zzm = r3
            r2.zzM(r10)
            r0.zzg = r7
            goto L_0x0009
        L_0x0100:
            int r2 = r0.zzj
            r1.zzk(r2)
            r0.zzj = r8
            r0.zzg = r10
            goto L_0x0009
        L_0x010b:
            com.google.android.gms.internal.ads.zzen r2 = r0.zzb
            byte[] r10 = r2.zzN()
            boolean r10 = r1.zzn(r10, r8, r5, r9)
            if (r10 != 0) goto L_0x0118
            return r3
        L_0x0118:
            r2.zzL(r8)
            r2.zzM(r7)
            int r3 = r2.zzm()
            r7 = r3 & 4
            r3 = r3 & r9
            if (r7 == 0) goto L_0x0138
            com.google.android.gms.internal.ads.zzagb r7 = r0.zzo
            if (r7 != 0) goto L_0x0138
            com.google.android.gms.internal.ads.zzagb r7 = new com.google.android.gms.internal.ads.zzagb
            com.google.android.gms.internal.ads.zzady r8 = r0.zzf
            com.google.android.gms.internal.ads.zzafb r4 = r8.zzw(r4, r9)
            r7.<init>(r4)
            r0.zzo = r7
        L_0x0138:
            if (r3 == 0) goto L_0x014b
            com.google.android.gms.internal.ads.zzagg r3 = r0.zzp
            if (r3 != 0) goto L_0x014b
            com.google.android.gms.internal.ads.zzagg r3 = new com.google.android.gms.internal.ads.zzagg
            com.google.android.gms.internal.ads.zzady r4 = r0.zzf
            com.google.android.gms.internal.ads.zzafb r4 = r4.zzw(r5, r6)
            r3.<init>(r4)
            r0.zzp = r3
        L_0x014b:
            com.google.android.gms.internal.ads.zzady r3 = r0.zzf
            r3.zzG()
            int r2 = r2.zzg()
            int r2 = r2 + -5
            r0.zzj = r2
            r0.zzg = r6
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzagc.zzb(com.google.android.gms.internal.ads.zzadw, com.google.android.gms.internal.ads.zzaer):int");
    }

    public final /* synthetic */ zzadv zzc() {
        return this;
    }

    public final /* synthetic */ List zzd() {
        return zzfyq.zzn();
    }

    public final void zze(zzady zzady) {
        this.zzf = zzady;
    }

    public final void zzf(long j, long j2) {
        if (j == 0) {
            this.zzg = 1;
            this.zzh = false;
        } else {
            this.zzg = 3;
        }
        this.zzj = 0;
    }

    public final boolean zzi(zzadw zzadw) throws IOException {
        zzen zzen = this.zza;
        zzadl zzadl = (zzadl) zzadw;
        zzadl.zzm(zzen.zzN(), 0, 3, false);
        zzen.zzL(0);
        if (zzen.zzo() != 4607062) {
            return false;
        }
        zzadl.zzm(zzen.zzN(), 0, 2, false);
        zzen.zzL(0);
        if ((zzen.zzq() & 250) != 0) {
            return false;
        }
        zzadl.zzm(zzen.zzN(), 0, 4, false);
        zzen.zzL(0);
        int zzg2 = zzen.zzg();
        zzadw.zzj();
        zzadl.zzl(zzg2, false);
        zzadl.zzm(zzen.zzN(), 0, 4, false);
        zzen.zzL(0);
        if (zzen.zzg() == 0) {
            return true;
        }
        return false;
    }
}
