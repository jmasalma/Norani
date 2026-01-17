package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzcnl implements Runnable {
    public final /* synthetic */ JSONObject zza;
    public final /* synthetic */ zzcfg zzb;

    public /* synthetic */ zzcnl(JSONObject jSONObject, zzcfg zzcfg) {
        this.zza = jSONObject;
        this.zzb = zzcfg;
    }

    public final void run() {
        JSONObject jSONObject = this.zza;
        int i = zze.zza;
        zzo.zze("Calling AFMA_updateActiveView(" + jSONObject.toString() + ")");
        this.zzb.zzp("AFMA_updateActiveView", jSONObject);
    }
}
