package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdtg implements zzhgr {
    private final zzhha zza;

    private zzdtg(zzdsy zzdsy, zzhha zzhha, zzhha zzhha2) {
        this.zza = zzhha;
    }

    public static zzdtg zza(zzdsy zzdsy, zzhha zzhha, zzhha zzhha2) {
        return new zzdtg(zzdsy, zzhha, zzhha2);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Set zzh = zzdsy.zzh((zzdti) this.zza.zzb(), zzffu.zzc());
        zzhgz.zzb(zzh);
        Set set = zzh;
        return zzh;
    }
}
