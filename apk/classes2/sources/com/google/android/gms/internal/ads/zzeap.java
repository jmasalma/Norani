package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzeap implements zzhgr {
    private final zzhha zza;

    private zzeap(zzhha zzhha) {
        this.zza = zzhha;
    }

    public static zzeap zzc(zzhha zzhha) {
        return new zzeap(zzhha);
    }

    /* renamed from: zza */
    public final zzeao zzb() {
        Context zza2 = ((zzchl) this.zza).zza();
        Context context = zza2;
        return new zzeao(zza2);
    }
}
