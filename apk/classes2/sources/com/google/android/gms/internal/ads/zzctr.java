package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzctr implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;

    private zzctr(zzhha zzhha, zzhha zzhha2) {
        this.zza = zzhha;
        this.zzb = zzhha2;
    }

    public static zzctr zza(zzhha zzhha, zzhha zzhha2) {
        return new zzctr(zzhha, zzhha2);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzddv zzddv = new zzddv((zzdam) this.zza.zzb(), (Executor) this.zzb.zzb());
        zzddv zzddv2 = zzddv;
        return zzddv;
    }
}
