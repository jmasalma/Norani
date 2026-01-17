package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzewv implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;
    private final zzhha zzc;
    private final zzhha zzd;
    private final zzhha zze;
    private final zzhha zzf;

    private zzewv(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4, zzhha zzhha5, zzhha zzhha6, zzhha zzhha7, zzhha zzhha8) {
        this.zza = zzhha;
        this.zzb = zzhha2;
        this.zzc = zzhha5;
        this.zzd = zzhha6;
        this.zze = zzhha7;
        this.zzf = zzhha8;
    }

    public static zzewv zza(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4, zzhha zzhha5, zzhha zzhha6, zzhha zzhha7, zzhha zzhha8) {
        return new zzewv(zzhha, zzhha2, zzhha3, zzhha4, zzhha5, zzhha6, zzhha7, zzhha8);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Boolean zzc2 = ((zzewm) this.zzb).zzb();
        Boolean bool = zzc2;
        boolean booleanValue = zzc2.booleanValue();
        zzbzh zza2 = zzclb.zza();
        zzbzh zzbzh = zza2;
        zzgdy zzc3 = zzffu.zzc();
        zzgdy zzgdy = zzc3;
        String zzc4 = ((zzewj) this.zzc).zzc();
        String str = zzc4;
        Integer zzc5 = ((zzewo) this.zze).zzb();
        Integer num = zzc5;
        int intValue = zzc5.intValue();
        Integer zzc6 = ((zzewp) this.zzf).zzb();
        Integer num2 = zzc6;
        return new zzewt((zzbzs) this.zza.zzb(), booleanValue, zza2, zzc3, zzc4, (ScheduledExecutorService) this.zzd.zzb(), intValue, zzc6.intValue());
    }
}
