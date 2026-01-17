package com.google.android.gms.ads.preload;

import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.internal.client.zzcg;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzea;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
final class zza extends zzcg {
    final /* synthetic */ PreloadCallbackV2 zza;

    zza(zzb zzb, PreloadCallbackV2 preloadCallbackV2) {
        this.zza = preloadCallbackV2;
        Objects.requireNonNull(zzb);
    }

    public final void zze(String str, zze zze) {
        this.zza.onAdFailedToPreload(str, zze.zzb());
    }

    public final void zzf(String str, zzea zzea) {
        this.zza.onAdPreloaded(str, ResponseInfo.zza(zzea));
    }

    public final void zzg(String str) {
        this.zza.onAdsExhausted(str);
    }
}
