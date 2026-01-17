package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzghy extends zzgfz {
    private final zzgid zza;
    private final zzgxf zzb;
    private final zzgxe zzc;
    @Nullable
    private final Integer zzd;

    private zzghy(zzgid zzgid, zzgxf zzgxf, zzgxe zzgxe, @Nullable Integer num) {
        this.zza = zzgid;
        this.zzb = zzgxf;
        this.zzc = zzgxe;
        this.zzd = num;
    }

    public static zzghy zzc(zzgic zzgic, zzgxf zzgxf, @Nullable Integer num) throws GeneralSecurityException {
        zzgxe zzgxe;
        zzgic zzgic2 = zzgic.zzc;
        if (zzgic != zzgic2 && num == null) {
            String obj = zzgic.toString();
            throw new GeneralSecurityException("For given Variant " + obj + " the value of idRequirement must be non-null");
        } else if (zzgic == zzgic2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        } else if (zzgxf.zza() == 32) {
            zzgid zzc2 = zzgid.zzc(zzgic);
            if (zzc2.zzb() == zzgic2) {
                zzgxe = zzgnz.zza;
            } else if (zzc2.zzb() == zzgic.zzb) {
                zzgxe = zzgnz.zza(num.intValue());
            } else if (zzc2.zzb() == zzgic.zza) {
                zzgxe = zzgnz.zzb(num.intValue());
            } else {
                throw new IllegalStateException("Unknown Variant: ".concat(zzc2.zzb().toString()));
            }
            return new zzghy(zzc2, zzgxf, zzgxe, num);
        } else {
            int zza2 = zzgxf.zza();
            throw new GeneralSecurityException("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + zza2);
        }
    }

    public final /* synthetic */ zzgfm zza() {
        return this.zza;
    }

    public final zzgxe zzb() {
        return this.zzc;
    }

    public final zzgid zzd() {
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
