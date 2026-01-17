package com.google.android.gms.internal.ads;

import android.media.metrics.PlaybackErrorEvent;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzoz implements Runnable {
    public final /* synthetic */ zzpd zza;
    public final /* synthetic */ PlaybackErrorEvent zzb;

    public /* synthetic */ zzoz(zzpd zzpd, PlaybackErrorEvent playbackErrorEvent) {
        this.zza = zzpd;
        this.zzb = playbackErrorEvent;
    }

    public final void run() {
        this.zza.zzd.reportPlaybackErrorEvent(this.zzb);
    }
}
