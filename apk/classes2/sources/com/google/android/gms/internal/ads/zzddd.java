package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzddd implements zzhgr {
    private final zzhha zza;

    private zzddd(zzhha zzhha) {
        this.zza = zzhha;
    }

    public static zzddd zzc(zzhha zzhha) {
        return new zzddd(zzhha);
    }

    /* renamed from: zza */
    public final zzddc zzb() {
        Set zzc = ((zzhhd) this.zza).zzb();
        Set set = zzc;
        return new zzddc(zzc);
    }
}
