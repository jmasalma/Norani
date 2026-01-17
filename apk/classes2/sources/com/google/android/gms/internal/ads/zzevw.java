package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzevw implements zzhgr {
    private final zzhha zza;

    private zzevw(zzhha zzhha) {
        this.zza = zzhha;
    }

    public static zzevw zza(zzhha zzhha) {
        return new zzevw(zzhha);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Context zza2 = ((zzchl) this.zza).zza();
        Context context = zza2;
        return new zzevv(zza2);
    }
}
