package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzcvu implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;
    private final zzhha zzc;

    private zzcvu(zzcvt zzcvt, zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4) {
        this.zza = zzhha;
        this.zzb = zzhha2;
        this.zzc = zzhha3;
    }

    public static zzcvu zza(zzcvt zzcvt, zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4) {
        return new zzcvu(zzcvt, zzhha, zzhha2, zzhha3, zzhha4);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        VersionInfoParcel zza2 = ((zzchz) this.zzb).zza();
        VersionInfoParcel versionInfoParcel = zza2;
        zzfca zzc2 = ((zzcrr) this.zzc).zzc();
        zzfca zzfca = zzc2;
        zzbxw zzc3 = zzcjx.zzc();
        zzbxw zzbxw = zzc3;
        return zzcvt.zza((Context) this.zza.zzb(), zza2, zzc2, zzc3);
    }
}
