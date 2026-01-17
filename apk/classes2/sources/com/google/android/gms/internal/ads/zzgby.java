package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzgby extends zzgca {
    zzgby(ListenableFuture listenableFuture, Class cls, zzgcu zzgcu) {
        super(listenableFuture, cls, zzgcu);
    }

    /* access modifiers changed from: package-private */
    public final /* bridge */ /* synthetic */ Object zze(Object obj, Throwable th) throws Exception {
        zzgcu zzgcu = (zzgcu) obj;
        ListenableFuture zza = zzgcu.zza(th);
        zzfvp.zzd(zza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzgcu);
        return zza;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzf(Object obj) {
        zzn((ListenableFuture) obj);
    }
}
