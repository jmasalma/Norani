package com.google.android.gms.ads.nonagon.signalgeneration;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SafeBrowsingResponse;
import android.webkit.SslErrorHandler;
import android.webkit.ValueCallback;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.internal.ads.zzbde;
import com.google.android.gms.internal.ads.zzbfj;
import com.google.android.gms.internal.ads.zzbla;
import com.google.android.gms.internal.ads.zzgdy;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzj extends zzbla {
    private final WebView zza;
    private final zzf zzb;
    private final Executor zzc;
    private WebViewClient zzd;

    public zzj(WebView webView, zzf zzf, zzgdy zzgdy) {
        this.zza = webView;
        this.zzb = zzf;
        this.zzc = zzgdy;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.google.android.gms.ads.nonagon.signalgeneration.zzj, android.webkit.WebViewClient] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void zza(com.google.android.gms.ads.nonagon.signalgeneration.zzj r1) {
        /*
            com.google.android.gms.ads.internal.zzv.zzr()     // Catch:{ IllegalStateException -> 0x0018 }
            android.webkit.WebView r0 = r1.zza     // Catch:{ IllegalStateException -> 0x0018 }
            android.webkit.WebViewClient r0 = r0.getWebViewClient()     // Catch:{ IllegalStateException -> 0x0018 }
            if (r0 != r1) goto L_0x000c
            return
        L_0x000c:
            if (r0 == 0) goto L_0x0010
            r1.zzd = r0
        L_0x0010:
            android.webkit.WebView r0 = r1.zza
            r0.setWebViewClient(r1)
            r1.zzc()
        L_0x0018:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.nonagon.signalgeneration.zzj.zza(com.google.android.gms.ads.nonagon.signalgeneration.zzj):void");
    }

    private final void zzc() {
        this.zza.evaluateJavascript(String.format(Locale.getDefault(), (String) zzbd.zzc().zzb(zzbde.zzkj), new Object[]{this.zzb.zza()}), (ValueCallback) null);
    }

    private final boolean zzd() {
        if (!((Boolean) zzbfj.zza.zze()).booleanValue()) {
            return false;
        }
        Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
        if (allStackTraces == null || !allStackTraces.containsKey(Thread.currentThread())) {
            return true;
        }
        boolean z = false;
        boolean z2 = false;
        for (StackTraceElement className : allStackTraces.get(Thread.currentThread())) {
            if (className.getClassName().contains(getClass().getName())) {
                if (z && z2) {
                    return true;
                }
                z = true;
            } else if (z) {
                z2 = true;
            }
        }
        return false;
    }

    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        if (!zzd()) {
            zzj.super.doUpdateVisitedHistory(webView, str, z);
        }
    }

    /* access modifiers changed from: protected */
    public final WebViewClient getDelegate() {
        return this.zzd;
    }

    public final void onFormResubmission(WebView webView, Message message, Message message2) {
        if (!zzd()) {
            zzj.super.onFormResubmission(webView, message, message2);
        }
    }

    public final void onLoadResource(WebView webView, String str) {
        if (!zzd()) {
            zzj.super.onLoadResource(webView, str);
        }
    }

    public final void onPageCommitVisible(WebView webView, String str) {
        if (!zzd()) {
            zzj.super.onPageCommitVisible(webView, str);
        }
    }

    public final void onPageFinished(WebView webView, String str) {
        if (!zzd()) {
            zzc();
            zzj.super.onPageFinished(webView, str);
        }
    }

    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        if (!zzd()) {
            zzc();
            zzj.super.onPageStarted(webView, str, bitmap);
        }
    }

    public final void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        if (!zzd()) {
            zzj.super.onReceivedClientCertRequest(webView, clientCertRequest);
        }
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        if (!zzd()) {
            zzj.super.onReceivedError(webView, i, str, str2);
        }
    }

    public final void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        if (!zzd()) {
            zzj.super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
        }
    }

    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        if (!zzd()) {
            zzj.super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        }
    }

    public final void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
        if (!zzd()) {
            zzj.super.onReceivedLoginRequest(webView, str, str2, str3);
        }
    }

    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        if (!zzd()) {
            zzj.super.onReceivedSslError(webView, sslErrorHandler, sslError);
        }
    }

    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        if (zzd()) {
            return false;
        }
        return zzj.super.onRenderProcessGone(webView, renderProcessGoneDetail);
    }

    public final void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i, SafeBrowsingResponse safeBrowsingResponse) {
        if (!zzd()) {
            zzj.super.onSafeBrowsingHit(webView, webResourceRequest, i, safeBrowsingResponse);
        }
    }

    public final void onScaleChanged(WebView webView, float f, float f2) {
        if (!zzd()) {
            zzj.super.onScaleChanged(webView, f, f2);
        }
    }

    public final void onTooManyRedirects(WebView webView, Message message, Message message2) {
        if (!zzd()) {
            zzj.super.onTooManyRedirects(webView, message, message2);
        }
    }

    public final void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        if (!zzd()) {
            zzj.super.onUnhandledKeyEvent(webView, keyEvent);
        }
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (zzd()) {
            return null;
        }
        return zzj.super.shouldInterceptRequest(webView, webResourceRequest);
    }

    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        if (zzd()) {
            return false;
        }
        return zzj.super.shouldOverrideKeyEvent(webView, keyEvent);
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        if (zzd()) {
            return false;
        }
        return zzj.super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }

    public final void zzb() {
        this.zzc.execute(new zzh(this));
    }

    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (!zzd()) {
            zzj.super.onReceivedError(webView, webResourceRequest, webResourceError);
        }
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        if (zzd()) {
            return null;
        }
        return zzj.super.shouldInterceptRequest(webView, str);
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (zzd()) {
            return false;
        }
        return zzj.super.shouldOverrideUrlLoading(webView, str);
    }
}
