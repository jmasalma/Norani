package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbd;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzemm implements zzeuc {
    private final ListenableFuture zza;
    private final Executor zzb;
    private final ScheduledExecutorService zzc;

    zzemm(ListenableFuture listenableFuture, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.zza = listenableFuture;
        this.zzb = executor;
        this.zzc = scheduledExecutorService;
    }

    public final int zza() {
        return 6;
    }

    public final ListenableFuture zzb() {
        zzemk zzemk = new zzemk();
        ListenableFuture listenableFuture = this.zza;
        Executor executor = this.zzb;
        ListenableFuture zzn = zzgdn.zzn(listenableFuture, zzemk, executor);
        zzbcv zzbcv = zzbde.zzmS;
        if (((Integer) zzbd.zzc().zzb(zzbcv)).intValue() > 0) {
            zzn = zzgdn.zzo(zzn, (long) ((Integer) zzbd.zzc().zzb(zzbcv)).intValue(), TimeUnit.MILLISECONDS, this.zzc);
        }
        return zzgdn.zzf(zzn, Throwable.class, new zzeml(), executor);
    }
}
