package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzfkm implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;

    private zzfkm(zzhha zzhha, zzhha zzhha2) {
        this.zza = zzhha;
        this.zzb = zzhha2;
    }

    public static zzfkm zzc(zzhha zzhha, zzhha zzhha2) {
        return new zzfkm(zzhha, zzhha2);
    }

    /* renamed from: zza */
    public final zzfkl zzb() {
        Context zza2 = ((zzchl) this.zzb).zza();
        Context context = zza2;
        return new zzfkl((zzdsj) this.zza.zzb(), zza2);
    }
}
