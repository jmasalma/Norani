package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzfgi {
    final /* synthetic */ zzfgs zza;
    private final Object zzb;
    private final List zzc;

    /* synthetic */ zzfgi(zzfgs zzfgs, Object obj, List list, zzfgr zzfgr) {
        Objects.requireNonNull(zzfgs);
        this.zza = zzfgs;
        this.zzb = obj;
        this.zzc = list;
    }

    public final zzfgq zza(Callable callable) {
        List list = this.zzc;
        zzgdl zzb2 = zzgdn.zzb(list);
        ListenableFuture zza2 = zzb2.zza(new zzfgh(), zzcaf.zzg);
        zzfgs zzfgs = this.zza;
        return new zzfgq(zzfgs, this.zzb, (String) null, zza2, list, zzb2.zza(callable, zzfgs.zzb), (zzfgr) null);
    }
}
