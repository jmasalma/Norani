package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdro implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;
    private final zzhha zzc;
    private final zzhha zzd;
    private final zzhha zze;
    private final zzhha zzf;
    private final zzhha zzg;

    private zzdro(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4, zzhha zzhha5, zzhha zzhha6, zzhha zzhha7) {
        this.zza = zzhha;
        this.zzb = zzhha2;
        this.zzc = zzhha3;
        this.zzd = zzhha4;
        this.zze = zzhha5;
        this.zzf = zzhha6;
        this.zzg = zzhha7;
    }

    public static zzdro zza(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4, zzhha zzhha5, zzhha zzhha6, zzhha zzhha7) {
        return new zzdro(zzhha, zzhha2, zzhha3, zzhha4, zzhha5, zzhha6, zzhha7);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Context zza2 = ((zzchl) this.zza).zza();
        Context context = zza2;
        zzfcn zzc2 = ((zzcru) this.zzd).zzc();
        zzfcn zzfcn = zzc2;
        zzfca zzc3 = ((zzcrr) this.zze).zzc();
        zzfca zzfca = zzc3;
        return new zzdrn(zza2, (zzfdo) this.zzb.zzb(), (zzdsj) this.zzc.zzb(), zzc2, zzc3, (zzeca) this.zzf.zzb(), (String) this.zzg.zzb());
    }
}
