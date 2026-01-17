package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzggg {
    @Nullable
    private zzggr zza = null;
    @Nullable
    private zzgxf zzb = null;
    @Nullable
    private zzgxf zzc = null;
    @Nullable
    private Integer zzd = null;

    private zzggg() {
    }

    /* synthetic */ zzggg(zzggh zzggh) {
    }

    public final zzggg zza(zzgxf zzgxf) {
        this.zzb = zzgxf;
        return this;
    }

    public final zzggg zzb(zzgxf zzgxf) {
        this.zzc = zzgxf;
        return this;
    }

    public final zzggg zzc(@Nullable Integer num) {
        this.zzd = num;
        return this;
    }

    public final zzggg zzd(zzggr zzggr) {
        this.zza = zzggr;
        return this;
    }

    public final zzggi zze() throws GeneralSecurityException {
        zzgxe zzb2;
        zzggr zzggr = this.zza;
        if (zzggr != null) {
            zzgxf zzgxf = this.zzb;
            if (zzgxf == null || this.zzc == null) {
                throw new GeneralSecurityException("Cannot build without key material");
            } else if (zzggr.zzb() != zzgxf.zza()) {
                throw new GeneralSecurityException("AES key size mismatch");
            } else if (zzggr.zzc() != this.zzc.zza()) {
                throw new GeneralSecurityException("HMAC key size mismatch");
            } else if (this.zza.zza() && this.zzd == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            } else if (this.zza.zza() || this.zzd == null) {
                if (this.zza.zzh() == zzggp.zzc) {
                    zzb2 = zzgnz.zza;
                } else if (this.zza.zzh() == zzggp.zzb) {
                    zzb2 = zzgnz.zza(this.zzd.intValue());
                } else if (this.zza.zzh() == zzggp.zza) {
                    zzb2 = zzgnz.zzb(this.zzd.intValue());
                } else {
                    throw new IllegalStateException("Unknown AesCtrHmacAeadParameters.Variant: ".concat(String.valueOf(String.valueOf(this.zza.zzh()))));
                }
                return new zzggi(this.zza, this.zzb, this.zzc, zzb2, this.zzd, (zzggh) null);
            } else {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
        } else {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
    }
}
