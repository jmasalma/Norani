package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzcuo implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;
    private final zzhha zzc;

    private zzcuo(zzhha zzhha, zzhha zzhha2, zzhha zzhha3) {
        this.zza = zzhha;
        this.zzb = zzhha2;
        this.zzc = zzhha3;
    }

    public static zzcuo zza(zzhha zzhha, zzhha zzhha2, zzhha zzhha3) {
        return new zzcuo(zzhha, zzhha2, zzhha3);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        VersionInfoParcel zza2 = ((zzchz) this.zzb).zza();
        VersionInfoParcel versionInfoParcel = zza2;
        zzfcw zzc2 = ((zzcvp) this.zzc).zzc();
        zzfcw zzfcw = zzc2;
        return new zzcun((Context) this.zza.zzb(), zza2, zzc2);
    }
}
