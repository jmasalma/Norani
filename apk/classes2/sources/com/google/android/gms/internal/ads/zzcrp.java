package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzcrp {
    private final Executor zza;
    private final ScheduledExecutorService zzb;
    private final ListenableFuture zzc;
    /* access modifiers changed from: private */
    public volatile boolean zzd = true;

    public zzcrp(Executor executor, ScheduledExecutorService scheduledExecutorService, ListenableFuture listenableFuture) {
        this.zza = executor;
        this.zzb = scheduledExecutorService;
        this.zzc = listenableFuture;
    }

    public static /* synthetic */ ListenableFuture zza(zzcrp zzcrp, zzgdj zzgdj, ListenableFuture listenableFuture, zzcra zzcra) {
        if (zzcra != null) {
            zzgdj.zzb(zzcra);
        }
        return zzgdn.zzo(listenableFuture, ((Long) zzbfr.zza.zze()).longValue(), TimeUnit.MILLISECONDS, zzcrp.zzb);
    }

    static /* bridge */ /* synthetic */ void zzc(zzcrp zzcrp, List list, zzgdj zzgdj) {
        if (list == null || list.isEmpty()) {
            zzcrp.zza.execute(new zzcrk(zzgdj));
            return;
        }
        ListenableFuture zzh = zzgdn.zzh((Object) null);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzcrl zzcrl = new zzcrl(zzgdj);
            Executor executor = zzcrp.zza;
            zzh = zzgdn.zzn(zzgdn.zzf(zzh, Throwable.class, zzcrl, executor), new zzcrm(zzcrp, zzgdj, (ListenableFuture) it.next()), executor);
        }
        zzgdn.zzr(zzh, new zzcro(zzcrp, zzgdj), zzcrp.zza);
    }

    public final void zze(zzgdj zzgdj) {
        zzgdn.zzr(this.zzc, new zzcrn(this, zzgdj), this.zza);
    }

    public final boolean zzf() {
        return this.zzd;
    }
}
