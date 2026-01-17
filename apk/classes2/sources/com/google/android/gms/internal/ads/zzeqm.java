package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbd;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzeqm implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;
    private final zzhha zzc;

    private zzeqm(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4) {
        this.zza = zzhha2;
        this.zzb = zzhha3;
        this.zzc = zzhha4;
    }

    public static zzeqm zza(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4) {
        return new zzeqm(zzhha, zzhha2, zzhha3, zzhha4);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzeso zzeso;
        zzerz zzc2 = zzesb.zzc();
        zzerz zzerz = zzc2;
        zzeou zzeou = (zzeou) this.zza.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.zzc.zzb();
        if (((List) this.zzb.zzb()).contains("24")) {
            zzeso = new zzeso(zzeou, (long) ((Integer) zzbd.zzc().zzb(zzbde.zzmE)).intValue(), scheduledExecutorService);
        } else {
            zzeso = new zzeso(zzc2, (long) ((Integer) zzbd.zzc().zzb(zzbde.zzmE)).intValue(), scheduledExecutorService);
        }
        return zzeso;
    }
}
