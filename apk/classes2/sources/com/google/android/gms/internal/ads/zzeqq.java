package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbd;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzeqq implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;

    private zzeqq(zzhha zzhha, zzhha zzhha2) {
        this.zza = zzhha;
        this.zzb = zzhha2;
    }

    public static zzeqq zza(zzhha zzhha, zzhha zzhha2) {
        return new zzeqq(zzhha, zzhha2);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzesw zza2 = ((zzesy) this.zza).zzb();
        zzesw zzesw = zza2;
        return new zzeso(zza2, (long) ((Integer) zzbd.zzc().zzb(zzbde.zzmB)).intValue(), (ScheduledExecutorService) this.zzb.zzb());
    }
}
