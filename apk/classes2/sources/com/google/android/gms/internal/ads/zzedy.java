package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzedy implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;
    private final zzhha zzc;
    private final zzhha zzd;
    private final zzhha zze;
    private final zzhha zzf;
    private final zzhha zzg;
    private final zzhha zzh;
    private final zzhha zzi;

    private zzedy(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4, zzhha zzhha5, zzhha zzhha6, zzhha zzhha7, zzhha zzhha8, zzhha zzhha9, zzhha zzhha10) {
        this.zza = zzhha;
        this.zzb = zzhha2;
        this.zzc = zzhha3;
        this.zzd = zzhha4;
        this.zze = zzhha5;
        this.zzf = zzhha6;
        this.zzg = zzhha8;
        this.zzh = zzhha9;
        this.zzi = zzhha10;
    }

    public static zzedy zza(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4, zzhha zzhha5, zzhha zzhha6, zzhha zzhha7, zzhha zzhha8, zzhha zzhha9, zzhha zzhha10) {
        return new zzedy(zzhha, zzhha2, zzhha3, zzhha4, zzhha5, zzhha6, zzhha7, zzhha8, zzhha9, zzhha10);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfcw zzc2 = ((zzcvp) this.zze).zzc();
        zzfcw zzfcw = zzc2;
        VersionInfoParcel zza2 = ((zzchz) this.zzf).zza();
        VersionInfoParcel versionInfoParcel = zza2;
        zzbki zzbki = new zzbki();
        zzbki zzbki2 = zzbki;
        return new zzedx((zzcog) this.zza.zzb(), (Context) this.zzb.zzb(), (Executor) this.zzc.zzb(), (zzdpj) this.zzd.zzb(), zzc2, zza2, zzbki, (zzecl) this.zzg.zzb(), (zzdsd) this.zzh.zzb(), (zzdsj) this.zzi.zzb());
    }
}
