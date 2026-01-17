package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzepp implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;

    private zzepp(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4) {
        this.zza = zzhha2;
        this.zzb = zzhha4;
    }

    public static zzepp zza(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4) {
        return new zzepp(zzhha, zzhha2, zzhha3, zzhha4);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzerz zzc = zzesb.zzc();
        zzerz zzerz = zzc;
        zzeou zzeou = new zzeou(zzc, ((Long) zzbet.zzf.zze()).longValue(), (Clock) this.zza.zzb(), zzffu.zzc(), (zzdsj) this.zzb.zzb());
        zzeou zzeou2 = zzeou;
        return zzeou;
    }
}
