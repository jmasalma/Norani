package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzcfz implements Runnable {
    public final /* synthetic */ zzcgf zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ ValueCallback zzc;

    public /* synthetic */ zzcfz(zzcgf zzcgf, String str, ValueCallback valueCallback) {
        this.zza = zzcgf;
        this.zzb = str;
        this.zzc = valueCallback;
    }

    public final void run() {
        zzcfz.super.evaluateJavascript(this.zzb, this.zzc);
    }
}
