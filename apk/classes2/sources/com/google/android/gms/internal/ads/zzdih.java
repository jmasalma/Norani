package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzdih implements Runnable {
    public final /* synthetic */ zzcfg zza;
    public final /* synthetic */ JSONObject zzb;

    public /* synthetic */ zzdih(zzcfg zzcfg, JSONObject jSONObject) {
        this.zza = zzcfg;
        this.zzb = jSONObject;
    }

    public final void run() {
        zzfyq zzfyq = zzdio.zzc;
        this.zza.zze("onVideoEvent", this.zzb);
    }
}
