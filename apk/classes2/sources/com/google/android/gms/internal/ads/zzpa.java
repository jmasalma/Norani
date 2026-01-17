package com.google.android.gms.internal.ads;

import android.media.metrics.PlaybackMetrics;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzpa implements Runnable {
    public final /* synthetic */ zzpd zza;
    public final /* synthetic */ PlaybackMetrics zzb;

    public /* synthetic */ zzpa(zzpd zzpd, PlaybackMetrics playbackMetrics) {
        this.zza = zzpd;
        this.zzb = playbackMetrics;
    }

    public final void run() {
        this.zza.zzd.reportPlaybackMetrics(this.zzb);
    }
}
