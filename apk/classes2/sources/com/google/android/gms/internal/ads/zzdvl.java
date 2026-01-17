package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdvl implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;
    private final zzhha zzc;
    private final zzhha zzd;
    private final zzhha zze;
    private final zzhha zzf;
    private final zzhha zzg;
    private final zzhha zzh;

    private zzdvl(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4, zzhha zzhha5, zzhha zzhha6, zzhha zzhha7, zzhha zzhha8, zzhha zzhha9, zzhha zzhha10) {
        this.zza = zzhha;
        this.zzb = zzhha2;
        this.zzc = zzhha3;
        this.zzd = zzhha4;
        this.zze = zzhha5;
        this.zzf = zzhha6;
        this.zzg = zzhha7;
        this.zzh = zzhha10;
    }

    public static zzdvl zza(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4, zzhha zzhha5, zzhha zzhha6, zzhha zzhha7, zzhha zzhha8, zzhha zzhha9, zzhha zzhha10) {
        return new zzdvl(zzhha, zzhha2, zzhha3, zzhha4, zzhha5, zzhha6, zzhha7, zzhha8, zzhha9, zzhha10);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Context zza2 = ((zzchl) this.zzd).zza();
        Context context = zza2;
        VersionInfoParcel zza3 = ((zzchz) this.zze).zza();
        VersionInfoParcel versionInfoParcel = zza3;
        zzdvp zzdvp = new zzdvp();
        zzdvp zzdvp2 = zzdvp;
        zzdvp zzdvp3 = new zzdvp();
        zzdvp zzdvp4 = zzdvp3;
        String zzc2 = ((zzchq) this.zzh).zzb();
        String str = zzc2;
        zzdvi zzdvi = new zzdvi((zzdvt) this.zza.zzb(), (zzdwl) this.zzb.zzb(), (zzduu) this.zzc.zzb(), zza2, zza3, (zzdvd) this.zzf.zzb(), (zzdwf) this.zzg.zzb(), zzdvp, zzdvp3, zzc2);
        zzdvi zzdvi2 = zzdvi;
        return zzdvi;
    }
}
