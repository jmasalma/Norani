package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzcwl extends zzdbt implements zzcwc {
    private final ScheduledExecutorService zzb;
    private ScheduledFuture zzc;
    private boolean zzd = false;

    public zzcwl(zzcwk zzcwk, Set set, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        super(set);
        this.zzb = scheduledExecutorService;
        super.zzo(zzcwk, executor);
    }

    public static /* synthetic */ void zza(zzcwl zzcwl) {
        synchronized (zzcwl) {
            int i = zze.zza;
            zzo.zzg("Timeout waiting for show call succeed to be called.");
            zzcwl.zze(new zzdgm("Timeout for show call succeed."));
            zzcwl.zzd = true;
        }
    }

    public final synchronized void zzb() {
        ScheduledFuture scheduledFuture = this.zzc;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
    }

    public final void zzc(com.google.android.gms.ads.internal.client.zze zze) {
        zzq(new zzcwd(zze));
    }

    public final void zzd() {
        zzq(new zzcwe());
    }

    public final void zze(zzdgm zzdgm) {
        if (!this.zzd) {
            ScheduledFuture scheduledFuture = this.zzc;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            zzq(new zzcwg(zzdgm));
        }
    }

    public final void zzf() {
        int intValue = ((Integer) zzbd.zzc().zzb(zzbde.zzlf)).intValue();
        this.zzc = this.zzb.schedule(new zzcwf(this), (long) intValue, TimeUnit.MILLISECONDS);
    }
}
