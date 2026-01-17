package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzfjm implements Callable {
    public final /* synthetic */ zzfjp zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzfjm(zzfjp zzfjp, String str) {
        this.zza = zzfjp;
        this.zzb = str;
    }

    public final Object call() {
        return this.zza.zzb.zza(this.zzb);
    }
}
