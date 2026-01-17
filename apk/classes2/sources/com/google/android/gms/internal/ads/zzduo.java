package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzduo implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;
    private final zzhha zzc;
    private final zzhha zzd;
    private final zzhha zze;
    private final zzhha zzf;
    private final zzhha zzg;
    private final zzhha zzh;
    private final zzhha zzi;

    private zzduo(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4, zzhha zzhha5, zzhha zzhha6, zzhha zzhha7, zzhha zzhha8, zzhha zzhha9, zzhha zzhha10) {
        this.zza = zzhha;
        this.zzb = zzhha2;
        this.zzc = zzhha3;
        this.zzd = zzhha5;
        this.zze = zzhha6;
        this.zzf = zzhha7;
        this.zzg = zzhha8;
        this.zzh = zzhha9;
        this.zzi = zzhha10;
    }

    public static zzduo zza(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4, zzhha zzhha5, zzhha zzhha6, zzhha zzhha7, zzhha zzhha8, zzhha zzhha9, zzhha zzhha10) {
        return new zzduo(zzhha, zzhha2, zzhha3, zzhha4, zzhha5, zzhha6, zzhha7, zzhha8, zzhha9, zzhha10);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Context zza2 = ((zzchl) this.zzb).zza();
        Context context = zza2;
        WeakReference zzc2 = ((zzchm) this.zzc).zzc();
        WeakReference weakReference = zzc2;
        VersionInfoParcel zza3 = ((zzchz) this.zzg).zza();
        VersionInfoParcel versionInfoParcel = zza3;
        zzddc zza4 = ((zzddd) this.zzh).zzb();
        zzddc zzddc = zza4;
        return new zzdun((Executor) this.zza.zzb(), zza2, zzc2, zzffu.zzc(), (zzdpz) this.zzd.zzb(), (ScheduledExecutorService) this.zze.zzb(), (zzdsu) this.zzf.zzb(), zza3, zza4, (zzfhx) this.zzi.zzb());
    }
}
