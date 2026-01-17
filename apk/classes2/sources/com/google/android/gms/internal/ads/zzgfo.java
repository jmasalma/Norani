package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzgfo {
    public static zzgfm zza(byte[] bArr) throws GeneralSecurityException {
        try {
            zzguf zzf = zzguf.zzf(bArr, zzgyr.zza());
            zzgny zzc = zzgny.zzc();
            zzgoy zza = zzgoy.zza(zzf);
            if (!zzc.zzk(zza)) {
                return new zzgne(zza);
            }
            return zzc.zzb(zza);
        } catch (IOException e) {
            throw new GeneralSecurityException("Failed to parse proto", e);
        }
    }

    public static byte[] zzb(zzgfm zzgfm) throws GeneralSecurityException {
        return ((zzgoy) zzgny.zzc().zze(zzgfm, zzgoy.class)).zzc().zzaV();
    }
}
