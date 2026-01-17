package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.ads.internal.util.zzf;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzcac implements Executor {
    private final Handler zza = new zzf(Looper.getMainLooper());

    zzcac() {
    }

    public final void execute(Runnable runnable) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            try {
                runnable.run();
            } catch (Throwable th) {
                zzv.zzr();
                zzs.zzN(zzv.zzp().zzd(), th);
                throw th;
            }
        } else {
            this.zza.post(runnable);
        }
    }
}
