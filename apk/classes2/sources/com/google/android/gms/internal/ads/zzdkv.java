package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdkv implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;
    private final zzhha zzc;

    private zzdkv(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4) {
        this.zza = zzhha;
        this.zzb = zzhha2;
        this.zzc = zzhha3;
    }

    public static zzdkv zza(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4) {
        return new zzdkv(zzhha, zzhha2, zzhha3, zzhha4);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzdit zza2 = ((zzdjm) this.zza).zza();
        zzdit zzdit = zza2;
        zzdiy zzc2 = ((zzdhs) this.zzb).zzb();
        zzdiy zzdiy = zzc2;
        return new zzdku(zza2, zzc2, (Executor) this.zzc.zzb(), zzffu.zzc());
    }
}
