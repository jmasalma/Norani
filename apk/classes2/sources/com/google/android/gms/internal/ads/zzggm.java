package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzggm {
    public static final /* synthetic */ int zza = 0;
    private static final zzgoq zzb = zzgoq.zzb(new zzggj(), zzggi.class, zzget.class);
    private static final zzgfa zzc = zzgmz.zzd("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", zzget.class, zzgtz.SYMMETRIC, zzgsa.zzh());
    private static final zzgnp zzd = new zzggk();
    private static final zzgnn zze = new zzggl();
    private static final int zzf = 2;

    public static void zza(boolean z) throws GeneralSecurityException {
        int i = zzf;
        if (zzgmg.zza(i)) {
            int i2 = zzgkf.zza;
            zzgkf.zze(zzgny.zzc());
            zzgnv.zza().zzc(zzb);
            zzgnu zzb2 = zzgnu.zzb();
            HashMap hashMap = new HashMap();
            hashMap.put("AES128_CTR_HMAC_SHA256", zzgjn.zze);
            zzggn zzggn = new zzggn((zzggq) null);
            zzggn.zza(16);
            zzggn.zzc(32);
            zzggn.zze(16);
            zzggn.zzd(16);
            zzggo zzggo = zzggo.zzc;
            zzggn.zzb(zzggo);
            zzggp zzggp = zzggp.zzc;
            zzggn.zzf(zzggp);
            hashMap.put("AES128_CTR_HMAC_SHA256_RAW", zzggn.zzg());
            hashMap.put("AES256_CTR_HMAC_SHA256", zzgjn.zzf);
            zzggn zzggn2 = new zzggn((zzggq) null);
            zzggn2.zza(32);
            zzggn2.zzc(32);
            zzggn2.zze(32);
            zzggn2.zzd(16);
            zzggn2.zzb(zzggo);
            zzggn2.zzf(zzggp);
            hashMap.put("AES256_CTR_HMAC_SHA256_RAW", zzggn2.zzg());
            zzb2.zzd(Collections.unmodifiableMap(hashMap));
            zzgnq.zza().zzb(zzd, zzggr.class);
            zzgno.zzb().zzc(zze, zzggr.class);
            zzgmp.zzc().zzf(zzc, i, true);
            return;
        }
        throw new GeneralSecurityException("Can not use AES-CTR-HMAC in FIPS-mode, as BoringCrypto module is not available.");
    }
}
