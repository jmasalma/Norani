package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.WebResourceResponse;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.internal.ads.zzbcc;
import com.google.android.gms.internal.ads.zzcfg;
import com.google.android.gms.internal.ads.zzcfo;
import com.google.android.gms.internal.ads.zzcgp;
import com.google.android.gms.internal.ads.zzecl;
import java.io.InputStream;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public class zzt extends zzaa {
    public zzt() {
        super((zzz) null);
    }

    public final CookieManager zza(Context context) {
        zzv.zzr();
        if (zzs.zzG()) {
            return null;
        }
        try {
            return CookieManager.getInstance();
        } catch (Throwable th) {
            int i = zze.zza;
            zzo.zzh("Failed to obtain CookieManager.", th);
            zzv.zzp().zzv(th, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    public final WebResourceResponse zzb(String str, String str2, int i, String str3, Map map, InputStream inputStream) {
        return new WebResourceResponse(str, str2, i, str3, map, inputStream);
    }

    public final zzcfo zzc(zzcfg zzcfg, zzbcc zzbcc, boolean z, zzecl zzecl) {
        return new zzcgp(zzcfg, zzbcc, z, zzecl);
    }
}
