package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public class zzgde extends zzgdo {
    zzgde() {
    }

    public static zzgde zzw(ListenableFuture listenableFuture) {
        if (listenableFuture instanceof zzgde) {
            return (zzgde) listenableFuture;
        }
        return new zzgdf(listenableFuture);
    }
}
