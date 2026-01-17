package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.internal.ads.zzbde;
import com.google.android.gms.internal.ads.zzbze;
import com.google.android.gms.internal.ads.zzcaf;
import com.google.android.gms.internal.ads.zzcvb;
import com.google.android.gms.internal.ads.zzdes;
import com.google.android.gms.internal.ads.zzdrr;
import com.google.android.gms.internal.ads.zzfcw;
import com.google.android.gms.internal.ads.zzfgu;
import com.google.android.gms.internal.ads.zzfha;
import com.google.android.gms.internal.ads.zzgdn;
import com.google.android.gms.internal.ads.zzhgr;
import com.google.android.gms.internal.ads.zzhgz;
import com.google.android.gms.internal.ads.zzhha;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzbg implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;
    private final zzhha zzc;
    private final zzhha zzd;
    private final zzhha zze;
    private final zzhha zzf;
    private final zzhha zzg;
    private final zzhha zzh;
    private final zzhha zzi;

    private zzbg(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4, zzhha zzhha5, zzhha zzhha6, zzhha zzhha7, zzhha zzhha8, zzhha zzhha9) {
        this.zza = zzhha;
        this.zzb = zzhha2;
        this.zzc = zzhha3;
        this.zzd = zzhha4;
        this.zze = zzhha5;
        this.zzf = zzhha6;
        this.zzg = zzhha7;
        this.zzh = zzhha8;
        this.zzi = zzhha9;
    }

    public static zzbg zza(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4, zzhha zzhha5, zzhha zzhha6, zzhha zzhha7, zzhha zzhha8, zzhha zzhha9) {
        return new zzbg(zzhha, zzhha2, zzhha3, zzhha4, zzhha5, zzhha6, zzhha7, zzhha8, zzhha9);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        ListenableFuture listenableFuture;
        zzau zzau = (zzau) this.zza.zzb();
        zzfha zzfha = (zzfha) this.zzb.zzb();
        zzbi zza2 = this.zzc.zzb();
        zzbi zzbi = zza2;
        zzcvb zza3 = this.zzd.zza();
        zzcvb zzcvb = zza3;
        zzdes zzdes = (zzdes) this.zze.zzb();
        zzb zzb2 = (zzb) this.zzf.zzb();
        zzbze zzbze = (zzbze) this.zzg.zzb();
        int intValue = ((Integer) this.zzh.zzb()).intValue();
        zzfcw zzc2 = this.zzi.zzc();
        zzfcw zzfcw = zzc2;
        Bundle bundle = zzc2.zzs;
        zzbk zzbk = null;
        if (intValue == 1 && zzbze != null) {
            bundle.putLong(zzdrr.zzc.zza(), zzv.zzD().currentTimeMillis());
            zzbk = zzb2.zza(zzbze, zzau, bundle);
            bundle.putLong(zzdrr.zzd.zza(), zzv.zzD().currentTimeMillis());
        }
        if (zzbk != null) {
            zzdes.zza(zzbk);
            listenableFuture = zzgdn.zzh(zzbk);
        } else {
            listenableFuture = zzfha.zzb(zzfgu.zzw, zza3.zzc()).zzf(zza2).zzi((long) ((Integer) zzbd.zzc().zzb(zzbde.zzfS)).intValue(), TimeUnit.SECONDS).zza();
            zzgdn.zzr(listenableFuture, new zzaw(zzdes), zzcaf.zza);
        }
        zzhgz.zzb(listenableFuture);
        ListenableFuture listenableFuture2 = listenableFuture;
        return listenableFuture;
    }
}
