package com.google.android.gms.internal.ads;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzfgb implements zzhgr {
    private final zzhha zza;

    private zzfgb(zzhha zzhha) {
        this.zza = zzhha;
    }

    public static zzfgb zza(zzhha zzhha) {
        return new zzfgb(zzhha);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfrv.zza();
        ScheduledExecutorService unconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, (ThreadFactory) this.zza.zzb()));
        zzhgz.zzb(unconfigurableScheduledExecutorService);
        ScheduledExecutorService scheduledExecutorService = unconfigurableScheduledExecutorService;
        return unconfigurableScheduledExecutorService;
    }
}
