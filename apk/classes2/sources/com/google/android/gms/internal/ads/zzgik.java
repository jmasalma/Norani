package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzgik {
    public static final /* synthetic */ int zza = 0;
    private static final zzgfa zzb = zzgmz.zzd("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", zzget.class, zzgtz.SYMMETRIC, zzgvb.zzg());
    private static final zzgnn zzc = new zzgii();
    private static final zzgoq zzd = zzgoq.zzb(new zzgij(), zzgit.class, zzget.class);

    public static void zza(boolean z) throws GeneralSecurityException {
        if (zzgmg.zza(1)) {
            int i = zzgjd.zza;
            zzgjd.zze(zzgny.zzc());
            zzgno.zzb().zzc(zzc, zzgiy.class);
            zzgnv.zza().zzc(zzd);
            zzgmp.zzc().zzd(zzb, true);
            return;
        }
        throw new GeneralSecurityException("Registering KMS Envelope AEAD is not supported in FIPS mode");
    }
}
