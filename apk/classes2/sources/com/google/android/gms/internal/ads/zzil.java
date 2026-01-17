package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbcj;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzil implements zzlb {
    private final zzml zza;
    private final zzik zzb;
    private zzma zzc;
    private zzlb zzd;
    private boolean zze = true;
    private boolean zzf;

    public zzil(zzik zzik, zzdj zzdj) {
        this.zzb = zzik;
        this.zza = new zzml(zzdj);
    }

    public final long zza() {
        if (this.zze) {
            return this.zza.zza();
        }
        zzlb zzlb = this.zzd;
        zzlb.getClass();
        zzlb zzlb2 = zzlb;
        return zzlb.zza();
    }

    public final long zzb(boolean z) {
        zzma zzma = this.zzc;
        if (zzma == null || zzma.zzX() || ((z && this.zzc.zzcU() != 2) || (!this.zzc.zzY() && (z || this.zzc.zzR())))) {
            this.zze = true;
            if (this.zzf) {
                this.zza.zzd();
            }
        } else {
            zzlb zzlb = this.zzd;
            zzlb.getClass();
            zzlb zzlb2 = zzlb;
            long zza2 = zzlb.zza();
            if (this.zze) {
                zzml zzml = this.zza;
                if (zza2 < zzml.zza()) {
                    zzml.zze();
                } else {
                    this.zze = false;
                    if (this.zzf) {
                        zzml.zzd();
                    }
                }
            }
            zzml zzml2 = this.zza;
            zzml2.zzb(zza2);
            zzbb zzc2 = zzlb.zzc();
            if (!zzc2.equals(zzml2.zzc())) {
                zzml2.zzg(zzc2);
                this.zzb.zzc(zzc2);
            }
        }
        return zza();
    }

    public final zzbb zzc() {
        zzlb zzlb = this.zzd;
        return zzlb != null ? zzlb.zzc() : this.zza.zzc();
    }

    public final void zzd(zzma zzma) {
        if (zzma == this.zzc) {
            this.zzd = null;
            this.zzc = null;
            this.zze = true;
        }
    }

    public final void zze(zzma zzma) throws zzin {
        zzlb zzlb;
        zzlb zzm = zzma.zzm();
        if (zzm != null && zzm != (zzlb = this.zzd)) {
            if (zzlb == null) {
                this.zzd = zzm;
                this.zzc = zzma;
                zzm.zzg(this.zza.zzc());
                return;
            }
            throw zzin.zzd(new IllegalStateException("Multiple renderer media clocks enabled."), zzbcj.zzq.zzf);
        }
    }

    public final void zzf(long j) {
        this.zza.zzb(j);
    }

    public final void zzg(zzbb zzbb) {
        zzlb zzlb = this.zzd;
        if (zzlb != null) {
            zzlb.zzg(zzbb);
            zzbb = this.zzd.zzc();
        }
        this.zza.zzg(zzbb);
    }

    public final void zzh() {
        this.zzf = true;
        this.zza.zzd();
    }

    public final void zzi() {
        this.zzf = false;
        this.zza.zze();
    }

    public final boolean zzj() {
        if (this.zze) {
            return false;
        }
        zzlb zzlb = this.zzd;
        zzlb.getClass();
        zzlb zzlb2 = zzlb;
        return zzlb.zzj();
    }
}
