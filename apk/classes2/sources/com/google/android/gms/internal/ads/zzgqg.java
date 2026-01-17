package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzgqg {
    public static final /* synthetic */ int zza = 0;
    private static final zzgoq zzb = zzgoq.zzb(new zzgqc(), zzgqb.class, zzgpv.class);
    private static final zzgoq zzc = zzgoq.zzb(new zzgqd(), zzgqb.class, zzgfl.class);
    private static final zzgfa zzd = zzgmz.zzd("type.googleapis.com/google.crypto.tink.HmacKey", zzgfl.class, zzgtz.SYMMETRIC, zzgtr.zzi());
    private static final zzgnp zze = new zzgqe();
    private static final zzgnn zzf = new zzgqf();
    private static final int zzg = 2;

    public static void zza(boolean z) throws GeneralSecurityException {
        int i = zzg;
        if (zzgmg.zza(i)) {
            int i2 = zzgrm.zza;
            zzgrm.zze(zzgny.zzc());
            zzgnv.zza().zzc(zzb);
            zzgnv.zza().zzc(zzc);
            zzgnu zzb2 = zzgnu.zzb();
            HashMap hashMap = new HashMap();
            hashMap.put("HMAC_SHA256_128BITTAG", zzgqz.zza);
            zzgqh zzgqh = new zzgqh((zzgqk) null);
            zzgqh.zzb(32);
            zzgqh.zzc(16);
            zzgqj zzgqj = zzgqj.zzd;
            zzgqh.zzd(zzgqj);
            zzgqi zzgqi = zzgqi.zzc;
            zzgqh.zza(zzgqi);
            hashMap.put("HMAC_SHA256_128BITTAG_RAW", zzgqh.zze());
            zzgqh zzgqh2 = new zzgqh((zzgqk) null);
            zzgqh2.zzb(32);
            zzgqh2.zzc(32);
            zzgqj zzgqj2 = zzgqj.zza;
            zzgqh2.zzd(zzgqj2);
            zzgqh2.zza(zzgqi);
            hashMap.put("HMAC_SHA256_256BITTAG", zzgqh2.zze());
            zzgqh zzgqh3 = new zzgqh((zzgqk) null);
            zzgqh3.zzb(32);
            zzgqh3.zzc(32);
            zzgqh3.zzd(zzgqj);
            zzgqh3.zza(zzgqi);
            hashMap.put("HMAC_SHA256_256BITTAG_RAW", zzgqh3.zze());
            zzgqh zzgqh4 = new zzgqh((zzgqk) null);
            zzgqh4.zzb(64);
            zzgqh4.zzc(16);
            zzgqh4.zzd(zzgqj2);
            zzgqi zzgqi2 = zzgqi.zze;
            zzgqh4.zza(zzgqi2);
            hashMap.put("HMAC_SHA512_128BITTAG", zzgqh4.zze());
            zzgqh zzgqh5 = new zzgqh((zzgqk) null);
            zzgqh5.zzb(64);
            zzgqh5.zzc(16);
            zzgqh5.zzd(zzgqj);
            zzgqh5.zza(zzgqi2);
            hashMap.put("HMAC_SHA512_128BITTAG_RAW", zzgqh5.zze());
            zzgqh zzgqh6 = new zzgqh((zzgqk) null);
            zzgqh6.zzb(64);
            zzgqh6.zzc(32);
            zzgqh6.zzd(zzgqj2);
            zzgqh6.zza(zzgqi2);
            hashMap.put("HMAC_SHA512_256BITTAG", zzgqh6.zze());
            zzgqh zzgqh7 = new zzgqh((zzgqk) null);
            zzgqh7.zzb(64);
            zzgqh7.zzc(32);
            zzgqh7.zzd(zzgqj);
            zzgqh7.zza(zzgqi2);
            hashMap.put("HMAC_SHA512_256BITTAG_RAW", zzgqh7.zze());
            hashMap.put("HMAC_SHA512_512BITTAG", zzgqz.zzb);
            zzgqh zzgqh8 = new zzgqh((zzgqk) null);
            zzgqh8.zzb(64);
            zzgqh8.zzc(64);
            zzgqh8.zzd(zzgqj);
            zzgqh8.zza(zzgqi2);
            hashMap.put("HMAC_SHA512_512BITTAG_RAW", zzgqh8.zze());
            zzb2.zzd(Collections.unmodifiableMap(hashMap));
            zzgno.zzb().zzc(zzf, zzgql.class);
            zzgnq.zza().zzb(zze, zzgql.class);
            zzgmp.zzc().zzf(zzd, i, true);
            return;
        }
        throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
    }
}
