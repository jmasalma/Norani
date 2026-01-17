package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzetk implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;
    private final zzhha zzc;
    private final zzhha zzd;
    private final zzhha zze;
    private final zzhha zzf;
    private final zzhha zzg;
    private final zzhha zzh;
    private final zzhha zzi;

    private zzetk(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4, zzhha zzhha5, zzhha zzhha6, zzhha zzhha7, zzhha zzhha8, zzhha zzhha9, zzhha zzhha10) {
        this.zza = zzhha2;
        this.zzb = zzhha3;
        this.zzc = zzhha4;
        this.zzd = zzhha5;
        this.zze = zzhha6;
        this.zzf = zzhha7;
        this.zzg = zzhha8;
        this.zzh = zzhha9;
        this.zzi = zzhha10;
    }

    public static zzetk zza(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4, zzhha zzhha5, zzhha zzhha6, zzhha zzhha7, zzhha zzhha8, zzhha zzhha9, zzhha zzhha10) {
        return new zzetk(zzhha, zzhha2, zzhha3, zzhha4, zzhha5, zzhha6, zzhha7, zzhha8, zzhha9, zzhha10);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzgdy zzc2 = zzffu.zzc();
        zzgdy zzgdy = zzc2;
        zzfcw zzc3 = ((zzcvp) this.zze).zzc();
        zzfcw zzfcw = zzc3;
        return new zzeti(zzc2, (ScheduledExecutorService) this.zza.zzb(), (String) this.zzb.zzb(), (zzeju) this.zzc.zzb(), (Context) this.zzd.zzb(), zzc3, (zzejq) this.zzf.zzb(), (zzdpz) this.zzg.zzb(), (zzdup) this.zzh.zzb(), ((Integer) this.zzi.zzb()).intValue());
    }
}
