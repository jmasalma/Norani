package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzehg implements zzgcu {
    public final /* synthetic */ zzehi zza;
    public final /* synthetic */ zzfca zzb;
    public final /* synthetic */ zzfcn zzc;
    public final /* synthetic */ zzedm zzd;

    public /* synthetic */ zzehg(zzehi zzehi, zzfca zzfca, zzfcn zzfcn, zzedm zzedm) {
        this.zza = zzehi;
        this.zzb = zzfca;
        this.zzc = zzfcn;
        this.zzd = zzedm;
    }

    public final ListenableFuture zza(Object obj) {
        return zzehi.zzb(this.zza, this.zzb, this.zzc, this.zzd, (Throwable) obj);
    }
}
