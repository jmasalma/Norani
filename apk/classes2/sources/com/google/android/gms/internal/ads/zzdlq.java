package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzdlq implements zzgcu {
    public final /* synthetic */ ListenableFuture zza;

    public /* synthetic */ zzdlq(ListenableFuture listenableFuture) {
        this.zza = listenableFuture;
    }

    public final ListenableFuture zza(Object obj) {
        if (((zzcfg) obj) != null) {
            return this.zza;
        }
        throw new zzehf(1, "Retrieve Web View from image ad response failed.");
    }
}
