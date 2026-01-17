package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzggx {
    public static final /* synthetic */ int zza = 0;
    private static final zzgoq zzb = zzgoq.zzb(new zzggv(), zzggu.class, zzget.class);
    private static final zzgfa zzc = zzgmz.zzd("type.googleapis.com/google.crypto.tink.AesEaxKey", zzget.class, zzgtz.SYMMETRIC, zzgsp.zzh());
    private static final zzgnn zzd = new zzggw();

    public static void zza(boolean z) throws GeneralSecurityException {
        if (zzgmg.zza(1)) {
            int i = zzgkk.zza;
            zzgkk.zze(zzgny.zzc());
            zzgnv.zza().zzc(zzb);
            zzgnu zzb2 = zzgnu.zzb();
            HashMap hashMap = new HashMap();
            hashMap.put("AES128_EAX", zzgjn.zzc);
            zzggy zzggy = new zzggy((zzgha) null);
            zzggy.zza(16);
            zzggy.zzb(16);
            zzggy.zzc(16);
            zzggz zzggz = zzggz.zzc;
            zzggy.zzd(zzggz);
            hashMap.put("AES128_EAX_RAW", zzggy.zze());
            hashMap.put("AES256_EAX", zzgjn.zzd);
            zzggy zzggy2 = new zzggy((zzgha) null);
            zzggy2.zza(16);
            zzggy2.zzb(32);
            zzggy2.zzc(16);
            zzggy2.zzd(zzggz);
            hashMap.put("AES256_EAX_RAW", zzggy2.zze());
            zzb2.zzd(Collections.unmodifiableMap(hashMap));
            zzgno.zzb().zzc(zzd, zzghb.class);
            zzgmp.zzc().zzd(zzc, true);
            return;
        }
        throw new GeneralSecurityException("Registering AES EAX is not supported in FIPS mode");
    }
}
