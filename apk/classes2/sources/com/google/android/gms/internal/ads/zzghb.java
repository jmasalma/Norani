package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzghb extends zzgga {
    private final int zza;
    private final int zzb;
    private final int zzc = 16;
    private final zzggz zzd;

    /* synthetic */ zzghb(int i, int i2, int i3, zzggz zzggz, zzgha zzgha) {
        this.zza = i;
        this.zzb = i2;
        this.zzd = zzggz;
    }

    public static zzggy zzd() {
        return new zzggy((zzgha) null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzghb)) {
            return false;
        }
        zzghb zzghb = (zzghb) obj;
        if (zzghb.zza == this.zza && zzghb.zzb == this.zzb) {
            int i = zzghb.zzc;
            if (zzghb.zzd == this.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{zzghb.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), 16, this.zzd});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzd);
        return "AesEax Parameters (variant: " + valueOf + ", " + this.zzb + "-byte IV, 16-byte tag, and " + this.zza + "-byte key)";
    }

    public final boolean zza() {
        return this.zzd != zzggz.zzc;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final int zzc() {
        return this.zza;
    }

    public final zzggz zze() {
        return this.zzd;
    }
}
