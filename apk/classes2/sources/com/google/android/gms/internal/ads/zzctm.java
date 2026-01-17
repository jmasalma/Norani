package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzctm implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;
    private final zzhha zzc;

    private zzctm(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4) {
        this.zza = zzhha;
        this.zzb = zzhha2;
        this.zzc = zzhha3;
    }

    public static zzctm zza(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4) {
        return new zzctm(zzhha, zzhha2, zzhha3, zzhha4);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Context zza2 = ((zzchl) this.zza).zza();
        Context context = zza2;
        VersionInfoParcel zza3 = ((zzchz) this.zzc).zza();
        VersionInfoParcel versionInfoParcel = zza3;
        return new zzctl(zza2, (zzfhx) this.zzb.zzb(), zza3, zzffu.zzc());
    }
}
