package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public abstract class zzgmx {
    private final Class zza;
    private final Class zzb;

    /* synthetic */ zzgmx(Class cls, Class cls2, zzgmw zzgmw) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public static zzgmx zzb(zzgmv zzgmv, Class cls, Class cls2) {
        return new zzgmu(cls, cls2, zzgmv);
    }

    public abstract zzgpb zza(zzgez zzgez, @Nullable zzgfn zzgfn) throws GeneralSecurityException;

    public final Class zzc() {
        return this.zza;
    }

    public final Class zzd() {
        return this.zzb;
    }
}
