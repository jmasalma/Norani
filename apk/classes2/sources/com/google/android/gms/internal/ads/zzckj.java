package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzbo;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzckj implements zzhgr {
    private final zzhha zza;

    private zzckj(zzhha zzhha) {
        this.zza = zzhha;
    }

    public static zzckj zza(zzhha zzhha) {
        return new zzckj(zzhha);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Context zza2 = ((zzchl) this.zza).zza();
        Context context = zza2;
        zzbo zzbo = new zzbo(zza2);
        zzbo zzbo2 = zzbo;
        return zzbo;
    }
}
