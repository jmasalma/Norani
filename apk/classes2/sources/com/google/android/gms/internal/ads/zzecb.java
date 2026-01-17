package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzecb implements zzhgr {
    private final zzhha zza;

    private zzecb(zzhha zzhha, zzhha zzhha2) {
        this.zza = zzhha;
    }

    public static zzecb zza(zzhha zzhha, zzhha zzhha2) {
        return new zzecb(zzhha, zzhha2);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Context zza2 = ((zzchl) this.zza).zza();
        Context context = zza2;
        zzgdy zzc = zzffu.zzc();
        zzgdy zzgdy = zzc;
        return new zzeca(zza2, zzc);
    }
}
