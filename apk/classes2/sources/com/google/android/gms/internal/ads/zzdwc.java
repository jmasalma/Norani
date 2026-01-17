package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzdwc extends AdListener {
    final /* synthetic */ zzdwf zza;

    zzdwc(zzdwf zzdwf) {
        Objects.requireNonNull(zzdwf);
        this.zza = zzdwf;
    }

    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.zza.zzl(zzdwf.zzk(loadAdError));
    }
}
