package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzepo implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;
    private final zzhha zzc;

    private zzepo(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4) {
        this.zza = zzhha;
        this.zzb = zzhha2;
        this.zzc = zzhha4;
    }

    public static zzepo zza(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4) {
        return new zzepo(zzhha, zzhha2, zzhha3, zzhha4);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzerr zza2 = ((zzert) this.zza).zzb();
        zzerr zzerr = zza2;
        zzeou zzeou = new zzeou(zza2, ((Long) zzbet.zze.zze()).longValue(), (Clock) this.zzb.zzb(), zzffu.zzc(), (zzdsj) this.zzc.zzb());
        zzeou zzeou2 = zzeou;
        return zzeou;
    }
}
