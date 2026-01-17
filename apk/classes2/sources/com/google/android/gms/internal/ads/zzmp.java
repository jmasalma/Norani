package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzmp {
    public final long zza;
    public final zzbl zzb;
    public final int zzc;
    public final zzvh zzd;
    public final long zze;
    public final zzbl zzf;
    public final int zzg;
    public final zzvh zzh;
    public final long zzi;
    public final long zzj;

    public zzmp(long j, zzbl zzbl, int i, zzvh zzvh, long j2, zzbl zzbl2, int i2, zzvh zzvh2, long j3, long j4) {
        this.zza = j;
        this.zzb = zzbl;
        this.zzc = i;
        this.zzd = zzvh;
        this.zze = j2;
        this.zzf = zzbl2;
        this.zzg = i2;
        this.zzh = zzvh2;
        this.zzi = j3;
        this.zzj = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzmp zzmp = (zzmp) obj;
            return this.zza == zzmp.zza && this.zzc == zzmp.zzc && this.zze == zzmp.zze && this.zzg == zzmp.zzg && this.zzi == zzmp.zzi && this.zzj == zzmp.zzj && Objects.equals(this.zzb, zzmp.zzb) && Objects.equals(this.zzd, zzmp.zzd) && Objects.equals(this.zzf, zzmp.zzf) && Objects.equals(this.zzh, zzmp.zzh);
        }
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Long.valueOf(this.zza), this.zzb, Integer.valueOf(this.zzc), this.zzd, Long.valueOf(this.zze), this.zzf, Integer.valueOf(this.zzg), this.zzh, Long.valueOf(this.zzi), Long.valueOf(this.zzj)});
    }
}
