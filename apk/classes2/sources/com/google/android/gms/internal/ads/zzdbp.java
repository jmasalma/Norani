package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdbp implements zzhgr {
    private final zzhha zza;

    private zzdbp(zzhha zzhha) {
        this.zza = zzhha;
    }

    public static zzdbp zza(zzhha zzhha) {
        return new zzdbp(zzhha);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Set zzc = ((zzhhd) this.zza).zzb();
        Set set = zzc;
        return new zzdbo(zzc);
    }
}
