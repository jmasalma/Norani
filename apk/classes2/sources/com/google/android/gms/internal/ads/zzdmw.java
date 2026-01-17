package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdmw implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;
    private final zzhha zzc;
    private final zzhha zzd;
    private final zzhha zze;
    private final zzhha zzf;
    private final zzhha zzg;
    private final zzhha zzh;
    private final zzhha zzi;

    private zzdmw(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4, zzhha zzhha5, zzhha zzhha6, zzhha zzhha7, zzhha zzhha8, zzhha zzhha9) {
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

    public static zzdmw zza(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4, zzhha zzhha5, zzhha zzhha6, zzhha zzhha7, zzhha zzhha8, zzhha zzhha9) {
        return new zzdmw(zzhha, zzhha2, zzhha3, zzhha4, zzhha5, zzhha6, zzhha7, zzhha8, zzhha9);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfcw zzc2 = ((zzcvp) this.zza).zzc();
        zzfcw zzfcw = zzc2;
        return new zzdmu(zzc2, (Executor) this.zzb.zzb(), (zzdpj) this.zzc.zzb(), (Context) this.zzd.zzb(), (zzdsj) this.zze.zzb(), (zzfjy) this.zzf.zzb(), (zzeca) this.zzg.zzb(), (zzdoe) this.zzh.zzb(), (zzdsd) this.zzi.zzb());
    }
}
