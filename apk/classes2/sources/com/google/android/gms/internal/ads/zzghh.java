package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzghh implements zzgnn {
    public final zzgez zza(zzgfm zzgfm, Integer num) {
        zzghm zzghm = (zzghm) zzgfm;
        int i = zzghi.zza;
        if (zzghm.zzb() != 24) {
            zzghc zzghc = new zzghc((zzghd) null);
            zzghc.zzc(zzghm);
            zzghc.zza(num);
            zzghc.zzb(zzgxf.zzc(zzghm.zzb()));
            return zzghc.zzd();
        }
        throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
    }
}
