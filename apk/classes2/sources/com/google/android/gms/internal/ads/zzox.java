package com.google.android.gms.internal.ads;

import android.media.metrics.TrackChangeEvent;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzox implements Runnable {
    public final /* synthetic */ zzpd zza;
    public final /* synthetic */ TrackChangeEvent zzb;

    public /* synthetic */ zzox(zzpd zzpd, TrackChangeEvent trackChangeEvent) {
        this.zza = zzpd;
        this.zzb = trackChangeEvent;
    }

    public final void run() {
        this.zza.zzd.reportTrackChangeEvent(this.zzb);
    }
}
