package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzghi {
    public static final /* synthetic */ int zza = 0;
    private static final zzgoq zzb = zzgoq.zzb(new zzghf(), zzghe.class, zzget.class);
    private static final zzgfa zzc = zzgmz.zzd("type.googleapis.com/google.crypto.tink.AesGcmKey", zzget.class, zzgtz.SYMMETRIC, zzgsy.zzg());
    private static final zzgnp zzd = new zzghg();
    private static final zzgnn zze = new zzghh();
    private static final int zzf = 2;

    public static void zza(boolean z) throws GeneralSecurityException {
        int i = zzf;
        if (zzgmg.zza(i)) {
            int i2 = zzgkr.zza;
            zzgkr.zze(zzgny.zzc());
            zzgnv.zza().zzc(zzb);
            zzgnu zzb2 = zzgnu.zzb();
            HashMap hashMap = new HashMap();
            hashMap.put("AES128_GCM", zzgjn.zza);
            zzghj zzghj = new zzghj((zzghl) null);
            zzghj.zza(12);
            zzghj.zzb(16);
            zzghj.zzc(16);
            zzghk zzghk = zzghk.zzc;
            zzghj.zzd(zzghk);
            hashMap.put("AES128_GCM_RAW", zzghj.zze());
            hashMap.put("AES256_GCM", zzgjn.zzb);
            zzghj zzghj2 = new zzghj((zzghl) null);
            zzghj2.zza(12);
            zzghj2.zzb(32);
            zzghj2.zzc(16);
            zzghj2.zzd(zzghk);
            hashMap.put("AES256_GCM_RAW", zzghj2.zze());
            zzb2.zzd(Collections.unmodifiableMap(hashMap));
            zzgnq.zza().zzb(zzd, zzghm.class);
            zzgno.zzb().zzc(zze, zzghm.class);
            zzgmp.zzc().zzf(zzc, i, true);
            return;
        }
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }
}
