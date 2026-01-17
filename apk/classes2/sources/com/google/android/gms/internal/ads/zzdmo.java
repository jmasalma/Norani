package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzb;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzdmo implements zzgcu {
    public final /* synthetic */ zzdmu zza;
    public final /* synthetic */ zzb zzb;
    public final /* synthetic */ zzbya zzc;

    public /* synthetic */ zzdmo(zzdmu zzdmu, zzb zzb2, zzbya zzbya) {
        this.zza = zzdmu;
        this.zzb = zzb2;
        this.zzc = zzbya;
    }

    public final ListenableFuture zza(Object obj) {
        return zzdmu.zza(this.zza, this.zzb, this.zzc, obj);
    }
}
