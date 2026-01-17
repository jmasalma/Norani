package com.google.android.gms.internal.ads;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import java.io.File;
import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public class zzcgo extends zzcfo {
    public zzcgo(zzcfg zzcfg, zzbcc zzbcc, boolean z, zzecl zzecl) {
        super(zzcfg, zzbcc, z, new zzbst(zzcfg, zzcfg.zzE(), new zzbcm(zzcfg.getContext())), (zzbso) null, zzecl);
    }

    /* access modifiers changed from: protected */
    public final WebResourceResponse zzY(WebView webView, String str, Map map) {
        String str2;
        if (!(webView instanceof zzcfg)) {
            int i = zze.zza;
            zzo.zzj("Tried to intercept request from a WebView that wasn't an AdWebView.");
            return null;
        }
        zzcfg zzcfg = (zzcfg) webView;
        zzbya zzbya = this.zza;
        if (zzbya != null) {
            zzbya.zze(str, map, 1);
        }
        zzfqs.zza();
        zzfqy zzfqy = zzfqy.zza;
        if (!"mraid.js".equalsIgnoreCase(new File(str).getName())) {
            if (map == null) {
                map = Collections.emptyMap();
            }
            return super.zzc(str, map);
        }
        if (zzcfg.zzN() != null) {
            zzcfg.zzN().zzI();
        }
        if (zzcfg.zzO().zzi()) {
            str2 = (String) zzbd.zzc().zzb(zzbde.zzaf);
        } else if (zzcfg.zzaF()) {
            str2 = (String) zzbd.zzc().zzb(zzbde.zzae);
        } else {
            str2 = (String) zzbd.zzc().zzb(zzbde.zzad);
        }
        zzv.zzr();
        return zzs.zzy(zzcfg.getContext(), zzcfg.zzm().afmaVersion, str2);
    }
}
