package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzv;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzeov implements Callable {
    public /* synthetic */ zzeov(zzeow zzeow) {
    }

    public final Object call() {
        return new zzeox(Long.valueOf(zzv.zzD().currentTimeMillis() - zzv.zzp().zzi().zzg().zza()).longValue());
    }
}
