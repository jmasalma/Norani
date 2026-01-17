package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzetz implements zzeuc {
    private final zzgdy zza;
    private final Context zzb;

    zzetz(zzgdy zzgdy, Context context) {
        this.zza = zzgdy;
        this.zzb = context;
    }

    public final int zza() {
        return 37;
    }

    public final ListenableFuture zzb() {
        return this.zza.zzb(new zzetx(this));
    }
}
