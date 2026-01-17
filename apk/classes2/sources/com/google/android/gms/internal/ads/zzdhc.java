package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdhc implements zzhgr {
    private final zzhha zza;

    private zzdhc(zzhha zzhha) {
        this.zza = zzhha;
    }

    public static zzdhc zza(zzhha zzhha) {
        return new zzdhc(zzhha);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Set set;
        zzdje zzc = ((zzdgz) this.zza).zzc();
        zzdje zzdje = zzc;
        if (zzc.zze() != null) {
            set = Collections.singleton("banner");
        } else {
            set = Collections.emptySet();
        }
        zzhgz.zzb(set);
        Set set2 = set;
        return set;
    }
}
