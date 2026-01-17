package com.google.android.gms.internal.ads;

import java.util.List;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzdlx implements zzfve {
    public final /* synthetic */ zzdmc zza;
    public final /* synthetic */ JSONObject zzb;

    public /* synthetic */ zzdlx(zzdmc zzdmc, JSONObject jSONObject) {
        this.zza = zzdmc;
        this.zzb = jSONObject;
    }

    public final Object apply(Object obj) {
        return zzdmc.zza(this.zza, this.zzb, (List) obj);
    }
}
