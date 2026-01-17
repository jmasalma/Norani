package com.google.android.gms.internal.ads;

import androidx.collection.SimpleArrayMap;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdjc {
    zzbhq zza;
    zzbhn zzb;
    zzbid zzc;
    zzbia zzd;
    zzbmy zze;
    final SimpleArrayMap zzf = new SimpleArrayMap();
    final SimpleArrayMap zzg = new SimpleArrayMap();

    public final zzdjc zza(zzbhn zzbhn) {
        this.zzb = zzbhn;
        return this;
    }

    public final zzdjc zzb(zzbhq zzbhq) {
        this.zza = zzbhq;
        return this;
    }

    public final zzdjc zzc(String str, zzbhw zzbhw, zzbht zzbht) {
        this.zzf.put(str, zzbhw);
        if (zzbht != null) {
            this.zzg.put(str, zzbht);
        }
        return this;
    }

    public final zzdjc zzd(zzbmy zzbmy) {
        this.zze = zzbmy;
        return this;
    }

    public final zzdjc zze(zzbia zzbia) {
        this.zzd = zzbia;
        return this;
    }

    public final zzdjc zzf(zzbid zzbid) {
        this.zzc = zzbid;
        return this;
    }

    public final zzdje zzg() {
        return new zzdje(this);
    }
}
