package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzavx {
    private final ListenableFuture zza;

    public zzavx(Context context, Executor executor) {
        this.zza = zzgdn.zzj(new zzavw(this, context), executor);
    }

    public final ListenableFuture zza() {
        return this.zza;
    }
}
