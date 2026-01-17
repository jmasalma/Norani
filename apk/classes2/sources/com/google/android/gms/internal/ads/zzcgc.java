package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzcgc implements Runnable {
    public final /* synthetic */ zzcgf zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzcgc(zzcgf zzcgf, String str) {
        this.zza = zzcgf;
        this.zzb = str;
    }

    public final void run() {
        zzcgc.super.loadUrl(this.zzb);
    }
}
