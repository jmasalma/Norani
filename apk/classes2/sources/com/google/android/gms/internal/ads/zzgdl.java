package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzgdl {
    private final boolean zza;
    private final zzfyq zzb;

    /* synthetic */ zzgdl(boolean z, zzfyq zzfyq, zzgdm zzgdm) {
        this.zza = z;
        this.zzb = zzfyq;
    }

    public final ListenableFuture zza(Callable callable, Executor executor) {
        return new zzgda(this.zzb, this.zza, executor, callable);
    }
}
