package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzgka extends zzgga {
    private final zzgjz zza;

    private zzgka(zzgjz zzgjz) {
        this.zza = zzgjz;
    }

    public static zzgka zzc(zzgjz zzgjz) {
        return new zzgka(zzgjz);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzgka) && ((zzgka) obj).zza == this.zza;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{zzgka.class, this.zza});
    }

    public final String toString() {
        String obj = this.zza.toString();
        return "XChaCha20Poly1305 Parameters (variant: " + obj + ")";
    }

    public final boolean zza() {
        return this.zza != zzgjz.zzc;
    }

    public final zzgjz zzb() {
        return this.zza;
    }
}
