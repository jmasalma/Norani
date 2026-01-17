package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzent implements zzeuc {
    final zzbzs zza;
    AppSetIdClient zzb;
    private final ScheduledExecutorService zzc;
    private final zzgdy zzd;
    private final Context zze;

    zzent(Context context, zzbzs zzbzs, ScheduledExecutorService scheduledExecutorService, zzgdy zzgdy) {
        if (!((Boolean) zzbd.zzc().zzb(zzbde.zzdl)).booleanValue()) {
            this.zzb = AppSet.getClient(context);
        }
        this.zze = context;
        this.zza = zzbzs;
        this.zzc = scheduledExecutorService;
        this.zzd = zzgdy;
    }

    public final int zza() {
        return 11;
    }

    public final ListenableFuture zzb() {
        Task task;
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzdh)).booleanValue()) {
            if (!((Boolean) zzbd.zzc().zzb(zzbde.zzdm)).booleanValue()) {
                if (!((Boolean) zzbd.zzc().zzb(zzbde.zzdi)).booleanValue()) {
                    return zzgdn.zzm(zzfsj.zza(this.zzb.getAppSetIdInfo(), (CancellationTokenSource) null), new zzenq(), zzcaf.zzg);
                }
                if (((Boolean) zzbd.zzc().zzb(zzbde.zzdl)).booleanValue()) {
                    task = zzfea.zza(this.zze);
                } else {
                    task = this.zzb.getAppSetIdInfo();
                }
                if (task == null) {
                    return zzgdn.zzh(new zzenu((String) null, -1));
                }
                ListenableFuture zzn = zzgdn.zzn(zzfsj.zza(task, (CancellationTokenSource) null), new zzenr(), zzcaf.zzg);
                if (((Boolean) zzbd.zzc().zzb(zzbde.zzdj)).booleanValue()) {
                    zzn = zzgdn.zzo(zzn, ((Long) zzbd.zzc().zzb(zzbde.zzdk)).longValue(), TimeUnit.MILLISECONDS, this.zzc);
                }
                return zzgdn.zze(zzn, Exception.class, new zzens(this), this.zzd);
            }
        }
        return zzgdn.zzh(new zzenu((String) null, -1));
    }
}
