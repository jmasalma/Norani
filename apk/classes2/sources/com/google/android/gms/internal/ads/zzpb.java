package com.google.android.gms.internal.ads;

import android.media.metrics.PlaybackStateEvent;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzpb implements Runnable {
    public final /* synthetic */ zzpd zza;
    public final /* synthetic */ PlaybackStateEvent zzb;

    public /* synthetic */ zzpb(zzpd zzpd, PlaybackStateEvent playbackStateEvent) {
        this.zza = zzpd;
        this.zzb = playbackStateEvent;
    }

    public final void run() {
        this.zza.zzd.reportPlaybackStateEvent(this.zzb);
    }
}
