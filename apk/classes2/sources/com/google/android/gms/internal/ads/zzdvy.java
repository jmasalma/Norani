package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.BaseAdView;
import com.google.android.gms.ads.LoadAdError;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzdvy extends AdListener {
    final /* synthetic */ String zza;
    final /* synthetic */ BaseAdView zzb;
    final /* synthetic */ zzdwf zzc;

    zzdvy(zzdwf zzdwf, String str, BaseAdView baseAdView) {
        this.zza = str;
        this.zzb = baseAdView;
        Objects.requireNonNull(zzdwf);
        this.zzc = zzdwf;
    }

    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.zzc.zzl(zzdwf.zzk(loadAdError));
    }

    public final void onAdLoaded() {
        this.zzc.zzg(this.zza, this.zzb);
    }
}
