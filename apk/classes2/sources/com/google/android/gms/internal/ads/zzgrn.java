package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzgrn implements zzgfl {
    private zzgrn(zzgfl zzgfl, zzgvf zzgvf, byte[] bArr) {
    }

    public static zzgfl zza(zzgnd zzgnd) throws GeneralSecurityException {
        byte[] bArr;
        zzgox zzb = zzgnd.zzb(zzgey.zza());
        zzgfl zzgfl = (zzgfl) zzgmp.zzc().zza(zzb.zzg(), zzgfl.class).zzc(zzb.zze());
        zzgvf zzc = zzb.zzc();
        int ordinal = zzc.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal == 3) {
                    bArr = zzgnz.zza.zzd();
                } else if (ordinal != 4) {
                    throw new GeneralSecurityException("unknown output prefix type");
                }
            }
            bArr = zzgnz.zza(zzgnd.zzd().intValue()).zzd();
        } else {
            bArr = zzgnz.zzb(zzgnd.zzd().intValue()).zzd();
        }
        return new zzgrn(zzgfl, zzc, bArr);
    }
}
