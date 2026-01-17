package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzdue implements Callable {
    public final /* synthetic */ zzdun zza;
    public final /* synthetic */ zzfhj zzb;

    public /* synthetic */ zzdue(zzdun zzdun, zzfhj zzfhj) {
        this.zza = zzdun;
        this.zzb = zzfhj;
    }

    public final Object call() {
        zzdun.zzf(this.zza, this.zzb);
        return null;
    }
}
