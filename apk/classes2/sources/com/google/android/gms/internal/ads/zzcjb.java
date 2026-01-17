package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzcjb implements zzdtl {
    private final zzcio zza;
    private final zzcje zzb;
    private Long zzc;
    private String zzd;

    /* synthetic */ zzcjb(zzcio zzcio, zzcje zzcje, zzcjs zzcjs) {
        this.zza = zzcio;
        this.zzb = zzcje;
    }

    public final /* bridge */ /* synthetic */ zzdtl zzb(long j) {
        Long valueOf = Long.valueOf(j);
        Long l = valueOf;
        this.zzc = valueOf;
        return this;
    }

    public final zzdtm zzc() {
        zzhgz.zzc(this.zzc, Long.class);
        zzhgz.zzc(this.zzd, String.class);
        return new zzcjc(this.zza, this.zzb, this.zzc, this.zzd);
    }

    public final /* bridge */ /* synthetic */ zzdtl zza(String str) {
        str.getClass();
        String str2 = str;
        this.zzd = str;
        return this;
    }
}
