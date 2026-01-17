package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Tasks;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzevm implements zzeuc {
    private final zzbzs zza;
    private final ScheduledExecutorService zzb;
    private final zzgdy zzc;

    zzevm(String str, zzbbf zzbbf, zzbzs zzbzs, ScheduledExecutorService scheduledExecutorService, zzgdy zzgdy) {
        this.zza = zzbzs;
        this.zzb = scheduledExecutorService;
        this.zzc = zzgdy;
    }

    public final int zza() {
        return 43;
    }

    public final ListenableFuture zzb() {
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzdh)).booleanValue()) {
            if (((Boolean) zzbd.zzc().zzb(zzbde.zzdm)).booleanValue()) {
                ListenableFuture zza2 = zzfsj.zza(Tasks.forResult(null), (CancellationTokenSource) null);
                zzevk zzevk = new zzevk();
                zzgdy zzgdy = this.zzc;
                ListenableFuture zzn = zzgdn.zzn(zza2, zzevk, zzgdy);
                if (((Boolean) zzber.zza.zze()).booleanValue()) {
                    zzn = zzgdn.zzo(zzn, ((Long) zzber.zzb.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzb);
                }
                return zzgdn.zze(zzn, Exception.class, new zzevl(this), zzgdy);
            }
        }
        return zzgdn.zzh(new zzevn((String) null, -1));
    }
}
