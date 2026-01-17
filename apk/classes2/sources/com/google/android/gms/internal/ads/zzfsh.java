package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzfsh implements OnCompleteListener {
    public final /* synthetic */ zzfsi zza;

    public /* synthetic */ zzfsh(zzfsi zzfsi) {
        this.zza = zzfsi;
    }

    public final void onComplete(Task task) {
        zzfsi zzfsi = this.zza;
        if (task.isCanceled()) {
            zzfsi.cancel(false);
        } else if (task.isSuccessful()) {
            zzfsi.zzc(task.getResult());
        } else {
            Exception exception = task.getException();
            if (exception != null) {
                zzfsi.zzd(exception);
                return;
            }
            throw new IllegalStateException();
        }
    }
}
