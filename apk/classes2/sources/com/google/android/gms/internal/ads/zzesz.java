package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzesz implements zzeuc {
    private final String zza;
    private final int zzb;

    zzesz(String str, int i) {
        this.zza = str;
        this.zzb = i;
    }

    public final int zza() {
        return 31;
    }

    public final ListenableFuture zzb() {
        return zzgdn.zzh(new zzeta(this.zza, this.zzb));
    }
}
