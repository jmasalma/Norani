package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzeve implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;
    private final zzhha zzc;
    private final zzhha zzd;
    private final zzhha zze;

    private zzeve(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4, zzhha zzhha5, zzhha zzhha6, zzhha zzhha7) {
        this.zza = zzhha2;
        this.zzb = zzhha3;
        this.zzc = zzhha5;
        this.zzd = zzhha6;
        this.zze = zzhha7;
    }

    public static zzeve zza(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4, zzhha zzhha5, zzhha zzhha6, zzhha zzhha7) {
        return new zzeve(zzhha, zzhha2, zzhha3, zzhha4, zzhha5, zzhha6, zzhha7);
    }

    public static zzevc zzc(zzbzj zzbzj, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor, int i, boolean z, boolean z2) {
        return new zzevc(zzbzj, context, scheduledExecutorService, executor, i, z, z2);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzbzj zza2 = zzckz.zza();
        zzbzj zzbzj = zza2;
        Context zza3 = ((zzchl) this.zza).zza();
        Context context = zza3;
        Integer zzc2 = ((zzewk) this.zzc).zzb();
        Integer num = zzc2;
        int intValue = zzc2.intValue();
        Boolean zzc3 = ((zzewl) this.zzd).zzb();
        Boolean bool = zzc3;
        boolean booleanValue = zzc3.booleanValue();
        Boolean zzc4 = ((zzewm) this.zze).zzb();
        Boolean bool2 = zzc4;
        return new zzevc(zza2, zza3, (ScheduledExecutorService) this.zzb.zzb(), zzffu.zzc(), intValue, booleanValue, zzc4.booleanValue());
    }
}
