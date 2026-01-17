package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzaun implements Callable {
    public final /* synthetic */ zzaup zza;
    public final /* synthetic */ Context zzb;

    public /* synthetic */ zzaun(zzaup zzaup, Context context) {
        this.zza = zzaup;
        this.zzb = context;
    }

    public final Object call() {
        return this.zza.zzd(this.zzb);
    }
}
