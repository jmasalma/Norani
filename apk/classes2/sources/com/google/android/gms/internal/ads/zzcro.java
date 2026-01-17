package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzcro implements zzgdj {
    final /* synthetic */ zzgdj zza;
    final /* synthetic */ zzcrp zzb;

    zzcro(zzcrp zzcrp, zzgdj zzgdj) {
        this.zza = zzgdj;
        Objects.requireNonNull(zzcrp);
        this.zzb = zzcrp;
    }

    public final void zza(Throwable th) {
        zzcaf.zzf.execute(new zzcrj(this.zzb));
        this.zza.zza(th);
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcaf.zzf.execute(new zzcrj(this.zzb));
        this.zza.zzb((zzcra) obj);
    }
}
