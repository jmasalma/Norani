package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzevi implements zzeuc {
    private final Executor zza;
    private final String zzb;

    public zzevi(zzbzj zzbzj, Executor executor, String str, PackageInfo packageInfo, int i) {
        this.zza = executor;
        this.zzb = str;
    }

    public final int zza() {
        return 41;
    }

    public final ListenableFuture zzb() {
        ListenableFuture zzh = zzgdn.zzh(this.zzb);
        zzevg zzevg = new zzevg();
        Executor executor = this.zza;
        return zzgdn.zzf(zzgdn.zzm(zzh, zzevg, executor), Throwable.class, new zzevh(this), executor);
    }
}
