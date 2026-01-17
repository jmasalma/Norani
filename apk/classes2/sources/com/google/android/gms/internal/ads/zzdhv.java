package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdhv implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;

    private zzdhv(zzhha zzhha, zzhha zzhha2) {
        this.zza = zzhha;
        this.zzb = zzhha2;
    }

    public static zzdhv zza(zzhha zzhha, zzhha zzhha2) {
        return new zzdhv(zzhha, zzhha2);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfca zzc = ((zzcrr) this.zzb).zzc();
        zzfca zzfca = zzc;
        zzddx zzddx = new zzddx((Context) this.zza.zzb(), new HashSet(), zzc);
        zzddx zzddx2 = zzddx;
        return zzddx;
    }
}
