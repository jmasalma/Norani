package com.google.android.gms.internal.consent_sdk;

import android.util.Log;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.2.0 */
final class zzbt extends WebViewClient {
    final /* synthetic */ zzbv zza;

    /* synthetic */ zzbt(zzbv zzbv, zzbu zzbu) {
        this.zza = zzbv;
    }

    public final void onLoadResource(WebView webView, String str) {
        zzbv zzbv = this.zza;
        if (zzbv.zzf(zzbv, str)) {
            zzbv.zzb.zze(str);
        }
    }

    public final void onPageFinished(WebView webView, String str) {
        zzbv zzbv = this.zza;
        if (!zzbv.zzc) {
            Log.d("UserMessagingPlatform", "Wall html loaded.");
            zzbv.zzc = true;
        }
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        this.zza.zzb.zzf(i, str, str2);
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        String uri = webResourceRequest.getUrl().toString();
        zzbv zzbv = this.zza;
        if (!zzbv.zzf(zzbv, uri)) {
            return false;
        }
        zzbv.zzb.zze(uri);
        return true;
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        zzbv zzbv = this.zza;
        if (!zzbv.zzf(zzbv, str)) {
            return false;
        }
        zzbv.zzb.zze(str);
        return true;
    }
}
