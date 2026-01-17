package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzgwd implements zzget {
    private final SecretKey zza;
    private final byte[] zzb;

    private zzgwd(byte[] bArr, zzgxe zzgxe) throws GeneralSecurityException {
        if (zzgmg.zza(2)) {
            this.zza = zzgkm.zzc(bArr);
            this.zzb = zzgxe.zzd();
            return;
        }
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }

    public static zzget zzb(zzghe zzghe) throws GeneralSecurityException {
        return new zzgwd(zzghe.zze().zzd(zzgey.zza()), zzghe.zzb());
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr != null) {
            byte[] bArr3 = this.zzb;
            int length = bArr.length;
            int length2 = bArr3.length;
            if (length < length2 + 28) {
                throw new GeneralSecurityException("ciphertext too short");
            } else if (zzgpj.zzc(bArr3, bArr)) {
                AlgorithmParameterSpec zza2 = zzgkm.zza(bArr, length2, 12);
                SecretKey secretKey = this.zza;
                Cipher zzb2 = zzgkm.zzb();
                zzb2.init(2, secretKey, zza2);
                if (!(bArr2 == null || bArr2.length == 0)) {
                    zzb2.updateAAD(bArr2);
                }
                return zzb2.doFinal(bArr, length2 + 12, (length - length2) - 12);
            } else {
                throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
            }
        } else {
            throw new NullPointerException("ciphertext is null");
        }
    }
}
