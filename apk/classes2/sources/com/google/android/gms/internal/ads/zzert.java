package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzert implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;

    private zzert(zzhha zzhha, zzhha zzhha2) {
        this.zza = zzhha;
        this.zzb = zzhha2;
    }

    public static zzert zzc(zzhha zzhha, zzhha zzhha2) {
        return new zzert(zzhha, zzhha2);
    }

    /* renamed from: zza */
    public final zzerr zzb() {
        Context zza2 = ((zzchl) this.zza).zza();
        Context context = zza2;
        return new zzerr(zza2, (Intent) this.zzb.zzb());
    }
}
