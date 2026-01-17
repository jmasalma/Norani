package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdsn implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;
    private final zzhha zzc;

    private zzdsn(zzhha zzhha, zzhha zzhha2, zzhha zzhha3) {
        this.zza = zzhha;
        this.zzb = zzhha2;
        this.zzc = zzhha3;
    }

    public static zzdsn zza(zzhha zzhha, zzhha zzhha2, zzhha zzhha3) {
        return new zzdsn(zzhha, zzhha2, zzhha3);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Set zzc2 = ((zzhhd) this.zzb).zzb();
        Set set = zzc2;
        return new zzdsm((zzdsd) this.zza.zzb(), zzc2, (Clock) this.zzc.zzb());
    }
}
