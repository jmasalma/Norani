package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzely implements zzhgr {
    private final zzhha zza;

    private zzely(zzhha zzhha) {
        this.zza = zzhha;
    }

    public static zzely zzc(zzhha zzhha) {
        return new zzely(zzhha);
    }

    /* renamed from: zza */
    public final zzelw zzb() {
        Context zza2 = ((zzchl) this.zza).zza();
        Context context = zza2;
        return new zzelw(zza2);
    }
}
