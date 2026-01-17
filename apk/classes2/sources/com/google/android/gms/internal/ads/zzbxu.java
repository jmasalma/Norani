package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzbxu implements zzgdj {
    final /* synthetic */ ListenableFuture zza;

    zzbxu(zzbxv zzbxv, ListenableFuture listenableFuture) {
        this.zza = listenableFuture;
        Objects.requireNonNull(zzbxv);
    }

    public final void zza(Throwable th) {
        zzbxv.zzc.remove(this.zza);
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Void voidR = (Void) obj;
        zzbxv.zzc.remove(this.zza);
    }
}
