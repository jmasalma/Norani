package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzcpm implements zzhgr {
    private final zzhha zza;

    private zzcpm(zzcoz zzcoz, zzhha zzhha) {
        this.zza = zzhha;
    }

    public static zzcpm zza(zzcoz zzcoz, zzhha zzhha) {
        return new zzcpm(zzcoz, zzhha);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Set singleton = Collections.singleton(new zzddv((zzcqp) this.zza.zzb(), zzcaf.zzg));
        zzhgz.zzb(singleton);
        Set set = singleton;
        return singleton;
    }
}
