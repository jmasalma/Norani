package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzdnm implements zzgcu {
    public final /* synthetic */ zzdny zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ JSONObject zzc;

    public /* synthetic */ zzdnm(zzdny zzdny, String str, JSONObject jSONObject) {
        this.zza = zzdny;
        this.zzb = str;
        this.zzc = jSONObject;
    }

    public final ListenableFuture zza(Object obj) {
        return this.zza.zzh.zzb((zzcfg) obj, this.zzb, this.zzc);
    }
}
