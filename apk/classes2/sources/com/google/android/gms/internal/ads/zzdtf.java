package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdtf implements zzhgr {
    private final zzhha zza;

    private zzdtf(zzdsy zzdsy, zzhha zzhha, zzhha zzhha2) {
        this.zza = zzhha;
    }

    public static zzdtf zza(zzdsy zzdsy, zzhha zzhha, zzhha zzhha2) {
        return new zzdtf(zzdsy, zzhha, zzhha2);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Set zzg = zzdsy.zzg((zzdti) this.zza.zzb(), zzffu.zzc());
        zzhgz.zzb(zzg);
        Set set = zzg;
        return zzg;
    }
}
