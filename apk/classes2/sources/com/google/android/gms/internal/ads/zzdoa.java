package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zza;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdoa implements zzhgr {
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

    private zzdoa(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4, zzhha zzhha5, zzhha zzhha6, zzhha zzhha7, zzhha zzhha8, zzhha zzhha9, zzhha zzhha10, zzhha zzhha11) {
        this.zza = zzhha;
        this.zzb = zzhha2;
        this.zzc = zzhha3;
        this.zzd = zzhha4;
        this.zze = zzhha5;
        this.zzf = zzhha7;
        this.zzg = zzhha8;
        this.zzh = zzhha9;
        this.zzi = zzhha10;
        this.zzj = zzhha11;
    }

    public static zzdoa zza(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4, zzhha zzhha5, zzhha zzhha6, zzhha zzhha7, zzhha zzhha8, zzhha zzhha9, zzhha zzhha10, zzhha zzhha11) {
        return new zzdoa(zzhha, zzhha2, zzhha3, zzhha4, zzhha5, zzhha6, zzhha7, zzhha8, zzhha9, zzhha10, zzhha11);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Context zza2 = ((zzchl) this.zza).zza();
        Context context = zza2;
        VersionInfoParcel zza3 = ((zzchz) this.zzd).zza();
        VersionInfoParcel versionInfoParcel = zza3;
        zza zza4 = ((zzcju) this.zze).zza();
        zza zza5 = zza4;
        zzcft zza6 = zzckm.zza();
        zzcft zzcft = zza6;
        return new zzdnv(zza2, (Executor) this.zzb.zzb(), (zzavu) this.zzc.zzb(), zza3, zza4, zza6, (zzeca) this.zzf.zzb(), (zzfjy) this.zzg.zzb(), (zzdsj) this.zzh.zzb(), (zzecl) this.zzi.zzb(), (zzfda) this.zzj.zzb());
    }
}
