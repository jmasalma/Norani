package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzght {
    public static final /* synthetic */ int zza = 0;
    private static final zzgoq zzb = zzgoq.zzb(new zzghq(), zzghp.class, zzget.class);
    private static final zzgnn zzc = new zzghr();
    private static final zzgnp zzd = new zzghs();
    private static final zzgfa zze = zzgmz.zzd("type.googleapis.com/google.crypto.tink.AesGcmSivKey", zzget.class, zzgtz.SYMMETRIC, zzgte.zzg());

    public static void zza(boolean z) throws GeneralSecurityException {
        if (zzgmg.zza(1)) {
            int i = zzgkx.zza;
            zzgkx.zze(zzgny.zzc());
            zzgnu zzb2 = zzgnu.zzb();
            HashMap hashMap = new HashMap();
            zzghu zzghu = new zzghu((zzghw) null);
            zzghu.zza(16);
            zzghv zzghv = zzghv.zza;
            zzghu.zzb(zzghv);
            hashMap.put("AES128_GCM_SIV", zzghu.zzc());
            zzghu zzghu2 = new zzghu((zzghw) null);
            zzghu2.zza(16);
            zzghv zzghv2 = zzghv.zzc;
            zzghu2.zzb(zzghv2);
            hashMap.put("AES128_GCM_SIV_RAW", zzghu2.zzc());
            zzghu zzghu3 = new zzghu((zzghw) null);
            zzghu3.zza(32);
            zzghu3.zzb(zzghv);
            hashMap.put("AES256_GCM_SIV", zzghu3.zzc());
            zzghu zzghu4 = new zzghu((zzghw) null);
            zzghu4.zza(32);
            zzghu4.zzb(zzghv2);
            hashMap.put("AES256_GCM_SIV_RAW", zzghu4.zzc());
            zzb2.zzd(Collections.unmodifiableMap(hashMap));
            zzgnq.zza().zzb(zzd, zzghx.class);
            zzgno.zzb().zzc(zzc, zzghx.class);
            zzgnv.zza().zzc(zzb);
            zzgmp.zzc().zzd(zze, true);
            return;
        }
        throw new GeneralSecurityException("Registering AES GCM SIV is not supported in FIPS mode");
    }
}
