package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdxu implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;
    private final zzhha zzc;
    private final zzhha zzd;
    private final zzhha zze;
    private final zzhha zzf;

    private zzdxu(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4, zzhha zzhha5, zzhha zzhha6, zzhha zzhha7) {
        this.zza = zzhha;
        this.zzb = zzhha2;
        this.zzc = zzhha3;
        this.zzd = zzhha5;
        this.zze = zzhha6;
        this.zzf = zzhha7;
    }

    public static zzdxu zza(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4, zzhha zzhha5, zzhha zzhha6, zzhha zzhha7) {
        return new zzdxu(zzhha, zzhha2, zzhha3, zzhha4, zzhha5, zzhha6, zzhha7);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Context zza2 = ((zzchl) this.zza).zza();
        Context context = zza2;
        zzfcw zzc2 = ((zzcvp) this.zzb).zzc();
        zzfcw zzfcw = zzc2;
        zzdwu zza3 = ((zzdwv) this.zzc).zzb();
        zzdwu zzdwu = zza3;
        zzgdy zzc3 = zzffu.zzc();
        zzgdy zzgdy = zzc3;
        return new zzdxt(zza2, zzc2, zza3, zzc3, (ScheduledExecutorService) this.zzd.zzb(), (zzeaw) this.zze.zzb(), (zzfhu) this.zzf.zzb());
    }
}
