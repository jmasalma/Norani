package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzgfy {
    public static final /* synthetic */ int zza = 0;
    private static final zzgmo zzb = zzb();

    public static zzgex zza() throws GeneralSecurityException {
        if (!zzgmh.zzb()) {
            return zzb;
        }
        throw new GeneralSecurityException("Cannot use non-FIPS-compliant AeadConfigurationV1 in FIPS mode");
    }

    private static zzgmo zzb() {
        try {
            zzgos zza2 = zzgov.zza();
            zzggf.zzd(zza2);
            zza2.zza(zzgoq.zzb(new zzgfr(), zzggi.class, zzget.class));
            zza2.zza(zzgoq.zzb(new zzgfs(), zzghe.class, zzget.class));
            zza2.zza(zzgoq.zzb(new zzgft(), zzghp.class, zzget.class));
            zza2.zza(zzgoq.zzb(new zzgfu(), zzggu.class, zzget.class));
            zza2.zza(zzgoq.zzb(new zzgfv(), zzghy.class, zzget.class));
            zza2.zza(zzgoq.zzb(new zzgfw(), zzgju.class, zzget.class));
            zza2.zza(zzgoq.zzb(new zzgfx(), zzgjo.class, zzget.class));
            return zzgmo.zzb(zza2.zzc());
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
