package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzchl implements zzhgr {
    private final zzchh zza;

    private zzchl(zzchh zzchh) {
        this.zza = zzchh;
    }

    public static Context zzc(zzchh zzchh) {
        Context zzb = zzchh.zzb();
        zzhgz.zzb(zzb);
        Context context = zzb;
        return zzb;
    }

    public static zzchl zzd(zzchh zzchh) {
        return new zzchl(zzchh);
    }

    public final Context zza() {
        return zzc(this.zza);
    }

    public final /* synthetic */ Object zzb() {
        return zzc(this.zza);
    }
}
