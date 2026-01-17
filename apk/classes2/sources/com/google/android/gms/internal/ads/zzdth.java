package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdth implements zzhgr {
    private final zzhha zza;

    private zzdth(zzdsy zzdsy, zzhha zzhha, zzhha zzhha2) {
        this.zza = zzhha;
    }

    public static zzdth zza(zzdsy zzdsy, zzhha zzhha, zzhha zzhha2) {
        return new zzdth(zzdsy, zzhha, zzhha2);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Set zzi = zzdsy.zzi((zzdti) this.zza.zzb(), zzffu.zzc());
        zzhgz.zzb(zzi);
        Set set = zzi;
        return zzi;
    }
}
