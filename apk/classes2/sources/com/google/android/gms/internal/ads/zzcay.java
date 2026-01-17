package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzcay implements Runnable {
    final /* synthetic */ zzcbf zza;

    zzcay(zzcbf zzcbf) {
        Objects.requireNonNull(zzcbf);
        this.zza = zzcbf;
    }

    public final void run() {
        zzcbf zzcbf = this.zza;
        if (zzcbf.zzr != null) {
            zzcbf.zzr.zza();
        }
    }
}
