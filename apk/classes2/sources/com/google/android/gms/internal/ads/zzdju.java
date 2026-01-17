package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzg;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdju implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;
    private final zzhha zzc;
    private final zzhha zzd;
    private final zzhha zze;
    private final zzhha zzf;
    private final zzhha zzg;
    private final zzhha zzh;

    private zzdju(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4, zzhha zzhha5, zzhha zzhha6, zzhha zzhha7, zzhha zzhha8, zzhha zzhha9) {
        this.zza = zzhha;
        this.zzb = zzhha2;
        this.zzc = zzhha3;
        this.zzd = zzhha4;
        this.zze = zzhha5;
        this.zzf = zzhha6;
        this.zzg = zzhha7;
        this.zzh = zzhha9;
    }

    public static zzdju zzc(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4, zzhha zzhha5, zzhha zzhha6, zzhha zzhha7, zzhha zzhha8, zzhha zzhha9) {
        return new zzdju(zzhha, zzhha2, zzhha3, zzhha4, zzhha5, zzhha6, zzhha7, zzhha8, zzhha9);
    }

    /* renamed from: zza */
    public final zzdjt zzb() {
        zzg zza2 = ((zzchi) this.zza).zzb();
        zzg zzg2 = zza2;
        zzfcw zzc2 = ((zzcvp) this.zzb).zzc();
        zzfcw zzfcw = zzc2;
        zzdit zza3 = ((zzdjm) this.zzd).zza();
        zzdit zzdit = zza3;
        return new zzdjt(zza2, zzc2, (zzdiy) this.zzc.zzb(), zza3, (zzdkh) this.zze.zzb(), (zzdkp) this.zzf.zzb(), (Executor) this.zzg.zzb(), zzffu.zzc(), (zzdiq) this.zzh.zzb());
    }
}
