package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzdzg implements zzgcu {
    public final /* synthetic */ zzdzj zza;
    public final /* synthetic */ zzdzi zzb;
    public final /* synthetic */ zzbvq zzc;
    public final /* synthetic */ zzgcu zzd;

    public /* synthetic */ zzdzg(zzdzj zzdzj, zzdzi zzdzi, zzbvq zzbvq, zzgcu zzgcu) {
        this.zza = zzdzj;
        this.zzb = zzdzi;
        this.zzc = zzbvq;
        this.zzd = zzgcu;
    }

    public final ListenableFuture zza(Object obj) {
        return zzgdn.zzn(this.zzb.zza(this.zzc), this.zzd, this.zza.zza);
    }
}
