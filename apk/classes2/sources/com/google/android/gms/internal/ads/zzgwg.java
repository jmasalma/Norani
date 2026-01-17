package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzgwg implements zzget {
    private final zzgww zza;
    private final zzgfl zzb;
    private final int zzc;
    private final byte[] zzd;

    private zzgwg(zzgww zzgww, zzgfl zzgfl, int i, byte[] bArr) {
        this.zza = zzgww;
        this.zzb = zzgfl;
        this.zzc = i;
        this.zzd = bArr;
    }

    public static zzget zzb(zzggi zzggi) throws GeneralSecurityException {
        zzgvz zzgvz = new zzgvz(zzggi.zze().zzd(zzgey.zza()), zzggi.zzd().zzd());
        String valueOf = String.valueOf(String.valueOf(zzggi.zzd().zzg()));
        return new zzgwg(zzgvz, new zzgxb(new zzgxa("HMAC".concat(valueOf), new SecretKeySpec(zzggi.zzf().zzd(zzgey.zza()), "HMAC")), zzggi.zzd().zze()), zzggi.zzd().zze(), zzggi.zzb().zzd());
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzd;
        int length = bArr.length;
        int i = this.zzc;
        int length2 = bArr3.length;
        if (length < i + length2) {
            throw new GeneralSecurityException("Decryption failed (ciphertext too short).");
        } else if (zzgpj.zzc(bArr3, bArr)) {
            int i2 = length - i;
            byte[] copyOfRange = Arrays.copyOfRange(bArr, length2, i2);
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, i2, length);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            byte[] copyOf = Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8);
            if (MessageDigest.isEqual(((zzgxb) this.zzb).zzc(zzgwe.zzb(bArr2, copyOfRange, copyOf)), copyOfRange2)) {
                return this.zza.zza(copyOfRange);
            }
            throw new GeneralSecurityException("invalid MAC");
        } else {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
    }
}
