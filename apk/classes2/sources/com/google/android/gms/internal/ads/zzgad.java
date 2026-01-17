package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzgad extends zzfyq {
    final /* synthetic */ zzgae zza;

    zzgad(zzgae zzgae) {
        Objects.requireNonNull(zzgae);
        this.zza = zzgae;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        zzgae zzgae = this.zza;
        zzfvp.zza(i, zzgae.zzc, "index");
        int i2 = i + i;
        return new AbstractMap.SimpleImmutableEntry(Objects.requireNonNull(zzgae.zzb[i2]), Objects.requireNonNull(zzgae.zzb[i2 + 1]));
    }

    public final int size() {
        return this.zza.zzc;
    }

    public final boolean zzf() {
        return true;
    }
}
