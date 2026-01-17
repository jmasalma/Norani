package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;
import android.webkit.WebView;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzazz implements ValueCallback {
    public final /* synthetic */ zzbaa zza;
    public final /* synthetic */ zzazs zzb;
    public final /* synthetic */ WebView zzc;
    public final /* synthetic */ boolean zzd;

    public /* synthetic */ zzazz(zzbaa zzbaa, zzazs zzazs, WebView webView, boolean z) {
        this.zza = zzbaa;
        this.zzb = zzazs;
        this.zzc = webView;
        this.zzd = z;
    }

    public final void onReceiveValue(Object obj) {
        this.zza.zze.zzc(this.zzb, this.zzc, (String) obj, this.zzd);
    }
}
