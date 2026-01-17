package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzees implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;
    private final zzhha zzc;

    private zzees(zzhha zzhha, zzhha zzhha2, zzhha zzhha3) {
        this.zza = zzhha;
        this.zzb = zzhha2;
        this.zzc = zzhha3;
    }

    public static zzees zza(zzhha zzhha, zzhha zzhha2, zzhha zzhha3) {
        return new zzees(zzhha, zzhha2, zzhha3);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzeer((Context) this.zza.zzb(), (zzcpx) this.zzb.zzb(), (Executor) this.zzc.zzb());
    }
}
