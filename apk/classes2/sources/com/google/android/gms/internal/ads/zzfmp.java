package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import kotlin.text.Typography;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzfmp {
    private static final zzfmp zza = new zzfmp();

    private zzfmp() {
    }

    public static final zzfmp zza() {
        return zza;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        return true;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0012 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean zzk(android.webkit.WebView r3, java.lang.String r4) {
        /*
            java.lang.String r0 = "javascript: "
            r1 = 0
            if (r3 == 0) goto L_0x002b
            boolean r2 = android.text.TextUtils.isEmpty(r4)
            if (r2 != 0) goto L_0x002b
            r2 = 0
            r3.evaluateJavascript(r4, r2)     // Catch:{ IllegalStateException -> 0x0012 }
            goto L_0x0021
        L_0x0010:
            r3 = move-exception
            goto L_0x0023
        L_0x0012:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0010 }
            r2.<init>(r0)     // Catch:{ Exception -> 0x0010 }
            r2.append(r4)     // Catch:{ Exception -> 0x0010 }
            java.lang.String r4 = r2.toString()     // Catch:{ Exception -> 0x0010 }
            r3.loadUrl(r4)     // Catch:{ Exception -> 0x0010 }
        L_0x0021:
            r3 = 1
            return r3
        L_0x0023:
            r3.getMessage()
            java.lang.Boolean r3 = com.google.android.gms.internal.ads.zzfli.zza
            r3.booleanValue()
        L_0x002b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfmp.zzk(android.webkit.WebView, java.lang.String):boolean");
    }

    public final void zzc(WebView webView, String str) {
        zzb(webView, "finishSession", str);
    }

    public final void zzd(WebView webView, String str, JSONObject jSONObject) {
        zzb(webView, "init", jSONObject, str);
    }

    public final void zze(WebView webView, String str, float f) {
        zzb(webView, "setDeviceVolume", Float.valueOf(f), str);
    }

    public final void zzf(WebView webView, JSONObject jSONObject) {
        zzb(webView, "setLastActivity", jSONObject);
    }

    public final void zzg(WebView webView, String str, String str2) {
        zzb(webView, "setDeviceLockState", str2);
    }

    public final void zzh(WebView webView, String str, String str2) {
        zzb(webView, "setNativeViewHierarchy", str2, str);
    }

    public final void zzi(WebView webView, String str, String str2) {
        zzb(webView, "setState", str2, str);
    }

    public final void zzj(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        zzb(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }

    /* access modifiers changed from: package-private */
    public final void zzb(WebView webView, String str, Object... objArr) {
        if (webView != null) {
            StringBuilder sb = new StringBuilder(128);
            sb.append("if(window.omidBridge!==undefined){omidBridge.");
            sb.append(str);
            sb.append("(");
            for (Object obj : objArr) {
                if (obj == null) {
                    sb.append("null");
                } else if (obj instanceof String) {
                    String obj2 = obj.toString();
                    if (obj2.startsWith("{")) {
                        sb.append(obj2);
                    } else {
                        sb.append(Typography.quote);
                        sb.append(obj2);
                        sb.append(Typography.quote);
                    }
                } else {
                    sb.append(obj);
                }
                sb.append(",");
            }
            sb.setLength(sb.length() - 1);
            sb.append(")}");
            String sb2 = sb.toString();
            Handler handler = webView.getHandler();
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            if (Looper.myLooper() == handler.getLooper()) {
                zzk(webView, sb2);
            } else {
                handler.post(new zzfmo(this, webView, sb2));
            }
        } else {
            zzfli.zza.booleanValue();
        }
    }
}
