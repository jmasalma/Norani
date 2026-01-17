package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzdwb extends RewardedInterstitialAdLoadCallback {
    final /* synthetic */ String zza;
    final /* synthetic */ zzdwf zzb;

    zzdwb(zzdwf zzdwf, String str) {
        this.zza = str;
        Objects.requireNonNull(zzdwf);
        this.zzb = zzdwf;
    }

    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.zzb.zzl(zzdwf.zzk(loadAdError));
    }

    public final /* bridge */ /* synthetic */ void onAdLoaded(Object obj) {
        this.zzb.zzg(this.zza, (RewardedInterstitialAd) obj);
    }
}
