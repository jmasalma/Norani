package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzegn implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;
    private final zzhha zzc;
    private final zzhha zzd;

    private zzegn(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4, zzhha zzhha5) {
        this.zza = zzhha2;
        this.zzb = zzhha3;
        this.zzc = zzhha4;
        this.zzd = zzhha5;
    }

    public static zzegn zzc(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4, zzhha zzhha5) {
        return new zzegn(zzhha, zzhha2, zzhha3, zzhha4, zzhha5);
    }

    /* renamed from: zza */
    public final zzegl zzb() {
        return new zzegl(zzffu.zzc(), (ScheduledExecutorService) this.zza.zzb(), (zzcrd) this.zzb.zzb(), (zzehb) this.zzc.zzb(), (zzfju) this.zzd.zzb());
    }
}
