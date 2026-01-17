package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbd;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzepv implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;

    private zzepv(zzhha zzhha, zzhha zzhha2) {
        this.zza = zzhha;
        this.zzb = zzhha2;
    }

    public static zzepv zza(zzhha zzhha, zzhha zzhha2) {
        return new zzepv(zzhha, zzhha2);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzemh zza2 = ((zzemj) this.zza).zzb();
        zzemh zzemh = zza2;
        return new zzeso(zza2, (long) ((Integer) zzbd.zzc().zzb(zzbde.zzmN)).intValue(), (ScheduledExecutorService) this.zzb.zzb());
    }
}
