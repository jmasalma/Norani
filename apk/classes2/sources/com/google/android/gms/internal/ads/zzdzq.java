package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzdzq implements Callable {
    public final /* synthetic */ zzeab zza;
    public final /* synthetic */ ListenableFuture zzb;
    public final /* synthetic */ ListenableFuture zzc;
    public final /* synthetic */ zzbvq zzd;
    public final /* synthetic */ zzfhj zze;

    public /* synthetic */ zzdzq(zzeab zzeab, ListenableFuture listenableFuture, ListenableFuture listenableFuture2, zzbvq zzbvq, zzfhj zzfhj) {
        this.zza = zzeab;
        this.zzb = listenableFuture;
        this.zzc = listenableFuture2;
        this.zzd = zzbvq;
        this.zze = zzfhj;
    }

    public final Object call() {
        return zzeab.zzk(this.zza, this.zzb, this.zzc, this.zzd, this.zze);
    }
}
