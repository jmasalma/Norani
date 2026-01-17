package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzeyb implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;
    private final zzhha zzc;
    private final zzhha zzd;
    private final zzhha zze;
    private final zzhha zzf;

    private zzeyb(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4, zzhha zzhha5, zzhha zzhha6, zzhha zzhha7) {
        this.zza = zzhha;
        this.zzb = zzhha2;
        this.zzc = zzhha3;
        this.zzd = zzhha4;
        this.zze = zzhha5;
        this.zzf = zzhha7;
    }

    public static zzeyb zza(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4, zzhha zzhha5, zzhha zzhha6, zzhha zzhha7) {
        return new zzeyb(zzhha, zzhha2, zzhha3, zzhha4, zzhha5, zzhha6, zzhha7);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzezr zza2 = ((zzezt) this.zzd).zzb();
        zzezr zzezr = zza2;
        zzfcu zzfcu = new zzfcu();
        zzfcu zzfcu2 = zzfcu;
        VersionInfoParcel zza3 = ((zzchz) this.zzf).zza();
        VersionInfoParcel versionInfoParcel = zza3;
        return new zzeya((Context) this.zza.zzb(), (Executor) this.zzb.zzb(), (zzche) this.zzc.zzb(), zza2, (zzexy) this.zze.zzb(), zzfcu, zza3);
    }
}
