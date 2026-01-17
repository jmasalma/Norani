package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzdmn implements zzgcu {
    public final /* synthetic */ zzdmu zza;
    public final /* synthetic */ JSONObject zzb;

    public /* synthetic */ zzdmn(zzdmu zzdmu, JSONObject jSONObject) {
        this.zza = zzdmu;
        this.zzb = jSONObject;
    }

    public final ListenableFuture zza(Object obj) {
        return zzdmu.zzb(this.zza, this.zzb, (zzcfg) obj);
    }
}
