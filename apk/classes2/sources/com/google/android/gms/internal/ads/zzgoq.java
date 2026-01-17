package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public abstract class zzgoq {
    private final Class zza;
    private final Class zzb;

    /* synthetic */ zzgoq(Class cls, Class cls2, zzgop zzgop) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public static zzgoq zzb(zzgoo zzgoo, Class cls, Class cls2) {
        return new zzgon(cls, cls2, zzgoo);
    }

    public abstract Object zza(zzgez zzgez) throws GeneralSecurityException;

    public final Class zzc() {
        return this.zza;
    }

    public final Class zzd() {
        return this.zzb;
    }
}
