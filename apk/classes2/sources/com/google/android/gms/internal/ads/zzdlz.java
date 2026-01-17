package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.ads.internal.zzb;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzdlz implements zzgcu {
    public final /* synthetic */ zzdmc zza;
    public final /* synthetic */ zzr zzb;
    public final /* synthetic */ zzfca zzc;
    public final /* synthetic */ zzfcd zzd;
    public final /* synthetic */ zzb zze;
    public final /* synthetic */ zzbya zzf;
    public final /* synthetic */ String zzg;
    public final /* synthetic */ String zzh;

    public /* synthetic */ zzdlz(zzdmc zzdmc, zzr zzr, zzfca zzfca, zzfcd zzfcd, zzb zzb2, zzbya zzbya, String str, String str2) {
        this.zza = zzdmc;
        this.zzb = zzr;
        this.zzc = zzfca;
        this.zzd = zzfcd;
        this.zze = zzb2;
        this.zzf = zzbya;
        this.zzg = str;
        this.zzh = str2;
    }

    public final ListenableFuture zza(Object obj) {
        return zzdmc.zzc(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, obj);
    }
}
