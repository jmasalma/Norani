package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbd;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzequ implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;

    private zzequ(zzhha zzhha, zzhha zzhha2) {
        this.zza = zzhha;
        this.zzb = zzhha2;
    }

    public static zzequ zza(zzhha zzhha, zzhha zzhha2) {
        return new zzequ(zzhha, zzhha2);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzeso((zzeou) this.zza.zzb(), (long) ((Integer) zzbd.zzc().zzb(zzbde.zzmx)).intValue(), (ScheduledExecutorService) this.zzb.zzb());
    }
}
