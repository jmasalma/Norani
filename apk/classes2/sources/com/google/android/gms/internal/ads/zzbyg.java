package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzbyg implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;

    private zzbyg(zzhha zzhha, zzhha zzhha2) {
        this.zza = zzhha;
        this.zzb = zzhha2;
    }

    public static zzbyg zzc(zzhha zzhha, zzhha zzhha2) {
        return new zzbyg(zzhha, zzhha2);
    }

    /* renamed from: zza */
    public final zzbyf zzb() {
        return new zzbyf((Clock) this.zza.zzb(), (zzbyd) this.zzb.zzb());
    }
}
