package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
public final class zzbxo extends zzbxb {
    private final RewardedInterstitialAdLoadCallback zza;
    private final zzbxp zzb;

    public zzbxo(RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback, zzbxp zzbxp) {
        this.zza = rewardedInterstitialAdLoadCallback;
        this.zzb = zzbxp;
    }

    public final void zze(int i) {
    }

    public final void zzf(zze zze) {
        RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback = this.zza;
        if (rewardedInterstitialAdLoadCallback != null) {
            rewardedInterstitialAdLoadCallback.onAdFailedToLoad(zze.zzb());
        }
    }

    public final void zzg() {
        zzbxp zzbxp;
        RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback = this.zza;
        if (rewardedInterstitialAdLoadCallback != null && (zzbxp = this.zzb) != null) {
            rewardedInterstitialAdLoadCallback.onAdLoaded(zzbxp);
        }
    }
}
