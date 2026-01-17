package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzggd implements zzget {
    private final zzgom zza;

    /* synthetic */ zzggd(zzggc zzggc, zzgom zzgom, zzgni zzgni, zzgni zzgni2, zzgge zzgge) {
        this.zza = zzgom;
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        for (zzggc zzggc : this.zza.zza(bArr)) {
            try {
                byte[] zza2 = zzggc.zza.zza(bArr, bArr2);
                int i = zzggc.zzb;
                int length = bArr.length;
                return zza2;
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }
}
