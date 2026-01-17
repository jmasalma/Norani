package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzenh implements zzhgr {
    private final zzhha zza;

    private zzenh(zzhha zzhha, zzhha zzhha2) {
        this.zza = zzhha2;
    }

    public static zzenh zzc(zzhha zzhha, zzhha zzhha2) {
        return new zzenh(zzhha, zzhha2);
    }

    /* renamed from: zza */
    public final zzenf zzb() {
        zzgdy zzc = zzffu.zzc();
        zzgdy zzgdy = zzc;
        Context zza2 = ((zzchl) this.zza).zza();
        Context context = zza2;
        return new zzenf(zzc, zza2);
    }
}
