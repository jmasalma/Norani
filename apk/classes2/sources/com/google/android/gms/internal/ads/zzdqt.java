package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbd;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdqt implements zzhgr {
    private final zzhha zza;

    private zzdqt(zzhha zzhha, zzhha zzhha2) {
        this.zza = zzhha2;
    }

    public static zzdqt zza(zzhha zzhha, zzhha zzhha2) {
        return new zzdqt(zzhha, zzhha2);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Set set;
        Executor zzc = zzffu.zzc();
        zzdrl zza2 = ((zzdrm) this.zza).zzb();
        zzdrl zzdrl = zza2;
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzft)).booleanValue()) {
            set = Collections.singleton(new zzddv(zza2, zzc));
        } else {
            set = Collections.emptySet();
        }
        zzhgz.zzb(set);
        Set set2 = set;
        return set;
    }
}
