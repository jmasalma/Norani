package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzggl implements zzgnn {
    public final zzgez zza(zzgfm zzgfm, Integer num) {
        zzggr zzggr = (zzggr) zzgfm;
        int i = zzggm.zza;
        if (zzggr.zzb() == 16 || zzggr.zzb() == 32) {
            zzggg zzggg = new zzggg((zzggh) null);
            zzggg.zzd(zzggr);
            zzggg.zzc(num);
            zzggg.zza(zzgxf.zzc(zzggr.zzb()));
            zzggg.zzb(zzgxf.zzc(zzggr.zzc()));
            return zzggg.zze();
        }
        throw new GeneralSecurityException("AES key size must be 16 or 32 bytes");
    }
}
