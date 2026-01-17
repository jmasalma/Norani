package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzabf implements Executor {
    public final /* synthetic */ zzdt zza;

    public /* synthetic */ zzabf(zzdt zzdt) {
        this.zza = zzdt;
    }

    public final void execute(Runnable runnable) {
        this.zza.zzi(runnable);
    }
}
