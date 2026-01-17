package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzbly implements zzgcu {
    final /* synthetic */ zzblq zza;

    zzbly(zzbmc zzbmc, zzblq zzblq) {
        this.zza = zzblq;
        Objects.requireNonNull(zzbmc);
    }

    public final /* bridge */ /* synthetic */ ListenableFuture zza(Object obj) throws Exception {
        zzcak zzcak = new zzcak();
        ((zzblw) obj).zze(this.zza, new zzblx(this, zzcak));
        return zzcak;
    }
}
