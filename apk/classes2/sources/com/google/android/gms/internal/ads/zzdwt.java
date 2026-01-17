package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzdwt implements zzgcu {
    public final /* synthetic */ zzdwu zza;
    public final /* synthetic */ zzbvq zzb;
    public final /* synthetic */ int zzc;

    public /* synthetic */ zzdwt(zzdwu zzdwu, zzbvq zzbvq, int i) {
        this.zza = zzdwu;
        this.zzb = zzbvq;
        this.zzc = i;
    }

    public final ListenableFuture zza(Object obj) {
        return zzdwu.zzb(this.zza, this.zzb, this.zzc, (zzdyx) obj);
    }
}
