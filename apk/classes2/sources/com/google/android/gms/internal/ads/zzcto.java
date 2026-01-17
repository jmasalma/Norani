package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzcto implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;

    private zzcto(zzhha zzhha, zzhha zzhha2) {
        this.zza = zzhha;
        this.zzb = zzhha2;
    }

    public static zzcto zza(zzhha zzhha, zzhha zzhha2) {
        return new zzcto(zzhha, zzhha2);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzddv zzddv = new zzddv((zzdam) this.zza.zzb(), (Executor) this.zzb.zzb());
        zzddv zzddv2 = zzddv;
        return zzddv;
    }
}
