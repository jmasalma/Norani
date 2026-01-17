package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdne implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;
    private final zzhha zzc;

    private zzdne(zzhha zzhha, zzhha zzhha2, zzhha zzhha3) {
        this.zza = zzhha;
        this.zzb = zzhha2;
        this.zzc = zzhha3;
    }

    public static zzdne zza(zzhha zzhha, zzhha zzhha2, zzhha zzhha3) {
        return new zzdne(zzhha, zzhha2, zzhha3);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        String zzc2 = ((zzcrs) this.zza).zzc();
        String str = zzc2;
        zzdit zza2 = ((zzdjm) this.zzc).zza();
        zzdit zzdit = zza2;
        return new zzdnd(zzc2, (zzdio) this.zzb.zzb(), zza2);
    }
}
