package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzegi implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;
    private final zzhha zzc;

    private zzegi(zzhha zzhha, zzhha zzhha2, zzhha zzhha3) {
        this.zza = zzhha;
        this.zzb = zzhha2;
        this.zzc = zzhha3;
    }

    public static zzegi zza(zzhha zzhha, zzhha zzhha2, zzhha zzhha3) {
        return new zzegi(zzhha, zzhha2, zzhha3);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        VersionInfoParcel zza2 = ((zzchz) this.zzc).zza();
        VersionInfoParcel versionInfoParcel = zza2;
        return new zzegh((Context) this.zza.zzb(), (zzdhb) this.zzb.zzb(), zza2);
    }
}
