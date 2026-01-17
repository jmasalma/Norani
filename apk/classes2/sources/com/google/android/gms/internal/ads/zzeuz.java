package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzg;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzeuz implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;
    private final zzhha zzc;
    private final zzhha zzd;
    private final zzhha zze;
    private final zzhha zzf;

    private zzeuz(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4, zzhha zzhha5, zzhha zzhha6, zzhha zzhha7) {
        this.zza = zzhha;
        this.zzb = zzhha2;
        this.zzc = zzhha4;
        this.zzd = zzhha5;
        this.zze = zzhha6;
        this.zzf = zzhha7;
    }

    public static zzeuz zza(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4, zzhha zzhha5, zzhha zzhha6, zzhha zzhha7) {
        return new zzeuz(zzhha, zzhha2, zzhha3, zzhha4, zzhha5, zzhha6, zzhha7);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzg zza2 = ((zzchi) this.zza).zzb();
        zzg zzg = zza2;
        Context zza3 = ((zzchl) this.zzb).zza();
        Context context = zza3;
        zzgdy zzc2 = zzffu.zzc();
        zzgdy zzgdy = zzc2;
        zzedk zza4 = ((zzedl) this.zzd).zzb();
        zzedk zzedk = zza4;
        zzfcw zzc3 = ((zzcvp) this.zze).zzc();
        zzfcw zzfcw = zzc3;
        VersionInfoParcel zza5 = ((zzchz) this.zzf).zza();
        VersionInfoParcel versionInfoParcel = zza5;
        return new zzeuw(zza2, zza3, zzc2, (ScheduledExecutorService) this.zzc.zzb(), zza4, zzc3, zza5);
    }
}
