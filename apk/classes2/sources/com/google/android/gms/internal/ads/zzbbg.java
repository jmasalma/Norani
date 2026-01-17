package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzbbg implements Runnable {
    final /* synthetic */ zzbbk zza;

    zzbbg(zzbbk zzbbk) {
        Objects.requireNonNull(zzbbk);
        this.zza = zzbbk;
    }

    public final void run() {
        zzbbk.zzh(this.zza);
    }
}
