package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzagy extends zzahf {
    public final String zza;
    public final int zzb;
    public final int zzc;
    public final long zzd;
    public final long zze;
    private final zzahf[] zzg;

    public zzagy(String str, int i, int i2, long j, long j2, zzahf[] zzahfArr) {
        super("CHAP");
        this.zza = str;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = j;
        this.zze = j2;
        this.zzg = zzahfArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzagy zzagy = (zzagy) obj;
            return this.zzb == zzagy.zzb && this.zzc == zzagy.zzc && this.zzd == zzagy.zzd && this.zze == zzagy.zze && Objects.equals(this.zza, zzagy.zza) && Arrays.equals(this.zzg, zzagy.zzg);
        }
    }

    public final int hashCode() {
        String str = this.zza;
        long j = this.zze;
        return ((((((((this.zzb + 527) * 31) + this.zzc) * 31) + ((int) this.zzd)) * 31) + ((int) j)) * 31) + str.hashCode();
    }
}
