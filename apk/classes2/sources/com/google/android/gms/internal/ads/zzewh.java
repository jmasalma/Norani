package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzewh implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;

    private zzewh(zzhha zzhha, zzhha zzhha2, zzhha zzhha3) {
        this.zza = zzhha2;
        this.zzb = zzhha3;
    }

    public static zzewh zza(zzhha zzhha, zzhha zzhha2, zzhha zzhha3) {
        return new zzewh(zzhha, zzhha2, zzhha3);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzbtu zza2 = zzckx.zza();
        zzbtu zzbtu = zza2;
        Context zza3 = ((zzchl) this.zzb).zza();
        Context context = zza3;
        return new zzewf(zza2, (ScheduledExecutorService) this.zza.zzb(), zza3);
    }
}
