package com.google.android.gms.internal.ads;

import android.media.MediaPlayer;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzcax implements Runnable {
    final /* synthetic */ MediaPlayer zza;
    final /* synthetic */ zzcbf zzb;

    zzcax(zzcbf zzcbf, MediaPlayer mediaPlayer) {
        this.zza = mediaPlayer;
        Objects.requireNonNull(zzcbf);
        this.zzb = zzcbf;
    }

    public final void run() {
        zzcbf zzcbf = this.zzb;
        zzcbf.zzm(zzcbf, this.zza);
        if (zzcbf.zzr != null) {
            zzcbf.zzr.zzf();
        }
    }
}
