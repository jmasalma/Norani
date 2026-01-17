package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzehw implements zzedo {
    private final Map zza = new HashMap();
    private final zzdpz zzb;

    public zzehw(zzdpz zzdpz) {
        this.zzb = zzdpz;
    }

    public final zzedp zza(String str, JSONObject jSONObject) throws zzfdd {
        zzedp zzedp;
        synchronized (this) {
            Map map = this.zza;
            zzedp = (zzedp) map.get(str);
            if (zzedp == null) {
                zzedp = new zzedp(this.zzb.zzc(str, jSONObject), new zzefe(), str);
                map.put(str, zzedp);
            }
        }
        return zzedp;
    }
}
