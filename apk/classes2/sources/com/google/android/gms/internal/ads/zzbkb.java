package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzbkb implements zzbkf {
    zzbkb() {
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcfg zzcfg = (zzcfg) obj;
        String str = (String) map.get("action");
        if ("pause".equals(str)) {
            zzcfg.zzdg();
        } else if ("resume".equals(str)) {
            zzcfg.zzdh();
        }
    }
}
