package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.zzv;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzeso implements zzeuc {
    private final zzeuc zza;
    private final long zzb;
    private final ScheduledExecutorService zzc;

    public zzeso(zzeuc zzeuc, long j, ScheduledExecutorService scheduledExecutorService) {
        this.zza = zzeuc;
        this.zzb = j;
        this.zzc = scheduledExecutorService;
    }

    public static /* synthetic */ ListenableFuture zzc(zzeso zzeso, Throwable th) {
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzcz)).booleanValue()) {
            zzeuc zzeuc = zzeso.zza;
            zzbzs zzp = zzv.zzp();
            int zza2 = zzeuc.zza();
            zzp.zzw(th, "OptionalSignalTimeout:" + zza2);
        }
        return zzgdn.zzh((Object) null);
    }

    public final int zza() {
        return this.zza.zza();
    }

    public final ListenableFuture zzb() {
        ListenableFuture zzb2 = this.zza.zzb();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzcA)).booleanValue()) {
            timeUnit = TimeUnit.MICROSECONDS;
        }
        long j = this.zzb;
        if (j > 0) {
            zzb2 = zzgdn.zzo(zzb2, j, timeUnit, this.zzc);
        }
        return zzgdn.zzf(zzb2, Throwable.class, new zzesn(this), zzcaf.zzg);
    }
}
