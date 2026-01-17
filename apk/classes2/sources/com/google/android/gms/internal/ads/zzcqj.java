package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzcqj implements Runnable {
    public final /* synthetic */ zzcfg zza;

    public /* synthetic */ zzcqj(zzcfg zzcfg) {
        this.zza = zzcfg;
    }

    public final void run() {
        this.zza.onPause();
    }
}
