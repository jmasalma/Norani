package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nonagon.signalgeneration.zzaa;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzerk implements zzeuc {
    private final zzgdy zza;
    private final zzfcw zzb;

    zzerk(zzgdy zzgdy, zzfcw zzfcw) {
        this.zza = zzgdy;
        this.zzb = zzfcw;
    }

    public static /* synthetic */ zzerl zzc(zzerk zzerk) {
        return new zzerl("requester_type_2".equals(zzaa.zzc(zzerk.zzb.zzd)));
    }

    public final int zza() {
        return 21;
    }

    public final ListenableFuture zzb() {
        return this.zza.zzb(new zzerj(this));
    }
}
