package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzcsx implements zzhgr {
    private final zzhha zza;

    private zzcsx(zzhha zzhha, zzhha zzhha2) {
        this.zza = zzhha;
    }

    public static zzcsx zza(zzhha zzhha, zzhha zzhha2) {
        return new zzcsx(zzhha, zzhha2);
    }

    public static zzddv zzc(zzcnc zzcnc, Executor executor) {
        zzddv zzddv = new zzddv(zzcnc, executor);
        zzddv zzddv2 = zzddv;
        return zzddv;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        return zzc((zzcnc) this.zza.zzb(), zzffu.zzc());
    }
}
