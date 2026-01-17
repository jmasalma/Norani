package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzesm implements zzhgr {
    private final zzhha zza;

    private zzesm(zzhha zzhha, zzhha zzhha2) {
        this.zza = zzhha2;
    }

    public static zzesm zzc(zzhha zzhha, zzhha zzhha2) {
        return new zzesm(zzhha, zzhha2);
    }

    /* renamed from: zza */
    public final zzesk zzb() {
        zzgdy zzc = zzffu.zzc();
        zzgdy zzgdy = zzc;
        Context zza2 = ((zzchl) this.zza).zza();
        Context context = zza2;
        return new zzesk(zzc, zza2);
    }
}
