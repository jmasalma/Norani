package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import org.json.JSONArray;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzefz implements zzgcu {
    public final /* synthetic */ zzegb zza;
    public final /* synthetic */ zzfcn zzb;
    public final /* synthetic */ zzfca zzc;

    public /* synthetic */ zzefz(zzegb zzegb, zzfcn zzfcn, zzfca zzfca) {
        this.zza = zzegb;
        this.zzb = zzfcn;
        this.zzc = zzfca;
    }

    public final ListenableFuture zza(Object obj) {
        return zzegb.zzd(this.zza, this.zzb, this.zzc, (JSONArray) obj);
    }
}
