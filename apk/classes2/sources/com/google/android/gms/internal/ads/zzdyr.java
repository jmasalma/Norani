package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdyr implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;

    private zzdyr(zzhha zzhha, zzhha zzhha2) {
        this.zza = zzhha;
        this.zzb = zzhha2;
    }

    public static zzdyr zzc(zzhha zzhha, zzhha zzhha2) {
        return new zzdyr(zzhha, zzhha2);
    }

    /* renamed from: zza */
    public final zzdyq zzb() {
        Context zza2 = ((zzchl) this.zza).zza();
        Context context = zza2;
        return new zzdyq(zza2, (zzbyo) this.zzb.zzb());
    }
}
