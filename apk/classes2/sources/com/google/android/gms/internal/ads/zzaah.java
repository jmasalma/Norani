package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzaah implements zzaai {
    final /* synthetic */ Executor zza;
    final /* synthetic */ zzdn zzb;

    zzaah(Executor executor, zzdn zzdn) {
        this.zza = executor;
        this.zzb = zzdn;
    }

    public final void execute(Runnable runnable) {
        this.zza.execute(runnable);
    }

    public final void zza() {
        this.zzb.zza(this.zza);
    }
}
