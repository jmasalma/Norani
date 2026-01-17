package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzcwn implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;
    private final zzhha zzc;

    private zzcwn(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4) {
        this.zza = zzhha;
        this.zzb = zzhha2;
        this.zzc = zzhha4;
    }

    public static zzcwn zza(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4) {
        return new zzcwn(zzhha, zzhha2, zzhha3, zzhha4);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzcwk zza2 = ((zzcwm) this.zza).zzb();
        zzcwk zzcwk = zza2;
        Set zzc2 = ((zzhhd) this.zzb).zzb();
        Set set = zzc2;
        return new zzcwl(zza2, zzc2, zzffu.zzc(), (ScheduledExecutorService) this.zzc.zzb());
    }
}
