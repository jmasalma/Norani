package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzgjt extends zzgga {
    private final zzgjs zza;
    private final int zzb;

    private zzgjt(zzgjs zzgjs, int i) {
        this.zza = zzgjs;
        this.zzb = i;
    }

    public static zzgjt zzd(zzgjs zzgjs, int i) throws GeneralSecurityException {
        if (i >= 8 && i <= 12) {
            return new zzgjt(zzgjs, i);
        }
        throw new GeneralSecurityException("Salt size must be between 8 and 12 bytes");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgjt)) {
            return false;
        }
        zzgjt zzgjt = (zzgjt) obj;
        return zzgjt.zza == this.zza && zzgjt.zzb == this.zzb;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{zzgjt.class, this.zza, Integer.valueOf(this.zzb)});
    }

    public final String toString() {
        String obj = this.zza.toString();
        return "X-AES-GCM Parameters (variant: " + obj + "salt_size_bytes: " + this.zzb + ")";
    }

    public final boolean zza() {
        return this.zza != zzgjs.zzb;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final zzgjs zzc() {
        return this.zza;
    }
}
