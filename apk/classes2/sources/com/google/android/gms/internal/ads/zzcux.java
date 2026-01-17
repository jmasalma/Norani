package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzcux implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;

    private zzcux(zzhha zzhha, zzhha zzhha2, zzhha zzhha3) {
        this.zza = zzhha;
        this.zzb = zzhha2;
    }

    public static zzcux zza(zzhha zzhha, zzhha zzhha2, zzhha zzhha3) {
        return new zzcux(zzhha, zzhha2, zzhha3);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfca zzc = ((zzcrr) this.zzb).zzc();
        zzfca zzfca = zzc;
        zzbtv zzbtv = new zzbtv();
        zzbtv zzbtv2 = zzbtv;
        zzbtv zzbtv3 = zzbtv;
        return new zzcuw((Context) this.zza.zzb(), zzc, zzbtv);
    }
}
