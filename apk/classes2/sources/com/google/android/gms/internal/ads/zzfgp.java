package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzfgp implements zzgdj {
    final /* synthetic */ zzfgg zza;
    final /* synthetic */ zzfgq zzb;

    zzfgp(zzfgq zzfgq, zzfgg zzfgg) {
        this.zza = zzfgg;
        Objects.requireNonNull(zzfgq);
        this.zzb = zzfgq;
    }

    public final void zza(Throwable th) {
        this.zzb.zza.zzd.zzb(this.zza, th);
    }

    public final void zzb(Object obj) {
        this.zzb.zza.zzd.zzd(this.zza);
    }
}
