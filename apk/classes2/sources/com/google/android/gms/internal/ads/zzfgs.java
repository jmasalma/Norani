package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public abstract class zzfgs {
    /* access modifiers changed from: private */
    public static final ListenableFuture zza = zzgdn.zzh((Object) null);
    /* access modifiers changed from: private */
    public final zzgdy zzb;
    /* access modifiers changed from: private */
    public final ScheduledExecutorService zzc;
    /* access modifiers changed from: private */
    public final zzfgt zzd;

    public zzfgs(zzgdy zzgdy, ScheduledExecutorService scheduledExecutorService, zzfgt zzfgt) {
        this.zzb = zzgdy;
        this.zzc = scheduledExecutorService;
        this.zzd = zzfgt;
    }

    public final zzfgi zza(Object obj, ListenableFuture... listenableFutureArr) {
        return new zzfgi(this, obj, Arrays.asList(listenableFutureArr), (zzfgr) null);
    }

    public final zzfgq zzb(Object obj, ListenableFuture listenableFuture) {
        return new zzfgq(this, obj, (String) null, listenableFuture, Collections.singletonList(listenableFuture), listenableFuture, (zzfgr) null);
    }

    /* access modifiers changed from: protected */
    public abstract String zzf(Object obj);
}
