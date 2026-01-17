package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdgp implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;
    private final zzhha zzc;
    private final zzhha zzd;
    private final zzhha zze;

    private zzdgp(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4, zzhha zzhha5) {
        this.zza = zzhha;
        this.zzb = zzhha2;
        this.zzc = zzhha3;
        this.zzd = zzhha4;
        this.zze = zzhha5;
    }

    public static zzdgp zza(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4, zzhha zzhha5) {
        return new zzdgp(zzhha, zzhha2, zzhha3, zzhha4, zzhha5);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Context zza2 = ((zzchl) this.zza).zza();
        Context context = zza2;
        zzcfg zza3 = ((zzdga) this.zzb).zza();
        zzcfg zzcfg = zza3;
        zzfca zzc2 = ((zzcrr) this.zzc).zzc();
        zzfca zzfca = zzc2;
        VersionInfoParcel zza4 = ((zzchz) this.zzd).zza();
        VersionInfoParcel versionInfoParcel = zza4;
        return new zzdgo(zza2, zza3, zzc2, zza4, (zzedf) this.zze.zzb());
    }
}
