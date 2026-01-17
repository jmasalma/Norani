package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzejt implements Runnable {
    public final /* synthetic */ zzeju zza;

    public /* synthetic */ zzejt(zzeju zzeju) {
        this.zza = zzeju;
    }

    public final void run() {
        this.zza.zzf.execute(new zzejs(this.zza));
    }
}
