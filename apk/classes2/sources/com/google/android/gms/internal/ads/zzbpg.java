package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzbpg implements zzgcu {
    public final /* synthetic */ zzbpi zza;
    public final /* synthetic */ Object zzb;

    public /* synthetic */ zzbpg(zzbpi zzbpi, Object obj) {
        this.zza = zzbpi;
        this.zzb = obj;
    }

    public final ListenableFuture zza(Object obj) {
        return zzbpi.zzb(this.zza, this.zzb, (zzboj) obj);
    }
}
