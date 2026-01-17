package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbd;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzeqd implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;

    private zzeqd(zzhha zzhha, zzhha zzhha2) {
        this.zza = zzhha;
        this.zzb = zzhha2;
    }

    public static zzeqd zza(zzhha zzhha, zzhha zzhha2) {
        return new zzeqd(zzhha, zzhha2);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzeop zza2 = ((zzeoq) this.zza).zzb();
        zzeop zzeop = zza2;
        return new zzeso(zza2, (long) ((Integer) zzbd.zzc().zzb(zzbde.zzmI)).intValue(), (ScheduledExecutorService) this.zzb.zzb());
    }
}
