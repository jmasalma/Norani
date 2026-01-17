package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.zzv;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzcmc implements zzclg {
    private final CookieManager zza;

    public zzcmc(Context context) {
        this.zza = zzv.zzs().zza(context);
    }

    public final void zza(Map map) {
        CookieManager cookieManager = this.zza;
        if (cookieManager != null) {
            if (((String) map.get("clear")) != null) {
                String str = (String) zzbd.zzc().zzb(zzbde.zzbc);
                String cookie = cookieManager.getCookie(str);
                if (cookie != null) {
                    List zzf = zzfwe.zzb(zzfva.zzc(';')).zzf(cookie);
                    int i = 0;
                    while (i < zzf.size()) {
                        Iterator it = zzfwe.zzb(zzfva.zzc('=')).zzd((String) zzf.get(i)).iterator();
                        it.getClass();
                        if (it.hasNext()) {
                            cookieManager.setCookie(str, String.valueOf((String) it.next()).concat(String.valueOf((String) zzbd.zzc().zzb(zzbde.zzaO))));
                            i++;
                        } else {
                            throw new IndexOutOfBoundsException("position (0) must be less than the number of elements that remained (" + 0 + ")");
                        }
                    }
                    return;
                }
                return;
            }
            String str2 = (String) map.get("cookie");
            if (!TextUtils.isEmpty(str2)) {
                cookieManager.setCookie((String) zzbd.zzc().zzb(zzbde.zzbc), str2);
            }
        }
    }
}
