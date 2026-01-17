package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzerg implements zzeuc {
    private final Context zza;
    private final zzgdy zzb;

    zzerg(zzgdy zzgdy, Context context) {
        this.zzb = zzgdy;
        this.zza = context;
    }

    public final int zza() {
        return 57;
    }

    public final ListenableFuture zzb() {
        return this.zzb.zzb(new zzerf(this));
    }
}
