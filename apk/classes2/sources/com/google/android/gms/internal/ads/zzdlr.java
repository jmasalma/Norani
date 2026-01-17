package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzb;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzdlr implements zzgcu {
    public final /* synthetic */ zzdmc zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ zzbya zzc;
    public final /* synthetic */ zzb zzd;

    public /* synthetic */ zzdlr(zzdmc zzdmc, String str, zzbya zzbya, zzb zzb2) {
        this.zza = zzdmc;
        this.zzb = str;
        this.zzc = zzbya;
        this.zzd = zzb2;
    }

    public final ListenableFuture zza(Object obj) {
        return zzdmc.zzb(this.zza, this.zzb, this.zzc, this.zzd, obj);
    }
}
