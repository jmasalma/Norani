package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import com.google.android.gms.common.wrappers.Wrappers;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzchv implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;

    private zzchv(zzhha zzhha, zzhha zzhha2) {
        this.zza = zzhha;
        this.zzb = zzhha2;
    }

    public static zzchv zza(zzhha zzhha, zzhha zzhha2) {
        return new zzchv(zzhha, zzhha2);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Context zza2 = ((zzchl) this.zza).zza();
        Context context = zza2;
        try {
            return Wrappers.packageManager(zza2).getPackageInfo(((ApplicationInfo) this.zzb.zzb()).packageName, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}
