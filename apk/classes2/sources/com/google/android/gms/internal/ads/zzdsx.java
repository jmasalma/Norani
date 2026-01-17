package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdsx implements zzhgr {
    private final zzhha zza;

    private zzdsx(zzhha zzhha) {
        this.zza = zzhha;
    }

    public static zzdsx zza(zzhha zzhha) {
        return new zzdsx(zzhha);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdsw((Clock) this.zza.zzb());
    }
}
