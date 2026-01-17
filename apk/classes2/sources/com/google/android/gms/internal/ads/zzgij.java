package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzgij implements zzgoo {
    public final Object zza(zzgez zzgez) {
        zzgit zzgit = (zzgit) zzgez;
        int i = zzgik.zza;
        String zzd = zzgit.zzd().zzd();
        zzgga zzb = zzgit.zzd().zzb();
        zzget zzb2 = zzgfk.zza(zzd).zzb();
        int i2 = zzgih.zza;
        try {
            return zzglm.zzc(new zzgih(zzguf.zzf(zzgfo.zzb(zzb), zzgyr.zza()), zzb2), zzgit.zzb());
        } catch (zzgzw e) {
            throw new GeneralSecurityException(e);
        }
    }
}
