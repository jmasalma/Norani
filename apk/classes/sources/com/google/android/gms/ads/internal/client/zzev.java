package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.AdInspectorError;
import com.google.android.gms.ads.OnAdInspectorClosedListener;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
final class zzev extends zzdm {
    private zzev() {
        throw null;
    }

    /* synthetic */ zzev(zzex zzex) {
    }

    public final void zze(zze zze) {
        AdInspectorError adInspectorError;
        OnAdInspectorClosedListener zzb = zzey.zzf().zzm;
        if (zzb != null) {
            if (zze == null) {
                adInspectorError = null;
            } else {
                adInspectorError = new AdInspectorError(zze.zza, zze.zzb, zze.zzc);
            }
            zzb.onAdInspectorClosed(adInspectorError);
        }
    }
}
