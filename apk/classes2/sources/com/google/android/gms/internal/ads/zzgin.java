package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzgin extends zzgga {
    private final String zza;
    private final zzgim zzb;

    private zzgin(String str, zzgim zzgim) {
        this.zza = str;
        this.zzb = zzgim;
    }

    public static zzgin zzc(String str, zzgim zzgim) {
        return new zzgin(str, zzgim);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgin)) {
            return false;
        }
        zzgin zzgin = (zzgin) obj;
        if (!zzgin.zza.equals(this.zza) || !zzgin.zzb.equals(this.zzb)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{zzgin.class, this.zza, this.zzb});
    }

    public final String toString() {
        String obj = this.zzb.toString();
        return "LegacyKmsAead Parameters (keyUri: " + this.zza + ", variant: " + obj + ")";
    }

    public final boolean zza() {
        return this.zzb != zzgim.zzb;
    }

    public final zzgim zzb() {
        return this.zzb;
    }

    public final String zzd() {
        return this.zza;
    }
}
