package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public abstract class zzgod {
    private final zzgxe zza;
    private final Class zzb;

    /* synthetic */ zzgod(zzgxe zzgxe, Class cls, zzgoc zzgoc) {
        this.zza = zzgxe;
        this.zzb = cls;
    }

    public static zzgod zzb(zzgob zzgob, zzgxe zzgxe, Class cls) {
        return new zzgoa(zzgxe, cls, zzgob);
    }

    public abstract zzgfm zza(zzgpb zzgpb) throws GeneralSecurityException;

    public final zzgxe zzc() {
        return this.zza;
    }

    public final Class zzd() {
        return this.zzb;
    }
}
