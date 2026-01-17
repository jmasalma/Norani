package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzdxx implements zzgcu {
    public final /* synthetic */ zzdyb zza;

    public /* synthetic */ zzdxx(zzdyb zzdyb) {
        this.zza = zzdyb;
    }

    public final ListenableFuture zza(Object obj) {
        return zzdyb.zzc(this.zza, (JSONObject) obj);
    }
}
