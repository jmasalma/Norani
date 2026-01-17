package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdta implements zzhgr {
    private final zzhha zza;

    private zzdta(zzdsy zzdsy, zzhha zzhha, zzhha zzhha2) {
        this.zza = zzhha;
    }

    public static zzdta zza(zzdsy zzdsy, zzhha zzhha, zzhha zzhha2) {
        return new zzdta(zzdsy, zzhha, zzhha2);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Set zzb = zzdsy.zzb((zzdti) this.zza.zzb(), zzffu.zzc());
        zzhgz.zzb(zzb);
        Set set = zzb;
        return zzb;
    }
}
