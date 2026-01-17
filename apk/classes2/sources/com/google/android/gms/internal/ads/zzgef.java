package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzgef {
    public static zzgdy zza(ExecutorService executorService) {
        zzgdy zzgdy;
        if (executorService instanceof zzgdy) {
            return (zzgdy) executorService;
        }
        if (executorService instanceof ScheduledExecutorService) {
            zzgdy = new zzgee((ScheduledExecutorService) executorService);
        } else {
            zzgdy = new zzgeb(executorService);
        }
        return zzgdy;
    }

    public static zzgdz zzb(ScheduledExecutorService scheduledExecutorService) {
        return new zzgee(scheduledExecutorService);
    }

    public static Executor zzc() {
        return zzgdb.INSTANCE;
    }

    static Executor zzd(Executor executor, zzgcb zzgcb) {
        executor.getClass();
        return executor == zzgdb.INSTANCE ? executor : new zzgea(executor, zzgcb);
    }

    static /* synthetic */ void zze(Executor executor, zzgcb zzgcb, Runnable runnable) {
        try {
            executor.execute(runnable);
        } catch (RejectedExecutionException e) {
            zzgcb.zzd(e);
        }
    }
}
