package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzgjo extends zzgfz {
    private final zzgjt zza;
    private final zzgxf zzb;
    private final zzgxe zzc;
    @Nullable
    private final Integer zzd;

    private zzgjo(zzgjt zzgjt, zzgxf zzgxf, zzgxe zzgxe, @Nullable Integer num) {
        this.zza = zzgjt;
        this.zzb = zzgxf;
        this.zzc = zzgxe;
        this.zzd = num;
    }

    public static zzgjo zzc(zzgjt zzgjt, zzgxf zzgxf, @Nullable Integer num) throws GeneralSecurityException {
        zzgxe zzgxe;
        zzgjs zzc2 = zzgjt.zzc();
        zzgjs zzgjs = zzgjs.zzb;
        if (zzc2 != zzgjs && num == null) {
            String obj = zzgjt.zzc().toString();
            throw new GeneralSecurityException("For given Variant " + obj + " the value of idRequirement must be non-null");
        } else if (zzgjt.zzc() == zzgjs && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        } else if (zzgxf.zza() == 32) {
            if (zzgjt.zzc() == zzgjs) {
                zzgxe = zzgnz.zza;
            } else if (zzgjt.zzc() == zzgjs.zza) {
                zzgxe = zzgnz.zzb(num.intValue());
            } else {
                throw new IllegalStateException("Unknown Variant: ".concat(zzgjt.zzc().toString()));
            }
            return new zzgjo(zzgjt, zzgxf, zzgxe, num);
        } else {
            int zza2 = zzgxf.zza();
            throw new GeneralSecurityException("XAesGcmKey key must be constructed with key of length 32 bytes, not " + zza2);
        }
    }

    public final /* synthetic */ zzgfm zza() {
        return this.zza;
    }

    public final zzgxe zzb() {
        return this.zzc;
    }

    public final zzgjt zzd() {
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
