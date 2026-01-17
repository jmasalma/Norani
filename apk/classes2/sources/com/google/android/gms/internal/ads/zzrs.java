package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzrs implements zzql {
    final /* synthetic */ zzru zza;

    /* synthetic */ zzrs(zzru zzru, zzrt zzrt) {
        Objects.requireNonNull(zzru);
        this.zza = zzru;
    }

    public final void zza(Exception exc) {
        zzea.zzd("MediaCodecAudioRenderer", "Audio sink error", exc);
        this.zza.zzc.zzp(exc);
    }

    public final void zzb() {
        zzlz zzaf = this.zza.zzaE();
        if (zzaf != null) {
            zzaf.zza();
        }
    }
}
