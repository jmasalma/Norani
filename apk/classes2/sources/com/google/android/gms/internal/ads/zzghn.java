package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzghn {
    @Nullable
    private zzghx zza = null;
    @Nullable
    private zzgxf zzb = null;
    @Nullable
    private Integer zzc = null;

    private zzghn() {
    }

    /* synthetic */ zzghn(zzgho zzgho) {
    }

    public final zzghn zza(@Nullable Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzghn zzb(zzgxf zzgxf) {
        this.zzb = zzgxf;
        return this;
    }

    public final zzghn zzc(zzghx zzghx) {
        this.zza = zzghx;
        return this;
    }

    public final zzghp zzd() throws GeneralSecurityException {
        zzgxf zzgxf;
        zzgxe zzb2;
        zzghx zzghx = this.zza;
        if (zzghx == null || (zzgxf = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        } else if (zzghx.zzb() != zzgxf.zza()) {
            throw new GeneralSecurityException("Key size mismatch");
        } else if (zzghx.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        } else if (this.zza.zza() || this.zzc == null) {
            if (this.zza.zzd() == zzghv.zzc) {
                zzb2 = zzgnz.zza;
            } else if (this.zza.zzd() == zzghv.zzb) {
                zzb2 = zzgnz.zza(this.zzc.intValue());
            } else if (this.zza.zzd() == zzghv.zza) {
                zzb2 = zzgnz.zzb(this.zzc.intValue());
            } else {
                throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: ".concat(String.valueOf(String.valueOf(this.zza.zzd()))));
            }
            return new zzghp(this.zza, this.zzb, zzb2, this.zzc, (zzgho) null);
        } else {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
    }
}
