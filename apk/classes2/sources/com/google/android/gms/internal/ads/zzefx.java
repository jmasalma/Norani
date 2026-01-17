package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzefx implements zzgcu {
    public final /* synthetic */ zzegb zza;
    public final /* synthetic */ zzdny zzb;

    public /* synthetic */ zzefx(zzegb zzegb, zzdny zzdny) {
        this.zza = zzegb;
        this.zzb = zzdny;
    }

    public final ListenableFuture zza(Object obj) {
        return zzegb.zzf(this.zza, this.zzb, (JSONObject) obj);
    }
}
