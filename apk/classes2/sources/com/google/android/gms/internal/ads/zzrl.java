package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzrl extends AudioTrack.StreamEventCallback {
    final /* synthetic */ zzrm zza;

    zzrl(zzrm zzrm) {
        Objects.requireNonNull(zzrm);
        this.zza = zzrm;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i) {
        zzro zzro = this.zza.zza;
        if (audioTrack.equals(zzro.zzu) && zzro.zzq != null && zzro.zzS) {
            zzro.zzq.zzb();
        }
    }

    public final void onPresentationEnded(AudioTrack audioTrack) {
        zzro zzro = this.zza.zza;
        if (audioTrack.equals(zzro.zzu)) {
            zzro.zzR = true;
        }
    }

    public final void onTearDown(AudioTrack audioTrack) {
        zzro zzro = this.zza.zza;
        if (audioTrack.equals(zzro.zzu) && zzro.zzq != null && zzro.zzS) {
            zzro.zzq.zzb();
        }
    }
}
