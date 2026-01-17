package com.google.android.gms.ads.preload;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
public interface PreloadCallback {
    void onAdsAvailable(PreloadConfiguration preloadConfiguration);

    void onAdsExhausted(PreloadConfiguration preloadConfiguration);
}
