package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzeto implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;

    private zzeto(zzhha zzhha, zzhha zzhha2, zzhha zzhha3) {
        this.zza = zzhha;
        this.zzb = zzhha3;
    }

    public static zzeto zzc(zzhha zzhha, zzhha zzhha2, zzhha zzhha3) {
        return new zzeto(zzhha, zzhha2, zzhha3);
    }

    /* renamed from: zza */
    public final zzetm zzb() {
        zzgdy zzc = zzffu.zzc();
        zzgdy zzgdy = zzc;
        Context zza2 = ((zzchl) this.zzb).zza();
        Context context = zza2;
        return new zzetm((zzbyo) this.zza.zzb(), zzc, zza2);
    }
}
