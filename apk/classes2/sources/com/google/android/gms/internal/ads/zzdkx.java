package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdkx implements zzhgr {
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

    private zzdkx(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4, zzhha zzhha5, zzhha zzhha6, zzhha zzhha7, zzhha zzhha8, zzhha zzhha9, zzhha zzhha10, zzhha zzhha11) {
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
    }

    public static zzdkx zza(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4, zzhha zzhha5, zzhha zzhha6, zzhha zzhha7, zzhha zzhha8, zzhha zzhha9, zzhha zzhha10, zzhha zzhha11) {
        return new zzdkx(zzhha, zzhha2, zzhha3, zzhha4, zzhha5, zzhha6, zzhha7, zzhha8, zzhha9, zzhha10, zzhha11);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzbqb zzc2 = ((zzdla) this.zza).zzc();
        zzbqb zzbqb = zzc2;
        zzbqc zzc3 = ((zzdlb) this.zzb).zzc();
        zzbqc zzbqc = zzc3;
        zzbqf zza2 = ((zzdlf) this.zzc).zza();
        zzbqf zzbqf = zza2;
        zzfca zzc4 = ((zzcrr) this.zzi).zzc();
        zzfca zzfca = zzc4;
        VersionInfoParcel zza3 = ((zzchz) this.zzj).zza();
        VersionInfoParcel versionInfoParcel = zza3;
        zzfcw zzc5 = ((zzcvp) this.zzk).zzc();
        zzfcw zzfcw = zzc5;
        return new zzdkw(zzc2, zzc3, zza2, (zzcwq) this.zzd.zzb(), (zzcym) this.zze.zzb(), (zzcvw) this.zzf.zzb(), (zzdeb) this.zzg.zzb(), (Context) this.zzh.zzb(), zzc4, zza3, zzc5);
    }
}
