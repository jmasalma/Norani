package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdnj implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;
    private final zzhha zzc;
    private final zzhha zzd;

    private zzdnj(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4) {
        this.zza = zzhha;
        this.zzb = zzhha2;
        this.zzc = zzhha3;
        this.zzd = zzhha4;
    }

    public static zzdnj zza(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4) {
        return new zzdnj(zzhha, zzhha2, zzhha3, zzhha4);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        String zzc2 = ((zzcrs) this.zza).zzc();
        String str = zzc2;
        zzdit zza2 = ((zzdjm) this.zzc).zza();
        zzdit zzdit = zza2;
        return new zzdni(zzc2, (zzdio) this.zzb.zzb(), zza2, (zzdsj) this.zzd.zzb());
    }
}
