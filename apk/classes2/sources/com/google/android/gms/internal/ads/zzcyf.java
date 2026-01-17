package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzcyf implements zzhgr {
    private final zzhha zza;

    private zzcyf(zzhha zzhha) {
        this.zza = zzhha;
    }

    public static zzcyf zza(zzhha zzhha) {
        return new zzcyf(zzhha);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Set zzc = ((zzhhd) this.zza).zzb();
        Set set = zzc;
        return new zzcye(zzc);
    }
}
