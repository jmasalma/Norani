package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzgei implements Runnable {
    zzgel zza;

    zzgei(zzgel zzgel) {
        this.zza = zzgel;
    }

    public final void run() {
        ListenableFuture zze;
        String str;
        zzgel zzgel = this.zza;
        if (zzgel != null && (zze = zzgel.zza) != null) {
            this.zza = null;
            if (zze.isDone()) {
                zzgel.zzn(zze);
                return;
            }
            try {
                ScheduledFuture zzx = zzgel.zzb;
                zzgel.zzb = null;
                str = "Timed out";
                if (zzx != null) {
                    long abs = Math.abs(zzx.getDelay(TimeUnit.MILLISECONDS));
                    if (abs > 10) {
                        str = "Timed out (timeout delayed by " + abs + " ms after scheduled time)";
                    }
                }
                zzgel.zzd(new zzgej(str + ": " + zze.toString(), (zzgek) null));
                zze.cancel(true);
            } catch (Throwable th) {
                zze.cancel(true);
                throw th;
            }
        }
    }
}
