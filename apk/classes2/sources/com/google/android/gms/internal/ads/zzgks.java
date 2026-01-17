package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzgks implements zzget {
    private static final byte[] zza = zzgwv.zza("7a806c");
    private static final byte[] zzb = zzgwv.zza("46bb91c3c5");
    private static final byte[] zzc = zzgwv.zza("36864200e0eaf5284d884a0e77d31646");
    private static final byte[] zzd = zzgwv.zza("bae8e37fc83441b16034566b");
    private static final byte[] zze = zzgwv.zza("af60eb711bd85bc1e4d3e0a462e074eea428a8");
    private final SecretKey zzf;
    private final byte[] zzg;

    private zzgks(byte[] bArr, byte[] bArr2, zzgma zzgma) throws GeneralSecurityException {
        this.zzg = bArr2;
        zzgxc.zza(bArr.length);
        this.zzf = new SecretKeySpec(bArr, "AES");
    }

    public static boolean zzb(Cipher cipher) {
        try {
            byte[] bArr = zzd;
            cipher.init(2, new SecretKeySpec(zzc, "AES"), new GCMParameterSpec(128, bArr, 0, bArr.length));
            cipher.updateAAD(zzb);
            byte[] bArr2 = zze;
            return MessageDigest.isEqual(cipher.doFinal(bArr2, 0, bArr2.length), zza);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    public static zzget zzc(zzghp zzghp, zzgma zzgma) throws GeneralSecurityException {
        Cipher zzc2 = zzgmc.zzc();
        Cipher cipher = zzc2;
        if (zzb(zzc2)) {
            return new zzgks(zzghp.zze().zzd(zzgey.zza()), zzghp.zzb().zzd(), zzgma);
        }
        throw new IllegalStateException("Cipher does not implement AES GCM SIV.");
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        byte[] bArr3 = this.zzg;
        int length2 = bArr3.length;
        if (length < length2 + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        } else if (zzgpj.zzc(bArr3, bArr)) {
            Cipher zzc2 = zzgmc.zzc();
            Cipher cipher = zzc2;
            zzc2.init(2, this.zzf, new GCMParameterSpec(128, bArr, length2, 12));
            if (!(bArr2 == null || bArr2.length == 0)) {
                zzc2.updateAAD(bArr2);
            }
            return zzc2.doFinal(bArr, length2 + 12, (length - length2) - 12);
        } else {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
    }
}
