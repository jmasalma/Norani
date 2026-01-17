package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzgfc {
    public static final zzgfm zza(zzgfm zzgfm) throws GeneralSecurityException {
        return zzgfm != null ? zzgfm : zzgfo.zza(zzb((zzgfm) null).zzaV());
    }

    static final zzguf zzb(zzgfm zzgfm) {
        try {
            return ((zzgoy) zzgny.zzc().zze((zzgfm) null, zzgoy.class)).zzc();
        } catch (GeneralSecurityException e) {
            throw new zzgpi("Parsing parameters failed in getProto(). You probably want to call some Tink register function for ".concat("null"), e);
        }
    }
}
