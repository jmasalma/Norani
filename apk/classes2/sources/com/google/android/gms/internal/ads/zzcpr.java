package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbd;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzcpr implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;

    private zzcpr(zzhha zzhha, zzhha zzhha2) {
        this.zza = zzhha;
        this.zzb = zzhha2;
    }

    public static zzcpr zza(zzhha zzhha, zzhha zzhha2) {
        return new zzcpr(zzhha, zzhha2);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzema zza2 = ((zzemc) this.zza).zzb();
        zzema zzema = zza2;
        return new zzeso(zza2, (long) ((Integer) zzbd.zzc().zzb(zzbde.zzmQ)).intValue(), (ScheduledExecutorService) this.zzb.zzb());
    }
}
