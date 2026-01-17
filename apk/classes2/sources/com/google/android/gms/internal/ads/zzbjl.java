package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzbjl implements zzbkf {
    zzbjl() {
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        JSONObject zzb;
        zzcfg zzcfg = (zzcfg) obj;
        zzbgd zzK = zzcfg.zzK();
        if (zzK == null || (zzb = zzK.zzb()) == null) {
            zzcfg.zze("nativeClickMetaReady", new JSONObject());
        } else {
            zzcfg.zze("nativeClickMetaReady", zzb);
        }
    }
}
