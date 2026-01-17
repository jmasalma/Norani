package com.google.android.gms.internal.ads;

import android.media.AudioRouting;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzrg implements AudioRouting.OnRoutingChangedListener {
    public final /* synthetic */ zzrh zza;

    public /* synthetic */ zzrg(zzrh zzrh) {
        this.zza = zzrh;
    }

    public final void onRoutingChanged(AudioRouting audioRouting) {
        zzrh.zza(this.zza, audioRouting);
    }
}
