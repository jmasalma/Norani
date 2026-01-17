package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
final class zzgxr extends zzgxs {
    final /* synthetic */ zzgxz zza;
    private int zzb = 0;
    private final int zzc;

    zzgxr(zzgxz zzgxz) {
        Objects.requireNonNull(zzgxz);
        this.zza = zzgxz;
        this.zzc = zzgxz.zzd();
    }

    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }

    public final byte zza() {
        int i = this.zzb;
        if (i < this.zzc) {
            this.zzb = i + 1;
            return this.zza.zzb(i);
        }
        throw new NoSuchElementException();
    }
}
