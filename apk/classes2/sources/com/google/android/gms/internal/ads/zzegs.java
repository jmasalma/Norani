package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzegs implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;
    private final zzhha zzc;
    private final zzhha zzd;
    private final zzhha zze;

    private zzegs(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4, zzhha zzhha5) {
        this.zza = zzhha;
        this.zzb = zzhha2;
        this.zzc = zzhha3;
        this.zzd = zzhha4;
        this.zze = zzhha5;
    }

    public static zzegs zza(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4, zzhha zzhha5) {
        return new zzegs(zzhha, zzhha2, zzhha3, zzhha4, zzhha5);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzcvf zza2 = ((zzcvq) this.zzb).zza();
        zzcvf zzcvf = zza2;
        zzdbw zza3 = ((zzdcr) this.zzc).zza();
        zzdbw zzdbw = zza3;
        return new zzegr((zzche) this.zza.zzb(), zza2, zza3, (zzehb) this.zzd.zzb(), (zzedr) this.zze.zzb());
    }
}
