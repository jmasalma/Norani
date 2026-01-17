package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzbkd implements zzbkf {
    zzbkd() {
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcfg zzcfg = (zzcfg) obj;
        if (map.containsKey("start")) {
            zzcfg.zzax(true);
        }
        if (map.containsKey("stop")) {
            zzcfg.zzax(false);
        }
    }
}
