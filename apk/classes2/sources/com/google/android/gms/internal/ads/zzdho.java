package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.common.util.Clock;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdho implements zzhgr {
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
    private final zzhha zzt;
    private final zzhha zzu;
    private final zzhha zzv;
    private final zzhha zzw;
    private final zzhha zzx;

    private zzdho(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4, zzhha zzhha5, zzhha zzhha6, zzhha zzhha7, zzhha zzhha8, zzhha zzhha9, zzhha zzhha10, zzhha zzhha11, zzhha zzhha12, zzhha zzhha13, zzhha zzhha14, zzhha zzhha15, zzhha zzhha16, zzhha zzhha17, zzhha zzhha18, zzhha zzhha19, zzhha zzhha20, zzhha zzhha21, zzhha zzhha22, zzhha zzhha23, zzhha zzhha24) {
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
        this.zzt = zzhha20;
        this.zzu = zzhha21;
        this.zzv = zzhha22;
        this.zzw = zzhha23;
        this.zzx = zzhha24;
    }

    public static zzdho zza(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4, zzhha zzhha5, zzhha zzhha6, zzhha zzhha7, zzhha zzhha8, zzhha zzhha9, zzhha zzhha10, zzhha zzhha11, zzhha zzhha12, zzhha zzhha13, zzhha zzhha14, zzhha zzhha15, zzhha zzhha16, zzhha zzhha17, zzhha zzhha18, zzhha zzhha19, zzhha zzhha20, zzhha zzhha21, zzhha zzhha22, zzhha zzhha23, zzhha zzhha24) {
        return new zzdho(zzhha, zzhha2, zzhha3, zzhha4, zzhha5, zzhha6, zzhha7, zzhha8, zzhha9, zzhha10, zzhha11, zzhha12, zzhha13, zzhha14, zzhha15, zzhha16, zzhha17, zzhha18, zzhha19, zzhha20, zzhha21, zzhha22, zzhha23, zzhha24);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzdje zzc2 = ((zzdgz) this.zzb).zzc();
        zzdje zzdje = zzc2;
        zzdje zzdje2 = zzc2;
        JSONObject zzd2 = ((zzdhr) this.zzc).zzd();
        JSONObject jSONObject = zzd2;
        JSONObject jSONObject2 = zzd2;
        zzdny zzc3 = ((zzdhu) this.zzd).zzc();
        zzdny zzdny = zzc3;
        zzdny zzdny2 = zzc3;
        zzdit zza2 = ((zzdjm) this.zze).zza();
        zzdit zzdit = zza2;
        zzdit zzdit2 = zza2;
        zzfca zzc4 = ((zzcrr) this.zzj).zzc();
        zzfca zzfca = zzc4;
        zzfca zzfca2 = zzc4;
        VersionInfoParcel zza3 = ((zzchz) this.zzk).zza();
        VersionInfoParcel versionInfoParcel = zza3;
        VersionInfoParcel versionInfoParcel2 = zza3;
        zzfcw zzc5 = ((zzcvp) this.zzl).zzc();
        zzfcw zzfcw = zzc5;
        zzfcw zzfcw2 = zzc5;
        return new zzdhn((Context) this.zza.zzb(), zzdje, jSONObject, zzdny, zzdit, (zzavu) this.zzf.zzb(), (zzcwq) this.zzg.zzb(), (zzcvw) this.zzh.zzb(), (zzdeb) this.zzi.zzb(), zzfca, versionInfoParcel, zzfcw, (zzcnn) this.zzm.zzb(), (zzdjz) this.zzn.zzb(), (Clock) this.zzo.zzb(), (zzddx) this.zzp.zzb(), (zzfjy) this.zzq.zzb(), (zzfhu) this.zzr.zzb(), (zzecl) this.zzs.zzb(), (zzdpo) this.zzt.zzb(), (zzdjv) this.zzu.zzb(), (zzcyi) this.zzv.zzb(), (zzb) this.zzw.zzb(), (zzbya) this.zzx.zzb());
    }
}
