package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzdxz implements zzgcu {
    public final /* synthetic */ zzdyb zza;
    public final /* synthetic */ List zzb;

    public /* synthetic */ zzdxz(zzdyb zzdyb, List list) {
        this.zza = zzdyb;
        this.zzb = list;
    }

    public final ListenableFuture zza(Object obj) {
        return zzdyb.zzb(this.zza, this.zzb, (Exception) obj);
    }
}
