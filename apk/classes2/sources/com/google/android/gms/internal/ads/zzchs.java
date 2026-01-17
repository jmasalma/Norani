package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbd;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzchs implements zzhgr {
    private final zzhha zza;

    private zzchs(zzhha zzhha, zzhha zzhha2) {
        this.zza = zzhha;
    }

    public static zzchs zza(zzhha zzhha, zzhha zzhha2) {
        return new zzchs(zzhha, zzhha2);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Set set;
        zzdup zzdup = (zzdup) this.zza.zzb();
        Executor zzc = zzffu.zzc();
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzbP)).booleanValue()) {
            set = Collections.singleton(new zzddv(zzdup, zzc));
        } else {
            set = Collections.emptySet();
        }
        zzhgz.zzb(set);
        Set set2 = set;
        return set;
    }
}
