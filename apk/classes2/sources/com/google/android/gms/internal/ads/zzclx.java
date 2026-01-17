package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzclx implements zzhgr {
    private final zzhha zza;

    private zzclx(zzhha zzhha) {
        this.zza = zzhha;
    }

    public static zzclx zza(zzhha zzhha) {
        return new zzclx(zzhha);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Context zza2 = ((zzchl) this.zza).zza();
        Context context = zza2;
        return new zzclw(zza2);
    }
}
