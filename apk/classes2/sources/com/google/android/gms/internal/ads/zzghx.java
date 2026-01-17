package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzghx extends zzgga {
    private final int zza;
    private final zzghv zzb;

    /* synthetic */ zzghx(int i, zzghv zzghv, zzghw zzghw) {
        this.zza = i;
        this.zzb = zzghv;
    }

    public static zzghu zzc() {
        return new zzghu((zzghw) null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzghx)) {
            return false;
        }
        zzghx zzghx = (zzghx) obj;
        return zzghx.zza == this.zza && zzghx.zzb == this.zzb;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{zzghx.class, Integer.valueOf(this.zza), this.zzb});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzb);
        return "AesGcmSiv Parameters (variant: " + valueOf + ", " + this.zza + "-byte key)";
    }

    public final boolean zza() {
        return this.zzb != zzghv.zzc;
    }

    public final int zzb() {
        return this.zza;
    }

    public final zzghv zzd() {
        return this.zzb;
    }
}
