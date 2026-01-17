package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzbjk implements zzbkf {
    zzbjk() {
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        JSONObject zza;
        zzcfg zzcfg = (zzcfg) obj;
        zzbgd zzK = zzcfg.zzK();
        if (zzK == null || (zza = zzK.zza()) == null) {
            zzcfg.zze("nativeAdViewSignalsReady", new JSONObject());
        } else {
            zzcfg.zze("nativeAdViewSignalsReady", zza);
        }
    }
}
