package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public abstract class zzgoh {
    private final Class zza;
    private final Class zzb;

    /* synthetic */ zzgoh(Class cls, Class cls2, zzgog zzgog) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public static zzgoh zzb(zzgof zzgof, Class cls, Class cls2) {
        return new zzgoe(cls, cls2, zzgof);
    }

    public abstract zzgpb zza(zzgfm zzgfm) throws GeneralSecurityException;

    public final Class zzc() {
        return this.zza;
    }

    public final Class zzd() {
        return this.zzb;
    }
}
