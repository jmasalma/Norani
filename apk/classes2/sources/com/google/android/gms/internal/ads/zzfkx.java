package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzfkx implements Runnable {
    final /* synthetic */ zzfld zza;

    zzfkx(zzfld zzfld) {
        Objects.requireNonNull(zzfld);
        this.zza = zzfld;
    }

    public final void run() {
        this.zza.zzw();
    }
}
