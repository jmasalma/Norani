package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzcle {
    private final Map zza;
    private final Map zzb;

    zzcle(Map map, Map map2) {
        this.zza = map;
        this.zzb = map2;
    }

    public final void zza(zzfcn zzfcn) throws Exception {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        for (zzfcl zzfcl : zzfcn.zzb.zzc) {
            Map map = this.zza;
            String str = zzfcl.zza;
            if (!map.containsKey(str) || (jSONObject2 = zzfcl.zzb) == null) {
                Map map2 = this.zzb;
                if (map2.containsKey(str) && (jSONObject = zzfcl.zzb) != null) {
                    zzclg zzclg = (zzclg) map2.get(str);
                    HashMap hashMap = new HashMap();
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        String optString = jSONObject.optString(next);
                        if (optString != null) {
                            hashMap.put(next, optString);
                        }
                    }
                    zzclg.zza(hashMap);
                }
            } else {
                ((zzclh) map.get(str)).zza(jSONObject2);
            }
        }
    }
}
