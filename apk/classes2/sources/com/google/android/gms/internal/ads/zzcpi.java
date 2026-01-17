package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzcpi implements zzhgr {
    private final zzcoz zza;
    private final zzhha zzb;
    private final zzhha zzc;
    private final zzhha zzd;
    private final zzhha zze;

    private zzcpi(zzcoz zzcoz, zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4) {
        this.zza = zzcoz;
        this.zzb = zzhha;
        this.zzc = zzhha2;
        this.zzd = zzhha3;
        this.zze = zzhha4;
    }

    public static zzcpi zza(zzcoz zzcoz, zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4) {
        return new zzcpi(zzcoz, zzhha, zzhha2, zzhha3, zzhha4);
    }

    public static zzddv zzc(zzcoz zzcoz, Context context, VersionInfoParcel versionInfoParcel, zzfca zzfca, zzfcw zzfcw) {
        zzddv zzddv = new zzddv(new zzcox(context, versionInfoParcel, zzfca, zzfcw), zzcaf.zzg);
        zzddv zzddv2 = zzddv;
        return zzddv;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        VersionInfoParcel zza2 = ((zzchz) this.zzc).zza();
        VersionInfoParcel versionInfoParcel = zza2;
        zzfca zzc2 = ((zzcrr) this.zzd).zzc();
        zzfca zzfca = zzc2;
        zzfcw zzc3 = ((zzcvp) this.zze).zzc();
        zzfcw zzfcw = zzc3;
        return zzc(this.zza, (Context) this.zzb.zzb(), zza2, zzc2, zzc3);
    }
}
