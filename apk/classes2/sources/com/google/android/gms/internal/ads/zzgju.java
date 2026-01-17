package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzgju extends zzgfz {
    private final zzgka zza;
    private final zzgxf zzb;
    private final zzgxe zzc;
    @Nullable
    private final Integer zzd;

    private zzgju(zzgka zzgka, zzgxf zzgxf, zzgxe zzgxe, @Nullable Integer num) {
        this.zza = zzgka;
        this.zzb = zzgxf;
        this.zzc = zzgxe;
        this.zzd = num;
    }

    public static zzgju zzc(zzgjz zzgjz, zzgxf zzgxf, @Nullable Integer num) throws GeneralSecurityException {
        zzgxe zzgxe;
        zzgjz zzgjz2 = zzgjz.zzc;
        if (zzgjz != zzgjz2 && num == null) {
            String obj = zzgjz.toString();
            throw new GeneralSecurityException("For given Variant " + obj + " the value of idRequirement must be non-null");
        } else if (zzgjz == zzgjz2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        } else if (zzgxf.zza() == 32) {
            zzgka zzc2 = zzgka.zzc(zzgjz);
            if (zzc2.zzb() == zzgjz2) {
                zzgxe = zzgnz.zza;
            } else if (zzc2.zzb() == zzgjz.zzb) {
                zzgxe = zzgnz.zza(num.intValue());
            } else if (zzc2.zzb() == zzgjz.zza) {
                zzgxe = zzgnz.zzb(num.intValue());
            } else {
                throw new IllegalStateException("Unknown Variant: ".concat(zzc2.zzb().toString()));
            }
            return new zzgju(zzc2, zzgxf, zzgxe, num);
        } else {
            int zza2 = zzgxf.zza();
            throw new GeneralSecurityException("XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + zza2);
        }
    }

    public final /* synthetic */ zzgfm zza() {
        return this.zza;
    }

    public final zzgxe zzb() {
        return this.zzc;
    }

    public final zzgka zzd() {
        return this.zza;
    }

    public final zzgxf zze() {
        return this.zzb;
    }

    @Nullable
    public final Integer zzf() {
        return this.zzd;
    }
}
