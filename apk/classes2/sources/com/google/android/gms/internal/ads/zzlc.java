package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzlc {
    public final zzvf zza;
    public final Object zzb;
    public final zzwz[] zzc;
    public boolean zzd;
    public boolean zze;
    public boolean zzf;
    public zzld zzg;
    public boolean zzh;
    private final boolean[] zzi;
    private final zzmd[] zzj;
    private final zzzd zzk;
    private final zzlr zzl;
    private zzlc zzm;
    private zzxk zzn = zzxk.zza;
    private zzze zzo;
    private long zzp;

    public zzlc(zzmd[] zzmdArr, long j, zzzd zzzd, zzzm zzzm, zzlr zzlr, zzld zzld, zzze zzze, long j2) {
        this.zzj = zzmdArr;
        this.zzp = j;
        this.zzk = zzzd;
        this.zzl = zzlr;
        this.zzb = zzld.zza.zza;
        this.zzg = zzld;
        this.zzo = zzze;
        this.zzc = new zzwz[2];
        this.zzi = new boolean[2];
        zzvh zzvh = zzld.zza;
        long j3 = zzld.zzb;
        long j4 = zzld.zzd;
        zzvf zzp2 = zzlr.zzp(zzvh, zzzm, j3);
        this.zza = j4 != -9223372036854775807L ? new zzul(zzp2, true, 0, j4) : zzp2;
    }

    private final void zzu() {
        if (zzw()) {
            int i = 0;
            while (true) {
                zzze zzze = this.zzo;
                if (i < zzze.zza) {
                    zzze.zzb(i);
                    zzyw zzyw = this.zzo.zzc[i];
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    private final void zzv() {
        if (zzw()) {
            int i = 0;
            while (true) {
                zzze zzze = this.zzo;
                if (i < zzze.zza) {
                    zzze.zzb(i);
                    zzyw zzyw = this.zzo.zzc[i];
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    private final boolean zzw() {
        return this.zzm == null;
    }

    public final long zza(zzze zzze, long j, boolean z) {
        return zzb(zzze, j, false, new boolean[2]);
    }

    public final long zzb(zzze zzze, long j, boolean z, boolean[] zArr) {
        zzmd[] zzmdArr;
        zzze zzze2 = zzze;
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= zzze2.zza) {
                break;
            }
            boolean[] zArr2 = this.zzi;
            if (z || !zzze2.zza(this.zzo, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        int i2 = 0;
        while (true) {
            zzmdArr = this.zzj;
            if (i2 >= 2) {
                break;
            }
            zzmdArr[i2].zzb();
            i2++;
        }
        zzu();
        this.zzo = zzze2;
        zzv();
        zzvf zzvf = this.zza;
        zzyw[] zzywArr = zzze2.zzc;
        boolean[] zArr3 = this.zzi;
        zzwz[] zzwzArr = this.zzc;
        long zzf2 = zzvf.zzf(zzywArr, zArr3, zzwzArr, zArr, j);
        for (int i3 = 0; i3 < 2; i3++) {
            zzmdArr[i3].zzb();
        }
        this.zzf = false;
        for (int i4 = 0; i4 < 2; i4++) {
            if (zzwzArr[i4] != null) {
                zzdd.zzf(zzze2.zzb(i4));
                zzmdArr[i4].zzb();
                this.zzf = true;
            } else {
                zzdd.zzf(zzywArr[i4] == null);
            }
        }
        return zzf2;
    }

    public final long zzc() {
        if (!this.zze) {
            return this.zzg.zzb;
        }
        long zzb2 = this.zzf ? this.zza.zzb() : Long.MIN_VALUE;
        return zzb2 == Long.MIN_VALUE ? this.zzg.zze : zzb2;
    }

    public final long zzd() {
        if (!this.zze) {
            return 0;
        }
        return this.zza.zzc();
    }

    public final long zze() {
        return this.zzp;
    }

    public final long zzf() {
        return this.zzg.zzb + this.zzp;
    }

    public final zzlc zzg() {
        return this.zzm;
    }

    public final zzxk zzh() {
        return this.zzn;
    }

    public final zzze zzi() {
        return this.zzo;
    }

    public final zzze zzj(float f, zzbl zzbl, boolean z) throws zzin {
        zzxk zzxk = this.zzn;
        zzvh zzvh = this.zzg.zza;
        zzzd zzzd = this.zzk;
        zzmd[] zzmdArr = this.zzj;
        zzze zzo2 = zzzd.zzo(zzmdArr, zzxk, zzvh, zzbl);
        for (int i = 0; i < zzo2.zza; i++) {
            boolean z2 = true;
            if (zzo2.zzb(i)) {
                if (zzo2.zzc[i] == null) {
                    zzmdArr[i].zzb();
                    z2 = false;
                }
                zzdd.zzf(z2);
            } else {
                if (zzo2.zzc[i] != null) {
                    z2 = false;
                }
                zzdd.zzf(z2);
            }
        }
        for (zzyw zzyw : zzo2.zzc) {
        }
        return zzo2;
    }

    public final void zzk(zzla zzla) {
        zzdd.zzf(zzw());
        this.zza.zzo(zzla);
    }

    public final void zzl(float f, zzbl zzbl, boolean z) throws zzin {
        this.zze = true;
        this.zzn = this.zza.zzg();
        zzze zzj2 = zzj(f, zzbl, z);
        zzld zzld = this.zzg;
        long j = zzld.zzb;
        long j2 = zzld.zze;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0, j2 - 1);
        }
        long zza2 = zza(zzj2, j, false);
        long j3 = this.zzp;
        zzld zzld2 = this.zzg;
        this.zzp = j3 + (zzld2.zzb - zza2);
        this.zzg = zzld2.zzb(zza2);
    }

    public final void zzm(zzve zzve, long j) {
        this.zzd = true;
        this.zza.zzk(zzve, j);
    }

    public final void zzn(long j) {
        zzdd.zzf(zzw());
        if (this.zze) {
            this.zza.zzm(j - this.zzp);
        }
    }

    public final void zzo() {
        zzu();
        zzvf zzvf = this.zza;
        try {
            boolean z = zzvf instanceof zzul;
            zzlr zzlr = this.zzl;
            if (z) {
                zzlr.zzi(((zzul) zzvf).zza);
            } else {
                zzlr.zzi(zzvf);
            }
        } catch (RuntimeException e) {
            zzea.zzd("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    public final void zzp(zzlc zzlc) {
        if (zzlc != this.zzm) {
            zzu();
            this.zzm = zzlc;
            zzv();
        }
    }

    public final void zzq(long j) {
        this.zzp = j;
    }

    public final void zzr() {
        zzvf zzvf = this.zza;
        if (zzvf instanceof zzul) {
            long j = this.zzg.zzd;
            if (j == -9223372036854775807L) {
                j = Long.MIN_VALUE;
            }
            ((zzul) zzvf).zzn(0, j);
        }
    }

    public final boolean zzs() {
        if (!this.zze) {
            return false;
        }
        if (this.zzf) {
            return this.zza.zzb() == Long.MIN_VALUE;
        }
        return true;
    }

    public final boolean zzt() {
        if (!this.zze) {
            return false;
        }
        if (!zzs()) {
            return zzc() - this.zzg.zzb >= -9223372036854775807L;
        }
        return true;
    }
}
