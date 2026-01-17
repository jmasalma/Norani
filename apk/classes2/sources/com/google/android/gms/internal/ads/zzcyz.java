package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzcyz implements zzhgr {
    private final zzhha zza;

    private zzcyz(zzhha zzhha) {
        this.zza = zzhha;
    }

    public static zzcyz zzc(zzhha zzhha) {
        return new zzcyz(zzhha);
    }

    /* renamed from: zza */
    public final zzcyy zzb() {
        Set zzc = ((zzhhd) this.zza).zzb();
        Set set = zzc;
        return new zzcyy(zzc);
    }
}
