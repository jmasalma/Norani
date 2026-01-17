package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzcol implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;
    private final zzhha zzc;
    private final zzhha zzd;

    private zzcol(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4) {
        this.zza = zzhha;
        this.zzb = zzhha2;
        this.zzc = zzhha3;
        this.zzd = zzhha4;
    }

    public static zzcol zza(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4) {
        return new zzcol(zzhha, zzhha2, zzhha3, zzhha4);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzeef zza2 = ((zzeeg) this.zzc).zzb();
        zzeef zzeef = zza2;
        zzeim zza3 = ((zzein) this.zzd).zzb();
        zzeim zzeim = zza3;
        return new zzeit((zzfha) this.zza.zzb(), (zzgdy) this.zzb.zzb(), zza3, zza2);
    }
}
