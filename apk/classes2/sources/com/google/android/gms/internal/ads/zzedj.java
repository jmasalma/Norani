package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzedj implements zzhgr {
    private final zzhha zza;

    private zzedj(zzhha zzhha) {
        this.zza = zzhha;
    }

    public static zzedj zza(zzhha zzhha) {
        return new zzedj(zzhha);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Context zza2 = ((zzchl) this.zza).zza();
        Context context = zza2;
        return new zzedi(zza2);
    }
}
