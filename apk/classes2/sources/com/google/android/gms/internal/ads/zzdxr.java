package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzdxr implements zzgcu {
    public final ListenableFuture zza(Object obj) {
        TimeoutException timeoutException = (TimeoutException) obj;
        return zzgdn.zzg(new zzdwm(5));
    }
}
