package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzcnv implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;

    private zzcnv(zzhha zzhha, zzhha zzhha2, zzhha zzhha3) {
        this.zza = zzhha;
        this.zzb = zzhha3;
    }

    public static zzcnv zza(zzhha zzhha, zzhha zzhha2, zzhha zzhha3) {
        return new zzcnv(zzhha, zzhha2, zzhha3);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Set set;
        zzcnn zzcnn = (zzcnn) this.zza.zzb();
        Executor zzc = zzffu.zzc();
        if (((JSONObject) this.zzb.zzb()) == null) {
            set = Collections.emptySet();
        } else {
            set = Collections.singleton(new zzddv(zzcnn, zzc));
        }
        zzhgz.zzb(set);
        Set set2 = set;
        return set;
    }
}
