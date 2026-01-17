package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzdxw implements zzgcu {
    public final /* synthetic */ zzdyb zza;
    public final /* synthetic */ zzbom zzb;

    public /* synthetic */ zzdxw(zzdyb zzdyb, zzbom zzbom) {
        this.zza = zzdyb;
        this.zzb = zzbom;
    }

    public final ListenableFuture zza(Object obj) {
        return zzdyb.zzd(this.zza, this.zzb, (JSONObject) obj);
    }
}
