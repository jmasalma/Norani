package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzcrn implements zzgdj {
    final /* synthetic */ zzgdj zza;
    final /* synthetic */ zzcrp zzb;

    zzcrn(zzcrp zzcrp, zzgdj zzgdj) {
        this.zza = zzgdj;
        Objects.requireNonNull(zzcrp);
        this.zzb = zzcrp;
    }

    public final void zza(Throwable th) {
        this.zza.zza(th);
        zzcaf.zzf.execute(new zzcrj(this.zzb));
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcrp.zzc(this.zzb, ((zzcri) obj).zza, this.zza);
    }
}
