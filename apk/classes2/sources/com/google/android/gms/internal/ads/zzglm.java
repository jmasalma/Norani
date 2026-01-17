package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzglm implements zzget {
    private final zzget zza;
    private final byte[] zzb;

    private zzglm(zzget zzget, byte[] bArr) {
        this.zza = zzget;
        int length = bArr.length;
        if (length == 0 || length == 5) {
            this.zzb = bArr;
            return;
        }
        throw new IllegalArgumentException("identifier has an invalid length");
    }

    public static zzget zzb(zzgnd zzgnd) throws GeneralSecurityException {
        byte[] bArr;
        zzgox zzb2 = zzgnd.zzb(zzgey.zza());
        zzget zzget = (zzget) zzgmp.zzc().zza(zzb2.zzg(), zzget.class).zzc(zzb2.zze());
        zzgvf zzc = zzb2.zzc();
        int ordinal = zzc.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal == 3) {
                    bArr = zzgnz.zza.zzd();
                } else if (ordinal != 4) {
                    throw new GeneralSecurityException("unknown output prefix type ".concat(String.valueOf(String.valueOf(zzc))));
                }
            }
            bArr = zzgnz.zza(zzgnd.zzd().intValue()).zzd();
        } else {
            bArr = zzgnz.zzb(zzgnd.zzd().intValue()).zzd();
        }
        return new zzglm(zzget, bArr);
    }

    public static zzget zzc(zzget zzget, zzgxe zzgxe) {
        return new zzglm(zzget, zzgxe.zzd());
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzb;
        if (bArr3.length == 0) {
            return this.zza.zza(bArr, bArr2);
        }
        if (zzgpj.zzc(bArr3, bArr)) {
            return this.zza.zza(Arrays.copyOfRange(bArr, 5, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("wrong prefix");
    }
}
