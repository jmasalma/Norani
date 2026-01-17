package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeAd;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzdvw implements NativeAd.OnNativeAdLoadedListener {
    public final /* synthetic */ zzdwf zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzdvw(zzdwf zzdwf, String str) {
        this.zza = zzdwf;
        this.zzb = str;
    }

    public final void onNativeAdLoaded(NativeAd nativeAd) {
        this.zza.zzg(this.zzb, nativeAd);
    }
}
