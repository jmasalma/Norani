package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzgeo extends zzgdd implements RunnableFuture {
    private volatile zzgdv zza;

    zzgeo(zzgct zzgct) {
        this.zza = new zzgem(this, zzgct);
    }

    static zzgeo zze(Runnable runnable, Object obj) {
        return new zzgeo(Executors.callable(runnable, obj));
    }

    public final void run() {
        zzgdv zzgdv = this.zza;
        if (zzgdv != null) {
            zzgdv.run();
        }
        this.zza = null;
    }

    /* access modifiers changed from: protected */
    public final String zza() {
        zzgdv zzgdv = this.zza;
        if (zzgdv == null) {
            return super.zza();
        }
        String obj = zzgdv.toString();
        return "task=[" + obj + "]";
    }

    /* access modifiers changed from: protected */
    public final void zzb() {
        zzgdv zzgdv;
        if (zzo() && (zzgdv = this.zza) != null) {
            zzgdv.zzh();
        }
        this.zza = null;
    }

    zzgeo(Callable callable) {
        this.zza = new zzgen(this, callable);
    }
}
