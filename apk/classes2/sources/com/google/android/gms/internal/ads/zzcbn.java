package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzcbn implements Runnable {
    final /* synthetic */ zzcbp zza;

    zzcbn(zzcbp zzcbp) {
        Objects.requireNonNull(zzcbp);
        this.zza = zzcbp;
    }

    public final void run() {
        this.zza.zzK("surfaceDestroyed", new String[0]);
    }
}
