package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzehl implements zzhgr {
    private final zzehk zza;
    private final zzhha zzb;
    private final zzhha zzc;
    private final zzhha zzd;
    private final zzhha zze;

    private zzehl(zzehk zzehk, zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4) {
        this.zza = zzehk;
        this.zzb = zzhha;
        this.zzc = zzhha2;
        this.zzd = zzhha3;
        this.zze = zzhha4;
    }

    public static zzehl zza(zzehk zzehk, zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4) {
        return new zzehl(zzehk, zzhha, zzhha2, zzhha3, zzhha4);
    }

    public final /* synthetic */ Object zzb() {
        zzehd zza2 = ((zzehe) this.zzc).zzb();
        zzehd zzehd = zza2;
        zzehb zza3 = this.zza.zza((Clock) this.zzb.zzb(), zza2, (zzedr) this.zzd.zzb(), (zzfjy) this.zze.zzb());
        zzehb zzehb = zza3;
        return zza3;
    }
}
