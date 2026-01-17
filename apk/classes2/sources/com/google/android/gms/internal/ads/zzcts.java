package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzcts implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;

    private zzcts(zzhha zzhha, zzhha zzhha2) {
        this.zza = zzhha;
        this.zzb = zzhha2;
    }

    public static zzcts zza(zzhha zzhha, zzhha zzhha2) {
        return new zzcts(zzhha, zzhha2);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzddv zzddv = new zzddv((zzdam) this.zza.zzb(), (Executor) this.zzb.zzb());
        zzddv zzddv2 = zzddv;
        return zzddv;
    }
}
