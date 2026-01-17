package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdyc implements zzhgr {
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

    private zzdyc(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4, zzhha zzhha5, zzhha zzhha6, zzhha zzhha7, zzhha zzhha8, zzhha zzhha9, zzhha zzhha10, zzhha zzhha11, zzhha zzhha12, zzhha zzhha13) {
        this.zza = zzhha;
        this.zzb = zzhha2;
        this.zzc = zzhha3;
        this.zzd = zzhha4;
        this.zze = zzhha6;
        this.zzf = zzhha7;
        this.zzg = zzhha8;
        this.zzh = zzhha11;
        this.zzi = zzhha12;
        this.zzj = zzhha13;
    }

    public static zzdyc zzc(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4, zzhha zzhha5, zzhha zzhha6, zzhha zzhha7, zzhha zzhha8, zzhha zzhha9, zzhha zzhha10, zzhha zzhha11, zzhha zzhha12, zzhha zzhha13) {
        return new zzdyc(zzhha, zzhha2, zzhha3, zzhha4, zzhha5, zzhha6, zzhha7, zzhha8, zzhha9, zzhha10, zzhha11, zzhha12, zzhha13);
    }

    /* renamed from: zza */
    public final zzdyb zzb() {
        Context zza2 = ((zzchl) this.zzb).zza();
        Context context = zza2;
        VersionInfoParcel zza3 = ((zzchz) this.zzc).zza();
        VersionInfoParcel versionInfoParcel = zza3;
        zzfcw zzc2 = ((zzcvp) this.zzd).zzc();
        zzfcw zzfcw = zzc2;
        zzbvy zza4 = zzcij.zza();
        zzbvy zzbvy = zza4;
        zzeag zza5 = zzcig.zza();
        zzeag zzeag = zza5;
        zzcyy zza6 = ((zzcyz) this.zzj).zzb();
        zzcyy zzcyy = zza6;
        return new zzdyb((zzche) this.zza.zzb(), zza2, zza3, zzc2, zzffu.zzc(), (String) this.zze.zzb(), (zzfhu) this.zzf.zzb(), (zzdsd) this.zzg.zzb(), zza4, zza5, (ScheduledExecutorService) this.zzh.zzb(), (zzfjy) this.zzi.zzb(), zza6);
    }
}
