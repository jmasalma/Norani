package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbd;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzclr implements zzclh {
    private final zzdvi zza;

    zzclr(zzdvi zzdvi) {
        this.zza = zzdvi;
    }

    public final void zza(JSONObject jSONObject) {
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzjF)).booleanValue()) {
            this.zza.zzn(jSONObject);
        }
    }
}
