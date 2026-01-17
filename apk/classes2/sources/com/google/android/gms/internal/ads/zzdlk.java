package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzdlk implements Callable {
    public final /* synthetic */ zzdln zza;
    public final /* synthetic */ zzfcn zzb;
    public final /* synthetic */ zzfca zzc;
    public final /* synthetic */ JSONObject zzd;

    public /* synthetic */ zzdlk(zzdln zzdln, zzfcn zzfcn, zzfca zzfca, JSONObject jSONObject) {
        this.zza = zzdln;
        this.zzb = zzfcn;
        this.zzc = zzfca;
        this.zzd = jSONObject;
    }

    public final Object call() {
        return zzdln.zzb(this.zza, this.zzb, this.zzc, this.zzd);
    }
}
