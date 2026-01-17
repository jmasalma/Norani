package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzcor implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;
    private final zzhha zzc;

    private zzcor(zzhha zzhha, zzhha zzhha2, zzhha zzhha3) {
        this.zza = zzhha;
        this.zzb = zzhha2;
        this.zzc = zzhha3;
    }

    public static zzcor zza(zzhha zzhha, zzhha zzhha2, zzhha zzhha3) {
        return new zzcor(zzhha, zzhha2, zzhha3);
    }

    public static zzcyv zzd(ScheduledExecutorService scheduledExecutorService, Clock clock, zzdsj zzdsj) {
        zzcyv zzcyv = new zzcyv(scheduledExecutorService, clock, zzdsj);
        zzcyv zzcyv2 = zzcyv;
        return zzcyv;
    }

    /* renamed from: zzc */
    public final zzcyv zzb() {
        return zzd((ScheduledExecutorService) this.zza.zzb(), (Clock) this.zzb.zzb(), (zzdsj) this.zzc.zzb());
    }
}
