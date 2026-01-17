package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzgnv {
    private static final zzgnv zza = new zzgnv();
    private final AtomicReference zzb = new AtomicReference(new zzgov(new zzgos((zzgou) null), (zzgou) null));

    zzgnv() {
    }

    public static zzgnv zza() {
        return zza;
    }

    public final Object zzb(zzgez zzgez, Class cls) throws GeneralSecurityException {
        return ((zzgov) this.zzb.get()).zzb(zzgez, cls);
    }

    public final synchronized void zzc(zzgoq zzgoq) throws GeneralSecurityException {
        AtomicReference atomicReference = this.zzb;
        zzgos zzgos = new zzgos((zzgov) atomicReference.get(), (zzgou) null);
        zzgos.zza(zzgoq);
        atomicReference.set(new zzgov(zzgos, (zzgou) null));
    }

    public final synchronized void zzd(zzgow zzgow) throws GeneralSecurityException {
        AtomicReference atomicReference = this.zzb;
        zzgos zzgos = new zzgos((zzgov) atomicReference.get(), (zzgou) null);
        zzgos.zzb(zzgow);
        atomicReference.set(new zzgov(zzgos, (zzgou) null));
    }
}
