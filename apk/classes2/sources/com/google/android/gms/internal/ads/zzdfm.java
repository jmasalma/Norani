package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdfm implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;
    private final zzhha zzc;
    private final zzhha zzd;

    private zzdfm(zzdff zzdff, zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4) {
        this.zza = zzhha;
        this.zzb = zzhha2;
        this.zzc = zzhha3;
        this.zzd = zzhha4;
    }

    public static zzdfm zza(zzdff zzdff, zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4) {
        return new zzdfm(zzdff, zzhha, zzhha2, zzhha3, zzhha4);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        VersionInfoParcel zza2 = ((zzchz) this.zzb).zza();
        VersionInfoParcel versionInfoParcel = zza2;
        zzfca zzc2 = ((zzcrr) this.zzc).zzc();
        zzfca zzfca = zzc2;
        zzfcw zzc3 = ((zzcvp) this.zzd).zzc();
        zzfcw zzfcw = zzc3;
        zzddv zzddv = new zzddv(new zzdfd((Context) this.zza.zzb(), zza2, zzc2, zzc3), zzcaf.zzg);
        zzddv zzddv2 = zzddv;
        return zzddv;
    }
}
