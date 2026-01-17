package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbd;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzeql implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;

    private zzeql(zzhha zzhha, zzhha zzhha2) {
        this.zza = zzhha;
        this.zzb = zzhha2;
    }

    public static zzeql zza(zzhha zzhha, zzhha zzhha2) {
        return new zzeql(zzhha, zzhha2);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzerv zza2 = ((zzerx) this.zza).zzb();
        zzerv zzerv = zza2;
        return new zzeso(zza2, (long) ((Integer) zzbd.zzc().zzb(zzbde.zzmF)).intValue(), (ScheduledExecutorService) this.zzb.zzb());
    }
}
