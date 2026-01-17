package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzbkc implements zzbkf {
    zzbkc() {
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcfg zzcfg = (zzcfg) obj;
        if (map.containsKey("start")) {
            zzcfg.zzN().zzp();
        } else if (map.containsKey("stop")) {
            zzcfg.zzN().zzq();
        } else if (map.containsKey("cancel")) {
            zzcfg.zzN().zzo();
        }
    }
}
