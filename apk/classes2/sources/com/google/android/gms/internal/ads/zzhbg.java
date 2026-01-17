package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
final class zzhbg extends zzgxs {
    final zzhbi zza;
    zzgxu zzb = zzb();
    final /* synthetic */ zzhbk zzc;

    zzhbg(zzhbk zzhbk) {
        Objects.requireNonNull(zzhbk);
        this.zzc = zzhbk;
        this.zza = new zzhbi(zzhbk, (zzhbj) null);
    }

    private final zzgxu zzb() {
        zzhbi zzhbi = this.zza;
        if (zzhbi.hasNext()) {
            return zzhbi.next().iterator();
        }
        return null;
    }

    public final boolean hasNext() {
        return this.zzb != null;
    }

    public final byte zza() {
        zzgxu zzgxu = this.zzb;
        if (zzgxu != null) {
            byte zza2 = zzgxu.zza();
            if (!this.zzb.hasNext()) {
                this.zzb = zzb();
            }
            return zza2;
        }
        throw new NoSuchElementException();
    }
}
