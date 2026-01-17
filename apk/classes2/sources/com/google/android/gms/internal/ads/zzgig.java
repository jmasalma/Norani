package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzgig {
    public static final /* synthetic */ int zza = 0;
    private static final zzgoq zzb = zzgoq.zzb(new zzgie(), zzgil.class, zzget.class);
    private static final zzgfa zzc = zzgmz.zzd("type.googleapis.com/google.crypto.tink.KmsAeadKey", zzget.class, zzgtz.REMOTE, zzguv.zzg());
    private static final zzgnn zzd = new zzgif();

    public static void zza(boolean z) throws GeneralSecurityException {
        if (zzgmg.zza(1)) {
            int i = zzgis.zza;
            zzgis.zze(zzgny.zzc());
            zzgnv.zza().zzc(zzb);
            zzgno.zzb().zzc(zzd, zzgin.class);
            zzgmp.zzc().zzd(zzc, true);
            return;
        }
        throw new GeneralSecurityException("Registering KMS AEAD is not supported in FIPS mode");
    }
}
