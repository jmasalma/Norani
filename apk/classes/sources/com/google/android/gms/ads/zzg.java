package com.google.android.gms.ads;

import com.google.android.gms.internal.ads.zzbun;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
public final /* synthetic */ class zzg implements Runnable {
    public final /* synthetic */ BaseAdView zza;
    public final /* synthetic */ AdRequest zzb;

    public /* synthetic */ zzg(BaseAdView baseAdView, AdRequest adRequest) {
        this.zza = baseAdView;
        this.zzb = adRequest;
    }

    public final void run() {
        BaseAdView baseAdView = this.zza;
        try {
            baseAdView.zza.zzn(this.zzb.zza);
        } catch (IllegalStateException e) {
            zzbun.zza(baseAdView.getContext()).zzh(e, "BaseAdView.loadAd");
        }
    }
}
