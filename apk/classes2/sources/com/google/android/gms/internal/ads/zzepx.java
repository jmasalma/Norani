package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbd;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzepx implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;

    private zzepx(zzhha zzhha, zzhha zzhha2) {
        this.zza = zzhha;
        this.zzb = zzhha2;
    }

    public static zzepx zza(zzhha zzhha, zzhha zzhha2) {
        return new zzepx(zzhha, zzhha2);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzemy zza2 = ((zzend) this.zza).zzb();
        zzemy zzemy = zza2;
        return new zzeso(zza2, (long) ((Integer) zzbd.zzc().zzb(zzbde.zzmO)).intValue(), (ScheduledExecutorService) this.zzb.zzb());
    }
}
