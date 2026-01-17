package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzfhd implements zzhgr {
    private final zzhha zza;

    private zzfhd(zzhha zzhha) {
        this.zza = zzhha;
    }

    public static zzfhd zzc(zzhha zzhha) {
        return new zzfhd(zzhha);
    }

    /* renamed from: zza */
    public final zzfgz zzb() {
        Set zzc = ((zzhhd) this.zza).zzb();
        Set set = zzc;
        return new zzfgz(zzc);
    }
}
