package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzehj implements zzhgr {
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

    private zzehj(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4, zzhha zzhha5, zzhha zzhha6, zzhha zzhha7, zzhha zzhha8, zzhha zzhha9, zzhha zzhha10, zzhha zzhha11, zzhha zzhha12, zzhha zzhha13) {
        this.zza = zzhha;
        this.zzb = zzhha2;
        this.zzc = zzhha3;
        this.zzd = zzhha4;
        this.zze = zzhha5;
        this.zzf = zzhha6;
        this.zzg = zzhha7;
        this.zzh = zzhha9;
        this.zzi = zzhha10;
        this.zzj = zzhha11;
        this.zzk = zzhha12;
        this.zzl = zzhha13;
    }

    public static zzehj zzc(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4, zzhha zzhha5, zzhha zzhha6, zzhha zzhha7, zzhha zzhha8, zzhha zzhha9, zzhha zzhha10, zzhha zzhha11, zzhha zzhha12, zzhha zzhha13) {
        return new zzehj(zzhha, zzhha2, zzhha3, zzhha4, zzhha5, zzhha6, zzhha7, zzhha8, zzhha9, zzhha10, zzhha11, zzhha12, zzhha13);
    }

    /* renamed from: zza */
    public final zzehi zzb() {
        Context zza2 = ((zzchl) this.zza).zza();
        Context context = zza2;
        zzegl zza3 = ((zzegn) this.zzk).zzb();
        zzegl zzegl = zza3;
        return new zzehi(zza2, (zzfha) this.zzb.zzb(), (zzehb) this.zzc.zzb(), (zzcwa) this.zzd.zzb(), (zzfju) this.zze.zzb(), (zzfjy) this.zzf.zzb(), (zzcrd) this.zzg.zzb(), zzffu.zzc(), (ScheduledExecutorService) this.zzh.zzb(), (zzedr) this.zzi.zzb(), (zzfhu) this.zzj.zzb(), zza3, (zzdsd) this.zzl.zzb());
    }
}
