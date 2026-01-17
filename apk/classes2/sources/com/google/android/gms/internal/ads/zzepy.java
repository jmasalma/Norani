package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbd;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzepy implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;

    private zzepy(zzhha zzhha, zzhha zzhha2) {
        this.zza = zzhha;
        this.zzb = zzhha2;
    }

    public static zzepy zza(zzhha zzhha, zzhha zzhha2) {
        return new zzepy(zzhha, zzhha2);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzenf zza2 = ((zzenh) this.zza).zzb();
        zzenf zzenf = zza2;
        return new zzeso(zza2, (long) ((Integer) zzbd.zzc().zzb(zzbde.zzmW)).intValue(), (ScheduledExecutorService) this.zzb.zzb());
    }
}
