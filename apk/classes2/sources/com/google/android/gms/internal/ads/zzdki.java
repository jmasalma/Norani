package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdki implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;
    private final zzhha zzc;
    private final zzhha zzd;

    private zzdki(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4) {
        this.zza = zzhha;
        this.zzb = zzhha2;
        this.zzc = zzhha3;
        this.zzd = zzhha4;
    }

    public static zzdki zza(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4) {
        return new zzdki(zzhha, zzhha2, zzhha3, zzhha4);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzdny zzc2 = ((zzdhu) this.zzb).zzc();
        zzdny zzdny = zzc2;
        zzdjb zzc3 = ((zzdht) this.zzd).zzb();
        zzdjb zzdjb = zzc3;
        return new zzdkh((zzdpj) this.zza.zzb(), zzc2, (zzcnx) this.zzc.zzb(), zzc3);
    }
}
