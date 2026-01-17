package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzcnd implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;
    private final zzhha zzc;
    private final zzhha zzd;
    private final zzhha zze;
    private final zzhha zzf;
    private final zzhha zzg;
    private final zzhha zzh;
    private final zzhha zzi;
    private final zzhha zzj;
    private final zzhha zzk;
    private final zzhha zzl;
    private final zzhha zzm;
    private final zzhha zzn;
    private final zzhha zzo;

    private zzcnd(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4, zzhha zzhha5, zzhha zzhha6, zzhha zzhha7, zzhha zzhha8, zzhha zzhha9, zzhha zzhha10, zzhha zzhha11, zzhha zzhha12, zzhha zzhha13, zzhha zzhha14, zzhha zzhha15, zzhha zzhha16, zzhha zzhha17) {
        this.zza = zzhha;
        this.zzb = zzhha3;
        this.zzc = zzhha4;
        this.zzd = zzhha5;
        this.zze = zzhha6;
        this.zzf = zzhha7;
        this.zzg = zzhha8;
        this.zzh = zzhha9;
        this.zzi = zzhha10;
        this.zzj = zzhha11;
        this.zzk = zzhha12;
        this.zzl = zzhha14;
        this.zzm = zzhha15;
        this.zzn = zzhha16;
        this.zzo = zzhha17;
    }

    public static zzcnd zza(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4, zzhha zzhha5, zzhha zzhha6, zzhha zzhha7, zzhha zzhha8, zzhha zzhha9, zzhha zzhha10, zzhha zzhha11, zzhha zzhha12, zzhha zzhha13, zzhha zzhha14, zzhha zzhha15, zzhha zzhha16, zzhha zzhha17) {
        return new zzcnd(zzhha, zzhha2, zzhha3, zzhha4, zzhha5, zzhha6, zzhha7, zzhha8, zzhha9, zzhha10, zzhha11, zzhha12, zzhha13, zzhha14, zzhha15, zzhha16, zzhha17);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Context zza2 = ((zzchl) this.zza).zza();
        Context context = zza2;
        Context context2 = zza2;
        zzfcn zzc2 = ((zzcru) this.zzd).zzc();
        zzfcn zzfcn = zzc2;
        zzfcn zzfcn2 = zzc2;
        zzfca zzc3 = ((zzcrr) this.zze).zzc();
        zzfca zzfca = zzc3;
        zzfca zzfca2 = zzc3;
        zzben zzc4 = zzcjv.zzc();
        zzben zzben = zzc4;
        zzben zzben2 = zzc4;
        zzcuy zza3 = ((zzcvl) this.zzm).zza();
        zzcuy zzcuy = zza3;
        zzcuy zzcuy2 = zza3;
        return new zzcnc(context, zzffu.zzc(), (Executor) this.zzb.zzb(), (ScheduledExecutorService) this.zzc.zzb(), zzfcn, zzfca, (zzfju) this.zzf.zzb(), (zzfdi) this.zzg.zzb(), (View) this.zzh.zzb(), (zzcfg) this.zzi.zzb(), (zzavu) this.zzj.zzb(), (zzbel) this.zzk.zzb(), zzben, (zzfhu) this.zzl.zzb(), zzcuy, (zzcyi) this.zzn.zzb(), (zzcuu) this.zzo.zzb());
    }
}
