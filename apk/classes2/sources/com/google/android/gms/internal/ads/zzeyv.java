package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzeyv implements zzffd {
    private final zzezr zza;

    public zzeyv(zzezr zzezr) {
        this.zza = zzezr;
    }

    public final ListenableFuture zza(zzffe zzffe) {
        zzeyw zzeyw = (zzeyw) zzffe;
        zzcve zzcve = null;
        return ((zzeys) this.zza).zzb(zzeyw.zzb, zzeyw.zza, (zzcve) null);
    }

    public final void zzb(zzfes zzfes) {
        zzcve zza2 = ((zzeys) this.zza).zza();
        zzcve zzcve = zza2;
        zzfes.zza = zza2;
    }
}
