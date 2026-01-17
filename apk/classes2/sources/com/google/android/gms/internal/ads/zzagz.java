package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzagz extends zzahf {
    public final String zza;
    public final boolean zzb;
    public final boolean zzc;
    public final String[] zzd;
    private final zzahf[] zze;

    public zzagz(String str, boolean z, boolean z2, String[] strArr, zzahf[] zzahfArr) {
        super("CTOC");
        this.zza = str;
        this.zzb = z;
        this.zzc = z2;
        this.zzd = strArr;
        this.zze = zzahfArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzagz zzagz = (zzagz) obj;
            return this.zzb == zzagz.zzb && this.zzc == zzagz.zzc && Objects.equals(this.zza, zzagz.zza) && Arrays.equals(this.zzd, zzagz.zzd) && Arrays.equals(this.zze, zzagz.zze);
        }
    }

    public final int hashCode() {
        return (((((this.zzb ? 1 : 0) + true) * 31) + (this.zzc ? 1 : 0)) * 31) + this.zza.hashCode();
    }
}
