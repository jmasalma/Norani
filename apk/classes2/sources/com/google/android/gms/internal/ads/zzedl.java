package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzedl implements zzhgr {
    private final zzhha zza;

    private zzedl(zzhha zzhha) {
        this.zza = zzhha;
    }

    public static zzedl zzc(zzhha zzhha) {
        return new zzedl(zzhha);
    }

    /* renamed from: zza */
    public final zzedk zzb() {
        Context zza2 = ((zzchl) this.zza).zza();
        Context context = zza2;
        return new zzedk(zza2);
    }
}
