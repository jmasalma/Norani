package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzddy implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;
    private final zzhha zzc;

    private zzddy(zzhha zzhha, zzhha zzhha2, zzhha zzhha3) {
        this.zza = zzhha;
        this.zzb = zzhha2;
        this.zzc = zzhha3;
    }

    public static zzddy zza(zzhha zzhha, zzhha zzhha2, zzhha zzhha3) {
        return new zzddy(zzhha, zzhha2, zzhha3);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Set zzc2 = ((zzhhd) this.zzb).zzb();
        Set set = zzc2;
        zzfca zzc3 = ((zzcrr) this.zzc).zzc();
        zzfca zzfca = zzc3;
        return new zzddx((Context) this.zza.zzb(), zzc2, zzc3);
    }
}
