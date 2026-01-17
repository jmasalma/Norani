package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdxp implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;
    private final zzhha zzc;

    private zzdxp(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4, zzhha zzhha5) {
        this.zza = zzhha;
        this.zzb = zzhha4;
        this.zzc = zzhha5;
    }

    public static zzdxp zzc(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4, zzhha zzhha5) {
        return new zzdxp(zzhha, zzhha2, zzhha3, zzhha4, zzhha5);
    }

    /* renamed from: zza */
    public final zzdxo zzb() {
        zzgdy zzc2 = zzffu.zzc();
        zzgdy zzgdy = zzc2;
        zzgdy zzc3 = zzfga.zzc();
        zzgdy zzgdy2 = zzc3;
        zzdyk zza2 = ((zzdyl) this.zzb).zzb();
        zzdyk zzdyk = zza2;
        return new zzdxo((ScheduledExecutorService) this.zza.zzb(), zzc2, zzc3, zza2, zzhgq.zza(this.zzc));
    }
}
