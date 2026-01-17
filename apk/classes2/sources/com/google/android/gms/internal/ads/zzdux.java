package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdux implements zzhgr {
    private final zzhha zza;

    private zzdux(zzhha zzhha, zzhha zzhha2) {
        this.zza = zzhha;
    }

    public static zzddv zza(zzduw zzduw, Executor executor) {
        zzddv zzddv = new zzddv(zzduw, executor);
        zzddv zzddv2 = zzddv;
        return zzddv;
    }

    public static zzdux zzc(zzhha zzhha, zzhha zzhha2) {
        return new zzdux(zzhha, zzhha2);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        return zza((zzduw) this.zza.zzb(), zzffu.zzc());
    }
}
