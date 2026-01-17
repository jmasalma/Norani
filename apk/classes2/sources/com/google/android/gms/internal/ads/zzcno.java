package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzcno implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;
    private final zzhha zzc;
    private final zzhha zzd;
    private final zzhha zze;

    private zzcno(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4, zzhha zzhha5) {
        this.zza = zzhha;
        this.zzb = zzhha2;
        this.zzc = zzhha3;
        this.zzd = zzhha4;
        this.zze = zzhha5;
    }

    public static zzcno zza(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4, zzhha zzhha5) {
        return new zzcno(zzhha, zzhha2, zzhha3, zzhha4, zzhha5);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzcnn((zzbpf) this.zza.zzb(), (zzcnj) this.zzb.zzb(), (Executor) this.zzc.zzb(), (zzcni) this.zzd.zzb(), (Clock) this.zze.zzb());
    }
}
