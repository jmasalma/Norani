package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzdkd implements zzbkf {
    public final /* synthetic */ zzdkh zza;

    public /* synthetic */ zzdkd(zzdkh zzdkh) {
        this.zza = zzdkh;
    }

    public final void zza(Object obj, Map map) {
        zzcfg zzcfg = (zzcfg) obj;
        zzcfg.zzN().zzC(new zzdkg(this.zza, map));
        String str = (String) map.get("overlayHtml");
        String str2 = (String) map.get("baseUrl");
        if (TextUtils.isEmpty(str2)) {
            zzcfg.loadData(str, "text/html", "UTF-8");
        } else {
            zzcfg.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", (String) null);
        }
    }
}
