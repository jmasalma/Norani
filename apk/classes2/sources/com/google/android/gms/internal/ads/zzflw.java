package com.google.android.gms.internal.ads;

import android.view.View;
import android.webkit.WebView;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewFeature;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Timer;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzflw {
    private final zzfly zza;
    private final WebView zzb;
    private zzfnz zzc;
    private final HashMap zzd;
    private final zzfmm zze = new zzfmm();

    private zzflw(zzfly zzfly, WebView webView, boolean z) {
        HashMap hashMap = new HashMap();
        this.zzd = hashMap;
        zzfni.zza();
        this.zza = zzfly;
        this.zzb = webView;
        if (zza() != webView) {
            for (zzfll zzd2 : hashMap.values()) {
                zzd2.zzd(webView);
            }
            this.zzc = new zzfnz(webView);
        }
        if (WebViewFeature.isFeatureSupported("WEB_MESSAGE_LISTENER")) {
            zzh();
            zzflv zzflv = new zzflv(this);
            WebViewCompat.addWebMessageListener(this.zzb, "omidJsSessionService", new HashSet(Arrays.asList(new String[]{"*"})), zzflv);
            return;
        }
        throw new UnsupportedOperationException("The JavaScriptSessionService cannot be supported in this WebView version.");
    }

    public static zzflw zzb(zzfly zzfly, WebView webView, boolean z) {
        return new zzflw(zzfly, webView, true);
    }

    static /* bridge */ /* synthetic */ void zzc(zzflw zzflw, String str) {
        HashMap hashMap = zzflw.zzd;
        zzfll zzfll = (zzfll) hashMap.get(str);
        if (zzfll != null) {
            zzfll.zzc();
            hashMap.remove(str);
        }
    }

    static /* bridge */ /* synthetic */ void zze(zzflw zzflw, String str) {
        zzflq zzflq = zzflq.DEFINED_BY_JAVASCRIPT;
        zzflt zzflt = zzflt.DEFINED_BY_JAVASCRIPT;
        zzflx zzflx = zzflx.JAVASCRIPT;
        zzflp zzflp = new zzflp(zzflm.zza(zzflq, zzflt, zzflx, zzflx, false), zzfln.zzb(zzflw.zza, zzflw.zzb, (String) null, (String) null), str);
        zzflw.zzd.put(str, zzflp);
        zzflp.zzd(zzflw.zza());
        for (zzfml zzfml : zzflw.zze.zza()) {
            zzflp.zzb((View) zzfml.zzb().get(), zzfml.zza(), zzfml.zzc());
        }
        zzflp.zze();
    }

    /* access modifiers changed from: private */
    public final void zzh() {
        WebViewCompat.removeWebMessageListener(this.zzb, "omidJsSessionService");
    }

    /* access modifiers changed from: package-private */
    public final View zza() {
        zzfnz zzfnz = this.zzc;
        if (zzfnz == null) {
            return null;
        }
        return (View) zzfnz.get();
    }

    public final void zzf(View view, zzfls zzfls, String str) {
        for (zzfll zzb2 : this.zzd.values()) {
            zzb2.zzb(view, zzfls, "Ad overlay");
        }
        this.zze.zzb(view, zzfls, "Ad overlay");
    }

    public final void zzg(zzcfx zzcfx) {
        for (zzfll zzc2 : this.zzd.values()) {
            zzc2.zzc();
        }
        Timer timer = new Timer();
        timer.schedule(new zzflu(this, zzcfx, timer), 1000);
    }
}
