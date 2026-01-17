package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zza;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdpl implements zzhgr {
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

    private zzdpl(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4, zzhha zzhha5, zzhha zzhha6, zzhha zzhha7, zzhha zzhha8, zzhha zzhha9, zzhha zzhha10, zzhha zzhha11) {
        this.zza = zzhha2;
        this.zzb = zzhha3;
        this.zzc = zzhha4;
        this.zzd = zzhha5;
        this.zze = zzhha6;
        this.zzf = zzhha7;
        this.zzg = zzhha8;
        this.zzh = zzhha9;
        this.zzi = zzhha10;
        this.zzj = zzhha11;
    }

    public static zzdpl zza(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4, zzhha zzhha5, zzhha zzhha6, zzhha zzhha7, zzhha zzhha8, zzhha zzhha9, zzhha zzhha10, zzhha zzhha11) {
        return new zzdpl(zzhha, zzhha2, zzhha3, zzhha4, zzhha5, zzhha6, zzhha7, zzhha8, zzhha9, zzhha10, zzhha11);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzcft zza2 = zzckm.zza();
        zzcft zzcft = zza2;
        VersionInfoParcel zza3 = ((zzchz) this.zzd).zza();
        VersionInfoParcel versionInfoParcel = zza3;
        zza zza4 = ((zzcju) this.zze).zza();
        zza zza5 = zza4;
        return new zzdpj(zza2, (Context) this.zza.zzb(), (zzavu) this.zzb.zzb(), (zzbel) this.zzc.zzb(), zza3, zza4, (zzbcc) this.zzf.zzb(), (zzcyv) this.zzg.zzb(), (zzecl) this.zzh.zzb(), (zzfda) this.zzi.zzb(), (zzdsj) this.zzj.zzb());
    }
}
