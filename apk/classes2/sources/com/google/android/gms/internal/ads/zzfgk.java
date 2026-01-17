package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzfgk {
    public static final zzfgq zza(Callable callable, Object obj, zzfgs zzfgs) {
        return zzb(callable, zzfgs.zzb, obj, zzfgs);
    }

    public static final zzfgq zzb(Callable callable, zzgdy zzgdy, Object obj, zzfgs zzfgs) {
        return new zzfgq(zzfgs, obj, (String) null, zzfgs.zza, Collections.emptyList(), zzgdy.zzb(callable), (zzfgr) null);
    }

    public static final zzfgq zzc(ListenableFuture listenableFuture, Object obj, zzfgs zzfgs) {
        return new zzfgq(zzfgs, obj, (String) null, zzfgs.zza, Collections.emptyList(), listenableFuture, (zzfgr) null);
    }

    public static final zzfgq zzd(zzfgf zzfgf, zzgdy zzgdy, Object obj, zzfgs zzfgs) {
        return zzb(new zzfgj(zzfgf), zzgdy, obj, zzfgs);
    }
}
