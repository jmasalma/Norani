package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzcrm implements zzgcu {
    public final /* synthetic */ zzcrp zza;
    public final /* synthetic */ zzgdj zzb;
    public final /* synthetic */ ListenableFuture zzc;

    public /* synthetic */ zzcrm(zzcrp zzcrp, zzgdj zzgdj, ListenableFuture listenableFuture) {
        this.zza = zzcrp;
        this.zzb = zzgdj;
        this.zzc = listenableFuture;
    }

    public final ListenableFuture zza(Object obj) {
        return zzcrp.zza(this.zza, this.zzb, this.zzc, (zzcra) obj);
    }
}
