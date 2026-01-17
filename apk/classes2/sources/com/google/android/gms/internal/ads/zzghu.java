package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzghu {
    @Nullable
    private Integer zza = null;
    private zzghv zzb = zzghv.zzc;

    private zzghu() {
    }

    /* synthetic */ zzghu(zzghw zzghw) {
    }

    public final zzghu zzb(zzghv zzghv) {
        this.zzb = zzghv;
        return this;
    }

    public final zzghx zzc() throws GeneralSecurityException {
        Integer num = this.zza;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        } else if (this.zzb != null) {
            return new zzghx(num.intValue(), this.zzb, (zzghw) null);
        } else {
            throw new GeneralSecurityException("Variant is not set");
        }
    }

    public final zzghu zza(int i) throws GeneralSecurityException {
        if (i == 16 || i == 32) {
            this.zza = Integer.valueOf(i);
            return this;
        }
        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", new Object[]{Integer.valueOf(i)}));
    }
}
