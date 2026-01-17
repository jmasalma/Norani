package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzcmd implements zzhgr {
    private final zzhha zza;

    private zzcmd(zzhha zzhha) {
        this.zza = zzhha;
    }

    public static zzcmd zza(zzhha zzhha) {
        return new zzcmd(zzhha);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzcmc((Context) this.zza.zzb());
    }
}
