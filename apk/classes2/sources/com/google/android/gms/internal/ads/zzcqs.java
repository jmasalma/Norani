package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzcqs {
    private final zzcyv zza;
    private final zzdbb zzb;

    public zzcqs(zzcyv zzcyv, zzdbb zzdbb) {
        this.zza = zzcyv;
        this.zzb = zzdbb;
    }

    public final zzcyv zza() {
        return this.zza;
    }

    /* access modifiers changed from: package-private */
    public final zzdbb zzb() {
        return this.zzb;
    }

    /* access modifiers changed from: package-private */
    public final zzddv zzc() {
        zzdbb zzdbb = this.zzb;
        if (zzdbb != null) {
            return new zzddv(zzdbb, zzcaf.zzg);
        }
        return new zzddv(new zzcqr(this), zzcaf.zzg);
    }
}
