package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzbcj;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdqi implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;
    private final zzhha zzc;
    private final zzhha zzd;
    private final zzhha zze;

    private zzdqi(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4, zzhha zzhha5) {
        this.zza = zzhha;
        this.zzb = zzhha2;
        this.zzc = zzhha3;
        this.zzd = zzhha4;
        this.zze = zzhha5;
    }

    public static zzdqi zza(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4, zzhha zzhha5) {
        return new zzdqi(zzhha, zzhha2, zzhha3, zzhha4, zzhha5);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Context zza2 = ((zzchl) this.zza).zza();
        Context context = zza2;
        String zzc2 = ((zzdxh) this.zzb).zzb();
        String str = zzc2;
        VersionInfoParcel zza3 = ((zzchz) this.zzc).zza();
        VersionInfoParcel versionInfoParcel = zza3;
        zzbcj.zza.C0000zza zza4 = (zzbcj.zza.C0000zza) this.zzd.zzb();
        String str2 = (String) this.zze.zzb();
        zzbcc zzbcc = new zzbcc(new zzbci(zza2));
        zzbcj.zzar.zza zzd2 = zzbcj.zzar.zzd();
        zzd2.zzg(zza3.buddyApkVersion);
        zzd2.zzi(zza3.clientJarVersion);
        zzd2.zzh(true != zza3.isClientJar ? 2 : 0);
        zzbcc.zzb(new zzdqh(zza4, zzc2, (zzbcj.zzar) zzd2.zzbr(), str2));
        zzbcc zzbcc2 = zzbcc;
        return zzbcc;
    }
}
