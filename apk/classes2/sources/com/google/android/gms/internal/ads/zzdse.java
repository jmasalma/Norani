package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzk;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdse implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;
    private final zzhha zzc;
    private final zzhha zzd;
    private final zzhha zze;
    private final zzhha zzf;
    private final zzhha zzg;

    private zzdse(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4, zzhha zzhha5, zzhha zzhha6, zzhha zzhha7) {
        this.zza = zzhha;
        this.zzb = zzhha2;
        this.zzc = zzhha3;
        this.zzd = zzhha4;
        this.zze = zzhha5;
        this.zzf = zzhha6;
        this.zzg = zzhha7;
    }

    public static zzdse zza(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4, zzhha zzhha5, zzhha zzhha6, zzhha zzhha7) {
        return new zzdse(zzhha, zzhha2, zzhha3, zzhha4, zzhha5, zzhha6, zzhha7);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Context zza2 = ((zzchl) this.zza).zza();
        Context context = zza2;
        zzbzw zza3 = ((zzcic) this.zzc).zzb();
        zzbzw zzbzw = zza3;
        zzfcw zzc2 = ((zzcvp) this.zzd).zzc();
        zzfcw zzfcw = zzc2;
        return new zzdsd(zza2, (zzdso) this.zzb.zzb(), zza3, zzc2, (String) this.zze.zzb(), (String) this.zzf.zzb(), (zzk) this.zzg.zzb());
    }
}
