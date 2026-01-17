package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzcbo implements Runnable {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzcbp zzb;

    zzcbo(zzcbp zzcbp, boolean z) {
        this.zza = z;
        Objects.requireNonNull(zzcbp);
        this.zzb = zzcbp;
    }

    public final void run() {
        this.zzb.zzK("windowVisibilityChanged", "isVisible", String.valueOf(this.zza));
    }
}
