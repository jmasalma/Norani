package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzfsj {
    public static ListenableFuture zza(Task task, CancellationTokenSource cancellationTokenSource) {
        zzfsi zzfsi = new zzfsi(task, (Runnable) null);
        task.addOnCompleteListener(zzgef.zzc(), new zzfsh(zzfsi));
        return zzfsi;
    }
}
