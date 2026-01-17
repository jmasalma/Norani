package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzeft implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;

    private zzeft(zzhha zzhha, zzhha zzhha2) {
        this.zza = zzhha;
        this.zzb = zzhha2;
    }

    public static zzeft zzc(zzhha zzhha, zzhha zzhha2) {
        return new zzeft(zzhha, zzhha2);
    }

    /* renamed from: zza */
    public final zzefs zzb() {
        return new zzefs((Context) this.zza.zzb(), (zzdgf) this.zzb.zzb());
    }
}
