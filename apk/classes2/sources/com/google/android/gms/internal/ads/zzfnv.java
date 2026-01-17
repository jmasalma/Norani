package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzfnv {
    private final BlockingQueue zza;
    private final ThreadPoolExecutor zzb;
    private final ArrayDeque zzc = new ArrayDeque();
    private zzfnu zzd = null;

    public zzfnv() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.zza = linkedBlockingQueue;
        this.zzb = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private final void zzc() {
        zzfnu zzfnu = (zzfnu) this.zzc.poll();
        this.zzd = zzfnu;
        if (zzfnu != null) {
            zzfnu.executeOnExecutor(this.zzb, new Object[0]);
        }
    }

    public final void zza(zzfnu zzfnu) {
        this.zzd = null;
        zzc();
    }

    public final void zzb(zzfnu zzfnu) {
        zzfnu.zzb(this);
        this.zzc.add(zzfnu);
        if (this.zzd == null) {
            zzc();
        }
    }
}
