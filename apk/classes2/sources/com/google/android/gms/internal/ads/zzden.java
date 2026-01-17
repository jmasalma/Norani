package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzden implements zzhgr {
    private final zzhha zza;

    private zzden(zzhha zzhha) {
        this.zza = zzhha;
    }

    public static zzden zza(zzhha zzhha) {
        return new zzden(zzhha);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Set zzc = ((zzhhd) this.zza).zzb();
        Set set = zzc;
        return new zzdem(zzc);
    }
}
