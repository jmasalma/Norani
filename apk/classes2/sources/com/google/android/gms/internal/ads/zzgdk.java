package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzgdk implements Runnable {
    final Future zza;
    final zzgdj zzb;

    zzgdk(Future future, zzgdj zzgdj) {
        this.zza = future;
        this.zzb = zzgdj;
    }

    public final void run() {
        Throwable zza2;
        Future future = this.zza;
        if (!(future instanceof zzger) || (zza2 = zzges.zza((zzger) future)) == null) {
            try {
                this.zzb.zzb(zzgdn.zzp(future));
            } catch (ExecutionException e) {
                this.zzb.zza(e.getCause());
            } catch (Throwable th) {
                this.zzb.zza(th);
            }
        } else {
            this.zzb.zza(zza2);
        }
    }

    public final String toString() {
        zzfvj zza2 = zzfvl.zza(this);
        zza2.zza(this.zzb);
        return zza2.toString();
    }
}
