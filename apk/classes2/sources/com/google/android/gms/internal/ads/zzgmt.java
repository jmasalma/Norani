package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public abstract class zzgmt {
    private final zzgxe zza;
    private final Class zzb;

    /* synthetic */ zzgmt(zzgxe zzgxe, Class cls, zzgms zzgms) {
        this.zza = zzgxe;
        this.zzb = cls;
    }

    public static zzgmt zzb(zzgmr zzgmr, zzgxe zzgxe, Class cls) {
        return new zzgmq(zzgxe, cls, zzgmr);
    }

    public abstract zzgez zza(zzgpb zzgpb, @Nullable zzgfn zzgfn) throws GeneralSecurityException;

    public final zzgxe zzc() {
        return this.zza;
    }

    public final Class zzd() {
        return this.zzb;
    }
}
