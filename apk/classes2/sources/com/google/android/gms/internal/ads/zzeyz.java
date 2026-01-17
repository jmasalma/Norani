package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzeyz implements zzgcu {
    public final /* synthetic */ zzezd zza;
    public final /* synthetic */ zzcve zzb;

    public /* synthetic */ zzeyz(zzezd zzezd, zzcve zzcve) {
        this.zza = zzezd;
        this.zzb = zzcve;
    }

    public final ListenableFuture zza(Object obj) {
        return zzezd.zza(this.zza, this.zzb, (zzezl) obj);
    }
}
