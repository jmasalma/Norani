package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdts implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;

    private zzdts(zzhha zzhha, zzhha zzhha2) {
        this.zza = zzhha;
        this.zzb = zzhha2;
    }

    public static zzdts zza(zzhha zzhha, zzhha zzhha2) {
        return new zzdts(zzhha, zzhha2);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzdtp zza2 = ((zzdtq) this.zzb).zzb();
        zzdtp zzdtp = zza2;
        return new zzdtr((zzdtu) this.zza.zzb(), zza2);
    }
}
