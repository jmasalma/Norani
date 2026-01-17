package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzdxn implements zzgcu {
    public final /* synthetic */ zzdxo zza;
    public final /* synthetic */ zzbvq zzb;
    public final /* synthetic */ int zzc;

    public /* synthetic */ zzdxn(zzdxo zzdxo, zzbvq zzbvq, int i) {
        this.zza = zzdxo;
        this.zzb = zzbvq;
        this.zzc = i;
    }

    public final ListenableFuture zza(Object obj) {
        return zzdxo.zzb(this.zza, this.zzb, this.zzc, (Throwable) obj);
    }
}
