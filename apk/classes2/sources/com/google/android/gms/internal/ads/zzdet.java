package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdet implements zzhgr {
    private final zzhha zza;

    private zzdet(zzhha zzhha) {
        this.zza = zzhha;
    }

    public static zzdet zza(zzhha zzhha) {
        return new zzdet(zzhha);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Set zzc = ((zzhhd) this.zza).zzb();
        Set set = zzc;
        return new zzdes(zzc);
    }
}
