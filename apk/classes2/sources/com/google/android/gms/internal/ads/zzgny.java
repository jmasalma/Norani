package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzgny {
    private static final zzgny zza = ((zzgny) zzgpi.zza(new zzgnw()));
    private final AtomicReference zzb = new AtomicReference(new zzgpg(new zzgpc(), (zzgpf) null));

    public static zzgny zzc() {
        return zza;
    }

    public final zzgez zza(zzgpb zzgpb, @Nullable zzgfn zzgfn) throws GeneralSecurityException {
        return ((zzgpg) this.zzb.get()).zza(zzgpb, zzgfn);
    }

    public final zzgfm zzb(zzgpb zzgpb) throws GeneralSecurityException {
        return ((zzgpg) this.zzb.get()).zzb(zzgpb);
    }

    public final zzgpb zzd(zzgez zzgez, Class cls, @Nullable zzgfn zzgfn) throws GeneralSecurityException {
        return ((zzgpg) this.zzb.get()).zzc(zzgez, cls, zzgfn);
    }

    public final zzgpb zze(zzgfm zzgfm, Class cls) throws GeneralSecurityException {
        return ((zzgpg) this.zzb.get()).zzd(zzgfm, cls);
    }

    public final synchronized void zzf(zzgmt zzgmt) throws GeneralSecurityException {
        AtomicReference atomicReference = this.zzb;
        zzgpc zzgpc = new zzgpc((zzgpg) atomicReference.get());
        zzgpc.zza(zzgmt);
        atomicReference.set(new zzgpg(zzgpc, (zzgpf) null));
    }

    public final synchronized void zzg(zzgmx zzgmx) throws GeneralSecurityException {
        AtomicReference atomicReference = this.zzb;
        zzgpc zzgpc = new zzgpc((zzgpg) atomicReference.get());
        zzgpc.zzb(zzgmx);
        atomicReference.set(new zzgpg(zzgpc, (zzgpf) null));
    }

    public final synchronized void zzh(zzgod zzgod) throws GeneralSecurityException {
        AtomicReference atomicReference = this.zzb;
        zzgpc zzgpc = new zzgpc((zzgpg) atomicReference.get());
        zzgpc.zzc(zzgod);
        atomicReference.set(new zzgpg(zzgpc, (zzgpf) null));
    }

    public final synchronized void zzi(zzgoh zzgoh) throws GeneralSecurityException {
        AtomicReference atomicReference = this.zzb;
        zzgpc zzgpc = new zzgpc((zzgpg) atomicReference.get());
        zzgpc.zzd(zzgoh);
        atomicReference.set(new zzgpg(zzgpc, (zzgpf) null));
    }

    public final boolean zzj(zzgpb zzgpb) {
        return ((zzgpg) this.zzb.get()).zzi(zzgpb);
    }

    public final boolean zzk(zzgpb zzgpb) {
        return ((zzgpg) this.zzb.get()).zzj(zzgpb);
    }
}
