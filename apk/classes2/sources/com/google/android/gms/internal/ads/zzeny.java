package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzeny implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;
    private final zzhha zzc;
    private final zzhha zzd;
    private final zzhha zze;
    private final zzhha zzf;
    private final zzhha zzg;
    private final zzhha zzh;
    private final zzhha zzi;

    private zzeny(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4, zzhha zzhha5, zzhha zzhha6, zzhha zzhha7, zzhha zzhha8, zzhha zzhha9) {
        this.zza = zzhha;
        this.zzb = zzhha2;
        this.zzc = zzhha3;
        this.zzd = zzhha4;
        this.zze = zzhha5;
        this.zzf = zzhha6;
        this.zzg = zzhha7;
        this.zzh = zzhha8;
        this.zzi = zzhha9;
    }

    public static zzeny zza(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4, zzhha zzhha5, zzhha zzhha6, zzhha zzhha7, zzhha zzhha8, zzhha zzhha9) {
        return new zzeny(zzhha, zzhha2, zzhha3, zzhha4, zzhha5, zzhha6, zzhha7, zzhha8, zzhha9);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Context zza2 = ((zzchl) this.zza).zza();
        Context context = zza2;
        String zzc2 = ((zzcvm) this.zzb).zzb();
        String str = zzc2;
        zzfcw zzc3 = ((zzcvp) this.zzf).zzc();
        zzfcw zzfcw = zzc3;
        return new zzenw(zza2, zzc2, (String) this.zzc.zzb(), (zzcsq) this.zzd.zzb(), (zzfed) this.zze.zzb(), zzc3, (zzdsd) this.zzg.zzb(), (zzcte) this.zzh.zzb(), ((Long) this.zzi.zzb()).longValue());
    }
}
