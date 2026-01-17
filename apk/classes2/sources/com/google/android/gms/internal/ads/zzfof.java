package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzfof implements Continuation {
    public final /* synthetic */ zzarz zza;
    public final /* synthetic */ int zzb;

    public /* synthetic */ zzfof(zzarz zzarz, int i) {
        this.zza = zzarz;
        this.zzb = i;
    }

    public final Object then(Task task) {
        int i = zzfoi.zza;
        if (!task.isSuccessful()) {
            return false;
        }
        int i2 = this.zzb;
        zzfqg zza2 = ((zzfqi) task.getResult()).zza(((zzasd) this.zza.zzbr()).zzaV());
        zza2.zza(i2);
        zza2.zzc();
        return true;
    }
}
