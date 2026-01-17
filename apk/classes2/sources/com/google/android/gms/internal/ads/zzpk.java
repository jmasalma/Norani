package com.google.android.gms.internal.ads;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzpk extends AudioDeviceCallback {
    final /* synthetic */ zzpo zza;

    /* synthetic */ zzpk(zzpo zzpo, zzpn zzpn) {
        Objects.requireNonNull(zzpo);
        this.zza = zzpo;
    }

    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        zzpo zzpo = this.zza;
        zzpo.zzk(zzpj.zzc(zzpo.zza, zzpo.zzh, zzpo.zzg));
    }

    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        zzpo zzpo = this.zza;
        zzpp zzd = zzpo.zzg;
        String str = zzex.zza;
        int length = audioDeviceInfoArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            } else if (Objects.equals(audioDeviceInfoArr[i], zzd)) {
                zzpo.zzg = null;
                break;
            } else {
                i++;
            }
        }
        zzpo.zzk(zzpj.zzc(zzpo.zza, zzpo.zzh, zzpo.zzg));
    }
}
