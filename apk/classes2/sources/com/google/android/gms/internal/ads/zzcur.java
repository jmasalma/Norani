package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.zze;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzcur implements zzcvy, zzddi, zzdax, zzcwo, zzazd {
    /* access modifiers changed from: private */
    public final zzcwq zza;
    private final zzcym zzb;
    private final zzfca zzc;
    private final ScheduledExecutorService zzd;
    private final Executor zze;
    private final zzgeh zzf = zzgeh.zze();
    private ScheduledFuture zzg;
    private final AtomicBoolean zzh = new AtomicBoolean();
    private final String zzi;

    zzcur(zzcwq zzcwq, zzfca zzfca, ScheduledExecutorService scheduledExecutorService, Executor executor, String str, zzcym zzcym) {
        this.zza = zzcwq;
        this.zzc = zzfca;
        this.zzd = scheduledExecutorService;
        this.zze = executor;
        this.zzi = str;
        this.zzb = zzcym;
    }

    public static /* synthetic */ void zzh(zzcur zzcur) {
        synchronized (zzcur) {
            zzgeh zzgeh = zzcur.zzf;
            if (!zzgeh.isDone()) {
                zzgeh.zzc(true);
            }
        }
    }

    private final boolean zzk() {
        return this.zzi.equals("com.google.ads.mediation.admob.AdMobAdapter");
    }

    public final void zza() {
    }

    public final void zzb() {
    }

    public final void zzc() {
        zzfca zzfca = this.zzc;
        if (zzfca.zze != 3) {
            int i = zzfca.zzY;
            if (i == 0 || i == 1) {
                if (!((Boolean) zzbd.zzc().zzb(zzbde.zzlT)).booleanValue() || !zzk()) {
                    this.zza.zza();
                }
            }
        }
    }

    public final void zzdp() {
    }

    public final synchronized void zzdq() {
        if (this.zzc.zze == 4) {
            this.zza.zza();
            return;
        }
        zzgeh zzgeh = this.zzf;
        if (!zzgeh.isDone()) {
            ScheduledFuture scheduledFuture = this.zzg;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            zzgeh.zzc(true);
        }
    }

    public final void zzdr(zzazc zzazc) {
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzlT)).booleanValue() && zzk() && zzazc.zzj && this.zzh.compareAndSet(false, true) && this.zzc.zze != 3) {
            zze.zza("Full screen 1px impression occurred");
            this.zza.zza();
        }
    }

    public final void zzdu(zzbwc zzbwc, String str, String str2) {
    }

    public final void zze() {
    }

    public final void zzf() {
    }

    public final void zzi() {
        zzfca zzfca = this.zzc;
        int i = zzfca.zze;
        if (i != 3) {
            if (i == 4) {
                this.zzb.zza();
                return;
            }
            if (((Boolean) zzbd.zzc().zzb(zzbde.zzbI)).booleanValue() && zzfca.zzY == 2) {
                int i2 = zzfca.zzq;
                if (i2 == 0) {
                    this.zza.zza();
                    return;
                }
                zzgdn.zzr(this.zzf, new zzcuq(this), this.zze);
                this.zzg = this.zzd.schedule(new zzcup(this), (long) i2, TimeUnit.MILLISECONDS);
            }
        }
    }

    public final void zzj() {
    }

    public final synchronized void zzs(com.google.android.gms.ads.internal.client.zze zze2) {
        zzgeh zzgeh = this.zzf;
        if (!zzgeh.isDone()) {
            ScheduledFuture scheduledFuture = this.zzg;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            zzgeh.zzd(new Exception());
        }
    }
}
