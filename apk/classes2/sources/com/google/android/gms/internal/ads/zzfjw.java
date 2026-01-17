package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzfjw implements Callable {
    public final /* synthetic */ zzfjy zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzfjw(zzfjy zzfjy, String str) {
        this.zza = zzfjy;
        this.zzb = str;
    }

    public final Object call() {
        return this.zza.zzd.zza(this.zzb);
    }
}
