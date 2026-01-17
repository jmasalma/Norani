package com.google.android.gms.internal.ads;

import android.os.Binder;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdwu {
    private final zzgdy zza;
    private final zzgdy zzb;
    private final zzdye zzc;
    private final zzhgl zzd;

    public zzdwu(zzgdy zzgdy, zzgdy zzgdy2, zzdye zzdye, zzhgl zzhgl) {
        this.zza = zzgdy;
        this.zzb = zzgdy2;
        this.zzc = zzdye;
        this.zzd = zzhgl;
    }

    public static /* synthetic */ zzdyy zza(zzdwu zzdwu, zzbvq zzbvq) {
        return (zzdyy) zzdwu.zzc.zza(zzbvq).get((long) ((Integer) zzbd.zzc().zzb(zzbde.zzfS)).intValue(), TimeUnit.SECONDS);
    }

    public static /* synthetic */ ListenableFuture zzb(zzdwu zzdwu, zzbvq zzbvq, int i, zzdyx zzdyx) {
        Bundle bundle;
        if (!(zzbvq == null || (bundle = zzbvq.zzm) == null)) {
            bundle.putBoolean("ls", true);
        }
        return zzgdn.zzn(((zzeab) zzdwu.zzd.zzb()).zzc(zzbvq, i), new zzdwq(zzbvq), zzdwu.zzb);
    }

    public final ListenableFuture zzc(zzbvq zzbvq) {
        ListenableFuture listenableFuture;
        String str = zzbvq.zzd;
        zzv.zzr();
        if (zzs.zzD(str)) {
            listenableFuture = zzgdn.zzg(new zzdyx(1));
        } else {
            listenableFuture = zzgdn.zzf(this.zza.zzb(new zzdwr(this, zzbvq)), ExecutionException.class, new zzdws(), this.zzb);
        }
        return zzgdn.zzf(listenableFuture, zzdyx.class, new zzdwt(this, zzbvq, Binder.getCallingUid()), this.zzb);
    }
}
