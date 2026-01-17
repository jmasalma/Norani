package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzcjc implements zzdtm {
    private final Long zza;
    private final String zzb;
    private final zzcio zzc;
    private final zzcje zzd;

    zzcjc(zzcio zzcio, zzcje zzcje, Long l, String str) {
        this.zzc = zzcio;
        this.zzd = zzcje;
        this.zza = l;
        this.zzb = str;
    }

    public final zzdtw zza() {
        zzcje zzcje = this.zzd;
        return zzdtx.zza(this.zza.longValue(), zzcje.zze, zzcje.zzc(), this.zzc, this.zzb);
    }

    public final zzdua zzb() {
        zzcje zzcje = this.zzd;
        return zzdub.zza(this.zza.longValue(), zzcje.zze, zzcje.zzc(), this.zzc, this.zzb);
    }
}
