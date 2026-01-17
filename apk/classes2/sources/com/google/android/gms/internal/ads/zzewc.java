package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzewc implements zzeuc {
    final zzgdy zza;
    final List zzb;

    public zzewc(zzbcn zzbcn, zzgdy zzgdy, List list) {
        this.zza = zzgdy;
        this.zzb = list;
    }

    public final int zza() {
        return 48;
    }

    public final ListenableFuture zzb() {
        return this.zza.zzb(new zzewb(this));
    }
}
