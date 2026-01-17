package com.google.android.gms.internal.ads;

import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzbbu implements Runnable {
    public final /* synthetic */ zzcak zza;
    public final /* synthetic */ Future zzb;

    public /* synthetic */ zzbbu(zzcak zzcak, Future future) {
        this.zza = zzcak;
        this.zzb = future;
    }

    public final void run() {
        int i = zzbbw.zzd;
        if (this.zza.isCancelled()) {
            this.zzb.cancel(true);
        }
    }
}
