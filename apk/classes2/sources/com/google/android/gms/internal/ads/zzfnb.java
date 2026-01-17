package com.google.android.gms.internal.ads;

import android.webkit.WebView;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzfnb implements Runnable {
    final /* synthetic */ zzfnc zza;
    private final WebView zzb;

    zzfnb(zzfnc zzfnc) {
        Objects.requireNonNull(zzfnc);
        this.zza = zzfnc;
        this.zzb = zzfnc.zza;
    }

    public final void run() {
        this.zzb.destroy();
    }
}
