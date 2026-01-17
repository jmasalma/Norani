package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbd;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzeqb implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;
    private final zzhha zzc;
    private final zzhha zzd;

    private zzeqb(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4) {
        this.zza = zzhha;
        this.zzb = zzhha2;
        this.zzc = zzhha3;
        this.zzd = zzhha4;
    }

    public static zzeqb zza(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4) {
        return new zzeqb(zzhha, zzhha2, zzhha3, zzhha4);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzeso zzeso;
        zzeoe zza2 = ((zzeog) this.zza).zzb();
        zzeoe zzeoe = zza2;
        zzeou zzeou = (zzeou) this.zzb.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.zzd.zzb();
        if (((List) this.zzc.zzb()).contains("13")) {
            zzeso = new zzeso(zzeou, (long) ((Integer) zzbd.zzc().zzb(zzbde.zzmK)).intValue(), scheduledExecutorService);
        } else {
            zzeso = new zzeso(zza2, (long) ((Integer) zzbd.zzc().zzb(zzbde.zzmK)).intValue(), scheduledExecutorService);
        }
        return zzeso;
    }
}
