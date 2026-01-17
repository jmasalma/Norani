package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzgjr {
    private static final zzgnn zza = new zzgjp();
    private static final zzgoq zzb = zzgoq.zzb(new zzgjq(), zzgjo.class, zzget.class);

    public static void zza(boolean z) throws GeneralSecurityException {
        int i = zzglt.zza;
        zzglt.zze(zzgny.zzc());
        zzgnu zzb2 = zzgnu.zzb();
        HashMap hashMap = new HashMap();
        hashMap.put("XAES_256_GCM_192_BIT_NONCE", zzgjn.zzg);
        hashMap.put("XAES_256_GCM_192_BIT_NONCE_NO_PREFIX", zzgjn.zzh);
        hashMap.put("XAES_256_GCM_160_BIT_NONCE_NO_PREFIX", zzgjn.zzi);
        hashMap.put("X_AES_GCM_8_BYTE_SALT_NO_PREFIX", zzgjn.zzj);
        zzb2.zzd(Collections.unmodifiableMap(hashMap));
        zzgnv.zza().zzc(zzb);
        zzgno.zzb().zzc(zza, zzgjt.class);
    }
}
