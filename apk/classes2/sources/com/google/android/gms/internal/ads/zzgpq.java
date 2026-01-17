package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzgpq {
    private static final zzgnn zza = new zzgpn();
    private static final zzgoq zzb = zzgoq.zzb(new zzgpo(), zzgpm.class, zzgpv.class);
    private static final zzgoq zzc = zzgoq.zzb(new zzgpp(), zzgpm.class, zzgfl.class);
    private static final zzgfa zzd = zzgmz.zzd("type.googleapis.com/google.crypto.tink.AesCmacKey", zzgfl.class, zzgtz.SYMMETRIC, zzgrr.zzh());

    public static /* synthetic */ zzgpm zzb(zzgpu zzgpu, Integer num) {
        zze(zzgpu);
        zzgpk zzgpk = new zzgpk((zzgpl) null);
        zzgpk.zzc(zzgpu);
        zzgpk.zza(zzgxf.zzc(zzgpu.zzc()));
        zzgpk.zzb(num);
        return zzgpk.zzd();
    }

    public static void zzd(boolean z) throws GeneralSecurityException {
        if (zzgmg.zza(1)) {
            int i = zzgre.zza;
            zzgre.zze(zzgny.zzc());
            zzgno.zzb().zzc(zza, zzgpu.class);
            zzgnv.zza().zzc(zzb);
            zzgnv.zza().zzc(zzc);
            zzgnu zzb2 = zzgnu.zzb();
            HashMap hashMap = new HashMap();
            zzgpu zzgpu = zzgqz.zzc;
            hashMap.put("AES_CMAC", zzgpu);
            hashMap.put("AES256_CMAC", zzgpu);
            zzgpr zzgpr = new zzgpr((zzgpt) null);
            zzgpr.zza(32);
            zzgpr.zzb(16);
            zzgpr.zzc(zzgps.zzd);
            hashMap.put("AES256_CMAC_RAW", zzgpr.zzd());
            zzb2.zzd(Collections.unmodifiableMap(hashMap));
            zzgmp.zzc().zzd(zzd, true);
            return;
        }
        throw new GeneralSecurityException("Registering AES CMAC is not supported in FIPS mode");
    }

    /* access modifiers changed from: private */
    public static void zze(zzgpu zzgpu) throws GeneralSecurityException {
        if (zzgpu.zzc() != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }
}
