package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzgnm implements zzgnn {
    public final zzgez zza(zzgfm zzgfm, Integer num) {
        int i = zzgno.zza;
        zzguf zzc = ((zzgne) zzgfm).zzb().zzc();
        zzgfa zzb = zzgmp.zzc().zzb(zzc.zzi());
        if (zzgmp.zzc().zze(zzc.zzi())) {
            zzgub zza = zzb.zza(zzc.zzh());
            return new zzgnd(zzgox.zza(zza.zzg(), zza.zzf(), zza.zzb(), zzc.zzg(), num), zzgey.zza());
        }
        throw new GeneralSecurityException("Creating new keys is not allowed.");
    }
}
