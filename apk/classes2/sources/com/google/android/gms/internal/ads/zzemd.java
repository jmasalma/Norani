package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzemd implements zzeuc {
    private final Clock zza;
    private final zzfcw zzb;

    zzemd(Clock clock, zzfcw zzfcw) {
        this.zza = clock;
        this.zzb = zzfcw;
    }

    public final int zza() {
        return 4;
    }

    public final ListenableFuture zzb() {
        return zzgdn.zzh(new zzeme(this.zzb, this.zza.currentTimeMillis()));
    }
}
