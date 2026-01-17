package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzfhk implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;
    private final zzhha zzc;
    private final zzhha zzd;

    private zzfhk(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4, zzhha zzhha5, zzhha zzhha6) {
        this.zza = zzhha;
        this.zzb = zzhha2;
        this.zzc = zzhha3;
        this.zzd = zzhha6;
    }

    public static zzfhk zza(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4, zzhha zzhha5, zzhha zzhha6) {
        return new zzfhk(zzhha, zzhha2, zzhha3, zzhha4, zzhha5, zzhha6);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Context zza2 = ((zzchl) this.zza).zza();
        Context context = zza2;
        VersionInfoParcel zza3 = ((zzchz) this.zzb).zza();
        VersionInfoParcel versionInfoParcel = zza3;
        zzeag zza4 = zzcig.zza();
        zzeag zzeag = zza4;
        zzbvy zza5 = zzcij.zza();
        zzbvy zzbvy = zza5;
        zzfhx zzfhx = new zzfhx(zza2, zza3, (zzdpw) this.zzc.zzb(), zza4, zza5, (zzcgz) this.zzd.zzb());
        zzfhx zzfhx2 = zzfhx;
        return zzfhx;
    }
}
