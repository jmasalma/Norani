package com.google.android.gms.internal.ads;

import android.net.Uri;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzxd extends zzbl {
    private static final Object zzb = new Object();
    private final long zzc;
    private final long zzd;
    private final boolean zze;
    private final zzap zzf;
    private final zzaj zzg;

    static {
        zzad zzad = new zzad();
        zzad.zza("SinglePeriodTimeline");
        zzad.zzb(Uri.EMPTY);
        zzad.zzc();
    }

    public final int zza(Object obj) {
        return zzb.equals(obj) ? 0 : -1;
    }

    public final int zzb() {
        return 1;
    }

    public final int zzc() {
        return 1;
    }

    public final zzbj zzd(int i, zzbj zzbj, boolean z) {
        zzdd.zza(i, 0, 1);
        zzbj.zzi((Object) null, z ? zzb : null, 0, this.zzc, 0, zzb.zza, false);
        return zzbj;
    }

    public final zzbk zze(int i, zzbk zzbk, long j) {
        zzdd.zza(i, 0, 1);
        zzaj zzaj = this.zzg;
        zzbk.zza(zzbk.zza, this.zzf, (Object) null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.zze, false, zzaj, 0, this.zzd, 0, 0, 0);
        return zzbk;
    }

    public final Object zzf(int i) {
        zzdd.zza(i, 0, 1);
        return zzb;
    }

    public zzxd(long j, long j2, long j3, long j4, long j5, long j6, long j7, boolean z, boolean z2, boolean z3, Object obj, zzap zzap, zzaj zzaj) {
        zzap zzap2 = zzap;
        this.zzc = j4;
        this.zzd = j5;
        this.zze = z;
        zzap.getClass();
        zzap zzap3 = zzap2;
        this.zzf = zzap2;
        this.zzg = zzaj;
    }
}
