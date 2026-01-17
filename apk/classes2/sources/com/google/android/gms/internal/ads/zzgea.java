package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzgea implements Executor {
    public final /* synthetic */ Executor zza;
    public final /* synthetic */ zzgcb zzb;

    public /* synthetic */ zzgea(Executor executor, zzgcb zzgcb) {
        this.zza = executor;
        this.zzb = zzgcb;
    }

    public final void execute(Runnable runnable) {
        zzgef.zze(this.zza, this.zzb, runnable);
    }
}
