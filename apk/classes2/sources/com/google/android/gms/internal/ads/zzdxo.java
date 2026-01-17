package com.google.android.gms.internal.ads;

import android.os.Binder;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdxo {
    private final ScheduledExecutorService zza;
    private final zzgdy zzb;
    private final zzgdy zzc;
    private final zzdyk zzd;
    private final zzhgl zze;

    public zzdxo(ScheduledExecutorService scheduledExecutorService, zzgdy zzgdy, zzgdy zzgdy2, zzdyk zzdyk, zzhgl zzhgl) {
        this.zza = scheduledExecutorService;
        this.zzb = zzgdy;
        this.zzc = zzgdy2;
        this.zzd = zzdyk;
        this.zze = zzhgl;
    }

    public static /* synthetic */ zzdyy zza(zzdxo zzdxo, zzbvq zzbvq) {
        return (zzdyy) zzdxo.zzd.zza(zzbvq).get((long) ((Integer) zzbd.zzc().zzb(zzbde.zzfS)).intValue(), TimeUnit.SECONDS);
    }

    public static /* synthetic */ ListenableFuture zzb(zzdxo zzdxo, zzbvq zzbvq, int i, Throwable th) {
        Bundle bundle;
        if (!(zzbvq == null || (bundle = zzbvq.zzm) == null)) {
            bundle.putBoolean("ls", true);
        }
        return zzgdn.zzn(((zzeab) zzdxo.zze.zzb()).zzd(zzbvq, i), new zzdxl(zzbvq), zzdxo.zzb);
    }

    public final ListenableFuture zzc(zzbvq zzbvq) {
        ListenableFuture listenableFuture;
        String str = zzbvq.zzd;
        zzv.zzr();
        if (zzs.zzD(str)) {
            listenableFuture = zzgdn.zzg(new zzdyx(1));
        } else {
            if (((Boolean) zzbd.zzc().zzb(zzbde.zzhK)).booleanValue()) {
                listenableFuture = this.zzc.zzb(new zzdxm(this, zzbvq));
            } else {
                listenableFuture = this.zzd.zza(zzbvq);
            }
        }
        int callingUid = Binder.getCallingUid();
        zzgde zzw = zzgde.zzw(listenableFuture);
        zzbcv zzbcv = zzbde.zzfS;
        return (zzgde) zzgdn.zzf((zzgde) zzgdn.zzo(zzw, (long) ((Integer) zzbd.zzc().zzb(zzbcv)).intValue(), TimeUnit.SECONDS, this.zza), Throwable.class, new zzdxn(this, zzbvq, callingUid), this.zzb);
    }
}
