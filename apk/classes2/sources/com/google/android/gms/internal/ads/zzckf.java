package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzckf implements zzhgr {
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

    private zzckf(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4, zzhha zzhha5, zzhha zzhha6, zzhha zzhha7, zzhha zzhha8, zzhha zzhha9, zzhha zzhha10, zzhha zzhha11, zzhha zzhha12, zzhha zzhha13, zzhha zzhha14) {
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
        this.zzk = zzhha11;
        this.zzl = zzhha12;
        this.zzm = zzhha13;
        this.zzn = zzhha14;
    }

    public static zzckf zza(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4, zzhha zzhha5, zzhha zzhha6, zzhha zzhha7, zzhha zzhha8, zzhha zzhha9, zzhha zzhha10, zzhha zzhha11, zzhha zzhha12, zzhha zzhha13, zzhha zzhha14) {
        return new zzckf(zzhha, zzhha2, zzhha3, zzhha4, zzhha5, zzhha6, zzhha7, zzhha8, zzhha9, zzhha10, zzhha11, zzhha12, zzhha13, zzhha14);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Context zza2 = ((zzchl) this.zza).zza();
        Context context = zza2;
        VersionInfoParcel zza3 = ((zzchz) this.zzb).zza();
        VersionInfoParcel versionInfoParcel = zza3;
        zzbfx zza4 = ((zzchn) this.zzj).zza();
        zzbfx zzbfx = zza4;
        zzfds zzc2 = ((zzckp) this.zzl).zzb();
        zzfds zzfds = zzc2;
        return new zzcke(zza2, zza3, (zzdpz) this.zzc.zzb(), (zzedo) this.zzd.zzb(), (zzeju) this.zze.zzb(), (zzdun) this.zzf.zzb(), (zzbyo) this.zzg.zzb(), (zzdqe) this.zzh.zzb(), (zzdvi) this.zzi.zzb(), zza4, (zzfhx) this.zzk.zzb(), zzc2, (zzctl) this.zzm.zzb(), (zzdsj) this.zzn.zzb());
    }
}
