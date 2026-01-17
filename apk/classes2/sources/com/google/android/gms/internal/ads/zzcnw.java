package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzcnw implements Runnable {
    public final /* synthetic */ zzcnx zza;
    public final /* synthetic */ JSONObject zzb;

    public /* synthetic */ zzcnw(zzcnx zzcnx, JSONObject jSONObject) {
        this.zza = zzcnx;
        this.zzb = jSONObject;
    }

    public final void run() {
        zzcnx.zza(this.zza, this.zzb);
    }
}
