package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzgib {
    public static final /* synthetic */ int zza = 0;
    private static final zzgoq zzb = zzgoq.zzb(new zzghz(), zzghy.class, zzget.class);
    private static final zzgnn zzc = new zzgia();
    private static final zzgfa zzd = zzgmz.zzd("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", zzget.class, zzgtz.SYMMETRIC, zzgtk.zzg());

    public static void zza(boolean z) throws GeneralSecurityException {
        if (zzgmg.zza(1)) {
            int i = zzgle.zza;
            zzgle.zze(zzgny.zzc());
            zzgnv.zza().zzc(zzb);
            zzgno.zzb().zzc(zzc, zzgid.class);
            zzgnu zzb2 = zzgnu.zzb();
            HashMap hashMap = new HashMap();
            hashMap.put("CHACHA20_POLY1305", zzgid.zzc(zzgic.zza));
            hashMap.put("CHACHA20_POLY1305_RAW", zzgid.zzc(zzgic.zzc));
            zzb2.zzd(Collections.unmodifiableMap(hashMap));
            zzgmp.zzc().zzd(zzd, true);
            return;
        }
        throw new GeneralSecurityException("Registering ChaCha20Poly1305 is not supported in FIPS mode");
    }
}
