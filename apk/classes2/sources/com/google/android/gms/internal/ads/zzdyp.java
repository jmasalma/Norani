package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdyp implements zzhgr {
    private final zzhha zza;

    private zzdyp(zzhha zzhha) {
        this.zza = zzhha;
    }

    public static zzdyp zzc(zzhha zzhha) {
        return new zzdyp(zzhha);
    }

    /* renamed from: zza */
    public final zzdyo zzb() {
        Context zza2 = ((zzchl) this.zza).zza();
        Context context = zza2;
        return new zzdyo(zza2);
    }
}
