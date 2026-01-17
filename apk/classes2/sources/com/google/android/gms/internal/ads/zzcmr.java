package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzg;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzcmr implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;
    private final zzhha zzc;
    private final zzhha zzd;
    private final zzhha zze;
    private final zzhha zzf;

    private zzcmr(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4, zzhha zzhha5, zzhha zzhha6, zzhha zzhha7) {
        this.zza = zzhha;
        this.zzb = zzhha2;
        this.zzc = zzhha3;
        this.zzd = zzhha4;
        this.zze = zzhha6;
        this.zzf = zzhha7;
    }

    public static zzcmr zza(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4, zzhha zzhha5, zzhha zzhha6, zzhha zzhha7) {
        return new zzcmr(zzhha, zzhha2, zzhha3, zzhha4, zzhha5, zzhha6, zzhha7);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Context zza2 = ((zzchl) this.zza).zza();
        Context context = zza2;
        zzg zza3 = ((zzchi) this.zzb).zzb();
        zzg zzg = zza3;
        zzgdy zzc2 = zzffu.zzc();
        zzgdy zzgdy = zzc2;
        return new zzcmq(zza2, zza3, (zzedi) this.zzc.zzb(), (zzdpo) this.zzd.zzb(), zzc2, (zzgdy) this.zze.zzb(), (ScheduledExecutorService) this.zzf.zzb());
    }
}
