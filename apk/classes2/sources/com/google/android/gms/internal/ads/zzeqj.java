package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbd;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzeqj implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;

    private zzeqj(zzhha zzhha, zzhha zzhha2) {
        this.zza = zzhha;
        this.zzb = zzhha2;
    }

    public static zzeqj zza(zzhha zzhha, zzhha zzhha2) {
        return new zzeqj(zzhha, zzhha2);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzerk zza2 = ((zzerm) this.zza).zzb();
        zzerk zzerk = zza2;
        return new zzeso(zza2, (long) ((Integer) zzbd.zzc().zzb(zzbde.zzmT)).intValue(), (ScheduledExecutorService) this.zzb.zzb());
    }
}
