package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zza;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdmd implements zzhgr {
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

    private zzdmd(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4, zzhha zzhha5, zzhha zzhha6, zzhha zzhha7, zzhha zzhha8, zzhha zzhha9, zzhha zzhha10, zzhha zzhha11, zzhha zzhha12, zzhha zzhha13, zzhha zzhha14, zzhha zzhha15, zzhha zzhha16, zzhha zzhha17, zzhha zzhha18) {
        this.zza = zzhha;
        this.zzb = zzhha2;
        this.zzc = zzhha3;
        this.zzd = zzhha4;
        this.zze = zzhha5;
        this.zzf = zzhha6;
        this.zzg = zzhha8;
        this.zzh = zzhha9;
        this.zzi = zzhha10;
        this.zzj = zzhha11;
        this.zzk = zzhha12;
        this.zzl = zzhha13;
        this.zzm = zzhha14;
        this.zzn = zzhha15;
        this.zzo = zzhha16;
        this.zzp = zzhha17;
        this.zzq = zzhha18;
    }

    public static zzdmd zzc(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4, zzhha zzhha5, zzhha zzhha6, zzhha zzhha7, zzhha zzhha8, zzhha zzhha9, zzhha zzhha10, zzhha zzhha11, zzhha zzhha12, zzhha zzhha13, zzhha zzhha14, zzhha zzhha15, zzhha zzhha16, zzhha zzhha17, zzhha zzhha18) {
        return new zzdmd(zzhha, zzhha2, zzhha3, zzhha4, zzhha5, zzhha6, zzhha7, zzhha8, zzhha9, zzhha10, zzhha11, zzhha12, zzhha13, zzhha14, zzhha15, zzhha16, zzhha17, zzhha18);
    }

    /* renamed from: zza */
    public final zzdmc zzb() {
        VersionInfoParcel zza2 = ((zzchz) this.zzd).zza();
        VersionInfoParcel versionInfoParcel = zza2;
        VersionInfoParcel versionInfoParcel2 = zza2;
        zza zza3 = ((zzcju) this.zze).zza();
        zza zza4 = zza3;
        zza zza5 = zza3;
        zzfcw zzc2 = ((zzcvp) this.zzg).zzc();
        zzfcw zzfcw = zzc2;
        zzfcw zzfcw2 = zzc2;
        return new zzdmc((Context) this.zza.zzb(), (zzdli) this.zzb.zzb(), (zzavu) this.zzc.zzb(), versionInfoParcel, zza4, (zzbcc) this.zzf.zzb(), zzffu.zzc(), zzfcw, (zzdmu) this.zzh.zzb(), (zzdpj) this.zzi.zzb(), (ScheduledExecutorService) this.zzj.zzb(), (zzdsj) this.zzk.zzb(), (zzfjy) this.zzl.zzb(), (zzeca) this.zzm.zzb(), (zzdoe) this.zzn.zzb(), (zzecl) this.zzo.zzb(), (zzfda) this.zzp.zzb(), (zzdsd) this.zzq.zzb());
    }
}
