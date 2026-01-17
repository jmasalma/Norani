package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzcqf implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;
    private final zzhha zzc;
    private final zzhha zzd;

    private zzcqf(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4) {
        this.zza = zzhha;
        this.zzb = zzhha2;
        this.zzc = zzhha3;
        this.zzd = zzhha4;
    }

    public static zzcqf zza(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4) {
        return new zzcqf(zzhha, zzhha2, zzhha3, zzhha4);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzeex zza2 = ((zzeey) this.zzc).zzb();
        zzeex zzeex = zza2;
        zzeim zza3 = ((zzein) this.zzd).zzb();
        zzeim zzeim = zza3;
        return new zzeit((zzfha) this.zza.zzb(), (zzgdy) this.zzb.zzb(), zza3, zza2);
    }
}
