package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Message;
import android.view.View;
import android.view.WindowManager;
import android.webkit.ConsoleMessage;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzv;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzcff extends WebChromeClient {
    private final zzcfg zza;

    public zzcff(zzcfg zzcfg) {
        this.zza = zzcfg;
    }

    private static final Context zzb(WebView webView) {
        if (!(webView instanceof zzcfg)) {
            return webView.getContext();
        }
        zzcfg zzcfg = (zzcfg) webView;
        Activity zzi = zzcfg.zzi();
        if (zzi != null) {
            return zzi;
        }
        return zzcfg.getContext();
    }

    public final void onCloseWindow(WebView webView) {
        if (!(webView instanceof zzcfg)) {
            int i = zze.zza;
            zzo.zzj("Tried to close a WebView that wasn't an AdWebView.");
            return;
        }
        zzm zzL = ((zzcfg) webView).zzL();
        if (zzL == null) {
            int i2 = zze.zza;
            zzo.zzj("Tried to close an AdWebView not associated with an overlay.");
            return;
        }
        zzL.zzb();
    }

    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String str = "JS: " + consoleMessage.message() + " (" + consoleMessage.sourceId() + ":" + consoleMessage.lineNumber() + ")";
        if (str.contains("Application Cache")) {
            return super.onConsoleMessage(consoleMessage);
        }
        int i = zzcfe.zza[consoleMessage.messageLevel().ordinal()];
        if (i == 1) {
            int i2 = zze.zza;
            zzo.zzg(str);
        } else if (i == 2) {
            int i3 = zze.zza;
            zzo.zzj(str);
        } else if (i == 3 || i == 4) {
            int i4 = zze.zza;
            zzo.zzi(str);
        } else if (i != 5) {
            int i5 = zze.zza;
            zzo.zzi(str);
        } else {
            int i6 = zze.zza;
            zzo.zze(str);
        }
        return super.onConsoleMessage(consoleMessage);
    }

    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        WebView.WebViewTransport webViewTransport = (WebView.WebViewTransport) message.obj;
        WebView webView2 = new WebView(webView.getContext());
        zzcfg zzcfg = this.zza;
        if (zzcfg.zzH() != null) {
            webView2.setWebViewClient(zzcfg.zzH());
        }
        webViewTransport.setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    public final void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, WebStorage.QuotaUpdater quotaUpdater) {
        long j4 = 5242880 - j3;
        if (j4 <= 0) {
            quotaUpdater.updateQuota(j);
            return;
        }
        if (j == 0) {
            if (j2 > j4 || j2 > 1048576) {
                j2 = 0;
            }
        } else if (j2 == 0) {
            j2 = Math.min(j + Math.min(131072, j4), 1048576);
        } else {
            if (j2 <= Math.min(1048576 - j, j4)) {
                j += j2;
            }
            j2 = j;
        }
        quotaUpdater.updateQuota(j2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x003a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onGeolocationPermissionsShowPrompt(java.lang.String r6, android.webkit.GeolocationPermissions.Callback r7) {
        /*
            r5 = this;
            if (r7 == 0) goto L_0x005a
            com.google.android.gms.internal.ads.zzcfg r0 = r5.zza
            com.google.android.gms.ads.internal.zzv.zzr()
            android.content.Context r1 = r0.getContext()
            java.lang.String r2 = "android.permission.ACCESS_FINE_LOCATION"
            boolean r1 = com.google.android.gms.ads.internal.util.zzs.zzB(r1, r2)
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L_0x0027
            com.google.android.gms.ads.internal.zzv.zzr()
            android.content.Context r0 = r0.getContext()
            java.lang.String r1 = "android.permission.ACCESS_COARSE_LOCATION"
            boolean r0 = com.google.android.gms.ads.internal.util.zzs.zzB(r0, r1)
            if (r0 == 0) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            r0 = r2
            goto L_0x0028
        L_0x0027:
            r0 = r3
        L_0x0028:
            com.google.android.gms.internal.ads.zzbcv r1 = com.google.android.gms.internal.ads.zzbde.zznC
            com.google.android.gms.internal.ads.zzbdc r4 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r1 = r4.zzb(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x003e
            r7.invoke(r6, r2, r3)
            goto L_0x0041
        L_0x003e:
            r7.invoke(r6, r0, r3)
        L_0x0041:
            com.google.android.gms.internal.ads.zzbcv r6 = com.google.android.gms.internal.ads.zzbde.zznD
            com.google.android.gms.internal.ads.zzbdc r7 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r6 = r7.zzb(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L_0x005a
            int r6 = com.google.android.gms.ads.internal.util.zze.zza
            java.lang.String r6 = "AdWebChromeClient.onGeolocationPermissionsShowPrompt()"
            com.google.android.gms.ads.internal.util.client.zzo.zze(r6)
        L_0x005a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcff.onGeolocationPermissionsShowPrompt(java.lang.String, android.webkit.GeolocationPermissions$Callback):void");
    }

    public final void onHideCustomView() {
        zzm zzL = this.zza.zzL();
        if (zzL == null) {
            int i = zze.zza;
            zzo.zzj("Could not get ad overlay when hiding custom view.");
            return;
        }
        zzL.zzg();
    }

    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return zza(zzb(webView), "alert", str, str2, (String) null, jsResult, (JsPromptResult) null, false);
    }

    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        return zza(zzb(webView), "onBeforeUnload", str, str2, (String) null, jsResult, (JsPromptResult) null, false);
    }

    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return zza(zzb(webView), "confirm", str, str2, (String) null, jsResult, (JsPromptResult) null, false);
    }

    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return zza(zzb(webView), "prompt", str, str2, str3, (JsResult) null, jsPromptResult, true);
    }

    @Deprecated
    public final void onShowCustomView(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
        zzm zzL = this.zza.zzL();
        if (zzL == null) {
            int i2 = zze.zza;
            zzo.zzj("Could not get ad overlay when showing custom view.");
            customViewCallback.onCustomViewHidden();
            return;
        }
        zzL.zzC(view, customViewCallback);
        zzL.zzA(i);
    }

    /* access modifiers changed from: protected */
    public final boolean zza(Context context, String str, String str2, String str3, String str4, JsResult jsResult, JsPromptResult jsPromptResult, boolean z) {
        zzb zzd;
        try {
            zzcfg zzcfg = this.zza;
            if (zzcfg == null || zzcfg.zzN() == null || zzcfg.zzN().zzd() == null || (zzd = zzcfg.zzN().zzd()) == null || zzd.zzc()) {
                zzv.zzr();
                AlertDialog.Builder zzL = zzs.zzL(context);
                zzL.setTitle(str2);
                if (z) {
                    LinearLayout linearLayout = new LinearLayout(context);
                    linearLayout.setOrientation(1);
                    TextView textView = new TextView(context);
                    textView.setText(str3);
                    EditText editText = new EditText(context);
                    editText.setText(str4);
                    linearLayout.addView(textView);
                    linearLayout.addView(editText);
                    zzL.setView(linearLayout).setPositiveButton(17039370, new zzcfd(jsPromptResult, editText)).setNegativeButton(17039360, new zzcfc(jsPromptResult)).setOnCancelListener(new zzcfb(jsPromptResult)).create().show();
                } else {
                    zzL.setMessage(str3).setPositiveButton(17039370, new zzcfa(jsResult)).setNegativeButton(17039360, new zzcez(jsResult)).setOnCancelListener(new zzcey(jsResult)).create().show();
                }
                return true;
            }
            zzd.zzb("window." + str + "('" + str3 + "')");
            return false;
        } catch (WindowManager.BadTokenException e) {
            int i = zze.zza;
            zzo.zzk("Fail to display Dialog.", e);
        }
    }

    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        onShowCustomView(view, -1, customViewCallback);
    }
}
