package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzv;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzcea implements Callable {
    public final /* synthetic */ zzceb zza;

    public /* synthetic */ zzcea(zzceb zzceb) {
        this.zza = zzceb;
    }

    public final Object call() {
        return Long.valueOf(zzv.zzc().zza(this.zza.zzi));
    }
}
