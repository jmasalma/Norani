package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
public class zzhad {
    protected volatile zzhas zza;
    private volatile zzgxz zzb;
    private volatile boolean zzc;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzhad)) {
            return false;
        }
        zzhad zzhad = (zzhad) obj;
        zzhas zzhas = this.zza;
        zzhas zzhas2 = zzhad.zza;
        if (zzhas == null && zzhas2 == null) {
            return zzb().equals(zzhad.zzb());
        }
        if (zzhas != null && zzhas2 != null) {
            return zzhas.equals(zzhas2);
        }
        if (zzhas != null) {
            zzhad.zzd(zzhas.zzbt());
            return zzhas.equals(zzhad.zza);
        }
        zzd(zzhas2.zzbt());
        return this.zza.equals(zzhas2);
    }

    public int hashCode() {
        return 1;
    }

    public final int zza() {
        if (this.zzb != null) {
            return ((zzgxw) this.zzb).zza.length;
        }
        if (this.zza != null) {
            return this.zza.zzaY();
        }
        return 0;
    }

    public final zzgxz zzb() {
        if (this.zzb != null) {
            return this.zzb;
        }
        synchronized (this) {
            if (this.zzb != null) {
                zzgxz zzgxz = this.zzb;
                return zzgxz;
            }
            if (this.zza == null) {
                this.zzb = zzgxz.zzb;
            } else {
                this.zzb = this.zza.zzaN();
            }
            zzgxz zzgxz2 = this.zzb;
            return zzgxz2;
        }
    }

    public final zzhas zzc(zzhas zzhas) {
        zzhas zzhas2 = this.zza;
        this.zzb = null;
        this.zza = zzhas;
        return zzhas2;
    }

    /* access modifiers changed from: protected */
    public final void zzd(zzhas zzhas) {
        if (this.zza == null) {
            synchronized (this) {
                if (this.zza == null) {
                    try {
                        this.zza = zzhas;
                        this.zzb = zzgxz.zzb;
                    } catch (zzgzw unused) {
                        this.zzc = true;
                        this.zza = zzhas;
                        this.zzb = zzgxz.zzb;
                    }
                }
            }
        }
    }
}
