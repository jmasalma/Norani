package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzfhf implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;
    private final zzhha zzc;

    private zzfhf(zzfhe zzfhe, zzhha zzhha, zzhha zzhha2, zzhha zzhha3) {
        this.zza = zzhha;
        this.zzb = zzhha2;
        this.zzc = zzhha3;
    }

    public static zzfhf zza(zzfhe zzfhe, zzhha zzhha, zzhha zzhha2, zzhha zzhha3) {
        return new zzfhf(zzfhe, zzhha, zzhha2, zzhha3);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Context zza2 = ((zzchl) this.zza).zza();
        Context context = zza2;
        VersionInfoParcel zza3 = ((zzchz) this.zzb).zza();
        VersionInfoParcel versionInfoParcel = zza3;
        zzbow zza4 = new zzbon().zza(zza2, zza3, (zzfhx) this.zzc.zzb());
        zzhgz.zzb(zza4);
        zzbow zzbow = zza4;
        return zza4;
    }
}
