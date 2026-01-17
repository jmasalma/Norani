package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzggr extends zzgga {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final int zzd;
    private final zzggp zze;
    private final zzggo zzf;

    /* synthetic */ zzggr(int i, int i2, int i3, int i4, zzggp zzggp, zzggo zzggo, zzggq zzggq) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = i4;
        this.zze = zzggp;
        this.zzf = zzggo;
    }

    public static zzggn zzf() {
        return new zzggn((zzggq) null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzggr)) {
            return false;
        }
        zzggr zzggr = (zzggr) obj;
        return zzggr.zza == this.zza && zzggr.zzb == this.zzb && zzggr.zzc == this.zzc && zzggr.zzd == this.zzd && zzggr.zze == this.zze && zzggr.zzf == this.zzf;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{zzggr.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Integer.valueOf(this.zzd), this.zze, this.zzf});
    }

    public final String toString() {
        zzggo zzggo = this.zzf;
        String valueOf = String.valueOf(this.zze);
        String valueOf2 = String.valueOf(zzggo);
        return "AesCtrHmacAead Parameters (variant: " + valueOf + ", hashType: " + valueOf2 + ", " + this.zzc + "-byte IV, and " + this.zzd + "-byte tags, and " + this.zza + "-byte AES key, and " + this.zzb + "-byte HMAC key)";
    }

    public final boolean zza() {
        return this.zze != zzggp.zzc;
    }

    public final int zzb() {
        return this.zza;
    }

    public final int zzc() {
        return this.zzb;
    }

    public final int zzd() {
        return this.zzc;
    }

    public final int zze() {
        return this.zzd;
    }

    public final zzggo zzg() {
        return this.zzf;
    }

    public final zzggp zzh() {
        return this.zze;
    }
}
