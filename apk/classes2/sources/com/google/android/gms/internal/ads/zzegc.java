package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzegc implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;
    private final zzhha zzc;
    private final zzhha zzd;
    private final zzhha zze;
    private final zzhha zzf;
    private final zzhha zzg;

    private zzegc(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4, zzhha zzhha5, zzhha zzhha6, zzhha zzhha7, zzhha zzhha8, zzhha zzhha9) {
        this.zza = zzhha;
        this.zzb = zzhha3;
        this.zzc = zzhha4;
        this.zzd = zzhha5;
        this.zze = zzhha6;
        this.zzf = zzhha7;
        this.zzg = zzhha8;
    }

    public static zzegc zza(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4, zzhha zzhha5, zzhha zzhha6, zzhha zzhha7, zzhha zzhha8, zzhha zzhha9) {
        return new zzegc(zzhha, zzhha2, zzhha3, zzhha4, zzhha5, zzhha6, zzhha7, zzhha8, zzhha9);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzgdy zzc2 = zzffu.zzc();
        zzgdy zzgdy = zzc2;
        zzdln zza2 = ((zzdlo) this.zzb).zzb();
        zzdln zzdln = zza2;
        VersionInfoParcel zza3 = ((zzchz) this.zzf).zza();
        VersionInfoParcel versionInfoParcel = zza3;
        zzbxw zzc3 = zzcjx.zzc();
        zzbxw zzbxw = zzc3;
        return new zzegb((zzdhb) this.zza.zzb(), zzc2, zza2, (zzfdv) this.zzc.zzb(), (zzdoe) this.zzd.zzb(), (zzdsd) this.zze.zzb(), zza3, (Context) this.zzg.zzb(), zzc3);
    }
}
