package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzesr implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;
    private final zzhha zzc;

    private zzesr(zzhha zzhha, zzhha zzhha2, zzhha zzhha3) {
        this.zza = zzhha;
        this.zzb = zzhha2;
        this.zzc = zzhha3;
    }

    public static zzesr zzc(zzhha zzhha, zzhha zzhha2, zzhha zzhha3) {
        return new zzesr(zzhha, zzhha2, zzhha3);
    }

    /* renamed from: zza */
    public final zzesp zzb() {
        Context zza2 = ((zzchl) this.zzc).zza();
        Context context = zza2;
        return new zzesp((ApplicationInfo) this.zza.zzb(), (PackageInfo) this.zzb.zzb(), zza2);
    }
}
