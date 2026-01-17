package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzewf implements zzeuc {
    final ScheduledExecutorService zza;

    public zzewf(zzbtu zzbtu, ScheduledExecutorService scheduledExecutorService, Context context) {
        this.zza = scheduledExecutorService;
    }

    public final int zza() {
        return 49;
    }

    public final ListenableFuture zzb() {
        return zzgdn.zzm(zzgdn.zzo(zzgdn.zzh(new Bundle()), ((Long) zzbd.zzc().zzb(zzbde.zzex)).longValue(), TimeUnit.MILLISECONDS, this.zza), new zzewe(), zzcaf.zza);
    }
}
