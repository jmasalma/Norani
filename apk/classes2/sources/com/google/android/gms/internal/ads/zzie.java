package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzie {
    public final String zza;
    public final zzz zzb;
    public final zzz zzc;
    public final int zzd;
    public final int zze;

    public zzie(String str, zzz zzz, zzz zzz2, int i, int i2) {
        boolean z = true;
        if (i != 0) {
            if (i2 == 0) {
                i2 = 0;
            } else {
                z = false;
            }
        }
        zzdd.zzd(z);
        zzdd.zzc(str);
        this.zza = str;
        zzz zzz3 = zzz;
        this.zzb = zzz;
        zzz2.getClass();
        zzz zzz4 = zzz2;
        this.zzc = zzz2;
        this.zzd = i;
        this.zze = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzie zzie = (zzie) obj;
            return this.zzd == zzie.zzd && this.zze == zzie.zze && this.zza.equals(zzie.zza) && this.zzb.equals(zzie.zzb) && this.zzc.equals(zzie.zzc);
        }
    }

    public final int hashCode() {
        return ((((((((this.zzd + 527) * 31) + this.zze) * 31) + this.zza.hashCode()) * 31) + this.zzb.hashCode()) * 31) + this.zzc.hashCode();
    }
}
