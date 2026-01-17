package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzezg implements zzezr {
    private zzcve zza;

    /* renamed from: zza */
    public final synchronized zzcve zzd() {
        return this.zza;
    }

    public final /* bridge */ /* synthetic */ ListenableFuture zzc(zzezs zzezs, zzezq zzezq, Object obj) {
        zzcve zzcve = null;
        return zzb(zzezs, zzezq, (zzcve) null);
    }

    public final synchronized ListenableFuture zzb(zzezs zzezs, zzezq zzezq, zzcve zzcve) {
        zzcse zzb;
        if (zzcve != null) {
            this.zza = zzcve;
        } else {
            this.zza = (zzcve) zzezq.zza(zzezs.zzb).zzh();
        }
        zzb = this.zza.zzb();
        return zzb.zzh(zzb.zzi());
    }
}
