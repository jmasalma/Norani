package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzgoy implements zzgpb {
    private final zzgxe zza;
    private final zzguf zzb;

    private zzgoy(zzguf zzguf, zzgxe zzgxe) {
        this.zzb = zzguf;
        this.zza = zzgxe;
    }

    public static zzgoy zza(zzguf zzguf) throws GeneralSecurityException {
        return new zzgoy(zzguf, zzgpj.zza(zzguf.zzi()));
    }

    public static zzgoy zzb(zzguf zzguf) {
        return new zzgoy(zzguf, zzgpj.zzb(zzguf.zzi()));
    }

    public final zzguf zzc() {
        return this.zzb;
    }

    public final zzgxe zzd() {
        return this.zza;
    }
}
