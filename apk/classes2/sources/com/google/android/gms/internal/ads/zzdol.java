package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdol implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;

    private zzdol(zzhha zzhha, zzhha zzhha2) {
        this.zza = zzhha;
        this.zzb = zzhha2;
    }

    public static zzdol zza(zzhha zzhha, zzhha zzhha2) {
        return new zzdol(zzhha, zzhha2);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfca zzc = ((zzcrr) this.zzb).zzc();
        zzfca zzfca = zzc;
        return new zzdok((zzcxf) this.zza.zzb(), zzc);
    }
}
