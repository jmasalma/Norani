package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzcpj implements zzhgr {
    private final zzcoz zza;
    private final zzhha zzb;

    private zzcpj(zzcoz zzcoz, zzhha zzhha) {
        this.zza = zzcoz;
        this.zzb = zzhha;
    }

    public static zzcpj zza(zzcoz zzcoz, zzhha zzhha) {
        return new zzcpj(zzcoz, zzhha);
    }

    public static Set zzc(zzcoz zzcoz, zzcqp zzcqp) {
        Set singleton = Collections.singleton(new zzddv(zzcqp, zzcaf.zzg));
        zzhgz.zzb(singleton);
        Set set = singleton;
        return singleton;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        return zzc(this.zza, (zzcqp) this.zzb.zzb());
    }
}
