package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.appopen.AppOpenAd;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzdvx extends AppOpenAd.AppOpenAdLoadCallback {
    final /* synthetic */ String zza;
    final /* synthetic */ zzdwf zzb;

    zzdvx(zzdwf zzdwf, String str) {
        this.zza = str;
        Objects.requireNonNull(zzdwf);
        this.zzb = zzdwf;
    }

    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.zzb.zzl(zzdwf.zzk(loadAdError));
    }

    public final /* bridge */ /* synthetic */ void onAdLoaded(Object obj) {
        this.zzb.zzg(this.zza, (AppOpenAd) obj);
    }
}
