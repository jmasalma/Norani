package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzvc extends zzxm {
    private final boolean zzb;
    private final zzbk zzc;
    private final zzbj zzd;
    private zzva zze;
    private zzuz zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;

    public zzvc(zzvj zzvj, boolean z) {
        super(zzvj);
        boolean z2;
        if (z) {
            zzvj.zzv();
            z2 = true;
        } else {
            z2 = false;
        }
        this.zzb = z2;
        this.zzc = new zzbk();
        this.zzd = new zzbj();
        zzvj.zzM();
        this.zze = zzva.zzq(zzvj.zzJ());
    }

    private final Object zzK(Object obj) {
        return (this.zze.zze == null || !obj.equals(zzva.zzc)) ? obj : this.zze.zze;
    }

    @RequiresNonNull({"unpreparedMaskingMediaPeriod"})
    private final boolean zzL(long j) {
        zzuz zzuz = this.zzf;
        int zza = this.zze.zza(zzuz.zza.zza);
        if (zza == -1) {
            return false;
        }
        zzva zzva = this.zze;
        zzbj zzbj = this.zzd;
        zzva.zzd(zza, zzbj, false);
        long j2 = zzbj.zzd;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0, j2 - 1);
        }
        zzuz.zzs(j);
        return true;
    }

    public final zzbl zzC() {
        return this.zze;
    }

    /* access modifiers changed from: protected */
    public final zzvh zzD(zzvh zzvh) {
        Object zzs = this.zze.zze;
        Object obj = zzvh.zza;
        if (zzs != null && this.zze.zze.equals(obj)) {
            obj = zzva.zzc;
        }
        return zzvh.zza(obj);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005a, code lost:
        if (r6 != 0) goto L_0x005e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzE(com.google.android.gms.internal.ads.zzbl r12) {
        /*
            r11 = this;
            boolean r0 = r11.zzh
            r1 = 0
            if (r0 == 0) goto L_0x001a
            com.google.android.gms.internal.ads.zzva r0 = r11.zze
            com.google.android.gms.internal.ads.zzva r12 = r0.zzp(r12)
            r11.zze = r12
            com.google.android.gms.internal.ads.zzuz r12 = r11.zzf
            if (r12 == 0) goto L_0x0097
            long r2 = r12.zzn()
            r11.zzL(r2)
            goto L_0x0097
        L_0x001a:
            boolean r0 = r12.zzo()
            if (r0 == 0) goto L_0x0036
            boolean r0 = r11.zzi
            if (r0 == 0) goto L_0x002b
            com.google.android.gms.internal.ads.zzva r0 = r11.zze
            com.google.android.gms.internal.ads.zzva r12 = r0.zzp(r12)
            goto L_0x0033
        L_0x002b:
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzbk.zza
            java.lang.Object r2 = com.google.android.gms.internal.ads.zzva.zzc
            com.google.android.gms.internal.ads.zzva r12 = com.google.android.gms.internal.ads.zzva.zzr(r12, r0, r2)
        L_0x0033:
            r11.zze = r12
            goto L_0x0097
        L_0x0036:
            com.google.android.gms.internal.ads.zzbk r3 = r11.zzc
            r0 = 0
            r4 = 0
            r12.zze(r0, r3, r4)
            java.lang.Object r8 = r3.zzb
            com.google.android.gms.internal.ads.zzuz r2 = r11.zzf
            if (r2 == 0) goto L_0x005d
            long r6 = r2.zzq()
            com.google.android.gms.internal.ads.zzva r9 = r11.zze
            com.google.android.gms.internal.ads.zzbj r10 = r11.zzd
            com.google.android.gms.internal.ads.zzvh r2 = r2.zza
            java.lang.Object r2 = r2.zza
            r9.zzn(r2, r10)
            com.google.android.gms.internal.ads.zzva r2 = r11.zze
            r2.zze(r0, r3, r4)
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x005d
            goto L_0x005e
        L_0x005d:
            r6 = r4
        L_0x005e:
            com.google.android.gms.internal.ads.zzbj r4 = r11.zzd
            r5 = 0
            r2 = r12
            android.util.Pair r0 = r2.zzl(r3, r4, r5, r6)
            java.lang.Object r2 = r0.first
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r3 = r0.longValue()
            boolean r0 = r11.zzi
            if (r0 == 0) goto L_0x007b
            com.google.android.gms.internal.ads.zzva r0 = r11.zze
            com.google.android.gms.internal.ads.zzva r12 = r0.zzp(r12)
            goto L_0x007f
        L_0x007b:
            com.google.android.gms.internal.ads.zzva r12 = com.google.android.gms.internal.ads.zzva.zzr(r12, r8, r2)
        L_0x007f:
            r11.zze = r12
            com.google.android.gms.internal.ads.zzuz r12 = r11.zzf
            if (r12 == 0) goto L_0x0097
            boolean r0 = r11.zzL(r3)
            if (r0 == 0) goto L_0x0097
            com.google.android.gms.internal.ads.zzvh r12 = r12.zza
            java.lang.Object r0 = r12.zza
            java.lang.Object r0 = r11.zzK(r0)
            com.google.android.gms.internal.ads.zzvh r1 = r12.zza(r0)
        L_0x0097:
            r12 = 1
            r11.zzi = r12
            r11.zzh = r12
            com.google.android.gms.internal.ads.zzva r12 = r11.zze
            r11.zzo(r12)
            if (r1 == 0) goto L_0x00ae
            com.google.android.gms.internal.ads.zzuz r12 = r11.zzf
            r12.getClass()
            r0 = r12
            com.google.android.gms.internal.ads.zzuz r0 = (com.google.android.gms.internal.ads.zzuz) r0
            r12.zzr(r1)
        L_0x00ae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzvc.zzE(com.google.android.gms.internal.ads.zzbl):void");
    }

    public final void zzF() {
        if (!this.zzb) {
            this.zzg = true;
            zzB((Object) null, this.zza);
        }
    }

    public final void zzG(zzvf zzvf) {
        ((zzuz) zzvf).zzt();
        if (zzvf == this.zzf) {
            this.zzf = null;
        }
    }

    /* renamed from: zzH */
    public final zzuz zzI(zzvh zzvh, zzzm zzzm, long j) {
        zzuz zzuz = new zzuz(zzvh, zzzm, j);
        zzuz.zzu(this.zza);
        if (this.zzh) {
            zzuz.zzr(zzvh.zza(zzK(zzvh.zza)));
        } else {
            this.zzf = zzuz;
            if (!this.zzg) {
                this.zzg = true;
                zzB((Object) null, this.zza);
            }
        }
        return zzuz;
    }

    public final void zzq() {
        this.zzh = false;
        this.zzg = false;
        super.zzq();
    }

    public final void zzt(zzap zzap) {
        if (this.zzi) {
            this.zze = this.zze.zzp(new zzxi(this.zze.zzb, zzap));
        } else {
            this.zze = zzva.zzq(zzap);
        }
        this.zza.zzt(zzap);
    }
}
