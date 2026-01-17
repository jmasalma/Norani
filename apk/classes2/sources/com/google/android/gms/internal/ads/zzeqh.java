package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbd;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzeqh implements zzhgr {
    private final zzhha zza;

    private zzeqh(zzhha zzhha, zzhha zzhha2) {
        this.zza = zzhha2;
    }

    public static zzeqh zza(zzhha zzhha, zzhha zzhha2) {
        return new zzeqh(zzhha, zzhha2);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzerc zzc = zzere.zzc();
        zzerc zzerc = zzc;
        return new zzeso(zzc, (long) ((Integer) zzbd.zzc().zzb(zzbde.zzmG)).intValue(), (ScheduledExecutorService) this.zza.zzb());
    }
}
