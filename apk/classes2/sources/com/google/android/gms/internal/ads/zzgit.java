package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzgit extends zzgfz {
    private final zzgiy zza;
    private final zzgxe zzb;
    @Nullable
    private final Integer zzc;

    private zzgit(zzgiy zzgiy, zzgxe zzgxe, @Nullable Integer num) {
        this.zza = zzgiy;
        this.zzb = zzgxe;
        this.zzc = num;
    }

    public static zzgit zzc(zzgiy zzgiy, @Nullable Integer num) throws GeneralSecurityException {
        zzgxe zzgxe;
        if (zzgiy.zzc() == zzgiw.zzb) {
            if (num == null) {
                zzgxe = zzgnz.zza;
            } else {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
        } else if (zzgiy.zzc() != zzgiw.zza) {
            throw new GeneralSecurityException("Unknown Variant: ".concat(String.valueOf(String.valueOf(zzgiy.zzc()))));
        } else if (num != null) {
            zzgxe = zzgnz.zzb(num.intValue());
        } else {
            throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
        }
        return new zzgit(zzgiy, zzgxe, num);
    }

    public final /* synthetic */ zzgfm zza() {
        return this.zza;
    }

    public final zzgxe zzb() {
        return this.zzb;
    }

    public final zzgiy zzd() {
        return this.zza;
    }

    public final Integer zze() {
        return this.zzc;
    }
}
