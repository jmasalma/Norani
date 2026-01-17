package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdte implements zzhgr {
    private final zzhha zza;

    private zzdte(zzdsy zzdsy, zzhha zzhha, zzhha zzhha2) {
        this.zza = zzhha;
    }

    public static zzdte zza(zzdsy zzdsy, zzhha zzhha, zzhha zzhha2) {
        return new zzdte(zzdsy, zzhha, zzhha2);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Set zzf = zzdsy.zzf((zzdti) this.zza.zzb(), zzffu.zzc());
        zzhgz.zzb(zzf);
        Set set = zzf;
        return zzf;
    }
}
