package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.internal.client.zzbx;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
final class zzbir implements Runnable {
    final /* synthetic */ AdManagerAdView zza;
    final /* synthetic */ zzbx zzb;
    final /* synthetic */ zzbis zzc;

    zzbir(zzbis zzbis, AdManagerAdView adManagerAdView, zzbx zzbx) {
        this.zza = adManagerAdView;
        this.zzb = zzbx;
        Objects.requireNonNull(zzbis);
        this.zzc = zzbis;
    }

    public final void run() {
        AdManagerAdView adManagerAdView = this.zza;
        if (adManagerAdView.zzb(this.zzb)) {
            this.zzc.zza.onAdManagerAdViewLoaded(adManagerAdView);
        } else {
            zzo.zzj("Could not bind.");
        }
    }
}
