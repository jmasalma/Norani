package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbd;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzfcz {
    private final JSONObject zza;

    public zzfcz(JSONObject jSONObject) {
        this.zza = jSONObject;
    }

    public final String zza() {
        if (zzc() - 1 != 1) {
            return "javascript";
        }
        return null;
    }

    public final boolean zzb() {
        zzbcv zzbcv = zzbde.zzfE;
        return this.zza.optBoolean((String) zzbd.zzc().zzb(zzbcv), true);
    }

    public final int zzc() {
        int optInt = this.zza.optInt("media_type", -1);
        if (optInt != 0) {
            return optInt != 1 ? 3 : 1;
        }
        return 2;
    }
}
