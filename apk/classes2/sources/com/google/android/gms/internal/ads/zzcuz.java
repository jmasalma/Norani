package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzcuz implements Callable {
    public final /* synthetic */ zzcvb zza;
    public final /* synthetic */ ListenableFuture zzb;
    public final /* synthetic */ Bundle zzc;

    public /* synthetic */ zzcuz(zzcvb zzcvb, ListenableFuture listenableFuture, Bundle bundle) {
        this.zza = zzcvb;
        this.zzb = listenableFuture;
        this.zzc = bundle;
    }

    public final Object call() {
        return zzcvb.zza(this.zza, this.zzb, this.zzc);
    }
}
