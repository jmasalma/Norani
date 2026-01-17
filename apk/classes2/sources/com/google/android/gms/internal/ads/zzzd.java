package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public abstract class zzzd {
    private zzzc zza;
    private zzzl zzb;

    public zzmc zze() {
        throw null;
    }

    public void zzj() {
        this.zza = null;
        this.zzb = null;
    }

    public void zzk(zze zze) {
        throw null;
    }

    public boolean zzn() {
        throw null;
    }

    public abstract zzze zzo(zzmd[] zzmdArr, zzxk zzxk, zzvh zzvh, zzbl zzbl) throws zzin;

    public abstract void zzp(Object obj);

    /* access modifiers changed from: protected */
    public final zzzl zzq() {
        zzzl zzzl = this.zzb;
        zzdd.zzb(zzzl);
        zzzl zzzl2 = zzzl;
        return zzzl;
    }

    public final void zzr(zzzc zzzc, zzzl zzzl) {
        zzdd.zzf(this.zza == null);
        this.zza = zzzc;
        this.zzb = zzzl;
    }

    /* access modifiers changed from: protected */
    public final void zzs() {
        zzzc zzzc = this.zza;
        if (zzzc != null) {
            zzzc.zzm();
        }
    }
}
