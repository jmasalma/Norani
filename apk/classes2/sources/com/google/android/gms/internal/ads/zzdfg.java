package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdfg implements zzhgr {
    private final zzhha zza;

    private zzdfg(zzdff zzdff, zzhha zzhha) {
        this.zza = zzhha;
    }

    public static zzdfg zza(zzdff zzdff, zzhha zzhha) {
        return new zzdfg(zzdff, zzhha);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Set singleton = Collections.singleton(new zzddv((zzcur) this.zza.zzb(), zzcaf.zzg));
        zzhgz.zzb(singleton);
        Set set = singleton;
        return singleton;
    }
}
