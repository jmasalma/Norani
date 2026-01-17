package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzgjy {
    public static final /* synthetic */ int zza = 0;
    private static final zzgoq zzb = zzgoq.zzb(new zzgjv(), zzgju.class, zzget.class);
    private static final zzgfa zzc = zzgmz.zzd("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", zzget.class, zzgtz.SYMMETRIC, zzgvu.zzg());
    private static final zzgnp zzd = new zzgjw();
    private static final zzgnn zze = new zzgjx();

    public static void zza(boolean z) throws GeneralSecurityException {
        if (zzgmg.zza(1)) {
            int i = zzglz.zza;
            zzglz.zze(zzgny.zzc());
            zzgnv.zza().zzc(zzb);
            zzgnu zzb2 = zzgnu.zzb();
            HashMap hashMap = new HashMap();
            hashMap.put("XCHACHA20_POLY1305", zzgka.zzc(zzgjz.zza));
            hashMap.put("XCHACHA20_POLY1305_RAW", zzgka.zzc(zzgjz.zzc));
            zzb2.zzd(Collections.unmodifiableMap(hashMap));
            zzgno.zzb().zzc(zze, zzgka.class);
            zzgnq.zza().zzb(zzd, zzgka.class);
            zzgmp.zzc().zzd(zzc, true);
            return;
        }
        throw new GeneralSecurityException("Registering XChaCha20Poly1305 is not supported in FIPS mode");
    }
}
