package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzbo;
import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdlj implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;

    private zzdlj(zzhha zzhha, zzhha zzhha2, zzhha zzhha3) {
        this.zza = zzhha;
        this.zzb = zzhha2;
    }

    public static zzdlj zza(zzhha zzhha, zzhha zzhha2, zzhha zzhha3) {
        return new zzdlj(zzhha, zzhha2, zzhha3);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdli((zzbo) this.zza.zzb(), (Clock) this.zzb.zzb(), zzffu.zzc());
    }
}
