package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzbzx implements Runnable {
    public final /* synthetic */ AtomicBoolean zza;

    public /* synthetic */ zzbzx(AtomicBoolean atomicBoolean) {
        this.zza = atomicBoolean;
    }

    public final void run() {
        this.zza.getAndSet(true);
    }
}
