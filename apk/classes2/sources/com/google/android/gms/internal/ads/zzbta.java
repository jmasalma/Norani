package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
final class zzbta extends zzbhs {
    final /* synthetic */ zzbtd zza;

    /* synthetic */ zzbta(zzbtd zzbtd, zzbtc zzbtc) {
        Objects.requireNonNull(zzbtd);
        this.zza = zzbtd;
    }

    public final void zze(zzbhj zzbhj, String str) {
        zzbtd zzbtd = this.zza;
        if (zzbtd.zzb != null) {
            zzbtd.zzb.onCustomClick(zzbtd.zzf(zzbhj), str);
        }
    }
}
