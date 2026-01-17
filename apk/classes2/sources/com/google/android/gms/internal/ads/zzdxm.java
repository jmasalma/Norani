package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzdxm implements Callable {
    public final /* synthetic */ zzdxo zza;
    public final /* synthetic */ zzbvq zzb;

    public /* synthetic */ zzdxm(zzdxo zzdxo, zzbvq zzbvq) {
        this.zza = zzdxo;
        this.zzb = zzbvq;
    }

    public final Object call() {
        return zzdxo.zza(this.zza, this.zzb);
    }
}
