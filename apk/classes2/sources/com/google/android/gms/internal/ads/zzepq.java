package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzepq implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;

    private zzepq(zzhha zzhha, zzhha zzhha2) {
        this.zza = zzhha;
        this.zzb = zzhha2;
    }

    public static zzepq zza(zzhha zzhha, zzhha zzhha2) {
        return new zzepq(zzhha, zzhha2);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfbz zzfbz = new zzfbz((Clock) this.zza.zzb(), (zzdsj) this.zzb.zzb());
        zzfbz zzfbz2 = zzfbz;
        return zzfbz;
    }
}
