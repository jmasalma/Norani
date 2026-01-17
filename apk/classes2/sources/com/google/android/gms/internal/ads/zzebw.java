package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzebw implements Callable {
    public final /* synthetic */ zzeca zza;

    public /* synthetic */ zzebw(zzeca zzeca) {
        this.zza = zzeca;
    }

    public final Object call() {
        return this.zza.getWritableDatabase();
    }
}
