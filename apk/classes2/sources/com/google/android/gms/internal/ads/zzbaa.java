package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzbaa implements Runnable {
    final ValueCallback zza;
    final /* synthetic */ zzazs zzb;
    final /* synthetic */ WebView zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ zzbac zze;

    zzbaa(zzbac zzbac, zzazs zzazs, WebView webView, boolean z) {
        this.zzb = zzazs;
        this.zzc = webView;
        this.zzd = z;
        Objects.requireNonNull(zzbac);
        this.zze = zzbac;
        this.zza = new zzazz(this, zzazs, webView, z);
    }

    public final void run() {
        WebView webView = this.zzc;
        if (webView.getSettings().getJavaScriptEnabled()) {
            try {
                webView.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.zza);
            } catch (Throwable unused) {
                this.zza.onReceiveValue("");
            }
        }
    }
}
