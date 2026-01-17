package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzegl {
    private final Executor zza;
    private final ScheduledExecutorService zzb;
    private final zzcrd zzc;
    private final zzehb zzd;
    private final zzfju zze;
    private final zzgeh zzf = zzgeh.zze();
    private final AtomicBoolean zzg = new AtomicBoolean();
    /* access modifiers changed from: private */
    public zzegm zzh;
    private zzfcn zzi;

    zzegl(Executor executor, ScheduledExecutorService scheduledExecutorService, zzcrd zzcrd, zzehb zzehb, zzfju zzfju) {
        this.zza = executor;
        this.zzb = scheduledExecutorService;
        this.zzc = zzcrd;
        this.zzd = zzehb;
        this.zze = zzfju;
    }

    private final synchronized ListenableFuture zzd(zzfca zzfca) {
        for (String zza2 : zzfca.zza) {
            zzedm zza3 = this.zzc.zza(zzfca.zzb, zza2);
            if (zza3 != null && zza3.zzb(this.zzi, zzfca)) {
                ListenableFuture zza4 = zza3.zza(this.zzi, zzfca);
                int i = zzfca.zzR;
                return zzgdn.zzo(zza4, (long) i, TimeUnit.MILLISECONDS, this.zzb);
            }
        }
        return zzgdn.zzg(new zzdwm(3));
    }

    /* access modifiers changed from: private */
    public final void zze(zzfca zzfca) {
        ListenableFuture zzd2 = zzd(zzfca);
        this.zzd.zzf(this.zzi, zzfca, zzd2, this.zze);
        zzgdn.zzr(zzd2, new zzegk(this, zzfca), this.zza);
    }

    public final synchronized ListenableFuture zzb(zzfcn zzfcn) {
        if (!this.zzg.getAndSet(true)) {
            List list = zzfcn.zzb.zza;
            if (list.isEmpty()) {
                this.zzf.zzd(new zzehf(3, zzehi.zzc(zzfcn)));
            } else {
                this.zzi = zzfcn;
                zzehb zzehb = this.zzd;
                this.zzh = new zzegm(zzfcn, zzehb, this.zzf);
                zzehb.zzk(list);
                zzfca zza2 = this.zzh.zza();
                while (zza2 != null) {
                    zze(zza2);
                    zza2 = this.zzh.zza();
                }
            }
        }
        return this.zzf;
    }
}
