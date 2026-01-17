package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbd;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzeqr implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;

    private zzeqr(zzhha zzhha, zzhha zzhha2) {
        this.zza = zzhha;
        this.zzb = zzhha2;
    }

    public static zzeqr zza(zzhha zzhha, zzhha zzhha2) {
        return new zzeqr(zzhha, zzhha2);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzetm zza2 = ((zzeto) this.zza).zzb();
        zzetm zzetm = zza2;
        return new zzeso(zza2, (long) ((Integer) zzbd.zzc().zzb(zzbde.zzmA)).intValue(), (ScheduledExecutorService) this.zzb.zzb());
    }
}
