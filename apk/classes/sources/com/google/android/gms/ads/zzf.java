package com.google.android.gms.ads;

import com.google.android.gms.internal.ads.zzbun;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
public final /* synthetic */ class zzf implements Runnable {
    public final /* synthetic */ BaseAdView zza;

    public /* synthetic */ zzf(BaseAdView baseAdView) {
        this.zza = baseAdView;
    }

    public final void run() {
        BaseAdView baseAdView = this.zza;
        try {
            baseAdView.zza.zzo();
        } catch (IllegalStateException e) {
            zzbun.zza(baseAdView.getContext()).zzh(e, "BaseAdView.pause");
        }
    }
}
