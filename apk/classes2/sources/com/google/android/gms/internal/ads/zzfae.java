package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzfae implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;
    private final zzhha zzc;
    private final zzhha zzd;
    private final zzhha zze;

    private zzfae(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4, zzhha zzhha5, zzhha zzhha6) {
        this.zza = zzhha;
        this.zzb = zzhha2;
        this.zzc = zzhha3;
        this.zzd = zzhha4;
        this.zze = zzhha5;
    }

    public static zzfae zza(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4, zzhha zzhha5, zzhha zzhha6) {
        return new zzfae(zzhha, zzhha2, zzhha3, zzhha4, zzhha5, zzhha6);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfcu zzfcu = new zzfcu();
        zzfcu zzfcu2 = zzfcu;
        return new zzfad((Context) this.zza.zzb(), (Executor) this.zzb.zzb(), (zzche) this.zzc.zzb(), (zzeky) this.zzd.zzb(), (zzfbd) this.zze.zzb(), zzfcu);
    }
}
