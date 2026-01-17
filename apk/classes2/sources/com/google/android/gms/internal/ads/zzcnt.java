package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzcnt implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;

    private zzcnt(zzhha zzhha, zzhha zzhha2, zzhha zzhha3) {
        this.zza = zzhha;
        this.zzb = zzhha3;
    }

    public static zzcnt zza(zzhha zzhha, zzhha zzhha2, zzhha zzhha3) {
        return new zzcnt(zzhha, zzhha2, zzhha3);
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
