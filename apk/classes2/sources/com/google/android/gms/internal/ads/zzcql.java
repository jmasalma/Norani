package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzcql implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;

    private zzcql(zzhha zzhha, zzhha zzhha2) {
        this.zza = zzhha;
        this.zzb = zzhha2;
    }

    public static zzcql zzc(zzhha zzhha, zzhha zzhha2) {
        return new zzcql(zzhha, zzhha2);
    }

    /* renamed from: zza */
    public final zzcqk zzb() {
        zzcfg zza2 = ((zzcpq) this.zza).zza();
        zzcfg zzcfg = zza2;
        return new zzcqk(zza2, (Executor) this.zzb.zzb());
    }
}
