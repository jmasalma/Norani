package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzgcl implements Runnable {
    public final /* synthetic */ zzgcn zza;
    public final /* synthetic */ int zzb;
    public final /* synthetic */ ListenableFuture zzc;

    public /* synthetic */ zzgcl(zzgcn zzgcn, int i, ListenableFuture listenableFuture) {
        this.zza = zzgcn;
        this.zzb = i;
        this.zzc = listenableFuture;
    }

    public final void run() {
        this.zza.zzH(this.zzb, this.zzc);
    }
}
