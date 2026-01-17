package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzg;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzcvc implements zzhgr {
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

    private zzcvc(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4, zzhha zzhha5, zzhha zzhha6, zzhha zzhha7, zzhha zzhha8, zzhha zzhha9, zzhha zzhha10, zzhha zzhha11, zzhha zzhha12, zzhha zzhha13) {
        this.zza = zzhha;
        this.zzb = zzhha2;
        this.zzc = zzhha3;
        this.zzd = zzhha4;
        this.zze = zzhha6;
        this.zzf = zzhha7;
        this.zzg = zzhha8;
        this.zzh = zzhha9;
        this.zzi = zzhha10;
        this.zzj = zzhha11;
        this.zzk = zzhha12;
        this.zzl = zzhha13;
    }

    public static zzcvc zzc(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4, zzhha zzhha5, zzhha zzhha6, zzhha zzhha7, zzhha zzhha8, zzhha zzhha9, zzhha zzhha10, zzhha zzhha11, zzhha zzhha12, zzhha zzhha13) {
        return new zzcvc(zzhha, zzhha2, zzhha3, zzhha4, zzhha5, zzhha6, zzhha7, zzhha8, zzhha9, zzhha10, zzhha11, zzhha12, zzhha13);
    }

    /* renamed from: zza */
    public final zzcvb zzb() {
        VersionInfoParcel zza2 = ((zzchz) this.zzb).zza();
        VersionInfoParcel versionInfoParcel = zza2;
        String zzc2 = ((zzdxh) this.zzd).zzb();
        String str = zzc2;
        List zzc3 = zzepn.zzc();
        List list = zzc3;
        zzhgl zza3 = zzhgq.zza(this.zzf);
        zzg zza4 = ((zzchi) this.zzg).zzb();
        zzg zzg2 = zza4;
        zzeuf zza5 = ((zzeug) this.zzi).zzb();
        zzeuf zzeuf = zza5;
        zzfcw zzc4 = ((zzcvp) this.zzj).zzc();
        zzfcw zzfcw = zzc4;
        return new zzcvb((zzfha) this.zza.zzb(), zza2, (ApplicationInfo) this.zzc.zzb(), zzc2, zzc3, (PackageInfo) this.zze.zzb(), zza3, zza4, (String) this.zzh.zzb(), zza5, zzc4, (zzdbo) this.zzk.zzb(), ((Integer) this.zzl.zzb()).intValue());
    }
}
