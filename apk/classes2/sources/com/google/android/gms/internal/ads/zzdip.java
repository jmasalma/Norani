package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdip implements zzhgr {
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
    private final zzhha zzp;
    private final zzhha zzq;
    private final zzhha zzr;
    private final zzhha zzs;

    private zzdip(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4, zzhha zzhha5, zzhha zzhha6, zzhha zzhha7, zzhha zzhha8, zzhha zzhha9, zzhha zzhha10, zzhha zzhha11, zzhha zzhha12, zzhha zzhha13, zzhha zzhha14, zzhha zzhha15, zzhha zzhha16, zzhha zzhha17, zzhha zzhha18, zzhha zzhha19) {
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
        this.zzo = zzhha15;
        this.zzp = zzhha16;
        this.zzq = zzhha17;
        this.zzr = zzhha18;
        this.zzs = zzhha19;
    }

    public static zzdip zza(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4, zzhha zzhha5, zzhha zzhha6, zzhha zzhha7, zzhha zzhha8, zzhha zzhha9, zzhha zzhha10, zzhha zzhha11, zzhha zzhha12, zzhha zzhha13, zzhha zzhha14, zzhha zzhha15, zzhha zzhha16, zzhha zzhha17, zzhha zzhha18, zzhha zzhha19) {
        return new zzdip(zzhha, zzhha2, zzhha3, zzhha4, zzhha5, zzhha6, zzhha7, zzhha8, zzhha9, zzhha10, zzhha11, zzhha12, zzhha13, zzhha14, zzhha15, zzhha16, zzhha17, zzhha18, zzhha19);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzcqz zza2 = ((zzcth) this.zza).zzb();
        zzcqz zzcqz = zza2;
        zzcqz zzcqz2 = zza2;
        zzdit zza3 = ((zzdjm) this.zzc).zza();
        zzdit zzdit = zza3;
        zzdit zzdit2 = zza3;
        zzdjt zza4 = ((zzdju) this.zze).zzb();
        zzdjt zzdjt = zza4;
        zzdjt zzdjt2 = zza4;
        zzdje zzc2 = ((zzdgz) this.zzg).zzc();
        zzdje zzdje = zzc2;
        zzdje zzdje2 = zzc2;
        zzhgl zza5 = zzhgq.zza(this.zzh);
        zzhgl zza6 = zzhgq.zza(this.zzi);
        zzhgl zza7 = zzhgq.zza(this.zzj);
        zzhgl zza8 = zzhgq.zza(this.zzk);
        zzhgl zza9 = zzhgq.zza(this.zzl);
        zzbyk zza10 = ((zzdjk) this.zzm).zzb();
        zzbyk zzbyk = zza10;
        zzbyk zzbyk2 = zza10;
        VersionInfoParcel zza11 = ((zzchz) this.zzo).zza();
        VersionInfoParcel versionInfoParcel = zza11;
        VersionInfoParcel versionInfoParcel2 = zza11;
        Context zza12 = ((zzchl) this.zzp).zza();
        Context context = zza12;
        Context context2 = zza12;
        return new zzdio(zzcqz, (Executor) this.zzb.zzb(), zzdit, (zzdjb) this.zzd.zzb(), zzdjt, (zzdiy) this.zzf.zzb(), zzdje, zza5, zza6, zza7, zza8, zza9, zzbyk, (zzavu) this.zzn.zzb(), versionInfoParcel, context, (zzdiq) this.zzq.zzb(), (zzelb) this.zzr.zzb(), (zzazf) this.zzs.zzb());
    }
}
