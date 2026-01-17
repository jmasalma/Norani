package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzaaw implements zzacm {
    final /* synthetic */ zztf zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzaba zzd;

    zzaaw(zzaba zzaba, zztf zztf, int i, long j) {
        this.zza = zztf;
        this.zzb = i;
        this.zzc = j;
        Objects.requireNonNull(zzaba);
        this.zzd = zzaba;
    }

    public final void zza(long j) {
        this.zzd.zzam(this.zza, this.zzb, this.zzc, j);
    }

    public final void zzb() {
        this.zzd.zzas(this.zza, this.zzb, this.zzc);
    }
}
