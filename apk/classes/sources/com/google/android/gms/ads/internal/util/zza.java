package com.google.android.gms.ads.internal.util;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zza implements Runnable {
    final /* synthetic */ zzb zza;

    zza(zzb zzb) {
        Objects.requireNonNull(zzb);
        this.zza = zzb;
    }

    public final void run() {
        zzb zzb = this.zza;
        zzb.zzb = Thread.currentThread();
        zzb.zza();
    }
}
