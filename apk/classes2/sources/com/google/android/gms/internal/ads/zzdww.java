package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzdww implements Callable {
    public final /* synthetic */ zzavu zza;
    public final /* synthetic */ Context zzb;

    public /* synthetic */ zzdww(zzavu zzavu, Context context) {
        this.zza = zzavu;
        this.zzb = context;
    }

    public final Object call() {
        return this.zza.zzc().zzg(this.zzb);
    }
}
