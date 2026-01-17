package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdvm implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;

    private zzdvm(zzhha zzhha, zzhha zzhha2) {
        this.zza = zzhha;
        this.zzb = zzhha2;
    }

    public static zzdvm zza(zzhha zzhha, zzhha zzhha2) {
        return new zzdvm(zzhha, zzhha2);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Context zza2 = ((zzchl) this.zza).zza();
        Context context = zza2;
        VersionInfoParcel zza3 = ((zzchz) this.zzb).zza();
        VersionInfoParcel versionInfoParcel = zza3;
        zzdvt zzdvt = new zzdvt(zza2, zza3);
        zzdvt zzdvt2 = zzdvt;
        return zzdvt;
    }
}
