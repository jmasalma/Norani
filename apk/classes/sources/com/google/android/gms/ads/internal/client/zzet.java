package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.preload.PreloadCallback;
import com.google.android.gms.ads.preload.PreloadConfiguration;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
final class zzet extends zzcd {
    final /* synthetic */ PreloadCallback zza;

    zzet(zzey zzey, PreloadCallback preloadCallback) {
        this.zza = preloadCallback;
        Objects.requireNonNull(zzey);
    }

    public final void zze(zzfv zzfv) {
        PreloadConfiguration zzh = zzf.zzh(zzfv);
        if (zzh != null) {
            this.zza.onAdsAvailable(zzh);
        }
    }

    public final void zzf(zzfv zzfv) {
        PreloadConfiguration zzh = zzf.zzh(zzfv);
        if (zzh != null) {
            this.zza.onAdsExhausted(zzh);
        }
    }
}
