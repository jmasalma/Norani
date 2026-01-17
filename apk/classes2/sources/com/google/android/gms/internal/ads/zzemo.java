package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzemo implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;

    private zzemo(zzhha zzhha, zzhha zzhha2, zzhha zzhha3) {
        this.zza = zzhha;
        this.zzb = zzhha3;
    }

    public static zzemo zza(zzhha zzhha, zzhha zzhha2, zzhha zzhha3) {
        return new zzemo(zzhha, zzhha2, zzhha3);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzemm((ListenableFuture) this.zza.zzb(), zzffu.zzc(), (ScheduledExecutorService) this.zzb.zzb());
    }
}
