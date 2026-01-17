package com.google.android.gms.internal.ads;

import android.media.metrics.NetworkEvent;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzoy implements Runnable {
    public final /* synthetic */ zzpd zza;
    public final /* synthetic */ NetworkEvent zzb;

    public /* synthetic */ zzoy(zzpd zzpd, NetworkEvent networkEvent) {
        this.zza = zzpd;
        this.zzb = networkEvent;
    }

    public final void run() {
        this.zza.zzd.reportNetworkEvent(this.zzb);
    }
}
