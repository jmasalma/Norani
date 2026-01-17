package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbd;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzeqg implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;

    private zzeqg(zzhha zzhha, zzhha zzhha2) {
        this.zza = zzhha;
        this.zzb = zzhha2;
    }

    public static zzeqg zza(zzhha zzhha, zzhha zzhha2) {
        return new zzeqg(zzhha, zzhha2);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzeqz zza2 = ((zzera) this.zza).zzb();
        zzeqz zzeqz = zza2;
        return new zzeso(zza2, (long) ((Integer) zzbd.zzc().zzb(zzbde.zzmH)).intValue(), (ScheduledExecutorService) this.zzb.zzb());
    }
}
