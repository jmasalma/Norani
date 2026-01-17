package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
final class zzbin extends zzbhs {
    final /* synthetic */ zzbiq zza;

    /* synthetic */ zzbin(zzbiq zzbiq, zzbip zzbip) {
        Objects.requireNonNull(zzbiq);
        this.zza = zzbiq;
    }

    public final void zze(zzbhj zzbhj, String str) {
        zzbiq zzbiq = this.zza;
        if (zzbiq.zzb != null) {
            zzbiq.zzb.zzb(zzbiq.zzf(zzbhj), str);
        }
    }
}
