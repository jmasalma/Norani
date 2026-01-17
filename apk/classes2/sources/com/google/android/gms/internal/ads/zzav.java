package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzav {
    private final zzau[] zza;

    public zzav(long j, zzau... zzauArr) {
        this.zza = zzauArr;
    }

    public zzav(List list) {
        this.zza = (zzau[]) list.toArray(new zzau[0]);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && Arrays.equals(this.zza, ((zzav) obj).zza);
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.zza) * 31) + ((int) -9223372034707292159L);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.zza);
        return "entries=" + arrays + "";
    }

    public final int zza() {
        return this.zza.length;
    }

    public final zzau zzb(int i) {
        return this.zza[i];
    }

    public final zzav zzc(zzau... zzauArr) {
        int length = zzauArr.length;
        if (length == 0) {
            return this;
        }
        zzau[] zzauArr2 = this.zza;
        String str = zzex.zza;
        int length2 = zzauArr2.length;
        Object[] copyOf = Arrays.copyOf(zzauArr2, length2 + length);
        System.arraycopy(zzauArr, 0, copyOf, length2, length);
        return new zzav(-9223372036854775807L, (zzau[]) copyOf);
    }

    public final zzav zzd(zzav zzav) {
        return zzav == null ? this : zzc(zzav.zza);
    }
}
