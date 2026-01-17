package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzdlv implements zzgcu {
    public final /* synthetic */ ListenableFuture zza;

    public /* synthetic */ zzdlv(ListenableFuture listenableFuture) {
        this.zza = listenableFuture;
    }

    public final ListenableFuture zza(Object obj) {
        zzcfg zzcfg = (zzcfg) obj;
        if (zzcfg != null && zzcfg.zzq() != null) {
            return this.zza;
        }
        throw new zzehf(1, "Retrieve video view in html5 ad response failed.");
    }
}
