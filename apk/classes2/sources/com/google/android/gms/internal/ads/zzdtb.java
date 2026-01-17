package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdtb implements zzhgr {
    private final zzhha zza;

    private zzdtb(zzdsy zzdsy, zzhha zzhha, zzhha zzhha2) {
        this.zza = zzhha;
    }

    public static zzdtb zza(zzdsy zzdsy, zzhha zzhha, zzhha zzhha2) {
        return new zzdtb(zzdsy, zzhha, zzhha2);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Set zzc = zzdsy.zzc((zzdti) this.zza.zzb(), zzffu.zzc());
        zzhgz.zzb(zzc);
        Set set = zzc;
        return zzc;
    }
}
