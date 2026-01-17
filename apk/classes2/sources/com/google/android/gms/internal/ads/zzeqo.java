package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbd;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzeqo implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;

    private zzeqo(zzhha zzhha, zzhha zzhha2) {
        this.zza = zzhha;
        this.zzb = zzhha2;
    }

    public static zzeqo zza(zzhha zzhha, zzhha zzhha2) {
        return new zzeqo(zzhha, zzhha2);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzesk zza2 = ((zzesm) this.zza).zzb();
        zzesk zzesk = zza2;
        return new zzeso(zza2, (long) ((Integer) zzbd.zzc().zzb(zzbde.zzmD)).intValue(), (ScheduledExecutorService) this.zzb.zzb());
    }
}
