package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzg;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzbyc implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;

    private zzbyc(zzhha zzhha, zzhha zzhha2) {
        this.zza = zzhha;
        this.zzb = zzhha2;
    }

    public static zzbyc zza(zzhha zzhha, zzhha zzhha2) {
        return new zzbyc(zzhha, zzhha2);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzbyb((Context) this.zza.zzb(), (zzg) this.zzb.zzb());
    }
}
