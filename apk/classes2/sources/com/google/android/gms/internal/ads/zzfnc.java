package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.webkit.WebView;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzfnc extends zzfmy {
    /* access modifiers changed from: private */
    public WebView zza;
    private Long zzb = null;
    private final Map zzc;

    public zzfnc(String str, Map map, String str2) {
        super(str);
        this.zzc = map;
    }

    public final void zzc() {
        long j;
        super.zzc();
        if (this.zzb == null) {
            j = 4000;
        } else {
            j = TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.zzb.longValue(), TimeUnit.NANOSECONDS);
        }
        new Handler().postDelayed(new zzfnb(this), Math.max(4000 - j, 2000));
        this.zza = null;
    }

    public final void zzi(zzflp zzflp, zzfln zzfln) {
        JSONObject jSONObject = new JSONObject();
        Map zzi = zzfln.zzi();
        Iterator it = zzi.keySet().iterator();
        if (!it.hasNext()) {
            zzj(zzflp, zzfln, jSONObject);
        } else {
            zzflz zzflz = (zzflz) zzi.get((String) it.next());
            throw null;
        }
    }

    public final void zzo() {
        WebView webView = new WebView(zzfmn.zzb().zza());
        this.zza = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.zza.getSettings().setAllowContentAccess(false);
        this.zza.getSettings().setAllowFileAccess(false);
        this.zza.setWebViewClient(new zzfna(this));
        zzn(this.zza);
        zzfmp.zzk(this.zza, (String) null);
        Map map = this.zzc;
        Iterator it = map.keySet().iterator();
        if (!it.hasNext()) {
            this.zzb = Long.valueOf(System.nanoTime());
        } else {
            zzflz zzflz = (zzflz) map.get((String) it.next());
            throw null;
        }
    }
}
