package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzevq implements zzeuc {
    final zzgdy zza;

    public zzevq(zzbbr zzbbr, zzgdy zzgdy, Context context) {
        this.zza = zzgdy;
    }

    public final int zza() {
        return 45;
    }

    public final ListenableFuture zzb() {
        return this.zza.zzb(new zzevp(this));
    }
}
