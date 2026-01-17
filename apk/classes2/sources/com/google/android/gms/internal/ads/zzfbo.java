package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzfbo implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;
    private final zzhha zzc;
    private final zzhha zzd;
    private final zzhha zze;
    private final zzhha zzf;

    private zzfbo(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4, zzhha zzhha5, zzhha zzhha6, zzhha zzhha7) {
        this.zza = zzhha;
        this.zzb = zzhha2;
        this.zzc = zzhha3;
        this.zzd = zzhha4;
        this.zze = zzhha5;
        this.zzf = zzhha7;
    }

    public static zzfbo zza(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4, zzhha zzhha5, zzhha zzhha6, zzhha zzhha7) {
        return new zzfbo(zzhha, zzhha2, zzhha3, zzhha4, zzhha5, zzhha6, zzhha7);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzezr zza2 = ((zzezu) this.zzd).zzb();
        zzezr zzezr = zza2;
        zzfcu zzfcu = new zzfcu();
        zzfcu zzfcu2 = zzfcu;
        return new zzfbn((Context) this.zza.zzb(), (Executor) this.zzb.zzb(), (zzche) this.zzc.zzb(), zza2, (zzfbd) this.zze.zzb(), zzfcu, (zzfco) this.zzf.zzb());
    }
}
