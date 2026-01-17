package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzfnn implements Runnable {
    final /* synthetic */ zzfns zza;

    zzfnn(zzfns zzfns) {
        Objects.requireNonNull(zzfns);
        this.zza = zzfns;
    }

    public final void run() {
        this.zza.zzl.zzb();
    }
}
