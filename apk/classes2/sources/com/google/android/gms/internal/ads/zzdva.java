package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdva implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;
    private final zzhha zzc;

    private zzdva(zzhha zzhha, zzhha zzhha2, zzhha zzhha3) {
        this.zza = zzhha;
        this.zzb = zzhha2;
        this.zzc = zzhha3;
    }

    public static zzdva zza(zzhha zzhha, zzhha zzhha2, zzhha zzhha3) {
        return new zzdva(zzhha, zzhha2, zzhha3);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfcw zzc2 = ((zzcvp) this.zzb).zzc();
        zzfcw zzfcw = zzc2;
        return new zzduw((zzdvi) this.zza.zzb(), zzc2, (String) this.zzc.zzb());
    }
}
