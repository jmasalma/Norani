package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzggw implements zzgnn {
    public final zzgez zza(zzgfm zzgfm, Integer num) {
        zzghb zzghb = (zzghb) zzgfm;
        int i = zzggx.zza;
        if (zzghb.zzc() != 24) {
            zzggs zzggs = new zzggs((zzggt) null);
            zzggs.zzc(zzghb);
            zzggs.zza(num);
            zzggs.zzb(zzgxf.zzc(zzghb.zzc()));
            return zzggs.zzd();
        }
        throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
    }
}
