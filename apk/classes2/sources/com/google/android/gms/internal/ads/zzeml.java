package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzeml implements zzgcu {
    public final ListenableFuture zza(Object obj) {
        if (((Throwable) obj) instanceof TimeoutException) {
            return zzgdn.zzh(new zzemn(Integer.toString(17)));
        }
        return zzgdn.zzh(new zzemn((String) null));
    }
}
