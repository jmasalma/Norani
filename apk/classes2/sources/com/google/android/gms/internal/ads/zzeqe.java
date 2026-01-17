package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbd;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzeqe implements zzhgr {
    private final zzhha zza;

    private zzeqe(zzhha zzhha, zzhha zzhha2) {
        this.zza = zzhha2;
    }

    public static zzeqe zza(zzhha zzhha, zzhha zzhha2) {
        return new zzeqe(zzhha, zzhha2);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfyv zzfyv;
        zzeow zzc = zzeoy.zzc();
        zzeow zzeow = zzc;
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.zza.zzb();
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzet)).booleanValue()) {
            zzfyv = zzfyv.zzo(new zzeso(zzc, (long) ((Integer) zzbd.zzc().zzb(zzbde.zzeu)).intValue(), scheduledExecutorService));
        } else {
            zzfyv = zzfyv.zzn();
        }
        zzhgz.zzb(zzfyv);
        return zzfyv;
    }
}
