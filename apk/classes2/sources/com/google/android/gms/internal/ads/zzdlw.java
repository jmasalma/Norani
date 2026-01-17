package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzdlw implements zzgcu {
    public final /* synthetic */ ListenableFuture zza;

    public /* synthetic */ zzdlw(ListenableFuture listenableFuture) {
        this.zza = listenableFuture;
    }

    public final ListenableFuture zza(Object obj) {
        return obj != null ? this.zza : zzgdn.zzg(new zzehf(1, "Retrieve required value in native ad response failed."));
    }
}
