package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzghc {
    @Nullable
    private zzghm zza = null;
    @Nullable
    private zzgxf zzb = null;
    @Nullable
    private Integer zzc = null;

    private zzghc() {
    }

    /* synthetic */ zzghc(zzghd zzghd) {
    }

    public final zzghc zza(@Nullable Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzghc zzb(zzgxf zzgxf) {
        this.zzb = zzgxf;
        return this;
    }

    public final zzghc zzc(zzghm zzghm) {
        this.zza = zzghm;
        return this;
    }

    public final zzghe zzd() throws GeneralSecurityException {
        zzgxf zzgxf;
        zzgxe zzb2;
        zzghm zzghm = this.zza;
        if (zzghm == null || (zzgxf = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        } else if (zzghm.zzb() != zzgxf.zza()) {
            throw new GeneralSecurityException("Key size mismatch");
        } else if (zzghm.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        } else if (this.zza.zza() || this.zzc == null) {
            if (this.zza.zzd() == zzghk.zzc) {
                zzb2 = zzgnz.zza;
            } else if (this.zza.zzd() == zzghk.zzb) {
                zzb2 = zzgnz.zza(this.zzc.intValue());
            } else if (this.zza.zzd() == zzghk.zza) {
                zzb2 = zzgnz.zzb(this.zzc.intValue());
            } else {
                throw new IllegalStateException("Unknown AesGcmParameters.Variant: ".concat(String.valueOf(String.valueOf(this.zza.zzd()))));
            }
            return new zzghe(this.zza, this.zzb, zzb2, this.zzc, (zzghd) null);
        } else {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
    }
}
