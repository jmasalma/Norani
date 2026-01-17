package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzcow implements zzhgr {
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

    private zzcow(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4, zzhha zzhha5, zzhha zzhha6, zzhha zzhha7, zzhha zzhha8, zzhha zzhha9, zzhha zzhha10) {
        this.zza = zzhha;
        this.zzb = zzhha2;
        this.zzc = zzhha3;
        this.zzd = zzhha4;
        this.zze = zzhha5;
        this.zzf = zzhha6;
        this.zzg = zzhha7;
        this.zzh = zzhha8;
        this.zzi = zzhha9;
        this.zzj = zzhha10;
    }

    public static zzcov zzc(zzcqz zzcqz, Context context, zzfcb zzfcb, View view, zzcfg zzcfg, zzcqy zzcqy, zzdje zzdje, zzdef zzdef, zzhgl zzhgl, Executor executor) {
        return new zzcov(zzcqz, context, zzfcb, view, zzcfg, zzcqy, zzdje, zzdef, zzhgl, executor);
    }

    public static zzcow zzd(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4, zzhha zzhha5, zzhha zzhha6, zzhha zzhha7, zzhha zzhha8, zzhha zzhha9, zzhha zzhha10) {
        return new zzcow(zzhha, zzhha2, zzhha3, zzhha4, zzhha5, zzhha6, zzhha7, zzhha8, zzhha9, zzhha10);
    }

    /* renamed from: zza */
    public final zzcov zzb() {
        zzcqz zza2 = ((zzcth) this.zza).zzb();
        zzcqz zzcqz = zza2;
        zzfcb zzc2 = ((zzcpc) this.zzc).zzc();
        zzfcb zzfcb = zzc2;
        View zza3 = ((zzcpb) this.zzd).zza();
        View view = zza3;
        zzcfg zza4 = ((zzcpq) this.zze).zza();
        zzcfg zzcfg = zza4;
        zzcqy zzc3 = ((zzcpd) this.zzf).zzc();
        zzcqy zzcqy = zzc3;
        zzdje zzc4 = ((zzdgz) this.zzg).zzc();
        zzdje zzdje = zzc4;
        return new zzcov(zza2, (Context) this.zzb.zzb(), zzc2, zza3, zza4, zzc3, zzc4, (zzdef) this.zzh.zzb(), zzhgq.zza(this.zzi), (Executor) this.zzj.zzb());
    }
}
