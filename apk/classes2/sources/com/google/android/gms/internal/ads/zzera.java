package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzera implements zzhgr {
    private final zzhha zza;

    private zzera(zzhha zzhha, zzhha zzhha2) {
        this.zza = zzhha;
    }

    public static zzera zzc(zzhha zzhha, zzhha zzhha2) {
        return new zzera(zzhha, zzhha2);
    }

    /* renamed from: zza */
    public final zzeqz zzb() {
        Context zza2 = ((zzchl) this.zza).zza();
        Context context = zza2;
        zzgdy zzc = zzffu.zzc();
        zzgdy zzgdy = zzc;
        return new zzeqz(zza2, zzc);
    }
}
