package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzavu;
import com.google.android.gms.internal.ads.zzbej;
import com.google.android.gms.internal.ads.zzche;
import com.google.android.gms.internal.ads.zzdso;
import com.google.android.gms.internal.ads.zzfda;
import com.google.android.gms.internal.ads.zzfdv;
import com.google.android.gms.internal.ads.zzffu;
import com.google.android.gms.internal.ads.zzfjy;
import com.google.android.gms.internal.ads.zzgdy;
import com.google.android.gms.internal.ads.zzhgr;
import com.google.android.gms.internal.ads.zzhha;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzav implements zzhgr {
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

    private zzav(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4, zzhha zzhha5, zzhha zzhha6, zzhha zzhha7, zzhha zzhha8, zzhha zzhha9, zzhha zzhha10, zzhha zzhha11, zzhha zzhha12, zzhha zzhha13) {
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

    public static zzav zza(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4, zzhha zzhha5, zzhha zzhha6, zzhha zzhha7, zzhha zzhha8, zzhha zzhha9, zzhha zzhha10, zzhha zzhha11, zzhha zzhha12, zzhha zzhha13) {
        return new zzav(zzhha, zzhha2, zzhha3, zzhha4, zzhha5, zzhha6, zzhha7, zzhha8, zzhha9, zzhha10, zzhha11, zzhha12, zzhha13);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Context zza2 = this.zzb.zza();
        Context context = zza2;
        zzgdy zzc2 = zzffu.zzc();
        zzgdy zzgdy = zzc2;
        VersionInfoParcel zza3 = this.zzh.zza();
        VersionInfoParcel versionInfoParcel = zza3;
        zzbej zza4 = this.zzi.zza();
        zzbej zzbej = zza4;
        return new zzau((zzche) this.zza.zzb(), zza2, (zzavu) this.zzc.zzb(), (zzfdv) this.zzd.zzb(), zzc2, (ScheduledExecutorService) this.zze.zzb(), (zzdso) this.zzf.zzb(), (zzfjy) this.zzg.zzb(), zza3, zza4, (zzfda) this.zzj.zzb(), (zzo) this.zzk.zzb(), (zzf) this.zzl.zzb());
    }
}
