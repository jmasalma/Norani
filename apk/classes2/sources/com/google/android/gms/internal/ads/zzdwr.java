package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzdwr implements Callable {
    public final /* synthetic */ zzdwu zza;
    public final /* synthetic */ zzbvq zzb;

    public /* synthetic */ zzdwr(zzdwu zzdwu, zzbvq zzbvq) {
        this.zza = zzdwu;
        this.zzb = zzbvq;
    }

    public final Object call() {
        return zzdwu.zza(this.zza, this.zzb);
    }
}
