package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.OnPaidEventListener;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
public final class zzfu extends zzds {
    private final OnPaidEventListener zza;

    public zzfu(OnPaidEventListener onPaidEventListener) {
        this.zza = onPaidEventListener;
    }

    public final void zze(zzt zzt) {
        OnPaidEventListener onPaidEventListener = this.zza;
        if (onPaidEventListener != null) {
            onPaidEventListener.onPaidEvent(AdValue.zza(zzt.zzb, zzt.zzc, zzt.zzd));
        }
    }

    public final boolean zzf() {
        return this.zza == null;
    }
}
