package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzerv implements zzeuc {
    private final zzgdy zza;
    /* access modifiers changed from: private */
    public final zzdvi zzb;

    zzerv(zzgdy zzgdy, zzdvi zzdvi) {
        this.zza = zzgdy;
        this.zzb = zzdvi;
    }

    public final int zza() {
        return 23;
    }

    public final ListenableFuture zzb() {
        return this.zza.zzb(new zzeru(this));
    }
}
