package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzgpz {
    @Nullable
    private zzgql zza = null;
    @Nullable
    private zzgxf zzb = null;
    @Nullable
    private Integer zzc = null;

    private zzgpz() {
    }

    /* synthetic */ zzgpz(zzgqa zzgqa) {
    }

    public final zzgpz zza(@Nullable Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzgpz zzb(zzgxf zzgxf) {
        this.zzb = zzgxf;
        return this;
    }

    public final zzgpz zzc(zzgql zzgql) {
        this.zza = zzgql;
        return this;
    }

    public final zzgqb zzd() throws GeneralSecurityException {
        zzgxf zzgxf;
        zzgxe zza2;
        zzgql zzgql = this.zza;
        if (zzgql == null || (zzgxf = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        } else if (zzgql.zzc() != zzgxf.zza()) {
            throw new GeneralSecurityException("Key size mismatch");
        } else if (zzgql.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        } else if (this.zza.zza() || this.zzc == null) {
            if (this.zza.zzg() == zzgqj.zzd) {
                zza2 = zzgnz.zza;
            } else if (this.zza.zzg() == zzgqj.zzc || this.zza.zzg() == zzgqj.zzb) {
                zza2 = zzgnz.zza(this.zzc.intValue());
            } else if (this.zza.zzg() == zzgqj.zza) {
                zza2 = zzgnz.zzb(this.zzc.intValue());
            } else {
                throw new IllegalStateException("Unknown HmacParameters.Variant: ".concat(String.valueOf(String.valueOf(this.zza.zzg()))));
            }
            return new zzgqb(this.zza, this.zzb, zza2, this.zzc, (zzgqa) null);
        } else {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
    }
}
