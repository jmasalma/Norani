package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.LoadAdError;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
final class zzem extends zzbc {
    final /* synthetic */ zzen zza;

    zzem(zzen zzen) {
        Objects.requireNonNull(zzen);
        this.zza = zzen;
    }

    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        zzen zzen = this.zza;
        zzen.zze.zzb(zzen.zzj());
        super.onAdFailedToLoad(loadAdError);
    }

    public final void onAdLoaded() {
        zzen zzen = this.zza;
        zzen.zze.zzb(zzen.zzj());
        super.onAdLoaded();
    }
}
