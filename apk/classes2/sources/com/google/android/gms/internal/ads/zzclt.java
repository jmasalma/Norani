package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.zzv;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzclt implements zzclg {
    zzclt() {
    }

    public final void zza(Map map) {
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzkQ)).booleanValue() && !map.isEmpty()) {
            String str = (String) map.get("is_topics_ad_personalization_allowed");
            if (!TextUtils.isEmpty(str)) {
                zzv.zzp().zzi().zzE(Boolean.parseBoolean(str));
            }
        }
    }
}
