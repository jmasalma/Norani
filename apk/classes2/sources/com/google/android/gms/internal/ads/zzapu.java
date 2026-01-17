package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzapu {
    private final Executor zza;

    public zzapu(Handler handler) {
        this.zza = new zzaps(this, handler);
    }

    public final void zza(zzaqd zzaqd, zzaqm zzaqm) {
        zzaqd.zzm("post-error");
        ((zzaps) this.zza).zza.post(new zzapt(zzaqd, zzaqj.zza(zzaqm), (Runnable) null));
    }

    public final void zzb(zzaqd zzaqd, zzaqj zzaqj, Runnable runnable) {
        zzaqd.zzq();
        zzaqd.zzm("post-response");
        ((zzaps) this.zza).zza.post(new zzapt(zzaqd, zzaqj, runnable));
    }
}
