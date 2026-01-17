package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdfx implements zzhgr {
    private final zzhha zza;

    private zzdfx(zzhha zzhha) {
        this.zza = zzhha;
    }

    public static zzdfx zza(zzhha zzhha) {
        return new zzdfx(zzhha);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Set singleton = Collections.singleton(new zzddv((zzdgq) this.zza.zzb(), zzcaf.zzg));
        zzhgz.zzb(singleton);
        Set set = singleton;
        return singleton;
    }
}
