package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzv;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzcde implements Runnable {
    final /* synthetic */ zzcdf zza;

    zzcde(zzcdf zzcdf) {
        Objects.requireNonNull(zzcdf);
        this.zza = zzcdf;
    }

    public final void run() {
        zzv.zzA().zzc(this.zza);
    }
}
