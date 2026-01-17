package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbd;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzeqn implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;

    private zzeqn(zzhha zzhha, zzhha zzhha2) {
        this.zza = zzhha;
        this.zzb = zzhha2;
    }

    public static zzeqn zza(zzhha zzhha, zzhha zzhha2) {
        return new zzeqn(zzhha, zzhha2);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzesc zza2 = ((zzese) this.zza).zzb();
        zzesc zzesc = zza2;
        return new zzeso(zza2, (long) ((Integer) zzbd.zzc().zzb(zzbde.zzmU)).intValue(), (ScheduledExecutorService) this.zzb.zzb());
    }
}
