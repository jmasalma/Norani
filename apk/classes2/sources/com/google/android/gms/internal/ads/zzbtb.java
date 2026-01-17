package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
final class zzbtb extends zzbhv {
    final /* synthetic */ zzbtd zza;

    /* synthetic */ zzbtb(zzbtd zzbtd, zzbtc zzbtc) {
        Objects.requireNonNull(zzbtd);
        this.zza = zzbtd;
    }

    public final void zze(zzbhj zzbhj) {
        zzbtd zzbtd = this.zza;
        zzbtd.zza.onCustomFormatAdLoaded(zzbtd.zzf(zzbhj));
    }
}
