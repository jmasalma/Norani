package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzfhh implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;

    private zzfhh(zzhha zzhha, zzhha zzhha2) {
        this.zza = zzhha;
        this.zzb = zzhha2;
    }

    public static zzfhh zza(zzhha zzhha, zzhha zzhha2) {
        return new zzfhh(zzhha, zzhha2);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Context zza2 = ((zzchl) this.zza).zza();
        Context context = zza2;
        return new zzfhg(zza2, (zzfhu) this.zzb.zzb());
    }
}
