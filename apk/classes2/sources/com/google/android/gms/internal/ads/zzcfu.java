package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzcfu implements Runnable {
    public final /* synthetic */ zzcfg zza;

    public /* synthetic */ zzcfu(zzcfg zzcfg) {
        this.zza = zzcfg;
    }

    public final void run() {
        this.zza.destroy();
    }
}
