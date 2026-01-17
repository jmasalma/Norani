package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdtc implements zzhgr {
    private final zzdsy zza;
    private final zzhha zzb;

    private zzdtc(zzdsy zzdsy, zzhha zzhha, zzhha zzhha2) {
        this.zza = zzdsy;
        this.zzb = zzhha;
    }

    public static zzdtc zza(zzdsy zzdsy, zzhha zzhha, zzhha zzhha2) {
        return new zzdtc(zzdsy, zzhha, zzhha2);
    }

    public static Set zzc(zzdsy zzdsy, zzdti zzdti, Executor executor) {
        Set zzd = zzdsy.zzd(zzdti, executor);
        zzhgz.zzb(zzd);
        Set set = zzd;
        return zzd;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        return zzc(this.zza, (zzdti) this.zzb.zzb(), zzffu.zzc());
    }
}
