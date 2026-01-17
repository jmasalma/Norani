package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdtd implements zzhgr {
    private final zzhha zza;

    private zzdtd(zzdsy zzdsy, zzhha zzhha, zzhha zzhha2) {
        this.zza = zzhha;
    }

    public static zzdtd zza(zzdsy zzdsy, zzhha zzhha, zzhha zzhha2) {
        return new zzdtd(zzdsy, zzhha, zzhha2);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Set zze = zzdsy.zze((zzdti) this.zza.zzb(), zzffu.zzc());
        zzhgz.zzb(zze);
        Set set = zze;
        return zze;
    }
}
