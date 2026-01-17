package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzcxp implements zzhgr {
    private final zzhha zza;

    private zzcxp(zzhha zzhha) {
        this.zza = zzhha;
    }

    public static zzcxo zzc(Set set) {
        return new zzcxo(set);
    }

    public static zzcxp zzd(zzhha zzhha) {
        return new zzcxp(zzhha);
    }

    /* renamed from: zza */
    public final zzcxo zzb() {
        Set zzc = ((zzhhd) this.zza).zzb();
        Set set = zzc;
        return new zzcxo(zzc);
    }
}
