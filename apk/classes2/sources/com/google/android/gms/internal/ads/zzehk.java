package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzehk {
    private zzehb zza;

    zzehk() {
    }

    private zzehk(zzehb zzehb) {
        this.zza = zzehb;
    }

    public static zzehk zzb(zzehb zzehb) {
        return new zzehk(zzehb);
    }

    public final zzehb zza(Clock clock, zzehd zzehd, zzedr zzedr, zzfjy zzfjy) {
        zzehb zzehb = this.zza;
        return zzehb != null ? zzehb : new zzehb(clock, zzehd, zzedr, zzfjy);
    }
}
