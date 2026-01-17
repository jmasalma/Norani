package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzgel extends zzgdd {
    /* access modifiers changed from: private */
    public ListenableFuture zza;
    /* access modifiers changed from: private */
    public ScheduledFuture zzb;

    static ListenableFuture zzf(ListenableFuture listenableFuture, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        zzgel zzgel = new zzgel(listenableFuture);
        zzgei zzgei = new zzgei(zzgel);
        zzgel.zzb = scheduledExecutorService.schedule(zzgei, j, timeUnit);
        listenableFuture.addListener(zzgei, zzgdb.INSTANCE);
        return zzgel;
    }

    /* access modifiers changed from: protected */
    public final String zza() {
        ListenableFuture listenableFuture = this.zza;
        ScheduledFuture scheduledFuture = this.zzb;
        if (listenableFuture == null) {
            return null;
        }
        String str = "inputFuture=[" + listenableFuture.toString() + "]";
        if (scheduledFuture == null) {
            return str;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return str;
        }
        return str + ", remaining delay=[" + delay + " ms]";
    }

    /* access modifiers changed from: protected */
    public final void zzb() {
        zzl(this.zza);
        ScheduledFuture scheduledFuture = this.zzb;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.zza = null;
        this.zzb = null;
    }

    private zzgel(ListenableFuture listenableFuture) {
        listenableFuture.getClass();
        ListenableFuture listenableFuture2 = listenableFuture;
        this.zza = listenableFuture;
    }
}
