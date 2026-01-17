package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zza;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzcta implements zza {
    private final zzcte zza;
    private final zzfcw zzb;

    zzcta(zzcte zzcte, zzfcw zzfcw) {
        this.zza = zzcte;
        this.zzb = zzfcw;
    }

    public final void onAdClicked() {
        this.zza.zzc(this.zzb.zzf);
    }
}
