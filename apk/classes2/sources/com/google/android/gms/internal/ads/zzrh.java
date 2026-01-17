package com.google.android.gms.internal.ads;

import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzrh {
    private final AudioTrack zza;
    private final zzpo zzb;
    private AudioRouting.OnRoutingChangedListener zzc = new zzrg(this);

    public zzrh(AudioTrack audioTrack, zzpo zzpo) {
        this.zza = audioTrack;
        this.zzb = zzpo;
        audioTrack.addOnRoutingChangedListener(this.zzc, new Handler(Looper.myLooper()));
    }

    public static /* synthetic */ void zza(zzrh zzrh, AudioRouting audioRouting) {
        AudioDeviceInfo routedDevice;
        if (zzrh.zzc != null && (routedDevice = audioRouting.getRoutedDevice()) != null) {
            zzrh.zzb.zzi(routedDevice);
        }
    }

    public final void zzb() {
        AudioRouting.OnRoutingChangedListener onRoutingChangedListener = this.zzc;
        onRoutingChangedListener.getClass();
        AudioRouting.OnRoutingChangedListener onRoutingChangedListener2 = onRoutingChangedListener;
        this.zza.removeOnRoutingChangedListener(onRoutingChangedListener);
        this.zzc = null;
    }
}
