package com.google.android.gms.internal.ads;

import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzfna extends WebViewClient {
    final /* synthetic */ zzfnc zza;

    zzfna(zzfnc zzfnc) {
        Objects.requireNonNull(zzfnc);
        this.zza = zzfnc;
    }

    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        String obj = renderProcessGoneDetail.toString();
        String valueOf = String.valueOf(webView);
        Log.w("NativeBridge", "WebView renderer gone: " + obj + "for WebView: " + valueOf);
        zzfnc zzfnc = this.zza;
        if (zzfnc.zza() == webView) {
            Log.w("NativeBridge", "Deallocating the Native bridge as it is unusable. No further events will be generated for this session.");
            zzfnc.zzn((WebView) null);
        }
        webView.destroy();
        return true;
    }
}
