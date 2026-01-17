package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzcpa implements zzhgr {
    private final zzcoz zza;
    private final zzhha zzb;

    private zzcpa(zzcoz zzcoz, zzhha zzhha) {
        this.zza = zzcoz;
        this.zzb = zzhha;
    }

    public static zzcpa zza(zzcoz zzcoz, zzhha zzhha) {
        return new zzcpa(zzcoz, zzhha);
    }

    public final /* synthetic */ Object zzb() {
        Set zzc = ((zzhhd) this.zzb).zzb();
        Set set = zzc;
        zzcxk zzd = this.zza.zzd(zzc);
        zzcxk zzcxk = zzd;
        return zzd;
    }
}
