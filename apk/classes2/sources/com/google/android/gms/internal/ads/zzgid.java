package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzgid extends zzgga {
    private final zzgic zza;

    private zzgid(zzgic zzgic) {
        this.zza = zzgic;
    }

    public static zzgid zzc(zzgic zzgic) {
        return new zzgid(zzgic);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzgid) && ((zzgid) obj).zza == this.zza;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{zzgid.class, this.zza});
    }

    public final String toString() {
        String obj = this.zza.toString();
        return "ChaCha20Poly1305 Parameters (variant: " + obj + ")";
    }

    public final boolean zza() {
        return this.zza != zzgic.zzc;
    }

    public final zzgic zzb() {
        return this.zza;
    }
}
