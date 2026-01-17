package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzcmt implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;

    private zzcmt(zzhha zzhha, zzhha zzhha2) {
        this.zza = zzhha;
        this.zzb = zzhha2;
    }

    public static zzcmt zza(zzhha zzhha, zzhha zzhha2) {
        return new zzcmt(zzhha, zzhha2);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfca zzc = ((zzcrr) this.zza).zzc();
        zzfca zzfca = zzc;
        zzbzw zza2 = ((zzcic) this.zzb).zzb();
        zzbzw zzbzw = zza2;
        return new zzcms(zzc, zza2);
    }
}
