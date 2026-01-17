package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzld {
    public final zzvh zza;
    public final long zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;
    public final boolean zzf;
    public final boolean zzg;
    public final boolean zzh;
    public final boolean zzi;
    public final boolean zzj;

    zzld(zzvh zzvh, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6 = true;
        zzdd.zzd(!z5 || z3);
        if (z4 && !z3) {
            z6 = false;
        }
        zzdd.zzd(z6);
        this.zza = zzvh;
        this.zzb = j;
        this.zzc = j2;
        this.zzd = j3;
        this.zze = j4;
        this.zzf = false;
        this.zzg = false;
        this.zzh = z3;
        this.zzi = z4;
        this.zzj = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzld zzld = (zzld) obj;
            return this.zzb == zzld.zzb && this.zzc == zzld.zzc && this.zzd == zzld.zzd && this.zze == zzld.zze && this.zzh == zzld.zzh && this.zzi == zzld.zzi && this.zzj == zzld.zzj && Objects.equals(this.zza, zzld.zza);
        }
    }

    public final int hashCode() {
        long j = this.zze;
        long j2 = this.zzd;
        return ((((((((((((((this.zza.hashCode() + 527) * 31) + ((int) this.zzb)) * 31) + ((int) this.zzc)) * 31) + ((int) j2)) * 31) + ((int) j)) * 29791) + (this.zzh ? 1 : 0)) * 31) + (this.zzi ? 1 : 0)) * 31) + (this.zzj ? 1 : 0);
    }

    public final zzld zza(long j) {
        if (j == this.zzc) {
            return this;
        }
        return new zzld(this.zza, this.zzb, j, this.zzd, this.zze, false, false, this.zzh, this.zzi, this.zzj);
    }

    public final zzld zzb(long j) {
        if (j == this.zzb) {
            return this;
        }
        return new zzld(this.zza, j, this.zzc, this.zzd, this.zze, false, false, this.zzh, this.zzi, this.zzj);
    }
}
