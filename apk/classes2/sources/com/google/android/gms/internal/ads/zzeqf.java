package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbd;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzeqf implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;

    private zzeqf(zzhha zzhha, zzhha zzhha2) {
        this.zza = zzhha;
        this.zzb = zzhha2;
    }

    public static zzeqf zza(zzhha zzhha, zzhha zzhha2) {
        return new zzeqf(zzhha, zzhha2);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzepa zza2 = ((zzepc) this.zza).zzb();
        zzepa zzepa = zza2;
        return new zzeso(zza2, (long) ((Integer) zzbd.zzc().zzb(zzbde.zzmP)).intValue(), (ScheduledExecutorService) this.zzb.zzb());
    }
}
