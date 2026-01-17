package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdei implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;

    private zzdei(zzhha zzhha, zzhha zzhha2) {
        this.zza = zzhha;
        this.zzb = zzhha2;
    }

    public static zzdei zza(zzhha zzhha, zzhha zzhha2) {
        return new zzdei(zzhha, zzhha2);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfca zzc = ((zzcrr) this.zza).zzc();
        zzfca zzfca = zzc;
        return new zzdeh(zzc, (zzfjy) this.zzb.zzb());
    }
}
