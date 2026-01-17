package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzgee extends zzgeb implements AutoCloseable, zzgdz {
    final ScheduledExecutorService zza;

    zzgee(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        scheduledExecutorService.getClass();
        ScheduledExecutorService scheduledExecutorService2 = scheduledExecutorService;
        this.zza = scheduledExecutorService;
    }

    public final /* synthetic */ void close() {
        if (this != ForkJoinPool.commonPool() && !isTerminated()) {
            shutdown();
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    z = awaitTermination(1, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z2) {
                        shutdownNow();
                    }
                    z2 = true;
                }
            }
            if (z2) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        ScheduledExecutorService scheduledExecutorService = this.zza;
        zzgeo zze = zzgeo.zze(runnable, (Object) null);
        return new zzgec(zze, scheduledExecutorService.schedule(zze, j, timeUnit));
    }

    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        zzged zzged = new zzged(runnable);
        return new zzgec(zzged, this.zza.scheduleAtFixedRate(zzged, j, j2, timeUnit));
    }

    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        zzged zzged = new zzged(runnable);
        return new zzgec(zzged, this.zza.scheduleWithFixedDelay(zzged, j, j2, timeUnit));
    }

    /* renamed from: zzc */
    public final zzgdx schedule(Callable callable, long j, TimeUnit timeUnit) {
        zzgeo zzgeo = new zzgeo(callable);
        return new zzgec(zzgeo, this.zza.schedule(zzgeo, j, timeUnit));
    }
}
