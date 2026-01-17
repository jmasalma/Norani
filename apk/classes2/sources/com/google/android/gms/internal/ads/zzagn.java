package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzagn extends zzaei {
    final /* synthetic */ zzaeu zza;
    final /* synthetic */ zzago zzb;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzagn(zzago zzago, zzaeu zzaeu, zzaeu zzaeu2) {
        super(zzaeu);
        this.zza = zzaeu2;
        Objects.requireNonNull(zzago);
        this.zzb = zzago;
    }

    public final zzaes zzg(long j) {
        zzaes zzg = this.zza.zzg(j);
        zzaev zzaev = zzg.zza;
        long j2 = zzaev.zzc;
        zzago zzago = this.zzb;
        zzaev zzaev2 = new zzaev(zzaev.zzb, j2 + zzago.zzb);
        zzaev zzaev3 = zzg.zzb;
        return new zzaes(zzaev2, new zzaev(zzaev3.zzb, zzaev3.zzc + zzago.zzb));
    }
}
