package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzaju implements zzaeu {
    final /* synthetic */ zzajw zza;

    /* synthetic */ zzaju(zzajw zzajw, zzajv zzajv) {
        Objects.requireNonNull(zzajw);
        this.zza = zzajw;
    }

    public final long zza() {
        zzajw zzajw = this.zza;
        return zzajw.zzd.zzf(zzajw.zzf);
    }

    public final zzaes zzg(long j) {
        zzajw zzajw = this.zza;
        long zzb = zzajw.zzb + BigInteger.valueOf(zzajw.zzd.zzg(j)).multiply(BigInteger.valueOf(zzajw.zzc - zzajw.zzb)).divide(BigInteger.valueOf(zzajw.zzf)).longValue();
        long zzb2 = zzajw.zzb;
        String str = zzex.zza;
        zzaev zzaev = new zzaev(j, Math.max(zzb2, Math.min(zzb - 30000, zzajw.zzc - 1)));
        return new zzaes(zzaev, zzaev);
    }

    public final boolean zzh() {
        return true;
    }
}
