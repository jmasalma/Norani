package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdyl implements zzhgr {
    private final zzhha zza;

    private zzdyl(zzhha zzhha, zzhha zzhha2) {
        this.zza = zzhha;
    }

    public static zzdyl zzc(zzhha zzhha, zzhha zzhha2) {
        return new zzdyl(zzhha, zzhha2);
    }

    /* renamed from: zza */
    public final zzdyk zzb() {
        Context zza2 = ((zzchl) this.zza).zza();
        Context context = zza2;
        return new zzdyk(zza2, zzffu.zzc());
    }
}
