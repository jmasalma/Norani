package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzgne extends zzgfm {
    private final zzgoy zza;

    public zzgne(zzgoy zzgoy) {
        this.zza = zzgoy;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgne)) {
            return false;
        }
        zzgoy zzgoy = ((zzgne) obj).zza;
        zzgoy zzgoy2 = this.zza;
        if (!zzgoy2.zzc().zzg().equals(zzgoy.zzc().zzg()) || !zzgoy2.zzc().zzi().equals(zzgoy.zzc().zzi()) || !zzgoy2.zzc().zzh().equals(zzgoy.zzc().zzh())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        zzgoy zzgoy = this.zza;
        return Objects.hash(new Object[]{zzgoy.zzc(), zzgoy.zzd()});
    }

    public final String toString() {
        String str;
        zzgoy zzgoy = this.zza;
        String zzi = zzgoy.zzc().zzi();
        int ordinal = zzgoy.zzc().zzg().ordinal();
        if (ordinal != 1) {
            str = ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY";
        } else {
            str = "TINK";
        }
        return String.format("(typeUrl=%s, outputPrefixType=%s)", new Object[]{zzi, str});
    }

    public final boolean zza() {
        return this.zza.zzc().zzg() != zzgvf.RAW;
    }

    public final zzgoy zzb() {
        return this.zza;
    }
}
