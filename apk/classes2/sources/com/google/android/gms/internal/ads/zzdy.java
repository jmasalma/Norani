package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzdy {
    public final Object zza;
    private zzt zzb = new zzt();
    private boolean zzc;
    private boolean zzd;

    public zzdy(Object obj) {
        this.zza = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.zza.equals(((zzdy) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final void zza(int i, zzdw zzdw) {
        if (!this.zzd) {
            if (i != -1) {
                this.zzb.zza(i);
            }
            this.zzc = true;
            zzdw.zza(this.zza);
        }
    }

    public final void zzb(zzdx zzdx) {
        if (!this.zzd && this.zzc) {
            zzv zzb2 = this.zzb.zzb();
            this.zzb = new zzt();
            this.zzc = false;
            zzdx.zza(this.zza, zzb2);
        }
    }

    public final void zzc(zzdx zzdx) {
        this.zzd = true;
        if (this.zzc) {
            this.zzc = false;
            zzdx.zza(this.zza, this.zzb.zzb());
        }
    }
}
