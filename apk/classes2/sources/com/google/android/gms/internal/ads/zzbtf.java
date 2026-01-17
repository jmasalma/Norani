package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeAd;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
public final class zzbtf extends zzbic {
    private final NativeAd.OnNativeAdLoadedListener zza;

    public zzbtf(NativeAd.OnNativeAdLoadedListener onNativeAdLoadedListener) {
        this.zza = onNativeAdLoadedListener;
    }

    public final void zze(zzbij zzbij) {
        this.zza.onNativeAdLoaded(new zzbsz(zzbij));
    }
}
