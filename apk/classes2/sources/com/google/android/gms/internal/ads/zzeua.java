package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzeua implements zzhgr {
    private final zzhha zza;

    private zzeua(zzhha zzhha, zzhha zzhha2) {
        this.zza = zzhha2;
    }

    public static zzeua zzc(zzhha zzhha, zzhha zzhha2) {
        return new zzeua(zzhha, zzhha2);
    }

    /* renamed from: zza */
    public final zzetz zzb() {
        zzgdy zzc = zzffu.zzc();
        zzgdy zzgdy = zzc;
        Context zza2 = ((zzchl) this.zza).zza();
        Context context = zza2;
        return new zzetz(zzc, zza2);
    }
}
