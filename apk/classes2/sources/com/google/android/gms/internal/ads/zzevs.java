package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzevs implements zzhgr {
    private final zzhha zza;

    private zzevs(zzhha zzhha, zzhha zzhha2, zzhha zzhha3) {
        this.zza = zzhha3;
    }

    public static zzevs zza(zzhha zzhha, zzhha zzhha2, zzhha zzhha3) {
        return new zzevs(zzhha, zzhha2, zzhha3);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzbbr zza2 = zzckt.zza();
        zzbbr zzbbr = zza2;
        zzgdy zzc = zzffu.zzc();
        zzgdy zzgdy = zzc;
        Context zza3 = ((zzchl) this.zza).zza();
        Context context = zza3;
        return new zzevq(zza2, zzc, zza3);
    }
}
