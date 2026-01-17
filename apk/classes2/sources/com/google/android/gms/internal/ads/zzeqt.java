package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbd;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzeqt implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;

    private zzeqt(zzhha zzhha, zzhha zzhha2) {
        this.zza = zzhha;
        this.zzb = zzhha2;
    }

    public static zzeqt zza(zzhha zzhha, zzhha zzhha2) {
        return new zzeqt(zzhha, zzhha2);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzetz zza2 = ((zzeua) this.zza).zzb();
        zzetz zzetz = zza2;
        return new zzeso(zza2, (long) ((Integer) zzbd.zzc().zzb(zzbde.zzmy)).intValue(), (ScheduledExecutorService) this.zzb.zzb());
    }
}
