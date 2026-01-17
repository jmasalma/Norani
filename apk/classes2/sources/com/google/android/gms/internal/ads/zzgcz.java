package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
abstract class zzgcz extends zzgdv {
    private final Executor zza;
    final /* synthetic */ zzgda zzb;

    zzgcz(zzgda zzgda, Executor executor) {
        Objects.requireNonNull(zzgda);
        this.zzb = zzgda;
        executor.getClass();
        Executor executor2 = executor;
        this.zza = executor;
    }

    /* access modifiers changed from: package-private */
    public abstract void zzc(Object obj);

    /* access modifiers changed from: package-private */
    public final void zzd(Throwable th) {
        zzgda zzgda = this.zzb;
        zzgda.zza = null;
        if (th instanceof ExecutionException) {
            zzgda.zzd(((ExecutionException) th).getCause());
        } else if (th instanceof CancellationException) {
            zzgda.cancel(false);
        } else {
            zzgda.zzd(th);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zze(Object obj) {
        this.zzb.zza = null;
        zzc(obj);
    }

    /* access modifiers changed from: package-private */
    public final void zzf() {
        try {
            this.zza.execute(this);
        } catch (RejectedExecutionException e) {
            this.zzb.zzd(e);
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean zzg() {
        return this.zzb.isDone();
    }
}
