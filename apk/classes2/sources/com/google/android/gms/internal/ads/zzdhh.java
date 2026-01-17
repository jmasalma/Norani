package com.google.android.gms.internal.ads;

import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.zzbd;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdhh implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;
    private final zzhha zzc;
    private final zzhha zzd;
    private final zzhha zze;
    private final zzhha zzf;

    private zzdhh(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4, zzhha zzhha5, zzhha zzhha6) {
        this.zza = zzhha;
        this.zzb = zzhha2;
        this.zzc = zzhha3;
        this.zzd = zzhha4;
        this.zze = zzhha5;
        this.zzf = zzhha6;
    }

    public static zzdhh zza(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4, zzhha zzhha5, zzhha zzhha6) {
        return new zzdhh(zzhha, zzhha2, zzhha3, zzhha4, zzhha5, zzhha6);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzcvf zza2 = ((zzcvq) this.zzb).zza();
        zzcvf zzcvf = zza2;
        zzdbw zza3 = ((zzdcr) this.zzc).zza();
        zzdbw zzdbw = zza3;
        zzdgw zza4 = ((zzdgy) this.zzd).zza();
        zzdgw zzdgw = zza4;
        zzcyv zzc2 = ((zzcor) this.zze).zzb();
        zzcyv zzcyv = zzc2;
        zzehb zzehb = (zzehb) this.zzf.zzb();
        zzcpw zzd2 = ((zzche) this.zza.zzb()).zzd();
        zzd2.zzi(zza2.zzl());
        zzd2.zzf(zza3);
        zzd2.zzd(zza4);
        zzd2.zze(new zzejh((zzbdz) null));
        zzd2.zzg(new zzcqs(zzc2, (zzdbb) null));
        zzd2.zzc(new zzcop((ViewGroup) null));
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzdU)).booleanValue()) {
            zzd2.zzj(zzehk.zzb(zzehb));
        }
        zzcrd zzb2 = zzd2.zzk().zzb();
        zzhgz.zzb(zzb2);
        zzcrd zzcrd = zzb2;
        return zzb2;
    }
}
