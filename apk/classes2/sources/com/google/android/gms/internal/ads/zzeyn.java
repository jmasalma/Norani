package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzr;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzeyn implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;
    private final zzhha zzc;
    private final zzhha zzd;
    private final zzhha zze;
    private final zzhha zzf;
    private final zzhha zzg;

    private zzeyn(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4, zzhha zzhha5, zzhha zzhha6, zzhha zzhha7, zzhha zzhha8) {
        this.zza = zzhha;
        this.zzb = zzhha2;
        this.zzc = zzhha3;
        this.zzd = zzhha4;
        this.zze = zzhha5;
        this.zzf = zzhha6;
        this.zzg = zzhha8;
    }

    public static zzeyn zza(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4, zzhha zzhha5, zzhha zzhha6, zzhha zzhha7, zzhha zzhha8) {
        return new zzeyn(zzhha, zzhha2, zzhha3, zzhha4, zzhha5, zzhha6, zzhha7, zzhha8);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfcu zzfcu = new zzfcu();
        zzfcu zzfcu2 = zzfcu;
        return new zzeym((Context) this.zza.zzb(), (Executor) this.zzb.zzb(), (zzr) this.zzc.zzb(), (zzche) this.zzd.zzb(), (zzeky) this.zze.zzb(), (zzelc) this.zzf.zzb(), zzfcu, (zzdbb) this.zzg.zzb());
    }
}
