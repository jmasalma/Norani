package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.Surface;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzabs {
    private final zzabr zza;
    private final zzabw zzb;
    private boolean zzc;
    private int zzd = 0;
    private long zze = -9223372036854775807L;
    private long zzf;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private boolean zzi;
    private float zzj = 1.0f;
    private zzdj zzk = zzdj.zza;
    private boolean zzl;
    private boolean zzm;

    public zzabs(Context context, zzabr zzabr, long j) {
        this.zza = zzabr;
        this.zzb = new zzabw(context);
    }

    private final void zzo(int i) {
        this.zzd = Math.min(this.zzd, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ba, code lost:
        if (r17 > 100000) goto L_0x00cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00c5, code lost:
        if (r4 >= r26) goto L_0x00cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ca, code lost:
        if (r0.zzc != false) goto L_0x00cc;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zza(long r20, long r22, long r24, long r26, boolean r28, boolean r29, com.google.android.gms.internal.ads.zzabq r30) throws com.google.android.gms.internal.ads.zzin {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r4 = r22
            r10 = r30
            com.google.android.gms.internal.ads.zzabq.zzg(r30)
            boolean r3 = r0.zzc
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r3 == 0) goto L_0x001c
            long r8 = r0.zze
            int r3 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r3 != 0) goto L_0x001c
            r0.zze = r4
        L_0x001c:
            long r8 = r0.zzg
            int r3 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r3 == 0) goto L_0x0029
            com.google.android.gms.internal.ads.zzabw r3 = r0.zzb
            r3.zzd(r1)
            r0.zzg = r1
        L_0x0029:
            long r1 = r1 - r4
            float r3 = r0.zzj
            double r8 = (double) r3
            boolean r3 = r0.zzc
            double r1 = (double) r1
            double r1 = r1 / r8
            long r1 = (long) r1
            if (r3 == 0) goto L_0x0041
            com.google.android.gms.internal.ads.zzdj r3 = r0.zzk
            long r8 = r3.zzb()
            long r8 = com.google.android.gms.internal.ads.zzex.zzs(r8)
            long r8 = r8 - r24
            long r1 = r1 - r8
        L_0x0041:
            r10.zza = r1
            r11 = 3
            if (r28 == 0) goto L_0x004b
            if (r29 == 0) goto L_0x004a
            goto L_0x004b
        L_0x004a:
            return r11
        L_0x004b:
            boolean r1 = r0.zzl
            r12 = 4
            r13 = 5
            r14 = 1
            if (r1 != 0) goto L_0x0078
            r0.zzm = r14
            com.google.android.gms.internal.ads.zzabr r1 = r0.zza
            long r2 = r30.zza
            r9 = 1
            r4 = r22
            r6 = r24
            r8 = r29
            boolean r1 = r1.zzbc(r2, r4, r6, r8, r9)
            if (r1 == 0) goto L_0x0068
            return r12
        L_0x0068:
            boolean r1 = r0.zzc
            if (r1 == 0) goto L_0x0077
            long r1 = r30.zza
            r3 = 30000(0x7530, double:1.4822E-319)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto L_0x0077
            return r11
        L_0x0077:
            return r13
        L_0x0078:
            long r1 = r30.zza
            long r8 = r0.zzh
            int r3 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            r15 = -30000(0xffffffffffff8ad0, double:NaN)
            r9 = 2
            r8 = 0
            if (r3 == 0) goto L_0x008b
            boolean r3 = r0.zzi
            if (r3 != 0) goto L_0x008b
            goto L_0x00cd
        L_0x008b:
            int r3 = r0.zzd
            if (r3 == 0) goto L_0x00c8
            if (r3 == r14) goto L_0x00cc
            if (r3 == r9) goto L_0x00c3
            if (r3 != r11) goto L_0x00bd
            com.google.android.gms.internal.ads.zzdj r3 = r0.zzk
            long r17 = r3.zzb()
            long r17 = com.google.android.gms.internal.ads.zzex.zzs(r17)
            long r13 = r0.zzf
            long r17 = r17 - r13
            boolean r3 = r0.zzc
            if (r3 == 0) goto L_0x00cd
            long r13 = r0.zze
            int r3 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r3 == 0) goto L_0x00cd
            int r3 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r3 == 0) goto L_0x00cd
            int r1 = (r1 > r15 ? 1 : (r1 == r15 ? 0 : -1))
            if (r1 >= 0) goto L_0x00cd
            r1 = 100000(0x186a0, double:4.94066E-319)
            int r1 = (r17 > r1 ? 1 : (r17 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x00cd
            goto L_0x00cc
        L_0x00bd:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x00c3:
            int r1 = (r4 > r26 ? 1 : (r4 == r26 ? 0 : -1))
            if (r1 < 0) goto L_0x00cd
            goto L_0x00cc
        L_0x00c8:
            boolean r1 = r0.zzc
            if (r1 == 0) goto L_0x00cd
        L_0x00cc:
            return r8
        L_0x00cd:
            boolean r1 = r0.zzc
            if (r1 == 0) goto L_0x0139
            long r1 = r0.zze
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x00d8
            goto L_0x0139
        L_0x00d8:
            com.google.android.gms.internal.ads.zzdj r1 = r0.zzk
            long r1 = r1.zzc()
            com.google.android.gms.internal.ads.zzabw r3 = r0.zzb
            long r13 = r30.zza
            r17 = 1000(0x3e8, double:4.94E-321)
            long r13 = r13 * r17
            long r13 = r13 + r1
            long r13 = r3.zza(r13)
            r10.zzb = r13
            long r13 = r30.zzb
            long r13 = r13 - r1
            long r13 = r13 / r17
            r10.zza = r13
            long r1 = r0.zzh
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 == 0) goto L_0x0106
            boolean r1 = r0.zzi
            if (r1 != 0) goto L_0x0106
            r13 = 1
            goto L_0x0107
        L_0x0106:
            r13 = r8
        L_0x0107:
            com.google.android.gms.internal.ads.zzabr r1 = r0.zza
            long r2 = r30.zza
            r4 = r22
            r6 = r24
            r8 = r29
            r14 = r9
            r9 = r13
            boolean r1 = r1.zzbc(r2, r4, r6, r8, r9)
            if (r1 == 0) goto L_0x011c
            return r12
        L_0x011c:
            long r1 = r30.zza
            int r1 = (r1 > r15 ? 1 : (r1 == r15 ? 0 : -1))
            if (r1 >= 0) goto L_0x012a
            if (r29 != 0) goto L_0x012a
            if (r13 == 0) goto L_0x0129
            return r11
        L_0x0129:
            return r14
        L_0x012a:
            long r1 = r30.zza
            r3 = 50000(0xc350, double:2.47033E-319)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x0137
            r1 = 5
            return r1
        L_0x0137:
            r1 = 1
            return r1
        L_0x0139:
            r1 = 5
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzabs.zza(long, long, long, long, boolean, boolean, com.google.android.gms.internal.ads.zzabq):int");
    }

    public final void zzb() {
        if (this.zzd == 0) {
            this.zzd = 1;
        }
    }

    public final void zzc(boolean z) {
        this.zzi = z;
        this.zzh = -9223372036854775807L;
    }

    public final void zzd() {
        this.zzc = true;
        this.zzf = zzex.zzs(this.zzk.zzb());
        this.zzb.zzg();
    }

    public final void zze() {
        this.zzc = false;
        this.zzh = -9223372036854775807L;
        this.zzb.zzh();
    }

    public final void zzf(int i) {
        if (i == 0) {
            this.zzd = 1;
        } else if (i != 1) {
            zzo(2);
        } else {
            this.zzd = 0;
        }
    }

    public final void zzg() {
        this.zzb.zzf();
        this.zzg = -9223372036854775807L;
        this.zze = -9223372036854775807L;
        zzo(1);
        this.zzh = -9223372036854775807L;
    }

    public final void zzh(int i) {
        this.zzb.zzj(i);
    }

    public final void zzi(zzdj zzdj) {
        this.zzk = zzdj;
    }

    public final void zzj(float f) {
        this.zzb.zzc(f);
    }

    public final void zzk(Surface surface) {
        this.zzl = surface != null;
        this.zzm = false;
        this.zzb.zzi(surface);
        zzo(1);
    }

    public final void zzl(float f) {
        zzdd.zzd(f > 0.0f);
        if (f != this.zzj) {
            this.zzj = f;
            this.zzb.zze(f);
        }
    }

    public final boolean zzm(boolean z) {
        if (z && (this.zzd == 3 || (!this.zzl && this.zzm))) {
            this.zzh = -9223372036854775807L;
            return true;
        } else if (this.zzh == -9223372036854775807L) {
            return false;
        } else {
            if (this.zzk.zzb() < this.zzh) {
                return true;
            }
            this.zzh = -9223372036854775807L;
            return false;
        }
    }

    public final boolean zzn() {
        int i = this.zzd;
        this.zzd = 3;
        this.zzf = zzex.zzs(this.zzk.zzb());
        return i != 3;
    }
}
