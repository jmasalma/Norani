package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzehp implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;
    private final zzhha zzc;

    private zzehp(zzhha zzhha, zzhha zzhha2, zzhha zzhha3) {
        this.zza = zzhha;
        this.zzb = zzhha2;
        this.zzc = zzhha3;
    }

    public static zzehp zza(zzhha zzhha, zzhha zzhha2, zzhha zzhha3) {
        return new zzehp(zzhha, zzhha2, zzhha3);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzeho((Context) this.zza.zzb(), (Executor) this.zzb.zzb(), (zzdos) this.zzc.zzb());
    }
}
