package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzevo implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;
    private final zzhha zzc;

    private zzevo(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4, zzhha zzhha5) {
        this.zza = zzhha;
        this.zzb = zzhha3;
        this.zzc = zzhha4;
    }

    public static zzevo zza(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4, zzhha zzhha5) {
        return new zzevo(zzhha, zzhha2, zzhha3, zzhha4, zzhha5);
    }

    public static zzevm zzc(String str, zzbbf zzbbf, zzbzs zzbzs, ScheduledExecutorService scheduledExecutorService, zzgdy zzgdy) {
        return new zzevm(str, zzbbf, zzbzs, scheduledExecutorService, zzgdy);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        String zzc2 = ((zzewj) this.zza).zzc();
        String str = zzc2;
        zzbbf zza2 = zzckr.zza();
        zzbbf zzbbf = zza2;
        zzgdy zzc3 = zzffu.zzc();
        zzgdy zzgdy = zzc3;
        return new zzevm(zzc2, zza2, (zzbzs) this.zzb.zzb(), (ScheduledExecutorService) this.zzc.zzb(), zzc3);
    }
}
