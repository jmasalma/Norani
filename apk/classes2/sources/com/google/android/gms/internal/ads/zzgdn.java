package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzgdn extends zzgdp {
    public static zzgdl zza(Iterable iterable) {
        return new zzgdl(false, zzfyq.zzk(iterable), (zzgdm) null);
    }

    public static zzgdl zzb(Iterable iterable) {
        return new zzgdl(true, zzfyq.zzk(iterable), (zzgdm) null);
    }

    @SafeVarargs
    public static zzgdl zzc(ListenableFuture... listenableFutureArr) {
        return new zzgdl(true, zzfyq.zzm(listenableFutureArr), (zzgdm) null);
    }

    public static ListenableFuture zzd(Iterable iterable) {
        return new zzgcv(zzfyq.zzk(iterable), true);
    }

    public static ListenableFuture zze(ListenableFuture listenableFuture, Class cls, zzfve zzfve, Executor executor) {
        int i = zzgca.zzd;
        zzgbz zzgbz = new zzgbz(listenableFuture, cls, zzfve);
        listenableFuture.addListener(zzgbz, zzgef.zzd(executor, zzgbz));
        return zzgbz;
    }

    public static ListenableFuture zzf(ListenableFuture listenableFuture, Class cls, zzgcu zzgcu, Executor executor) {
        int i = zzgca.zzd;
        zzgby zzgby = new zzgby(listenableFuture, cls, zzgcu);
        listenableFuture.addListener(zzgby, zzgef.zzd(executor, zzgby));
        return zzgby;
    }

    public static ListenableFuture zzh(Object obj) {
        if (obj == null) {
            return zzgdr.zza;
        }
        return new zzgdr(obj);
    }

    public static ListenableFuture zzi() {
        return zzgdr.zza;
    }

    public static ListenableFuture zzj(Callable callable, Executor executor) {
        zzgeo zzgeo = new zzgeo(callable);
        executor.execute(zzgeo);
        return zzgeo;
    }

    public static ListenableFuture zzk(zzgct zzgct, Executor executor) {
        zzgeo zzgeo = new zzgeo(zzgct);
        executor.execute(zzgeo);
        return zzgeo;
    }

    @SafeVarargs
    public static ListenableFuture zzl(ListenableFuture... listenableFutureArr) {
        return new zzgcv(zzfyq.zzm(listenableFutureArr), false);
    }

    public static ListenableFuture zzm(ListenableFuture listenableFuture, zzfve zzfve, Executor executor) {
        int i = zzgck.zzc;
        zzgcj zzgcj = new zzgcj(listenableFuture, zzfve);
        listenableFuture.addListener(zzgcj, zzgef.zzd(executor, zzgcj));
        return zzgcj;
    }

    public static ListenableFuture zzn(ListenableFuture listenableFuture, zzgcu zzgcu, Executor executor) {
        int i = zzgck.zzc;
        zzgci zzgci = new zzgci(listenableFuture, zzgcu);
        listenableFuture.addListener(zzgci, zzgef.zzd(executor, zzgci));
        return zzgci;
    }

    public static ListenableFuture zzo(ListenableFuture listenableFuture, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        if (listenableFuture.isDone()) {
            return listenableFuture;
        }
        return zzgel.zzf(listenableFuture, j, timeUnit, scheduledExecutorService);
    }

    public static Object zzp(Future future) throws ExecutionException {
        if (future.isDone()) {
            return zzgeq.zza(future);
        }
        throw new IllegalStateException(zzfwg.zzb("Future was expected to be done: %s", future));
    }

    public static Object zzq(Future future) {
        try {
            return zzgeq.zza(future);
        } catch (ExecutionException e) {
            if (e.getCause() instanceof Error) {
                throw new zzgdc((Error) e.getCause());
            }
            throw new zzgep(e.getCause());
        }
    }

    public static ListenableFuture zzg(Throwable th) {
        th.getClass();
        return new zzgdq(th);
    }

    public static void zzr(ListenableFuture listenableFuture, zzgdj zzgdj, Executor executor) {
        zzgdj.getClass();
        listenableFuture.addListener(new zzgdk(listenableFuture, zzgdj), executor);
    }
}
