package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbd;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzdns implements zzgdj {
    final /* synthetic */ zzfca zza;
    final /* synthetic */ zzfcd zzb;
    final /* synthetic */ zzcmq zzc;
    final /* synthetic */ zzdny zzd;

    zzdns(zzdny zzdny, zzfca zzfca, zzfcd zzfcd, zzcmq zzcmq) {
        this.zza = zzfca;
        this.zzb = zzfcd;
        this.zzc = zzcmq;
        Objects.requireNonNull(zzdny);
        this.zzd = zzdny;
    }

    public final void zza(Throwable th) {
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcfg zzcfg = (zzcfg) obj;
        zzfca zzfca = this.zza;
        zzcfg.zzW(zzfca, this.zzb);
        zzcgy zzN = zzcfg.zzN();
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzkB)).booleanValue() && zzN != null) {
            zzcmq zzcmq = this.zzc;
            zzdny zzdny = this.zzd;
            zzN.zzM(zzcmq, zzdny.zzi, zzdny.zzj);
            zzN.zzO(zzcmq, zzdny.zzi, zzdny.zzd);
        }
        if (((Boolean) zzbd.zzc().zzb(zzbde.zznt)).booleanValue() && zzN != null) {
            zzN.zzP(zzfca);
        }
    }
}
