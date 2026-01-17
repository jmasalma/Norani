package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzcus implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;
    private final zzhha zzc;
    private final zzhha zzd;
    private final zzhha zze;

    private zzcus(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4, zzhha zzhha5, zzhha zzhha6) {
        this.zza = zzhha;
        this.zzb = zzhha2;
        this.zzc = zzhha3;
        this.zzd = zzhha5;
        this.zze = zzhha6;
    }

    public static zzcus zza(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4, zzhha zzhha5, zzhha zzhha6) {
        return new zzcus(zzhha, zzhha2, zzhha3, zzhha4, zzhha5, zzhha6);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfca zzc2 = ((zzcrr) this.zzb).zzc();
        zzfca zzfca = zzc2;
        String zzc3 = ((zzcrs) this.zzd).zzc();
        String str = zzc3;
        return new zzcur((zzcwq) this.zza.zzb(), zzc2, (ScheduledExecutorService) this.zzc.zzb(), zzffu.zzc(), zzc3, (zzcym) this.zze.zzb());
    }
}
