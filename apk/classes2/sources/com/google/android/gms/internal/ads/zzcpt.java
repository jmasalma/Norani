package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbd;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzcpt implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;

    private zzcpt(zzhha zzhha, zzhha zzhha2) {
        this.zza = zzhha;
        this.zzb = zzhha2;
    }

    public static zzcpt zza(zzhha zzhha, zzhha zzhha2) {
        return new zzcpt(zzhha, zzhha2);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzero zza2 = ((zzerq) this.zza).zzb();
        zzero zzero = zza2;
        return new zzeso(zza2, (long) ((Integer) zzbd.zzc().zzb(zzbde.zzmR)).intValue(), (ScheduledExecutorService) this.zzb.zzb());
    }
}
