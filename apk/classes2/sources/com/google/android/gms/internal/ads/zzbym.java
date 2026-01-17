package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzbym implements Callable {
    public final /* synthetic */ zzbyo zza;
    public final /* synthetic */ Context zzb;

    public /* synthetic */ zzbym(zzbyo zzbyo, Context context) {
        this.zza = zzbyo;
        this.zzb = context;
    }

    public final Object call() {
        return zzbyo.zza(this.zza, this.zzb);
    }
}
