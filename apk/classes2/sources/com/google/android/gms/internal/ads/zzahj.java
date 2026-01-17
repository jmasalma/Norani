package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzahj extends zzahf {
    public final String zza;
    public final byte[] zzb;

    public zzahj(String str, byte[] bArr) {
        super("PRIV");
        this.zza = str;
        this.zzb = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzahj zzahj = (zzahj) obj;
            return Objects.equals(this.zza, zzahj.zza) && Arrays.equals(this.zzb, zzahj.zzb);
        }
    }

    public final int hashCode() {
        return ((this.zza.hashCode() + 527) * 31) + Arrays.hashCode(this.zzb);
    }

    public final String toString() {
        return this.zzf + ": owner=" + this.zza;
    }
}
