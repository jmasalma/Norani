package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzfoz {
    /* access modifiers changed from: private */
    public final Context zza;
    private final Executor zzb;
    private final zzfoi zzc;
    private final zzfoy zzd;
    private Task zze;

    zzfoz(Context context, Executor executor, zzfoi zzfoi, zzfok zzfok, zzfox zzfox) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzfoi;
        this.zzd = zzfox;
    }

    public static zzfoz zzc(Context context, Executor executor, zzfoi zzfoi, zzfok zzfok) {
        zzfoz zzfoz = new zzfoz(context, executor, zzfoi, zzfok, new zzfox());
        zzfov zzfov = new zzfov(zzfoz);
        Executor executor2 = zzfoz.zzb;
        zzfoz.zze = Tasks.call(executor2, zzfov).addOnFailureListener(executor2, (OnFailureListener) new zzfow(zzfoz));
        return zzfoz;
    }

    public static /* synthetic */ void zzd(zzfoz zzfoz, Exception exc) {
        if (exc instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
        zzfoz.zzc.zzc(2025, -1, exc);
    }

    public final zzatq zzb() {
        zzfoy zzfoy = this.zzd;
        Task task = this.zze;
        zzatq zza2 = zzfoy.zza();
        if (!task.isSuccessful()) {
            return zza2;
        }
        return (zzatq) task.getResult();
    }
}
