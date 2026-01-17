package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzesc implements zzeuc {
    private final zzfbz zza;

    zzesc(zzfbz zzfbz) {
        this.zza = zzfbz;
    }

    public final int zza() {
        return 25;
    }

    public final ListenableFuture zzb() {
        return zzgdn.zzh(new zzesd(this.zza));
    }
}
