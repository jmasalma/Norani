package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzdxy implements Callable {
    public final /* synthetic */ zzdyb zza;
    public final /* synthetic */ zzead zzb;

    public /* synthetic */ zzdxy(zzdyb zzdyb, zzead zzead) {
        this.zza = zzdyb;
        this.zzb = zzead;
    }

    public final Object call() {
        return zzdyb.zzf(this.zza, this.zzb);
    }
}
