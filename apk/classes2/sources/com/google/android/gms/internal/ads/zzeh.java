package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzeh {
    final /* synthetic */ zzel zza;
    private final WeakReference zzb;
    private final Executor zzc;

    public zzeh(zzel zzel, zzzn zzzn, Executor executor) {
        Objects.requireNonNull(zzel);
        this.zza = zzel;
        this.zzb = new WeakReference(zzzn);
        this.zzc = executor;
    }

    public static /* synthetic */ void zza(zzeh zzeh) {
        zzzn zzzn = (zzzn) zzeh.zzb.get();
        if (zzzn != null) {
            zzzn.zza.zzl(zzeh.zza.zza());
        }
    }

    public final void zzb() {
        this.zzc.execute(new zzeg(this));
    }

    public final boolean zzc() {
        return this.zzb.get() == null;
    }
}
