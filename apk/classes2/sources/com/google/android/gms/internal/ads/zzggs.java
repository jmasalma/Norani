package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzggs {
    @Nullable
    private zzghb zza = null;
    @Nullable
    private zzgxf zzb = null;
    @Nullable
    private Integer zzc = null;

    private zzggs() {
    }

    /* synthetic */ zzggs(zzggt zzggt) {
    }

    public final zzggs zza(@Nullable Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzggs zzb(zzgxf zzgxf) {
        this.zzb = zzgxf;
        return this;
    }

    public final zzggs zzc(zzghb zzghb) {
        this.zza = zzghb;
        return this;
    }

    public final zzggu zzd() throws GeneralSecurityException {
        zzgxf zzgxf;
        zzgxe zzb2;
        zzghb zzghb = this.zza;
        if (zzghb == null || (zzgxf = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        } else if (zzghb.zzc() != zzgxf.zza()) {
            throw new GeneralSecurityException("Key size mismatch");
        } else if (zzghb.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        } else if (this.zza.zza() || this.zzc == null) {
            if (this.zza.zze() == zzggz.zzc) {
                zzb2 = zzgnz.zza;
            } else if (this.zza.zze() == zzggz.zzb) {
                zzb2 = zzgnz.zza(this.zzc.intValue());
            } else if (this.zza.zze() == zzggz.zza) {
                zzb2 = zzgnz.zzb(this.zzc.intValue());
            } else {
                throw new IllegalStateException("Unknown AesEaxParameters.Variant: ".concat(String.valueOf(String.valueOf(this.zza.zze()))));
            }
            return new zzggu(this.zza, this.zzb, zzb2, this.zzc, (zzggt) null);
        } else {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
    }
}
