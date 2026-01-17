package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzchk implements zzhgr {
    private final zzhha zza;

    private zzchk(zzhha zzhha) {
        this.zza = zzhha;
    }

    public static zzchk zza(zzhha zzhha) {
        return new zzchk(zzhha);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Context zza2 = ((zzchl) this.zza).zza();
        Context context = zza2;
        ApplicationInfo applicationInfo = zza2.getApplicationInfo();
        zzhgz.zzb(applicationInfo);
        ApplicationInfo applicationInfo2 = applicationInfo;
        return applicationInfo;
    }
}
