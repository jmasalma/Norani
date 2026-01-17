package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdkq implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;

    private zzdkq(zzhha zzhha, zzhha zzhha2) {
        this.zza = zzhha;
        this.zzb = zzhha2;
    }

    public static zzdkq zza(zzhha zzhha, zzhha zzhha2) {
        return new zzdkq(zzhha, zzhha2);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzdny zzc = ((zzdhu) this.zzb).zzc();
        zzdny zzdny = zzc;
        return new zzdkp((zzdpj) this.zza.zzb(), zzc);
    }
}
