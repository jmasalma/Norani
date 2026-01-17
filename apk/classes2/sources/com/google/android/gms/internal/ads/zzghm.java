package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzghm extends zzgga {
    private final int zza;
    private final int zzb = 12;
    private final int zzc = 16;
    private final zzghk zzd;

    /* synthetic */ zzghm(int i, int i2, int i3, zzghk zzghk, zzghl zzghl) {
        this.zza = i;
        this.zzd = zzghk;
    }

    public static zzghj zzc() {
        return new zzghj((zzghl) null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzghm)) {
            return false;
        }
        zzghm zzghm = (zzghm) obj;
        if (zzghm.zza == this.zza) {
            int i = zzghm.zzb;
            int i2 = zzghm.zzc;
            if (zzghm.zzd == this.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{zzghm.class, Integer.valueOf(this.zza), 12, 16, this.zzd});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzd);
        return "AesGcm Parameters (variant: " + valueOf + ", 12-byte IV, 16-byte tag, and " + this.zza + "-byte key)";
    }

    public final boolean zza() {
        return this.zzd != zzghk.zzc;
    }

    public final int zzb() {
        return this.zza;
    }

    public final zzghk zzd() {
        return this.zzd;
    }
}
