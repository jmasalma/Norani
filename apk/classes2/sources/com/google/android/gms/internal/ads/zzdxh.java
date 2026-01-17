package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdxh implements zzhgr {
    private final zzhha zza;

    private zzdxh(zzhha zzhha) {
        this.zza = zzhha;
    }

    public static zzdxh zza(zzhha zzhha) {
        return new zzdxh(zzhha);
    }

    /* renamed from: zzc */
    public final String zzb() {
        Context zza2 = ((zzchl) this.zza).zza();
        Context context = zza2;
        String packageName = zza2.getPackageName();
        zzhgz.zzb(packageName);
        String str = packageName;
        return packageName;
    }
}
