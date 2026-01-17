package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzgnd extends zzgez {
    private final zzgox zza;
    private final zzgxe zzb;

    public zzgnd(zzgox zzgox, @Nullable zzgfn zzgfn) throws GeneralSecurityException {
        zzgxe zzgxe;
        zze(zzgox, zzgfn);
        this.zza = zzgox;
        if (zzgox.zzc().equals(zzgvf.RAW)) {
            zzgxe = zzgxe.zzb(new byte[0]);
        } else if (zzgox.zzc().equals(zzgvf.TINK)) {
            zzgxe = zzgnz.zzb(zzgox.zzf().intValue());
        } else if (zzgox.zzc().equals(zzgvf.LEGACY) || zzgox.zzc().equals(zzgvf.CRUNCHY)) {
            zzgxe = zzgnz.zza(zzgox.zzf().intValue());
        } else {
            throw new GeneralSecurityException("Unknown output prefix type");
        }
        this.zzb = zzgxe;
    }

    private static void zze(zzgox zzgox, @Nullable zzgfn zzgfn) throws GeneralSecurityException {
        int i = zzgna.zzb[zzgox.zzb().ordinal()];
    }

    public final zzgfm zza() {
        zzgox zzgox = this.zza;
        return new zzgnb(zzgox.zzg(), zzgox.zzc(), (zzgnc) null);
    }

    public final zzgox zzb(@Nullable zzgfn zzgfn) throws GeneralSecurityException {
        zzgox zzgox = this.zza;
        zze(zzgox, zzgfn);
        return zzgox;
    }

    public final zzgxe zzc() {
        return this.zzb;
    }

    @Nullable
    public final Integer zzd() {
        return this.zza.zzf();
    }
}
