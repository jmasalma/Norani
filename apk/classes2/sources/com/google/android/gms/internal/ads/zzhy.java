package com.google.android.gms.internal.ads;

import android.media.AudioManager;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzhy implements AudioManager.OnAudioFocusChangeListener {
    public final /* synthetic */ zzib zza;

    public /* synthetic */ zzhy(zzib zzib) {
        this.zza = zzib;
    }

    public final void onAudioFocusChange(int i) {
        zzib.zzc(this.zza, i);
    }
}
