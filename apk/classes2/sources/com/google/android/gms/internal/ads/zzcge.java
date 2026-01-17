package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzcge implements Runnable {
    final /* synthetic */ zzcgf zza;

    zzcge(zzcgf zzcgf) {
        Objects.requireNonNull(zzcgf);
        this.zza = zzcgf;
    }

    public final void run() {
        zzcge.super.destroy();
    }
}
